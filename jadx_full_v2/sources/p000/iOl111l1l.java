            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOl111l1l {
                /* JADX WARN: Removed duplicated region for block: B:114:0x0195  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IO0i0i iO0i0i, IO0i0lIl iO0i0lIl, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    boolean z2;
                    IO0i0lIl iO0i0lIl2;
                    OOloioIl oOloioIlI001IO000;
                    IO0i0lIl iO0i0lIlI00000oOI;
                    int i4;
                    IO0i0lIl iO0i0lIl3;
/* 1 */             IllOOo00lI illOOo00lI2 = illOOo00lI;
/* 3 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 20 */            iloI0lOlll1.I00i0O(2136075085);
/* 25 */            if ((i & 6) == 0) {
/* 36 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 4 : 2) | i;
                    } else {
/* 38 */                i3 = i;
                    }
/* 41 */            if ((i & 48) == 0) {
/* 54 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                    }
/* 55 */            int i5 = i2 & 4;
/* 57 */            if (i5 == 0) {
/* 66 */                if ((i & 384) == 0) {
/* 68 */                    z2 = z;
/* 81 */                    i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 84 */                if ((i & 3072) == 0) {
/* 97 */                    i3 |= iloI0lOlll1.I000II(oioOIi1o0I) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 100 */               if ((i & 24576) == 0) {
/* 113 */                   i3 |= iloI0lOlll1.I000II(iO0i0i) ? 16384 : 8192;
                        }
/* 117 */               if ((196608 & i) != 0) {
/* 121 */                   if ((i2 & 32) == 0) {
/* 123 */                       iO0i0lIl2 = iO0i0lIl;
/* 129 */                       int i6 = iloI0lOlll1.I000II(iO0i0lIl2) ? 131072 : 65536;
/* 138 */                       i3 |= i6;
                            } else {
/* 134 */                       iO0i0lIl2 = iO0i0lIl;
                            }
/* 138 */                   i3 |= i6;
                        } else {
/* 140 */                   iO0i0lIl2 = iO0i0lIl;
                        }
/* 147 */               if ((i2 & 64) == 0) {
/* 149 */                   i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
/* 166 */                   i3 |= iloI0lOlll1.I000II(null) ? 1048576 : 524288;
                        }
/* 171 */               if ((i2 & Barcode.FORMAT_ITF) == 0) {
/* 173 */                   i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
/* 190 */                   i3 |= iloI0lOlll1.I000II(null) ? 8388608 : 4194304;
                        }
/* 194 */               if ((100663296 & i) == 0) {
/* 207 */                   i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 67108864 : 33554432;
                        }
/* 230 */               if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) == 38347922)) {
/* 406 */                   iloI0lOlll1.I00OilO00Il();
                        } else {
/* 232 */                   iloI0lOlll1.I00Ol00();
/* 240 */                   if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 260 */                       if (i5 != 0) {
/* 262 */                           z2 = true;
                                }
/* 266 */                       if ((i2 & 32) != 0) {
/* 268 */                           iO0i0lIlI00000oOI = iOl10Oi0oo0.I00000oOI();
/* 272 */                           i3 &= -458753;
                                } else {
/* 274 */                           iO0i0lIlI00000oOI = iO0i0lIl2;
                                }
/* 275 */                       IO0i0lIl iO0i0lIl4 = iO0i0lIlI00000oOI;
/* 277 */                       i4 = i3;
/* 278 */                       iO0i0lIl3 = iO0i0lIl4;
                            } else {
/* 249 */                       iloI0lOlll1.I00OilO00Il();
/* 254 */                       if ((i2 & 32) != 0) {
/* 256 */                           i3 &= -458753;
                                }
/* 257 */                       i4 = i3;
/* 258 */                       iO0i0lIl3 = iO0i0lIl2;
                            }
/* 280 */                   iloI0lOlll1.I0010o();
/* 286 */                   iloI0lOlll1.I00i01iIIliI(1577873102);
/* 289 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 295 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 297 */                       objI00O0i0ii = l001l0.I00000oIO();
/* 301 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 304 */                   OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 306 */                   iloI0lOlll1.I0010I0i(false);
/* 314 */                   long j = z2 ? iO0i0i.I00000oIO : iO0i0i.I0000Il00O;
/* 316 */                   int i7 = i4;
/* 323 */                   long j2 = z2 ? iO0i0i.I00000oOI : iO0i0i.I0000O;
/* 345 */                   float f = ((Iil1010O) iO0i0lIl3.I00000oIO(z2, oI0lOIiOIOOo, iloI0lOlll1, ((i7 >> 6) & 14) | ((i7 >> 9) & 896)).getValue()).I00iOIl;
/* 350 */                   IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(2);
/* 353 */                   ioOo1I0o1.I00iiI = iOii1l;
/* 355 */                   VarHandle.storeStoreFence();
/* 387 */                   boolean z3 = z2;
/* 389 */                   o1ooiI111i2 = o1ooiI111i;
/* 395 */                   illOOo00lI2 = illOOo00lI;
/* 399 */                   OlioioOl0O.I0000Il00O(illOOo00lI2, o1ooiI111i2, z3, oioOIi1o0I, j, j2, 0.0f, f, null, oI0lOIiOIOOo, iiioOl1O.I00000oOI(-1347531112, ioOo1I0o1, iloI0lOlll1), iloI0lOlll1, (i7 & 8190) | ((i7 << 6) & 234881024), 64);
/* 402 */                   z2 = z3;
/* 403 */                   iO0i0lIl2 = iO0i0lIl3;
                        }
/* 409 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 413 */               if (oOloioIlI001IO000 == null) {
/* 418 */                   I0oiII i0oiII = new I0oiII(2);
/* 421 */                   i0oiII.I00iiI = illOOo00lI2;
/* 423 */                   i0oiII.I00iiO = o1ooiI111i2;
/* 425 */                   i0oiII.I00iio = z2;
/* 427 */                   i0oiII.I00ioIO = oioOIi1o0I;
/* 431 */                   i0oiII.I00l0I0l0lO1 = iO0i0i;
/* 433 */                   i0oiII.I00l0OO0IO = iO0i0lIl2;
/* 437 */                   i0oiII.I00ilI0I1 = iOii1l;
/* 441 */                   i0oiII.I00ilO0 = i;
/* 445 */                   i0oiII.I00io1l = i2;
/* 447 */                   VarHandle.storeStoreFence();
/* 450 */                   oOloioIlI001IO000.I0000O = i0oiII;
/* 2739 */                  return;
                        }
/* 2739 */              return;
                    }
/* 59 */            i3 |= 384;
/* 61 */            z2 = z;
/* 84 */            if ((i & 3072) == 0) {
                    }
/* 100 */           if ((i & 24576) == 0) {
                    }
/* 117 */           if ((196608 & i) != 0) {
                    }
/* 147 */           if ((i2 & 64) == 0) {
                    }
/* 171 */           if ((i2 & Barcode.FORMAT_ITF) == 0) {
                    }
/* 194 */           if ((100663296 & i) == 0) {
                    }
/* 230 */           if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) == 38347922)) {
                    }
/* 409 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 413 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, IO0i0i iO0i0i, IO0i0lIl iO0i0lIl, II1IOloil iI1IOloil, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    O1ooiI111i o1ooiI111i2;
                    int i3;
                    OioOIi1o0I oioOIi1o0I2;
                    IO0i0i iO0i0i2;
                    IO0i0lIl iO0i0lIl2;
                    II1IOloil iI1IOloil2;
                    O1ooiI111i o1ooiI111i3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    OOloioIl oOloioIlI001IO000;
                    IO0i0i iO0i0iI0000oI00;
                    IO0i0lIl iO0i0lIlI00000oOI;
                    int i4;
                    IO0i0i iO0i0i3;
                    IO0i0lIl iO0i0lIl3;
                    II1IOloil iI1IOloil3;
                    int i5;
                    int i6;
/* 12 */            iloI0lOlll1.I00i0O(1359693790);
/* 15 */            int i7 = i2 & 1;
/* 17 */            if (i7 != 0) {
/* 19 */                i3 = i | 6;
/* 22 */                o1ooiI111i2 = o1ooiI111i;
                    } else if ((i & 6) == 0) {
/* 29 */                o1ooiI111i2 = o1ooiI111i;
/* 40 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i2) ? 4 : 2) | i;
                    } else {
/* 42 */                o1ooiI111i2 = o1ooiI111i;
/* 44 */                i3 = i;
                    }
/* 47 */            if ((i & 48) == 0) {
/* 51 */                if ((i2 & 2) == 0) {
/* 53 */                    oioOIi1o0I2 = oioOIi1o0I;
/* 59 */                    int i8 = iloI0lOlll1.I000II(oioOIi1o0I2) ? 32 : 16;
/* 68 */                    i3 |= i8;
                        } else {
/* 64 */                    oioOIi1o0I2 = oioOIi1o0I;
                        }
/* 68 */                i3 |= i8;
                    } else {
/* 70 */                oioOIi1o0I2 = oioOIi1o0I;
                    }
/* 74 */            if ((i & 384) == 0) {
/* 78 */                if ((i2 & 4) == 0) {
/* 80 */                    iO0i0i2 = iO0i0i;
/* 86 */                    if (iloI0lOlll1.I000II(iO0i0i2)) {
/* 88 */                        i6 = Barcode.FORMAT_QR_CODE;
                            }
/* 95 */                    i3 |= i6;
                        } else {
/* 91 */                    iO0i0i2 = iO0i0i;
                        }
/* 93 */                i6 = Barcode.FORMAT_ITF;
/* 95 */                i3 |= i6;
                    } else {
/* 97 */                iO0i0i2 = iO0i0i;
                    }
/* 101 */           if ((i & 3072) == 0) {
/* 105 */               if ((i2 & 8) == 0) {
/* 107 */                   iO0i0lIl2 = iO0i0lIl;
/* 113 */                   if (iloI0lOlll1.I000II(iO0i0lIl2)) {
/* 115 */                       i5 = Barcode.FORMAT_PDF417;
                            }
/* 122 */                   i3 |= i5;
                        } else {
/* 118 */                   iO0i0lIl2 = iO0i0lIl;
                        }
/* 120 */               i5 = Barcode.FORMAT_UPC_E;
/* 122 */               i3 |= i5;
                    } else {
/* 124 */               iO0i0lIl2 = iO0i0lIl;
                    }
/* 126 */           int i9 = i2 & 16;
/* 128 */           if (i9 == 0) {
/* 137 */               if ((i & 24576) == 0) {
/* 139 */                   iI1IOloil2 = iI1IOloil;
/* 152 */                   i3 |= iloI0lOlll1.I000II(iI1IOloil2) ? 16384 : 8192;
                        }
/* 156 */               if ((196608 & i) == 0) {
/* 169 */                   i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                        }
/* 177 */               int i10 = 1;
/* 189 */               if (iloI0lOlll1.I00OIl(i3 & 1, (74899 & i3) == 74898)) {
/* 375 */                   iloI0lOlll1.I00OilO00Il();
/* 378 */                   o1ooiI111i3 = o1ooiI111i2;
/* 379 */                   oioOIi1o0II00000oOI = oioOIi1o0I2;
                        } else {
/* 191 */                   iloI0lOlll1.I00Ol00();
/* 197 */                   if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 240 */                       o1ooiI111i3 = i7 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 243 */                       if ((i2 & 2) != 0) {
/* 247 */                           oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IlIlO10Ol.I00000oOI, iloI0lOlll1);
/* 251 */                           i3 &= -113;
                                } else {
/* 254 */                           oioOIi1o0II00000oOI = oioOIi1o0I2;
                                }
/* 257 */                       if ((i2 & 4) != 0) {
/* 269 */                           iO0i0iI0000oI00 = iOl10Oi0oo0.I0000oI00(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
/* 273 */                           i3 &= -897;
                                } else {
/* 276 */                           iO0i0iI0000oI00 = iO0i0i2;
                                }
/* 279 */                       if ((i2 & 8) != 0) {
/* 281 */                           iO0i0lIlI00000oOI = iOl10Oi0oo0.I00000oOI();
/* 285 */                           i3 &= -7169;
                                } else {
/* 288 */                           iO0i0lIlI00000oOI = iO0i0lIl2;
                                }
/* 289 */                       IO0i0lIl iO0i0lIl4 = iO0i0lIlI00000oOI;
/* 290 */                       i4 = i3;
/* 291 */                       iO0i0i3 = iO0i0iI0000oI00;
/* 292 */                       iO0i0lIl3 = iO0i0lIl4;
/* 293 */                       if (i9 != 0) {
/* 295 */                           iI1IOloil3 = null;
                                }
/* 296 */                       iloI0lOlll1.I0010o();
/* 299 */                       long j = iO0i0i3.I00000oIO;
/* 303 */                       int i11 = i4;
/* 304 */                       long j2 = iO0i0i3.I00000oOI;
/* 322 */                       float f = ((Iil1010O) iO0i0lIl3.I00000oIO(true, null, iloI0lOlll1, ((i11 >> 3) & 896) | 54).getValue()).I00iOIl;
/* 326 */                       IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(i10);
/* 329 */                       ioOo1I0o1.I00iiI = iOii1l;
/* 331 */                       VarHandle.storeStoreFence();
/* 366 */                       OlioioOl0O.I00000oIO(o1ooiI111i3, oioOIi1o0II00000oOI, j, j2, 0.0f, f, iI1IOloil3, iiioOl1O.I00000oOI(-97109725, ioOo1I0o1, iloI0lOlll1), iloI0lOlll1, (i11 & 14) | 12582912 | (i11 & 112) | ((i11 << 6) & 3670016), 16);
/* 369 */                       iI1IOloil2 = iI1IOloil3;
/* 370 */                       iO0i0i2 = iO0i0i3;
/* 372 */                       iO0i0lIl2 = iO0i0lIl3;
                            } else {
/* 206 */                       iloI0lOlll1.I00OilO00Il();
/* 211 */                       if ((i2 & 2) != 0) {
/* 213 */                           i3 &= -113;
                                }
/* 217 */                       if ((i2 & 4) != 0) {
/* 219 */                           i3 &= -897;
                                }
/* 223 */                       if ((i2 & 8) != 0) {
/* 225 */                           i3 &= -7169;
                                }
/* 227 */                       IO0i0i iO0i0i4 = iO0i0i2;
/* 228 */                       i4 = i3;
/* 229 */                       iO0i0i3 = iO0i0i4;
/* 230 */                       o1ooiI111i3 = o1ooiI111i2;
/* 231 */                       oioOIi1o0II00000oOI = oioOIi1o0I2;
/* 232 */                       iO0i0lIl3 = iO0i0lIl2;
                            }
/* 233 */                   iI1IOloil3 = iI1IOloil2;
/* 296 */                   iloI0lOlll1.I0010o();
/* 299 */                   long j3 = iO0i0i3.I00000oIO;
/* 303 */                   int i112 = i4;
/* 304 */                   long j22 = iO0i0i3.I00000oOI;
/* 322 */                   float f2 = ((Iil1010O) iO0i0lIl3.I00000oIO(true, null, iloI0lOlll1, ((i112 >> 3) & 896) | 54).getValue()).I00iOIl;
/* 326 */                   IoOo1I0o1 ioOo1I0o12 = new IoOo1I0o1(i10);
/* 329 */                   ioOo1I0o12.I00iiI = iOii1l;
/* 331 */                   VarHandle.storeStoreFence();
/* 366 */                   OlioioOl0O.I00000oIO(o1ooiI111i3, oioOIi1o0II00000oOI, j3, j22, 0.0f, f2, iI1IOloil3, iiioOl1O.I00000oOI(-97109725, ioOo1I0o12, iloI0lOlll1), iloI0lOlll1, (i112 & 14) | 12582912 | (i112 & 112) | ((i112 << 6) & 3670016), 16);
/* 369 */                   iI1IOloil2 = iI1IOloil3;
/* 370 */                   iO0i0i2 = iO0i0i3;
/* 372 */                   iO0i0lIl2 = iO0i0lIl3;
                        }
/* 380 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 384 */               if (oOloioIlI001IO000 == null) {
/* 388 */                   IO0i11 iO0i11 = new IO0i11();
/* 391 */                   iO0i11.I00iOIl = o1ooiI111i3;
/* 393 */                   iO0i11.I00iiI = oioOIi1o0II00000oOI;
/* 395 */                   iO0i11.I00iiO = iO0i0i2;
/* 397 */                   iO0i11.I00iio = iO0i0lIl2;
/* 399 */                   iO0i11.I00ilI0I1 = iI1IOloil2;
/* 401 */                   iO0i11.I00ilO0 = iOii1l;
/* 403 */                   iO0i11.I00io1l = i;
/* 405 */                   iO0i11.I00ioIO = i2;
/* 407 */                   VarHandle.storeStoreFence();
/* 410 */                   oOloioIlI001IO000.I0000O = iO0i11;
/* 1821 */                  return;
                        }
/* 1821 */              return;
                    }
/* 130 */           i3 |= 24576;
/* 132 */           iI1IOloil2 = iI1IOloil;
/* 156 */           if ((196608 & i) == 0) {
                    }
/* 177 */           int i102 = 1;
/* 189 */           if (iloI0lOlll1.I00OIl(i3 & 1, (74899 & i3) == 74898)) {
                    }
/* 380 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 384 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I0000Il00O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IO0i0i iO0i0i, IO0i0lIl iO0i0lIl, IloI0lOlll1 iloI0lOlll1, int i) {
                    IO0i0lIl iO0i0lIlI0000O;
                    int i2;
                    boolean z2;
                    IO0i0i iO0i0i2;
                    OioOIi1o0I oioOIi1o0I2;
/* 6 */             iloI0lOlll1.I00i0O(-129138571);
/* 23 */            int i3 = i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | 1648000;
/* 31 */            int i4 = 0;
/* 44 */            if (iloI0lOlll1.I00OIl(i3 & 1, (4793491 & i3) != 4793490)) {
/* 46 */                iloI0lOlll1.I00Ol00();
/* 54 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 75 */                    OioOIi1o0I oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IioiI0lIl.I0000Il00O, iloI0lOlll1);
/* 79 */                    IO0i0i iO0i0iI0000Il00O = iOl10Oi0oo0.I0000Il00O(iloI0lOlll1);
/* 89 */                    i2 = i3 & (-523265);
/* 85 */                    iO0i0lIlI0000O = iOl10Oi0oo0.I0000O(63);
/* 91 */                    z2 = true;
/* 92 */                    iO0i0i2 = iO0i0iI0000Il00O;
/* 93 */                    oioOIi1o0I2 = oioOIi1o0II00000oOI;
                        } else {
/* 63 */                    iloI0lOlll1.I00OilO00Il();
/* 66 */                    i2 = i3 & (-523265);
/* 67 */                    z2 = z;
/* 68 */                    iO0i0lIlI0000O = iO0i0lIl;
/* 70 */                    oioOIi1o0I2 = oioOIi1o0I;
/* 71 */                    iO0i0i2 = iO0i0i;
                        }
/* 94 */                iloI0lOlll1.I0010o();
/* 109 */               I00000oIO(illOOo00lI, o1ooiI111i, z2, oioOIi1o0I2, iO0i0i2, iO0i0lIlI0000O, i1OOiOiI1lI.I0000oI00, iloI0lOlll1, (i2 & 14) | 114819504, 0);
/* 112 */               z = z2;
/* 113 */               oioOIi1o0I = oioOIi1o0I2;
/* 114 */               iO0i0i = iO0i0i2;
                    } else {
/* 116 */               iloI0lOlll1.I00OilO00Il();
/* 119 */               iO0i0lIlI0000O = iO0i0lIl;
                    }
/* 121 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 125 */           if (oOloioIlI001IO000 != null) {
/* 129 */               IO0i1IlOoI iO0i1IlOoI = new IO0i1IlOoI(i4);
/* 132 */               iO0i1IlOoI.I00iiI = illOOo00lI;
/* 134 */               iO0i1IlOoI.I00iiO = o1ooiI111i;
/* 136 */               iO0i1IlOoI.I00iio = z;
/* 138 */               iO0i1IlOoI.I00ilI0I1 = oioOIi1o0I;
/* 140 */               iO0i1IlOoI.I00ilO0 = iO0i0i;
/* 142 */               iO0i1IlOoI.I00io1l = iO0i0lIlI0000O;
/* 144 */               VarHandle.storeStoreFence();
/* 147 */               oOloioIlI001IO000.I0000O = iO0i1IlOoI;
                    }
                }

                public static final void I0000O(O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, IO0i0i iO0i0i, IO0i0lIl iO0i0lIl, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
/* 10 */            iloI0lOlll1.I00i0O(-1464672362);
/* 30 */            int i4 = i | 144 | (((i2 & 8) == 0 && iloI0lOlll1.I000II(iO0i0lIl)) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 35 */            int i5 = 1;
/* 47 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 9363) != 9362)) {
/* 49 */                iloI0lOlll1.I00Ol00();
/* 53 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 79 */                    oioOIi1o0I = Oiol0Ol0li0.I00000oOI(IioiI0lIl.I0000Il00O, iloI0lOlll1);
/* 83 */                    iO0i0i = iOl10Oi0oo0.I0000Il00O(iloI0lOlll1);
/* 87 */                    i3 = i4 & (-1009);
/* 91 */                    if ((i2 & 8) != 0) {
/* 95 */                        iO0i0lIl = iOl10Oi0oo0.I0000O(63);
/* 71 */                        i3 = i4 & (-8177);
                            }
/* 73 */                    OioOIi1o0I oioOIi1o0I2 = oioOIi1o0I;
/* 74 */                    IO0i0i iO0i0i2 = iO0i0i;
/* 75 */                    IO0i0lIl iO0i0lIl2 = iO0i0lIl;
/* 100 */                   iloI0lOlll1.I0010o();
/* 114 */                   I00000oOI(o1ooiI111i, oioOIi1o0I2, iO0i0i2, iO0i0lIl2, null, iOii1l, iloI0lOlll1, (i3 & 7168) | 221190, 0);
/* 117 */                   oioOIi1o0I = oioOIi1o0I2;
/* 118 */                   iO0i0i = iO0i0i2;
/* 119 */                   iO0i0lIl = iO0i0lIl2;
                        } else {
/* 62 */                    iloI0lOlll1.I00OilO00Il();
/* 65 */                    i3 = i4 & (-1009);
/* 69 */                    if ((i2 & 8) != 0) {
/* 71 */                        i3 = i4 & (-8177);
                            }
/* 73 */                    OioOIi1o0I oioOIi1o0I22 = oioOIi1o0I;
/* 74 */                    IO0i0i iO0i0i22 = iO0i0i;
/* 75 */                    IO0i0lIl iO0i0lIl22 = iO0i0lIl;
/* 100 */                   iloI0lOlll1.I0010o();
/* 114 */                   I00000oOI(o1ooiI111i, oioOIi1o0I22, iO0i0i22, iO0i0lIl22, null, iOii1l, iloI0lOlll1, (i3 & 7168) | 221190, 0);
/* 117 */                   oioOIi1o0I = oioOIi1o0I22;
/* 118 */                   iO0i0i = iO0i0i22;
/* 119 */                   iO0i0lIl = iO0i0lIl22;
                        }
                    } else {
/* 121 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 124 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 128 */           if (oOloioIlI001IO000 != null) {
/* 132 */               I1olloiiiOi i1olloiiiOi = new I1olloiiiOi(i5);
/* 135 */               i1olloiiiOi.I00iiI = o1ooiI111i;
/* 137 */               i1olloiiiOi.I00ilI0I1 = oioOIi1o0I;
/* 139 */               i1olloiiiOi.I00ilO0 = iO0i0i;
/* 141 */               i1olloiiiOi.I00io1l = iO0i0lIl;
/* 143 */               i1olloiiiOi.I00iiO = iOii1l;
/* 145 */               i1olloiiiOi.I00iio = i2;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = i1olloiiiOi;
                    }
                }

                public static final void I0000oI00(O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, IO0i0i iO0i0i, IO0i0lIl iO0i0lIl, II1IOloil iI1IOloil, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    OioOIi1o0I oioOIi1o0I2;
                    IO0i0i iO0i0i2;
                    IO0i0lIl iO0i0lIl2;
                    II1IOloil iI1IOloil2;
                    IO0i0i iO0i0i3;
/* 8 */             iloI0lOlll1.I00i0O(-1945643296);
/* 11 */            int i2 = i | 9360;
/* 21 */            int i3 = 1;
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 34 */                iloI0lOlll1.I00Ol00();
/* 38 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 62 */                    OioOIi1o0I oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(OIiooIio0l1.I00000oOI, iloI0lOlll1);
/* 74 */                    IOOl011 iOOl011 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO;
/* 76 */                    IO0i0i iO0i0i4 = iOOl011.I00Ol1ll1;
/* 78 */                    if (iO0i0i4 == null) {
/* 82 */                        IOOl0iI iOOl0iI = OIiooIio0l1.I00000oIO;
/* 115 */                       iO0i0i3 = new IO0i0i(IOOl0iiliOl.I0000O(iOOl011, iOOl0iI), IOOl0iiliOl.I00000oIO(iOOl011, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI)), IOOl0iiliOl.I0000O(iOOl011, iOOl0iI), IOOiio0i.I0000Il00O(0.38f, IOOl0iiliOl.I00000oIO(iOOl011, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI))));
/* 118 */                       iOOl011.I00Ol1ll1 = iO0i0i3;
                            } else {
/* 121 */                       iO0i0i3 = iO0i0i4;
                            }
/* 132 */                   IO0i0lIl iO0i0lIl3 = new IO0i0lIl(0.0f, 0.0f, 0.0f, 0.0f, OIiooIio0l1.I0000Il00O, 0.0f);
/* 138 */                   iloI0lOlll1.I00i01iIIliI(2106917102);
/* 143 */                   long jI0000oI00 = IOOl0iiliOl.I0000oI00(OIiooIio0l1.I0000O, iloI0lOlll1);
/* 147 */                   iloI0lOlll1.I0010I0i(false);
/* 150 */                   boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(jI0000oI00);
/* 154 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 158 */                   if (zI0001Ioi1lo || objI00O0i0ii == IOl11li.I00000oIO) {
/* 166 */                       objI00O0i0ii = iOi0iO0iIOI0.I00000oIO(OIiooIio0l1.I0000oI00, jI0000oI00);
/* 170 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 174 */                   iI1IOloil2 = (II1IOloil) objI00O0i0ii;
/* 177 */                   iO0i0i2 = iO0i0i3;
/* 178 */                   iO0i0lIl2 = iO0i0lIl3;
/* 179 */                   oioOIi1o0I2 = oioOIi1o0II00000oOI;
                        } else {
/* 47 */                    iloI0lOlll1.I00OilO00Il();
/* 50 */                    oioOIi1o0I2 = oioOIi1o0I;
/* 52 */                    iO0i0i2 = iO0i0i;
/* 54 */                    iO0i0lIl2 = iO0i0lIl;
/* 56 */                    iI1IOloil2 = iI1IOloil;
                        }
/* 180 */               iloI0lOlll1.I0010o();
/* 191 */               I00000oOI(o1ooiI111i, oioOIi1o0I2, iO0i0i2, iO0i0lIl2, iI1IOloil2, iOii1l, iloI0lOlll1, 196614, 0);
                    } else {
/* 195 */               iloI0lOlll1.I00OilO00Il();
/* 198 */               oioOIi1o0I2 = oioOIi1o0I;
/* 200 */               iO0i0i2 = iO0i0i;
/* 202 */               iO0i0lIl2 = iO0i0lIl;
/* 204 */               iI1IOloil2 = iI1IOloil;
                    }
/* 206 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 210 */           if (oOloioIlI001IO000 != null) {
/* 214 */               O1i0oIO o1i0oIO = new O1i0oIO(i3);
/* 219 */               o1i0oIO.I00iiI = o1ooiI111i;
/* 221 */               o1i0oIO.I00iiO = oioOIi1o0I2;
/* 223 */               o1i0oIO.I00iio = iO0i0i2;
/* 225 */               o1i0oIO.I00ilI0I1 = iO0i0lIl2;
/* 227 */               o1i0oIO.I00ilO0 = iI1IOloil2;
/* 231 */               o1i0oIO.I00io1l = iOii1l;
/* 233 */               VarHandle.storeStoreFence();
/* 236 */               oOloioIlI001IO000.I0000O = o1i0oIO;
                    }
                }
            }
