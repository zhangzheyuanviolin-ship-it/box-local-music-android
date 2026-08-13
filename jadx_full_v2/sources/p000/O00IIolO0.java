            package p000;
            
            public final class O00IIolO0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final O00IOI11 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O00IIolO0(O00IOI11 o00ioi11, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = o00ioi11;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O00IOI11 o00ioi11 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new O00IIolO0(o00ioi11, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new O00IIolO0(o00ioi11, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new O00IIolO0(o00ioi11, iOoil1iiIilo, 2);
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
/* 18 */            return ((O00IIolO0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O00IOI11 o00ioi11 = this.I00iiO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 84 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 86 */                    int i2 = this.I00iiI;
/* 88 */                    if (i2 == 0) {
/* 100 */                       lIoii1l01l0i.I00000oOI(obj);
/* 103 */                       OoIlIoo1oiOo ooIlIoo1oiOo = o00ioi11.I00000oOI;
/* 105 */                       this.I00iiI = 1;
/* 111 */                       if (ooIlIoo1oiOo.I000lI(this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 96 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 92 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                        case 1:
/* 51 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 53 */                    int i3 = this.I00iiI;
/* 55 */                    if (i3 == 0) {
/* 67 */                        lIoii1l01l0i.I00000oOI(obj);
/* 70 */                        OoIlIoo1oiOo ooIlIoo1oiOo2 = o00ioi11.I00000oOI;
/* 72 */                        this.I00iiI = 1;
/* 78 */                        if (ooIlIoo1oiOo2.I000lI(this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 63 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 59 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                        default:
/* 14 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 16 */                    int i4 = this.I00iiI;
/* 18 */                    if (i4 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 33 */                        this.I00iiI = 1;
/* 37 */                        Object objI000lI = o00ioi11.I00000oOI.I000lI(this);
/* 41 */                        if (objI000lI != ii0111o3) {
/* 44 */                            objI000lI = ooiIlOl1iI;
                                }
/* 45 */                        if (objI000lI == ii0111o3) {
                                    break;
                                }
                            } else if (i4 != 1) {
/* 26 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
                            break;
                    }
/* 49 */            return ooiIlOl1iI;
                }
            }
