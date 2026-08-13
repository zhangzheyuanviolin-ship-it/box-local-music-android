            package p000;
            
            public abstract class OlOllioI11o1 {
                public static final String[] I00000oIO;
                public static final byte[] I00000oOI;

                static {
/* 3 */             String[] strArr = new String[93];
/* 9 */             for (int i = 0; i < 32; i++) {
/* 56 */                strArr[i] = "\\u" + I00000oOI(i >> 12) + I00000oOI(i >> 8) + I00000oOI(i >> 4) + I00000oOI(i);
                    }
/* 65 */            strArr[34] = "\\\"";
/* 71 */            strArr[92] = "\\\\";
/* 77 */            strArr[9] = "\\t";
/* 83 */            strArr[8] = "\\b";
/* 89 */            strArr[10] = "\\n";
/* 95 */            strArr[13] = "\\r";
/* 101 */           strArr[12] = "\\f";
/* 103 */           I00000oIO = strArr;
/* 105 */           byte[] bArr = new byte[93];
/* 107 */           for (int i2 = 0; i2 < 32; i2++) {
/* 110 */               bArr[i2] = 1;
                    }
/* 115 */           bArr[34] = 34;
/* 117 */           bArr[92] = 92;
/* 121 */           bArr[9] = 116;
/* 125 */           bArr[8] = 98;
/* 129 */           bArr[10] = 110;
/* 133 */           bArr[13] = 114;
/* 137 */           bArr[12] = 102;
/* 139 */           I00000oOI = bArr;
                }

                public static final void I00000oIO(StringBuilder sb, String str) {
/* 3 */             sb.append('\"');
/* 6 */             int length = str.length();
/* 11 */            int i = 0;
/* 12 */            for (int i2 = 0; i2 < length; i2++) {
/* 14 */                char cCharAt = str.charAt(i2);
/* 18 */                String[] strArr = I00000oIO;
/* 21 */                if (cCharAt < strArr.length && strArr[cCharAt] != null) {
/* 27 */                    sb.append((CharSequence) str, i, i2);
/* 32 */                    sb.append(strArr[cCharAt]);
/* 35 */                    i = i2 + 1;
                        }
                    }
/* 40 */            if (i != 0) {
/* 46 */                sb.append((CharSequence) str, i, str.length());
                    } else {
/* 50 */                sb.append(str);
                    }
/* 53 */            sb.append('\"');
                }

                public static final char I00000oOI(int i) {
/* 1 */             int i2 = i & 15;
/* 9 */             return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
                }
            }
