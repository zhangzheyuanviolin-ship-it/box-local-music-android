            package p000;

            import android.graphics.Rect;
            
            public final class O110oiIo00 {
                public Rect I00000oIO;
                public String I00000oOI;
                public float I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O110oiIo00)) {
/* 7 */                 return false;
                    }
/* 11 */            O110oiIo00 o110oiIo00 = (O110oiIo00) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o110oiIo00.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o110oiIo00.I00000oOI) && Float.compare(this.I0000Il00O, o110oiIo00.I0000Il00O) == 0;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 28 */            return Float.hashCode(this.I0000Il00O) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 1 */             Rect rect = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             float f = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("LiveFace(box=");
/* 14 */            sb.append(rect);
/* 19 */            sb.append(", name=");
/* 22 */            sb.append(str);
/* 27 */            sb.append(", similarity=");
/* 32 */            return Oi010OO0.I001i1O0Ol(sb, f, ")");
                }
            }
