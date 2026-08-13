            package p000;
            
            public abstract class iO1oilio0i {
                /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OOoOI1lIOi I00000oIO(O0OIoll1 o0OIoll1, boolean z, boolean z2, Boolean bool, boolean z3, OOoOIoio1i oOoOIoio1i, O1lili011o o1lili011o) {
                    OOi1111IO0 oOi1111IO0;
                    OOOi0O oOOi0O;
/* 3 */             OlI1o0ooI olI1o0ooI = (OlI1o0ooI) o0OIoll1.I0000O;
/* 5 */             OOOi0O oOOi0O2 = OOOi0O.INTERFACE;
/* 8 */             if (z) {
/* 10 */                if (bool == null) {
/* 156 */                   IOOlIIilOl0.I000O01llI0("isConst should not be null for property (container=", 41, o0OIoll1);
/* 7 */                     return null;
                        }
/* 14 */                if (o0OIoll1 instanceof OOi1111IO0) {
/* 17 */                    OOi1111IO0 oOi1111IO02 = (OOi1111IO0) o0OIoll1;
/* 21 */                    if (oOi1111IO02.I000O01llI0 == oOOi0O2) {
/* 35 */                        return l0ll0oli1l.I00000oIO(oOoOIoio1i, oOi1111IO02.I000II.I0000O(OI1Iio0ii1.I0000oI00("DefaultImpls")), o1lili011o);
                            }
                        }
/* 44 */                if (bool.booleanValue() && (o0OIoll1 instanceof OOi1I10o)) {
/* 58 */                    O0I1l1l o0I1l1l = olI1o0ooI instanceof O0I1l1l ? (O0I1l1l) olI1o0ooI : null;
/* 64 */                    O0I0oiO1I o0I0oiO1I = o0I1l1l != null ? o0I1l1l.I00iiI : null;
/* 65 */                    if (o0I0oiO1I != null) {
/* 81 */                        Ill0IO ill0IO = new Ill0IO(o0I0oiO1I.I0000O().replace('/', '.'));
/* 84 */                        Ill0IO ill0IOI00000oOI = ill0IO.I00000oOI();
/* 90 */                        OI1Iio0ii1 oI1Iio0ii1I000II = ill0IO.I00000oIO.I000II();
/* 94 */                        Ill0IO ill0IO2 = Ill0IO.I0000Il00O;
/* 100 */                       Ill0OI0lo ill0OI0lo = ililiol1o0i.I00000oIO(oI1Iio0ii1I000II).I00000oIO;
/* 102 */                       ill0OI0lo.I0000Il00O();
/* 109 */                       String strReplace = ill0OI0lo.I00000oIO.replace('.', '$');
/* 119 */                       if (!ill0IOI00000oOI.I00000oIO.I0000Il00O()) {
/* 136 */                           strReplace = ill0IOI00000oOI + '.' + strReplace;
                                }
/* 140 */                       Oi00IilOloo0 oi00IilOloo0I00000oIO = oOoOIoio1i.I00000oIO(strReplace);
/* 144 */                       if (oi00IilOloo0I00000oIO != null) {
/* 149 */                           return (OOoOI1lIOi) oi00IilOloo0I00000oIO.I00iOIl;
                                }
/* 7 */                         return null;
                            }
                        }
                    }
/* 160 */           if (z2 && (o0OIoll1 instanceof OOi1111IO0)) {
/* 167 */               OOi1111IO0 oOi1111IO03 = (OOi1111IO0) o0OIoll1;
/* 173 */               if (oOi1111IO03.I000O01llI0 == OOOi0O.COMPANION_OBJECT && (oOi1111IO0 = oOi1111IO03.I0001Ioi1lo) != null && ((oOOi0O = oOi1111IO0.I000O01llI0) == OOOi0O.CLASS || oOOi0O == OOOi0O.ENUM_CLASS || (z3 && (oOOi0O == oOOi0O2 || oOOi0O == OOOi0O.ANNOTATION_CLASS)))) {
/* 199 */                   OlI1o0ooI olI1o0ooI2 = (OlI1o0ooI) oOi1111IO0.I0000O;
/* 208 */                   O0iIIIiiO o0iIIIiiO = olI1o0ooI2 instanceof O0iIIIiiO ? (O0iIIIiiO) olI1o0ooI2 : null;
/* 209 */                   if (o0iIIIiiO != null) {
/* 211 */                       return o0iIIIiiO.I00iOIl;
                            }
                        }
                    } else if ((o0OIoll1 instanceof OOi1I10o) && (olI1o0ooI instanceof O0I1l1l)) {
/* 222 */               O0I1l1l o0I1l1l2 = (O0I1l1l) olI1o0ooI;
/* 224 */               OOoOI1lIOi oOoOI1lIOi = o0I1l1l2.I00iiO;
                        return oOoOI1lIOi == null ? l0ll0oli1l.I00000oIO(oOoOIoio1i, o0I1l1l2.I00000oIO(), o1lili011o) : oOoOI1lIOi;
                    }
/* 7 */             return null;
                }
            }
