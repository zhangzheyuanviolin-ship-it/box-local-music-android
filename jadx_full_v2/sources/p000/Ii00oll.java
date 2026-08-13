            package p000;
            
            public final class Ii00oll extends I010I0 {
                public static final l1I0oI I00iiO = new l1I0oI(10);
                public final String I00iiI;

                public Ii00oll(String str) {
/* 3 */             super(I00iiO);
/* 6 */             this.I00iiI = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof Ii00oll) && this.I00iiI.equals(((Ii00oll) obj).I00iiI);
                }

                public final int hashCode() {
/* 3 */             return this.I00iiI.hashCode();
                }

                public final String toString() {
/* 12 */            return IlIi0I0.I000oI1ioi(new StringBuilder("CoroutineName("), this.I00iiI, ')');
                }
            }
