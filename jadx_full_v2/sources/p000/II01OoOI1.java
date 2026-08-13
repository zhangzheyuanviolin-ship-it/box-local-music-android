            package p000;

            import java.util.List;
            
            public final class II01OoOI1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II01OoOI1(OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iiO;
                    switch (i) {
                        case 0:
/* 46 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 0);
                        case 1:
/* 39 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 1);
                        case 2:
/* 32 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 2);
                        case 3:
/* 25 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 3);
                        case 4:
/* 18 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 4);
                        default:
/* 11 */                    return new II01OoOI1(oI10i0Il, iOoil1iiIilo, 5);
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
/* 18 */            return ((II01OoOI1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            OI10i0Il oI10i0Il = this.I00iiO;
                    switch (i) {
                        case 0:
/* 234 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 236 */                   int i2 = this.I00iiI;
/* 238 */                   if (i2 == 0) {
/* 251 */                       lIoii1l01l0i.I00000oOI(obj);
/* 254 */                       this.I00iiI = 1;
/* 260 */                       if (il0l1o1l.I00000oOI(500L, this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 246 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 242 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 266 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 1:
/* 198 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 200 */                   int i3 = this.I00iiI;
/* 202 */                   if (i3 == 0) {
/* 215 */                       lIoii1l01l0i.I00000oOI(obj);
/* 218 */                       this.I00iiI = 1;
/* 224 */                       if (il0l1o1l.I00000oOI(500L, this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 210 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 206 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 230 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 150 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 152 */                   int i4 = this.I00iiI;
/* 154 */                   if (i4 == 0) {
/* 167 */                       lIoii1l01l0i.I00000oOI(obj);
/* 180 */                       if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 182 */                           this.I00iiI = 1;
/* 188 */                           if (il0l1o1l.I00000oOI(3000L, this) == ii0111o3) {
                                        break;
                                    }
                                }
                            } else if (i4 != 1) {
/* 162 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 158 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 194 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 3:
/* 110 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 112 */                   int i5 = this.I00iiI;
/* 114 */                   if (i5 == 0) {
/* 127 */                       lIoii1l01l0i.I00000oOI(obj);
/* 130 */                       this.I00iiI = 1;
/* 138 */                       if (il0l1o1l.I00000oOI(3500L, this) == ii0111o4) {
                                    break;
                                }
                            } else if (i5 != 1) {
/* 122 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 118 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 142 */                   List list = IoI0lol0i1i.I00000oIO;
/* 146 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 4:
/* 70 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 72 */                    int i6 = this.I00iiI;
/* 74 */                    if (i6 == 0) {
/* 87 */                        lIoii1l01l0i.I00000oOI(obj);
/* 90 */                        this.I00iiI = 1;
/* 98 */                        if (il0l1o1l.I00000oOI(200L, this) == ii0111o5) {
                                    break;
                                }
                            } else if (i6 != 1) {
/* 82 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 78 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 102 */                   Il0li01oOil il0li01oOil = OOOIo1O1I0I.I00000oIO;
/* 106 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        default:
/* 18 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 20 */                    int i7 = this.I00iiI;
/* 22 */                    if (i7 == 0) {
/* 35 */                        lIoii1l01l0i.I00000oOI(obj);
/* 38 */                        List list2 = Ol0lllilO0Ol.I00000oIO;
/* 50 */                        if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 52 */                            this.I00iiI = 1;
/* 58 */                            if (il0l1o1l.I00000oOI(3000L, this) == ii0111o6) {
                                        break;
                                    }
                                }
                            } else if (i7 != 1) {
/* 30 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 26 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 62 */                    List list3 = Ol0lllilO0Ol.I00000oIO;
/* 66 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                    }
/* 69 */            return ooiIlOl1iI;
                }
            }
