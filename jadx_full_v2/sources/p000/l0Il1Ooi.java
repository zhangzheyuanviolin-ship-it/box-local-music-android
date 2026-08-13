            package p000;
            
            public final class l0Il1Ooi {
                public lOI1lll1l10 I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof l0Il1Ooi) {
/* 15 */                return this.I00000oIO.equals(((l0Il1Ooi) obj).I00000oIO);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 34), "CitationMetadata{citationSources=", string, "}");
                }
            }
