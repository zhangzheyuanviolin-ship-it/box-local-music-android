            package p000;
            
/* 16 */    public final class O00o0oOl1IO1 {
                public static final O00o0oOl1IO1 I0000O = new O00o0oOl1IO1(Oi01Iillli.I00iiO, 6);
                public final Oi01Iillli I00000oIO;
                public final O0iIolI I00000oOI;
                public final Oi01Iillli I0000Il00O;

                public O00o0oOl1IO1(Oi01Iillli oi01Iillli, int i) {
/* 14 */            this(oi01Iillli, (i & 2) != 0 ? new O0iIolI(1, 0, 0) : null, oi01Iillli);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00o0oOl1IO1)) {
/* 7 */                 return false;
                    }
/* 11 */            O00o0oOl1IO1 o00o0oOl1IO1 = (O00o0oOl1IO1) obj;
                    return this.I00000oIO == o00o0oOl1IO1.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o00o0oOl1IO1.I00000oOI) && this.I0000Il00O == o00o0oOl1IO1.I0000Il00O;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O0iIolI o0iIolI = this.I00000oOI;
/* 26 */            return this.I0000Il00O.hashCode() + ((iHashCode + (o0iIolI == null ? 0 : o0iIolI.I00iio)) * 31);
                }

                public final String toString() {
/* 38 */            return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.I00000oIO + ", sinceVersion=" + this.I00000oOI + ", reportLevelAfter=" + this.I0000Il00O + ')';
                }

/* 17 */        public O00o0oOl1IO1(Oi01Iillli oi01Iillli, O0iIolI o0iIolI, Oi01Iillli oi01Iillli2) {
/* 19 */            this.I00000oIO = oi01Iillli;
/* 20 */            this.I00000oOI = o0iIolI;
/* 21 */            this.I0000Il00O = oi01Iillli2;
                }
            }
