            package p000;
            
            public final class I1Oo0l00o extends I1Oo0lO0 {
                public OIoOo11 I00000oIO;
                public OliOlO1o1 I00000oOI;

                @Override
                public final OIoOo11 I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1Oo0l00o)) {
/* 32 */                return false;
                    }
/* 9 */             I1Oo0l00o i1Oo0l00o = (I1Oo0l00o) obj;
                    return this.I00000oIO.equals(i1Oo0l00o.I00000oIO) && this.I00000oOI.equals(i1Oo0l00o.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Success(painter=" + this.I00000oIO + ", result=" + this.I00000oOI + ')';
                }
            }
