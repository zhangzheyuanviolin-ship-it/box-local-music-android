            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class lO100liolI1 {
                public static final void I00000oIO(Oil000 oil000, int i, OiOi10iii01 oiOi10iii01) {
                    Oil000 oil0002;
/* 7 */             OI110O0 oi110o0 = new OI110O0(new Oil000[16]);
/* 11 */            List listI000OOo1O = oil000.I000OOo1O(false, false);
                    while (true) {
/* 17 */                oi110o0.I0000O(oi110o0.I00iiO, listI000OOo1O);
                        while (true) {
/* 20 */                    int i2 = oi110o0.I00iiO;
/* 22 */                    if (i2 == 0) {
/* 408 */                       return;
                            }
/* 30 */                    oil0002 = (Oil000) oi110o0.I000l1(i2 - 1);
/* 32 */                    boolean zI0000oI00 = iO0o00ili.I0000oI00(oil0002);
/* 36 */                    OiioiIIlooo oiioiIIlooo = oil0002.I0000O;
/* 38 */                    OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 40 */                    if (!zI0000oI00 && !oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I000OiO)) {
/* 51 */                        OIIlIII0Ili oIIlIII0IliI0000O = oil0002.I0000O();
/* 55 */                        if (oIIlIII0IliI0000O == null) {
/* 163 */                           throw IIlIOloOOO.I000OOo1O("Expected semantics node to have a coordinator.");
                                }
/* 62 */                        IooO1IOlo iooO1IOloI00000oOI = ioooOioll1.I00000oOI(l0o0IlOil1.I00000oOI(oIIlIII0IliI0000O, true));
/* 70 */                        if (iooO1IOloI00000oOI.I00000oIO < iooO1IOloI00000oOI.I0000Il00O && iooO1IOloI00000oOI.I00000oOI < iooO1IOloI00000oOI.I0000O) {
/* 83 */                            Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oiioi1IoIIli.I0000oI00);
/* 88 */                            if (objI000II == null) {
/* 90 */                                objI000II = null;
                                    }
/* 91 */                            IlliIl1l11O illiIl1l11O = (IlliIl1l11O) objI000II;
/* 95 */                            Object objI000II2 = oI10I1IoI0Ol.I000II(Oil0I1O.I001i1O0Ol);
/* 103 */                           OiOi0l oiOi0l = (OiOi0l) (objI000II2 != null ? objI000II2 : null);
/* 105 */                           if (illiIl1l11O == null || oiOi0l == null || ((Number) oiOi0l.I00000oOI.invoke()).floatValue() <= 0.0f) {
                                        break;
                                    }
/* 126 */                           int i3 = 1 + i;
/* 129 */                           OiOi1iI1oi oiOi1iI1oi = new OiOi1iI1oi();
/* 132 */                           oiOi1iI1oi.I00000oIO = oil0002;
/* 134 */                           oiOi1iI1oi.I00000oOI = i3;
/* 136 */                           oiOi1iI1oi.I0000Il00O = iooO1IOloI00000oOI;
/* 138 */                           oiOi1iI1oi.I0000O = oIIlIII0IliI0000O;
/* 140 */                           VarHandle.storeStoreFence();
/* 143 */                           oiOi10iii01.invoke(oiOi1iI1oi);
/* 146 */                           I00000oIO(oil0002, i3, oiOi10iii01);
                                }
                            }
                        }
/* 151 */               listI000OOo1O = oil0002.I000OOo1O(false, false);
                    }
                }
            }
