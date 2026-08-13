            package p000;
            
            public final class Oo0OOliO01o {
                public static final Oo0OOliO01o I0000Il00O = new Oo0OOliO01o(lOlilO1lOIO.I0000O(0), lOlilO1lOIO.I0000O(0));
                public final long I00000oIO;
                public final long I00000oOI;

                public Oo0OOliO01o(long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo0OOliO01o)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo0OOliO01o oo0OOliO01o = (Oo0OOliO01o) obj;
                    return Oo0o1OiIo.I00000oOI(this.I00000oIO, oo0OOliO01o.I00000oIO) && Oo0o1OiIo.I00000oOI(this.I00000oOI, oo0OOliO01o.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 17 */            return Long.hashCode(this.I00000oOI) + (Long.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("TextIndent(firstLine=", Oo0o1OiIo.I0001Ioi1lo(this.I00000oIO), ", restLine=", Oo0o1OiIo.I0001Ioi1lo(this.I00000oOI), ")");
                }
            }
