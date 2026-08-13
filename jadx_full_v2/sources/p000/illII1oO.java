            package p000;

            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.RenderNode;
            
            public abstract class illII1oO {
                /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IilloIOOO0i iilloIOOO0i, Io10IOI io10IOI) {
                    boolean z;
                    Canvas canvas;
                    boolean z2;
                    boolean z3;
                    Canvas canvas2;
                    float f;
                    float f2;
                    I0oiil10Ili i0oiil10IliI00000oIO;
                    float f3;
                    float f4;
                    Matrix matrix;
/* 7 */             IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 17 */            Io10IOI io10IOI2 = (Io10IOI) iilloIOOO0i.I00iiI().I00iiO;
/* 19 */            Io10OiIIOi0o io10OiIIOi0o = io10IOI.I00000oIO;
/* 21 */            Io10OiIIOi0o io10OiIIOi0o2 = io10IOI.I00000oIO;
/* 23 */            RenderNode renderNode = io10OiIIOi0o.I0000Il00O;
/* 27 */            if (io10IOI.I0010o) {
/* 29 */                return;
                    }
/* 30 */            long j = io10IOI.I000O01llI0;
/* 32 */            Canvas canvas3 = I0lO01i00oi.I00000oIO;
/* 37 */            Canvas canvas4 = ((I0lIooIo1) iIolOoI0010o).I00000oIO;
/* 39 */            boolean zIsHardwareAccelerated = canvas4.isHardwareAccelerated();
/* 43 */            if (zIsHardwareAccelerated) {
/* 232 */               z = zIsHardwareAccelerated;
/* 234 */               canvas = canvas4;
                    } else {
/* 45 */                long j2 = io10IOI.I00111O;
/* 51 */                float f5 = (int) (j2 >> 32);
/* 56 */                float f6 = f5 - io10IOI.I001IO000;
/* 65 */                float f7 = (int) (j2 & 4294967295L);
/* 70 */                float f8 = f7 - io10IOI.I001i1O0Ol;
/* 72 */                z = zIsHardwareAccelerated;
/* 74 */                canvas = canvas4;
/* 75 */                long j3 = io10IOI.I001IIilI0O;
/* 87 */                float f9 = f5 + ((int) (j3 >> 32)) + io10IOI.I001i1lo1io;
/* 96 */                float f10 = f7 + ((int) (j3 & 4294967295L)) + io10IOI.I001iOo1i0O;
/* 97 */                float f11 = io10OiIIOi0o2.I000O01llI0;
/* 99 */                IOOil0 iOOil0 = io10OiIIOi0o.I000OiO;
/* 101 */               int i = io10OiIIOi0o.I000OOo1O;
/* 107 */               if (f11 >= 1.0f) {
/* 109 */                   f = f10;
/* 112 */                   if (i == 3 && iOOil0 == null) {
/* 118 */                       f2 = f8;
/* 121 */                       if (io10OiIIOi0o.I00IO1 != 1) {
/* 124 */                           canvas.save();
/* 127 */                           f3 = f6;
/* 128 */                           f4 = f2;
                                }
/* 171 */                       canvas.translate(f3, f4);
/* 174 */                       matrix = io10OiIIOi0o.I0001Ioi1lo;
/* 176 */                       if (matrix == null) {
/* 180 */                           matrix = new Matrix();
/* 183 */                           io10OiIIOi0o.I0001Ioi1lo = matrix;
                                }
/* 185 */                       renderNode.getMatrix(matrix);
/* 194 */                       matrix.preTranslate(io10IOI.I001IO000, io10IOI.I001i1O0Ol);
/* 197 */                       canvas.concat(matrix);
/* 200 */                       long j4 = io10IOI.I000O01llI0;
/* 202 */                       float f12 = io10IOI.I001IO000;
/* 229 */                       io10IOI.I000O01llI0 = OIOlIiiioi.I0001Ioi1lo(j4, (Float.floatToRawIntBits(io10IOI.I001i1O0Ol) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
                            }
/* 137 */                   i0oiil10IliI00000oIO = io10IOI.I00100l0;
/* 139 */                   if (i0oiil10IliI00000oIO == null) {
/* 141 */                       i0oiil10IliI00000oIO = iOIlil0Il1i.I00000oIO();
/* 145 */                       io10IOI.I00100l0 = i0oiil10IliI00000oIO;
                            }
/* 147 */                   i0oiil10IliI00000oIO.I00100l0(f11);
/* 150 */                   i0oiil10IliI00000oIO.I0010I0i(i);
/* 153 */                   i0oiil10IliI00000oIO.I00111O(iOOil0);
/* 158 */                   Paint paint = (Paint) i0oiil10IliI00000oIO.I00iiO;
/* 160 */                   f3 = f6;
/* 164 */                   f4 = f2;
/* 167 */                   canvas.saveLayer(f3, f4, f9, f, paint);
/* 170 */                   canvas = canvas;
/* 171 */                   canvas.translate(f3, f4);
/* 174 */                   matrix = io10OiIIOi0o.I0001Ioi1lo;
/* 176 */                   if (matrix == null) {
                            }
/* 185 */                   renderNode.getMatrix(matrix);
/* 194 */                   matrix.preTranslate(io10IOI.I001IO000, io10IOI.I001i1O0Ol);
/* 197 */                   canvas.concat(matrix);
/* 200 */                   long j42 = io10IOI.I000O01llI0;
/* 202 */                   float f122 = io10IOI.I001IO000;
/* 229 */                   io10IOI.I000O01llI0 = OIOlIiiioi.I0001Ioi1lo(j42, (Float.floatToRawIntBits(io10IOI.I001i1O0Ol) & 4294967295L) | (Float.floatToRawIntBits(f122) << 32));
                        } else {
/* 134 */                   f = f10;
                        }
/* 131 */               f2 = f8;
/* 137 */               i0oiil10IliI00000oIO = io10IOI.I00100l0;
/* 139 */               if (i0oiil10IliI00000oIO == null) {
                        }
/* 147 */               i0oiil10IliI00000oIO.I00100l0(f11);
/* 150 */               i0oiil10IliI00000oIO.I0010I0i(i);
/* 153 */               i0oiil10IliI00000oIO.I00111O(iOOil0);
/* 158 */               Paint paint2 = (Paint) i0oiil10IliI00000oIO.I00iiO;
/* 160 */               f3 = f6;
/* 164 */               f4 = f2;
/* 167 */               canvas.saveLayer(f3, f4, f9, f, paint2);
/* 170 */               canvas = canvas;
/* 171 */               canvas.translate(f3, f4);
/* 174 */               matrix = io10OiIIOi0o.I0001Ioi1lo;
/* 176 */               if (matrix == null) {
                        }
/* 185 */               renderNode.getMatrix(matrix);
/* 194 */               matrix.preTranslate(io10IOI.I001IO000, io10IOI.I001i1O0Ol);
/* 197 */               canvas.concat(matrix);
/* 200 */               long j422 = io10IOI.I000O01llI0;
/* 202 */               float f1222 = io10IOI.I001IO000;
/* 229 */               io10IOI.I000O01llI0 = OIOlIiiioi.I0001Ioi1lo(j422, (Float.floatToRawIntBits(io10IOI.I001i1O0Ol) & 4294967295L) | (Float.floatToRawIntBits(f1222) << 32));
                    }
/* 235 */           io10IOI.I00000oIO();
/* 242 */           if (!renderNode.hasDisplayList()) {
                        try {
/* 244 */                   io10IOI.I0001Ioi1lo();
                        } catch (Throwable unused) {
                        }
                    }
/* 252 */           boolean z4 = false;
/* 257 */           boolean z5 = io10OiIIOi0o2.I00100l0 > 0.0f;
/* 258 */           if (z5) {
/* 260 */               iIolOoI0010o.I0010o();
                    }
/* 271 */           boolean z6 = !z && io10IOI.I001lIiIIo1O;
/* 272 */           if (z6) {
/* 274 */               iIolOoI0010o.I000II();
/* 277 */               l1lOoiII1l l1looiii1lI0000O = io10IOI.I0000O();
/* 283 */               if (l1looiii1lI0000O instanceof OIioiIl) {
/* 289 */                   IIolOo.I00100o1O0lo(iIolOoI0010o, ((OIioiIl) l1looiii1lI0000O).I00000oIO);
                        } else if (l1looiii1lI0000O instanceof OIiolOlo1iI) {
/* 297 */                   I0ol0lI i0ol0lII00000oIO = io10IOI.I000lI;
/* 299 */                   if (i0ol0lII00000oIO != null) {
/* 301 */                       i0ol0lII00000oIO.I000OOo1O();
                            } else {
/* 305 */                       i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 309 */                       io10IOI.I000lI = i0ol0lII00000oIO;
                            }
/* 315 */                   I0ol0lI.I0000Il00O(i0ol0lII00000oIO, ((OIiolOlo1iI) l1looiii1lI0000O).I00000oIO);
/* 318 */                   iIolOoI0010o.I000l1(i0ol0lII00000oIO);
                        } else {
/* 324 */                   if (!(l1looiii1lI0000O instanceof OIio1O0ll0I)) {
/* 334 */                       I000II.I00000oIO();
/* 337 */                       return;
                            }
/* 330 */                   iIolOoI0010o.I000l1(((OIio1O0ll0I) l1looiii1lI0000O).I00000oIO);
                        }
                    }
/* 338 */           if (io10IOI2 != null) {
/* 340 */               IOI0oloi01 iOI0oloi01 = io10IOI2.I0010I0i;
/* 344 */               if (!iOI0oloi01.I00000oIO) {
/* 348 */                   Iolilol.I00000oIO("Only add dependencies during a tracking");
                        }
/* 353 */               OI10IIO oi10iio = (OI10IIO) iOI0oloi01.I0000O;
/* 356 */               if (oi10iio != null) {
/* 358 */                   oi10iio.I00000oIO(io10IOI);
                        } else if (((Io10IOI) iOI0oloi01.I00000oOI) != null) {
/* 368 */                   OI10IIO oi10iio2 = OiO11lliO.I00000oIO;
/* 372 */                   OI10IIO oi10iio3 = new OI10IIO();
/* 379 */                   oi10iio3.I00000oIO((Io10IOI) iOI0oloi01.I00000oOI);
/* 382 */                   oi10iio3.I00000oIO(io10IOI);
/* 385 */                   iOI0oloi01.I0000O = oi10iio3;
/* 387 */                   iOI0oloi01.I00000oOI = null;
                        } else {
/* 390 */                   iOI0oloi01.I00000oOI = io10IOI;
                        }
/* 394 */               OI10IIO oi10iio4 = (OI10IIO) iOI0oloi01.I0000oI00;
/* 396 */               if (oi10iio4 != null) {
                            z4 = !oi10iio4.I000l1(io10IOI);
                        } else if (((Io10IOI) iOI0oloi01.I0000Il00O) != io10IOI) {
/* 415 */                   z4 = true;
                        } else {
/* 418 */                   iOI0oloi01.I0000Il00O = null;
                        }
/* 420 */               if (z4) {
                            io10IOI.I00100o1O0lo++;
                        }
                    }
/* 429 */           I0lIooIo1 i0lIooIo1 = (I0lIooIo1) iIolOoI0010o;
/* 437 */           if (i0lIooIo1.I00000oIO.isHardwareAccelerated()) {
/* 545 */               z2 = z5;
/* 547 */               z3 = z6;
/* 549 */               canvas2 = canvas;
/* 551 */               Canvas canvas5 = I0lO01i00oi.I00000oIO;
/* 555 */               i0lIooIo1.I00000oIO.drawRenderNode(renderNode);
                    } else {
/* 439 */               IIolilIo iIolilIo = io10IOI.I000oI1ioi;
/* 441 */               if (iIolilIo == null) {
/* 445 */                   iIolilIo = new IIolilIo();
/* 448 */                   io10IOI.I000oI1ioi = iIolilIo;
                        }
/* 450 */               IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 452 */               IiIooOOOI iiIooOOOI = io10IOI.I00000oOI;
/* 454 */               O0iOOoiioO o0iOOoiioO = io10IOI.I0000Il00O;
/* 458 */               long jI00000oOI = l000O1l.I00000oOI(io10IOI.I001IIilI0O);
/* 462 */               IiIooOOOI iiIooOOOII001IIilI0O = iOO000ilo.I001IIilI0O();
/* 466 */               O0iOOoiioO o0iOOoiioOI001i1O0Ol = iOO000ilo.I001i1O0Ol();
/* 470 */               IIolOo iIolOoI0010o2 = iOO000ilo.I0010o();
/* 474 */               z2 = z5;
/* 476 */               z3 = z6;
/* 478 */               long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 482 */               canvas2 = canvas;
/* 486 */               Io10IOI io10IOI3 = (Io10IOI) iOO000ilo.I00iiO;
/* 488 */               iOO000ilo.I00IioO0OiOi(iiIooOOOI);
/* 491 */               iOO000ilo.I00IlilI0i0i(o0iOOoiioO);
/* 494 */               iOO000ilo.I00IOO(iIolOoI0010o);
/* 497 */               iOO000ilo.I00Io1lO(jI00000oOI);
/* 500 */               iOO000ilo.I00iiO = io10IOI;
/* 502 */               iIolOoI0010o.I000II();
                        try {
/* 505 */                   io10IOI.I0000Il00O(iIolilIo);
                        } finally {
/* 527 */                   iIolOoI0010o.I00100l0();
/* 530 */                   iOO000ilo.I00IioO0OiOi(iiIooOOOII001IIilI0O);
/* 533 */                   iOO000ilo.I00IlilI0i0i(o0iOOoiioOI001i1O0Ol);
/* 536 */                   iOO000ilo.I00IOO(iIolOoI0010o2);
/* 539 */                   iOO000ilo.I00Io1lO(jI001iOo1i0O);
/* 542 */                   iOO000ilo.I00iiO = io10IOI3;
                        }
                    }
/* 558 */           if (z3) {
/* 560 */               iIolOoI0010o.I00100l0();
                    }
/* 563 */           if (z2) {
/* 565 */               iIolOoI0010o.I000OOo1O();
                    }
/* 568 */           if (!z) {
/* 570 */               canvas2.restore();
                    }
/* 573 */           io10IOI.I000O01llI0 = j;
                }
            }
