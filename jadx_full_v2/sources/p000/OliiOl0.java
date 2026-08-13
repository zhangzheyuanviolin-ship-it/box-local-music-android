            package p000;
            
            public final class OliiOl0 {
                public final String I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final float I0000O;
                public final int I0000oI00;
                public final String I0001Ioi1lo;

                public OliiOl0(String str, boolean z, int i, float f, int i2, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = i2;
/* 14 */            this.I0001Ioi1lo = str2;
                }

                public static OliiOl0 I00000oIO(OliiOl0 oliiOl0, String str, boolean z, int i, float f, int i2, String str2, int i3) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 str = oliiOl0.I00000oIO;
                    }
/* 7 */             String str3 = str;
/* 10 */            if ((i3 & 2) != 0) {
/* 12 */                z = oliiOl0.I00000oOI;
                    }
/* 14 */            boolean z2 = z;
/* 17 */            if ((i3 & 4) != 0) {
/* 19 */                i = oliiOl0.I0000Il00O;
                    }
/* 21 */            int i4 = i;
/* 24 */            if ((i3 & 8) != 0) {
/* 26 */                f = oliiOl0.I0000O;
                    }
/* 28 */            float f2 = f;
/* 31 */            if ((i3 & 16) != 0) {
/* 33 */                i2 = oliiOl0.I0000oI00;
                    }
/* 35 */            int i5 = i2;
/* 38 */            if ((i3 & 32) != 0) {
/* 40 */                str2 = oliiOl0.I0001Ioi1lo;
                    }
/* 43 */            oliiOl0.getClass();
/* 48 */            return new OliiOl0(str3, z2, i4, f2, i5, str2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 66 */                return true;
                    }
/* 6 */             if (!(obj instanceof OliiOl0)) {
/* 64 */                return false;
                    }
/* 9 */             OliiOl0 oliiOl0 = (OliiOl0) obj;
                    return this.I00000oIO.equals(oliiOl0.I00000oIO) && this.I00000oOI == oliiOl0.I00000oOI && this.I0000Il00O == oliiOl0.I0000Il00O && Float.compare(this.I0000O, oliiOl0.I0000O) == 0 && this.I0000oI00 == oliiOl0.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, oliiOl0.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 30 */            int iI0000O = IIl001iO0Io.I0000O(this.I0000oI00, OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000Il00O, Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31), 31, this.I0000O), 31);
/* 34 */            String str = this.I0001Ioi1lo;
/* 44 */            return iI0000O + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 68 */            return "SupertonicUiState(text=" + this.I00000oIO + ", isSpeaking=" + this.I00000oOI + ", voiceId=" + this.I0000Il00O + ", speed=" + this.I0000O + ", numVoices=" + this.I0000oI00 + ", errorMessage=" + this.I0001Ioi1lo + ")";
                }
            }
