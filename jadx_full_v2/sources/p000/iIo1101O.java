            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iIo1101O {
                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, IoOo11l0iI ioOo11l0iI, OioOIi1o0I oioOIi1o0I, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    IoOo11l0iI ioOo11l0iI2;
                    int i5;
                    O1ooiI111i o1ooiI111i3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    OOloioIl oOloioIlI001IO000;
                    int i6;
                    int i7;
                    IoOo11l0iI ioOo11l0iI3;
                    boolean z3;
                    int i8;
/* 3 */             IlliIl1l11O illiIl1l11O2 = illiIl1l11O;
/* 14 */            iloI0lOlll1.I00i0O(1413012038);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i9 = i2 & 2;
/* 35 */            if (i9 != 0) {
/* 37 */                i3 |= 48;
                    } else {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    o1ooiI111i2 = o1ooiI111i;
/* 59 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 60 */                i4 = i2 & 4;
/* 62 */                if (i4 != 0) {
/* 71 */                    if ((i & 384) == 0) {
/* 73 */                        z2 = z;
/* 86 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 89 */                    if ((i & 3072) == 0) {
/* 93 */                        if ((i2 & 8) == 0) {
/* 95 */                            ioOo11l0iI2 = ioOo11l0iI;
/* 101 */                           if (iloI0lOlll1.I000II(ioOo11l0iI2)) {
/* 103 */                               i8 = Barcode.FORMAT_PDF417;
                                    }
/* 110 */                           i3 |= i8;
                                } else {
/* 106 */                           ioOo11l0iI2 = ioOo11l0iI;
                                }
/* 108 */                       i8 = Barcode.FORMAT_UPC_E;
/* 110 */                       i3 |= i8;
                            } else {
/* 112 */                       ioOo11l0iI2 = ioOo11l0iI;
                            }
/* 114 */                   i5 = i3 | 24576;
/* 119 */                   if ((196608 & i) == 0) {
/* 124 */                       i5 = 90112 | i3;
                            }
/* 128 */                   if ((1572864 & i) == 0) {
/* 141 */                       i5 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 1048576 : 524288;
                            }
/* 160 */                   if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) != 599186)) {
/* 162 */                       iloI0lOlll1.I00Ol00();
/* 170 */                       if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 203 */                           o1ooiI111i3 = i9 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 204 */                           if (i4 != 0) {
/* 206 */                               z2 = true;
                                    }
/* 209 */                           if ((i2 & 8) != 0) {
/* 211 */                               int i10 = IoOo1I0lIl.I00000oIO;
/* 221 */                               long j = ((IOOiio0i) iloI0lOlll1.I000iOII(IOoIioIOoolI.I00000oIO)).I00000oIO;
/* 233 */                               IoOo11l0iI ioOo11l0iII00000oIO = IoOo1I0lIl.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO, j);
/* 244 */                               if (Ooi0i1.I00000oOI(ioOo11l0iII00000oIO.I00000oOI, j)) {
/* 246 */                                   i6 = -458753;
                                        } else {
/* 257 */                                   i6 = -458753;
/* 266 */                                   ioOo11l0iII00000oIO = ioOo11l0iII00000oIO.I00000oIO(ioOo11l0iII00000oIO.I00000oIO, j, ioOo11l0iII00000oIO.I0000Il00O, IOOiio0i.I0000Il00O(OlIlIIoOIlOo.I00000oIO, j));
                                        }
/* 271 */                               i5 &= -7169;
/* 273 */                               ioOo11l0iI2 = ioOo11l0iII00000oIO;
                                    } else {
/* 275 */                               i6 = -458753;
                                    }
/* 277 */                           int i11 = IoOo1I0lIl.I00000oIO;
/* 285 */                           i7 = i5 & i6;
/* 281 */                           oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(Ol11ooiiI11.I00000oIO, iloI0lOlll1);
/* 289 */                           ioOo11l0iI3 = ioOo11l0iI2;
/* 290 */                           z3 = z2;
                                } else {
/* 179 */                           iloI0lOlll1.I00OilO00Il();
/* 184 */                           if ((i2 & 8) != 0) {
/* 186 */                               i5 &= -7169;
                                    }
/* 188 */                           i7 = i5 & (-458753);
/* 191 */                           o1ooiI111i3 = o1ooiI111i2;
/* 192 */                           oioOIi1o0II00000oOI = oioOIi1o0I;
/* 194 */                           z3 = z2;
/* 195 */                           ioOo11l0iI3 = ioOo11l0iI2;
                                }
/* 291 */                       iloI0lOlll1.I0010o();
/* 298 */                       int i12 = i7 << 3;
/* 318 */                       int i13 = ((i7 >> 3) & 14) | (i12 & 112) | (i7 & 896) | (57344 & i12) | (i12 & 458752) | (i7 & 3670016);
/* 319 */                       illiIl1l11O2 = illiIl1l11O;
/* 321 */                       I00000oOI(o1ooiI111i3, illOOo00lI, z3, oioOIi1o0II00000oOI, ioOo11l0iI3, illiIl1l11O2, iloI0lOlll1, i13);
/* 324 */                       z2 = z3;
/* 325 */                       ioOo11l0iI2 = ioOo11l0iI3;
                            } else {
/* 327 */                       iloI0lOlll1.I00OilO00Il();
/* 330 */                       o1ooiI111i3 = o1ooiI111i2;
/* 331 */                       oioOIi1o0II00000oOI = oioOIi1o0I;
                            }
/* 333 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 337 */                   if (oOloioIlI001IO000 != null) {
/* 342 */                       II011lO11Io iI011lO11Io = new II011lO11Io(1);
/* 345 */                       iI011lO11Io.I00ilO0 = illOOo00lI;
/* 347 */                       iI011lO11Io.I00iiI = o1ooiI111i3;
/* 349 */                       iI011lO11Io.I00iiO = z2;
/* 351 */                       iI011lO11Io.I00io1l = ioOo11l0iI2;
/* 353 */                       iI011lO11Io.I00ioIO = oioOIi1o0II00000oOI;
/* 355 */                       iI011lO11Io.I00l0I0l0lO1 = illiIl1l11O2;
/* 357 */                       iI011lO11Io.I00iio = i;
/* 359 */                       iI011lO11Io.I00ilI0I1 = i2;
/* 361 */                       VarHandle.storeStoreFence();
/* 364 */                       oOloioIlI001IO000.I0000O = iI011lO11Io;
/* 1821 */                      return;
                            }
/* 1821 */                  return;
                        }
/* 64 */                i3 |= 384;
/* 66 */                z2 = z;
/* 89 */                if ((i & 3072) == 0) {
                        }
/* 114 */               i5 = i3 | 24576;
/* 119 */               if ((196608 & i) == 0) {
                        }
/* 128 */               if ((1572864 & i) == 0) {
                        }
/* 160 */               if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) != 599186)) {
                        }
/* 333 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 337 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 39 */            o1ooiI111i2 = o1ooiI111i;
/* 60 */            i4 = i2 & 4;
/* 62 */            if (i4 != 0) {
                    }
/* 66 */            z2 = z;
/* 89 */            if ((i & 3072) == 0) {
                    }
/* 114 */           i5 = i3 | 24576;
/* 119 */           if ((196608 & i) == 0) {
                    }
/* 128 */           if ((1572864 & i) == 0) {
                    }
/* 160 */           if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) != 599186)) {
                    }
/* 333 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 337 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, boolean z, OioOIi1o0I oioOIi1o0I, IoOo11l0iI ioOo11l0iI, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
/* 20 */            iloI0lOlll1.I00i0O(-1134296466);
/* 26 */            if ((i & 6) == 0) {
/* 37 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 39 */                i2 = i;
                    }
/* 42 */            if ((i & 48) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 58 */            if ((i & 384) == 0) {
/* 71 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i & 3072) == 0) {
/* 87 */                i2 |= iloI0lOlll1.I000II(oioOIi1o0I) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            if ((i & 24576) == 0) {
/* 103 */               i2 |= iloI0lOlll1.I000II(ioOo11l0iI) ? 16384 : 8192;
                    }
/* 107 */           if ((196608 & i) == 0) {
/* 121 */               i2 |= iloI0lOlll1.I000II(null) ? 131072 : 65536;
                    }
/* 125 */           if ((1572864 & i) == 0) {
/* 138 */               i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 1048576 : 524288;
                    }
/* 139 */           int i4 = i2;
/* 162 */           if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 599187) != 599186)) {
/* 167 */               iloI0lOlll1.I00i01iIIliI(976976045);
/* 170 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 176 */               if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 178 */                   objI00O0i0ii = l001l0.I00000oIO();
/* 182 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 185 */               OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 187 */               iloI0lOlll1.I0010I0i(false);
/* 190 */               IoI110lO0O ioI110lO0O = IooiioIo.I00000oIO;
/* 194 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(O1lolo0IO.I00000oIO);
/* 198 */               int i5 = IoOo1I0lIl.I00000oIO;
/* 200 */               long jI0000O = IoOo1I0lIl.I0000O();
/* 204 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I00000oIO;
/* 259 */               i3 = i;
/* 265 */               O1ooiI111i o1ooiI111iI00000oIO = iOo0o0.I00000oIO(i1Ioo1o0.I00000oIO(i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(Ol0iOOO0.I000o00OoI0I(o1ooiI111iI0000O, Iil1iI01I0O0.I00000oOI(jI0000O), Iil1iI01I0O0.I00000oIO(jI0000O)), oioOIi1o0I), z ? ioOo11l0iI.I00000oIO : ioOo11l0iI.I0000Il00O, oioOIi1o0I), oI0lOIiOIOOo, Oi1iliO.I00000oIO(false, 0.0f, 0L, oioOIi1o0I, 247), z, Oi1o00lo.I00000oIO(0), illOOo00lI, 8));
/* 273 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 279 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 283 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 287 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 293 */               IOl0oi0lOl1.I000lI.getClass();
/* 296 */               iloI0lOlll1.I00i0oil();
/* 301 */               if (iloI0lOlll1.I00O10llo) {
/* 305 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 309 */                   iloI0lOlll1.I00io1l();
                        }
/* 314 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 319 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 328 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 331 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 336 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 363 */               iiliio0o.I00000oIO(IOoIioIOoolI.I00000oIO.I00000oIO(IOOiio0i.I00000oIO(z ? ioOo11l0iI.I00000oOI : ioOo11l0iI.I0000O)), illiIl1l11O, iloI0lOlll1, ((i4 >> 15) & 112) | 8);
/* 366 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 370 */               i3 = i;
/* 371 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 374 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 378 */           if (oOloioIlI001IO000 != null) {
/* 383 */               I1ollooOoi i1ollooOoi = new I1ollooOoi(4);
/* 388 */               i1ollooOoi.I00iio = o1ooiI111i;
/* 390 */               i1ollooOoi.I00ilI0I1 = illOOo00lI;
/* 392 */               i1ollooOoi.I00iiI = z;
/* 394 */               i1ollooOoi.I00ilO0 = oioOIi1o0I;
/* 396 */               i1ollooOoi.I00io1l = ioOo11l0iI;
/* 398 */               i1ollooOoi.I00ioIO = illiIl1l11O;
/* 400 */               i1ollooOoi.I00iiO = i3;
/* 402 */               VarHandle.storeStoreFence();
/* 405 */               oOloioIlI001IO000.I0000O = i1ollooOoi;
                    }
                }

                public static final void I0000Il00O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IoOo11l0iI ioOo11l0iI, II1IOloil iI1IOloil, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    boolean z2;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    int i5;
/* 14 */            iloI0lOlll1.I00i0O(-1481353380);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i6 = i2 & 2;
/* 35 */            if (i6 != 0) {
/* 37 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 55 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 56 */            int i7 = i2 & 4;
/* 58 */            if (i7 != 0) {
/* 60 */                i4 = i3 | 384;
                    } else {
/* 74 */                i4 = i3 | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
                    }
/* 103 */           int i8 = i4 | Barcode.FORMAT_UPC_E | (iloI0lOlll1.I000II(ioOo11l0iI) ? 16384 : 8192) | (iloI0lOlll1.I000II(iI1IOloil) ? 131072 : 65536) | 1572864;
/* 123 */           if (iloI0lOlll1.I00OIl(i8 & 1, (4793491 & i8) != 4793490)) {
/* 125 */               iloI0lOlll1.I00Ol00();
/* 130 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 148 */                   if (i6 != 0) {
/* 150 */                       o1ooiI111i = O1ooIo101ll.I00000oIO;
                            }
/* 152 */                   boolean z3 = i7 == 0 ? z : true;
/* 156 */                   int i9 = IoOo1I0lIl.I00000oIO;
/* 164 */                   i5 = i8 & (-7169);
/* 160 */                   oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(Ol11ooiiI11.I00000oIO, iloI0lOlll1);
/* 167 */                   z2 = z3;
                        } else {
/* 139 */                   iloI0lOlll1.I00OilO00Il();
/* 142 */                   i5 = i8 & (-7169);
/* 144 */                   z2 = z;
/* 145 */                   oioOIi1o0II00000oOI = oioOIi1o0I;
                        }
/* 146 */               O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 169 */               iloI0lOlll1.I0010o();
/* 180 */               I0000O(illOOo00lI, o1ooiI111i2, z2, oioOIi1o0II00000oOI, ioOo11l0iI, iI1IOloil, iOii1l, iloI0lOlll1, i5 & 33554430);
/* 183 */               o1ooiI111i = o1ooiI111i2;
                    } else {
/* 185 */               iloI0lOlll1.I00OilO00Il();
/* 188 */               z2 = z;
/* 189 */               oioOIi1o0II00000oOI = oioOIi1o0I;
                    }
/* 190 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 194 */           if (oOloioIlI001IO000 != null) {
/* 199 */               I0oiII i0oiII = new I0oiII(3);
/* 202 */               i0oiII.I00iiI = illOOo00lI;
/* 204 */               i0oiII.I00iiO = o1ooiI111i;
/* 206 */               i0oiII.I00iio = z2;
/* 208 */               i0oiII.I00ioIO = oioOIi1o0II00000oOI;
/* 210 */               i0oiII.I00l0I0l0lO1 = ioOo11l0iI;
/* 212 */               i0oiII.I00l0OO0IO = iI1IOloil;
/* 216 */               i0oiII.I00ilI0I1 = iOii1l;
/* 218 */               i0oiII.I00ilO0 = i;
/* 220 */               i0oiII.I00io1l = i2;
/* 222 */               VarHandle.storeStoreFence();
/* 225 */               oOloioIlI001IO000.I0000O = i0oiII;
                    }
                }

                public static final void I0000O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IoOo11l0iI ioOo11l0iI, II1IOloil iI1IOloil, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 11 */            II1IOloil iI1IOloil2 = iI1IOloil;
/* 22 */            iloI0lOlll1.I00i0O(-171935091);
/* 27 */            if ((i & 6) == 0) {
/* 38 */                i2 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 40 */                i2 = i;
                    }
/* 43 */            if ((i & 48) == 0) {
/* 56 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 59 */            if ((i & 384) == 0) {
/* 72 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 75 */            if ((i & 3072) == 0) {
/* 88 */                i2 |= iloI0lOlll1.I000II(oioOIi1o0I) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 91 */            if ((i & 24576) == 0) {
/* 104 */               i2 |= iloI0lOlll1.I000II(ioOo11l0iI) ? 16384 : 8192;
                    }
/* 108 */           if ((196608 & i) == 0) {
/* 121 */               i2 |= iloI0lOlll1.I000II(iI1IOloil2) ? 131072 : 65536;
                    }
/* 126 */           if ((1572864 & i) == 0) {
/* 139 */               i2 |= iloI0lOlll1.I000II(null) ? 1048576 : 524288;
                    }
/* 143 */           if ((12582912 & i) == 0) {
/* 156 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 8388608 : 4194304;
                    }
/* 164 */           int i3 = 0;
/* 176 */           if (iloI0lOlll1.I00OIl(i2 & 1, (4793491 & i2) != 4793490)) {
/* 178 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 184 */               if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 190 */                   objI00O0i0ii = new IoI0IiI0(12);
/* 193 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 198 */               O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111i, false, (Function1) objI00O0i0ii);
/* 207 */               long j = z ? ioOo11l0iI.I00000oIO : ioOo11l0iI.I0000Il00O;
/* 214 */               long j2 = z ? ioOo11l0iI.I00000oOI : ioOo11l0iI.I0000O;
/* 218 */               IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(i3);
/* 221 */               ioOo1I0o1.I00iiI = iOii1l;
/* 223 */               VarHandle.storeStoreFence();
/* 229 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(669231714, ioOo1I0o1, iloI0lOlll1);
/* 233 */               int i4 = i2 & 8078;
/* 235 */               int i5 = i2 << 9;
/* 256 */               iI1IOloil2 = iI1IOloil;
/* 259 */               OlioioOl0O.I0000Il00O(illOOo00lI, o1ooiI111iI00000oOI, z, oioOIi1o0I, j, j2, 0.0f, 0.0f, iI1IOloil2, null, iOii1lI00000oOI, iloI0lOlll1, (i5 & 1879048192) | i4 | (i5 & 234881024), 192);
                    } else {
/* 263 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 266 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 270 */           if (oOloioIlI001IO000 != null) {
/* 275 */               IOI0Ol1l iOI0Ol1l = new IOI0Ol1l(1);
/* 278 */               iOI0Ol1l.I00iiI = illOOo00lI;
/* 282 */               iOI0Ol1l.I00iiO = o1ooiI111i;
/* 284 */               iOI0Ol1l.I00iio = z;
/* 286 */               iOI0Ol1l.I00ilO0 = oioOIi1o0I;
/* 290 */               iOI0Ol1l.I00io1l = ioOo11l0iI;
/* 292 */               iOI0Ol1l.I00ioIO = iI1IOloil2;
/* 296 */               iOI0Ol1l.I00l0I0l0lO1 = iOii1l;
/* 300 */               iOI0Ol1l.I00ilI0I1 = i;
/* 302 */               VarHandle.storeStoreFence();
/* 305 */               oOloioIlI001IO000.I0000O = iOI0Ol1l;
                    }
                }
            }
