            package p000;
            
            public final class Oolo01oOIoo1 implements O0O01001OOII {
                public static final Oolo01oOIoo1 I00000oIO = new Oolo01oOIoo1();
                public static final OOIii1ili I00000oOI = new OOIii1ili("kotlin.uuid.Uuid", OOIOoio0iiI.I000OiO);

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 1 */             String strI0010o = ii1iO1O.I0010o();
/* 5 */             int length = strI0010o.length();
/* 17 */            int i = 0;
/* 20 */            if (length == 32) {
/* 313 */               long j = 0;
/* 314 */               while (i < 16) {
/* 316 */                   long j2 = j << 4;
/* 317 */                   char cCharAt = strI0010o.charAt(i);
/* 323 */                   if ((cCharAt >>> '\b') == 0) {
/* 327 */                       long j3 = Io1i1io.I00000oOI[cCharAt];
/* 331 */                       if (j3 >= 0) {
/* 333 */                           j = j2 | j3;
/* 334 */                           i++;
                                }
                            }
/* 337 */                   li1O0IIOo.I0000O(strI0010o, i, "a hexadecimal digit");
/* 340 */                   throw null;
                        }
/* 341 */               long j4 = 0;
/* 342 */               for (int i2 = 16; i2 < 32; i2++) {
/* 344 */                   long j5 = j4 << 4;
/* 345 */                   char cCharAt2 = strI0010o.charAt(i2);
/* 351 */                   if ((cCharAt2 >>> '\b') == 0) {
/* 355 */                       long j6 = Io1i1io.I00000oOI[cCharAt2];
/* 359 */                       if (j6 >= 0) {
/* 361 */                           j4 = j5 | j6;
                                }
                            }
/* 365 */                   li1O0IIOo.I0000O(strI0010o, i2, "a hexadecimal digit");
/* 368 */                   throw null;
                        }
/* 371 */               if (j != 0 || j4 != 0) {
/* 382 */                   return new Oollooi1l(j, j4);
                        }
                    } else {
/* 24 */                if (length != 36) {
/* 32 */                    StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
/* 55 */                    sb.append(strI0010o.length() <= 64 ? strI0010o : strI0010o.substring(0, 64).concat("..."));
/* 60 */                    sb.append("\" of length ");
/* 67 */                    sb.append(strI0010o.length());
/* 77 */                    throw new IllegalArgumentException(sb.toString());
                        }
/* 78 */                long j7 = 0;
/* 81 */                while (i < 8) {
/* 83 */                    long j8 = j7 << 4;
/* 84 */                    char cCharAt3 = strI0010o.charAt(i);
/* 90 */                    if ((cCharAt3 >>> '\b') == 0) {
/* 94 */                        long j9 = Io1i1io.I00000oOI[cCharAt3];
/* 98 */                        if (j9 >= 0) {
/* 100 */                           j7 = j8 | j9;
/* 101 */                           i++;
                                }
                            }
/* 104 */                   li1O0IIOo.I0000O(strI0010o, i, "a hexadecimal digit");
/* 107 */                   throw null;
                        }
/* 116 */               if (strI0010o.charAt(8) != '-') {
/* 309 */                   li1O0IIOo.I0000O(strI0010o, 8, "'-' (hyphen)");
/* 312 */                   throw null;
                        }
/* 120 */               long j10 = 0;
/* 123 */               for (int i3 = 9; i3 < 13; i3++) {
/* 125 */                   long j11 = j10 << 4;
/* 126 */                   char cCharAt4 = strI0010o.charAt(i3);
/* 132 */                   if ((cCharAt4 >>> '\b') == 0) {
/* 136 */                       long j12 = Io1i1io.I00000oOI[cCharAt4];
/* 140 */                       if (j12 >= 0) {
/* 142 */                           j10 = j11 | j12;
                                }
                            }
/* 147 */                   li1O0IIOo.I0000O(strI0010o, i3, "a hexadecimal digit");
/* 150 */                   throw null;
                        }
/* 155 */               if (strI0010o.charAt(13) != '-') {
/* 305 */                   li1O0IIOo.I0000O(strI0010o, 13, "'-' (hyphen)");
/* 308 */                   throw null;
                        }
/* 159 */               long j13 = 0;
/* 163 */               for (int i4 = 14; i4 < 18; i4++) {
/* 165 */                   long j14 = j13 << 4;
/* 167 */                   char cCharAt5 = strI0010o.charAt(i4);
/* 173 */                   if ((cCharAt5 >>> '\b') == 0) {
/* 177 */                       long j15 = Io1i1io.I00000oOI[cCharAt5];
/* 181 */                       if (j15 >= 0) {
/* 183 */                           j13 = j14 | j15;
                                }
                            }
/* 188 */                   li1O0IIOo.I0000O(strI0010o, i4, "a hexadecimal digit");
/* 191 */                   throw null;
                        }
/* 196 */               if (strI0010o.charAt(18) != '-') {
/* 301 */                   li1O0IIOo.I0000O(strI0010o, 18, "'-' (hyphen)");
/* 304 */                   throw null;
                        }
/* 200 */               long j16 = 0;
/* 204 */               for (int i5 = 19; i5 < 23; i5++) {
/* 206 */                   long j17 = j16 << 4;
/* 208 */                   char cCharAt6 = strI0010o.charAt(i5);
/* 214 */                   if ((cCharAt6 >>> '\b') == 0) {
/* 218 */                       long j18 = Io1i1io.I00000oOI[cCharAt6];
/* 222 */                       if (j18 >= 0) {
/* 224 */                           j16 = j17 | j18;
                                }
                            }
/* 229 */                   li1O0IIOo.I0000O(strI0010o, i5, "a hexadecimal digit");
/* 232 */                   throw null;
                        }
/* 237 */               if (strI0010o.charAt(23) != '-') {
/* 297 */                   li1O0IIOo.I0000O(strI0010o, 23, "'-' (hyphen)");
/* 300 */                   throw null;
                        }
/* 241 */               long j19 = 0;
/* 242 */               for (int i6 = 24; i6 < 36; i6++) {
/* 244 */                   long j20 = j19 << 4;
/* 245 */                   char cCharAt7 = strI0010o.charAt(i6);
/* 251 */                   if ((cCharAt7 >>> '\b') == 0) {
/* 255 */                       long j21 = Io1i1io.I00000oOI[cCharAt7];
/* 259 */                       if (j21 >= 0) {
/* 261 */                           j19 = j20 | j21;
                                }
                            }
/* 266 */                   li1O0IIOo.I0000O(strI0010o, i6, "a hexadecimal digit");
/* 269 */                   throw null;
                        }
/* 275 */               long j22 = (j7 << 32) | (j10 << 16) | j13;
/* 281 */               long j23 = (j16 << 48) | j19;
/* 284 */               if (j22 != 0 || j23 != 0) {
/* 293 */                   return new Oollooi1l(j22, j23);
                        }
                    }
/* 377 */           return Oollooi1l.I00iiO;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 7 */             il0I1ii.I001lloI(((Oollooi1l) obj).toString());
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }
