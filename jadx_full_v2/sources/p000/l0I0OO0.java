            package p000;
            
            public abstract class l0I0OO0 {
                public static final O01Oio10O1l I00000oIO(OilOloI oilOloI) {
/* 34 */            String str = "Value of type '" + oilOloI.I00000oIO() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + oilOloI.I000oI1ioi() + '\'';
/* 38 */            oilOloI.I00000oIO();
/* 43 */            return new O01Oio10O1l(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
                }

                public static final String I00000oOI(int i, String str, String str2, String str3, String str4) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             if (i >= 0) {
/* 27 */                sb.append("Unexpected JSON token at offset " + i + ": ");
                    }
/* 30 */            sb.append(str);
/* 33 */            if (str2 != null && !OlOoOIi0o.I001l0I00(str2)) {
/* 44 */                sb.append(" at path: ");
/* 47 */                sb.append(str2);
                    }
/* 50 */            if (str3 != null && !OlOoOIi0o.I001l0I00(str3)) {
/* 65 */                sb.append("\n".concat(str3));
                    }
/* 68 */            if (str4 != null) {
/* 72 */                sb.append("\nJSON input: ");
/* 75 */                sb.append(str4);
                    }
/* 78 */            return sb.toString();
                }

                public static final void I0000Il00O(I11l01l i11l01l, String str) {
/* 13 */            i11l01l.I001IIilI0O("Trailing comma before the end of JSON ".concat(str), i11l01l.I00000oOI - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
/* 89 */            throw null;
                }

                public static void I0000O(I11l01l i11l01l) {
/* 3 */             I0000Il00O(i11l01l, "object");
/* 49 */            throw null;
                }

                public static final CharSequence I0000oI00(int i, CharSequence charSequence) {
/* 7 */             if (charSequence.length() >= 200) {
/* 13 */                if (i != -1) {
                            int i2 = i - 30;
/* 51 */                    int i3 = i + 30;
/* 55 */                    String str = i2 <= 0 ? "" : ".....";
/* 53 */                    String str2 = i3 >= charSequence.length() ? "" : ".....";
/* 69 */                    StringBuilder sb = new StringBuilder(str);
/* 72 */                    if (i2 < 0) {
/* 74 */                        i2 = 0;
                            }
/* 75 */                    int length = charSequence.length();
/* 79 */                    if (i3 > length) {
/* 81 */                        i3 = length;
                            }
/* 90 */                    sb.append(charSequence.subSequence(i2, i3).toString());
/* 93 */                    sb.append(str2);
/* 96 */                    return sb.toString();
                        }
                        int length2 = charSequence.length() - 60;
/* 21 */                if (length2 > 0) {
/* 44 */                    return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
                        }
                    }
/* 23 */            return charSequence;
                }

                public static final String I0001Ioi1lo(Number number, String str) {
/* 5 */             StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
/* 8 */             sb.append(number);
/* 23 */            return IIl001iO0Io.I00100l0(sb, str != null ? IlIi0I0.I000lI(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
                }
            }
