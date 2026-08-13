            package p000;
            
            public final class O0iOioIo0l {
                public int I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0iOioIo0l)) {
/* 7 */                 return false;
                    }
/* 11 */            O0iOioIo0l o0iOioIo0l = (O0iOioIo0l) obj;
                    return this.I00000oIO == o0iOioIo0l.I00000oIO && this.I00000oOI == o0iOioIo0l.I00000oOI && this.I0000Il00O == o0iOioIo0l.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Boolean.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             int i2 = this.I00000oOI;
/* 19 */            return IIlIOloOOO.I0010o(IIl001iO0Io.I0010I0i("BidiRun(start=", i, ", end=", i2, ", isRtl="), this.I0000Il00O, ")");
                }
            }
