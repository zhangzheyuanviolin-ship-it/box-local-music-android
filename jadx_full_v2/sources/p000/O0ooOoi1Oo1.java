            package p000;
            
            public final class O0ooOoi1Oo1 extends OIIl1OIol {
                public final String I000II;
                public final String I000O01llI0;

                public O0ooOoi1Oo1(String str, String str2) {
/* 4 */             this.I000II = str;
/* 6 */             this.I000O01llI0 = str2;
                }

                @Override
                public final void I00000oIO(O1I1OO o1i1oo) {
                    o1i1oo.I00iiI++;
/* 7 */             OIIl1OIol oIIl1OIol = this.I00000oOI;
/* 9 */             while (oIIl1OIol != null) {
/* 11 */                OIIl1OIol oIIl1OIol2 = oIIl1OIol.I0000oI00;
/* 13 */                oIIl1OIol.I00000oIO(o1i1oo);
/* 16 */                oIIl1OIol = oIIl1OIol2;
                    }
                    o1i1oo.I00iiI--;
                }

                @Override
                public final String I000O01llI0() {
/* 23 */            return "destination=" + this.I000II + ", title=" + this.I000O01llI0;
                }
            }
