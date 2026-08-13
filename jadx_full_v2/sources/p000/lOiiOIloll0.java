            package p000;

            import java.util.Collection;
            
            public abstract class lOiiOIloll0 {
                public static final boolean I00000oIO(String str, String str2) {
/* 6 */             if (str.equals(str2)) {
/* 5 */                 return true;
                    }
/* 14 */            if (str.length() != 0) {
/* 17 */                int i = 0;
/* 18 */                int i2 = 0;
/* 19 */                int i3 = 0;
                        while (true) {
/* 24 */                    if (i < str.length()) {
/* 26 */                        char cCharAt = str.charAt(i);
/* 30 */                        int i4 = i3 + 1;
/* 34 */                        if (i3 == 0 && cCharAt != '(') {
                                    break;
                                }
/* 39 */                        if (cCharAt == '(') {
/* 58 */                            i2++;
                                } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                                    break;
                                }
/* 60 */                        i++;
/* 62 */                        i3 = i4;
                            } else if (i2 == 0) {
/* 83 */                        return O0000Ioio00.I0000O(OlOoOIi0o.I00OIo(str.substring(1, str.length() - 1)).toString(), str2);
                            }
                        }
                    }
/* 13 */            return false;
                }

                public static final String I00000oOI(Collection collection) {
                    return !collection.isEmpty() ? OlOoOOooiIll.I00000oOI(IOOi0Ool1i.I00IlilI0i0i(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
                }

                public static final String I0000Il00O(Collection collection) {
/* 25 */            return OlOoOOooiIll.I00000oOI(IOOi0Ool1i.I00IlilI0i0i(collection, ",", null, null, null, 62)).concat(OlOoOOooiIll.I00000oOI(" }"));
                }

                public static final String I0000O(Collection collection) {
/* 25 */            return OlOoOOooiIll.I00000oOI(IOOi0Ool1i.I00IlilI0i0i(collection, ",", null, null, null, 62)).concat(OlOoOOooiIll.I00000oOI("},"));
                }
            }
