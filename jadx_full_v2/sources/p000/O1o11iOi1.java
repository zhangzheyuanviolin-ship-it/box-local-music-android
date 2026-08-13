            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.Environment;
            import java.io.File;
            import java.util.Iterator;
            
            public final class O1o11iOi1 extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final O1o1IiIllOI I00iiI;
                public final String I00iiO;
                public final Context I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1o11iOi1(O1o1IiIllOI o1o1IiIllOI, String str, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = o1o1IiIllOI;
/* 3 */             this.I00iiO = str;
/* 5 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             O1o11iOi1 o1o11iOi1 = new O1o11iOi1(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 12 */            o1o11iOi1.I00iOIl = obj;
/* 37 */            return o1o11iOi1;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O1o11iOi1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    Object next;
                    File file;
                    CompiledModel compiledModelCreate$default;
/* 1 */             String str = this.I00iiO;
/* 5 */             O1o1IiIllOI o1o1IiIllOI = this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 16 */                o1o1IiIllOI.I00000oIO();
/* 30 */                Iterator it = IlIl10.I000l1(new File(str), IlIl0l1lO.I00iOIl).iterator();
                        while (true) {
/* 35 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 41 */                    if (!i011lIilI0lo.hasNext()) {
/* 73 */                        next = null;
                                break;
                            }
/* 43 */                    next = i011lIilI0lo.next();
/* 48 */                    File file2 = (File) next;
/* 54 */                    if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
                                break;
                            }
                        }
/* 74 */                file = (File) next;
                    } catch (Throwable th) {
/* 279 */               Log.e("MobileNetEngine", "loadModel failed", th);
/* 282 */               o1o1IiIllOI.I00000oIO();
/* 285 */               z = false;
                    }
/* 76 */            if (file == null) {
/* 95 */                Log.e("MobileNetEngine", "No .tflite found under " + str);
/* 98 */                return Boolean.FALSE;
                    }
/* 107 */           z = true;
/* 112 */           o1o1IiIllOI.I0000O = OlOoOIi0o.I000oI1ioi(file.getName(), "v3", true);
/* 120 */           boolean zI000oI1ioi = OlOoOIi0o.I000oI1ioi(file.getName(), "g5", true);
/* 124 */           Context context = this.I00iio;
/* 126 */           if (zI000oI1ioi) {
/* 132 */               String str2 = context.getApplicationInfo().nativeLibraryDir;
/* 158 */               Environment environmentCreate = Environment.INSTANCE.create(O1Oii0O0loo.I0000O(new OIoi0IIoi(Environment.Option.DispatchLibraryDir, str2), new OIoi0IIoi(Environment.Option.CompilerPluginLibraryDir, str2)));
/* 162 */               o1o1IiIllOI.I00000oOI = environmentCreate;
/* 181 */               compiledModelCreate$default = CompiledModel.INSTANCE.create(file.getAbsolutePath(), new CompiledModel.Options(Accelerator.NPU), environmentCreate);
                    } else {
                        try {
/* 208 */                   compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU, Accelerator.CPU), null, 4, null);
                        } catch (Throwable th2) {
/* 241 */                   Log.w("MobileNetEngine", "GPU compile failed for " + file.getName() + "; falling back to CPU", th2);
/* 264 */                   compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), null, 4, null);
                        }
                    }
/* 268 */           o1o1IiIllOI.I00000oIO = compiledModelCreate$default;
/* 274 */           o1o1IiIllOI.I0000Il00O = O1o1IiIllOI.I00000oOI(context);
/* 286 */           return Boolean.valueOf(z);
                }
            }
