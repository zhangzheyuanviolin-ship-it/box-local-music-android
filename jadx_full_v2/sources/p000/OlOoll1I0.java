            package p000;
            
            public abstract class OlOoll1I0 extends OlOoll0Ill {
                /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I0000oI00(String str) {
                    char c;
                    boolean z;
                    boolean z2;
                    int i;
                    boolean z3;
                    boolean z4;
/* 7 */             boolean z5 = true;
/* 8 */             int length = str.length() - 1;
/* 10 */            int i2 = 0;
                    while (true) {
/* 11 */                c = ' ';
/* 13 */                if (i2 > length || str.charAt(i2) > ' ') {
                            break;
                        }
/* 21 */                i2++;
                    }
/* 24 */            if (i2 > length) {
/* 9 */                 return false;
                    }
/* 27 */            while (length > i2 && str.charAt(length) <= ' ') {
                        length--;
                    }
/* 46 */            if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
/* 54 */                i2++;
                    }
/* 56 */            if (i2 > length) {
/* 9 */                 return false;
                    }
/* 73 */            if (str.charAt(i2) != '0') {
/* 198 */               z = true;
/* 202 */               z2 = false;
                    } else {
/* 75 */                int i3 = i2 + 1;
/* 77 */                if (i3 > length) {
/* 7 */                     return true;
                        }
/* 87 */                if ((str.charAt(i3) | ' ') == 120) {
/* 89 */                    int i4 = i2 + 2;
/* 91 */                    int i5 = i4;
                            while (true) {
/* 93 */                        if (i5 > length) {
/* 120 */                           z = z5;
                                    break;
                                }
/* 101 */                       z = z5;
/* 105 */                       if (((str.charAt(i5) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                    break;
                                }
/* 115 */                       i5++;
/* 117 */                       z5 = z;
                            }
/* 127 */                   boolean z6 = i4 != i5 ? z : false;
/* 128 */                   if (i5 <= length) {
/* 138 */                       if (str.charAt(i5) == '.') {
/* 140 */                           int i6 = i5 + 1;
/* 142 */                           int i7 = i6;
/* 143 */                           while (i7 <= length) {
/* 151 */                               char c2 = c;
/* 155 */                               if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                            break;
                                        }
/* 165 */                               i7++;
/* 167 */                               c = c2;
                                    }
/* 177 */                           z4 = i6 != i7 ? z : false;
/* 178 */                           i5 = i7;
                                } else {
/* 182 */                           z4 = false;
                                }
/* 183 */                       if (z6 || z4) {
/* 188 */                           i2 = i5;
                                }
/* 189 */                       if (i2 != -1 || i2 > length) {
/* 9 */                             return false;
                                }
/* 194 */                       z2 = z;
                            }
/* 132 */                   i2 = -1;
/* 189 */                   if (i2 != -1) {
                            }
/* 9 */                     return false;
                        }
                    }
/* 203 */           if (!z2) {
/* 205 */               int i8 = i2;
/* 206 */               while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
/* 216 */                   i8++;
                        }
/* 224 */               boolean z7 = i2 != i8 ? z : false;
/* 225 */               if (i8 > length) {
/* 227 */                   i2 = i8;
                        } else {
/* 233 */                   if (str.charAt(i8) == '.') {
/* 235 */                       int i9 = i8 + 1;
/* 237 */                       i = i9;
/* 238 */                       while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
/* 248 */                           i++;
                                }
/* 251 */                       if (i9 != i) {
/* 253 */                           z3 = z;
                                }
/* 258 */                       if (!z7 || z3) {
/* 290 */                           i2 = i;
                                } else {
/* 276 */                           String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
/* 287 */                           i2 = (str2 != null && OlOoOIi0o.I001IIilI0O(str, str2, i, false) == i) ? length + 1 : -1;
                                }
                            } else {
/* 256 */                       i = i8;
                            }
/* 257 */                   z3 = false;
/* 258 */                   if (z7) {
/* 290 */                       i2 = i;
                            }
                        }
/* 291 */               if (i2 == -1) {
/* 9 */                     return false;
                        }
/* 294 */               if (i2 > length) {
/* 296 */                   return z;
                        }
                    }
/* 297 */           int i10 = i2 + 1;
/* 303 */           int iCharAt = str.charAt(i2) | ' ';
/* 316 */           if (iCharAt != (z2 ? 112 : 101)) {
/* 318 */               if (z2 || (!(iCharAt == 102 || iCharAt == 100) || i10 <= length)) {
/* 9 */                     return false;
                        }
/* 326 */               return z;
                    }
/* 328 */           if (i10 > length) {
/* 9 */                 return false;
                    }
/* 335 */           if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
/* 9 */                 return false;
                    }
/* 348 */           while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
/* 358 */               i10++;
                    }
/* 361 */           if (i10 > length) {
/* 363 */               return z;
                    }
/* 364 */           if (i10 != length) {
/* 9 */                 return false;
                    }
/* 370 */           int iCharAt2 = str.charAt(i10) | ' ';
/* 372 */           if (iCharAt2 == 102 || iCharAt2 == 100) {
/* 378 */               return z;
                    }
/* 9 */             return false;
                }

                public static Double I0001Ioi1lo(String str) {
                    try {
/* 6 */                 if (I0000oI00(str)) {
/* 12 */                    return Double.valueOf(Double.parseDouble(str));
                        }
                    } catch (NumberFormatException unused) {
                    }
/* 1 */             return null;
                }
            }
