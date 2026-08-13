            package p000;

            import android.graphics.Bitmap;
            
            public final class OOloilI1OO {
                public Bitmap I00000oIO;
                public String I00000oOI;
                public float I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOloilI1OO)) {
/* 7 */                 return false;
                    }
/* 11 */            OOloilI1OO oOloilI1OO = (OOloilI1OO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOloilI1OO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOloilI1OO.I00000oOI) && Float.compare(this.I0000Il00O, oOloilI1OO.I0000Il00O) == 0;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 28 */            return Float.hashCode(this.I0000Il00O) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 1 */             Bitmap bitmap = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             float f = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("RecognizedFace(crop=");
/* 14 */            sb.append(bitmap);
/* 19 */            sb.append(", name=");
/* 22 */            sb.append(str);
/* 27 */            sb.append(", similarity=");
/* 32 */            return Oi010OO0.I001i1O0Ol(sb, f, ")");
                }
            }
