            package p000;
            
            public final class IIIi0IlOOO {
                public IIIi00o I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIIi0IlOOO)) {
/* 7 */                 return false;
                    }
/* 11 */            IIIi0IlOOO iIIi0IlOOO = (IIIi0IlOOO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIIi0IlOOO.I00000oIO) && this.I00000oOI == iIIi0IlOOO.I00000oOI && this.I0000Il00O == iIIi0IlOOO.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 1 */             IIIi00o iIIi00o = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
/* 14 */            sb.append(iIIi00o);
/* 19 */            sb.append(", indentationLevel=");
/* 22 */            sb.append(i);
/* 27 */            sb.append(", start=");
/* 32 */            return IIl001iO0Io.I000lI(i2, ")", sb);
                }
            }
