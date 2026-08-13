            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class IoiII1lloI {
                public final String I00000oIO;
                public final String I00000oOI;
                public final int I0000Il00O;
                public final float I0000O;
                public final IoiOlOo10l00 I0000oI00;
                public final boolean I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;
                public final Bitmap I000OOo1O;
                public final String I000OiO;
                public final boolean I000iOII;
                public final float I000l1;
                public final boolean I000lI;

                public IoiII1lloI(String str, String str2, int i, float f, IoiOlOo10l00 ioiOlOo10l00, boolean z, int i2, int i3, Bitmap bitmap, String str3, boolean z2, float f2, boolean z3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = ioiOlOo10l00;
/* 14 */            this.I0001Ioi1lo = z;
/* 16 */            this.I000II = i2;
/* 18 */            this.I000O01llI0 = i3;
/* 20 */            this.I000OOo1O = bitmap;
/* 22 */            this.I000OiO = str3;
/* 24 */            this.I000iOII = z2;
/* 26 */            this.I000l1 = f2;
/* 28 */            this.I000lI = z3;
                }

                public static IoiII1lloI I00000oIO(IoiII1lloI ioiII1lloI, String str, String str2, int i, float f, IoiOlOo10l00 ioiOlOo10l00, boolean z, int i2, int i3, Bitmap bitmap, String str3, boolean z2, float f2, boolean z3, int i4) {
/* 5 */             if ((i4 & 1) != 0) {
/* 7 */                 str = ioiII1lloI.I00000oIO;
                    }
/* 9 */             String str4 = str;
/* 18 */            String str5 = (i4 & 2) != 0 ? ioiII1lloI.I00000oOI : str2;
/* 28 */            int i5 = (i4 & 4) != 0 ? ioiII1lloI.I0000Il00O : i;
/* 38 */            float f3 = (i4 & 8) != 0 ? ioiII1lloI.I0000O : f;
/* 48 */            IoiOlOo10l00 ioiOlOo10l002 = (i4 & 16) != 0 ? ioiII1lloI.I0000oI00 : ioiOlOo10l00;
/* 58 */            boolean z4 = (i4 & 32) != 0 ? ioiII1lloI.I0001Ioi1lo : z;
/* 68 */            int i6 = (i4 & 64) != 0 ? ioiII1lloI.I000II : i2;
/* 78 */            int i7 = (i4 & Barcode.FORMAT_ITF) != 0 ? ioiII1lloI.I000O01llI0 : i3;
/* 88 */            Bitmap bitmap2 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? ioiII1lloI.I000OOo1O : bitmap;
/* 98 */            String str6 = (i4 & Barcode.FORMAT_UPC_A) != 0 ? ioiII1lloI.I000OiO : str3;
/* 108 */           boolean z5 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? ioiII1lloI.I000iOII : z2;
/* 118 */           float f4 = (i4 & Barcode.FORMAT_PDF417) != 0 ? ioiII1lloI.I000l1 : f2;
/* 128 */           boolean z6 = (i4 & Barcode.FORMAT_AZTEC) != 0 ? ioiII1lloI.I000lI : z3;
/* 130 */           ioiII1lloI.getClass();
/* 135 */           return new IoiII1lloI(str4, str5, i5, f3, ioiOlOo10l002, z4, i6, i7, bitmap2, str6, z5, f4, z6);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 135 */               return true;
                    }
/* 7 */             if (!(obj instanceof IoiII1lloI)) {
/* 133 */               return false;
                    }
/* 11 */            IoiII1lloI ioiII1lloI = (IoiII1lloI) obj;
                    return this.I00000oIO.equals(ioiII1lloI.I00000oIO) && this.I00000oOI.equals(ioiII1lloI.I00000oOI) && this.I0000Il00O == ioiII1lloI.I0000Il00O && Float.compare(this.I0000O, ioiII1lloI.I0000O) == 0 && O0000Ioio00.I0000O(this.I0000oI00, ioiII1lloI.I0000oI00) && this.I0001Ioi1lo == ioiII1lloI.I0001Ioi1lo && this.I000II == ioiII1lloI.I000II && this.I000O01llI0 == ioiII1lloI.I000O01llI0 && O0000Ioio00.I0000O(this.I000OOo1O, ioiII1lloI.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, ioiII1lloI.I000OiO) && this.I000iOII == ioiII1lloI.I000iOII && Float.compare(this.I000l1, ioiII1lloI.I000l1) == 0 && this.I000lI == ioiII1lloI.I000lI;
                }

                public final int hashCode() {
/* 50 */            int iI0000O = IIl001iO0Io.I0000O(this.I000O01llI0, IIl001iO0Io.I0000O(this.I000II, Oi010OO0.I000OOo1O((this.I0000oI00.hashCode() + OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000Il00O, Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31), 31, this.I0000O)) * 31, 31, this.I0001Ioi1lo), 31), 31);
/* 55 */            Bitmap bitmap = this.I000OOo1O;
/* 66 */            int iHashCode = (iI0000O + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
/* 67 */            String str = this.I000OiO;
/* 96 */            return Boolean.hashCode(this.I000lI) + OooioIOo1.I0000O(Oi010OO0.I000OOo1O((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.I000iOII), 31, this.I000l1);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ImageGenUiState(prompt=", this.I00000oIO, ", negativePrompt=", this.I00000oOI, ", steps=");
/* 17 */            sbI00111O.append(this.I0000Il00O);
/* 22 */            sbI00111O.append(", cfgScale=");
/* 27 */            sbI00111O.append(this.I0000O);
/* 32 */            sbI00111O.append(", selectedSize=");
/* 37 */            sbI00111O.append(this.I0000oI00);
/* 42 */            sbI00111O.append(", isGenerating=");
/* 47 */            sbI00111O.append(this.I0001Ioi1lo);
/* 52 */            sbI00111O.append(", progressStep=");
/* 57 */            sbI00111O.append(this.I000II);
/* 62 */            sbI00111O.append(", progressTotal=");
/* 67 */            sbI00111O.append(this.I000O01llI0);
/* 72 */            sbI00111O.append(", generatedBitmap=");
/* 77 */            sbI00111O.append(this.I000OOo1O);
/* 82 */            sbI00111O.append(", errorMessage=");
/* 87 */            sbI00111O.append(this.I000OiO);
/* 92 */            sbI00111O.append(", isImporting=");
/* 97 */            sbI00111O.append(this.I000iOII);
/* 102 */           sbI00111O.append(", importProgress=");
/* 107 */           sbI00111O.append(this.I000l1);
/* 112 */           sbI00111O.append(", imageSaved=");
/* 119 */           return IIlIOloOOO.I0010o(sbI00111O, this.I000lI, ")");
                }
            }
