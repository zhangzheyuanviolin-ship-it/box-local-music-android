            package p000;

            import java.util.List;
            
            public final class II000lIl0o10 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol010000lo00 I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II000lIl0o10(Ol010000lo00 ol010000lo00, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol010000lo00;
/* 5 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iio;
/* 5 */             Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 48 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 0);
                        case 1:
/* 41 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 1);
                        case 2:
/* 34 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 2);
                        case 3:
/* 27 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 3);
                        case 4:
/* 20 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 4);
                        default:
/* 13 */                    return new II000lIl0o10(ol010000lo00, oI10i0Il, iOoil1iiIilo, 5);
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
/* 18 */            return ((II000lIl0o10) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
                
                    if (r3.I0000O(r9) == r0) goto L66;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iio;
/* 7 */             Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 198 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 200 */                   int i2 = this.I00iiI;
/* 203 */                   if (i2 == 0) {
/* 222 */                       lIoii1l01l0i.I00000oOI(obj);
/* 225 */                       this.I00iiI = 1;
/* 233 */                       if (il0l1o1l.I00000oOI(200L, this) != ii0111o) {
                                }
                                break;
                            } else if (i2 == 1) {
/* 218 */                       lIoii1l01l0i.I00000oOI(obj);
                            } else if (i2 != 2) {
/* 213 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 209 */                       lIoii1l01l0i.I00000oOI(obj);
/* 248 */                       oI10i0Il.setValue(Boolean.FALSE);
                                break;
                            }
/* 236 */                   this.I00iiI = 2;
                            break;
                        case 1:
/* 162 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 164 */                   int i3 = this.I00iiI;
/* 166 */                   if (i3 == 0) {
/* 179 */                       lIoii1l01l0i.I00000oOI(obj);
/* 182 */                       this.I00iiI = 1;
/* 188 */                       if (ol010000lo00.I0000O(this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 174 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 170 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 194 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 124 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 126 */                   int i4 = this.I00iiI;
/* 128 */                   if (i4 == 0) {
/* 141 */                       lIoii1l01l0i.I00000oOI(obj);
/* 144 */                       this.I00iiI = 1;
/* 150 */                       if (ol010000lo00.I0000O(this) == ii0111o3) {
                                    break;
                                }
                            } else if (i4 != 1) {
/* 136 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 132 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 154 */                   List list = Io0IlOI0l.I00000oIO;
/* 158 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 3:
/* 88 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 90 */                    int i5 = this.I00iiI;
/* 92 */                    if (i5 == 0) {
/* 105 */                       lIoii1l01l0i.I00000oOI(obj);
/* 108 */                       this.I00iiI = 1;
/* 114 */                       if (ol010000lo00.I0000O(this) == ii0111o4) {
                                    break;
                                }
                            } else if (i5 != 1) {
/* 100 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 96 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 120 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 4:
/* 52 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 54 */                    int i6 = this.I00iiI;
/* 56 */                    if (i6 == 0) {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
/* 72 */                        this.I00iiI = 1;
/* 78 */                        if (ol010000lo00.I0000O(this) == ii0111o5) {
                                    break;
                                }
                            } else if (i6 != 1) {
/* 64 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 60 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 84 */                    oI10i0Il.setValue(Boolean.FALSE);
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
/* 48 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                    }
/* 51 */            return ooiIlOl1iI;
                }
            }
