            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIlli11OIol extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IIlll1OOiIO1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIlli11OIol(IIlll1OOiIO1 iIlll1OOiIO1, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iIlll1OOiIO1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIlll1OOiIO1 iIlll1OOiIO1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new IIlli11OIol(iIlll1OOiIO1, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new IIlli11OIol(iIlll1OOiIO1, iOoil1iiIilo, 1);
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
/* 18 */            return ((IIlli11OIol) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 53 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 55 */                    int i = this.I00iiI;
/* 57 */                    if (i == 0) {
/* 71 */                        lIoii1l01l0i.I00000oOI(obj);
/* 76 */                        IIo0ll0o iIo0ll0o = this.I00iiO.I00ilI0I1;
/* 80 */                        I1io1I i1io1I = new I1io1I();
/* 85 */                        i1io1I.I00000oIO = 8;
/* 87 */                        VarHandle.storeStoreFence();
                                synchronized (iIo0ll0o.I00000oIO) {
/* 95 */                            if (!iIo0ll0o.I000II) {
/* 102 */                               l11I11lO.I0000O(3, "CXCP");
/* 105 */                               iIo0ll0o.I000II = true;
/* 107 */                               IIllOlooI iIllOlooI = IIllOlooI.I00iiO;
/* 109 */                               iIo0ll0o.I0000oI00 = iIllOlooI;
/* 111 */                               iIo0ll0o.I0001Ioi1lo = i1io1I;
/* 113 */                               iIo0ll0o.I0000Il00O(iIllOlooI, i1io1I);
/* 116 */                               iIo0ll0o.I0000O = null;
                                    }
                                }
/* 121 */                       OolOO1oOoo oolOO1oOoo = this.I00iiO.I00iOIl;
/* 123 */                       this.I00iiI = 1;
/* 129 */                       if (oolOO1oOoo.I0000oI00(this) == ii0111o) {
/* 131 */                           return ii0111o;
                                }
                            } else {
/* 59 */                        if (i != 1) {
/* 67 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 4 */                             return null;
                                }
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 133 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 8 */                     IIlll1OOiIO1 iIlll1OOiIO1 = this.I00iiO;
/* 10 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 12 */                    int i2 = this.I00iiI;
/* 14 */                    if (i2 == 0) {
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 31 */                        OolOO1oOoo oolOO1oOoo2 = iIlll1OOiIO1.I00iOIl;
/* 33 */                        this.I00iiI = 1;
/* 39 */                        if (oolOO1oOoo2.I0000oI00(this) == ii0111o2) {
/* 41 */                            return ii0111o2;
                                }
                            } else {
/* 16 */                        if (i2 != 1) {
/* 24 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 4 */                             return null;
                                }
/* 18 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 47 */                    il001oo1.I00000oOI(iIlll1OOiIO1.I00iio.I00000oIO, null);
/* 50 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
