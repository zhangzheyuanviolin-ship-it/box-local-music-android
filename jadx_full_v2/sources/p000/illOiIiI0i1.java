            package p000;
            
            public final class illOiIiI0i1 {
                public lOI1lll1l10 I00000oIO;
                public iiOi1illIO1o I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof illOiIiI0i1) {
/* 10 */                illOiIiI0i1 illoiiii0i1 = (illOiIiI0i1) obj;
/* 20 */                if (this.I00000oIO.equals(illoiiii0i1.I00000oIO)) {
/* 22 */                    iiOi1illIO1o iioi1illio1o = illoiiii0i1.I00000oOI;
/* 24 */                    iiOi1illIO1o iioi1illio1o2 = this.I00000oOI;
/* 26 */                    if (iioi1illio1o2 != null ? iioi1illio1o2 == iioi1illio1o : iioi1illio1o == null) {
/* 38 */                        if (this.I0000Il00O == illoiiii0i1.I0000Il00O) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            iiOi1illIO1o iioi1illio1o = this.I00000oOI;
/* 26 */            return this.I0000Il00O ^ (((iHashCode * 1000003) ^ (iioi1illio1o == null ? 0 : iioi1illio1o.hashCode())) * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String strValueOf = String.valueOf(this.I00000oOI);
/* 17 */            int length2 = strValueOf.length();
/* 21 */            int i = this.I0000Il00O;
/* 41 */            StringBuilder sb = new StringBuilder(length + 50 + length2 + 14 + String.valueOf(i).length() + 1);
/* 48 */            IIl001iO0Io.I001lIiIIo1O(sb, "CortanaResult{results=", string, ", inferenceEventTraceResult=", strValueOf);
/* 55 */            return IIlIOloOOO.I00100o1O0lo(sb, ", tokenOffset=", i, "}");
                }
            }
