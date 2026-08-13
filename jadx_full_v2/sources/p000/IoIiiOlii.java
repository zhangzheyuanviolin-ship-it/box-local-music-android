            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class IoIiiOlii extends Oll0io implements Function3 {
                public final int I00iOIl;
                public Throwable I00iiI;
                public int I00iiO;
                public IoO10Iooo0 I00iio;
                public Throwable I00ilI0I1;
                public final List I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIiiOlii(List list, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00ilO0 = list;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             List list = this.I00ilO0;
/* 7 */             IoO10Iooo0 ioO10Iooo0 = (IoO10Iooo0) obj;
/* 9 */             Throwable th = (Throwable) obj2;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj3;
                    switch (i) {
                        case 0:
/* 34 */                    IoIiiOlii ioIiiOlii = new IoIiiOlii(list, iOoil1iiIilo, 0);
/* 37 */                    ioIiiOlii.I00iio = ioO10Iooo0;
/* 39 */                    ioIiiOlii.I00ilI0I1 = th;
/* 41 */                    return ioIiiOlii.invokeSuspend(ooiIlOl1iI);
                        default:
/* 19 */                    IoIiiOlii ioIiiOlii2 = new IoIiiOlii(list, iOoil1iiIilo, 1);
/* 22 */                    ioIiiOlii2.I00iio = ioO10Iooo0;
/* 24 */                    ioIiiOlii2.I00ilI0I1 = th;
/* 26 */                    return ioIiiOlii2.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             List list = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 60 */                    IoO10Iooo0 ioO10Iooo0 = this.I00iio;
/* 62 */                    Throwable th = this.I00ilI0I1;
/* 64 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 66 */                    int i2 = this.I00iiO;
/* 68 */                    if (i2 != 0) {
/* 70 */                        if (i2 != 1) {
/* 78 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 72 */                        Throwable th2 = this.I00iiI;
/* 74 */                        lIoii1l01l0i.I00000oOI(obj);
/* 105 */                       return th2;
                            }
/* 82 */                    lIoii1l01l0i.I00000oOI(obj);
/* 85 */                    Throwable thI00000oIO = ilIiI1O0.I00000oIO(th);
/* 89 */                    this.I00iio = null;
/* 91 */                    this.I00ilI0I1 = null;
/* 93 */                    this.I00iiI = thI00000oIO;
/* 95 */                    this.I00iiO = 1;
/* 97 */                    IoIiolOl00.I00000oIO(list, thI00000oIO, ioO10Iooo0, this);
                            return ooiIlOl1iI == ii0111o ? ii0111o : thI00000oIO;
                        default:
/* 14 */                    IoO10Iooo0 ioO10Iooo02 = this.I00iio;
/* 16 */                    Throwable th3 = this.I00ilI0I1;
/* 18 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 20 */                    int i3 = this.I00iiO;
/* 22 */                    if (i3 != 0) {
/* 24 */                        if (i3 != 1) {
/* 32 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 26 */                        Throwable th4 = this.I00iiI;
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 59 */                        return th4;
                            }
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
/* 39 */                    Throwable thI00000oIO2 = ilIiI1O0.I00000oIO(th3);
/* 43 */                    this.I00iio = null;
/* 45 */                    this.I00ilI0I1 = null;
/* 47 */                    this.I00iiI = thI00000oIO2;
/* 49 */                    this.I00iiO = 1;
/* 51 */                    IoIiolOl00.I00000oIO(list, thI00000oIO2, ioO10Iooo02, this);
                            return ooiIlOl1iI == ii0111o2 ? ii0111o2 : thI00000oIO2;
                    }
                }
            }
