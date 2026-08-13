            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            
            public final class OlI0OO1 extends Oll0io implements IlliIl1l11O {
                public final OlI0iOo I00iOIl;
                public final O1oIOiI11o0 I00iiI;
                public final Context I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI0OO1(OlI0iOo olI0iOo, O1oIOiI11o0 o1oIOiI11o0, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = olI0iOo;
/* 3 */             this.I00iiI = o1oIOiI11o0;
/* 5 */             this.I00iiO = context;
                }

                public static final CompiledModel I00000oIO(O1oIOiI11o0 o1oIOiI11o0, Context context, String str) {
/* 1 */             String strI00000oOI = o1oIOiI11o0.I00000oOI(context, str);
                    try {
/* 23 */                return CompiledModel.Companion.create$default(CompiledModel.INSTANCE, strI00000oOI, new CompiledModel.Options(Accelerator.GPU, Accelerator.CPU), null, 4, null);
                    } catch (Throwable th) {
/* 51 */                Log.w("SoundGenEngine", "GPU load failed for " + str + ", CPU fallback", th);
/* 70 */                return CompiledModel.Companion.create$default(CompiledModel.INSTANCE, strI00000oOI, new CompiledModel.Options(Accelerator.CPU), null, 4, null);
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new OlI0OO1(this.I00iOIl, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OlI0OO1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    OlI1Oi olI1OiI00000oIO;
/* 1 */             Context context = this.I00iiO;
/* 3 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 5 */             OlI0iOo olI0iOo = this.I00iOIl;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 12 */                olI0iOo.I00000oOI();
/* 21 */                olI0iOo.I00000oIO = I00000oIO(o1oIOiI11o0, context, "sg_text.litert");
/* 29 */                olI0iOo.I00000oOI = I00000oIO(o1oIOiI11o0, context, "sg_core.litert");
/* 37 */                olI0iOo.I0000Il00O = I00000oIO(o1oIOiI11o0, context, "sg_decode.litert");
/* 41 */                String strI00000oOI = o1oIOiI11o0.I00000oOI(context, "sg_vocab.spm");
                        try {
/* 54 */                    olI1OiI00000oIO = lOO0oI.I00000oIO(IlIl10.I000O01llI0(new File(strI00000oOI)));
                        } catch (Throwable th) {
/* 68 */                    Log.e("SoundGenTokenizer", "Failed to load SentencePiece model from ".concat(strI00000oOI), th);
/* 71 */                    olI1OiI00000oIO = null;
                        }
/* 72 */                olI0iOo.I0000O = olI1OiI00000oIO;
                    } catch (Throwable th2) {
/* 91 */                Log.e("SoundGenEngine", "loadModels failed", th2);
/* 94 */                olI0iOo.I00000oOI();
/* 97 */                z = false;
                    }
/* 74 */            if (olI1OiI00000oIO == null) {
/* 85 */                throw new IllegalStateException("tokenizer load failed");
                    }
/* 76 */            z = true;
/* 98 */            return Boolean.valueOf(z);
                }
            }
