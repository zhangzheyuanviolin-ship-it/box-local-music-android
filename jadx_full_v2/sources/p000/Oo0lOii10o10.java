            package p000;
            
            public final class Oo0lOii10o10 {
                public final long I00000oIO;
                public final long I00000oOI;

                public Oo0lOii10o10(long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 36 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oo0lOii10o10)) {
/* 34 */                return false;
                    }
/* 9 */             Oo0lOii10o10 oo0lOii10o10 = (Oo0lOii10o10) obj;
/* 11 */            long j = oo0lOii10o10.I00000oIO;
/* 13 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && Ooi0i1.I00000oOI(this.I00000oOI, oo0lOii10o10.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 17 */            return Long.hashCode(this.I00000oOI) + (Long.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("SelectionColors(selectionHandleColor=", IOOiio0i.I000OOo1O(this.I00000oIO), ", selectionBackgroundColor=", IOOiio0i.I000OOo1O(this.I00000oOI), ")");
                }
            }
