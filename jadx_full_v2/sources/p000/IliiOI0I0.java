            package p000;

            import android.util.Base64;
            import java.util.List;
            
            public final class IliiOI0I0 {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final List I0000O;
                public final String I0000oI00;
                public final String I0001Ioi1lo;
                public final String I000II;

                public IliiOI0I0(String str, String str2, String str3, List list, String str4, String str5) {
/* 4 */             str.getClass();
/* 7 */             this.I00000oIO = str;
/* 9 */             str2.getClass();
/* 12 */            this.I00000oOI = str2;
/* 14 */            this.I0000Il00O = str3;
/* 16 */            list.getClass();
/* 21 */            this.I0000O = list;
/* 23 */            this.I0000oI00 = str4;
/* 25 */            this.I0001Ioi1lo = str5;
/* 29 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O(str, "-", str2, "-", str3);
/* 33 */            sbI00111O.append("-");
/* 36 */            sbI00111O.append(str4);
/* 39 */            if (str5 != null && !str5.isBlank()) {
/* 49 */                sbI00111O.append("-VF");
                    }
/* 56 */            this.I000II = sbI00111O.toString();
                }

                public final String toString() {
/* 7 */             StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
/* 12 */            sb.append(this.I00000oIO);
/* 17 */            sb.append(", mProviderPackage: ");
/* 22 */            sb.append(this.I00000oOI);
/* 27 */            sb.append(", mQuery: ");
/* 32 */            sb.append(this.I0000Il00O);
/* 37 */            sb.append(", mSystemFont: ");
/* 42 */            sb.append(this.I0000oI00);
/* 47 */            sb.append(", mVariationSettings: ");
/* 58 */            StringBuilder sb2 = new StringBuilder(IIl001iO0Io.I00100l0(sb, this.I0001Ioi1lo, ", mCertificates:"));
/* 62 */            int i = 0;
                    while (true) {
/* 63 */                List list = this.I0000O;
/* 69 */                if (i >= list.size()) {
/* 125 */                   sb2.append("}mCertificatesArray: 0");
/* 128 */                   return sb2.toString();
                        }
/* 73 */                sb2.append(" [");
/* 80 */                List list2 = (List) list.get(i);
/* 87 */                for (int i2 = 0; i2 < list2.size(); i2++) {
/* 91 */                    sb2.append(" \"");
/* 104 */                   sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
/* 109 */                   sb2.append("\"");
                        }
/* 117 */               sb2.append(" ]");
/* 120 */               i++;
                    }
                }
            }
