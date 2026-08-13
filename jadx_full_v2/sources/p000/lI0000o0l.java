            package p000;

            import android.graphics.Path;
            import java.util.List;
            
            public abstract class lI0000o0l {
                public static final void I00000oIO(I0ol0lI i0ol0lI, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
                    double d8;
                    double d9;
/* 5 */             double d10 = d5;
/* 19 */            double d11 = (d7 / 180.0d) * 3.141592653589793d;
/* 20 */            double dCos = Math.cos(d11);
/* 24 */            double dSin = Math.sin(d11);
/* 34 */            double d12 = ((d2 * dSin) + (d * dCos)) / d10;
/* 43 */            double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
/* 51 */            double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
/* 59 */            double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
/* 61 */            double d16 = d12 - d14;
/* 63 */            double d17 = d13 - d15;
/* 69 */            double d18 = (d12 + d14) / 2.0d;
/* 73 */            double d19 = (d13 + d15) / 2.0d;
/* 79 */            double d20 = (d17 * d17) + (d16 * d16);
/* 85 */            if (d20 == 0.0d) {
/* 2739 */              return;
                    }
/* 95 */            double d21 = (1.0d / d20) - 0.25d;
/* 99 */            if (d21 < 0.0d) {
/* 111 */               double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
/* 129 */               I00000oIO(i0ol0lI, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
/* 132 */               return;
                    }
/* 135 */           double dSqrt2 = Math.sqrt(d21);
/* 139 */           double d22 = d16 * dSqrt2;
/* 140 */           double d23 = dSqrt2 * d17;
/* 144 */           if (z == z2) {
/* 146 */               d8 = d18 - d23;
/* 148 */               d9 = d19 + d22;
                    } else {
/* 151 */               d8 = d18 + d23;
/* 153 */               d9 = d19 - d22;
                    }
/* 159 */           double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
/* 171 */           double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
/* 182 */           if (z2 != (dAtan22 >= 0.0d)) {
/* 194 */               dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
                    }
/* 196 */           double d24 = d8 * d10;
/* 198 */           double d25 = d9 * d6;
/* 204 */           double d26 = (d24 * dCos) - (d25 * dSin);
/* 210 */           double d27 = (d25 * dCos) + (d24 * dSin);
/* 225 */           int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
/* 226 */           double dCos2 = Math.cos(d11);
/* 230 */           double dSin2 = Math.sin(d11);
/* 234 */           double dCos3 = Math.cos(dAtan2);
/* 238 */           double dSin3 = Math.sin(dAtan2);
/* 244 */           double d28 = -d10;
/* 245 */           double d29 = d28 * dCos2;
/* 249 */           double d30 = d6 * dSin2;
/* 253 */           double d31 = (d29 * dSin3) - (d30 * dCos3);
/* 255 */           double d32 = d28 * dSin2;
/* 258 */           double d33 = d6 * dCos2;
/* 262 */           double d34 = (dCos3 * d33) + (dSin3 * d32);
/* 267 */           double d35 = dAtan22 / iCeil;
/* 268 */           double d36 = dAtan2;
/* 270 */           double d37 = d31;
/* 272 */           int i = 0;
/* 273 */           double d38 = d34;
/* 275 */           double d39 = d2;
/* 277 */           while (i < iCeil) {
/* 279 */               double d40 = d36 + d35;
/* 281 */               double dSin4 = Math.sin(d40);
/* 285 */               double dCos4 = Math.cos(d40);
/* 297 */               int i2 = iCeil;
/* 300 */               double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
/* 312 */               double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
/* 318 */               double d43 = (d29 * dSin4) - (d30 * dCos4);
/* 324 */               double d44 = (dCos4 * d33) + (dSin4 * d32);
/* 326 */               double d45 = d40 - d36;
/* 330 */               double dTan = Math.tan(d45 / 2.0d);
/* 354 */               double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
/* 403 */               i0ol0lI.I00000oIO.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
/* 408 */               d35 = d35;
/* 410 */               dSin2 = dSin2;
/* 412 */               d26 = d26;
/* 414 */               d = d41;
/* 406 */               i++;
/* 417 */               d32 = d32;
/* 418 */               d36 = d40;
/* 420 */               d38 = d44;
/* 422 */               d37 = d43;
/* 424 */               iCeil = i2;
/* 426 */               d39 = d42;
/* 427 */               d10 = d5;
                    }
                }

                public static final void I00000oOI(List list, I0ol0lI i0ol0lI) {
                    Path path;
                    int i;
                    float f;
                    int i2;
                    OO0iO0I oO0iO0I;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    float f9;
/* 1 */             List list2 = list;
/* 3 */             I0ol0lI i0ol0lI2 = i0ol0lI;
/* 5 */             Path path2 = i0ol0lI2.I00000oIO;
/* 7 */             Path path3 = i0ol0lI2.I00000oIO;
/* 9 */             Path.FillType fillType = path2.getFillType();
/* 13 */            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
/* 21 */            boolean z = fillType == fillType2;
/* 22 */            i0ol0lI2.I000OOo1O();
/* 25 */            if (!z) {
/* 28 */                fillType2 = Path.FillType.WINDING;
                    }
/* 30 */            path3.setFillType(fillType2);
/* 46 */            OO0iO0I oO0iO0I2 = list2.isEmpty() ? OO0IooOI.I0000Il00O : (OO0iO0I) list2.get(0);
/* 51 */            int size = list2.size();
/* 55 */            float f10 = 0.0f;
/* 56 */            int i3 = 0;
/* 57 */            float f11 = 0.0f;
/* 58 */            float f12 = 0.0f;
/* 59 */            float f13 = 0.0f;
/* 60 */            float f14 = 0.0f;
/* 61 */            float f15 = 0.0f;
/* 63 */            float f16 = 0.0f;
/* 65 */            while (i3 < size) {
/* 72 */                OO0iO0I oO0iO0I3 = (OO0iO0I) list2.get(i3);
/* 76 */                if (oO0iO0I3 instanceof OO0IooOI) {
/* 78 */                    path3.close();
/* 81 */                    path = path3;
/* 83 */                    i = size;
/* 85 */                    f = f10;
/* 87 */                    i2 = i3;
/* 89 */                    oO0iO0I = oO0iO0I3;
/* 91 */                    f11 = f15;
/* 93 */                    f13 = f11;
/* 94 */                    f12 = f16;
/* 96 */                    f14 = f12;
                        } else {
/* 101 */                   if (oO0iO0I3 instanceof OO0OoO) {
/* 104 */                       OO0OoO oO0OoO = (OO0OoO) oO0iO0I3;
/* 106 */                       float f17 = oO0OoO.I0000Il00O;
/* 108 */                       f13 += f17;
/* 109 */                       float f18 = oO0OoO.I0000O;
/* 111 */                       f14 += f18;
/* 112 */                       path3.rMoveTo(f17, f18);
/* 115 */                       path = path3;
/* 117 */                       i = size;
/* 119 */                       f = f10;
/* 121 */                       i2 = i3;
/* 123 */                       f15 = f13;
/* 125 */                       f16 = f14;
                            } else {
/* 133 */                       if (oO0iO0I3 instanceof OO0OIl1l10O) {
/* 136 */                           OO0OIl1l10O oO0OIl1l10O = (OO0OIl1l10O) oO0iO0I3;
/* 138 */                           float f19 = oO0OIl1l10O.I0000Il00O;
/* 140 */                           float f20 = oO0OIl1l10O.I0000O;
/* 142 */                           i0ol0lI2.I0001Ioi1lo(f19, f20);
/* 145 */                           f14 = f20;
/* 146 */                           f16 = f14;
/* 148 */                           path = path3;
/* 150 */                           f13 = f19;
/* 151 */                           f15 = f13;
                                } else {
/* 162 */                           if (oO0iO0I3 instanceof OO0Oo0lIiIl) {
/* 165 */                               OO0Oo0lIiIl oO0Oo0lIiIl = (OO0Oo0lIiIl) oO0iO0I3;
/* 167 */                               float f21 = oO0Oo0lIiIl.I0000O;
/* 169 */                               float f22 = oO0Oo0lIiIl.I0000Il00O;
/* 171 */                               path3.rLineTo(f22, f21);
/* 174 */                               f13 += f22;
/* 175 */                               f14 += f21;
                                    } else if (oO0iO0I3 instanceof OO0OIioIIl) {
/* 184 */                               OO0OIioIIl oO0OIioIIl = (OO0OIioIIl) oO0iO0I3;
/* 186 */                               float f23 = oO0OIioIIl.I0000O;
/* 188 */                               float f24 = oO0OIioIIl.I0000Il00O;
/* 190 */                               i0ol0lI2.I0000oI00(f24, f23);
/* 193 */                               f13 = f24;
/* 194 */                               path = path3;
/* 196 */                               f14 = f23;
                                    } else if (oO0iO0I3 instanceof OO0OlIi1I) {
/* 205 */                               float f25 = ((OO0OlIi1I) oO0iO0I3).I0000Il00O;
/* 207 */                               path3.rLineTo(f25, f10);
/* 210 */                               f13 += f25;
                                    } else if (oO0iO0I3 instanceof OO0O1O) {
/* 219 */                               float f26 = ((OO0O1O) oO0iO0I3).I0000Il00O;
/* 221 */                               i0ol0lI2.I0000oI00(f26, f14);
/* 224 */                               f13 = f26;
                                    } else {
/* 228 */                               if (oO0iO0I3 instanceof OO0iIOIioOI) {
/* 233 */                                   f9 = ((OO0iIOIioOI) oO0iO0I3).I0000Il00O;
/* 235 */                                   path3.rLineTo(f10, f9);
                                        } else if (oO0iO0I3 instanceof OO0iIl) {
/* 247 */                                   float f27 = ((OO0iIl) oO0iO0I3).I0000Il00O;
/* 249 */                                   i0ol0lI2.I0000oI00(f13, f27);
/* 252 */                                   f14 = f27;
                                        } else if (oO0iO0I3 instanceof OO0Oi1loOoi0) {
/* 259 */                                   OO0Oi1loOoi0 oO0Oi1loOoi0 = (OO0Oi1loOoi0) oO0iO0I3;
/* 273 */                                   path3.rCubicTo(oO0Oi1loOoi0.I0000Il00O, oO0Oi1loOoi0.I0000O, oO0Oi1loOoi0.I0000oI00, oO0Oi1loOoi0.I0001Ioi1lo, oO0Oi1loOoi0.I000II, oO0Oi1loOoi0.I000O01llI0);
/* 278 */                                   f11 = oO0Oi1loOoi0.I0000oI00 + f13;
/* 281 */                                   f12 = oO0Oi1loOoi0.I0001Ioi1lo + f14;
/* 284 */                                   f13 += oO0Oi1loOoi0.I000II;
/* 285 */                                   f9 = oO0Oi1loOoi0.I000O01llI0;
                                        } else {
/* 290 */                                   if (oO0iO0I3 instanceof OO0O0iIOOOo) {
/* 293 */                                       OO0O0iIOOOo oO0O0iIOOOo = (OO0O0iIOOOo) oO0iO0I3;
/* 307 */                                       path3.cubicTo(oO0O0iIOOOo.I0000Il00O, oO0O0iIOOOo.I0000O, oO0O0iIOOOo.I0000oI00, oO0O0iIOOOo.I0001Ioi1lo, oO0O0iIOOOo.I000II, oO0O0iIOOOo.I000O01llI0);
/* 310 */                                       f11 = oO0O0iIOOOo.I0000oI00;
/* 312 */                                       f12 = oO0O0iIOOOo.I0001Ioi1lo;
/* 314 */                                       f5 = oO0O0iIOOOo.I000II;
/* 316 */                                       f6 = oO0O0iIOOOo.I000O01llI0;
                                            } else if (oO0iO0I3 instanceof OO0i1i) {
/* 330 */                                       if (oO0iO0I2.I00000oIO) {
/* 334 */                                           f8 = f14 - f12;
/* 332 */                                           f7 = f13 - f11;
                                                } else {
/* 339 */                                           f7 = f10;
/* 340 */                                           f8 = f7;
                                                }
/* 342 */                                       OO0i1i oO0i1i = (OO0i1i) oO0iO0I3;
/* 352 */                                       path3.rCubicTo(f7, f8, oO0i1i.I0000Il00O, oO0i1i.I0000O, oO0i1i.I0000oI00, oO0i1i.I0001Ioi1lo);
/* 357 */                                       f11 = oO0i1i.I0000Il00O + f13;
/* 360 */                                       f12 = oO0i1i.I0000O + f14;
/* 363 */                                       f13 += oO0i1i.I0000oI00;
/* 364 */                                       f9 = oO0i1i.I0001Ioi1lo;
                                            } else if (oO0iO0I3 instanceof OO0OOOi1o10O) {
/* 376 */                                       if (oO0iO0I2.I00000oIO) {
/* 379 */                                           f13 = (f13 * 2.0f) - f11;
/* 381 */                                           f14 = (2.0f * f14) - f12;
                                                }
/* 386 */                                       OO0OOOi1o10O oO0OOOi1o10O = (OO0OOOi1o10O) oO0iO0I3;
/* 396 */                                       path3.cubicTo(f13, f14, oO0OOOi1o10O.I0000Il00O, oO0OOOi1o10O.I0000O, oO0OOOi1o10O.I0000oI00, oO0OOOi1o10O.I0001Ioi1lo);
/* 399 */                                       f11 = oO0OOOi1o10O.I0000Il00O;
/* 401 */                                       f12 = oO0OOOi1o10O.I0000O;
/* 403 */                                       f5 = oO0OOOi1o10O.I0000oI00;
/* 405 */                                       f6 = oO0OOOi1o10O.I0001Ioi1lo;
                                            } else if (oO0iO0I3 instanceof OO0Ool) {
/* 413 */                                       OO0Ool oO0Ool = (OO0Ool) oO0iO0I3;
/* 415 */                                       float f28 = oO0Ool.I0001Ioi1lo;
/* 417 */                                       float f29 = oO0Ool.I0000oI00;
/* 419 */                                       float f30 = oO0Ool.I0000O;
/* 421 */                                       float f31 = oO0Ool.I0000Il00O;
/* 423 */                                       path3.rQuadTo(f31, f30, f29, f28);
/* 426 */                                       float f32 = f31 + f13;
/* 427 */                                       float f33 = f30 + f14;
/* 428 */                                       f13 += f29;
/* 429 */                                       f14 += f28;
/* 430 */                                       f11 = f32;
/* 431 */                                       path = path3;
/* 433 */                                       f12 = f33;
                                            } else {
/* 438 */                                       if (oO0iO0I3 instanceof OO0OO0ooli) {
/* 441 */                                           OO0OO0ooli oO0OO0ooli = (OO0OO0ooli) oO0iO0I3;
/* 443 */                                           float f34 = oO0OO0ooli.I0001Ioi1lo;
/* 445 */                                           float f35 = oO0OO0ooli.I0000oI00;
/* 447 */                                           float f36 = oO0OO0ooli.I0000O;
/* 449 */                                           f4 = oO0OO0ooli.I0000Il00O;
/* 451 */                                           path3.quadTo(f4, f36, f35, f34);
/* 454 */                                           path = path3;
/* 456 */                                           f14 = f34;
/* 457 */                                           f13 = f35;
/* 458 */                                           f12 = f36;
                                                } else if (oO0iO0I3 instanceof OO0i1oIl) {
/* 476 */                                           if (oO0iO0I2.I00000oOI) {
/* 478 */                                               f2 = f13 - f11;
/* 480 */                                               f3 = f14 - f12;
                                                    } else {
/* 483 */                                               f2 = f10;
/* 484 */                                               f3 = f2;
                                                    }
/* 486 */                                           OO0i1oIl oO0i1oIl = (OO0i1oIl) oO0iO0I3;
/* 488 */                                           float f37 = oO0i1oIl.I0000O;
/* 490 */                                           float f38 = oO0i1oIl.I0000Il00O;
/* 492 */                                           path3.rQuadTo(f2, f3, f38, f37);
/* 495 */                                           f4 = f2 + f13;
/* 496 */                                           float f39 = f3 + f14;
/* 497 */                                           f13 += f38;
/* 498 */                                           f14 += f37;
/* 499 */                                           path = path3;
/* 501 */                                           f12 = f39;
                                                } else if (oO0iO0I3 instanceof OO0Oi0I01) {
/* 509 */                                           if (oO0iO0I2.I00000oOI) {
/* 512 */                                               f13 = (f13 * 2.0f) - f11;
/* 514 */                                               f14 = (2.0f * f14) - f12;
                                                    }
/* 517 */                                           OO0Oi0I01 oO0Oi0I01 = (OO0Oi0I01) oO0iO0I3;
/* 519 */                                           float f40 = oO0Oi0I01.I0000O;
/* 521 */                                           float f41 = oO0Oi0I01.I0000Il00O;
/* 523 */                                           path3.quadTo(f13, f14, f41, f40);
/* 526 */                                           path = path3;
/* 528 */                                           i = size;
/* 530 */                                           f = f10;
/* 532 */                                           i2 = i3;
/* 534 */                                           f12 = f14;
/* 535 */                                           oO0iO0I = oO0iO0I3;
/* 537 */                                           f14 = f40;
/* 538 */                                           f11 = f13;
/* 539 */                                           f13 = f41;
                                                } else if (oO0iO0I3 instanceof OO0Oi0loI) {
/* 547 */                                           OO0Oi0loI oO0Oi0loI = (OO0Oi0loI) oO0iO0I3;
/* 551 */                                           float f42 = oO0Oi0loI.I000O01llI0 + f13;
/* 554 */                                           float f43 = oO0Oi0loI.I000OOo1O + f14;
/* 579 */                                           i = size;
/* 581 */                                           f = 0.0f;
/* 596 */                                           path = path3;
/* 598 */                                           i2 = i3;
/* 611 */                                           I00000oIO(i0ol0lI, f13, f14, f42, f43, oO0Oi0loI.I0000Il00O, oO0Oi0loI.I0000O, oO0Oi0loI.I0000oI00, oO0Oi0loI.I0001Ioi1lo, oO0Oi0loI.I000II);
/* 614 */                                           f11 = f42;
/* 616 */                                           f13 = f11;
/* 617 */                                           f12 = f43;
/* 619 */                                           f14 = f12;
/* 620 */                                           oO0iO0I = oO0iO0I3;
                                                } else {
/* 623 */                                           path = path3;
/* 625 */                                           i = size;
/* 627 */                                           f = f10;
/* 629 */                                           i2 = i3;
/* 634 */                                           if (!(oO0iO0I3 instanceof OO0IioI0lo0)) {
/* 707 */                                               I000II.I00000oIO();
/* 900 */                                               return;
                                                    }
/* 639 */                                           OO0IioI0lo0 oO0IioI0lo0 = (OO0IioI0lo0) oO0iO0I3;
/* 641 */                                           float f44 = oO0IioI0lo0.I000OOo1O;
/* 643 */                                           float f45 = oO0IioI0lo0.I000O01llI0;
/* 655 */                                           oO0iO0I = oO0iO0I3;
/* 683 */                                           I00000oIO(i0ol0lI, f13, f14, f45, f44, oO0IioI0lo0.I0000Il00O, oO0IioI0lo0.I0000O, oO0IioI0lo0.I0000oI00, oO0IioI0lo0.I0001Ioi1lo, oO0IioI0lo0.I000II);
/* 686 */                                           f12 = f44;
/* 687 */                                           f14 = f12;
/* 688 */                                           f11 = f45;
/* 690 */                                           f13 = f11;
                                                }
/* 459 */                                       i = size;
/* 461 */                                       f = f10;
/* 463 */                                       i2 = i3;
/* 465 */                                       oO0iO0I = oO0iO0I3;
/* 467 */                                       f11 = f4;
                                            }
/* 318 */                                   f14 = f6;
/* 319 */                                   path = path3;
/* 321 */                                   f13 = f5;
                                        }
/* 238 */                               f14 += f9;
                                    }
/* 176 */                           path = path3;
                                }
/* 153 */                       i = size;
/* 155 */                       f = f10;
/* 157 */                       i2 = i3;
                            }
/* 127 */                   oO0iO0I = oO0iO0I3;
                        }
/* 691 */               i3 = i2 + 1;
/* 693 */               list2 = list;
/* 695 */               i0ol0lI2 = i0ol0lI;
/* 697 */               size = i;
/* 699 */               path3 = path;
/* 701 */               oO0iO0I2 = oO0iO0I;
/* 703 */               f10 = f;
                    }
                }
            }
