            package p000;

            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            import java.util.Iterator;
            
            public final class Iiil110oiIi extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final IiilI0lIiol I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iiil110oiIi(IiilI0lIiol iiilI0lIiol, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = iiilI0lIiol;
/* 3 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             Iiil110oiIi iiil110oiIi = new Iiil110oiIi(this.I00iiI, this.I00iiO, iOoil1iiIilo);
/* 10 */            iiil110oiIi.I00iOIl = obj;
/* 37 */            return iiil110oiIi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Iiil110oiIi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    Object next;
                    File file;
/* 3 */             String str = this.I00iiO;
/* 5 */             IiilI0lIiol iiilI0lIiol = this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            lIoii1l01l0i.I00000oOI(obj);
                    try {
/* 16 */                CompiledModel compiledModel = iiilI0lIiol.I00000oIO;
/* 18 */                if (compiledModel != null) {
/* 20 */                    compiledModel.close();
                        }
                    } catch (Throwable unused) {
                    }
                    try {
/* 24 */                iiilI0lIiol.I00000oIO = null;
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
/* 138 */               Log.e("DmCountEngine", "loadModel failed", th);
                        try {
/* 141 */                   CompiledModel compiledModel2 = iiilI0lIiol.I00000oIO;
/* 143 */                   if (compiledModel2 != null) {
/* 145 */                       compiledModel2.close();
                            }
                        } catch (Throwable unused2) {
                        }
/* 148 */               iiilI0lIiol.I00000oIO = null;
/* 150 */               z = false;
                    }
/* 82 */            if (file != null) {
/* 132 */               iiilI0lIiol.I00000oIO = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.GPU), null, 4, null);
/* 134 */               z = true;
/* 151 */               return Boolean.valueOf(z);
                    }
/* 101 */           Log.e("DmCountEngine", "No .tflite found under " + str);
/* 104 */           return Boolean.FALSE;
                }
            }
