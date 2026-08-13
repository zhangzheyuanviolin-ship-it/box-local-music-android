            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            
            public final class OilIl00O1o {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final List I0000O;
                public final String I0000oI00;
                public final boolean I0001Ioi1lo;
                public final boolean I000II;
                public final boolean I000O01llI0;
                public final boolean I000OOo1O;
                public final String I000OiO;

                public OilIl00O1o(boolean z, boolean z2, String str, List list, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = list;
/* 12 */            this.I0000oI00 = str2;
/* 14 */            this.I0001Ioi1lo = z3;
/* 16 */            this.I000II = z4;
/* 18 */            this.I000O01llI0 = z5;
/* 20 */            this.I000OOo1O = z6;
/* 22 */            this.I000OiO = str3;
                }

                public static OilIl00O1o I00000oIO(OilIl00O1o oilIl00O1o, boolean z, boolean z2, String str, List list, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 z = oilIl00O1o.I00000oIO;
                    }
/* 9 */             boolean z7 = z;
/* 12 */            if ((i & 2) != 0) {
/* 14 */                z2 = oilIl00O1o.I00000oOI;
                    }
/* 16 */            boolean z8 = z2;
/* 19 */            if ((i & 4) != 0) {
/* 21 */                str = oilIl00O1o.I0000Il00O;
                    }
/* 23 */            String str4 = str;
/* 26 */            if ((i & 8) != 0) {
/* 28 */                list = oilIl00O1o.I0000O;
                    }
/* 30 */            List list2 = list;
/* 39 */            String str5 = (i & 16) != 0 ? oilIl00O1o.I0000oI00 : str2;
/* 49 */            boolean z9 = (i & 32) != 0 ? oilIl00O1o.I0001Ioi1lo : z3;
/* 59 */            boolean z10 = (i & 64) != 0 ? oilIl00O1o.I000II : z4;
/* 69 */            boolean z11 = (i & Barcode.FORMAT_ITF) != 0 ? oilIl00O1o.I000O01llI0 : z5;
/* 79 */            boolean z12 = (i & Barcode.FORMAT_QR_CODE) != 0 ? oilIl00O1o.I000OOo1O : z6;
/* 89 */            String str6 = (i & Barcode.FORMAT_UPC_A) != 0 ? oilIl00O1o.I000OiO : str3;
/* 91 */            oilIl00O1o.getClass();
/* 96 */            return new OilIl00O1o(z7, z8, str4, list2, str5, z9, z10, z11, z12, str6);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 99 */                return true;
                    }
/* 7 */             if (!(obj instanceof OilIl00O1o)) {
/* 97 */                return false;
                    }
/* 10 */            OilIl00O1o oilIl00O1o = (OilIl00O1o) obj;
                    return this.I00000oIO == oilIl00O1o.I00000oIO && this.I00000oOI == oilIl00O1o.I00000oOI && this.I0000Il00O.equals(oilIl00O1o.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oilIl00O1o.I0000O) && this.I0000oI00.equals(oilIl00O1o.I0000oI00) && this.I0001Ioi1lo == oilIl00O1o.I0001Ioi1lo && this.I000II == oilIl00O1o.I000II && this.I000O01llI0 == oilIl00O1o.I000O01llI0 && this.I000OOo1O == oilIl00O1o.I000OOo1O && O0000Ioio00.I0000O(this.I000OiO, oilIl00O1o.I000OiO);
                }

                public final int hashCode() {
/* 54 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0), 31, this.I000OOo1O);
/* 58 */            String str = this.I000OiO;
/* 68 */            return iI000OOo1O + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 108 */           return "SenseVoiceUiState(isRecording=" + this.I00000oIO + ", isTranscribing=" + this.I00000oOI + ", partial=" + this.I0000Il00O + ", transcripts=" + this.I0000O + ", language=" + this.I0000oI00 + ", useItn=" + this.I0001Ioi1lo + ", showEmotion=" + this.I000II + ", showEvents=" + this.I000O01llI0 + ", isApplyingSettings=" + this.I000OOo1O + ", errorMessage=" + this.I000OiO + ")";
                }
            }
