            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO0l01iI0i {
                /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
                /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, IOii1l iOii1l, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, int i, long j, long j2, i00O0OOIlOO i00o0ooiloo, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    IlliIl1l11O illiIl1l11O4;
                    long j3;
                    IlliIl1l11O illiIl1l11O5;
                    IlliIl1l11O illiIl1l11O6;
                    int i5;
                    long j4;
                    i00O0OOIlOO i00o0ooiloo2;
                    OOloioIl oOloioIlI001IO000;
                    O1ooiI111i o1ooiI111i3;
                    long j5;
                    long jI00000oOI;
                    int i6;
                    IlliIl1l11O illiIl1l11O7;
                    i00O0OOIlOO i00o0ooiloo3;
                    IlliIl1l11O illiIl1l11O8;
                    IlliIl1l11O illiIl1l11O9;
                    int i7;
/* 12 */            iloI0lOlll1.I00i0O(-1211482744);
/* 15 */            int i8 = i3 & 1;
/* 17 */            if (i8 != 0) {
/* 19 */                i4 = i2 | 6;
/* 22 */                o1ooiI111i2 = o1ooiI111i;
                    } else if ((i2 & 6) == 0) {
/* 29 */                o1ooiI111i2 = o1ooiI111i;
/* 40 */                i4 = (iloI0lOlll1.I000II(o1ooiI111i2) ? 4 : 2) | i2;
                    } else {
/* 42 */                o1ooiI111i2 = o1ooiI111i;
/* 44 */                i4 = i2;
                    }
/* 47 */            if ((i2 & 48) == 0) {
/* 60 */                i4 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 61 */            int i9 = i4 | 3456;
/* 63 */            int i10 = i3 & 16;
/* 65 */            if (i10 == 0) {
/* 74 */                if ((i2 & 24576) == 0) {
/* 76 */                    illiIl1l11O4 = illiIl1l11O3;
/* 89 */                    i9 |= iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 16384 : 8192;
                        }
/* 93 */                if ((196608 & i2) == 0) {
/* 97 */                    i9 |= 65536;
                        }
/* 101 */               if ((1572864 & i2) != 0) {
/* 105 */                   if ((i3 & 64) == 0) {
/* 107 */                       j3 = j;
/* 113 */                       int i11 = iloI0lOlll1.I0001Ioi1lo(j3) ? 1048576 : 524288;
/* 122 */                       i9 |= i11;
                            } else {
/* 118 */                       j3 = j;
                            }
/* 122 */                   i9 |= i11;
                        } else {
/* 124 */                   j3 = j;
                        }
/* 130 */               if ((i2 & 12582912) == 0) {
/* 134 */                   i9 |= 4194304;
                        }
/* 138 */               if ((100663296 & i2) == 0) {
/* 142 */                   i9 |= 33554432;
                        }
/* 146 */               if ((805306368 & i2) == 0) {
/* 159 */                   i9 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? 536870912 : 268435456;
                        }
/* 178 */               if (iloI0lOlll1.I00OIl(i9 & 1, (306783379 & i9) == 306783378)) {
/* 468 */                   iloI0lOlll1.I00OilO00Il();
/* 471 */                   illiIl1l11O5 = illiIl1l11O;
/* 473 */                   illiIl1l11O6 = illiIl1l11O2;
/* 475 */                   i5 = i;
/* 477 */                   j4 = j2;
/* 479 */                   i00o0ooiloo2 = i00o0ooiloo;
                        } else {
/* 180 */                   iloI0lOlll1.I00Ol00();
/* 194 */                   if ((i2 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 234 */                       o1ooiI111i3 = i8 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 240 */                       IlliIl1l11O illiIl1l11O10 = i10 != 0 ? iI1llIlIi.I0000Il00O : illiIl1l11O4;
/* 241 */                       int i12 = i9 & (-458753);
/* 245 */                       if ((i3 & 64) != 0) {
/* 257 */                           j5 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I000o00OoI0I;
/* 259 */                           i12 = i9 & (-4128769);
                                } else {
/* 262 */                           j5 = j3;
                                }
/* 263 */                       jI00000oOI = IOOl0iiliOl.I00000oOI(j5, iloI0lOlll1);
/* 267 */                       WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
/* 281 */                       OoiIOi11I ooiIOi11II00000oOI = iO1OO0i0i.I00000oOI(liIIiol0oI10.I00000oIO(iloI0lOlll1).I000II, liIIiol0oI10.I00000oIO(iloI0lOlll1).I00000oOI);
/* 286 */                       IOii1l iOii1l3 = iI1llIlIi.I00000oIO;
/* 285 */                       i6 = i12 & (-264241153);
/* 288 */                       illiIl1l11O7 = iI1llIlIi.I00000oOI;
/* 292 */                       i00o0ooiloo3 = ooiIOi11II00000oOI;
/* 293 */                       illiIl1l11O8 = illiIl1l11O10;
/* 294 */                       illiIl1l11O9 = iOii1l3;
/* 295 */                       j3 = j5;
/* 296 */                       i7 = 2;
                            } else {
/* 203 */                       iloI0lOlll1.I00OilO00Il();
/* 206 */                       int i13 = i9 & (-458753);
/* 210 */                       if ((i3 & 64) != 0) {
/* 212 */                           i13 = i9 & (-4128769);
                                }
/* 215 */                       i7 = i;
/* 217 */                       jI00000oOI = j2;
/* 219 */                       i00o0ooiloo3 = i00o0ooiloo;
/* 214 */                       i6 = i13 & (-264241153);
/* 222 */                       o1ooiI111i3 = o1ooiI111i2;
/* 223 */                       illiIl1l11O8 = illiIl1l11O4;
/* 224 */                       illiIl1l11O9 = illiIl1l11O;
/* 226 */                       illiIl1l11O7 = illiIl1l11O2;
                            }
/* 297 */                   iloI0lOlll1.I0010o();
/* 300 */                   boolean zI000II = iloI0lOlll1.I000II(i00o0ooiloo3);
/* 306 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 310 */                   Object obj = IOl11li.I00000oIO;
                            Object obj2 = objI00O0i0ii;
/* 312 */                   if (zI000II || objI00O0i0ii == obj) {
/* 318 */                       OI110lI01o oI110lI01o = new OI110lI01o();
/* 325 */                       oI110lI01o.I00000oIO = lOO00IiI0li.I00000oIO(i00o0ooiloo3);
/* 327 */                       VarHandle.storeStoreFence();
/* 330 */                       iloI0lOlll1.I00iio(oI110lI01o);
                                obj2 = oI110lI01o;
                            }
/* 333 */                   Object obj3 = (OI110lI01o) obj2;
/* 343 */                   boolean zI000II2 = iloI0lOlll1.I000II(obj3) | iloI0lOlll1.I000II(i00o0ooiloo3);
/* 345 */                   long j6 = j3;
/* 347 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii2;
/* 351 */                   if (zI000II2 || objI00O0i0ii2 == obj) {
/* 359 */                       O1lIIi o1lIIi = new O1lIIi(29);
/* 362 */                       o1lIIi.I00iiI = obj3;
/* 364 */                       o1lIIi.I00iiO = i00o0ooiloo3;
/* 366 */                       VarHandle.storeStoreFence();
/* 369 */                       iloI0lOlll1.I00iio(o1lIIi);
                                obj4 = o1lIIi;
                            }
/* 376 */                   IOo1il iOo1il = new IOo1il();
/* 379 */                   iOo1il.I00000oIO = (Function1) obj4;
/* 381 */                   VarHandle.storeStoreFence();
/* 384 */                   O1ooiI111i o1ooiI111iI0000O = o1ooiI111i3.I0000O(iOo1il);
/* 391 */                   IOii0100lIi0 iOii0100lIi0 = new IOii0100lIi0(2);
/* 394 */                   iOii0100lIi0.I00iiI = i7;
/* 396 */                   iOii0100lIi0.I00iiO = iOii1l;
/* 398 */                   iOii0100lIi0.I00iio = iOii1l2;
/* 400 */                   iOii0100lIi0.I00ilI0I1 = illiIl1l11O7;
/* 402 */                   iOii0100lIi0.I00ilO0 = illiIl1l11O8;
/* 404 */                   iOii0100lIi0.I00io1l = obj3;
/* 406 */                   iOii0100lIi0.I00ioIO = illiIl1l11O9;
/* 408 */                   VarHandle.storeStoreFence();
/* 426 */                   O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 438 */                   IlliIl1l11O illiIl1l11O11 = illiIl1l11O8;
/* 440 */                   int i14 = i7;
/* 442 */                   long j7 = jI00000oOI;
/* 450 */                   OlioioOl0O.I00000oIO(o1ooiI111iI0000O, null, j6, j7, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(848889571, iOii0100lIi0, iloI0lOlll1), iloI0lOlll1, ((i6 >> 12) & 896) | 12582912, 114);
/* 453 */                   j3 = j6;
/* 454 */                   j4 = j7;
/* 455 */                   illiIl1l11O5 = illiIl1l11O9;
/* 457 */                   illiIl1l11O6 = illiIl1l11O7;
/* 459 */                   o1ooiI111i2 = o1ooiI111i4;
/* 461 */                   i00o0ooiloo2 = i00o0ooiloo3;
/* 463 */                   illiIl1l11O4 = illiIl1l11O11;
/* 465 */                   i5 = i14;
                        }
/* 481 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 485 */               if (oOloioIlI001IO000 == null) {
/* 489 */                   OiO0i11 oiO0i11 = new OiO0i11();
/* 492 */                   oiO0i11.I00iOIl = o1ooiI111i2;
/* 494 */                   oiO0i11.I00iiI = iOii1l;
/* 496 */                   oiO0i11.I00iiO = illiIl1l11O5;
/* 498 */                   oiO0i11.I00iio = illiIl1l11O6;
/* 500 */                   oiO0i11.I00ilI0I1 = illiIl1l11O4;
/* 502 */                   oiO0i11.I00ilO0 = i5;
/* 504 */                   oiO0i11.I00io1l = j3;
/* 506 */                   oiO0i11.I00ioIO = j4;
/* 508 */                   oiO0i11.I00l0I0l0lO1 = i00o0ooiloo2;
/* 510 */                   oiO0i11.I00l0OO0IO = iOii1l2;
/* 512 */                   oiO0i11.I00li1OI = i2;
/* 516 */                   oiO0i11.I00ll1 = i3;
/* 518 */                   VarHandle.storeStoreFence();
/* 521 */                   oOloioIlI001IO000.I0000O = oiO0i11;
/* 1578 */                  return;
                        }
/* 1578 */              return;
                    }
/* 67 */            i9 = i4 | 28032;
/* 69 */            illiIl1l11O4 = illiIl1l11O3;
/* 93 */            if ((196608 & i2) == 0) {
                    }
/* 101 */           if ((1572864 & i2) != 0) {
                    }
/* 130 */           if ((i2 & 12582912) == 0) {
                    }
/* 138 */           if ((100663296 & i2) == 0) {
                    }
/* 146 */           if ((805306368 & i2) == 0) {
                    }
/* 178 */           if (iloI0lOlll1.I00OIl(i9 & 1, (306783379 & i9) == 306783378)) {
                    }
/* 481 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 485 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(int i, IOii1l iOii1l, IOii1l iOii1l2, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, i00O0OOIlOO i00o0ooiloo, IlliIl1l11O illiIl1l11O3, IloI0lOlll1 iloI0lOlll1, int i2) {
/* 20 */            iloI0lOlll1.I00i0O(-280287501);
/* 108 */           int i3 = i2 | (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(iOii1l2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 2048 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 16384 : 8192) | (iloI0lOlll1.I000II(i00o0ooiloo) ? 131072 : 65536) | (iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 1048576 : 524288);
/* 127 */           if (iloI0lOlll1.I00OIl(i3 & 1, (599187 & i3) != 599186)) {
/* 129 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 133 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 135 */               if (objI00O0i0ii == obj) {
/* 139 */                   OiO0illOoOI oiO0illOoOI = new OiO0illOoOI();
/* 152 */                   oiO0illOoOI.I00000oIO = lOO00IiI0li.I00000oIO(new OIo1i1(0.0f, 0.0f, 0.0f, 0.0f));
/* 154 */                   VarHandle.storeStoreFence();
/* 157 */                   iloI0lOlll1.I00iio(oiO0illOoOI);
                            obj2 = oiO0illOoOI;
                        }
/* 160 */               OiO0illOoOI oiO0illOoOI2 = (OiO0illOoOI) obj2;
/* 227 */               boolean z = ((i3 & 896) == 256) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576);
/* 228 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 232 */               if (z || objI00O0i0ii2 == obj) {
/* 239 */                   OI1l1Oo1i0o1 oI1l1Oo1i0o1 = new OI1l1Oo1i0o1(1);
/* 242 */                   oI1l1Oo1i0o1.I00iio = i00o0ooiloo;
/* 244 */                   oI1l1Oo1i0o1.I00ilI0I1 = iOii1l;
/* 246 */                   oI1l1Oo1i0o1.I00iiI = illiIl1l11O;
/* 248 */                   oI1l1Oo1i0o1.I00ilO0 = illiIl1l11O2;
/* 250 */                   oI1l1Oo1i0o1.I00iiO = i;
/* 252 */                   oI1l1Oo1i0o1.I00io1l = illiIl1l11O3;
/* 254 */                   oI1l1Oo1i0o1.I00ioIO = oiO0illOoOI2;
/* 256 */                   oI1l1Oo1i0o1.I00l0I0l0lO1 = iOii1l2;
/* 258 */                   VarHandle.storeStoreFence();
/* 261 */                   iloI0lOlll1.I00iio(oI1l1Oo1i0o1);
                            obj3 = oI1l1Oo1i0o1;
                        }
/* 269 */               Oli1lii10.I00000oIO(null, (IlliIl1l11O) obj3, iloI0lOlll1, 0, 1);
                    } else {
/* 273 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 276 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 280 */           if (oOloioIlI001IO000 != null) {
/* 285 */               IOii0100lIi0 iOii0100lIi0 = new IOii0100lIi0(3);
/* 288 */               iOii0100lIi0.I00iiI = i;
/* 290 */               iOii0100lIi0.I00iiO = iOii1l;
/* 292 */               iOii0100lIi0.I00iio = iOii1l2;
/* 294 */               iOii0100lIi0.I00ilI0I1 = illiIl1l11O;
/* 296 */               iOii0100lIi0.I00ilO0 = illiIl1l11O2;
/* 298 */               iOii0100lIi0.I00io1l = i00o0ooiloo;
/* 300 */               iOii0100lIi0.I00ioIO = illiIl1l11O3;
/* 302 */               VarHandle.storeStoreFence();
/* 305 */               oOloioIlI001IO000.I0000O = iOii0100lIi0;
                    }
                }
            }
