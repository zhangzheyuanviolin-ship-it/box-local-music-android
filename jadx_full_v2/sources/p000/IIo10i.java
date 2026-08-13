            package p000;
            
            public final class IIo10i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final OOo0ooi I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIo10i(OOo0ooi oOo0ooi, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oOo0ooi;
/* 5 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iio;
/* 5 */             OOo0ooi oOo0ooi = this.I00iiO;
                    switch (i) {
                        case 0:
/* 22 */                    IIo10i iIo10i = new IIo10i(oOo0ooi, str, iOoil1iiIilo, 0);
/* 25 */                    iIo10i.I00iiI = obj;
/* 27 */                    return iIo10i;
                        default:
/* 13 */                    IIo10i iIo10i2 = new IIo10i(oOo0ooi, str, iOoil1iiIilo, 1);
/* 16 */                    iIo10i2.I00iiI = obj;
/* 18 */                    return iIo10i2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OIi0ooOoOOo0 oIi0ooOoOOo0 = (OIi0ooOoOOo0) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((IIo10i) create(oIi0ooOoOOo0, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OOo0ooi oOo0ooi = this.I00iiO;
/* 6 */             String str = this.I00iio;
                    switch (i) {
                        case 0:
/* 26 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 28 */                    lIoii1l01l0i.I00000oOI(obj);
/* 33 */                    OIi0ooOoOOo0 oIi0ooOoOOo0 = (OIi0ooOoOOo0) this.I00iiI;
/* 35 */                    IIllI0o.I0000Il00O(str);
/* 38 */                    oOo0ooi.I00iOIl = null;
/* 40 */                    return oIi0ooOoOOo0;
                        default:
/* 11 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
/* 18 */                    OIi0ooOoOOo0 oIi0ooOoOOo02 = (OIi0ooOoOOo0) this.I00iiI;
/* 20 */                    IIllI0o.I0000Il00O(str);
/* 23 */                    oOo0ooi.I00iOIl = null;
/* 25 */                    return oIi0ooOoOOo02;
                    }
                }
            }
