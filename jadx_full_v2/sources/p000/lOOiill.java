            package p000;

            import java.lang.invoke.VarHandle;
            import java.net.ProtocolException;
            
            public abstract class lOOiill {
                public static I00Ol00 I00000oIO(String str) {
                    int i;
                    String strSubstring;
/* 3 */             short s = 0;
/* 4 */             boolean zI000l1 = OlOolloIIOl0.I000l1(str, "HTTP/1.", false);
/* 9 */             OOiIO0oi oOiIO0oi = OOiIO0oi.HTTP_1_0;
/* 15 */            if (zI000l1) {
/* 21 */                i = 9;
/* 23 */                if (str.length() < 9 || str.charAt(8) != ' ') {
/* 67 */                    throw new ProtocolException("Unexpected status line: ".concat(str));
                        }
                        int iCharAt = str.charAt(7) - '0';
/* 40 */                if (iCharAt != 0) {
/* 43 */                    if (iCharAt != 1) {
/* 57 */                        throw new ProtocolException("Unexpected status line: ".concat(str));
                            }
/* 45 */                    oOiIO0oi = OOiIO0oi.HTTP_1_1;
                        }
                    } else {
/* 74 */                if (!OlOolloIIOl0.I000l1(str, "ICY ", false)) {
/* 186 */                   throw new ProtocolException("Unexpected status line: ".concat(str));
                        }
/* 76 */                i = 4;
                    }
/* 81 */            int i2 = i + 3;
/* 83 */            if (str.length() < i2) {
/* 159 */               throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    try {
/* 89 */                int i3 = Integer.parseInt(str.substring(i, i2));
/* 97 */                if (str.length() <= i2) {
/* 121 */                   strSubstring = "";
                        } else {
/* 103 */                   if (str.charAt(i2) != ' ') {
/* 120 */                       throw new ProtocolException("Unexpected status line: ".concat(str));
                            }
/* 106 */                   strSubstring = str.substring(i + 4);
                        }
/* 127 */               I00Ol00 i00Ol00 = new I00Ol00(13, s);
/* 130 */               i00Ol00.I0000Il00O = oOiIO0oi;
/* 132 */               i00Ol00.I00000oOI = i3;
/* 134 */               i00Ol00.I0000O = strSubstring;
/* 136 */               VarHandle.storeStoreFence();
/* 139 */               return i00Ol00;
                    } catch (NumberFormatException unused) {
/* 149 */               throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            }
