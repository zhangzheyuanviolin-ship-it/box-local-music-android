            package p000;

            import android.graphics.Bitmap;
            import java.util.Map;
            
            public final class O1il0O00 {
                public final Bitmap I00000oIO;
                public final Map I00000oOI;

                public O1il0O00(Bitmap bitmap, Map map) {
/* 4 */             this.I00000oIO = bitmap;
/* 6 */             this.I00000oOI = map;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1il0O00)) {
/* 32 */                return false;
                    }
/* 8 */             O1il0O00 o1il0O00 = (O1il0O00) obj;
                    return this.I00000oIO.equals(o1il0O00.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1il0O00.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Value(bitmap=" + this.I00000oIO + ", extras=" + this.I00000oOI + ')';
                }
            }
