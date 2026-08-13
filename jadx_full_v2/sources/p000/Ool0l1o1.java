            package p000;

            import android.graphics.Bitmap;
            
            public final class Ool0l1o1 {
                public final Bitmap I00000oIO;
                public final Bitmap I00000oOI;
                public final boolean I0000Il00O;
                public final float I0000O;
                public final boolean I0000oI00;
                public final boolean I0001Ioi1lo;
                public final String I000II;

                public Ool0l1o1(Bitmap bitmap, Bitmap bitmap2, boolean z, float f, boolean z2, boolean z3, String str) {
/* 4 */             this.I00000oIO = bitmap;
/* 6 */             this.I00000oOI = bitmap2;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = z2;
/* 14 */            this.I0001Ioi1lo = z3;
/* 16 */            this.I000II = str;
                }

                public static Ool0l1o1 I00000oIO(Ool0l1o1 ool0l1o1, Bitmap bitmap, Bitmap bitmap2, boolean z, float f, boolean z2, boolean z3, String str, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 bitmap = ool0l1o1.I00000oIO;
                    }
/* 7 */             Bitmap bitmap3 = bitmap;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                bitmap2 = ool0l1o1.I00000oOI;
                    }
/* 14 */            Bitmap bitmap4 = bitmap2;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                z = ool0l1o1.I0000Il00O;
                    }
/* 21 */            boolean z4 = z;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                f = ool0l1o1.I0000O;
                    }
/* 28 */            float f2 = f;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                z2 = ool0l1o1.I0000oI00;
                    }
/* 35 */            boolean z5 = z2;
/* 38 */            if ((i & 32) != 0) {
/* 40 */                z3 = ool0l1o1.I0001Ioi1lo;
                    }
/* 42 */            boolean z6 = z3;
/* 45 */            if ((i & 64) != 0) {
/* 47 */                str = ool0l1o1.I000II;
                    }
/* 50 */            ool0l1o1.getClass();
/* 55 */            return new Ool0l1o1(bitmap3, bitmap4, z4, f2, z5, z6, str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ool0l1o1)) {
/* 7 */                 return false;
                    }
/* 11 */            Ool0l1o1 ool0l1o1 = (Ool0l1o1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ool0l1o1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ool0l1o1.I00000oOI) && this.I0000Il00O == ool0l1o1.I0000Il00O && Float.compare(this.I0000O, ool0l1o1.I0000O) == 0 && this.I0000oI00 == ool0l1o1.I0000oI00 && this.I0001Ioi1lo == ool0l1o1.I0001Ioi1lo && O0000Ioio00.I0000O(this.I000II, ool0l1o1.I000II);
                }

                public final int hashCode() {
/* 2 */             Bitmap bitmap = this.I00000oIO;
/* 14 */            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
/* 15 */            Bitmap bitmap2 = this.I00000oOI;
/* 47 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(OooioIOo1.I0000O(Oi010OO0.I000OOo1O((iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31, 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo);
/* 51 */            String str = this.I000II;
/* 60 */            return iI000OOo1O + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UpscaleUiState(sourceBitmap=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", resultBitmap=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", isProcessing=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", progress=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", isSaving=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", imageSaved=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", errorMessage=");
/* 72 */            return IIl001iO0Io.I00100l0(sb, this.I000II, ")");
                }
            }
