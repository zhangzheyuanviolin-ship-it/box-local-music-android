            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            
            public final class OoIIo0oOI1 {
                public final OoI1lOl I00000oIO;
                public final OoI1lOl I00000oOI;
                public final OoII00OiO I0000Il00O;
                public final OoIIOoO I0000O;
                public final List I0000oI00;
                public final String I0001Ioi1lo;
                public final boolean I000II;
                public final boolean I000O01llI0;

                public OoIIo0oOI1(OoI1lOl ooI1lOl, OoI1lOl ooI1lOl2, OoII00OiO ooII00OiO, OoIIOoO ooIIOoO, List list, String str, boolean z, boolean z2) {
/* 4 */             this.I00000oIO = ooI1lOl;
/* 6 */             this.I00000oOI = ooI1lOl2;
/* 8 */             this.I0000Il00O = ooII00OiO;
/* 10 */            this.I0000O = ooIIOoO;
/* 12 */            this.I0000oI00 = list;
/* 14 */            this.I0001Ioi1lo = str;
/* 16 */            this.I000II = z;
/* 18 */            this.I000O01llI0 = z2;
                }

                public static OoIIo0oOI1 I00000oIO(OoIIo0oOI1 ooIIo0oOI1, OoI1lOl ooI1lOl, OoI1lOl ooI1lOl2, OoII00OiO ooII00OiO, OoIIOoO ooIIOoO, List list, String str, boolean z, boolean z2, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 ooI1lOl = ooIIo0oOI1.I00000oIO;
                    }
/* 9 */             OoI1lOl ooI1lOl3 = ooI1lOl;
/* 12 */            if ((i & 2) != 0) {
/* 14 */                ooI1lOl2 = ooIIo0oOI1.I00000oOI;
                    }
/* 16 */            OoI1lOl ooI1lOl4 = ooI1lOl2;
/* 19 */            if ((i & 4) != 0) {
/* 21 */                ooII00OiO = ooIIo0oOI1.I0000Il00O;
                    }
/* 23 */            OoII00OiO ooII00OiO2 = ooII00OiO;
/* 26 */            if ((i & 8) != 0) {
/* 28 */                ooIIOoO = ooIIo0oOI1.I0000O;
                    }
/* 30 */            OoIIOoO ooIIOoO2 = ooIIOoO;
/* 33 */            if ((i & 16) != 0) {
/* 35 */                list = ooIIo0oOI1.I0000oI00;
                    }
/* 37 */            List list2 = list;
/* 40 */            if ((i & 32) != 0) {
/* 42 */                str = ooIIo0oOI1.I0001Ioi1lo;
                    }
/* 44 */            String str2 = str;
/* 53 */            boolean z3 = (i & 64) != 0 ? ooIIo0oOI1.I000II : z;
/* 63 */            boolean z4 = (i & Barcode.FORMAT_ITF) != 0 ? ooIIo0oOI1.I000O01llI0 : z2;
/* 65 */            ooIIo0oOI1.getClass();
/* 70 */            return new OoIIo0oOI1(ooI1lOl3, ooI1lOl4, ooII00OiO2, ooIIOoO2, list2, str2, z3, z4);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 84 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoIIo0oOI1)) {
/* 82 */                return false;
                    }
/* 9 */             OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooIIo0oOI1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ooIIo0oOI1.I00000oOI) && this.I0000Il00O == ooIIo0oOI1.I0000Il00O && this.I0000O == ooIIo0oOI1.I0000O && O0000Ioio00.I0000O(this.I0000oI00, ooIIo0oOI1.I0000oI00) && this.I0001Ioi1lo.equals(ooIIo0oOI1.I0001Ioi1lo) && this.I000II == ooIIo0oOI1.I000II && this.I000O01llI0 == ooIIo0oOI1.I000O01llI0;
                }

                public final int hashCode() {
/* 25 */            int iHashCode = (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31;
/* 26 */            OoIIOoO ooIIOoO = this.I0000O;
/* 62 */            return Boolean.hashCode(this.I000O01llI0) + Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000oI00((iHashCode + (ooIIOoO == null ? 0 : ooIIOoO.hashCode())) * 31, 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II);
                }

                public final String toString() {
/* 88 */            return "TranslatorUiState(langA=" + this.I00000oIO + ", langB=" + this.I00000oOI + ", phase=" + this.I0000Il00O + ", activeSide=" + this.I0000O + ", turns=" + this.I0000oI00 + ", hint=" + this.I0001Ioi1lo + ", autoMode=" + this.I000II + ", speakEnabled=" + this.I000O01llI0 + ")";
                }
            }
