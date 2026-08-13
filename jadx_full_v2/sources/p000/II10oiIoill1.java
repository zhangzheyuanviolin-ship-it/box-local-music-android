            package p000;
            
            public final class II10oiIoill1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol1OlloIO I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II10oiIoill1(Ol1OlloIO ol1OlloIO, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol1OlloIO;
/* 5 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iio;
/* 5 */             Ol1OlloIO ol1OlloIO = this.I00iiO;
                    switch (i) {
                        case 0:
/* 34 */                    return new II10oiIoill1(ol1OlloIO, oI10i0Il, iOoil1iiIilo, 0);
                        case 1:
/* 27 */                    return new II10oiIoill1(ol1OlloIO, oI10i0Il, iOoil1iiIilo, 1);
                        case 2:
/* 20 */                    return new II10oiIoill1(ol1OlloIO, oI10i0Il, iOoil1iiIilo, 2);
                        default:
/* 13 */                    return new II10oiIoill1(ol1OlloIO, oI10i0Il, iOoil1iiIilo, 3);
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
/* 18 */            return ((II10oiIoill1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             Ol1OlloIO ol1OlloIO = this.I00iiO;
/* 11 */            OI10i0Il oI10i0Il = this.I00iio;
                    switch (i) {
                        case 0:
/* 140 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 142 */                   int i2 = this.I00iiI;
/* 144 */                   if (i2 != 0) {
/* 146 */                       if (i2 == 1) {
/* 148 */                           lIoii1l01l0i.I00000oOI(obj);
/* 179 */                           return ooiIlOl1iI;
                                }
/* 152 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 157 */                   lIoii1l01l0i.I00000oOI(obj);
/* 168 */                   if (!((II10ol01) oI10i0Il.getValue()).I000II) {
/* 179 */                       return ooiIlOl1iI;
                            }
/* 170 */                   this.I00iiI = 1;
                            return Ol1OlloIO.I00000oOI(ol1OlloIO, "Saved to Pictures/LocalDiffusion", this, 14) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 100 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 102 */                   int i3 = this.I00iiI;
/* 104 */                   if (i3 != 0) {
/* 106 */                       if (i3 == 1) {
/* 108 */                           lIoii1l01l0i.I00000oOI(obj);
/* 139 */                           return ooiIlOl1iI;
                                }
/* 112 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 117 */                   lIoii1l01l0i.I00000oOI(obj);
/* 128 */                   if (!((Ili00oiIllI) oI10i0Il.getValue()).I000II) {
/* 139 */                       return ooiIlOl1iI;
                            }
/* 130 */                   this.I00iiI = 1;
                            return Ol1OlloIO.I00000oOI(ol1OlloIO, "Saved to Pictures/LocalDiffusion", this, 14) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 60 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 62 */                    int i4 = this.I00iiI;
/* 64 */                    if (i4 != 0) {
/* 66 */                        if (i4 == 1) {
/* 68 */                            lIoii1l01l0i.I00000oOI(obj);
/* 99 */                            return ooiIlOl1iI;
                                }
/* 72 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 77 */                    lIoii1l01l0i.I00000oOI(obj);
/* 88 */                    if (!((O1loIIIOiO) oI10i0Il.getValue()).I000O01llI0) {
/* 99 */                        return ooiIlOl1iI;
                            }
/* 90 */                    this.I00iiI = 1;
                            return Ol1OlloIO.I00000oOI(ol1OlloIO, "Saved to Pictures/LocalDiffusion", this, 14) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                        default:
/* 20 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 22 */                    int i5 = this.I00iiI;
/* 24 */                    if (i5 != 0) {
/* 26 */                        if (i5 == 1) {
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 59 */                            return ooiIlOl1iI;
                                }
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    if (!((i0I01ii) oI10i0Il.getValue()).I000II) {
/* 59 */                        return ooiIlOl1iI;
                            }
/* 50 */                    this.I00iiI = 1;
                            return Ol1OlloIO.I00000oOI(ol1OlloIO, "Saved to Pictures/LocalDiffusion", this, 14) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                    }
                }
            }
