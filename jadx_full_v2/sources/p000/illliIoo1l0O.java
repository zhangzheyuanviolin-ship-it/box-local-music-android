            package p000;
            
            public abstract class illliIoo1l0O {
                public static void I00000oIO(String str) {
/* 5 */             if (str.length() <= 0) {
/* 53 */                I000II.I000iOII("name is empty");
/* 186 */               return;
                    }
/* 7 */             int length = str.length();
/* 12 */            for (int i = 0; i < length; i++) {
/* 14 */                char cCharAt = str.charAt(i);
/* 20 */                if ('!' > cCharAt || cCharAt >= 127) {
/* 47 */                    I000II.I0010I0i(OollIoI001lo.I000O01llI0("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
/* 50 */                    return;
                        }
                    }
                }

                public static void I00000oOI(String str, String str2) {
/* 1 */             int length = str.length();
/* 6 */             for (int i = 0; i < length; i++) {
/* 8 */                 char cCharAt = str.charAt(i);
/* 14 */                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
/* 62 */                    I000II.I0010I0i(OollIoI001lo.I000O01llI0("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(OollIoI001lo.I00100l0(str2) ? "" : ": ".concat(str)));
/* 65 */                    return;
                        }
                    }
                }

                public static Io1Io0OOi011 I0000Il00O(String... strArr) {
/* 5 */             if (strArr.length % 2 != 0) {
/* 75 */                I000II.I000iOII("Expected alternating header names and values");
/* 4 */                 return null;
                    }
/* 11 */            String[] strArr2 = (String[]) strArr.clone();
/* 13 */            int length = strArr2.length;
/* 14 */            int i = 0;
/* 16 */            for (int i2 = 0; i2 < length; i2++) {
/* 18 */                String str = strArr2[i2];
/* 20 */                if (str == null) {
/* 37 */                    I000II.I000iOII("Headers cannot be null");
/* 4 */                     return null;
                        }
/* 30 */                strArr2[i2] = OlOoOIi0o.I00OIo(str).toString();
                    }
/* 44 */            int iI00000oIO = lIO01iiiOOo.I00000oIO(0, strArr2.length - 1, 2);
/* 48 */            if (iI00000oIO >= 0) {
                        while (true) {
/* 50 */                    String str2 = strArr2[i];
/* 54 */                    String str3 = strArr2[i + 1];
/* 56 */                    I00000oIO(str2);
/* 59 */                    I00000oOI(str3, str2);
/* 62 */                    if (i == iI00000oIO) {
                                break;
                            }
/* 64 */                    i += 2;
                        }
                    }
/* 69 */            return new Io1Io0OOi011(strArr2);
                }
            }
