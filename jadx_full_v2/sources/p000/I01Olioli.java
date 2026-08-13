            package p000;
            
/* 10 */    public final class I01Olioli extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OiOoIO1 I00iiO;
                public long I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01Olioli(OiOoIO1 oiOoIO1, long j, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oiOoIO1;
/* 5 */             this.I00iio = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    I01Olioli i01Olioli = new I01Olioli(this.I00iiO, iOoil1iiIilo);
/* 54 */                    i01Olioli.I00iio = ((OIOlIiiioi) obj).I00000oIO;
/* 56 */                    return i01Olioli;
                        case 1:
/* 38 */                    return new I01Olioli(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                        case 2:
/* 26 */                    return new I01Olioli(this.I00iiO, this.I00iio, iOoil1iiIilo, 2);
                        default:
/* 14 */                    return new I01Olioli(this.I00iiO, this.I00iio, iOoil1iiIilo, 3);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
                            break;
                    }
/* 18 */            return ((I01Olioli) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OiOoIO1 oiOoIO1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 124 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 126 */                   int i2 = this.I00iiI;
/* 128 */                   if (i2 != 0) {
/* 130 */                       if (i2 == 1) {
/* 132 */                           lIoii1l01l0i.I00000oOI(obj);
/* 157 */                           return obj;
                                }
/* 136 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 141 */                   lIoii1l01l0i.I00000oOI(obj);
/* 144 */                   long j = this.I00iio;
/* 146 */                   this.I00iiI = 1;
/* 150 */                   Object objI00000oOI = OiOlllI10.I00000oOI(oiOoIO1.I010o0o0oO, j, this);
                            return objI00000oOI == ii0111o ? ii0111o : objI00000oOI;
                        case 1:
/* 83 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 85 */                    int i3 = this.I00iiI;
/* 87 */                    if (i3 != 0) {
/* 89 */                        if (i3 == 1) {
/* 91 */                            lIoii1l01l0i.I00000oOI(obj);
/* 123 */                           return ooiIlOl1iI;
                                }
/* 95 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 100 */                   lIoii1l01l0i.I00000oOI(obj);
/* 103 */                   Oii00o1ll oii00o1ll = oiOoIO1.I010o0o0oO;
/* 105 */                   OI110lo oI110lo = OI110lo.I00iiI;
/* 111 */                   OiOo1loo oiOo1loo = new OiOo1loo(this.I00iio, null);
/* 114 */                   this.I00iiI = 1;
                            return oii00o1ll.I000II(oI110lo, oiOo1loo, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 49 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 51 */                    int i4 = this.I00iiI;
/* 53 */                    if (i4 != 0) {
/* 55 */                        if (i4 == 1) {
/* 57 */                            lIoii1l01l0i.I00000oOI(obj);
/* 82 */                            return ooiIlOl1iI;
                                }
/* 61 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 66 */                    lIoii1l01l0i.I00000oOI(obj);
/* 69 */                    Oii00o1ll oii00o1ll2 = oiOoIO1.I010o0o0oO;
/* 71 */                    long j2 = this.I00iio;
/* 73 */                    this.I00iiI = 1;
                            return oii00o1ll2.I0000Il00O(j2, true, this) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                        default:
/* 14 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 16 */                    int i5 = this.I00iiI;
/* 18 */                    if (i5 != 0) {
/* 20 */                        if (i5 == 1) {
/* 22 */                            lIoii1l01l0i.I00000oOI(obj);
/* 48 */                            return ooiIlOl1iI;
                                }
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Oii00o1ll oii00o1ll3 = oiOoIO1.I010o0o0oO;
/* 36 */                    long j3 = this.I00iio;
/* 38 */                    this.I00iiI = 1;
                            return oii00o1ll3.I0000Il00O(j3, false, this) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public I01Olioli(OiOoIO1 oiOoIO1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 0;
/* 12 */            this.I00iiO = oiOoIO1;
                }
            }
