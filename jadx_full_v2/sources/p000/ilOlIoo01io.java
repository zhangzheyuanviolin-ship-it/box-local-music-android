            package p000;
            
            public abstract class ilOlIoo01io {
                public static final String I00000oIO;

                static {
                    String property;
                    try {
/* 3 */                 property = System.getProperty("line.separator");
                    } catch (SecurityException unused) {
                    }
/* 13 */            if (!property.matches("\\n|\\r(?:\\n)?")) {
/* 15 */                property = "\n";
                    }
/* 17 */            I00000oIO = property;
                }

                public static void I00000oIO(int i, int i2, String str, StringBuilder sb) {
/* 1 */             int i3 = i;
/* 2 */             while (i < i2) {
/* 4 */                 int i4 = i + 1;
/* 12 */                if (str.charAt(i) == '%') {
/* 15 */                    if (i4 == i2) {
                                break;
                            }
/* 18 */                    char cCharAt = str.charAt(i4);
/* 22 */                    if (cCharAt == '%') {
/* 24 */                        sb.append((CharSequence) str, i3, i4);
                            } else if (cCharAt == 'n') {
/* 32 */                        sb.append((CharSequence) str, i3, i);
/* 37 */                        sb.append(I00000oIO);
                            }
/* 40 */                    i3 = i + 2;
/* 42 */                    i = i3;
                        }
/* 44 */                i = i4;
                    }
/* 46 */            if (i3 < i2) {
/* 48 */                sb.append((CharSequence) str, i3, i2);
                    }
                }

                public static int I00000oOI(int i, String str) {
/* 6 */             while (i < str.length()) {
/* 8 */                 int i2 = i + 1;
/* 16 */                if (str.charAt(i) != '%') {
/* 18 */                    i = i2;
                        } else {
/* 24 */                    if (i2 >= str.length()) {
/* 54 */                        throw new IOiIIo1l(IOiIIo1l.I0001Ioi1lo(i, -1, "trailing unquoted '%' character", str), 18);
                            }
/* 26 */                    char cCharAt = str.charAt(i2);
/* 30 */                    if (cCharAt != '%' && cCharAt != 'n') {
/* 37 */                        return i;
                            }
/* 38 */                    i += 2;
                        }
                    }
/* 5 */             return -1;
                }
            }
