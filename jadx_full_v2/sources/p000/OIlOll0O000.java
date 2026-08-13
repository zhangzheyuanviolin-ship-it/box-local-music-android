            package p000;

            import android.util.Log;
            import java.util.HashMap;
            import java.util.HashSet;
            
            public final class OIlOll0O000 extends OIlOl1I0IliO {
                public OoIllIioi1l I00l0OO0IO;
                public int[] I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public IOOI0i0Io I00lll10;
                public O1OoooIi1Ol0 I00o0iI0io1;
                public II1i0i0ilO I00o0l1o1o0;
                public HashSet I00o101lO;

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = this.I00o0iI0io1;
/* 3 */             if (o1OoooIi1Ol0 != null) {
/* 29 */                return o1OoooIi1Ol0;
                    }
/* 17 */            O1OoooIi1Ol0 o1OoooIi1Ol02 = new O1OoooIi1Ol0(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
/* 20 */            this.I00o0iI0io1 = o1OoooIi1Ol02;
/* 22 */            return o1OoooIi1Ol02;
                }

                @Override
                public final float I00000oOI(int i) {
/* 1 */             int iI0000oI00 = I0000oI00(i);
/* 5 */             OoIllIioi1l ooIllIioi1l = this.I00l0OO0IO;
/* 7 */             float fI000l1 = ooIllIioi1l.I000l1(iI0000oI00);
/* 12 */            int iI00IoiI = ooIllIioi1l.I00IoiI();
                    return iI00IoiI != 1000 ? (1000.0f / iI00IoiI) * fI000l1 : fI000l1;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00ll1;
                }

                @Override
                public final int I0000O(int i) {
                    String str;
/* 3 */             IIOo0liIi iIOo0liIi = this.I00iOIl.I00li1OI;
/* 5 */             HashMap map = iIOo0liIi.I000OiO;
/* 7 */             HashMap map2 = iIOo0liIi.I000O01llI0;
                    return (!map.isEmpty() || !iIOo0liIi.I000iOII.isEmpty() || map2.isEmpty() || (str = (String) map2.get(Integer.valueOf(i))) == null) ? iIOo0liIi.I00000oOI(i) : str.codePointAt(0);
                }

                @Override
                public final int I0000oI00(int i) {
/* 1 */             HashSet hashSet = this.I00o101lO;
/* 3 */             int[] iArr = this.I00li1OI;
/* 8 */             if (this.I00ll1) {
/* 131 */               int iI0000O = I0000O(i);
/* 135 */               if (iArr != null) {
/* 138 */                   if (iI0000O < iArr.length) {
/* 140 */                       return iArr[iI0000O];
                            }
                        } else if (iI0000O < this.I00l0OO0IO.I001l0I00()) {
/* 151 */                   return iI0000O;
                        }
                    } else {
/* 12 */                if (iArr == null || this.I00lli11) {
/* 51 */                    String strI00100l0 = this.I00iOIl.I00100l0(i);
/* 55 */                    if (strI00100l0 != null) {
/* 113 */                       if (strI00100l0.length() > 1) {
/* 117 */                           Log.w("PdfBox-Android", "Trying to map multi-byte character using 'cmap', result will be poor");
                                }
/* 126 */                       return this.I00lll10.I000II(strI00100l0.codePointAt(0));
                            }
/* 65 */                    if (!hashSet.contains(Integer.valueOf(i))) {
/* 71 */                        hashSet.add(Integer.valueOf(i));
/* 100 */                       Log.w("PdfBox-Android", "Failed to find a character mapping for " + i + " in " + I000II());
                            }
/* 103 */                   return I0000O(i);
                        }
/* 36 */                Log.w("PdfBox-Android", "Using non-embedded GIDs in font " + I000II());
/* 39 */                int iI0000O2 = I0000O(i);
/* 44 */                if (iI0000O2 < iArr.length) {
/* 46 */                    return iArr[iI0000O2];
                        }
                    }
/* 7 */             return 0;
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
                    OIloOoil011l oIloOoil011lI00000oIO;
/* 1 */             II1i0i0ilO iI1i0i0ilO = this.I00o0l1o1o0;
/* 3 */             if (iI1i0i0ilO != null) {
/* 113 */               return iI1i0i0ilO;
                    }
/* 86 */            II1i0i0ilO iI1i0i0ilOI0000Il00O = (I000OiO() == null || (oIloOoil011lI00000oIO = I000OiO().I00000oIO()) == null || (Float.compare(oIloOoil011lI00000oIO.I00000oIO(), 0.0f) == 0 && Float.compare(oIloOoil011lI00000oIO.I00000oOI(), 0.0f) == 0 && Float.compare(oIloOoil011lI00000oIO.I0000Il00O(), 0.0f) == 0 && Float.compare(oIloOoil011lI00000oIO.I0000O(), 0.0f) == 0)) ? this.I00l0OO0IO.I0000Il00O() : new II1i0i0ilO(oIloOoil011lI00000oIO.I00000oIO(), oIloOoil011lI00000oIO.I00000oOI(), oIloOoil011lI00000oIO.I0000Il00O(), oIloOoil011lI00000oIO.I0000O());
/* 90 */            this.I00o0l1o1o0 = iI1i0i0ilOI0000Il00O;
/* 92 */            return iI1i0i0ilOI0000Il00O;
                }
            }
