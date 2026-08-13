            package p000;

            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.File;
            import java.util.Iterator;
            
            public final class IlI00Ii0III extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final IlI00iOi1 I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI00Ii0III(IlI00iOi1 ilI00iOi1, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = ilI00iOi1;
/* 3 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             IlI00Ii0III ilI00Ii0III = new IlI00Ii0III(this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 10 */            ilI00Ii0III.I00iiI = obj;
/* 37 */            return ilI00Ii0III;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IlI00Ii0III) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    File file;
/* 1 */             String str = this.I00iio;
/* 5 */             Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 7 */             Object obj2 = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iOIl;
/* 11 */            Object obj3 = null;
/* 14 */            IlI00iOi1 ilI00iOi1 = this.I00iiO;
/* 16 */            boolean z = true;
                    try {
/* 17 */                if (i == 0) {
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    this.I00iiI = ii0110;
/* 40 */                    this.I00iOIl = 1;
/* 50 */                    Object objI0000oI00 = iOi1II01i0.I0000oI00(IlI00iOi1.I00000oOI, new I1iOI0oo(ilI00iOi1, (IOoil1iiIilo) null, 7), this);
/* 54 */                    if (objI0000oI00 != obj2) {
/* 57 */                        objI0000oI00 = OoiIlOl1iI.I00000oIO;
                            }
/* 59 */                    if (objI0000oI00 == obj2) {
/* 61 */                        return obj2;
                            }
                        } else {
/* 19 */                    if (i != 1) {
/* 31 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 73 */                Iterator it = IlIl10.I000l1(new File(str), IlIl0l1lO.I00iOIl).iterator();
                        while (true) {
/* 78 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 84 */                    if (!i011lIilI0lo.hasNext()) {
                                break;
                            }
/* 86 */                    Object next = i011lIilI0lo.next();
/* 91 */                    File file2 = (File) next;
/* 97 */                    if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
/* 111 */                       obj3 = next;
                                break;
                            }
                        }
/* 112 */               file = (File) obj3;
                    } catch (Throwable th) {
/* 168 */               Log.e("FaceEmbedEngine", "loadModel failed", th);
/* 171 */               z = false;
                    }
/* 114 */           if (file != null) {
/* 163 */               ilI00iOi1.I00000oIO = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, file.getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), null, 4, null);
/* 172 */               return Boolean.valueOf(z);
                    }
/* 133 */           Log.e("FaceEmbedEngine", "No .tflite found under " + str);
/* 136 */           return Boolean.FALSE;
                }
            }
