            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class O1loIIIOiO {
                public final Bitmap I00000oIO;
                public final Bitmap I00000oOI;
                public final int I0000Il00O;
                public final Bitmap I0000O;
                public final float I0000oI00;
                public final boolean I0001Ioi1lo;
                public final String I000II;
                public final boolean I000O01llI0;

                public O1loIIIOiO(Bitmap bitmap, Bitmap bitmap2, int i, Bitmap bitmap3, float f, boolean z, String str, boolean z2) {
/* 4 */             this.I00000oIO = bitmap;
/* 6 */             this.I00000oOI = bitmap2;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = bitmap3;
/* 12 */            this.I0000oI00 = f;
/* 14 */            this.I0001Ioi1lo = z;
/* 16 */            this.I000II = str;
/* 18 */            this.I000O01llI0 = z2;
                }

                public static O1loIIIOiO I00000oIO(O1loIIIOiO o1loIIIOiO, Bitmap bitmap, Bitmap bitmap2, int i, Bitmap bitmap3, float f, boolean z, String str, boolean z2, int i2) {
/* 5 */             if ((i2 & 1) != 0) {
/* 7 */                 bitmap = o1loIIIOiO.I00000oIO;
                    }
/* 9 */             Bitmap bitmap4 = bitmap;
/* 12 */            if ((i2 & 2) != 0) {
/* 14 */                bitmap2 = o1loIIIOiO.I00000oOI;
                    }
/* 16 */            Bitmap bitmap5 = bitmap2;
/* 19 */            if ((i2 & 4) != 0) {
/* 21 */                i = o1loIIIOiO.I0000Il00O;
                    }
/* 23 */            int i3 = i;
/* 26 */            if ((i2 & 8) != 0) {
/* 28 */                bitmap3 = o1loIIIOiO.I0000O;
                    }
/* 30 */            Bitmap bitmap6 = bitmap3;
/* 33 */            if ((i2 & 16) != 0) {
/* 35 */                f = o1loIIIOiO.I0000oI00;
                    }
/* 37 */            float f2 = f;
/* 40 */            if ((i2 & 32) != 0) {
/* 42 */                z = o1loIIIOiO.I0001Ioi1lo;
                    }
/* 44 */            boolean z3 = z;
/* 53 */            String str2 = (i2 & 64) != 0 ? o1loIIIOiO.I000II : str;
/* 63 */            boolean z4 = (i2 & Barcode.FORMAT_ITF) != 0 ? o1loIIIOiO.I000O01llI0 : z2;
/* 65 */            o1loIIIOiO.getClass();
/* 70 */            return new O1loIIIOiO(bitmap4, bitmap5, i3, bitmap6, f2, z3, str2, z4);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1loIIIOiO)) {
/* 7 */                 return false;
                    }
/* 11 */            O1loIIIOiO o1loIIIOiO = (O1loIIIOiO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1loIIIOiO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1loIIIOiO.I00000oOI) && this.I0000Il00O == o1loIIIOiO.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, o1loIIIOiO.I0000O) && Float.compare(this.I0000oI00, o1loIIIOiO.I0000oI00) == 0 && this.I0001Ioi1lo == o1loIIIOiO.I0001Ioi1lo && O0000Ioio00.I0000O(this.I000II, o1loIIIOiO.I000II) && this.I000O01llI0 == o1loIIIOiO.I000O01llI0;
                }

                public final int hashCode() {
/* 2 */             Bitmap bitmap = this.I00000oIO;
/* 14 */            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
/* 15 */            Bitmap bitmap2 = this.I00000oOI;
/* 29 */            int iI0000O = IIl001iO0Io.I0000O(this.I0000Il00O, (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31, 31);
/* 33 */            Bitmap bitmap3 = this.I0000O;
/* 53 */            int iI000OOo1O = Oi010OO0.I000OOo1O(OooioIOo1.I0000O((iI0000O + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31, 31, this.I0000oI00), 31, this.I0001Ioi1lo);
/* 57 */            String str = this.I000II;
/* 74 */            return Boolean.hashCode(this.I000O01llI0) + ((iI000OOo1O + (str != null ? str.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 88 */            return "MiGanUiState(sourceBitmap=" + this.I00000oIO + ", maskBitmap=" + this.I00000oOI + ", maskVersion=" + this.I0000Il00O + ", resultBitmap=" + this.I0000O + ", brushSize=" + this.I0000oI00 + ", isProcessing=" + this.I0001Ioi1lo + ", errorMessage=" + this.I000II + ", imageSaved=" + this.I000O01llI0 + ")";
                }
            }
