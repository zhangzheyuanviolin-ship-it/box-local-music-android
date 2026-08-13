            package p000;

            import android.graphics.Bitmap;
            
            public final class Ili00oiIllI {
                public final String I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final float I0000O;
                public final Bitmap I0000oI00;
                public final String I0001Ioi1lo;
                public final boolean I000II;

                public Ili00oiIllI(String str, boolean z, String str2, float f, Bitmap bitmap, String str3, boolean z2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = str2;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = bitmap;
/* 14 */            this.I0001Ioi1lo = str3;
/* 16 */            this.I000II = z2;
                }

                public static Ili00oiIllI I00000oIO(Ili00oiIllI ili00oiIllI, String str, boolean z, String str2, float f, Bitmap bitmap, String str3, boolean z2, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ili00oiIllI.I00000oIO;
                    }
/* 7 */             String str4 = str;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                z = ili00oiIllI.I00000oOI;
                    }
/* 14 */            boolean z3 = z;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                str2 = ili00oiIllI.I0000Il00O;
                    }
/* 21 */            String str5 = str2;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                f = ili00oiIllI.I0000O;
                    }
/* 28 */            float f2 = f;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                bitmap = ili00oiIllI.I0000oI00;
                    }
/* 35 */            Bitmap bitmap2 = bitmap;
/* 38 */            if ((i & 32) != 0) {
/* 40 */                str3 = ili00oiIllI.I0001Ioi1lo;
                    }
/* 42 */            String str6 = str3;
/* 45 */            if ((i & 64) != 0) {
/* 47 */                z2 = ili00oiIllI.I000II;
                    }
/* 50 */            ili00oiIllI.getClass();
/* 55 */            return new Ili00oiIllI(str4, z3, str5, f2, bitmap2, str6, z2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 81 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ili00oiIllI)) {
/* 79 */                return false;
                    }
/* 9 */             Ili00oiIllI ili00oiIllI = (Ili00oiIllI) obj;
                    return this.I00000oIO.equals(ili00oiIllI.I00000oIO) && this.I00000oOI == ili00oiIllI.I00000oOI && this.I0000Il00O.equals(ili00oiIllI.I0000Il00O) && Float.compare(this.I0000O, ili00oiIllI.I0000O) == 0 && O0000Ioio00.I0000O(this.I0000oI00, ili00oiIllI.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, ili00oiIllI.I0001Ioi1lo) && this.I000II == ili00oiIllI.I000II;
                }

                public final int hashCode() {
/* 24 */            int iI0000O = OooioIOo1.I0000O(Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
/* 29 */            Bitmap bitmap = this.I0000oI00;
/* 40 */            int iHashCode = (iI0000O + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
/* 41 */            String str = this.I0001Ioi1lo;
/* 58 */            return Boolean.hashCode(this.I000II) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FluxKleinUiState(prompt=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", isGenerating=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", stage=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", progress=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", generatedBitmap=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", errorMessage=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", imageSaved=");
/* 72 */            return IIlIOloOOO.I0010o(sb, this.I000II, ")");
                }
            }
