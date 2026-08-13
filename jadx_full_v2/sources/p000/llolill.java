            package p000;
            
            public abstract class llolill {
                public static final int I00000oIO;

                static {
                    int i;
/* 3 */             String property = System.getProperty("java.version");
                    try {
/* 12 */                String[] strArrSplit = property.split("[._]", 3);
/* 18 */                i = Integer.parseInt(strArrSplit[0]);
/* 23 */                if (i == 1) {
/* 35 */                    i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 1;
                        }
                    } catch (NumberFormatException unused) {
/* 37 */                i = -1;
                    }
/* 38 */            if (i == -1) {
                        try {
/* 42 */                    StringBuilder sb = new StringBuilder();
/* 49 */                    for (int i2 = 0; i2 < property.length(); i2++) {
/* 51 */                        char cCharAt = property.charAt(i2);
/* 59 */                        if (!Character.isDigit(cCharAt)) {
                                    break;
                                }
/* 61 */                        sb.append(cCharAt);
                            }
/* 71 */                    i = Integer.parseInt(sb.toString());
                        } catch (NumberFormatException unused2) {
/* 76 */                    i = -1;
                        }
                    }
/* 77 */            if (i == -1) {
/* 79 */                i = 6;
                    }
/* 80 */            I00000oIO = i;
                }
            }
