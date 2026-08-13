            package p000;

            import android.graphics.drawable.BitmapDrawable;
            
            public final class Ii1iIolil1 {
                public BitmapDrawable I00000oIO;
                public boolean I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ii1iIolil1)) {
/* 28 */                return false;
                    }
/* 10 */            Ii1iIolil1 ii1iIolil1 = (Ii1iIolil1) obj;
                    return this.I00000oIO.equals(ii1iIolil1.I00000oIO) && this.I00000oOI == ii1iIolil1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }
