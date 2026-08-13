            package p000;
            
            public final class Oi10OoO0l {
                public final int I00000oIO;
                public final I0oIl0101 I00000oOI;

                public Oi10OoO0l(int i, I0oIl0101 i0oIl0101) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i0oIl0101;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oi10OoO0l)) {
/* 30 */                return false;
                    }
/* 9 */             Oi10OoO0l oi10OoO0l = (Oi10OoO0l) obj;
                    return this.I00000oIO == oi10OoO0l.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oi10OoO0l.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.I00000oIO) * 31;
/* 9 */             I0oIl0101 i0oIl0101 = this.I00000oOI;
/* 19 */            return iHashCode + (i0oIl0101 == null ? 0 : i0oIl0101.hashCode());
                }

                public final String toString() {
/* 45 */            return "Result3A(status=" + ((Object) ("Status(value=" + this.I00000oIO + ')')) + ", frameMetadata=" + this.I00000oOI + ')';
                }
            }
