            package p000;

            import android.graphics.Bitmap;
            import java.util.List;
            
            public final class O1o1iOlI1 {
                public final Bitmap I00000oIO;
                public final List I00000oOI;
                public final Float I0000Il00O;
                public final boolean I0000O;
                public final String I0000oI00;

                public O1o1iOlI1(Bitmap bitmap, List list, Float f, boolean z, String str) {
/* 4 */             this.I00000oIO = bitmap;
/* 6 */             this.I00000oOI = list;
/* 8 */             this.I0000Il00O = f;
/* 10 */            this.I0000O = z;
/* 12 */            this.I0000oI00 = str;
                }

                public static O1o1iOlI1 I00000oIO(O1o1iOlI1 o1o1iOlI1, Bitmap bitmap, List list, Float f, boolean z, String str, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 bitmap = o1o1iOlI1.I00000oIO;
                    }
/* 7 */             Bitmap bitmap2 = bitmap;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                list = o1o1iOlI1.I00000oOI;
                    }
/* 14 */            List list2 = list;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                f = o1o1iOlI1.I0000Il00O;
                    }
/* 21 */            Float f2 = f;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                z = o1o1iOlI1.I0000O;
                    }
/* 28 */            boolean z2 = z;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                str = o1o1iOlI1.I0000oI00;
                    }
/* 36 */            o1o1iOlI1.getClass();
/* 41 */            return new O1o1iOlI1(bitmap2, list2, f2, z2, str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1o1iOlI1)) {
/* 7 */                 return false;
                    }
/* 11 */            O1o1iOlI1 o1o1iOlI1 = (O1o1iOlI1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1o1iOlI1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1o1iOlI1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1o1iOlI1.I0000Il00O) && this.I0000O == o1o1iOlI1.I0000O && O0000Ioio00.I0000O(this.I0000oI00, o1o1iOlI1.I0000oI00);
                }

                public final int hashCode() {
/* 2 */             Bitmap bitmap = this.I00000oIO;
/* 17 */            int iI0000oI00 = IIl001iO0Io.I0000oI00((bitmap == null ? 0 : bitmap.hashCode()) * 31, 31, this.I00000oOI);
/* 21 */            Float f = this.I0000Il00O;
/* 35 */            int iI000OOo1O = Oi010OO0.I000OOo1O((iI0000oI00 + (f == null ? 0 : f.hashCode())) * 31, 31, this.I0000O);
/* 39 */            String str = this.I0000oI00;
/* 48 */            return iI000OOo1O + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MobileNetUiState(sourceBitmap=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", predictions=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", count=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", isProcessing=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", errorMessage=");
/* 52 */            return IIl001iO0Io.I00100l0(sb, this.I0000oI00, ")");
                }
            }
