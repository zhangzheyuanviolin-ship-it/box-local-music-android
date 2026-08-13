            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class II01il0l implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public II01il0l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    IOoliil1Il iOoliil1Il;
                    O0O10O o0o10o;
                    switch (this.I00iOIl) {
                        case 0:
/* 124 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 130 */                   int iIntValue = ((Number) obj2).intValue();
/* 136 */                   II0IOO1i iI0IOO1i = (II0IOO1i) this.I00iio;
/* 140 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 144 */                   II00Ol1Ii iI00Ol1Ii = (II00Ol1Ii) this.I00iiO;
/* 146 */                   String str = iI00Ol1Ii.I00000oIO;
/* 160 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 306 */                       iloI0lOlll1.I00OilO00Il();
                            } else if (((Ol1o0O0O0) this.I00iiI).size() > 1) {
/* 175 */                       iloI0lOlll1.I00i01iIIliI(264191770);
/* 184 */                       II00Ol1Ii iI00Ol1Ii2 = ((II0I0ili0) oI10i0Il.getValue()).I00000oOI;
/* 192 */                       boolean zI0000O = O0000Ioio00.I0000O(str, iI00Ol1Ii2 != null ? iI00Ol1Ii2.I00000oIO : null);
/* 202 */                       II00Ol1Ii iI00Ol1Ii3 = ((II0I0ili0) oI10i0Il.getValue()).I00000oOI;
/* 216 */                       IOii1l iOii1l = O0000Ioio00.I0000O(str, iI00Ol1Ii3 != null ? iI00Ol1Ii3.I00000oIO : null) ? i1OOl00lO.I0001Ioi1lo : null;
/* 223 */                       O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(O1ooIo101ll.I00000oIO, 24.0f);
/* 235 */                       boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iI0IOO1i) | iloI0lOlll1.I000II(iI00Ol1Ii);
/* 236 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 240 */                       if (!zI000OOo1O) {
                                    Object obj3 = objI00O0i0ii;
/* 244 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 249 */                               I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(4);
/* 252 */                               i01illiil1Oo.I00iiO = iI0IOO1i;
/* 254 */                               i01illiil1Oo.I00iiI = iI00Ol1Ii;
/* 256 */                               VarHandle.storeStoreFence();
/* 259 */                               iloI0lOlll1.I00iio(i01illiil1Oo);
                                        obj3 = i01illiil1Oo;
                                    }
/* 285 */                           IOIIio0.I0000oI00(zI0000O, (IllOOo00lI) obj3, i1OOl00lO.I000II, o1ooiI111iI000II, false, iOii1l, null, null, null, null, null, null, null, iloI0lOlll1, 3456, 16336);
/* 290 */                           iloI0lOlll1.I0010I0i(false);
                                }
                            } else {
/* 298 */                       iloI0lOlll1.I00i01iIIliI(265340072);
/* 301 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 309 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 14 */                    ClassLoader classLoader = (ClassLoader) this.I00iiI;
/* 18 */                    OoOOoo11 ooOOoo11 = (OoOOoo11) this.I00iiO;
/* 22 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 26 */                    OOo0ooi oOo0ooi = (OOo0ooi) this.I00ilI0I1;
/* 32 */                    int iIntValue2 = ((Number) obj).intValue();
/* 38 */                    O0i0o11i o0i0o11i = (O0i0o11i) obj2;
/* 40 */                    if (illOOo00lI == null) {
/* 42 */                        iOoliil1Il = null;
                            } else {
/* 48 */                        I01iiIii10O i01iiIii10O = new I01iiIii10O(8);
/* 51 */                        i01iiIii10O.I00iiI = oOo0ooi;
/* 53 */                        VarHandle.storeStoreFence();
/* 58 */                        iOoliil1Il = new IOoliil1Il(0);
/* 61 */                        iOoliil1Il.I00iiO = i01iiIii10O;
/* 63 */                        iOoliil1Il.I00iiI = iIntValue2;
/* 65 */                        VarHandle.storeStoreFence();
                            }
/* 74 */                    if (o0i0o11i.equals(O0i0o11i.I0000Il00O)) {
/* 76 */                        return O0O0o1io.I0000Il00O;
                            }
/* 81 */                    O0i0ol1o o0i0ol1o = o0i0o11i.I00000oIO;
/* 83 */                    if (o0i0ol1o != null) {
/* 85 */                        int iOrdinal = o0i0ol1o.ordinal();
/* 89 */                        if (iOrdinal == 0) {
/* 105 */                           o0o10o = O0O10O.I00iOIl;
                                } else if (iOrdinal == 1) {
/* 102 */                           o0o10o = O0O10O.I00iiI;
                                } else {
/* 93 */                            if (iOrdinal != 2) {
/* 98 */                                I000II.I00000oIO();
/* 8 */                                 return null;
                                    }
/* 95 */                            o0o10o = O0O10O.I00iiO;
                                }
                            } else {
/* 108 */                       o0o10o = null;
                            }
/* 109 */                   O0i0iioIlO o0i0iioIlO = o0i0o11i.I00000oOI;
/* 117 */                   return new O0O0o1io(o0o10o, o0i0iioIlO != null ? iioOllll1.I0000oI00(o0i0iioIlO, classLoader, ooOOoo11, iOoliil1Il) : null);
                    }
                }
            }
