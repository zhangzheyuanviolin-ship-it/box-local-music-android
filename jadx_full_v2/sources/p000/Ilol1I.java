            package p000;

            import java.util.List;
            
            public final class Ilol1I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Exception I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ilol1I(Exception exc, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = exc;
/* 5 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 5 */             Exception exc = this.I00iiI;
                    switch (i) {
                        case 0:
/* 34 */                    return new Ilol1I(exc, oI10i0Il, iOoil1iiIilo, 0);
                        case 1:
/* 27 */                    return new Ilol1I(exc, oI10i0Il, iOoil1iiIilo, 1);
                        case 2:
/* 20 */                    return new Ilol1I(exc, oI10i0Il, iOoil1iiIilo, 2);
                        default:
/* 13 */                    return new Ilol1I(exc, oI10i0Il, iOoil1iiIilo, 3);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 48 */                    ((Ilol1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 38 */                    ((Ilol1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 28 */                    ((Ilol1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ilol1I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             Exception exc = this.I00iiI;
/* 9 */             OI10i0Il oI10i0Il = this.I00iiO;
                    switch (i) {
                        case 0:
/* 71 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 73 */                    lIoii1l01l0i.I00000oOI(obj);
/* 80 */                    String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("Could not read file: ", exc.getMessage());
/* 84 */                    List list = Iloo0ilo.I00000oIO;
/* 86 */                    oI10i0Il.setValue(strI000o00OoI0I);
                            break;
                        case 1:
/* 52 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 54 */                    lIoii1l01l0i.I00000oOI(obj);
/* 61 */                    String strI000o00OoI0I2 = IIl001iO0Io.I000o00OoI0I("Could not read file: ", exc.getMessage());
/* 65 */                    List list2 = Iloo0ilo.I00000oIO;
/* 67 */                    oI10i0Il.setValue(strI000o00OoI0I2);
                            break;
                        case 2:
/* 33 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    String strI000o00OoI0I3 = IIl001iO0Io.I000o00OoI0I("Could not read file: ", exc.getMessage());
/* 46 */                    List list3 = Iloo0ilo.I00000oIO;
/* 48 */                    oI10i0Il.setValue(strI000o00OoI0I3);
                            break;
                        default:
/* 14 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
/* 23 */                    String strI000o00OoI0I4 = IIl001iO0Io.I000o00OoI0I("Could not read file: ", exc.getMessage());
/* 27 */                    List list4 = Iloo0ilo.I00000oIO;
/* 29 */                    oI10i0Il.setValue(strI000o00OoI0I4);
                            break;
                    }
/* 32 */            return ooiIlOl1iI;
                }
            }
