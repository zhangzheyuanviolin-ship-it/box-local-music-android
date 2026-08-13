            package p000;

            import java.util.List;
            
            public final class Ilol0ooO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final OI10i0Il I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ilol0ooO(String str, String str2, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
/* 5 */             this.I00iiO = str2;
/* 7 */             this.I00iio = oI10i0Il;
/* 9 */             this.I00ilI0I1 = oI10i0Il2;
/* 11 */            this.I00ilO0 = oI10i0Il3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 74 */                    return new Ilol0ooO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 0);
                        case 1:
/* 56 */                    return new Ilol0ooO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 1);
                        case 2:
/* 38 */                    return new Ilol0ooO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 2);
                        default:
/* 20 */                    return new Ilol0ooO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 3);
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
/* 48 */                    ((Ilol0ooO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 38 */                    ((Ilol0ooO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 28 */                    ((Ilol0ooO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ilol0ooO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             OI10i0Il oI10i0Il = this.I00ilO0;
/* 11 */            OI10i0Il oI10i0Il2 = this.I00ilI0I1;
/* 15 */            String str = this.I00iiI;
/* 17 */            OI10i0Il oI10i0Il3 = this.I00iio;
/* 19 */            String str2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 125 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 127 */                   lIoii1l01l0i.I00000oOI(obj);
/* 134 */                   if (!OlOoOIi0o.I001l0I00(str)) {
/* 146 */                       List list = Iloo0ilo.I00000oIO;
/* 158 */                       if (!OlOoOIi0o.I001l0I00((String) oI10i0Il2.getValue())) {
/* 183 */                           str = ((String) oI10i0Il2.getValue()) + "\n\n" + str;
                                }
/* 187 */                       oI10i0Il2.setValue(str);
/* 190 */                       oI10i0Il.setValue(str2);
/* 193 */                       oI10i0Il3.setValue("");
                                break;
                            } else {
/* 136 */                       String strI000lI = IlIi0I0.I000lI("No text found in \"", str2, "\".");
/* 140 */                       List list2 = Iloo0ilo.I00000oIO;
/* 142 */                       oI10i0Il3.setValue(strI000lI);
                                break;
                            }
                        case 1:
/* 92 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 94 */                    lIoii1l01l0i.I00000oOI(obj);
/* 101 */                   if (!OlOoOIi0o.I001l0I00(str)) {
/* 113 */                       List list3 = Iloo0ilo.I00000oIO;
/* 115 */                       oI10i0Il2.setValue(str);
/* 118 */                       oI10i0Il.setValue(str2);
/* 121 */                       oI10i0Il3.setValue("");
                                break;
                            } else {
/* 103 */                       String strI000lI2 = IlIi0I0.I000lI("No text found in \"", str2, "\".");
/* 107 */                       List list4 = Iloo0ilo.I00000oIO;
/* 109 */                       oI10i0Il3.setValue(strI000lI2);
                                break;
                            }
                        case 2:
/* 59 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 61 */                    lIoii1l01l0i.I00000oOI(obj);
/* 68 */                    if (!OlOoOIi0o.I001l0I00(str)) {
/* 80 */                        List list5 = Iloo0ilo.I00000oIO;
/* 82 */                        oI10i0Il2.setValue(str);
/* 85 */                        oI10i0Il.setValue(str2);
/* 88 */                        oI10i0Il3.setValue("");
                                break;
                            } else {
/* 70 */                        String strI000lI3 = IlIi0I0.I000lI("No text found in \"", str2, "\".");
/* 74 */                        List list6 = Iloo0ilo.I00000oIO;
/* 76 */                        oI10i0Il3.setValue(strI000lI3);
                                break;
                            }
                        default:
/* 24 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 26 */                    lIoii1l01l0i.I00000oOI(obj);
/* 33 */                    if (!OlOoOIi0o.I001l0I00(str)) {
/* 47 */                        List list7 = Iloo0ilo.I00000oIO;
/* 49 */                        oI10i0Il2.setValue(str);
/* 52 */                        oI10i0Il.setValue(str2);
/* 55 */                        oI10i0Il3.setValue("");
                                break;
                            } else {
/* 37 */                        String strI000lI4 = IlIi0I0.I000lI("No text found in \"", str2, "\". Try a text-based PDF or .txt file.");
/* 41 */                        List list8 = Iloo0ilo.I00000oIO;
/* 43 */                        oI10i0Il3.setValue(strI000lI4);
                                break;
                            }
                    }
/* 58 */            return ooiIlOl1iI;
                }
            }
