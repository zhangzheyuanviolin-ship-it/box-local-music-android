            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class IOoiO0l {
                public static final IOoi1llO0Oo I00000oIO;

                static {
/* 1 */             Oii0IOl oii0IOl = Oii0IOl.I00iOIl;
/* 3 */             IOlO1IilOlOl iOlO1IilOlOl = I0olo0.I00000oIO;
/* 5 */             Oii0IOl oii0IOl2 = Oii0IOl.I00iOIl;
/* 7 */             Oii0IOl oii0IOl3 = Oii0IOl.I00iOIl;
/* 11 */            long j = IOOiio0i.I0001Ioi1lo;
/* 13 */            long j2 = IOOiio0i.I00000oOI;
/* 18 */            long jI0000Il00O = IOOiio0i.I0000Il00O(0.38f, j2);
/* 22 */            long jI0000Il00O2 = IOOiio0i.I0000Il00O(0.38f, j2);
/* 26 */            IOoi1llO0Oo iOoi1llO0Oo = new IOoi1llO0Oo();
/* 29 */            iOoi1llO0Oo.I00000oIO = j;
/* 31 */            iOoi1llO0Oo.I00000oOI = j2;
/* 33 */            iOoi1llO0Oo.I0000Il00O = j2;
/* 35 */            iOoi1llO0Oo.I0000O = jI0000Il00O;
/* 37 */            iOoi1llO0Oo.I0000oI00 = jI0000Il00O2;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            I00000oIO = iOoi1llO0Oo;
                }

                public static final void I00000oIO(IOoi1llO0Oo iOoi1llO0Oo, O1ooiI111i o1ooiI111i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
/* 4 */             iloI0lOlll1.I00i0O(-527864079);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(iOoi1llO0Oo) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 72 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 74 */                II0O000iIl iI0O000iIl = IOoiIOo1.I00000oIO;
/* 88 */                o1ooiI111i2 = o1ooiI111i;
/* 118 */               O1ooiI111i o1ooiI111iI0000Il00O = iO0l10O.I0000Il00O(iO01II.I000O01llI0(iIo1llOOlOI.I00000oOI(i0I1I0.I00000oOI(lOI11ilO.I00000oIO(o1ooiI111i2, 3.0f, OiI11O1i1.I00000oOI(4.0f), 0L, 28), iOoi1llO0Oo.I00000oIO, iO0ioilo.I00000oIO), Ioooi1OOlliO.I00iiI), 0.0f, IOoiIOo1.I0000O, 1), iO0l10O.I00000oOI(iloI0lOlll1), true);
/* 124 */               int i3 = (i2 << 3) & 7168;
/* 130 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 136 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 140 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 144 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 150 */               IOl0oi0lOl1.I000lI.getClass();
/* 153 */               iloI0lOlll1.I00i0oil();
/* 158 */               if (iloI0lOlll1.I00O10llo) {
/* 162 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 166 */                   iloI0lOlll1.I00io1l();
                        }
/* 171 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 176 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 185 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 188 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 193 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 208 */               iOii1l.invoke(IOOloooii.I00000oIO, iloI0lOlll1, Integer.valueOf(((i3 >> 6) & 112) | 6));
/* 211 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 215 */               o1ooiI111i2 = o1ooiI111i;
/* 216 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 219 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 223 */           if (oOloioIlI001IO000 != null) {
/* 229 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(8);
/* 232 */               i0IliiililIo.I00iiO = iOoi1llO0Oo;
/* 234 */               i0IliiililIo.I00iio = o1ooiI111i2;
/* 236 */               i0IliiililIo.I00ilI0I1 = iOii1l;
/* 238 */               i0IliiililIo.I00iiI = i;
/* 240 */               VarHandle.storeStoreFence();
/* 243 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IOoi1llO0Oo iOoi1llO0Oo, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
/* 4 */             iloI0lOlll1.I00i0O(-625529233);
/* 7 */             int i5 = i2 & 1;
/* 9 */             if (i5 != 0) {
/* 11 */                i3 = i | 6;
                    } else {
/* 23 */                i3 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2);
                    }
/* 24 */            int i6 = i2 & 2;
/* 26 */            if (i6 != 0) {
/* 28 */                i4 = i3 | 48;
                    } else {
/* 42 */                i4 = i3 | (iloI0lOlll1.I000II(iOoi1llO0Oo) ? 32 : 16);
                    }
/* 54 */            int i7 = i4 | (iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 70 */            int i8 = 7;
/* 71 */            if (iloI0lOlll1.I00OIl(i7 & 1, (i7 & 147) != 146)) {
/* 73 */                if (i5 != 0) {
/* 75 */                    o1ooiI111i = O1ooIo101ll.I00000oIO;
                        }
/* 77 */                if (i6 != 0) {
/* 79 */                    iOoi1llO0Oo = I00000oIO;
                        }
/* 83 */                I0illI1iI i0illI1iI = new I0illI1iI(i8);
/* 86 */                i0illI1iI.I00iiI = function1;
/* 88 */                i0illI1iI.I00iiO = iOoi1llO0Oo;
/* 90 */                VarHandle.storeStoreFence();
/* 111 */               I00000oIO(iOoi1llO0Oo, o1ooiI111i, iiioOl1O.I00000oOI(-250345048, i0illI1iI, iloI0lOlll1), iloI0lOlll1, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
                    } else {
/* 115 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 118 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 122 */           if (oOloioIlI001IO000 != null) {
/* 126 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(i8);
/* 129 */               i0IliiililIo.I00iiO = o1ooiI111i;
/* 131 */               i0IliiililIo.I00iio = iOoi1llO0Oo;
/* 133 */               i0IliiililIo.I00ilI0I1 = function1;
/* 135 */               i0IliiililIo.I00iiI = i2;
/* 137 */               VarHandle.storeStoreFence();
/* 140 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(String str, boolean z, IOoi1llO0Oo iOoi1llO0Oo, O1ooiI111i o1ooiI111i, Function3 function3, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 1 */             String str2 = str;
/* 20 */            iloI0lOlll1.I00i0O(-2001167027);
/* 25 */            if ((i & 6) == 0) {
/* 36 */                i2 = (iloI0lOlll1.I000II(str2) ? 4 : 2) | i;
                    } else {
/* 38 */                i2 = i;
                    }
/* 43 */            if ((i & 48) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 58 */            if ((i & 384) == 0) {
/* 71 */                i2 |= iloI0lOlll1.I000II(iOoi1llO0Oo) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i & 3072) == 0) {
/* 87 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            if ((i & 24576) == 0) {
/* 103 */               i2 |= iloI0lOlll1.I000OOo1O(function3) ? 16384 : 8192;
                    }
/* 109 */           if ((196608 & i) == 0) {
/* 121 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 131072 : 65536;
                    }
/* 140 */           if (iloI0lOlll1.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 142 */               II0O000iIl iI0O000iIl = IOoiIOo1.I00000oIO;
/* 144 */               float f = IOoiIOo1.I0000Il00O;
/* 146 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(f);
/* 165 */               boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
/* 166 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 170 */               if (!z2) {
                            Object obj = objI00O0i0ii;
/* 174 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 179 */                       I0IlOI1i i0IlOI1i = new I0IlOI1i(3);
/* 182 */                       i0IlOI1i.I00iiI = z;
/* 184 */                       i0IlOI1i.I00iiO = illOOo00lI;
/* 186 */                       VarHandle.storeStoreFence();
/* 189 */                       iloI0lOlll1.I00iio(i0IlOI1i);
                                obj = i0IlOI1i;
                            }
/* 218 */                   O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(Ol0iOOO0.I000oI1ioi(Ol0iOOO0.I0000oI00(i1Ioo1o0.I00000oOI(o1ooiI111i, z, str2, (IllOOo00lI) obj, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
/* 224 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll1, 54);
/* 230 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 234 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 238 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000O01llI0);
/* 244 */                   IOl0oi0lOl1.I000lI.getClass();
/* 247 */                   iloI0lOlll1.I00i0oil();
/* 250 */                   boolean z3 = iloI0lOlll1.I00O10llo;
/* 252 */                   IllOOo00lI illOOo00lI2 = O0iiOioolIi.I01101IOlO;
/* 254 */                   if (z3) {
/* 256 */                       iloI0lOlll1.I000l1(illOOo00lI2);
                            } else {
/* 260 */                       iloI0lOlll1.I00io1l();
                            }
/* 263 */                   IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 265 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 268 */                   IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 270 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 273 */                   Integer numValueOf = Integer.valueOf(iHashCode);
/* 277 */                   IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 279 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 282 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 285 */                   IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 287 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 290 */                   if (function3 == null) {
/* 295 */                       iloI0lOlll1.I00i01iIIliI(-1597947094);
/* 299 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 306 */                       iloI0lOlll1.I00i01iIIliI(-1597947093);
/* 309 */                       float f2 = IOoiIOo1.I0000oI00;
/* 321 */                       O1ooiI111i o1ooiI111iI000l1 = Ol0iOOO0.I000l1(O1ooIo101ll.I00000oIO, f2, 0.0f, f2, f2, 2);
/* 328 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 334 */                       int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 338 */                       OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 342 */                       O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000l1);
/* 346 */                       iloI0lOlll1.I00i0oil();
/* 351 */                       if (iloI0lOlll1.I00O10llo) {
/* 353 */                           iloI0lOlll1.I000l1(illOOo00lI2);
                                } else {
/* 357 */                           iloI0lOlll1.I00io1l();
                                }
/* 360 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 363 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 366 */                       IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 369 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 388 */                       function3.invoke(IOOiio0i.I00000oIO(z ? iOoi1llO0Oo.I0000Il00O : iOoi1llO0Oo.I0000oI00), iloI0lOlll1, 0);
/* 392 */                       iloI0lOlll1.I0010I0i(true);
/* 395 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 405 */                   long j = z ? iOoi1llO0Oo.I00000oOI : iOoi1llO0Oo.I0000O;
/* 457 */                   str2 = str;
/* 461 */                   iOOoI0OII.I0000Il00O(str2, new O0io1O(1.0f, true), new Oo0lloOiiIOI(j, IOoiIOo1.I000O01llI0, IOoiIOo1.I000OOo1O, null, IOoiIOo1.I000iOII, 0L, IOoiIOo1.I00000oOI, IOoiIOo1.I000OiO, 16613240), null, 0, false, 1, 0, null, null, iloI0lOlll1, (i2 & 14) | 1572864, 952);
/* 464 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    } else {
/* 468 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 471 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 475 */           if (oOloioIlI001IO000 != null) {
/* 480 */               I1ollooOoi i1ollooOoi = new I1ollooOoi(2);
/* 483 */               i1ollooOoi.I00iio = str2;
/* 485 */               i1ollooOoi.I00iiI = z;
/* 487 */               i1ollooOoi.I00ilI0I1 = iOoi1llO0Oo;
/* 491 */               i1ollooOoi.I00ilO0 = o1ooiI111i;
/* 495 */               i1ollooOoi.I00io1l = function3;
/* 499 */               i1ollooOoi.I00ioIO = illOOo00lI;
/* 503 */               i1ollooOoi.I00iiO = i;
/* 505 */               VarHandle.storeStoreFence();
/* 508 */               oOloioIlI001IO000.I0000O = i1ollooOoi;
                    }
                }
            }
