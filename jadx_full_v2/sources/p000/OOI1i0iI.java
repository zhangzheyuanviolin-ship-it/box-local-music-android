            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            
            public final class OOI1i0iI {
                public final Rect I00000oIO;
                public final Size I00000oOI;
                public final Size I0000Il00O;

                public OOI1i0iI(Rect rect, Size size, Size size2) {
/* 4 */             this.I00000oIO = rect;
/* 6 */             this.I00000oOI = size;
/* 8 */             this.I0000Il00O = size2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOI1i0iI)) {
/* 43 */                return false;
                    }
/* 9 */             OOI1i0iI oOI1i0iI = (OOI1i0iI) obj;
                    return this.I00000oIO.equals(oOI1i0iI.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOI1i0iI.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oOI1i0iI.I0000Il00O);
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "PreferredChildSize(cropRectBeforeScaling=" + this.I00000oIO + ", childSizeToScale=" + this.I00000oOI + ", originalSelectedChildSize=" + this.I0000Il00O + ')';
                }
            }
