            package p000;
            
            public final class I0O0i0Olo0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol010000lo00 I00iiO;
                public final IllOOo00lI I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0O0i0Olo0(Ol010000lo00 ol010000lo00, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol010000lo00;
/* 5 */             this.I00iio = illOOo00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 68 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        case 1:
/* 57 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                        case 2:
/* 46 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 2);
                        case 3:
/* 35 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 3);
                        case 4:
/* 24 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 4);
                        default:
/* 13 */                    return new I0O0i0Olo0(this.I00iiO, this.I00iio, iOoil1iiIilo, 5);
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
/* 18 */            return ((I0O0i0Olo0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IllOOo00lI illOOo00lI = this.I00iio;
/* 7 */             Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 186 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 188 */                   int i2 = this.I00iiI;
/* 190 */                   if (i2 == 0) {
/* 203 */                       lIoii1l01l0i.I00000oOI(obj);
/* 206 */                       this.I00iiI = 1;
/* 212 */                       if (ol010000lo00.I0000O(this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 198 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 194 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 216 */                   illOOo00lI.invoke();
                            break;
                        case 1:
/* 152 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 154 */                   int i3 = this.I00iiI;
/* 156 */                   if (i3 == 0) {
/* 169 */                       lIoii1l01l0i.I00000oOI(obj);
/* 172 */                       this.I00iiI = 1;
/* 178 */                       if (ol010000lo00.I0000O(this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 164 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 160 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 182 */                   illOOo00lI.invoke();
                            break;
                        case 2:
/* 118 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 120 */                   int i4 = this.I00iiI;
/* 122 */                   if (i4 == 0) {
/* 135 */                       lIoii1l01l0i.I00000oOI(obj);
/* 138 */                       this.I00iiI = 1;
/* 144 */                       if (ol010000lo00.I0000O(this) == ii0111o3) {
                                    break;
                                }
                            } else if (i4 != 1) {
/* 130 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 126 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 148 */                   illOOo00lI.invoke();
                            break;
                        case 3:
/* 84 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 86 */                    int i5 = this.I00iiI;
/* 88 */                    if (i5 == 0) {
/* 101 */                       lIoii1l01l0i.I00000oOI(obj);
/* 104 */                       this.I00iiI = 1;
/* 110 */                       if (ol010000lo00.I0000O(this) == ii0111o4) {
                                    break;
                                }
                            } else if (i5 != 1) {
/* 96 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 92 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 114 */                   illOOo00lI.invoke();
                            break;
                        case 4:
/* 50 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 52 */                    int i6 = this.I00iiI;
/* 54 */                    if (i6 == 0) {
/* 67 */                        lIoii1l01l0i.I00000oOI(obj);
/* 70 */                        this.I00iiI = 1;
/* 76 */                        if (ol010000lo00.I0000O(this) == ii0111o5) {
                                    break;
                                }
                            } else if (i6 != 1) {
/* 62 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 58 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 80 */                    illOOo00lI.invoke();
                            break;
                        default:
/* 16 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 18 */                    int i7 = this.I00iiI;
/* 20 */                    if (i7 == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 36 */                        this.I00iiI = 1;
/* 42 */                        if (ol010000lo00.I0000O(this) == ii0111o6) {
                                    break;
                                }
                            } else if (i7 != 1) {
/* 28 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 46 */                    illOOo00lI.invoke();
                            break;
                    }
/* 49 */            return ooiIlOl1iI;
                }
            }
