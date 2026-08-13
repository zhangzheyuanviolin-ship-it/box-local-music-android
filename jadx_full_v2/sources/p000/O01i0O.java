            package p000;
            
            public final class O01i0O implements O0O01001OOII {
                public static final O01i0O I00000oIO = new O01i0O();
                public static final OOIii1ili I00000oOI = lO1o10lllO0I.I00000oIO("kotlinx.serialization.json.JsonLiteral");

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             O01IlO o01IlOI00000oIO = l0I00OIIlII.I00000oIO(ii1iO1O);
/* 5 */             O01O0o1iI o01O0o1iII000OiO = o01IlOI00000oIO.I000OiO();
/* 11 */            if (o01O0o1iII000OiO instanceof O01i0Iiil) {
/* 66 */                return (O01i0Iiil) o01O0o1iII000OiO;
                    }
/* 65 */            throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, o01O0o1iII000OiO.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, null, o01IlOI00000oIO.I001i1lo1io().I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII000OiO.toString()).toString() : null));
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O01i0Iiil o01i0Iiil = (O01i0Iiil) obj;
/* 3 */             String str = o01i0Iiil.I00iiO;
/* 5 */             l0I00OIIlII.I00000oOI(il0I1ii);
/* 10 */            if (o01i0Iiil.I00iOIl) {
/* 12 */                il0I1ii.I001lloI(str);
/* 15 */                return;
                    }
/* 16 */            OilOloI oilOloI = o01i0Iiil.I00iiI;
/* 18 */            if (oilOloI != null) {
/* 24 */                il0I1ii.I000iOII(oilOloI).I001lloI(str);
/* 27 */                return;
                    }
/* 28 */            Long lI000o00OoI0I = OlOolloIIOl0.I000o00OoI0I(str);
/* 32 */            if (lI000o00OoI0I != null) {
/* 38 */                il0I1ii.I001l0I00(lI000o00OoI0I.longValue());
/* 41 */                return;
                    }
/* 42 */            Ooi0i1 ooi0i1I00000oOI = lOooIO1I1I.I00000oOI(str);
/* 46 */            if (ooi0i1I00000oOI != null) {
/* 56 */                il0I1ii.I000iOII(Ooi10IOl1.I00000oOI).I001l0I00(ooi0i1I00000oOI.I00iOIl);
/* 59 */                return;
                    }
/* 60 */            Double dI0001Ioi1lo = OlOoll1I0.I0001Ioi1lo(str);
/* 64 */            if (dI0001Ioi1lo != null) {
/* 70 */                il0I1ii.I0001Ioi1lo(dI0001Ioi1lo.doubleValue());
/* 73 */                return;
                    }
/* 96 */            Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
/* 97 */            if (bool != null) {
/* 103 */               il0I1ii.I000OiO(bool.booleanValue());
                    } else {
/* 107 */               il0I1ii.I001lloI(str);
                    }
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }
