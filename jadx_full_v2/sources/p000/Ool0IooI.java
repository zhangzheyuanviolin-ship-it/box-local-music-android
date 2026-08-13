            package p000;

            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            import java.util.Iterator;
            
            public final class Ool0IooI extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final Ool0OI I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ool0IooI(Ool0OI ool0OI, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = ool0OI;
/* 3 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             Ool0IooI ool0IooI = new Ool0IooI(this.I00iiI, this.I00iiO, iOoil1iiIilo);
/* 10 */            ool0IooI.I00iOIl = obj;
/* 37 */            return ool0IooI;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ool0IooI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    File file;
                    CompiledModel compiledModelCreate$default;
/* 1 */             String str = this.I00iiO;
/* 3 */             Ool0OI ool0OI = this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 16 */                CompiledModel compiledModel = ool0OI.I00000oIO;
/* 18 */                if (compiledModel != null) {
/* 20 */                    compiledModel.close();
                        }
                    } catch (Throwable unused) {
                    }
/* 23 */            Object obj2 = null;
                    try {
/* 24 */                ool0OI.I00000oIO = null;
/* 37 */                Iterator it = IlIl10.I000l1(new File(str), IlIl0l1lO.I00iOIl).iterator();
                        while (true) {
/* 42 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 48 */                    if (!i011lIilI0lo.hasNext()) {
                                break;
                            }
/* 50 */                    Object next = i011lIilI0lo.next();
/* 55 */                    File file2 = (File) next;
/* 61 */                    if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
/* 75 */                        obj2 = next;
                                break;
                            }
                        }
/* 81 */                file = (File) obj2;
                    } catch (Throwable th) {
/* 213 */               Log.e("UpscaleEngine", "loadModel failed", th);
/* 216 */               z = false;
                    }
/* 83 */            if (file == null) {
/* 102 */               Log.e("UpscaleEngine", "No .tflite found under " + str);
/* 105 */               return Boolean.FALSE;
                    }
/* 114 */           z = true;
/* 115 */           boolean zI000oI1ioi = OlOoOIi0o.I000oI1ioi(file.getName(), "edsr", true);
/* 121 */           ool0OI.I00000oOI = !zI000oI1ioi;
/* 123 */           if (zI000oI1ioi) {
/* 145 */               compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU), null, 4, null);
                    } else {
                        try {
/* 172 */                   compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU, Accelerator.CPU), null, 4, null);
                        } catch (Throwable th2) {
/* 181 */                   Log.w("UpscaleEngine", "GPU compile failed, falling back to CPU", th2);
/* 204 */                   compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), null, 4, null);
                        }
                    }
/* 208 */           ool0OI.I00000oIO = compiledModelCreate$default;
/* 217 */           return Boolean.valueOf(z);
                }
            }
