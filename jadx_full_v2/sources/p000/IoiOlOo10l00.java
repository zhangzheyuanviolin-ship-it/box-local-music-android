            package p000;
            
            public final class IoiOlOo10l00 {
                public final int I00000oIO;
                public final int I00000oOI;
                public final String I0000Il00O;

                public IoiOlOo10l00(int i, int i2, String str) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof IoiOlOo10l00)) {
/* 35 */                return false;
                    }
/* 9 */             IoiOlOo10l00 ioiOlOo10l00 = (IoiOlOo10l00) obj;
                    return this.I00000oIO == ioiOlOo10l00.I00000oIO && this.I00000oOI == ioiOlOo10l00.I00000oOI && this.I0000Il00O.equals(ioiOlOo10l00.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 19 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I0010I0i("ImageSize(width=", this.I00000oIO, ", height=", this.I00000oOI, ", label="), this.I0000Il00O, ")");
                }
            }
