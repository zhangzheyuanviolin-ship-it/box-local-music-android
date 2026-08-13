            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            
            public final class OlI0lo1OOoiO extends Oll0io implements IlliIl1l11O {
                public final OlI0o1 I00iOIl;
                public final O1oIOiI11o0 I00iiI;
                public final Context I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI0lo1OOoiO(OlI0o1 olI0o1, O1oIOiI11o0 o1oIOiI11o0, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = olI0o1;
/* 3 */             this.I00iiI = o1oIOiI11o0;
/* 5 */             this.I00iiO = context;
                }

                public static final CompiledModel I00000oIO(O1oIOiI11o0 o1oIOiI11o0, Context context, String str) {
/* 21 */            return CompiledModel.Companion.create$default(CompiledModel.INSTANCE, o1oIOiI11o0.I00000oOI(context, str), new CompiledModel.Options(Accelerator.CPU), null, 4, null);
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new OlI0lo1OOoiO(this.I00iOIl, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OlI0lo1OOoiO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    o00io0IiOOo0 o00io0iiooo0I00000oIO;
/* 1 */             Context context = this.I00iiO;
/* 3 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 5 */             OlI0o1 olI0o1 = this.I00iOIl;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 12 */                olI0o1.I00000oOI();
/* 21 */                olI0o1.I0001Ioi1lo = I00000oIO(o1oIOiI11o0, context, "sghd_text.litert");
/* 29 */                olI0o1.I000II = I00000oIO(o1oIOiI11o0, context, "sghd_core.litert");
/* 37 */                olI0o1.I000O01llI0 = I00000oIO(o1oIOiI11o0, context, "sghd_decode.litert");
/* 41 */                String strI00000oOI = o1oIOiI11o0.I00000oOI(context, "sghd_vocab.spm");
                        try {
/* 54 */                    o00io0iiooo0I00000oIO = lOO011Io1.I00000oIO(IlIl10.I000O01llI0(new File(strI00000oOI)));
                        } catch (Throwable th) {
/* 68 */                    Log.e("SoundGenHdTokenizer", "Failed to load tokenizer from ".concat(strI00000oOI), th);
/* 71 */                    o00io0iiooo0I00000oIO = null;
                        }
/* 72 */                olI0o1.I000OOo1O = o00io0iiooo0I00000oIO;
                    } catch (Throwable th2) {
/* 91 */                Log.e("SoundGenHdEngine", "loadModels failed", th2);
/* 94 */                olI0o1.I00000oOI();
/* 97 */                z = false;
                    }
/* 74 */            if (o00io0iiooo0I00000oIO == null) {
/* 85 */                throw new IllegalStateException("tokenizer load failed");
                    }
/* 76 */            z = true;
/* 98 */            return Boolean.valueOf(z);
                }
            }
