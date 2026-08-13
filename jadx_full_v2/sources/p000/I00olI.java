            package p000;
            
            public final class I00olI extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final I00oo1iO0ll I00iiO;
                public final OOIII1oOoolO I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00olI(I00oo1iO0ll i00oo1iO0ll, OOIII1oOoolO oOIII1oOoolO, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i00oo1iO0ll;
/* 5 */             this.I00iio = oOIII1oOoolO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OOIII1oOoolO oOIII1oOoolO = this.I00iio;
/* 5 */             I00oo1iO0ll i00oo1iO0ll = this.I00iiO;
                    switch (i) {
                        case 0:
/* 34 */                    return new I00olI(i00oo1iO0ll, oOIII1oOoolO, iOoil1iiIilo, 0);
                        case 1:
/* 27 */                    return new I00olI(i00oo1iO0ll, oOIII1oOoolO, iOoil1iiIilo, 1);
                        case 2:
/* 20 */                    return new I00olI(i00oo1iO0ll, oOIII1oOoolO, iOoil1iiIilo, 2);
                        default:
/* 13 */                    return new I00olI(i00oo1iO0ll, oOIII1oOoolO, iOoil1iiIilo, 3);
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
/* 18 */            return ((I00olI) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OOIII1oOoolO oOIII1oOoolO = this.I00iio;
/* 7 */             I00oo1iO0ll i00oo1iO0ll = this.I00iiO;
                    switch (i) {
                        case 0:
/* 128 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 130 */                   int i2 = this.I00iiI;
/* 132 */                   if (i2 != 0) {
/* 134 */                       if (i2 == 1) {
/* 136 */                           lIoii1l01l0i.I00000oOI(obj);
/* 166 */                           return ooiIlOl1iI;
                                }
/* 140 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 145 */                   lIoii1l01l0i.I00000oOI(obj);
/* 148 */                   OI0lOIiOIOOo oI0lOIiOIOOo = i00oo1iO0ll.I00o101lO;
/* 150 */                   if (oI0lOIiOIOOo == null) {
/* 166 */                       return ooiIlOl1iI;
                            }
/* 154 */                   OOIII1l oOIII1l = new OOIII1l(oOIII1oOoolO);
/* 157 */                   this.I00iiI = 1;
                            return oI0lOIiOIOOo.I00000oIO(oOIII1l, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 89 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 91 */                    int i3 = this.I00iiI;
/* 93 */                    if (i3 != 0) {
/* 95 */                        if (i3 == 1) {
/* 97 */                            lIoii1l01l0i.I00000oOI(obj);
/* 127 */                           return ooiIlOl1iI;
                                }
/* 101 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 106 */                   lIoii1l01l0i.I00000oOI(obj);
/* 109 */                   OI0lOIiOIOOo oI0lOIiOIOOo2 = i00oo1iO0ll.I00o101lO;
/* 111 */                   if (oI0lOIiOIOOo2 == null) {
/* 127 */                       return ooiIlOl1iI;
                            }
/* 115 */                   OOIII1l oOIII1l2 = new OOIII1l(oOIII1oOoolO);
/* 118 */                   this.I00iiI = 1;
                            return oI0lOIiOIOOo2.I00000oIO(oOIII1l2, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 55 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 57 */                    int i4 = this.I00iiI;
/* 59 */                    if (i4 != 0) {
/* 61 */                        if (i4 == 1) {
/* 63 */                            lIoii1l01l0i.I00000oOI(obj);
/* 88 */                            return ooiIlOl1iI;
                                }
/* 67 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 72 */                    lIoii1l01l0i.I00000oOI(obj);
/* 75 */                    OI0lOIiOIOOo oI0lOIiOIOOo3 = i00oo1iO0ll.I00o101lO;
/* 77 */                    if (oI0lOIiOIOOo3 == null) {
/* 88 */                        return ooiIlOl1iI;
                            }
/* 79 */                    this.I00iiI = 1;
                            return oI0lOIiOIOOo3.I00000oIO(oOIII1oOoolO, this) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                        default:
/* 16 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 18 */                    int i5 = this.I00iiI;
/* 20 */                    if (i5 != 0) {
/* 22 */                        if (i5 == 1) {
/* 24 */                            lIoii1l01l0i.I00000oOI(obj);
/* 54 */                            return ooiIlOl1iI;
                                }
/* 28 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    OI0lOIiOIOOo oI0lOIiOIOOo4 = i00oo1iO0ll.I00o101lO;
/* 38 */                    if (oI0lOIiOIOOo4 == null) {
/* 54 */                        return ooiIlOl1iI;
                            }
/* 42 */                    OOIIIiOOili oOIIIiOOili = new OOIIIiOOili(oOIII1oOoolO);
/* 45 */                    this.I00iiI = 1;
                            return oI0lOIiOIOOo4.I00000oIO(oOIIIiOOili, this) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                    }
                }
            }
