            package p000;
            
            public abstract class I01IoO implements O0O01001OOII {
                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             OilOloI oilOloII0000O = I0000O();
/* 5 */             IOl1ii1loO iOl1ii1loOI00000oOI = ii1iO1O.I00000oOI(oilOloII0000O);
/* 10 */            Object objI00100o1O0lo = null;
/* 11 */            String strI000l1 = null;
                    while (true) {
/* 16 */                int iI000II = iOl1ii1loOI00000oOI.I000II(I0000O());
/* 21 */                if (iI000II == -1) {
/* 90 */                    if (objI00100o1O0lo != null) {
/* 92 */                        iOl1ii1loOI00000oOI.I000oI1ioi(oilOloII0000O);
/* 95 */                        return objI00100o1O0lo;
                            }
/* 102 */                   I000II.I0010I0i(IIl001iO0Io.I000o00OoI0I("Polymorphic value has not been read for class ", strI000l1));
/* 9 */                     return null;
                        }
/* 23 */                if (iI000II == 0) {
/* 85 */                    strI000l1 = iOl1ii1loOI00000oOI.I000l1(I0000O(), iI000II);
                        } else {
/* 26 */                    if (iI000II != 1) {
/* 34 */                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
/* 37 */                        if (strI000l1 == null) {
/* 39 */                            strI000l1 = "unknown class";
                                }
/* 41 */                        sb.append(strI000l1);
/* 46 */                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
/* 49 */                        sb.append(iI000II);
/* 59 */                        throw new Oili1O(sb.toString());
                            }
/* 60 */                    if (strI000l1 == null) {
/* 77 */                        I000II.I000iOII("Cannot read polymorphic value before its type token");
/* 9 */                         return null;
                            }
/* 70 */                    objI00100o1O0lo = iOl1ii1loOI00000oOI.I00100o1O0lo(I0000O(), iI000II, lI1o0lI.I00000oIO(this, iOl1ii1loOI00000oOI, strI000l1), null);
                        }
                    }
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 1 */             O0O01001OOII o0o01001ooiiI00000oOI = lI1o0lI.I00000oOI(this, il0I1ii, obj);
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(I0000O());
/* 26 */            iOl1l0o0i1I0I00000oOI.I001IO000(I0000O(), 0, o0o01001ooiiI00000oOI.I0000O().I00000oIO());
/* 34 */            iOl1l0o0i1I0I00000oOI.I000l1(I0000O(), 1, o0o01001ooiiI00000oOI, obj);
/* 37 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                public O0O01001OOII I0000oI00(IOl1ii1loO iOl1ii1loO, String str) {
/* 5 */             iOl1ii1loO.I00000oIO().getClass();
/* 10 */            OoOOI1100oI0.I0000O(1, null);
/* 8 */             return null;
                }

                public O0O01001OOII I0001Ioi1lo(Il0I1ii il0I1ii, Object obj) {
/* 9 */             il0I1ii.I00000oIO().I000oI1ioi(I000II(), obj);
/* 12 */            return null;
                }

                public abstract O0IOli0o0 I000II();
            }
