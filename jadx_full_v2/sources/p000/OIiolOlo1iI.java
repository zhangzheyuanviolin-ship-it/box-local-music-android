            package p000;
            
            public final class OIiolOlo1iI extends l1lOoiII1l {
                public final OiI101I1oIi I00000oIO;
                public final I0ol0lI I00000oOI;

                public OIiolOlo1iI(OiI101I1oIi oiI101I1oIi) {
                    I0ol0lI i0ol0lII00000oIO;
/* 4 */             this.I00000oIO = oiI101I1oIi;
/* 10 */            if (lIooiiO1i.I0000Il00O(oiI101I1oIi)) {
/* 20 */                i0ol0lII00000oIO = null;
                    } else {
/* 12 */                i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 16 */                I0ol0lI.I0000Il00O(i0ol0lII00000oIO, oiI101I1oIi);
                    }
/* 21 */            this.I00000oOI = i0ol0lII00000oIO;
                }

                @Override
                public final OOo0IO I00000oIO() {
/* 3 */             OiI101I1oIi oiI101I1oIi = this.I00000oIO;
/* 13 */            return new OOo0IO(oiI101I1oIi.I00000oIO, oiI101I1oIi.I00000oOI, oiI101I1oIi.I0000Il00O, oiI101I1oIi.I0000O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
/* 6 */             if (obj instanceof OIiolOlo1iI) {
                        return this.I00000oIO.equals(((OIiolOlo1iI) obj).I00000oIO);
                    }
/* 21 */            return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
