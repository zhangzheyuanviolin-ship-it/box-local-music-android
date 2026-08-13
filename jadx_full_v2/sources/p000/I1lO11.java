            package p000;

            import android.util.Base64;
            import java.util.Arrays;
            
            public final class I1lO11 {
                public String I00000oIO;
                public byte[] I00000oOI;
                public OOIio1010OoO I0000Il00O;

                public static IOO000ilo I00000oIO() {
/* 5 */             IOO000ilo iOO000ilo = new IOO000ilo(8);
/* 10 */            iOO000ilo.I00iio = OOIio1010OoO.I00iOIl;
/* 20 */            return iOO000ilo;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lO11) {
/* 10 */                I1lO11 i1lO11 = (I1lO11) obj;
/* 20 */                if (this.I00000oIO.equals(i1lO11.I00000oIO) && Arrays.equals(this.I00000oOI, i1lO11.I00000oOI) && this.I0000Il00O.equals(i1lO11.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 26 */            return this.I0000Il00O.hashCode() ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.I00000oOI)) * 1000003);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             OOIio1010OoO oOIio1010OoO = this.I0000Il00O;
/* 5 */             byte[] bArr = this.I00000oOI;
/* 13 */            String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
/* 21 */            StringBuilder sb = new StringBuilder("TransportContext(");
/* 24 */            sb.append(str);
/* 29 */            sb.append(", ");
/* 32 */            sb.append(oOIio1010OoO);
/* 35 */            sb.append(", ");
/* 40 */            return IIl001iO0Io.I00100l0(sb, strEncodeToString, ")");
                }
            }
