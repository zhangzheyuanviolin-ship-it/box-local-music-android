            package p000;
            
            public abstract class O0100IlI {
                public static final int I00000oIO;

                static {
                    int i;
/* 3 */             String property = System.getProperty("java.version");
                    try {
/* 12 */                String[] strArrSplit = property.split("[._]", 3);
/* 18 */                i = Integer.parseInt(strArrSplit[0]);
/* 23 */                if (i == 1 && strArrSplit.length > 1) {
/* 30 */                    i = Integer.parseInt(strArrSplit[1]);
                        }
                    } catch (NumberFormatException unused) {
/* 35 */                i = -1;
                    }
/* 36 */            if (i == -1) {
                        try {
/* 40 */                    StringBuilder sb = new StringBuilder();
/* 47 */                    for (int i2 = 0; i2 < property.length(); i2++) {
/* 49 */                        char cCharAt = property.charAt(i2);
/* 57 */                        if (!Character.isDigit(cCharAt)) {
                                    break;
                                }
/* 59 */                        sb.append(cCharAt);
                            }
/* 69 */                    i = Integer.parseInt(sb.toString());
                        } catch (NumberFormatException unused2) {
/* 75 */                    i = -1;
                        }
                    }
/* 76 */            if (i == -1) {
/* 78 */                i = 6;
                    }
/* 79 */            I00000oIO = i;
                }
            }
