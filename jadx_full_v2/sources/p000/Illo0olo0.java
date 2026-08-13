            package p000;
            
            public final class Illo0olo0 {
                public Illo0o I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof Illo0olo0)) {
/* 28 */                return false;
                    }
/* 9 */             Illo0olo0 illo0olo0 = (Illo0olo0) obj;
                    return this.I00000oIO.equals(illo0olo0.I00000oIO) && this.I00000oOI == illo0olo0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("KindWithArity(kind=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", arity=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                }
            }
