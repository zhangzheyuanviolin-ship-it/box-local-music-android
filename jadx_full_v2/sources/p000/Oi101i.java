            package p000;
            
/* 11 */    public final class Oi101i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public int I00iiI;
                public final boolean I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi101i(Oo0IOoOi01 oo0IOoOi01, boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = oo0IOoOi01;
/* 6 */             this.I00iiO = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iiO;
/* 5 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 22 */                    return new Oi101i(z, (OiOl01il10lO) obj2, iOoil1iiIilo);
                        default:
/* 14 */                    return new Oi101i((Oo0IOoOi01) obj2, z, iOoil1iiIilo);
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
/* 18 */            return ((Oi101i) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOO0IOIll iOO0IOIll;
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iiO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            Object obj2 = this.I00iio;
/* 12 */            I1111OO10i i1111OO10iI00000oIO = null;
                    switch (i) {
                        case 0:
/* 123 */                   OiOl01il10lO oiOl01il10lO = (OiOl01il10lO) obj2;
/* 125 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 127 */                   int i2 = this.I00iiI;
/* 129 */                   if (i2 != 0) {
/* 131 */                       if (i2 == 1) {
/* 133 */                           lIoii1l01l0i.I00000oOI(obj);
/* 192 */                           return ooiIlOl1iI;
                                }
/* 137 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 142 */                   lIoii1l01l0i.I00000oOI(obj);
/* 145 */                   if (!z) {
/* 192 */                       return ooiIlOl1iI;
                            }
/* 162 */                   if (oiOl01il10lO.I0001Ioi1lo.I000II() - oiOl01il10lO.I00000oIO.I000II() >= 80) {
/* 192 */                       return ooiIlOl1iI;
                            }
/* 164 */                   this.I00iiI = 1;
/* 181 */                   Object objI00000oIO = lO1010I.I00000oIO(oiOl01il10lO, 1000000 - r1.I000II(), new OlIOiI1iI1(null, 7), this);
/* 185 */                   if (objI00000oIO != ii0111o) {
/* 188 */                       objI00000oIO = ooiIlOl1iI;
                            }
                            return objI00000oIO == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 16 */                    Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) obj2;
/* 18 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 20 */                    int i3 = this.I00iiI;
/* 22 */                    if (i3 != 0) {
/* 24 */                        if (i3 == 1) {
/* 26 */                            lIoii1l01l0i.I00000oOI(obj);
/* 122 */                           return ooiIlOl1iI;
                                }
/* 30 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    if (!Oo0lI00l.I0000O(oo0IOoOi01.I000l1().I00000oOI) && !(oo0IOoOi01.I0001Ioi1lo instanceof OO0I1Oli)) {
/* 60 */                        i1111OO10iI00000oIO = lOlII1lolOiO.I00000oIO(oo0IOoOi01.I000l1());
/* 64 */                        if (z) {
/* 73 */                            int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(oo0IOoOi01.I000l1().I00000oOI);
/* 93 */                            oo0IOoOi01.I0000Il00O.invoke(Oo0IOoOi01.I00000oOI(oo0IOoOi01.I000l1().I00000oIO, lOliOi0Oi.I00000oIO(iI0001Ioi1lo, iI0001Ioi1lo)));
/* 98 */                            oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
                                }
                            }
/* 101 */                   if (i1111OO10iI00000oIO == null || (iOO0IOIll = oo0IOoOi01.I000O01llI0) == null) {
/* 122 */                       return ooiIlOl1iI;
                            }
/* 108 */                   IOO01ol iOO01olI00000oIO = ii0ioiio.I00000oIO(i1111OO10iI00000oIO);
/* 112 */                   this.I00iiI = 1;
/* 116 */                   ((I0lOi1li1Ii) iOO0IOIll).I00000oIO(iOO01olI00000oIO);
                            return ooiIlOl1iI == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public Oi101i(boolean z, OiOl01il10lO oiOl01il10lO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 13 */            this.I00iiO = z;
                    this.I00iio = oiOl01il10lO;
                }
            }
