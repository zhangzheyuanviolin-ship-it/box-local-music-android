            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OoIIliIIII0 {
                public final long I00000oIO;
                public final OoIIOoO I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final String I0000oI00;
                public final String I0001Ioi1lo;
                public final boolean I000II;
                public final String I000O01llI0;

                public OoIIliIIII0(long j, OoIIOoO ooIIOoO, String str, String str2, String str3, String str4, boolean z, String str5) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = ooIIOoO;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
/* 12 */            this.I0000oI00 = str3;
/* 14 */            this.I0001Ioi1lo = str4;
/* 16 */            this.I000II = z;
/* 18 */            this.I000O01llI0 = str5;
                }

                public static OoIIliIIII0 I00000oIO(OoIIliIIII0 ooIIliIIII0, String str, String str2, int i) {
/* 1 */             long j = ooIIliIIII0.I00000oIO;
/* 3 */             OoIIOoO ooIIOoO = ooIIliIIII0.I00000oOI;
/* 5 */             String str3 = ooIIliIIII0.I0000Il00O;
/* 7 */             String str4 = ooIIliIIII0.I0000O;
/* 9 */             String str5 = ooIIliIIII0.I0000oI00;
/* 13 */            if ((i & 32) != 0) {
/* 15 */                str = ooIIliIIII0.I0001Ioi1lo;
                    }
/* 17 */            String str6 = str;
/* 26 */            boolean z = (i & 64) != 0 ? ooIIliIIII0.I000II : true;
/* 30 */            if ((i & Barcode.FORMAT_ITF) != 0) {
/* 32 */                str2 = ooIIliIIII0.I000O01llI0;
                    }
/* 37 */            return new OoIIliIIII0(j, ooIIOoO, str3, str4, str5, str6, z, str2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 90 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoIIliIIII0)) {
/* 88 */                return false;
                    }
/* 9 */             OoIIliIIII0 ooIIliIIII0 = (OoIIliIIII0) obj;
                    return this.I00000oIO == ooIIliIIII0.I00000oIO && this.I00000oOI == ooIIliIIII0.I00000oOI && this.I0000Il00O.equals(ooIIliIIII0.I0000Il00O) && this.I0000O.equals(ooIIliIIII0.I0000O) && this.I0000oI00.equals(ooIIliIIII0.I0000oI00) && this.I0001Ioi1lo.equals(ooIIliIIII0.I0001Ioi1lo) && this.I000II == ooIIliIIII0.I000II && O0000Ioio00.I0000O(this.I000O01llI0, ooIIliIIII0.I000O01llI0);
                }

                public final int hashCode() {
/* 44 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((this.I00000oOI.hashCode() + (Long.hashCode(this.I00000oIO) * 31)) * 31, 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II);
/* 48 */            String str = this.I000O01llI0;
/* 58 */            return iI000OOo1O + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TranslatorTurn(id=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", side=");
/* 20 */            sb.append(this.I00000oOI);
/* 31 */            IIl001iO0Io.I001lIiIIo1O(sb, ", srcLabel=", this.I0000Il00O, ", dstLabel=", this.I0000O);
/* 42 */            IIl001iO0Io.I001lIiIIo1O(sb, ", dstTag=", this.I0000oI00, ", text=", this.I0001Ioi1lo);
/* 47 */            sb.append(", done=");
/* 52 */            sb.append(this.I000II);
/* 57 */            sb.append(", error=");
/* 62 */            sb.append(this.I000O01llI0);
/* 67 */            sb.append(")");
/* 70 */            return sb.toString();
                }
            }
