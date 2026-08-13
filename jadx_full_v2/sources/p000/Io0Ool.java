            package p000;

            import android.util.Log;
            
            public final class Io0Ool {
                public final String I00000oIO;
                public final String I00000oOI;

                public Io0Ool(String str, String str2) {
/* 14 */            Object[] objArr = {str, 23};
/* 23 */            if (!(str.length() <= 23)) {
/* 106 */               throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
                    }
/* 25 */            this.I00000oIO = str;
/* 37 */            this.I00000oOI = (str2 == null || str2.length() <= 0) ? null : str2;
                }

                public final void I00000oIO(String str) {
/* 8 */             if (Log.isLoggable(this.I00000oIO, 3)) {
/* 10 */                I0000O(str);
                    }
                }

                public final void I00000oOI(String str, String str2, Exception exc) {
/* 8 */             if (Log.isLoggable(this.I00000oIO, 6)) {
/* 14 */                Log.e(str, I0000O(str2), exc);
                    }
                }

                public final void I0000Il00O(String str) {
/* 8 */             if (Log.isLoggable(this.I00000oIO, 4)) {
/* 16 */                Log.i("AutoZoom", I0000O(str));
                    }
                }

                public final String I0000O(String str) {
/* 1 */             String str2 = this.I00000oOI;
                    return str2 == null ? str : str2.concat(str);
                }
            }
