            package p000;
            
            public final class loo10o1IolO0 {
                public final Object I00000oIO;
                public final int I00000oOI;

                public loo10o1IolO0(loOo1oOil looo1ooil, int i) {
/* 4 */             this.I00000oIO = looo1ooil;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof loo10o1IolO0)) {
/* 3 */                 return false;
                    }
/* 7 */             loo10o1IolO0 loo10o1iolo0 = (loo10o1IolO0) obj;
                    return this.I00000oIO == loo10o1iolo0.I00000oIO && this.I00000oOI == loo10o1iolo0.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.I00000oIO) * 65535) + this.I00000oOI;
                }
            }
