            package p000;

            import java.util.LinkedHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Il0iiiII11 {
                public static final OoIoOiiO1 I00000oIO = Ooo0ii.I00000oIO(I10i1IOOol.I00l0OO0IO, I10i1IOOol.I00li1OI);
                public static final OlIOiI1iI1 I00000oOI = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
                public static final OlIOiI1iI1 I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
                public static final OlIOiI1iI1 I0000O;
                public static final OlIOiI1iI1 I0000oI00;

                static {
/* 28 */            OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 44 */            I0000O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1);
/* 54 */            I0000oI00 = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
                }

                public static final void I00000oIO(OoI1iOl0IoI ooI1iOl0IoI, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1186853286);
/* 28 */            int i2 = (iloI0lOlll1.I000II(ooI1iOl0IoI) ? 4 : 2) | i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16);
/* 34 */            int i3 = 0;
/* 45 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 47 */                OIooliIO0 oIooliIO0 = ooI1iOl0IoI.I0000oI00;
/* 49 */                OIooliIO0 oIooliIO02 = ooI1iOl0IoI.I0000O;
/* 59 */                boolean z = oIooliIO0.getValue() != null;
/* 74 */                if (O0000Ioio00.I0000O(ooI1iOl0IoI.I00000oIO.I00olI(), oIooliIO02.getValue()) && !z) {
/* 78 */                    illOOo00lI.invoke();
                        }
/* 81 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 85 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj = objI00O0i0ii;
/* 87 */                if (objI00O0i0ii == iOO0o0I1l) {
/* 89 */                    boolean[] zArr = {z};
/* 93 */                    iloI0lOlll1.I00iio(zArr);
                            obj = zArr;
                        }
/* 96 */                boolean[] zArr2 = (boolean[]) obj;
/* 98 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 102 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 104 */                   objI00O0i0ii2 = new Object[1];
/* 106 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 109 */               Object[] objArr = (Object[]) objI00O0i0ii2;
/* 121 */               if (!O0000Ioio00.I0000O(objArr[0], oIooliIO02.getValue())) {
/* 123 */                   if (!z && !zArr2[0]) {
/* 129 */                       illOOo00lI.invoke();
                            }
/* 136 */                   objArr[0] = oIooliIO02.getValue();
                        }
/* 138 */               zArr2[0] = z;
                    } else {
/* 141 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 144 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 148 */           if (oOloioIlI001IO000 != null) {
/* 155 */               oOloioIlI001IO000.I0000O = new Il0i0OiIol(ooI1iOl0IoI, illOOo00lI, i, i3);
                    }
                }

                public static Il0l0iooI I00000oOI(IlIoO1ilo1 ilIoO1ilo1, II0IlloOiO0i iI0IlloOiO0i, int i) {
/* 1 */             II0IlloOiO0i iI0IlloOiO0i2 = i1O01oOIoI0I.I00o101lO;
/* 5 */             int i2 = 1;
/* 6 */             if ((i & 1) != 0) {
/* 8 */                 OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 22 */                ilIoO1ilo1 = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
                    }
/* 28 */            if ((i & 2) != 0) {
/* 30 */                iI0IlloOiO0i = iI0IlloOiO0i2;
                    }
/* 60 */            return I0000Il00O(ilIoO1ilo1, O0000Ioio00.I0000O(iI0IlloOiO0i, i1O01oOIoI0I.I00o0iI0io1) ? i1O01oOIoI0I.I00ilO0 : O0000Ioio00.I0000O(iI0IlloOiO0i, iI0IlloOiO0i2) ? i1O01oOIoI0I.I00ioIO : i1O01oOIoI0I.I00io1l, new I10i1IOOol(i2, 18));
                }

                public static final Il0l0iooI I0000Il00O(IlIoO1ilo1 ilIoO1ilo1, I0iolI1I11l1 i0iolI1I11l1, Function1 function1) {
/* 20 */            return new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, (Ol0oo1IioO) null, new IO100o1(i0iolI1I11l1, function1, ilIoO1ilo1, true), (OiO0oIloO1oI) null, (LinkedHashMap) null, 123));
                }

                public static Il0l0iooI I0000O() {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 15 */            int i = 1;
/* 16 */            OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
/* 20 */            II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lll10;
/* 51 */            return I0000Il00O(olIOiI1iI1I0000Il00O, iI0O000iIl.equals(i1O01oOIoI0I.I00ll1) ? i1O01oOIoI0I.I00iio : iI0O000iIl.equals(iI0O000iIl) ? i1O01oOIoI0I.I00l0OO0IO : i1O01oOIoI0I.I00io1l, new I10i1IOOol(i, 19));
                }

                public static Il0l0iooI I0000oI00(IlIoO1ilo1 ilIoO1ilo1, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 10 */                ilIoO1ilo1 = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
                    }
/* 32 */            return new Il0l0iooI(new OoI1iOioli(new IlI1o11l0(0.0f, ilIoO1ilo1), (Ol0oo1IioO) null, (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 126));
                }

                public static Il1OOloOIl1 I0001Ioi1lo(IlIoO1ilo1 ilIoO1ilo1, int i) {
/* 4 */             if ((i & 1) != 0) {
/* 10 */                ilIoO1ilo1 = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
                    }
/* 32 */            return new Il1OOloOIl1(new OoI1iOioli(new IlI1o11l0(0.0f, ilIoO1ilo1), (Ol0oo1IioO) null, (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 126));
                }

                public static Il0l0iooI I000II(OoIoO0I0oOI ooIoO0I0oOI, float f, int i) {
                    IlIoO1ilo1 ilIoO1ilo1I0000Il00O = ooIoO0I0oOI;
/* 4 */             if ((i & 1) != 0) {
/* 10 */                ilIoO1ilo1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
                    }
/* 16 */            if ((i & 2) != 0) {
/* 18 */                f = 0.0f;
                    }
/* 39 */            return new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, (Ol0oo1IioO) null, (IO100o1) null, new OiO0oIloO1oI(f, OoI0l01O.I00000oOI, ilIoO1ilo1I0000Il00O), (LinkedHashMap) null, 119));
                }

                public static Il1OOloOIl1 I000O01llI0(int i, float f) {
/* 6 */             OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
/* 12 */            if ((i & 2) != 0) {
/* 14 */                f = 0.0f;
                    }
/* 35 */            return new Il1OOloOIl1(new OoI1iOioli((IlI1o11l0) null, (Ol0oo1IioO) null, (IO100o1) null, new OiO0oIloO1oI(f, OoI0l01O.I00000oOI, olIOiI1iI1I0000Il00O), (LinkedHashMap) null, 119));
                }

                public static Il1OOloOIl1 I000OOo1O(IlIoO1ilo1 ilIoO1ilo1, II0IlloOiO0i iI0IlloOiO0i, int i) {
/* 1 */             II0IlloOiO0i iI0IlloOiO0i2 = i1O01oOIoI0I.I00o101lO;
/* 5 */             int i2 = 1;
/* 6 */             if ((i & 1) != 0) {
/* 8 */                 OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 22 */                ilIoO1ilo1 = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
                    }
/* 28 */            if ((i & 2) != 0) {
/* 30 */                iI0IlloOiO0i = iI0IlloOiO0i2;
                    }
/* 60 */            return I000OiO(ilIoO1ilo1, O0000Ioio00.I0000O(iI0IlloOiO0i, i1O01oOIoI0I.I00o0iI0io1) ? i1O01oOIoI0I.I00ilO0 : O0000Ioio00.I0000O(iI0IlloOiO0i, iI0IlloOiO0i2) ? i1O01oOIoI0I.I00ioIO : i1O01oOIoI0I.I00io1l, new I10i1IOOol(i2, 20));
                }

                public static final Il1OOloOIl1 I000OiO(IlIoO1ilo1 ilIoO1ilo1, I0iolI1I11l1 i0iolI1I11l1, Function1 function1) {
/* 20 */            return new Il1OOloOIl1(new OoI1iOioli((IlI1o11l0) null, (Ol0oo1IioO) null, new IO100o1(i0iolI1I11l1, function1, ilIoO1ilo1, true), (OiO0oIloO1oI) null, (LinkedHashMap) null, 123));
                }

                public static Il1OOloOIl1 I000iOII() {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 15 */            int i = 1;
/* 16 */            OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
/* 20 */            II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lll10;
/* 51 */            return I000OiO(olIOiI1iI1I0000Il00O, iI0O000iIl.equals(i1O01oOIoI0I.I00ll1) ? i1O01oOIoI0I.I00iio : iI0O000iIl.equals(iI0O000iIl) ? i1O01oOIoI0I.I00l0OO0IO : i1O01oOIoI0I.I00io1l, new I10i1IOOol(i, 21));
                }

                public static Il0l0iooI I000l1(Function1 function1) {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 44 */            return new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, new Ol0oo1IioO(new Il0iOO1l101(0, function1), iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1)), (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 125));
                }

                public static Il0l0iooI I000lI(int i, Function1 function1) {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 16 */            OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1);
/* 22 */            if ((i & 2) != 0) {
/* 24 */                function1 = I10i1IOOol.I00lli11;
                    }
/* 49 */            return new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, new Ol0oo1IioO(new Il0iOO1l101(1, function1), olIOiI1iI1I0000Il00O), (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 125));
                }

                public static Il1OOloOIl1 I000o00OoI0I(Function1 function1) {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 44 */            return new Il1OOloOIl1(new OoI1iOioli((IlI1o11l0) null, new Ol0oo1IioO(new Il0iOO1l101(2, function1), iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1)), (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 125));
                }

                public static Il1OOloOIl1 I000oI1ioi(int i, Function1 function1) {
/* 1 */             OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 16 */            OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1);
/* 22 */            if ((i & 2) != 0) {
/* 24 */                function1 = I10i1IOOol.I00lll10;
                    }
/* 50 */            return new Il1OOloOIl1(new OoI1iOioli((IlI1o11l0) null, new Ol0oo1IioO(new Il0iOO1l101(3, function1), olIOiI1iI1I0000Il00O), (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 125));
                }
            }
