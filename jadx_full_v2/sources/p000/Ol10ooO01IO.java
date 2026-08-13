            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class Ol10ooO01IO {
                public static final OooOio0IilO I00000oIO = new OooOio0IilO(Ol10oI0o0i.I00ioIO);

                /* JADX WARN: Removed duplicated region for block: B:100:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0184  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(float f, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, IOO1O00oI iOO1O00oI, int i, IllOOo00lI illOOo00lI, Ol0ooOiloO1 ol0ooOiloO1, OI0lOIiOIOOo oI0lOIiOIOOo, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    O1ooiI111i o1ooiI111i2;
                    int i5;
                    boolean z2;
                    int i6;
                    int i7;
                    int i8;
                    IllOOo00lI illOOo00lI2;
                    int i9;
                    float f2;
                    Ol0ooOiloO1 ol0ooOiloO12;
                    OI0lOIiOIOOo oI0lOIiOIOOo2;
                    IllOOo00lI illOOo00lI3;
                    OOloioIl oOloioIlI001IO000;
                    Ol0ooOiloO1 ol0ooOiloO13;
                    int i10;
                    O1ooiI111i o1ooiI111i3;
/* 16 */            iloI0lOlll1.I00i0O(-202044027);
/* 21 */            if ((i2 & 6) == 0) {
/* 32 */                i4 = (iloI0lOlll1.I0000O(f) ? 4 : 2) | i2;
                    } else {
/* 34 */                i4 = i2;
                    }
/* 37 */            if ((i2 & 48) == 0) {
/* 50 */                i4 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 51 */            int i11 = i3 & 4;
/* 53 */            if (i11 != 0) {
/* 55 */                i4 |= 384;
                    } else {
/* 62 */                if ((i2 & 384) == 0) {
/* 64 */                    o1ooiI111i2 = o1ooiI111i;
/* 77 */                    i4 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 78 */                i5 = i3 & 8;
/* 80 */                if (i5 == 0) {
/* 82 */                    i4 |= 3072;
                        } else {
/* 89 */                    if ((i2 & 3072) == 0) {
/* 91 */                        z2 = z;
/* 104 */                       i4 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                            }
/* 107 */                   if ((i2 & 24576) == 0) {
/* 120 */                       i4 |= iloI0lOlll1.I000II(iOO1O00oI) ? 16384 : 8192;
                            }
/* 121 */                   i6 = i3 & 32;
/* 125 */                   if (i6 != 0) {
/* 127 */                       i4 |= 196608;
                            } else {
/* 132 */                       if ((196608 & i2) == 0) {
/* 134 */                           i7 = i;
/* 147 */                           i4 |= iloI0lOlll1.I0000oI00(i7) ? 131072 : 65536;
                                }
/* 148 */                       i8 = i3 & 64;
/* 152 */                       if (i8 != 0) {
/* 159 */                           if ((1572864 & i2) == 0) {
/* 161 */                               illOOo00lI2 = illOOo00lI;
/* 174 */                               i4 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 1048576 : 524288;
                                    }
/* 180 */                           if ((i2 & 12582912) == 0) {
/* 184 */                               i4 |= 4194304;
                                    }
/* 188 */                           i9 = i4 | 100663296;
/* 215 */                           if (iloI0lOlll1.I00OIl(i9 & 1, (i9 & 38347923) != 38347922)) {
/* 217 */                               iloI0lOlll1.I00Ol00();
/* 225 */                               if ((i2 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 248 */                                   if (i11 != 0) {
/* 250 */                                       o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                                            }
/* 253 */                                   if (i5 != 0) {
/* 255 */                                       z2 = true;
                                            }
/* 257 */                                   if (i6 != 0) {
/* 259 */                                       i7 = 0;
                                            }
/* 261 */                                   if (i8 != 0) {
/* 264 */                                       illOOo00lI2 = null;
                                            }
/* 265 */                                   Ol10Oo ol10Oo = Ol10Oo.I00000oIO;
/* 267 */                                   Ol0ooOiloO1 ol0ooOiloO1I0000oI00 = Ol10Oo.I0000oI00(iloI0lOlll1);
/* 271 */                                   int i12 = i9 & (-29360129);
/* 272 */                                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 278 */                                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 280 */                                       objI00O0i0ii = l001l0.I00000oIO();
/* 284 */                                       iloI0lOlll1.I00iio(objI00O0i0ii);
                                            }
/* 289 */                                   O1ooiI111i o1ooiI111i4 = o1ooiI111i2;
/* 290 */                                   ol0ooOiloO13 = ol0ooOiloO1I0000oI00;
/* 291 */                                   i10 = i12;
/* 292 */                                   o1ooiI111i3 = o1ooiI111i4;
/* 287 */                                   oI0lOIiOIOOo2 = (OI0lOIiOIOOo) objI00O0i0ii;
                                        } else {
/* 234 */                                   iloI0lOlll1.I00OilO00Il();
/* 237 */                                   i10 = i9 & (-29360129);
/* 239 */                                   oI0lOIiOIOOo2 = oI0lOIiOIOOo;
/* 241 */                                   o1ooiI111i3 = o1ooiI111i2;
/* 242 */                                   ol0ooOiloO13 = ol0ooOiloO1;
                                        }
/* 244 */                               boolean z3 = z2;
/* 245 */                               int i13 = i7;
/* 246 */                               illOOo00lI3 = illOOo00lI2;
/* 295 */                               iloI0lOlll1.I0010o();
/* 301 */                               Io1olo0 io1olo0 = new Io1olo0(3);
/* 304 */                               io1olo0.I00iiO = oI0lOIiOIOOo2;
/* 306 */                               io1olo0.I00iio = ol0ooOiloO13;
/* 308 */                               io1olo0.I00iiI = z3;
/* 310 */                               VarHandle.storeStoreFence();
/* 316 */                               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1843234110, io1olo0, iloI0lOlll1);
/* 323 */                               I0I0O1O001oi i0I0O1O001oi = new I0I0O1O001oi(2);
/* 326 */                               i0I0O1O001oi.I00iiI = z3;
/* 328 */                               i0I0O1O001oi.I00iiO = ol0ooOiloO13;
/* 330 */                               VarHandle.storeStoreFence();
/* 353 */                               int i14 = (i10 & 14) | 805306368 | (i10 & 112) | (i10 & 896) | (i10 & 7168);
/* 354 */                               int i15 = i10 >> 6;
/* 368 */                               int i16 = i10 << 9;
/* 377 */                               int i17 = i14 | (i15 & 57344) | (i15 & 3670016) | (29360128 & i16) | (i16 & 234881024);
/* 378 */                               f2 = f;
/* 380 */                               I00000oOI(f2, function1, o1ooiI111i3, z3, illOOo00lI3, ol0ooOiloO13, oI0lOIiOIOOo2, iOO1O00oI, i13, iOii1lI00000oOI, iiioOl1O.I00000oOI(845575748, i0I0O1O001oi, iloI0lOlll1), iloI0lOlll1, i17);
/* 383 */                               Ol0ooOiloO1 ol0ooOiloO14 = ol0ooOiloO13;
/* 384 */                               o1ooiI111i2 = o1ooiI111i3;
/* 385 */                               ol0ooOiloO12 = ol0ooOiloO14;
/* 386 */                               i7 = i13;
/* 387 */                               z2 = z3;
                                    } else {
/* 389 */                               f2 = f;
/* 391 */                               iloI0lOlll1.I00OilO00Il();
/* 394 */                               ol0ooOiloO12 = ol0ooOiloO1;
/* 396 */                               oI0lOIiOIOOo2 = oI0lOIiOIOOo;
/* 398 */                               illOOo00lI3 = illOOo00lI2;
                                    }
/* 399 */                           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */                           if (oOloioIlI001IO000 != null) {
/* 407 */                               Ol10lI ol10lI = new Ol10lI();
/* 410 */                               ol10lI.I00iOIl = f2;
/* 412 */                               ol10lI.I00iiI = function1;
/* 414 */                               ol10lI.I00iiO = o1ooiI111i2;
/* 416 */                               ol10lI.I00iio = z2;
/* 418 */                               ol10lI.I00ilI0I1 = iOO1O00oI;
/* 420 */                               ol10lI.I00ilO0 = i7;
/* 422 */                               ol10lI.I00io1l = illOOo00lI3;
/* 424 */                               ol10lI.I00ioIO = ol0ooOiloO12;
/* 426 */                               ol10lI.I00l0I0l0lO1 = oI0lOIiOIOOo2;
/* 428 */                               ol10lI.I00l0OO0IO = i2;
/* 430 */                               ol10lI.I00li1OI = i3;
/* 432 */                               VarHandle.storeStoreFence();
/* 435 */                               oOloioIlI001IO000.I0000O = ol10lI;
/* 1925 */                              return;
                                    }
/* 1925 */                          return;
                                }
/* 154 */                       i4 |= 1572864;
/* 155 */                       illOOo00lI2 = illOOo00lI;
/* 180 */                       if ((i2 & 12582912) == 0) {
                                }
/* 188 */                       i9 = i4 | 100663296;
/* 215 */                       if (iloI0lOlll1.I00OIl(i9 & 1, (i9 & 38347923) != 38347922)) {
                                }
/* 399 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */                       if (oOloioIlI001IO000 != null) {
                                }
                            }
/* 128 */                   i7 = i;
/* 148 */                   i8 = i3 & 64;
/* 152 */                   if (i8 != 0) {
                            }
/* 155 */                   illOOo00lI2 = illOOo00lI;
/* 180 */                   if ((i2 & 12582912) == 0) {
                            }
/* 188 */                   i9 = i4 | 100663296;
/* 215 */                   if (iloI0lOlll1.I00OIl(i9 & 1, (i9 & 38347923) != 38347922)) {
                            }
/* 399 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */                   if (oOloioIlI001IO000 != null) {
                            }
                        }
/* 84 */                z2 = z;
/* 107 */               if ((i2 & 24576) == 0) {
                        }
/* 121 */               i6 = i3 & 32;
/* 125 */               if (i6 != 0) {
                        }
/* 128 */               i7 = i;
/* 148 */               i8 = i3 & 64;
/* 152 */               if (i8 != 0) {
                        }
/* 155 */               illOOo00lI2 = illOOo00lI;
/* 180 */               if ((i2 & 12582912) == 0) {
                        }
/* 188 */               i9 = i4 | 100663296;
/* 215 */               if (iloI0lOlll1.I00OIl(i9 & 1, (i9 & 38347923) != 38347922)) {
                        }
/* 399 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 57 */            o1ooiI111i2 = o1ooiI111i;
/* 78 */            i5 = i3 & 8;
/* 80 */            if (i5 == 0) {
                    }
/* 84 */            z2 = z;
/* 107 */           if ((i2 & 24576) == 0) {
                    }
/* 121 */           i6 = i3 & 32;
/* 125 */           if (i6 != 0) {
                    }
/* 128 */           i7 = i;
/* 148 */           i8 = i3 & 64;
/* 152 */           if (i8 != 0) {
                    }
/* 155 */           illOOo00lI2 = illOOo00lI;
/* 180 */           if ((i2 & 12582912) == 0) {
                    }
/* 188 */           i9 = i4 | 100663296;
/* 215 */           if (iloI0lOlll1.I00OIl(i9 & 1, (i9 & 38347923) != 38347922)) {
                    }
/* 399 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I00000oOI(float f, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, IllOOo00lI illOOo00lI, Ol0ooOiloO1 ol0ooOiloO1, OI0lOIiOIOOo oI0lOIiOIOOo, IOO1O00oI iOO1O00oI, int i, IOii1l iOii1l, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    float[] fArr;
                    int i4;
                    Object obj;
/* 5 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 28 */            iloI0lOlll1.I00i0O(-149497527);
/* 33 */            if ((i2 & 6) == 0) {
/* 44 */                i3 = (iloI0lOlll1.I0000O(f) ? 4 : 2) | i2;
                    } else {
/* 46 */                i3 = i2;
                    }
/* 49 */            if ((i2 & 48) == 0) {
/* 62 */                i3 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 65 */            if ((i2 & 384) == 0) {
/* 78 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 81 */            if ((i2 & 3072) == 0) {
/* 94 */                i3 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 97 */            if ((i2 & 24576) == 0) {
/* 110 */               i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 16384 : 8192;
                    }
/* 114 */           if ((196608 & i2) == 0) {
/* 127 */               i3 |= iloI0lOlll1.I000II(ol0ooOiloO1) ? 131072 : 65536;
                    }
/* 132 */           if ((i2 & 1572864) == 0) {
/* 145 */               i3 |= iloI0lOlll1.I000II(oI0lOIiOIOOo) ? 1048576 : 524288;
                    }
/* 152 */           if ((i2 & 12582912) == 0) {
/* 165 */               i3 |= iloI0lOlll1.I000II(iOO1O00oI) ? 8388608 : 4194304;
                    }
/* 171 */           if ((100663296 & i2) == 0) {
/* 184 */               i3 |= iloI0lOlll1.I0000oI00(i) ? 67108864 : 33554432;
                    }
/* 188 */           if ((805306368 & i2) == 0) {
/* 201 */               i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 536870912 : 268435456;
                    }
/* 220 */           if (iloI0lOlll1.I00OIl(i3 & 1, (306783379 & i3) != 306783378)) {
/* 222 */               iloI0lOlll1.I00Ol00();
/* 227 */               if ((i2 & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 236 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 239 */               iloI0lOlll1.I0010o();
/* 274 */               boolean z2 = ((234881024 & i3) == 67108864) | ((((29360128 & i3) ^ 12582912) > 8388608 && iloI0lOlll1.I000II(iOO1O00oI)) || (i3 & 12582912) == 8388608);
/* 275 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 279 */               if (z2 || objI00O0i0ii == IOl11li.I00000oIO) {
/* 292 */                   Ol111o0 ol111o0 = new Ol111o0();
/* 295 */                   ol111o0.I00000oIO = i;
/* 297 */                   ol111o0.I00000oOI = illOOo00lI;
/* 299 */                   ol111o0.I0000Il00O = iOO1O00oI;
/* 306 */                   ol111o0.I0000O = new OIooO1iiliI(f);
/* 308 */                   ol111o0.I0000oI00 = ol111o0;
/* 311 */                   ol111o0.I000II = true;
/* 313 */                   if (i == 0) {
/* 316 */                       fArr = new float[0];
/* 318 */                       i4 = i3;
                            } else {
/* 321 */                       int i5 = i + 2;
/* 323 */                       fArr = new float[i5];
/* 325 */                       i4 = i3;
/* 327 */                       int i6 = 0;
/* 328 */                       while (i6 < i5) {
/* 331 */                           int i7 = i6;
/* 337 */                           fArr[i7] = i6 / (i + 1);
/* 339 */                           i6 = i7 + 1;
                                }
                            }
/* 344 */                   ol111o0.I000O01llI0 = fArr;
/* 352 */                   ol111o0.I000OOo1O = new OIooi1iOiOol(0);
/* 359 */                   ol111o0.I000OiO = new OIooi1iOiOol(0);
/* 361 */                   Boolean bool = Boolean.FALSE;
/* 367 */                   ol111o0.I000l1 = lOO00IiI0li.I00000oIO(bool);
/* 374 */                   ol111o0.I000lI = new OIooi1iOiOol(0);
/* 381 */                   ol111o0.I000o00OoI0I = new OIooi1iOiOol(0);
/* 385 */                   ol111o0.I000oI1ioi = OIilII.I00iiI;
/* 391 */                   ol111o0.I00100l0 = lOO00IiI0li.I00000oIO(bool);
/* 397 */                   OIOo1iiI oIOo1iiI = new OIOo1iiI(28);
/* 400 */                   oIOo1iiI.I00iiI = ol111o0;
/* 402 */                   VarHandle.storeStoreFence();
/* 405 */                   ol111o0.I00100o1O0lo = oIOo1iiI;
/* 407 */                   IOO1O00oI iOO1O00oI2 = ol111o0.I0000Il00O;
/* 409 */                   float f2 = iOO1O00oI2.I00000oIO;
/* 413 */                   float f3 = iOO1O00oI2.I00000oOI - f2;
/* 439 */                   ol111o0.I0010I0i = new OIooO1iiliI(l1I1Il.I00000oOI(0.0f, 0.0f, lIiioliIlo.I00000oOI(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
/* 446 */                   ol111o0.I0010o = new OIooO1iiliI(0.0f);
/* 450 */                   Ol111O1I ol111O1I = new Ol111O1I();
/* 453 */                   ol111O1I.I00000oIO = ol111o0;
/* 455 */                   VarHandle.storeStoreFence();
/* 458 */                   ol111o0.I00111O = ol111O1I;
/* 465 */                   ol111o0.I001IIilI0O = new OI11IlOoi();
/* 467 */                   VarHandle.storeStoreFence();
/* 470 */                   iloI0lOlll1.I00iio(ol111o0);
                            obj = ol111o0;
                        } else {
/* 286 */                   i4 = i3;
                            obj = objI00O0i0ii;
                        }
/* 474 */               Ol111o0 ol111o02 = (Ol111o0) obj;
/* 476 */               ol111o02.I00000oOI = illOOo00lI;
/* 478 */               ol111o02.I0001Ioi1lo = function1;
/* 480 */               ol111o02.I0000O(f);
/* 503 */               o1ooiI111i2 = o1ooiI111i;
/* 507 */               I0000Il00O(ol111o02, o1ooiI111i2, z, null, oI0lOIiOIOOo, iOii1l, iOii1l2, iloI0lOlll1, ((i4 >> 3) & 1008) | (57344 & (i4 >> 6)) | ((i4 >> 12) & 458752) | 1572864);
                    } else {
/* 511 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 514 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 518 */           if (oOloioIlI001IO000 != null) {
/* 522 */               Ol10lO ol10lO = new Ol10lO();
/* 525 */               ol10lO.I00iOIl = f;
/* 527 */               ol10lO.I00iiI = function1;
/* 529 */               ol10lO.I00iiO = o1ooiI111i2;
/* 531 */               ol10lO.I00iio = z;
/* 533 */               ol10lO.I00ilI0I1 = illOOo00lI;
/* 535 */               ol10lO.I00ilO0 = ol0ooOiloO1;
/* 537 */               ol10lO.I00io1l = oI0lOIiOIOOo;
/* 539 */               ol10lO.I00ioIO = iOO1O00oI;
/* 541 */               ol10lO.I00l0I0l0lO1 = i;
/* 543 */               ol10lO.I00l0OO0IO = iOii1l;
/* 547 */               ol10lO.I00li1OI = iOii1l2;
/* 549 */               ol10lO.I00ll1 = i2;
/* 551 */               VarHandle.storeStoreFence();
/* 554 */               oOloioIlI001IO000.I0000O = ol10lO;
                    }
                }

                public static final void I0000Il00O(Ol111o0 ol111o0, O1ooiI111i o1ooiI111i, boolean z, Ol0ooOiloO1 ol0ooOiloO1, OI0lOIiOIOOo oI0lOIiOIOOo, IOii1l iOii1l, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    Ol0ooOiloO1 ol0ooOiloO1I0000oI00;
                    int i3;
/* 12 */            iloI0lOlll1.I00i0O(409861960);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i2 = (iloI0lOlll1.I000OOo1O(ol111o0) ? 4 : 2) | i;
                    } else {
/* 30 */                i2 = i;
                    }
/* 33 */            if ((i & 48) == 0) {
/* 46 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 49 */            if ((i & 384) == 0) {
/* 62 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 65 */            if ((i & 3072) == 0) {
/* 67 */                i2 |= Barcode.FORMAT_UPC_E;
                    }
/* 71 */            if ((i & 24576) == 0) {
/* 84 */                i2 |= iloI0lOlll1.I000II(oI0lOIiOIOOo) ? 16384 : 8192;
                    }
/* 88 */            if ((196608 & i) == 0) {
/* 101 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                    }
/* 105 */           if ((1572864 & i) == 0) {
/* 118 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? 1048576 : 524288;
                    }
/* 137 */           if (iloI0lOlll1.I00OIl(i2 & 1, (599187 & i2) != 599186)) {
/* 139 */               iloI0lOlll1.I00Ol00();
/* 144 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 160 */                   Ol10Oo ol10Oo = Ol10Oo.I00000oIO;
/* 166 */                   i3 = i2 & (-7169);
/* 162 */                   ol0ooOiloO1I0000oI00 = Ol10Oo.I0000oI00(iloI0lOlll1);
                        } else {
/* 153 */                   iloI0lOlll1.I00OilO00Il();
/* 156 */                   i3 = i2 & (-7169);
/* 158 */                   ol0ooOiloO1I0000oI00 = ol0ooOiloO1;
                        }
/* 169 */               iloI0lOlll1.I0010o();
/* 174 */               if (ol111o0.I00000oIO < 0) {
/* 211 */                   I000II.I000iOII("steps should be >= 0");
/* 214 */                   return;
                        } else {
/* 176 */                   int i4 = i3 >> 3;
/* 205 */                   I0000O(o1ooiI111i, ol111o0, z, oI0lOIiOIOOo, iOii1l, iOii1l2, iloI0lOlll1, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                        }
                    } else {
/* 215 */               iloI0lOlll1.I00OilO00Il();
/* 218 */               ol0ooOiloO1I0000oI00 = ol0ooOiloO1;
                    }
/* 219 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 223 */           if (oOloioIlI001IO000 != null) {
/* 228 */               IOI0Ol1l iOI0Ol1l = new IOI0Ol1l(3);
/* 231 */               iOI0Ol1l.I00ilO0 = ol111o0;
/* 233 */               iOI0Ol1l.I00iiO = o1ooiI111i;
/* 235 */               iOI0Ol1l.I00iio = z;
/* 237 */               iOI0Ol1l.I00iiI = ol0ooOiloO1I0000oI00;
/* 239 */               iOI0Ol1l.I00io1l = oI0lOIiOIOOo;
/* 241 */               iOI0Ol1l.I00ioIO = iOii1l;
/* 243 */               iOI0Ol1l.I00l0I0l0lO1 = iOii1l2;
/* 245 */               iOI0Ol1l.I00ilI0I1 = i;
/* 247 */               VarHandle.storeStoreFence();
/* 250 */               oOloioIlI001IO000.I0000O = iOI0Ol1l;
                    }
                }

                public static final void I0000O(O1ooiI111i o1ooiI111i, Ol111o0 ol111o0, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, IOii1l iOii1l, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IOO1O00oI iOO1O00oI;
                    boolean z2;
                    int i3;
                    O1ooiI111i oll0l0IOO0o;
                    OIilII oIilII;
/* 5 */             boolean z3 = z;
/* 9 */             IOii1l iOii1l3 = iOii1l;
/* 11 */            IOii1l iOii1l4 = iOii1l2;
/* 20 */            iloI0lOlll1.I00i0O(898172835);
/* 25 */            if ((i & 6) == 0) {
/* 36 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 38 */                i2 = i;
                    }
/* 41 */            if ((i & 48) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(ol111o0) ? 32 : 16;
                    }
/* 57 */            if ((i & 384) == 0) {
/* 70 */                i2 |= iloI0lOlll1.I000O01llI0(z3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 73 */            if ((i & 3072) == 0) {
/* 86 */                i2 |= iloI0lOlll1.I000II(oI0lOIiOIOOo) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 89 */            if ((i & 24576) == 0) {
/* 102 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l3) ? 16384 : 8192;
                    }
/* 106 */           if ((196608 & i) == 0) {
/* 119 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l4) ? 131072 : 65536;
                    }
/* 120 */           int i4 = i2;
/* 141 */           if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 74899) != 74898)) {
/* 156 */               ol111o0.I000iOII = iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I) == O0iOOoiioO.I00iiI;
/* 158 */               int i5 = ol111o0.I00000oIO;
/* 160 */               OIooO1iiliI oIooO1iiliI = ol111o0.I0000O;
/* 162 */               IOO1O00oI iOO1O00oI2 = ol111o0.I0000Il00O;
/* 164 */               int i6 = i4 >> 9;
/* 168 */               OI10i0Il oI10i0IlI00000oIO = ili0i1I0iII1.I00000oIO(oI0lOIiOIOOo, iloI0lOlll1, i6 & 14);
/* 178 */               Boolean bool = (Boolean) oI10i0IlI00000oIO.getValue();
/* 180 */               bool.getClass();
/* 185 */               ol111o0.I000l1.setValue(bool);
/* 192 */               if (ol111o0.I000oI1ioi == OIilII.I00iiI && ol111o0.I000iOII) {
/* 199 */                   iOO1O00oI = iOO1O00oI2;
/* 200 */                   z2 = true;
                        } else {
/* 202 */                   ol111o0.I0000Il00O();
/* 205 */                   iOO1O00oI = iOO1O00oI2;
/* 206 */                   z2 = false;
                        }
/* 207 */               int i7 = 3;
/* 208 */               O1ooiI111i o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 210 */               if (z3) {
/* 214 */                   IOooo0i iOooo0i = new IOooo0i(i7);
/* 217 */                   iOooo0i.I00000oOI = oI0lOIiOIOOo;
/* 219 */                   iOooo0i.I0000Il00O = ol111o0;
/* 221 */                   VarHandle.storeStoreFence();
/* 224 */                   OO1Oooio101 oO1Oooio101 = Oll10I.I00000oIO;
/* 228 */                   i3 = i5;
/* 231 */                   oll0l0IOO0o = new Oll0l0IOO0o(ol111o0, oI0lOIiOIOOo, iOooo0i, 4);
                        } else {
/* 237 */                   i3 = i5;
/* 239 */                   oll0l0IOO0o = o1ooiI111i2;
                        }
/* 241 */               OIilII oIilII2 = ol111o0.I000oI1ioi;
/* 251 */               boolean zBooleanValue = ((Boolean) ol111o0.I00100l0.getValue()).booleanValue();
/* 257 */               Ol111o0 ol111o02 = ol111o0.I0000oI00;
/* 259 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ol111o0);
/* 265 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 271 */               Object obj = IOl11li.I00000oIO;
/* 273 */               if (zI000OOo1O || objI00O0i0ii == obj) {
/* 283 */                   oIilII = oIilII2;
/* 287 */                   objI00O0i0ii = new II10i1i(ol111o0, (IOoil1iiIilo) null, 3);
/* 290 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        } else {
/* 278 */                   oIilII = oIilII2;
                        }
/* 298 */               z3 = z;
/* 301 */               IOO1O00oI iOO1O00oI3 = iOO1O00oI;
/* 303 */               O1ooiI111i o1ooiI111i3 = oll0l0IOO0o;
/* 305 */               int i8 = i3;
/* 313 */               O1ooiI111i o1ooiI111iI00000oIO = IillIi1.I00000oIO(ol111o02, oIilII, z3, oI0lOIiOIOOo, zBooleanValue, (Function3) objI00O0i0ii, z2, 32);
/* 340 */               O1ooiI111i o1ooiI111iI0010o = ol111o0.I0000Il00O() ? Ol0iOOO0.I0010o(iIoIOo00o.I00000oOI(o1ooiI111i2, Ol100II1.I00iOIl)) : Ol0iOOO0.I001IIilI0O(iIoIOo00o.I00000oOI(o1ooiI111i2, Ol100II1.I00iOIl));
/* 352 */               Oi1llOI oi1llOI = ((Oi1lliIi) iloI0lOlll1.I000iOII(Oi1iliO.I00000oIO)).I00000oIO;
/* 357 */               iloI0lOlll1.I00i01iIIliI(-177314817);
/* 360 */               iloI0lOlll1.I0010I0i(false);
/* 369 */               Object obj2 = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 371 */               IoI110lO0O ioI110lO0O = IooiioIo.I00000oIO;
/* 413 */               O1ooiI111i o1ooiI111iI000l1 = Ol0iOOO0.I000l1(o1ooiI111i.I0000O(O1lolo0IO.I00000oIO), ol111o0.I0000Il00O() ? Ol11IO0Io.I000lI : Ol11IO0Io.I000iOII, ol111o0.I0000Il00O() ? Ol11IO0Io.I000iOII : Ol11IO0Io.I000lI, 0.0f, 0.0f, 12);
/* 420 */               I1loII i1loII = new I1loII(4);
/* 423 */               i1loII.I00iiI = z3;
/* 425 */               i1loII.I00iiO = ol111o0;
/* 427 */               VarHandle.storeStoreFence();
/* 446 */               O1ooiI111i o1ooiI111iI0000O = OiioloIlOlIi.I00000oOI(o1ooiI111iI000l1, false, i1loII).I0000O(ol111o0.I0000Il00O() ? I01olIOo10.I00000oOI : I01olIOo10.I00000oIO);
/* 450 */               float fI000II = oIooO1iiliI.I000II();
/* 458 */               IOO1O00oI iOO1O00oII0001Ioi1lo = lIiioliIlo.I0001Ioi1lo(iOO1O00oI3.I00000oIO, iOO1O00oI3.I00000oOI);
/* 464 */               OOO11IiIiI oOO11IiIiI = new OOO11IiIiI();
/* 467 */               oOO11IiIiI.I00iOIl = fI000II;
/* 469 */               oOO11IiIiI.I00iiI = iOO1O00oII0001Ioi1lo;
/* 471 */               oOO11IiIiI.I00iiO = i8;
/* 473 */               VarHandle.storeStoreFence();
/* 481 */               O1ooiI111i o1ooiI111iI00000oIO2 = iIllIIO1IIO.I00000oIO(OiioloIlOlIi.I00000oOI(o1ooiI111iI0000O, true, oOO11IiIiI), z3, oI0lOIiOIOOo);
/* 485 */               float fI000II2 = oIooO1iiliI.I000II();
/* 489 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ol111o0);
/* 493 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 497 */               if (zI000OOo1O2 || objI00O0i0ii2 == obj) {
/* 504 */                   Ol10i1Oooo ol10i1Oooo = new Ol10i1Oooo(1);
/* 507 */                   ol10i1Oooo.I00iiI = ol111o0;
/* 509 */                   VarHandle.storeStoreFence();
/* 512 */                   iloI0lOlll1.I00iio(ol10i1Oooo);
                            obj3 = ol10i1Oooo;
                        }
/* 515 */               Function1 function1 = (Function1) obj3;
/* 517 */               IllOOo00lI illOOo00lI = ol111o0.I00000oOI;
/* 519 */               boolean zI0000Il00O = ol111o0.I0000Il00O();
/* 523 */               if (i8 < 0) {
/* 864 */                   I000II.I000iOII("steps should be >= 0");
/* 867 */                   return;
                        }
/* 529 */               Ol10oOiIII ol10oOiIII = new Ol10oOiIII();
/* 532 */               ol10oOiIII.I00iOIl = z3;
/* 534 */               ol10oOiIII.I00iiI = iOO1O00oI3;
/* 536 */               ol10oOiIII.I00iiO = i8;
/* 538 */               ol10oOiIII.I00iio = z2;
/* 540 */               ol10oOiIII.I00ilI0I1 = function1;
/* 542 */               ol10oOiIII.I00ilO0 = zI0000Il00O;
/* 544 */               ol10oOiIII.I00io1l = fI000II2;
/* 546 */               ol10oOiIII.I00ioIO = illOOo00lI;
/* 548 */               VarHandle.storeStoreFence();
/* 561 */               O1ooiI111i o1ooiI111iI0000O2 = iIoI0lOo.I00000oIO(o1ooiI111iI00000oIO2, ol10oOiIII).I0000O(o1ooiI111i3).I0000O(o1ooiI111iI00000oIO);
/* 581 */               boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(false) | iloI0lOlll1.I000II(oI10i0IlI00000oIO) | iloI0lOlll1.I000OOo1O(ol111o0);
/* 582 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 586 */               if (zI000O01llI0 || objI00O0i0ii3 == obj) {
/* 593 */                   O100loO1 o100loO1 = new O100loO1(1);
/* 596 */                   o100loO1.I00000oOI = ol111o0;
/* 598 */                   VarHandle.storeStoreFence();
/* 601 */                   iloI0lOlll1.I00iio(o100loO1);
                            obj4 = o100loO1;
                        }
/* 604 */               O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj4;
/* 608 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 612 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 616 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O2);
/* 622 */               IOl0oi0lOl1.I000lI.getClass();
/* 625 */               iloI0lOlll1.I00i0oil();
/* 628 */               boolean z4 = iloI0lOlll1.I00O10llo;
/* 630 */               IllOOo00lI illOOo00lI2 = O0iiOioolIi.I01101IOlO;
/* 632 */               if (z4) {
/* 634 */                   iloI0lOlll1.I000l1(illOOo00lI2);
                        } else {
/* 638 */                   iloI0lOlll1.I00io1l();
                        }
/* 641 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 643 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10);
/* 646 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 648 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 651 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 655 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 657 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 660 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 663 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 665 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 668 */               O1ooiI111i o1ooiI111iI0000O3 = o1ooiI111iI0010o.I0000O(o1ooiI111i2);
/* 693 */               boolean zI000O01llI02 = iloI0lOlll1.I000O01llI0(false) | iloI0lOlll1.I000II(oI10i0IlI00000oIO) | iloI0lOlll1.I000II(obj2) | iloI0lOlll1.I000OOo1O(ol111o0);
/* 694 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii4;
/* 698 */               if (zI000O01llI02 || objI00O0i0ii4 == obj) {
/* 705 */                   Ol10i1Oooo ol10i1Oooo2 = new Ol10i1Oooo(2);
/* 708 */                   ol10i1Oooo2.I00iiI = ol111o0;
/* 710 */                   VarHandle.storeStoreFence();
/* 713 */                   iloI0lOlll1.I00iio(ol10i1Oooo2);
                            obj5 = ol10i1Oooo2;
                        }
/* 718 */               O1ooiI111i o1ooiI111iI00000oIO3 = iO0111o.I00000oIO(o1ooiI111iI0000O3, (Function1) obj5);
/* 722 */               II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 725 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 731 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 735 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 739 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO3);
/* 743 */               iloI0lOlll1.I00i0oil();
/* 748 */               if (iloI0lOlll1.I00O10llo) {
/* 750 */                   iloI0lOlll1.I000l1(illOOo00lI2);
                        } else {
/* 754 */                   iloI0lOlll1.I00io1l();
                        }
/* 757 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 760 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 763 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 766 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 771 */               int i9 = (i4 >> 3) & 14;
/* 780 */               iOii1l3 = iOii1l;
/* 782 */               iOii1l3.invoke(ol111o0, iloI0lOlll1, Integer.valueOf((i6 & 112) | i9));
/* 786 */               iloI0lOlll1.I0010I0i(true);
/* 791 */               O1ooiI111i o1ooiI111iI00000oOI = iIoIOo00o.I00000oOI(o1ooiI111i2, Ol100II1.I00iiI);
/* 796 */               O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 802 */               int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 806 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 810 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI);
/* 814 */               iloI0lOlll1.I00i0oil();
/* 819 */               if (iloI0lOlll1.I00O10llo) {
/* 821 */                   iloI0lOlll1.I000l1(illOOo00lI2);
                        } else {
/* 825 */                   iloI0lOlll1.I00io1l();
                        }
/* 828 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 831 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 834 */               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 837 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 849 */               iOii1l4 = iOii1l2;
/* 851 */               iOii1l4.invoke(ol111o0, iloI0lOlll1, Integer.valueOf(i9 | ((i4 >> 12) & 112)));
/* 855 */               iloI0lOlll1.I0010I0i(true);
/* 858 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 868 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 871 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 875 */           if (oOloioIlI001IO000 != null) {
/* 880 */               I1ollooOoi i1ollooOoi = new I1ollooOoi(5);
/* 885 */               i1ollooOoi.I00iio = o1ooiI111i;
/* 887 */               i1ollooOoi.I00ilI0I1 = ol111o0;
/* 889 */               i1ollooOoi.I00iiI = z3;
/* 893 */               i1ollooOoi.I00ilO0 = oI0lOIiOIOOo;
/* 895 */               i1ollooOoi.I00ioIO = iOii1l3;
/* 897 */               i1ollooOoi.I00io1l = iOii1l4;
/* 901 */               i1ollooOoi.I00iiO = i;
/* 903 */               VarHandle.storeStoreFence();
/* 906 */               oOloioIlI001IO000.I0000O = i1ollooOoi;
                    }
                }

                public static final void I0000oI00(OI0lOIiOIOOo oI0lOIiOIOOo, O1ooiI111i o1ooiI111i, Ol0ooOiloO1 ol0ooOiloO1, boolean z, long j, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    long jFloatToRawIntBits;
/* 18 */            iloI0lOlll1.I00i0O(-1844845435);
/* 23 */            int i3 = 4;
/* 24 */            if ((i & 6) == 0) {
/* 35 */                i2 = (iloI0lOlll1.I000II(oI0lOIiOIOOo) ? 4 : 2) | i;
                    } else {
/* 37 */                i2 = i;
                    }
/* 42 */            if ((i & 48) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 57 */            if ((i & 384) == 0) {
/* 70 */                i2 |= iloI0lOlll1.I000II(ol0ooOiloO1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 73 */            if ((i & 3072) == 0) {
/* 86 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 89 */            if ((i & 24576) == 0) {
/* 102 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? 16384 : 8192;
                    }
/* 107 */           if ((196608 & i) == 0) {
/* 120 */               i2 |= iloI0lOlll1.I000O01llI0(false) ? 131072 : 65536;
                    }
/* 128 */           int i4 = 1;
/* 140 */           if (iloI0lOlll1.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 142 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 146 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 148 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 152 */                   objI00O0i0ii = new Ol1o0O0O0();
/* 155 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 158 */               Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) objI00O0i0ii;
/* 168 */               boolean z2 = (i2 & 14) == 4;
/* 170 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 174 */               if (z2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 181 */                   objI00O0i0ii2 = new IIIi11Oil00o(oI0lOIiOIOOo, ol1o0O0O0, null, i3);
/* 184 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 189 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, oI0lOIiOIOOo);
/* 196 */               if (ol1o0O0O0.isEmpty()) {
/* 243 */                   jFloatToRawIntBits = j;
                        } else {
/* 204 */                   float fI00000oOI = Iil1iI01I0O0.I00000oOI(j) / 2.0f;
/* 207 */                   if ((2 & 1) != 0) {
/* 209 */                       fI00000oOI = Iil1iI01I0O0.I00000oOI(j);
                            }
/* 222 */                   float fI00000oIO = (2 & 2) != 0 ? Iil1iI01I0O0.I00000oIO(j) : 0.0f;
/* 241 */                   jFloatToRawIntBits = (Float.floatToRawIntBits(fI00000oIO) & 4294967295L) | (Float.floatToRawIntBits(fI00000oOI) << 32);
                        }
/* 244 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I00000oIO;
/* 258 */               O1ooiI111i o1ooiI111iI00000oIO = iIo0loiilI.I00000oIO(Ol0iOOO0.I000o00OoI0I(o1ooiI111i, Iil1iI01I0O0.I00000oOI(j), Iil1iI01I0O0.I00000oIO(j)), oI0lOIiOIOOo);
/* 264 */               OO1iIiOoO0.I00000oIO.getClass();
/* 269 */               O1ooiI111i o1ooiI111iI00000oIO2 = lI1iiO11I.I00000oIO(o1ooiI111iI00000oIO, iO0OI01loOo.I0000Il00O);
/* 275 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 281 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 285 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 289 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO2);
/* 295 */               IOl0oi0lOl1.I000lI.getClass();
/* 298 */               iloI0lOlll1.I00i0oil();
/* 303 */               if (iloI0lOlll1.I00O10llo) {
/* 307 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 311 */                   iloI0lOlll1.I00io1l();
                        }
/* 316 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 321 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 330 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 333 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 338 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 372 */               lOO1OIO00.I00000oIO(iloI0lOlll1, i0I1I0.I00000oOI(Ol0iOOO0.I000o00OoI0I(O1ooIo101ll.I00000oIO, Iil1iI01I0O0.I00000oOI(jFloatToRawIntBits), Iil1iI01I0O0.I00000oIO(jFloatToRawIntBits)), z ? ol0ooOiloO1.I00000oIO : ol0ooOiloO1.I0001Ioi1lo, Oiol0Ol0li0.I00000oOI(Ol11IO0Io.I000OiO, iloI0lOlll1)));
/* 375 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 379 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 382 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 386 */           if (oOloioIlI001IO000 != null) {
/* 390 */               IloOilOi0iil iloOilOi0iil = new IloOilOi0iil(i4);
/* 393 */               iloOilOi0iil.I00ilO0 = oI0lOIiOIOOo;
/* 395 */               iloOilOi0iil.I00iiI = o1ooiI111i;
/* 397 */               iloOilOi0iil.I00io1l = ol0ooOiloO1;
/* 399 */               iloOilOi0iil.I00iiO = z;
/* 401 */               iloOilOi0iil.I00iio = j;
/* 403 */               iloOilOi0iil.I00ilI0I1 = i;
/* 405 */               VarHandle.storeStoreFence();
/* 408 */               oOloioIlI001IO000.I0000O = iloOilOi0iil;
                    }
                }

                public static final float I0001Ioi1lo(float f, float[] fArr, float f2, float f3) {
                    Float fValueOf;
/* 2 */             if (fArr.length == 0) {
/* 4 */                 fValueOf = null;
                    } else {
/* 7 */                 float f4 = fArr[0];
/* 10 */                int i = 1;
/* 11 */                int length = fArr.length - 1;
/* 12 */                if (length == 0) {
/* 14 */                    fValueOf = Float.valueOf(f4);
                        } else {
/* 24 */                    float fAbs = Math.abs(l1I1Il.I00000oOI(f2, f3, f4) - f);
/* 28 */                    if (1 <= length) {
                                while (true) {
/* 30 */                            float f5 = fArr[i];
/* 37 */                            float fAbs2 = Math.abs(l1I1Il.I00000oOI(f2, f3, f5) - f);
/* 45 */                            if (Float.compare(fAbs, fAbs2) > 0) {
/* 47 */                                f4 = f5;
/* 48 */                                fAbs = fAbs2;
                                    }
/* 49 */                            if (i == length) {
                                        break;
                                    }
/* 51 */                            i++;
                                }
                            }
/* 54 */                    fValueOf = Float.valueOf(f4);
                        }
                    }
                    return fValueOf != null ? l1I1Il.I00000oOI(f2, f3, fValueOf.floatValue()) : f;
                }
            }
