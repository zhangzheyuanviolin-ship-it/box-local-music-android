            package p000;
            
            public final class il1li0 extends ilIio11 {
                public io0OO101I I00000oIO;
                public i1llOOiillll I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilIio11) {
/* 14 */                il1li0 il1li0Var = (il1li0) ((ilIio11) obj);
/* 22 */                if (this.I00000oIO.equals(il1li0Var.I00000oIO)) {
/* 24 */                    i1llOOiillll i1llooiillll = this.I00000oOI;
/* 26 */                    i1llOOiillll i1llooiillll2 = il1li0Var.I00000oOI;
/* 28 */                    if (i1llooiillll != null ? i1llooiillll == i1llooiillll2 : i1llooiillll2 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            i1llOOiillll i1llooiillll = this.I00000oOI;
/* 22 */            return (i1llooiillll == null ? 0 : i1llooiillll.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("MagicRewriteResult{results=", this.I00000oIO.toString(), ", inferenceEventTraceResult=", String.valueOf(this.I00000oOI), "}");
                }
            }
