            package p000;
            
            public abstract class iOiiO0 {
                /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IIi100 I00000oIO(Io1Io0OOi011 io1Io0OOi011) {
                    int i;
                    int i2;
                    int i3;
                    String string;
/* 1 */             Io1Io0OOi011 io1Io0OOi0112 = io1Io0OOi011;
/* 3 */             int size = io1Io0OOi0112.size();
/* 7 */             boolean z = true;
/* 8 */             boolean z2 = true;
/* 9 */             int i4 = 0;
/* 10 */            String str = null;
/* 11 */            boolean z3 = false;
/* 12 */            boolean z4 = false;
/* 13 */            int iI001i1lo1io = -1;
/* 14 */            int iI001i1lo1io2 = -1;
/* 15 */            boolean z5 = false;
/* 16 */            boolean z6 = false;
/* 17 */            boolean z7 = false;
/* 18 */            int iI001i1lo1io3 = -1;
/* 20 */            int iI001i1lo1io4 = -1;
/* 22 */            boolean z8 = false;
/* 24 */            boolean z9 = false;
/* 26 */            boolean z10 = false;
/* 28 */            while (i4 < size) {
/* 30 */                String strI0000O = io1Io0OOi0112.I0000O(i4);
/* 34 */                String strI000OiO = io1Io0OOi0112.I000OiO(i4);
/* 44 */                if (OlOolloIIOl0.I000O01llI0(strI0000O, "Cache-Control", z)) {
/* 46 */                    if (str == null) {
/* 50 */                        str = strI000OiO;
                            }
/* 61 */                    i = 0;
/* 66 */                    while (i < strI000OiO.length()) {
/* 68 */                        int length = strI000OiO.length();
/* 72 */                        boolean z11 = z;
/* 74 */                        int length2 = i;
                                while (true) {
/* 75 */                            if (length2 >= length) {
/* 99 */                                i2 = size;
/* 101 */                               length2 = strI000OiO.length();
                                        break;
                                    }
/* 81 */                            i2 = size;
/* 89 */                            if (OlOoOIi0o.I00100l0("=,;", strI000OiO.charAt(length2))) {
                                        break;
                                    }
/* 92 */                            length2++;
/* 96 */                            size = i2;
                                }
/* 113 */                       String string2 = OlOoOIi0o.I00OIo(strI000OiO.substring(i, length2)).toString();
/* 121 */                       if (length2 == strI000OiO.length() || strI000OiO.charAt(length2) == ',' || strI000OiO.charAt(length2) == ';') {
/* 248 */                           i3 = length2 + 1;
/* 251 */                           string = null;
                                } else {
/* 141 */                           int length3 = length2 + 1;
/* 143 */                           byte[] bArr = OollIoI001lo.I00000oIO;
/* 145 */                           int length4 = strI000OiO.length();
                                    while (true) {
/* 149 */                               if (length3 < length4) {
/* 151 */                                   char cCharAt = strI000OiO.charAt(length3);
/* 157 */                                   if (cCharAt != ' ' && cCharAt != '\t') {
                                                break;
                                            }
/* 164 */                                   length3++;
                                        } else {
/* 167 */                                   length3 = strI000OiO.length();
                                            break;
                                        }
                                    }
/* 175 */                           if (length3 >= strI000OiO.length() || strI000OiO.charAt(length3) != '\"') {
/* 199 */                               int length5 = strI000OiO.length();
/* 203 */                               int length6 = length3;
                                        while (true) {
/* 204 */                                   if (length6 >= length5) {
/* 226 */                                       length6 = strI000OiO.length();
                                                break;
                                            }
/* 210 */                                   int i5 = length5;
/* 218 */                                   if (OlOoOIi0o.I00100l0(",;", strI000OiO.charAt(length6))) {
                                                break;
                                            }
/* 221 */                                   length6++;
/* 223 */                                   length5 = i5;
                                        }
/* 242 */                               int i6 = length6;
/* 238 */                               string = OlOoOIi0o.I00OIo(strI000OiO.substring(length3, length6)).toString();
/* 245 */                               i3 = i6;
                                    } else {
/* 185 */                               int i7 = length3 + 1;
/* 188 */                               int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(strI000OiO, '\"', i7, 4);
/* 192 */                               string = strI000OiO.substring(i7, iI001i1O0Ol);
/* 196 */                               i3 = iI001i1O0Ol + 1;
                                    }
                                }
/* 258 */                       if ("no-cache".equalsIgnoreCase(string2)) {
/* 262 */                           i = i3;
/* 263 */                           z = z11;
/* 265 */                           z3 = z;
                                } else if ("no-store".equalsIgnoreCase(string2)) {
/* 280 */                           i = i3;
/* 281 */                           z = z11;
/* 283 */                           z4 = z;
                                } else {
/* 291 */                           if ("max-age".equalsIgnoreCase(string2)) {
/* 294 */                               iI001i1lo1io = OollIoI001lo.I001i1lo1io(-1, string);
                                    } else if ("s-maxage".equalsIgnoreCase(string2)) {
/* 313 */                               iI001i1lo1io2 = OollIoI001lo.I001i1lo1io(-1, string);
                                    } else if ("private".equalsIgnoreCase(string2)) {
/* 328 */                               i = i3;
/* 329 */                               z = z11;
/* 331 */                               z5 = z;
                                    } else if ("public".equalsIgnoreCase(string2)) {
/* 343 */                               i = i3;
/* 344 */                               z = z11;
/* 346 */                               z6 = z;
                                    } else if ("must-revalidate".equalsIgnoreCase(string2)) {
/* 358 */                               i = i3;
/* 359 */                               z = z11;
/* 361 */                               z7 = z;
                                    } else if ("max-stale".equalsIgnoreCase(string2)) {
/* 374 */                               iI001i1lo1io3 = OollIoI001lo.I001i1lo1io(Integer.MAX_VALUE, string);
                                    } else if ("min-fresh".equalsIgnoreCase(string2)) {
/* 388 */                               iI001i1lo1io4 = OollIoI001lo.I001i1lo1io(-1, string);
                                    } else if ("only-if-cached".equalsIgnoreCase(string2)) {
/* 404 */                               i = i3;
/* 405 */                               z = z11;
/* 407 */                               z8 = z;
                                    } else if ("no-transform".equalsIgnoreCase(string2)) {
/* 421 */                               i = i3;
/* 422 */                               z = z11;
/* 424 */                               z9 = z;
                                    } else if ("immutable".equalsIgnoreCase(string2)) {
/* 438 */                               i = i3;
/* 439 */                               z = z11;
/* 441 */                               z10 = z;
                                    }
/* 300 */                           i = i3;
/* 301 */                           z = z11;
                                }
/* 266 */                       size = i2;
                            }
/* 450 */                   i4++;
/* 452 */                   io1Io0OOi0112 = io1Io0OOi011;
/* 454 */                   z = z;
/* 456 */                   size = size;
                        } else if (!OlOolloIIOl0.I000O01llI0(strI0000O, "Pragma", z)) {
/* 450 */                   i4++;
/* 452 */                   io1Io0OOi0112 = io1Io0OOi011;
/* 454 */                   z = z;
/* 456 */                   size = size;
                        }
/* 48 */                z2 = false;
/* 61 */                i = 0;
/* 66 */                while (i < strI000OiO.length()) {
                        }
/* 450 */               i4++;
/* 452 */               io1Io0OOi0112 = io1Io0OOi011;
/* 454 */               z = z;
/* 456 */               size = size;
                    }
/* 469 */           return new IIi100(z3, z4, iI001i1lo1io, iI001i1lo1io2, z5, z6, z7, iI001i1lo1io3, iI001i1lo1io4, z8, z9, z10, !z2 ? null : str);
                }
            }
