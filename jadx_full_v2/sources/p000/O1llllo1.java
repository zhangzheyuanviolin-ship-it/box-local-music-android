            package p000;

            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            import java.util.Iterator;
            
            public final class O1llllo1 extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final O1lo00 I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1llllo1(O1lo00 o1lo00, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = o1lo00;
/* 3 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             O1llllo1 o1llllo1 = new O1llllo1(this.I00iiI, this.I00iiO, iOoil1iiIilo);
/* 10 */            o1llllo1.I00iOIl = obj;
/* 37 */            return o1llllo1;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O1llllo1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    Object next;
                    File file;
                    CompiledModel compiledModelCreate$default;
/* 1 */             String str = this.I00iiO;
/* 5 */             O1lo00 o1lo00 = this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 16 */                CompiledModel compiledModel = o1lo00.I00000oIO;
/* 18 */                if (compiledModel != null) {
/* 20 */                    compiledModel.close();
                        }
                    } catch (Throwable unused) {
                    }
                    try {
/* 24 */                o1lo00.I00000oIO = null;
/* 37 */                Iterator it = IlIl10.I000l1(new File(str), IlIl0l1lO.I00iOIl).iterator();
                        while (true) {
/* 42 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 48 */                    if (!i011lIilI0lo.hasNext()) {
/* 79 */                        next = null;
                                break;
                            }
/* 50 */                    next = i011lIilI0lo.next();
/* 55 */                    File file2 = (File) next;
/* 61 */                    if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
                                break;
                            }
                        }
/* 80 */                file = (File) next;
                    } catch (Throwable th) {
/* 171 */               Log.e("MiGanEngine", "loadModel failed", th);
                        try {
/* 174 */                   CompiledModel compiledModel2 = o1lo00.I00000oIO;
/* 176 */                   if (compiledModel2 != null) {
/* 178 */                       compiledModel2.close();
                            }
                        } catch (Throwable unused2) {
                        }
/* 181 */               o1lo00.I00000oIO = null;
/* 183 */               z = false;
                    }
/* 82 */            if (file == null) {
/* 101 */               Log.e("MiGanEngine", "No .tflite found under " + str);
/* 104 */               return Boolean.FALSE;
                    }
                    try {
/* 129 */               compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU, Accelerator.CPU), null, 4, null);
                    } catch (Throwable th2) {
/* 138 */               Log.w("MiGanEngine", "GPU compile failed, falling back to CPU", th2);
/* 161 */               compiledModelCreate$default = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), null, 4, null);
                    }
/* 165 */           o1lo00.I00000oIO = compiledModelCreate$default;
/* 167 */           z = true;
/* 184 */           return Boolean.valueOf(z);
                }
            }
