            package p000;

            import android.graphics.Bitmap;
            
            public final class OlIiOi0Oo {
                public final int I00000oIO;
                public final int I00000oOI;
                public final Bitmap I0000Il00O;

                public OlIiOi0Oo(int i, int i2, Bitmap bitmap) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = bitmap;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OlIiOi0Oo)) {
/* 7 */                 return false;
                    }
/* 11 */            OlIiOi0Oo olIiOi0Oo = (OlIiOi0Oo) obj;
                    return this.I00000oIO == olIiOi0Oo.I00000oIO && this.I00000oOI == olIiOi0Oo.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, olIiOi0Oo.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI0000O = IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
/* 16 */            Bitmap bitmap = this.I0000Il00O;
/* 26 */            return iI0000O + (bitmap == null ? 0 : bitmap.hashCode());
                }

                public final String toString() {
/* 11 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("GenerationProgress(step=", this.I00000oIO, ", totalSteps=", this.I00000oOI, ", bitmap=");
/* 17 */            sbI0010I0i.append(this.I0000Il00O);
/* 22 */            sbI0010I0i.append(")");
/* 25 */            return sbI0010I0i.toString();
                }
            }
