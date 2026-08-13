            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OoIo10100O1 {
                public final String I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final float I0000O;
                public final int I0000oI00;
                public final String I0001Ioi1lo;
                public final boolean I000II;
                public final float I000O01llI0;
                public final String I000OOo1O;

                public OoIo10100O1(String str, boolean z, int i, float f, int i2, String str2, boolean z2, float f2, String str3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = i2;
/* 14 */            this.I0001Ioi1lo = str2;
/* 16 */            this.I000II = z2;
/* 18 */            this.I000O01llI0 = f2;
/* 20 */            this.I000OOo1O = str3;
                }

                public static OoIo10100O1 I00000oIO(OoIo10100O1 ooIo10100O1, String str, boolean z, int i, float f, int i2, String str2, boolean z2, float f2, String str3, int i3) {
/* 5 */             if ((i3 & 1) != 0) {
/* 7 */                 str = ooIo10100O1.I00000oIO;
                    }
/* 9 */             String str4 = str;
/* 12 */            if ((i3 & 2) != 0) {
/* 14 */                z = ooIo10100O1.I00000oOI;
                    }
/* 16 */            boolean z3 = z;
/* 19 */            if ((i3 & 4) != 0) {
/* 21 */                i = ooIo10100O1.I0000Il00O;
                    }
/* 23 */            int i4 = i;
/* 26 */            if ((i3 & 8) != 0) {
/* 28 */                f = ooIo10100O1.I0000O;
                    }
/* 30 */            float f3 = f;
/* 33 */            if ((i3 & 16) != 0) {
/* 35 */                i2 = ooIo10100O1.I0000oI00;
                    }
/* 37 */            int i5 = i2;
/* 46 */            String str5 = (i3 & 32) != 0 ? ooIo10100O1.I0001Ioi1lo : str2;
/* 56 */            boolean z4 = (i3 & 64) != 0 ? ooIo10100O1.I000II : z2;
/* 66 */            float f4 = (i3 & Barcode.FORMAT_ITF) != 0 ? ooIo10100O1.I000O01llI0 : f2;
/* 76 */            String str6 = (i3 & Barcode.FORMAT_QR_CODE) != 0 ? ooIo10100O1.I000OOo1O : str3;
/* 78 */            ooIo10100O1.getClass();
/* 83 */            return new OoIo10100O1(str4, z3, i4, f3, i5, str5, z4, f4, str6);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 95 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoIo10100O1)) {
/* 93 */                return false;
                    }
/* 9 */             OoIo10100O1 ooIo10100O1 = (OoIo10100O1) obj;
                    return this.I00000oIO.equals(ooIo10100O1.I00000oIO) && this.I00000oOI == ooIo10100O1.I00000oOI && this.I0000Il00O == ooIo10100O1.I0000Il00O && Float.compare(this.I0000O, ooIo10100O1.I0000O) == 0 && this.I0000oI00 == ooIo10100O1.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, ooIo10100O1.I0001Ioi1lo) && this.I000II == ooIo10100O1.I000II && Float.compare(this.I000O01llI0, ooIo10100O1.I000O01llI0) == 0 && O0000Ioio00.I0000O(this.I000OOo1O, ooIo10100O1.I000OOo1O);
                }

                public final int hashCode() {
/* 30 */            int iI0000O = IIl001iO0Io.I0000O(this.I0000oI00, OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000Il00O, Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31), 31, this.I0000O), 31);
/* 35 */            String str = this.I0001Ioi1lo;
/* 55 */            int iI0000O2 = OooioIOo1.I0000O(Oi010OO0.I000OOo1O((iI0000O + (str == null ? 0 : str.hashCode())) * 31, 31, this.I000II), 31, this.I000O01llI0);
/* 59 */            String str2 = this.I000OOo1O;
/* 68 */            return iI0000O2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TtsUiState(text=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", isSpeaking=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", speakerId=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", speed=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", numSpeakers=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", errorMessage=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", isImporting=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", importProgress=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", importError=");
/* 92 */            return IIl001iO0Io.I00100l0(sb, this.I000OOo1O, ")");
                }
            }
