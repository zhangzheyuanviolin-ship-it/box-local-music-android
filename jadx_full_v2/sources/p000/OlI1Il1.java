            package p000;
            
            public final class OlI1Il1 {
                public final String I00000oIO;
                public final int I00000oOI;
                public final boolean I0000Il00O;
                public final float I0000O;
                public final String I0000oI00;
                public final String I0001Ioi1lo;

                public OlI1Il1(String str, int i, boolean z, float f, String str2, String str3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = str2;
/* 14 */            this.I0001Ioi1lo = str3;
                }

                public static OlI1Il1 I00000oIO(OlI1Il1 olI1Il1, String str, int i, boolean z, float f, String str2, String str3, int i2) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = olI1Il1.I00000oIO;
                    }
/* 7 */             String str4 = str;
/* 10 */            if ((i2 & 2) != 0) {
/* 12 */                i = olI1Il1.I00000oOI;
                    }
/* 14 */            int i3 = i;
/* 17 */            if ((i2 & 4) != 0) {
/* 19 */                z = olI1Il1.I0000Il00O;
                    }
/* 21 */            boolean z2 = z;
/* 24 */            if ((i2 & 8) != 0) {
/* 26 */                f = olI1Il1.I0000O;
                    }
/* 28 */            float f2 = f;
/* 31 */            if ((i2 & 16) != 0) {
/* 33 */                str2 = olI1Il1.I0000oI00;
                    }
/* 35 */            String str5 = str2;
/* 38 */            if ((i2 & 32) != 0) {
/* 40 */                str3 = olI1Il1.I0001Ioi1lo;
                    }
/* 43 */            olI1Il1.getClass();
/* 48 */            return new OlI1Il1(str4, i3, z2, f2, str5, str3);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 70 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlI1Il1)) {
/* 68 */                return false;
                    }
/* 9 */             OlI1Il1 olI1Il1 = (OlI1Il1) obj;
                    return this.I00000oIO.equals(olI1Il1.I00000oIO) && this.I00000oOI == olI1Il1.I00000oOI && this.I0000Il00O == olI1Il1.I0000Il00O && Float.compare(this.I0000O, olI1Il1.I0000O) == 0 && O0000Ioio00.I0000O(this.I0000oI00, olI1Il1.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, olI1Il1.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 24 */            int iI0000O = OooioIOo1.I0000O(Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31, this.I0000Il00O), 31, this.I0000O);
/* 29 */            String str = this.I0000oI00;
/* 40 */            int iHashCode = (iI0000O + (str == null ? 0 : str.hashCode())) * 31;
/* 41 */            String str2 = this.I0001Ioi1lo;
/* 50 */            return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00111O = IIlIOloOOO.I00111O(this.I00000oOI, "SoundGenHdUiState(prompt=", this.I00000oIO, ", durationSec=", ", isGenerating=");
/* 17 */            sbI00111O.append(this.I0000Il00O);
/* 22 */            sbI00111O.append(", progress=");
/* 27 */            sbI00111O.append(this.I0000O);
/* 32 */            sbI00111O.append(", wavPath=");
/* 43 */            return IIl001iO0Io.I00100o1O0lo(sbI00111O, this.I0000oI00, ", errorMessage=", this.I0001Ioi1lo, ")");
                }
            }
