            package p000;

            import android.os.Bundle;
            
            public final class II111ioOoi extends OII0I1ii {
                public final int I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II111ioOoi(boolean z, int i) {
/* 3 */             super(z);
/* 1 */             this.I000l1 = i;
                }

                @Override
                public final Object I00000oIO(String str, Bundle bundle) {
                    switch (this.I000l1) {
                        case 0:
/* 109 */                   if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 119 */                   boolean z = bundle.getBoolean(str, false);
/* 123 */                   if (z || !bundle.getBoolean(str, true)) {
/* 137 */                       return Boolean.valueOf(z);
                            }
/* 133 */                   lO0iIII0.I00000oIO(str);
/* 136 */                   throw null;
                        case 1:
/* 76 */                    float f = bundle.getFloat(str, Float.MIN_VALUE);
/* 82 */                    if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
/* 100 */                       return Float.valueOf(f);
                            }
/* 96 */                    lO0iIII0.I00000oIO(str);
/* 99 */                    throw null;
                        case 2:
/* 70 */                    return Integer.valueOf(lO0i1o0ii.I00000oIO(str, bundle));
                        case 3:
/* 35 */                    long j = bundle.getLong(str, Long.MIN_VALUE);
/* 41 */                    if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
/* 61 */                        return Long.valueOf(j);
                            }
/* 57 */                    lO0iIII0.I00000oIO(str);
/* 60 */                    throw null;
                        default:
/* 11 */                    if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 20 */                    String string = bundle.getString(str);
/* 24 */                    if (string != null) {
/* 26 */                        return string;
                            }
/* 28 */                    lO0iIII0.I00000oIO(str);
/* 31 */                    throw null;
                    }
                }

                @Override
                public final String I00000oOI() {
                    switch (this.I000l1) {
                        case 0:
/* 18 */                    return "boolean";
                        case 1:
/* 15 */                    return "float";
                        case 2:
/* 12 */                    return "integer";
                        case 3:
/* 9 */                     return "long";
                        default:
/* 6 */                     return "string";
                    }
                }

                @Override
                public final Object I0000Il00O(String str) throws NumberFormatException {
                    int i;
                    long j;
/* 7 */             boolean z = true;
                    switch (this.I000l1) {
                        case 0:
/* 112 */                   if (!str.equals("true")) {
/* 121 */                       if (!str.equals("false")) {
/* 131 */                           I000II.I000iOII("A boolean NavType only accepts \"true\" or \"false\" values.");
/* 9 */                             return null;
                                }
/* 123 */                       z = false;
                            }
/* 124 */                   return Boolean.valueOf(z);
                        case 1:
/* 101 */                   return Float.valueOf(Float.parseFloat(str));
                        case 2:
/* 74 */                    if (OlOolloIIOl0.I000l1(str, "0x", false)) {
/* 76 */                        String strSubstring = str.substring(2);
/* 80 */                        iOlI1lIi0.I00000oIO(16);
/* 83 */                        i = Integer.parseInt(strSubstring, 16);
                            } else {
/* 88 */                        i = Integer.parseInt(str);
                            }
/* 92 */                    return Integer.valueOf(i);
                        case 3:
/* 42 */                    String strSubstring2 = OlOolloIIOl0.I000II(str, OlIo0Ooi1loI.I001IIilI0O, false) ? str.substring(0, str.length() - 1) : str;
/* 47 */                    if (OlOolloIIOl0.I000l1(str, "0x", false)) {
/* 49 */                        String strSubstring3 = strSubstring2.substring(2);
/* 53 */                        iOlI1lIi0.I00000oIO(16);
/* 56 */                        j = Long.parseLong(strSubstring3, 16);
                            } else {
/* 61 */                        j = Long.parseLong(strSubstring2);
                            }
/* 65 */                    return Long.valueOf(j);
                        default:
/* 20 */                    if (str.equals("null")) {
/* 9 */                         return null;
                            }
/* 23 */                    return str;
                    }
                }

                @Override
                public final void I0000oI00(Bundle bundle, String str, Object obj) {
                    switch (this.I000l1) {
                        case 0:
/* 55 */                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
/* 45 */                    bundle.putFloat(str, ((Number) obj).floatValue());
                            break;
                        case 2:
/* 35 */                    bundle.putInt(str, ((Number) obj).intValue());
                            break;
                        case 3:
/* 25 */                    bundle.putLong(str, ((Number) obj).longValue());
                            break;
                        default:
/* 6 */                     String str2 = (String) obj;
/* 8 */                     if (str2 == null) {
/* 15 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 10 */                        bundle.putString(str, str2);
                                break;
                            }
                    }
                }
            }
