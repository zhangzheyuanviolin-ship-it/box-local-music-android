            package p000;

            import android.graphics.Bitmap;
            import java.util.Arrays;
            
            public final class OO0l00Ii10 {
                public final Bitmap I00000oIO;
                public final float[] I00000oOI;
                public final String I0000Il00O;
                public final float I0000O;

                public OO0l00Ii10(Bitmap bitmap, float[] fArr, String str, float f) {
/* 4 */             this.I00000oIO = bitmap;
/* 6 */             this.I00000oOI = fArr;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = f;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof OO0l00Ii10)) {
/* 54 */                return false;
                    }
/* 9 */             OO0l00Ii10 oO0l00Ii10 = (OO0l00Ii10) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oO0l00Ii10.I00000oIO) && this.I00000oOI.equals(oO0l00Ii10.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oO0l00Ii10.I0000Il00O) && Float.compare(this.I0000O, oO0l00Ii10.I0000O) == 0;
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (Arrays.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            String str = this.I0000Il00O;
/* 37 */            return Float.hashCode(this.I0000O) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 52 */            return "PendingFace(crop=" + this.I00000oIO + ", embedding=" + Arrays.toString(this.I00000oOI) + ", suggestedName=" + this.I0000Il00O + ", similarity=" + this.I0000O + ")";
                }
            }
