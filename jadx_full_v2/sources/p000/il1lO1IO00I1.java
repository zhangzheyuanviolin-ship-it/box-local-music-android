            package p000;
            
            public final class il1lO1IO00I1 extends ilIio0I {
                public io0OIIlOli1 I00000oIO;
                public i1ll1I1llOl0 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilIio0I) {
/* 14 */                il1lO1IO00I1 il1lo1io00i1 = (il1lO1IO00I1) ((ilIio0I) obj);
/* 22 */                if (this.I00000oIO.equals(il1lo1io00i1.I00000oIO)) {
/* 24 */                    i1ll1I1llOl0 i1ll1i1llol0 = this.I00000oOI;
/* 26 */                    i1ll1I1llOl0 i1ll1i1llol02 = il1lo1io00i1.I00000oOI;
/* 28 */                    if (i1ll1i1llol0 != null ? i1ll1i1llol0 == i1ll1i1llol02 : i1ll1i1llol02 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            i1ll1I1llOl0 i1ll1i1llol0 = this.I00000oOI;
/* 22 */            return (i1ll1i1llol0 == null ? 0 : i1ll1i1llol0.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("MagicRewriteResult{results=", this.I00000oIO.toString(), ", inferenceEventTraceResult=", String.valueOf(this.I00000oOI), "}");
                }
            }
