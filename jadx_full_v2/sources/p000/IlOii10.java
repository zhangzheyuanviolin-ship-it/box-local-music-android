            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IlOii10 {
                static {
/* 1 */             OoOo1o1o ooOo1o1o = OoOo1o1o.I00iOIl;
                }

                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, long j, long j2, IlOOolOo ilOOolOo, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    long jI0000oI00;
                    long jI00000oOI;
                    IlOOolOo ilOOolOo2;
                    IlOOolOo ilOOolOo3;
                    long j3;
                    long j4;
                    OioOIi1o0I oioOIi1o0I2;
                    int i4;
                    int i5;
/* 1 */             IllOOo00lI illOOo00lI2 = illOOo00lI;
/* 16 */            iloI0lOlll1.I00i0O(748201188);
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 4 : 2) | i;
                    } else {
/* 34 */                i3 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 57 */                if ((i2 & 4) == 0) {
/* 59 */                    oioOIi1o0II00000oOI = oioOIi1o0I;
/* 65 */                    if (iloI0lOlll1.I000II(oioOIi1o0II00000oOI)) {
/* 67 */                        i5 = Barcode.FORMAT_QR_CODE;
                            }
/* 74 */                    i3 |= i5;
                        } else {
/* 70 */                    oioOIi1o0II00000oOI = oioOIi1o0I;
                        }
/* 72 */                i5 = Barcode.FORMAT_ITF;
/* 74 */                i3 |= i5;
                    } else {
/* 76 */                oioOIi1o0II00000oOI = oioOIi1o0I;
                    }
/* 80 */            if ((i & 3072) == 0) {
/* 84 */                if ((i2 & 8) == 0) {
/* 86 */                    jI0000oI00 = j;
/* 92 */                    if (iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) {
/* 94 */                        i4 = Barcode.FORMAT_PDF417;
                            }
/* 101 */                   i3 |= i4;
                        } else {
/* 97 */                    jI0000oI00 = j;
                        }
/* 99 */                i4 = Barcode.FORMAT_UPC_E;
/* 101 */               i3 |= i4;
                    } else {
/* 103 */               jI0000oI00 = j;
                    }
/* 107 */           if ((i & 24576) == 0) {
/* 111 */               if ((i2 & 16) == 0) {
/* 113 */                   jI00000oOI = j2;
/* 119 */                   int i6 = iloI0lOlll1.I0001Ioi1lo(jI00000oOI) ? 16384 : 8192;
/* 128 */                   i3 |= i6;
                        } else {
/* 124 */                   jI00000oOI = j2;
                        }
/* 128 */               i3 |= i6;
                    } else {
/* 130 */               jI00000oOI = j2;
                    }
/* 135 */           if ((196608 & i) == 0) {
/* 139 */               if ((i2 & 32) == 0) {
/* 141 */                   ilOOolOo2 = ilOOolOo;
/* 147 */                   int i7 = iloI0lOlll1.I000II(ilOOolOo2) ? 131072 : 65536;
/* 156 */                   i3 |= i7;
                        } else {
/* 152 */                   ilOOolOo2 = ilOOolOo;
                        }
/* 156 */               i3 |= i7;
                    } else {
/* 158 */               ilOOolOo2 = ilOOolOo;
                    }
/* 164 */           if ((i2 & 64) != 0) {
/* 166 */               i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
/* 184 */               i3 |= iloI0lOlll1.I000II(null) ? 1048576 : 524288;
                    }
/* 188 */           if ((12582912 & i) == 0) {
/* 201 */               i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 8388608 : 4194304;
                    }
/* 220 */           if (iloI0lOlll1.I00OIl(i3 & 1, (4793491 & i3) != 4793490)) {
/* 222 */               iloI0lOlll1.I00Ol00();
/* 233 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 274 */                   if ((i2 & 4) != 0) {
/* 278 */                       oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(Il1ol0O.I00000oIO, iloI0lOlll1);
/* 282 */                       i3 &= -897;
                            }
/* 286 */                   if ((i2 & 8) != 0) {
/* 290 */                       jI0000oI00 = IOOl0iiliOl.I0000oI00(Il1olI1O.I00000oIO, iloI0lOlll1);
/* 294 */                       i3 &= -7169;
                            }
/* 298 */                   if ((i2 & 16) != 0) {
/* 300 */                       jI00000oOI = IOOl0iiliOl.I00000oOI(jI0000oI00, iloI0lOlll1);
/* 304 */                       i3 &= -57345;
                            }
/* 307 */                   if ((i2 & 32) != 0) {
/* 309 */                       float f = Il1olI1O.I00000oOI;
/* 311 */                       float f2 = Il1olI1O.I0000oI00;
/* 313 */                       float f3 = Il1olI1O.I0000Il00O;
/* 317 */                       float f4 = Il1olI1O.I0000O;
/* 321 */                       IlOOolOo ilOOolOo4 = new IlOOolOo();
/* 324 */                       ilOOolOo4.I00000oIO = f;
/* 326 */                       ilOOolOo4.I00000oOI = f2;
/* 328 */                       ilOOolOo4.I0000Il00O = f3;
/* 330 */                       ilOOolOo4.I0000O = f4;
/* 332 */                       VarHandle.storeStoreFence();
/* 335 */                       i3 &= -458753;
/* 337 */                       ilOOolOo2 = ilOOolOo4;
                            }
                        } else {
/* 242 */                   iloI0lOlll1.I00OilO00Il();
/* 247 */                   if ((i2 & 4) != 0) {
/* 249 */                       i3 &= -897;
                            }
/* 253 */                   if ((i2 & 8) != 0) {
/* 255 */                       i3 &= -7169;
                            }
/* 259 */                   if ((i2 & 16) != 0) {
/* 261 */                       i3 &= -57345;
                            }
/* 264 */                   if ((i2 & 32) != 0) {
/* 266 */                       i3 &= -458753;
                            }
                        }
/* 267 */               ilOOolOo3 = ilOOolOo2;
/* 268 */               j3 = jI00000oOI;
/* 269 */               j4 = jI0000oI00;
/* 270 */               oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 339 */               iloI0lOlll1.I0010o();
/* 354 */               int i8 = i3 << 9;
/* 397 */               illOOo00lI2 = illOOo00lI;
/* 399 */               I00000oOI(illOOo00lI2, OoOoOOilil.I00000oIO(Il1l1iii.I00000oIO, iloI0lOlll1), Il1ol0O.I00000oOI, o1ooiI111i, oioOIi1o0I2, j4, j3, ilOOolOo3, iOii1l, iloI0lOlll1, (i3 & 14) | 3456 | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i3 >> 21) & 14);
                    } else {
/* 403 */               iloI0lOlll1.I00OilO00Il();
/* 406 */               ilOOolOo3 = ilOOolOo2;
/* 407 */               j3 = jI00000oOI;
/* 408 */               j4 = jI0000oI00;
/* 409 */               oioOIi1o0I2 = oioOIi1o0II00000oOI;
                    }
/* 410 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 414 */           if (oOloioIlI001IO000 != null) {
/* 418 */               IlOiO1oO00 ilOiO1oO00 = new IlOiO1oO00();
/* 421 */               ilOiO1oO00.I00iOIl = illOOo00lI2;
/* 423 */               ilOiO1oO00.I00iiI = o1ooiI111i;
/* 425 */               ilOiO1oO00.I00iiO = oioOIi1o0I2;
/* 427 */               ilOiO1oO00.I00iio = j4;
/* 429 */               ilOiO1oO00.I00ilI0I1 = j3;
/* 431 */               ilOiO1oO00.I00ilO0 = ilOOolOo3;
/* 433 */               ilOiO1oO00.I00io1l = iOii1l;
/* 435 */               ilOiO1oO00.I00ioIO = i;
/* 437 */               ilOiO1oO00.I00l0I0l0lO1 = i2;
/* 439 */               VarHandle.storeStoreFence();
/* 442 */               oOloioIlI001IO000.I0000O = ilOiO1oO00;
                    }
                }

                public static final void I00000oOI(IllOOo00lI illOOo00lI, Oo0lloOiiIOI oo0lloOiiIOI, float f, O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, long j, long j2, IlOOolOo ilOOolOo, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    IllOOo00lI illOOo00lI2;
                    OioOIi1o0I oioOIi1o0I2;
                    long j3;
                    long j4;
                    int i5;
                    Object obj;
/* 26 */            iloI0lOlll1.I00i0O(121669932);
/* 31 */            if ((i & 6) == 0) {
/* 42 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 44 */                i3 = i;
                    }
/* 47 */            if ((i & 48) == 0) {
/* 60 */                i3 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? 32 : 16;
                    }
/* 64 */            if ((i & 384) == 0) {
/* 77 */                i3 |= iloI0lOlll1.I0000O(f) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 80 */            if ((i & 3072) == 0) {
/* 95 */                i3 |= iloI0lOlll1.I0000O(56.0f) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 98 */            if ((i & 24576) == 0) {
/* 111 */               i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 16384 : 8192;
                    }
/* 115 */           if ((196608 & i) == 0) {
/* 128 */               i3 |= iloI0lOlll1.I000II(oioOIi1o0I) ? 131072 : 65536;
                    }
/* 132 */           if ((1572864 & i) == 0) {
/* 145 */               i3 |= iloI0lOlll1.I0001Ioi1lo(j) ? 1048576 : 524288;
                    }
/* 149 */           if ((12582912 & i) == 0) {
/* 162 */               i3 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 8388608 : 4194304;
                    }
/* 166 */           if ((100663296 & i) == 0) {
/* 179 */               i3 |= iloI0lOlll1.I000II(ilOOolOo) ? 67108864 : 33554432;
                    }
/* 184 */           if ((805306368 & i) == 0) {
/* 197 */               i3 |= iloI0lOlll1.I000II(null) ? 536870912 : 268435456;
                    }
/* 200 */           if ((i2 & 6) == 0) {
/* 211 */               i4 = i2 | (iloI0lOlll1.I000OOo1O(iOii1l) ? 4 : 2);
                    } else {
/* 214 */               i4 = i2;
                    }
/* 225 */           boolean z = true;
/* 245 */           if (iloI0lOlll1.I00OIl(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
/* 247 */               iloI0lOlll1.I00Ol00();
/* 252 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 261 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 264 */               iloI0lOlll1.I0010o();
/* 270 */               iloI0lOlll1.I00i01iIIliI(-282853233);
/* 273 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 277 */               Object obj2 = IOl11li.I00000oIO;
/* 279 */               if (objI00O0i0ii == obj2) {
/* 281 */                   objI00O0i0ii = l001l0.I00000oIO();
/* 285 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 288 */               OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 290 */               iloI0lOlll1.I0010I0i(false);
/* 293 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 297 */               if (objI00O0i0ii2 == obj2) {
/* 303 */                   objI00O0i0ii2 = new Iil0iiOiI(11);
/* 306 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 312 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111i, false, (Function1) objI00O0i0ii2);
/* 316 */               float f2 = ilOOolOo.I00000oIO;
/* 318 */               int i6 = i3 >> 21;
/* 320 */               int i7 = i6 & 112;
/* 322 */               boolean zI000II = iloI0lOlll1.I000II(oI0lOIiOIOOo);
/* 326 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 332 */               if (zI000II || objI00O0i0ii3 == obj2) {
/* 342 */                   float f3 = ilOOolOo.I00000oIO;
/* 344 */                   float f4 = ilOOolOo.I00000oOI;
/* 346 */                   float f5 = ilOOolOo.I0000O;
/* 348 */                   float f6 = ilOOolOo.I0000Il00O;
/* 350 */                   IlOi1ilII ilOi1ilII = new IlOi1ilII();
/* 353 */                   ilOi1ilII.I00000oIO = f3;
/* 355 */                   ilOi1ilII.I00000oOI = f4;
/* 357 */                   ilOi1ilII.I0000Il00O = f5;
/* 359 */                   ilOi1ilII.I0000O = f6;
/* 369 */                   i5 = i3;
/* 377 */                   ilOi1ilII.I0000oI00 = new I10i01(Iil1010O.I00000oIO(f3), Ooo0ii.I0000Il00O, null, 12);
/* 379 */                   VarHandle.storeStoreFence();
/* 382 */                   iloI0lOlll1.I00iio(ilOi1ilII);
                            obj = ilOi1ilII;
                        } else {
/* 337 */                   i5 = i3;
                            obj = objI00O0i0ii3;
                        }
/* 385 */               IlOi1ilII ilOi1ilII2 = (IlOi1ilII) obj;
/* 387 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ilOi1ilII2);
/* 395 */               if (((i7 ^ 48) <= 32 || !iloI0lOlll1.I000II(ilOOolOo)) && (i6 & 48) != 32) {
/* 408 */                   z = false;
                        }
/* 410 */               boolean z2 = zI000OOo1O | z;
/* 412 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 416 */               if (z2 || objI00O0i0ii4 == obj2) {
/* 425 */                   objI00O0i0ii4 = new Ii1O001loIoO(ilOi1ilII2, ilOOolOo, null, 12);
/* 428 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 433 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll1, ilOOolOo);
/* 444 */               boolean zI000II2 = iloI0lOlll1.I000II(oI0lOIiOIOOo) | iloI0lOlll1.I000OOo1O(ilOi1ilII2);
/* 445 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 449 */               if (zI000II2 || objI00O0i0ii5 == obj2) {
/* 457 */                   objI00O0i0ii5 = new IiI110i1O(oI0lOIiOIOOo, ilOi1ilII2, (IOoil1iiIilo) null, 5);
/* 460 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 465 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll1, oI0lOIiOIOOo);
/* 480 */               float f7 = ((Iil1010O) ilOi1ilII2.I0000oI00.I0000Il00O.I00iiI.getValue()).I00iOIl;
/* 485 */               IlOiOi100 ilOiOi100 = new IlOiOi100(0);
/* 488 */               ilOiOi100.I00iiO = j2;
/* 490 */               ilOiOi100.I00iio = oo0lloOiiIOI;
/* 492 */               ilOiOi100.I00iiI = f;
/* 494 */               ilOiOi100.I00ilI0I1 = iOii1l;
/* 496 */               VarHandle.storeStoreFence();
/* 508 */               int i8 = i5 >> 6;
/* 528 */               j3 = j;
/* 532 */               j4 = j2;
/* 535 */               illOOo00lI2 = illOOo00lI;
/* 537 */               oioOIi1o0I2 = oioOIi1o0I;
/* 539 */               OlioioOl0O.I0000Il00O(illOOo00lI2, o1ooiI111iI00000oOI, false, oioOIi1o0I2, j3, j4, f2, f7, null, oI0lOIiOIOOo, iiioOl1O.I00000oOI(-1779603465, ilOiOi100, iloI0lOlll1), iloI0lOlll1, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
                    } else {
/* 543 */               illOOo00lI2 = illOOo00lI;
/* 545 */               oioOIi1o0I2 = oioOIi1o0I;
/* 547 */               j3 = j;
/* 548 */               j4 = j2;
/* 549 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 552 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 556 */           if (oOloioIlI001IO000 != null) {
/* 560 */               IlOiOlIo0 ilOiOlIo0 = new IlOiOlIo0();
/* 563 */               ilOiOlIo0.I00iOIl = illOOo00lI2;
/* 567 */               ilOiOlIo0.I00iiI = oo0lloOiiIOI;
/* 571 */               ilOiOlIo0.I00iiO = f;
/* 575 */               ilOiOlIo0.I00iio = o1ooiI111i;
/* 577 */               ilOiOlIo0.I00ilI0I1 = oioOIi1o0I2;
/* 579 */               ilOiOlIo0.I00ilO0 = j3;
/* 581 */               ilOiOlIo0.I00io1l = j4;
/* 585 */               ilOiOlIo0.I00ioIO = ilOOolOo;
/* 589 */               ilOiOlIo0.I00l0I0l0lO1 = iOii1l;
/* 593 */               ilOiOlIo0.I00l0OO0IO = i;
/* 597 */               ilOiOlIo0.I00li1OI = i2;
/* 599 */               VarHandle.storeStoreFence();
/* 602 */               oOloioIlI001IO000.I0000O = ilOiOlIo0;
                    }
                }

                public static final void I0000Il00O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, long j, long j2, IlOOolOo ilOOolOo, IloI0lOlll1 iloI0lOlll1, int i) {
                    OioOIi1o0I oioOIi1o0I2;
                    IlOOolOo ilOOolOo2;
                    int i2;
/* 12 */            iloI0lOlll1.I00i0O(26608441);
/* 56 */            int i3 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16) | Barcode.FORMAT_ITF | (iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I0001Ioi1lo(j2) ? 16384 : 8192) | 1638400;
/* 77 */            if (iloI0lOlll1.I00OIl(i3 & 1, (4793491 & i3) != 4793490)) {
/* 79 */                iloI0lOlll1.I00Ol00();
/* 87 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 107 */                   OioOIi1o0I oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(Il1oliOIO0i.I00000oIO, iloI0lOlll1);
/* 111 */                   float f = Il1olI1O.I00000oOI;
/* 113 */                   float f2 = Il1olI1O.I0000oI00;
/* 115 */                   float f3 = Il1olI1O.I0000Il00O;
/* 117 */                   float f4 = Il1olI1O.I0000O;
/* 121 */                   IlOOolOo ilOOolOo3 = new IlOOolOo();
/* 124 */                   ilOOolOo3.I00000oIO = f;
/* 126 */                   ilOOolOo3.I00000oOI = f2;
/* 128 */                   ilOOolOo3.I0000Il00O = f3;
/* 130 */                   ilOOolOo3.I0000O = f4;
/* 132 */                   VarHandle.storeStoreFence();
/* 135 */                   i2 = i3 & (-459649);
/* 136 */                   oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 137 */                   ilOOolOo2 = ilOOolOo3;
                        } else {
/* 96 */                    iloI0lOlll1.I00OilO00Il();
/* 99 */                    i2 = i3 & (-459649);
/* 100 */                   oioOIi1o0I2 = oioOIi1o0I;
/* 102 */                   ilOOolOo2 = ilOOolOo;
                        }
/* 138 */               iloI0lOlll1.I0010o();
/* 161 */               I00000oIO(illOOo00lI, Ol0iOOO0.I00100l0(o1ooiI111i, Il1oliOIO0i.I00000oOI, 40.0f, 0.0f, 12), oioOIi1o0I2, j, j2, ilOOolOo2, i1i10Oi.I00000oOI, iloI0lOlll1, i2 & 33554318, 0);
                    } else {
/* 165 */               iloI0lOlll1.I00OilO00Il();
/* 168 */               oioOIi1o0I2 = oioOIi1o0I;
/* 170 */               ilOOolOo2 = ilOOolOo;
                    }
/* 172 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 176 */           if (oOloioIlI001IO000 != null) {
/* 180 */               IlOiIi0 ilOiIi0 = new IlOiIi0(0);
/* 183 */               ilOiIi0.I00ilO0 = illOOo00lI;
/* 185 */               ilOiIi0.I00iiI = o1ooiI111i;
/* 187 */               ilOiIi0.I00iiO = oioOIi1o0I2;
/* 189 */               ilOiIi0.I00iio = j;
/* 191 */               ilOiIi0.I00ilI0I1 = j2;
/* 193 */               ilOiIi0.I00io1l = ilOOolOo2;
/* 195 */               VarHandle.storeStoreFence();
/* 198 */               oOloioIlI001IO000.I0000O = ilOiIi0;
                    }
                }
            }
