            package p000;

            import androidx.work.CoroutineWorker;
            
            public final class Ii01O1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final CoroutineWorker I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii01O1(CoroutineWorker coroutineWorker, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = coroutineWorker;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             CoroutineWorker coroutineWorker = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new Ii01O1(coroutineWorker, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new Ii01O1(coroutineWorker, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Ii01O1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             CoroutineWorker coroutineWorker = this.I00iiO;
                    switch (i) {
                        case 0:
/* 42 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 44 */                    int i2 = this.I00iiI;
/* 46 */                    if (i2 == 0) {
/* 59 */                        lIoii1l01l0i.I00000oOI(obj);
/* 62 */                        this.I00iiI = 1;
/* 64 */                        Object objI00000oOI = coroutineWorker.I00000oOI();
                                return objI00000oOI == ii0111o ? ii0111o : objI00000oOI;
                            }
/* 48 */                    if (i2 == 1) {
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
/* 71 */                        return obj;
                            }
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i3 = this.I00iiI;
/* 16 */                    if (i3 == 0) {
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
/* 32 */                        this.I00iiI = 1;
/* 34 */                        Object objI00000oIO = coroutineWorker.I00000oIO(this);
                                return objI00000oIO == ii0111o2 ? ii0111o2 : objI00000oIO;
                            }
/* 18 */                    if (i3 == 1) {
/* 20 */                        lIoii1l01l0i.I00000oOI(obj);
/* 41 */                        return obj;
                            }
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                    }
                }
            }
