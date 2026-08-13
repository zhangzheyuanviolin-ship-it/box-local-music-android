            package p000;

            import android.util.Range;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OliliiIIiil {
                public final int I00000oIO;
                public final int I00000oOI;
                public final boolean I0000Il00O;
                public final Oooi0I I0000O;
                public final boolean I0000oI00;
                public final boolean I0001Ioi1lo;
                public final boolean I000II;
                public final boolean I000O01llI0;
                public final Range I000OOo1O;
                public final boolean I000OiO;

                public OliliiIIiil(int i, int i2, boolean z, Oooi0I oooi0I, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = oooi0I;
/* 12 */            this.I0000oI00 = z2;
/* 14 */            this.I0001Ioi1lo = z3;
/* 16 */            this.I000II = z4;
/* 18 */            this.I000O01llI0 = z5;
/* 20 */            this.I000OOo1O = range;
/* 22 */            this.I000OiO = z6;
                }

                public static OliliiIIiil I00000oIO(OliliiIIiil oliliiIIiil, boolean z, Range range, int i) {
/* 1 */             int i2 = oliliiIIiil.I00000oIO;
/* 3 */             int i3 = oliliiIIiil.I00000oOI;
/* 5 */             boolean z2 = oliliiIIiil.I0000Il00O;
/* 7 */             Oooi0I oooi0I = oliliiIIiil.I0000O;
/* 9 */             boolean z3 = oliliiIIiil.I0000oI00;
/* 11 */            boolean z4 = oliliiIIiil.I0001Ioi1lo;
/* 13 */            boolean z5 = oliliiIIiil.I000II;
/* 17 */            if ((i & Barcode.FORMAT_QR_CODE) != 0) {
/* 19 */                range = oliliiIIiil.I000OOo1O;
                    }
/* 27 */            return new OliliiIIiil(i2, i3, z2, oooi0I, z3, z4, z5, z, range, oliliiIIiil.I000OiO);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 86 */                return true;
                    }
/* 6 */             if (!(obj instanceof OliliiIIiil)) {
/* 84 */                return false;
                    }
/* 9 */             OliliiIIiil oliliiIIiil = (OliliiIIiil) obj;
                    return this.I00000oIO == oliliiIIiil.I00000oIO && this.I00000oOI == oliliiIIiil.I00000oOI && this.I0000Il00O == oliliiIIiil.I0000Il00O && this.I0000O == oliliiIIiil.I0000O && this.I0000oI00 == oliliiIIiil.I0000oI00 && this.I0001Ioi1lo == oliliiIIiil.I0001Ioi1lo && this.I000II == oliliiIIiil.I000II && this.I000O01llI0 == oliliiIIiil.I000O01llI0 && O0000Ioio00.I0000O(this.I000OOo1O, oliliiIIiil.I000OOo1O) && this.I000OiO == oliliiIIiil.I000OiO;
                }

                public final int hashCode() {
/* 68 */            return Boolean.hashCode(this.I000OiO) + ((this.I000OOo1O.hashCode() + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I0000O.hashCode() + Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31), 31, this.I0000Il00O)) * 31, 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0)) * 31);
                }

                public final String toString() {
/* 108 */           return "FeatureSettings(cameraMode=" + this.I00000oIO + ", requiredMaxBitDepth=" + this.I00000oOI + ", hasVideoCapture=" + this.I0000Il00O + ", videoStabilization=" + this.I0000O + ", isUltraHdrOn=" + this.I0000oI00 + ", isHighSpeedOn=" + this.I0001Ioi1lo + ", isFeatureComboInvocation=" + this.I000II + ", requiresFeatureComboQuery=" + this.I000O01llI0 + ", targetFpsRange=" + this.I000OOo1O + ", isStrictFpsRequired=" + this.I000OiO + ')';
                }
            }
