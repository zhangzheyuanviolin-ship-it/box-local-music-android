            package p000;
            
            public final class i001ilIoI {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final boolean I0000oI00;
                public final float I0001Ioi1lo;
                public final String I000II;

                public i001ilIoI(boolean z, boolean z2, String str, String str2, boolean z3, float f, String str3) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
/* 12 */            this.I0000oI00 = z3;
/* 14 */            this.I0001Ioi1lo = f;
/* 16 */            this.I000II = str3;
                }

                public static i001ilIoI I00000oIO(i001ilIoI i001ilioi, boolean z, boolean z2, String str, String str2, boolean z3, float f, String str3, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = i001ilioi.I00000oIO;
                    }
/* 7 */             boolean z4 = z;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                z2 = i001ilioi.I00000oOI;
                    }
/* 14 */            boolean z5 = z2;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                str = i001ilioi.I0000Il00O;
                    }
/* 21 */            String str4 = str;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                str2 = i001ilioi.I0000O;
                    }
/* 28 */            String str5 = str2;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                z3 = i001ilioi.I0000oI00;
                    }
/* 35 */            boolean z6 = z3;
/* 38 */            if ((i & 32) != 0) {
/* 40 */                f = i001ilioi.I0001Ioi1lo;
                    }
/* 42 */            float f2 = f;
/* 45 */            if ((i & 64) != 0) {
/* 47 */                str3 = i001ilioi.I000II;
                    }
/* 50 */            i001ilioi.getClass();
/* 55 */            return new i001ilIoI(z4, z5, str4, str5, z6, f2, str3);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 77 */                return true;
                    }
/* 6 */             if (!(obj instanceof i001ilIoI)) {
/* 75 */                return false;
                    }
/* 9 */             i001ilIoI i001ilioi = (i001ilIoI) obj;
                    return this.I00000oIO == i001ilioi.I00000oIO && this.I00000oOI == i001ilioi.I00000oOI && this.I0000Il00O.equals(i001ilioi.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, i001ilioi.I0000O) && this.I0000oI00 == i001ilioi.I0000oI00 && Float.compare(this.I0001Ioi1lo, i001ilioi.I0001Ioi1lo) == 0 && O0000Ioio00.I0000O(this.I000II, i001ilioi.I000II);
                }

                public final int hashCode() {
/* 18 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
/* 23 */            String str = this.I0000O;
/* 43 */            int iI0000O = OooioIOo1.I0000O(Oi010OO0.I000OOo1O((iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31, 31, this.I0000oI00), 31, this.I0001Ioi1lo);
/* 47 */            String str2 = this.I000II;
/* 56 */            return iI0000O + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WhisperUiState(isRecording=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", isTranscribing=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", transcript=");
/* 36 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000Il00O, ", errorMessage=", this.I0000O, ", isImporting=");
/* 41 */            sb.append(this.I0000oI00);
/* 46 */            sb.append(", importProgress=");
/* 51 */            sb.append(this.I0001Ioi1lo);
/* 56 */            sb.append(", importError=");
/* 63 */            return IIl001iO0Io.I00100l0(sb, this.I000II, ")");
                }
            }
