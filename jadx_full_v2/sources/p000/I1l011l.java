            package p000;
            
            public final class I1l011l {
                public I1l1llI1 I00000oIO;
                public I1l1llI1 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l011l) {
/* 10 */                I1l011l i1l011l = (I1l011l) obj;
/* 20 */                if (this.I00000oIO.equals(i1l011l.I00000oIO) && this.I00000oOI.equals(i1l011l.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "DualOutConfig{primaryOutConfig=" + this.I00000oIO + ", secondaryOutConfig=" + this.I00000oOI + "}";
                }
            }
