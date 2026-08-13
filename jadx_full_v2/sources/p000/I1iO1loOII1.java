            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            import java.util.Map;
            
            public final class I1iO1loOII1 {
                public final I1iIll0i I00000oIO;
                public final int I00000oOI;
                public final I1iIioiI0 I0000Il00O;
                public final int I0000O;
                public final String I0000oI00;
                public final String I0001Ioi1lo;
                public final List I000II;
                public final Map I000O01llI0;
                public final Iii0ool1Io0 I000OOo1O;
                public final float I000OiO;
                public final String I000iOII;
                public final String I000l1;

                public I1iO1loOII1(I1iIll0i i1iIll0i, int i, I1iIioiI0 i1iIioiI0, int i2, String str, String str2, List list, Map map, Iii0ool1Io0 iii0ool1Io0, float f, String str3, String str4) {
/* 4 */             this.I00000oIO = i1iIll0i;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i1iIioiI0;
/* 10 */            this.I0000O = i2;
/* 12 */            this.I0000oI00 = str;
/* 14 */            this.I0001Ioi1lo = str2;
/* 16 */            this.I000II = list;
/* 18 */            this.I000O01llI0 = map;
/* 20 */            this.I000OOo1O = iii0ool1Io0;
/* 22 */            this.I000OiO = f;
/* 24 */            this.I000iOII = str3;
/* 26 */            this.I000l1 = str4;
                }

                public static I1iO1loOII1 I00000oIO(I1iO1loOII1 i1iO1loOII1, I1iIll0i i1iIll0i, int i, I1iIioiI0 i1iIioiI0, int i2, String str, String str2, List list, Map map, Iii0ool1Io0 iii0ool1Io0, float f, String str3, String str4, int i3) {
/* 5 */             if ((i3 & 1) != 0) {
/* 7 */                 i1iIll0i = i1iO1loOII1.I00000oIO;
                    }
/* 9 */             I1iIll0i i1iIll0i2 = i1iIll0i;
/* 12 */            if ((i3 & 2) != 0) {
/* 14 */                i = i1iO1loOII1.I00000oOI;
                    }
/* 16 */            int i4 = i;
/* 25 */            I1iIioiI0 i1iIioiI02 = (i3 & 4) != 0 ? i1iO1loOII1.I0000Il00O : i1iIioiI0;
/* 35 */            int i5 = (i3 & 8) != 0 ? i1iO1loOII1.I0000O : i2;
/* 45 */            String str5 = (i3 & 16) != 0 ? i1iO1loOII1.I0000oI00 : str;
/* 55 */            String str6 = (i3 & 32) != 0 ? i1iO1loOII1.I0001Ioi1lo : str2;
/* 65 */            List list2 = (i3 & 64) != 0 ? i1iO1loOII1.I000II : list;
/* 75 */            Map map2 = (i3 & Barcode.FORMAT_ITF) != 0 ? i1iO1loOII1.I000O01llI0 : map;
/* 85 */            Iii0ool1Io0 iii0ool1Io02 = (i3 & Barcode.FORMAT_QR_CODE) != 0 ? i1iO1loOII1.I000OOo1O : iii0ool1Io0;
/* 95 */            float f2 = (i3 & Barcode.FORMAT_UPC_A) != 0 ? i1iO1loOII1.I000OiO : f;
/* 105 */           String str7 = (i3 & Barcode.FORMAT_UPC_E) != 0 ? i1iO1loOII1.I000iOII : str3;
/* 115 */           String str8 = (i3 & Barcode.FORMAT_PDF417) != 0 ? i1iO1loOII1.I000l1 : str4;
/* 117 */           i1iO1loOII1.getClass();
/* 122 */           return new I1iO1loOII1(i1iIll0i2, i4, i1iIioiI02, i5, str5, str6, list2, map2, iii0ool1Io02, f2, str7, str8);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 128 */               return true;
                    }
/* 7 */             if (!(obj instanceof I1iO1loOII1)) {
/* 126 */               return false;
                    }
/* 11 */            I1iO1loOII1 i1iO1loOII1 = (I1iO1loOII1) obj;
                    return this.I00000oIO == i1iO1loOII1.I00000oIO && this.I00000oOI == i1iO1loOII1.I00000oOI && this.I0000Il00O == i1iO1loOII1.I0000Il00O && this.I0000O == i1iO1loOII1.I0000O && this.I0000oI00.equals(i1iO1loOII1.I0000oI00) && this.I0001Ioi1lo.equals(i1iO1loOII1.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, i1iO1loOII1.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, i1iO1loOII1.I000O01llI0) && this.I000OOo1O == i1iO1loOII1.I000OOo1O && Float.compare(this.I000OiO, i1iO1loOII1.I000OiO) == 0 && this.I000iOII.equals(i1iO1loOII1.I000iOII) && O0000Ioio00.I0000O(this.I000l1, i1iO1loOII1.I000l1);
                }

                public final int hashCode() {
/* 70 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(OooioIOo1.I0000O((this.I000OOo1O.hashCode() + Oi010OO0.I000iOII(this.I000O01llI0, IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.I0000O, (this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31, 31), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31)) * 31, 31, this.I000OiO), 31, this.I000iOII);
/* 74 */            String str = this.I000l1;
/* 84 */            return iI000O01llI0 + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AudioScribeUiState(phase=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", recordingSeconds=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", mode=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", numSpeakers=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", language=");
/* 56 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000oI00, ", transcript=", this.I0001Ioi1lo, ", segments=");
/* 61 */            sb.append(this.I000II);
/* 66 */            sb.append(", speakerNames=");
/* 71 */            sb.append(this.I000O01llI0);
/* 76 */            sb.append(", diarStatus=");
/* 81 */            sb.append(this.I000OOo1O);
/* 86 */            sb.append(", diarDownloadProgress=");
/* 91 */            sb.append(this.I000OiO);
/* 96 */            sb.append(", progressMessage=");
/* 107 */           return IIl001iO0Io.I00100o1O0lo(sb, this.I000iOII, ", errorMessage=", this.I000l1, ")");
                }
            }
