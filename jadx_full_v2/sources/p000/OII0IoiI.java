            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OII0IoiI {
                public static final OoIoO0I0oOI I00000oIO = new OoIoO0I0oOI(Barcode.FORMAT_QR_CODE, (IioIllI11l0I) null, 6);

                public static final void I00000oIO(i00O0OOIlOO i00o0ooiloo, O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, long j, long j2, IlOOiIO ilOOiIO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    IlOOiIO ilOOiIO2;
                    int i4;
                    IlOOiIO ilOOiIO3;
                    int i5;
/* 5 */             OioOIi1o0I oioOIi1o0I2 = oioOIi1o0I;
/* 20 */            iloI0lOlll1.I00i0O(1560288494);
/* 25 */            if ((i & 6) == 0) {
/* 37 */                i2 = (iloI0lOlll1.I000II(null) ? 4 : 2) | i;
                    } else {
/* 39 */                i2 = i;
                    }
/* 42 */            if ((i & 48) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000II(i00o0ooiloo) ? 32 : 16;
                    }
/* 58 */            if ((i & 384) == 0) {
/* 71 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i & 3072) == 0) {
/* 87 */                i2 |= iloI0lOlll1.I000II(oioOIi1o0I2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            if ((i & 24576) == 0) {
/* 103 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? 16384 : 8192;
                    }
/* 107 */           if ((196608 & i) == 0) {
/* 120 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 131072 : 65536;
                    }
/* 125 */           if ((1572864 & i) == 0) {
/* 138 */               i2 |= iloI0lOlll1.I0000O(0.0f) ? 1048576 : 524288;
                    }
/* 143 */           if ((i & 12582912) == 0) {
/* 147 */               i2 |= 4194304;
                    }
/* 151 */           if ((100663296 & i) == 0) {
/* 164 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 67108864 : 33554432;
                    }
/* 172 */           int i6 = i2;
/* 186 */           if (iloI0lOlll1.I00OIl(i6 & 1, (38347923 & i2) != 38347922)) {
/* 188 */               iloI0lOlll1.I00Ol00();
/* 196 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 215 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 219 */                   i4 = 12582912;
/* 223 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 227 */                       objI00O0i0ii = new I11Oo11I(1);
/* 230 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 234 */                   ilOOiIO3 = (IlOOiIO) objI00O0i0ii;
/* 236 */                   i5 = i6 & (-29360129);
                        } else {
/* 205 */                   iloI0lOlll1.I00OilO00Il();
/* 208 */                   i5 = i6 & (-29360129);
/* 210 */                   i4 = 12582912;
/* 212 */                   ilOOiIO3 = ilOOiIO;
                        }
/* 238 */               iloI0lOlll1.I0010o();
/* 247 */               IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 249 */               float f = OII0OlOIO000.I00000oOI;
/* 251 */               float fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(f);
/* 267 */               boolean z = iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I) == O0iOOoiioO.I00iiI;
/* 273 */               O1ooiI111i o1ooiI111iI00100l0 = Ol0iOOO0.I00100l0(o1ooiI111i, 240.0f, 0.0f, f, 10);
/* 280 */               OII0IOII01 oii0ioii01 = new OII0IOII01(1);
/* 283 */               oii0ioii01.I00iiI = ilOOiIO3;
/* 285 */               oii0ioii01.I00iiO = fI00i0ilIl0i;
/* 287 */               oii0ioii01.I00iio = z;
/* 289 */               VarHandle.storeStoreFence();
/* 304 */               O1ooiI111i o1ooiI111iI0000Il00O = Ol0iOOO0.I0000Il00O(iIlll1lo.I00000oIO(o1ooiI111iI00100l0, oii0ioii01).I0000O(O1ooIo101ll.I00000oIO), 1.0f);
/* 310 */               OII0II oii0ii = new OII0II();
/* 313 */               oii0ii.I00iOIl = z;
/* 315 */               oii0ii.I00iiI = f;
/* 317 */               oii0ii.I00iiO = ilOOiIO3;
/* 319 */               oii0ii.I00iio = fI00i0ilIl0i;
/* 321 */               oii0ii.I00ilI0I1 = i00o0ooiloo;
/* 323 */               oii0ii.I00ilO0 = iOii1l;
/* 325 */               VarHandle.storeStoreFence();
/* 335 */               int i7 = i5 >> 6;
/* 363 */               i3 = 1;
/* 366 */               oioOIi1o0I2 = oioOIi1o0I;
/* 368 */               OlioioOl0O.I00000oIO(o1ooiI111iI0000Il00O, oioOIi1o0I2, j, j2, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(-315420087, oii0ii, iloI0lOlll1), iloI0lOlll1, (i7 & 112) | i4 | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 96);
/* 371 */               ilOOiIO2 = ilOOiIO3;
                    } else {
/* 374 */               i3 = 1;
/* 375 */               iloI0lOlll1.I00OilO00Il();
/* 378 */               ilOOiIO2 = ilOOiIO;
                    }
/* 380 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 384 */           if (oOloioIlI001IO000 != null) {
/* 388 */               O1O0Oiool0 o1O0Oiool0 = new O1O0Oiool0(i3);
/* 391 */               o1O0Oiool0.I00ilO0 = i00o0ooiloo;
/* 393 */               o1O0Oiool0.I00iiI = o1ooiI111i;
/* 395 */               o1O0Oiool0.I00io1l = oioOIi1o0I2;
/* 397 */               o1O0Oiool0.I00iiO = j;
/* 399 */               o1O0Oiool0.I00iio = j2;
/* 401 */               o1O0Oiool0.I00ioIO = ilOOiIO2;
/* 405 */               o1O0Oiool0.I00l0I0l0lO1 = iOii1l;
/* 409 */               o1O0Oiool0.I00ilI0I1 = i;
/* 411 */               VarHandle.storeStoreFence();
/* 414 */               oOloioIlI001IO000.I0000O = o1O0Oiool0;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, OioOIi1o0I oioOIi1o0I, long j, long j2, i00O0OOIlOO i00o0ooiloo, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    long j3;
                    long j4;
                    i00O0OOIlOO i00o0ooilooI00000oIO;
                    O1ooiI111i o1ooiI111i2;
/* 6 */             iloI0lOlll1.I00i0O(1922633461);
/* 12 */            int i2 = i | 91286;
/* 21 */            int i3 = 1;
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (599187 & i2) != 599186)) {
/* 34 */                iloI0lOlll1.I00Ol00();
/* 39 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 60 */                    float f = IiloOO1o.I00000oIO;
/* 64 */                    oioOIi1o0I = Oiol0Ol0li0.I00000oOI(OII0OlOIO000.I00000oIO, iloI0lOlll1);
/* 70 */                    long jI0000oI00 = IOOl0iiliOl.I0000oI00(OII0OlOIO000.I0000Il00O, iloI0lOlll1);
/* 74 */                    long jI00000oOI = IOOl0iiliOl.I00000oOI(jI0000oI00, iloI0lOlll1);
/* 78 */                    WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
/* 107 */                   j4 = jI00000oOI;
/* 101 */                   i00o0ooilooI00000oIO = iO1OO0i0i.I00000oIO(iO1OO0i0i.I00000oOI(liIIiol0oI10.I00000oIO(iloI0lOlll1).I000II, liIIiol0oI10.I00000oIO(iloI0lOlll1).I00000oOI), liIIl1IoIl0i.I0001Ioi1lo | liIIl1IoIl0i.I00000oIO);
/* 105 */                   o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 111 */                   j3 = jI0000oI00;
                        } else {
/* 48 */                    iloI0lOlll1.I00OilO00Il();
/* 51 */                    o1ooiI111i2 = o1ooiI111i;
/* 52 */                    j3 = j;
/* 54 */                    j4 = j2;
/* 56 */                    i00o0ooilooI00000oIO = i00o0ooiloo;
                        }
/* 58 */                OioOIi1o0I oioOIi1o0I2 = oioOIi1o0I;
/* 113 */               iloI0lOlll1.I0010o();
/* 122 */               I00000oIO(i00o0ooilooI00000oIO, o1ooiI111i2, oioOIi1o0I2, j3, j4, null, iOii1l, iloI0lOlll1, 102236550);
/* 125 */               o1ooiI111i = o1ooiI111i2;
/* 126 */               oioOIi1o0I = oioOIi1o0I2;
                    } else {
/* 128 */               iloI0lOlll1.I00OilO00Il();
/* 131 */               j3 = j;
/* 133 */               j4 = j2;
/* 135 */               i00o0ooilooI00000oIO = i00o0ooiloo;
                    }
/* 137 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 141 */           if (oOloioIlI001IO000 != null) {
/* 145 */               IlOiIi0 ilOiIi0 = new IlOiIi0(i3);
/* 148 */               ilOiIi0.I00iiI = o1ooiI111i;
/* 150 */               ilOiIi0.I00iiO = oioOIi1o0I;
/* 152 */               ilOiIi0.I00iio = j3;
/* 154 */               ilOiIi0.I00ilI0I1 = j4;
/* 156 */               ilOiIi0.I00ilO0 = i00o0ooilooI00000oIO;
/* 160 */               ilOiIi0.I00io1l = iOii1l;
/* 162 */               VarHandle.storeStoreFence();
/* 165 */               oOloioIlI001IO000.I0000O = ilOiIi0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:107:0x0283  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x02d5 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:119:0x02d7  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x030f A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:131:0x0311  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x0346 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:143:0x0348  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x037f A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:155:0x0381  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x03ab  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x03b3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(IOii1l iOii1l, O1ooiI111i o1ooiI111i, IiloOlIoIool iiloOlIoIool, boolean z, long j, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i) {
                    IOii1l iOii1l3;
                    O1ooiI111i o1ooiI111i2;
                    long j2;
                    long jI0000Il00O;
                    int i2;
                    O1ooiI111i o1ooiI111i3;
                    IOioOOi0I iOioOOi0I;
                    boolean z2;
                    boolean z3;
                    Object obj;
                    boolean z4;
                    Object obj2;
                    boolean zI000II;
                    Object obj3;
                    boolean zI000OOo1O;
                    Object obj4;
                    boolean zI000II2;
                    Object obj5;
/* 1 */             IiloOlIoIool iiloOlIoIool2 = iiloOlIoIool;
/* 15 */            iloI0lOlll1.I00i0O(-1907430816);
/* 44 */            int i3 = i | 48 | (iloI0lOlll1.I000II(iiloOlIoIool2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | 8192;
/* 65 */            if (iloI0lOlll1.I00OIl(i3 & 1, (74899 & i3) != 74898)) {
/* 67 */                iloI0lOlll1.I00Ol00();
/* 70 */                int i4 = i & 1;
/* 72 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 77 */                if (i4 == 0 || iloI0lOlll1.I001lloI()) {
/* 96 */                    float f = IiloOO1o.I00000oIO;
/* 109 */                   jI0000Il00O = IOOiio0i.I0000Il00O(0.32f, IOOl0iiliOl.I0000oI00(OiOi0Oo.I00000oIO, iloI0lOlll1));
/* 113 */                   i2 = i3 & (-57345);
/* 116 */                   o1ooiI111i3 = o1ooIo101ll;
                        } else {
/* 86 */                    iloI0lOlll1.I00OilO00Il();
/* 90 */                    jI0000Il00O = j;
/* 89 */                    i2 = i3 & (-57345);
/* 93 */                    o1ooiI111i3 = o1ooiI111i;
                        }
/* 117 */               iloI0lOlll1.I0010o();
/* 120 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 124 */               Object obj6 = IOl11li.I00000oIO;
/* 126 */               if (objI00O0i0ii == obj6) {
/* 128 */                   objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 132 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 135 */               Object obj7 = (Ii0110) objI00O0i0ii;
/* 140 */               Object objI00000oIO = lOi10Ol.I00000oIO(R.string.navigation_menu, iloI0lOlll1);
/* 150 */               Object obj8 = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 152 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 156 */               if (objI00O0i0ii2 == obj6) {
/* 160 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 164 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 167 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 169 */               boolean zI000II3 = iloI0lOlll1.I000II(obj8);
/* 173 */               long j3 = jI0000Il00O;
/* 175 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 179 */               if (zI000II3 || objI00O0i0ii3 == obj6) {
/* 186 */                   objI00O0i0ii3 = new OIooO1iiliI(0.0f);
/* 189 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 192 */               OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) objI00O0i0ii3;
/* 194 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 198 */               if (objI00O0i0ii4 == obj6) {
/* 202 */                   objI00O0i0ii4 = new Ili1lII();
/* 205 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 208 */               Ili1lII ili1lII = (Ili1lII) objI00O0i0ii4;
/* 210 */               OI0I0o oI0I0o = OI0I0o.I00iOIl;
/* 214 */               Object objI00000oOI = l1i1II.I00000oOI(oI0I0o, iloI0lOlll1);
/* 218 */               Object objI00000oOI2 = l1i1II.I00000oOI(oI0I0o, iloI0lOlll1);
/* 226 */               Object objI00000oOI3 = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 234 */               int i5 = (i2 & 896) ^ 384;
/* 274 */               boolean zI000II4 = ((i5 > 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i2 & 384) == 256) | iloI0lOlll1.I000II(obj8) | iloI0lOlll1.I000OOo1O(objI00000oOI2) | iloI0lOlll1.I000OOo1O(objI00000oOI3) | iloI0lOlll1.I000OOo1O(objI00000oOI);
/* 275 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj9 = objI00O0i0ii5;
/* 279 */               if (zI000II4 || objI00O0i0ii5 == obj6) {
/* 287 */                   I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(23);
/* 290 */                   i0IoO01lIoO.I00iiI = iiloOlIoIool2;
/* 292 */                   i0IoO01lIoO.I00iiO = obj8;
/* 294 */                   i0IoO01lIoO.I00iio = objI00000oOI2;
/* 296 */                   i0IoO01lIoO.I00ilI0I1 = objI00000oOI3;
/* 298 */                   VarHandle.storeStoreFence();
/* 301 */                   iloI0lOlll1.I00iio(i0IoO01lIoO);
                            obj9 = i0IoO01lIoO;
                        }
/* 306 */               iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj9, iloI0lOlll1);
/* 313 */               Boolean boolValueOf = Boolean.valueOf(iiloOlIoIool2.I0000Il00O());
/* 333 */               boolean z5 = (i5 > 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i2 & 384) == 256;
/* 334 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 338 */               IOoil1iiIilo iOoil1iiIilo = null;
/* 339 */               if (z5 || objI00O0i0ii6 == obj6) {
/* 347 */                   objI00O0i0ii6 = new O00lOIIO(iiloOlIoIool2, ili1lII, iOoil1iiIilo, 19);
/* 350 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 355 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii6, iloI0lOlll1, boolValueOf);
/* 370 */               boolean z6 = iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I) == O0iOOoiioO.I00iiI;
/* 373 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111i3.I0000O(Ol0iOOO0.I0000Il00O);
/* 377 */               I0l1OOl1l10 i0l1OOl1l10 = iiloOlIoIool2.I00000oOI;
/* 379 */               OIilII oIilII = OIilII.I00iOIl;
/* 381 */               O1ooiI111i o1ooiI111iI0000Il00O = I0l0lIoOIoIi.I0000Il00O(o1ooiI111iI0000O, i0l1OOl1l10, z6, z);
/* 385 */               II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 388 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 395 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 399 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 403 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 409 */               IOl0oi0lOl1.I000lI.getClass();
/* 412 */               iloI0lOlll1.I00i0oil();
/* 415 */               boolean z7 = iloI0lOlll1.I00O10llo;
/* 419 */               IllOOo00lI illOOo00lI = O0iiOioolIi.I01101IOlO;
/* 421 */               if (z7) {
/* 423 */                   iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 429 */                   iloI0lOlll1.I00io1l();
                        }
/* 433 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00io1l;
/* 435 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 438 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 440 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI);
/* 443 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 447 */               O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 449 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ioIO;
/* 451 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, numValueOf);
/* 454 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 457 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 459 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 463 */               O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 469 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 473 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 479 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 483 */               iloI0lOlll1.I00i0oil();
/* 490 */               if (iloI0lOlll1.I00O10llo) {
/* 492 */                   iloI0lOlll1.I000l1(illOOo00lI);
                        } else {
/* 496 */                   iloI0lOlll1.I00io1l();
                        }
/* 499 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 502 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI2);
/* 505 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 508 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 513 */               iOii1l2.invoke(iloI0lOlll1, 6);
/* 517 */               iloI0lOlll1.I0010I0i(true);
/* 556 */               boolean zI000OOo1O2 = ((i2 & 7168) == 2048) | ((i5 > 256 && iloI0lOlll1.I000II(iiloOlIoIool)) || (i2 & 384) == 256) | iloI0lOlll1.I000OOo1O(obj7);
/* 557 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj10 = objI00O0i0ii7;
/* 561 */               if (zI000OOo1O2 || objI00O0i0ii7 == obj6) {
/* 568 */                   Iiii11o0 iiii11o0 = new Iiii11o0(2);
/* 571 */                   iiii11o0.I00iiI = z;
/* 573 */                   iiii11o0.I00iiO = iiloOlIoIool;
/* 575 */                   iiii11o0.I00iio = obj7;
/* 577 */                   VarHandle.storeStoreFence();
/* 580 */                   iloI0lOlll1.I00iio(iiii11o0);
                            obj10 = iiii11o0;
                        }
/* 583 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj10;
/* 588 */               String strI00000oIO = lOi10Ol.I00000oIO(R.string.close_drawer, iloI0lOlll1);
/* 596 */               if (!iiloOlIoIool.I0000Il00O()) {
/* 603 */                   illOOo00lI2 = null;
                        }
/* 605 */               boolean zI000II5 = iloI0lOlll1.I000II(oIooO1iiliI);
/* 613 */               if (i5 <= 256 || !iloI0lOlll1.I000II(iiloOlIoIool)) {
/* 625 */                   iOioOOi0I = iOioOOi0I4;
/* 629 */                   if ((i2 & 384) != 256) {
/* 633 */                       z2 = false;
                            }
/* 634 */                   z3 = zI000II5 | z2;
/* 636 */                   Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                            obj = objI00O0i0ii8;
/* 640 */                   if (!z3 || objI00O0i0ii8 == obj6) {
/* 648 */                       O1l110o o1l110o = new O1l110o(8);
/* 651 */                       o1l110o.I00iiI = iiloOlIoIool;
/* 653 */                       o1l110o.I00iiO = oIooO1iiliI;
/* 655 */                       VarHandle.storeStoreFence();
/* 658 */                       iloI0lOlll1.I00iio(o1l110o);
                                obj = o1l110o;
                            }
/* 665 */                   int i6 = i2;
/* 671 */                   iiloOlIoIool2 = iiloOlIoIool;
/* 676 */                   IOioOOi0I iOioOOi0I6 = iOioOOi0I;
/* 692 */                   j2 = j3;
/* 700 */                   iO0l0I1O.I00000oIO(strI00000oIO, null, illOOo00lI2, (IllOOo00lI) obj, j2, iloI0lOlll1, 0);
/* 719 */                   z4 = (i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i6 & 384) == 256;
/* 720 */                   Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                            obj2 = objI00O0i0ii9;
/* 724 */                   if (z4 || objI00O0i0ii9 == obj6) {
/* 732 */                       O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(25);
/* 735 */                       o0l0IlolloIO.I00iiI = iiloOlIoIool2;
/* 737 */                       VarHandle.storeStoreFence();
/* 740 */                       iloI0lOlll1.I00iio(o0l0IlolloIO);
                                obj2 = o0l0IlolloIO;
                            }
/* 745 */                   O1ooiI111i o1ooiI111iI00000oIO = iO0100loIol.I00000oIO(o1ooIo101ll, (Function1) obj2);
/* 777 */                   zI000II = iloI0lOlll1.I000II(objI00000oIO) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i6 & 384) == 256) | iloI0lOlll1.I000OOo1O(obj7);
/* 778 */                   Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                            obj3 = objI00O0i0ii10;
/* 782 */                   if (zI000II || objI00O0i0ii10 == obj6) {
/* 789 */                       O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(7);
/* 792 */                       o11IOOoiI10i.I00iiI = objI00000oIO;
/* 794 */                       o11IOOoiI10i.I00iiO = iiloOlIoIool2;
/* 796 */                       o11IOOoiI10i.I00iio = obj7;
/* 798 */                       VarHandle.storeStoreFence();
/* 801 */                       iloI0lOlll1.I00iio(o11IOOoiI10i);
                                obj3 = o11IOOoiI10i;
                            }
/* 807 */                   O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO, false, (Function1) obj3);
/* 832 */                   zI000OOo1O = iloI0lOlll1.I000OOo1O(obj7) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i6 & 384) == 256);
/* 833 */                   Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                            obj4 = objI00O0i0ii11;
/* 837 */                   if (zI000OOo1O || objI00O0i0ii11 == obj6) {
/* 845 */                       I01i01OoI i01i01OoI = new I01i01OoI(21);
/* 848 */                       i01i01OoI.I00iiI = iiloOlIoIool2;
/* 850 */                       i01i01OoI.I00iiO = obj7;
/* 852 */                       VarHandle.storeStoreFence();
/* 855 */                       iloI0lOlll1.I00iio(i01i01OoI);
                                obj4 = i01i01OoI;
                            }
/* 864 */                   O1ooiI111i o1ooiI111iI00000oIO2 = iIll0I00Ol0.I00000oIO(iIoI0lOo.I00000oIO(o1ooiI111iI00000oOI, (Function1) obj4), ili1lII);
/* 889 */                   zI000II2 = iloI0lOlll1.I000II(oIooO1iiliI) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i6 & 384) == 256);
/* 890 */                   Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                            obj5 = objI00O0i0ii12;
/* 894 */                   if (zI000II2 || objI00O0i0ii12 == obj6) {
/* 900 */                       OII0Il oII0Il = new OII0Il();
/* 903 */                       oII0Il.I00000oIO = iiloOlIoIool2;
/* 907 */                       oII0Il.I00000oOI = oI10i0Il;
/* 909 */                       oII0Il.I0000Il00O = oIooO1iiliI;
/* 911 */                       VarHandle.storeStoreFence();
/* 914 */                       iloI0lOlll1.I00iio(oII0Il);
                                obj5 = oII0Il;
                            }
/* 917 */                   O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj5;
/* 921 */                   int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 925 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 929 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO2);
/* 933 */                   iloI0lOlll1.I00i0oil();
/* 938 */                   if (iloI0lOlll1.I00O10llo) {
/* 948 */                       iloI0lOlll1.I00io1l();
                            } else {
/* 942 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            }
/* 952 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o10);
/* 957 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI3);
/* 962 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I6, iloI0lOlll1);
/* 967 */                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O4);
/* 970 */                   iOii1l3 = iOii1l;
/* 974 */                   iOii1l3.invoke(iloI0lOlll1, 6);
/* 978 */                   iloI0lOlll1.I0010I0i(true);
/* 981 */                   iloI0lOlll1.I0010I0i(true);
/* 984 */                   o1ooiI111i2 = o1ooiI111i4;
                        } else {
/* 622 */                   iOioOOi0I = iOioOOi0I4;
                        }
/* 631 */               z2 = true;
/* 634 */               z3 = zI000II5 | z2;
/* 636 */               Object objI00O0i0ii82 = iloI0lOlll1.I00O0i0ii();
                        obj = objI00O0i0ii82;
/* 640 */               if (!z3) {
/* 648 */                   O1l110o o1l110o2 = new O1l110o(8);
/* 651 */                   o1l110o2.I00iiI = iiloOlIoIool;
/* 653 */                   o1l110o2.I00iiO = oIooO1iiliI;
/* 655 */                   VarHandle.storeStoreFence();
/* 658 */                   iloI0lOlll1.I00iio(o1l110o2);
                            obj = o1l110o2;
/* 665 */                   int i62 = i2;
/* 671 */                   iiloOlIoIool2 = iiloOlIoIool;
/* 676 */                   IOioOOi0I iOioOOi0I62 = iOioOOi0I;
/* 692 */                   j2 = j3;
/* 700 */                   iO0l0I1O.I00000oIO(strI00000oIO, null, illOOo00lI2, (IllOOo00lI) obj, j2, iloI0lOlll1, 0);
/* 719 */                   if (i5 <= 256) {
/* 720 */                       Object objI00O0i0ii92 = iloI0lOlll1.I00O0i0ii();
                                obj2 = objI00O0i0ii92;
/* 724 */                       if (z4) {
/* 732 */                           O0l0IlolloIO o0l0IlolloIO2 = new O0l0IlolloIO(25);
/* 735 */                           o0l0IlolloIO2.I00iiI = iiloOlIoIool2;
/* 737 */                           VarHandle.storeStoreFence();
/* 740 */                           iloI0lOlll1.I00iio(o0l0IlolloIO2);
                                    obj2 = o0l0IlolloIO2;
/* 745 */                           O1ooiI111i o1ooiI111iI00000oIO3 = iO0100loIol.I00000oIO(o1ooIo101ll, (Function1) obj2);
                                    if (i5 <= 256) {
/* 777 */                               zI000II = iloI0lOlll1.I000II(objI00000oIO) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256) | iloI0lOlll1.I000OOo1O(obj7);
/* 778 */                               Object objI00O0i0ii102 = iloI0lOlll1.I00O0i0ii();
                                        obj3 = objI00O0i0ii102;
/* 782 */                               if (zI000II) {
/* 789 */                                   O11IOOoiI10i o11IOOoiI10i2 = new O11IOOoiI10i(7);
/* 792 */                                   o11IOOoiI10i2.I00iiI = objI00000oIO;
/* 794 */                                   o11IOOoiI10i2.I00iiO = iiloOlIoIool2;
/* 796 */                                   o11IOOoiI10i2.I00iio = obj7;
/* 798 */                                   VarHandle.storeStoreFence();
/* 801 */                                   iloI0lOlll1.I00iio(o11IOOoiI10i2);
                                            obj3 = o11IOOoiI10i2;
/* 807 */                                   O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO3, false, (Function1) obj3);
                                            if (i5 <= 256) {
/* 832 */                                       zI000OOo1O = iloI0lOlll1.I000OOo1O(obj7) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256);
/* 833 */                                       Object objI00O0i0ii112 = iloI0lOlll1.I00O0i0ii();
                                                obj4 = objI00O0i0ii112;
/* 837 */                                       if (zI000OOo1O) {
/* 845 */                                           I01i01OoI i01i01OoI2 = new I01i01OoI(21);
/* 848 */                                           i01i01OoI2.I00iiI = iiloOlIoIool2;
/* 850 */                                           i01i01OoI2.I00iiO = obj7;
/* 852 */                                           VarHandle.storeStoreFence();
/* 855 */                                           iloI0lOlll1.I00iio(i01i01OoI2);
                                                    obj4 = i01i01OoI2;
/* 864 */                                           O1ooiI111i o1ooiI111iI00000oIO22 = iIll0I00Ol0.I00000oIO(iIoI0lOo.I00000oIO(o1ooiI111iI00000oOI2, (Function1) obj4), ili1lII);
                                                    if (i5 <= 256) {
/* 889 */                                               zI000II2 = iloI0lOlll1.I000II(oIooO1iiliI) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256);
/* 890 */                                               Object objI00O0i0ii122 = iloI0lOlll1.I00O0i0ii();
                                                        obj5 = objI00O0i0ii122;
/* 894 */                                               if (zI000II2) {
/* 900 */                                                   OII0Il oII0Il2 = new OII0Il();
/* 903 */                                                   oII0Il2.I00000oIO = iiloOlIoIool2;
/* 907 */                                                   oII0Il2.I00000oOI = oI10i0Il;
/* 909 */                                                   oII0Il2.I0000Il00O = oIooO1iiliI;
/* 911 */                                                   VarHandle.storeStoreFence();
/* 914 */                                                   iloI0lOlll1.I00iio(oII0Il2);
                                                            obj5 = oII0Il2;
/* 917 */                                                   O1iOIl0o10 o1iOIl0o102 = (O1iOIl0o10) obj5;
/* 921 */                                                   int iHashCode32 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 925 */                                                   OO0lO0l0 oO0lO0l0I000lI32 = iloI0lOlll1.I000lI();
/* 929 */                                                   O1ooiI111i o1ooiI111iI0000Il00O42 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO22);
/* 933 */                                                   iloI0lOlll1.I00i0oil();
/* 938 */                                                   if (iloI0lOlll1.I00O10llo) {
                                                            }
/* 952 */                                                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1iOIl0o102);
/* 957 */                                                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI32);
/* 962 */                                                   IIl001iO0Io.I001IIilI0O(iHashCode32, iloI0lOlll1, iOioOOi0I62, iloI0lOlll1);
/* 967 */                                                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O42);
/* 970 */                                                   iOii1l3 = iOii1l;
/* 974 */                                                   iOii1l3.invoke(iloI0lOlll1, 6);
/* 978 */                                                   iloI0lOlll1.I0010I0i(true);
/* 981 */                                                   iloI0lOlll1.I0010I0i(true);
/* 984 */                                                   o1ooiI111i2 = o1ooiI111i4;
                                                        }
                                                    } else {
/* 889 */                                               zI000II2 = iloI0lOlll1.I000II(oIooO1iiliI) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256);
/* 890 */                                               Object objI00O0i0ii1222 = iloI0lOlll1.I00O0i0ii();
                                                        obj5 = objI00O0i0ii1222;
/* 894 */                                               if (zI000II2) {
                                                        }
                                                    }
                                                }
                                            } else {
/* 832 */                                       zI000OOo1O = iloI0lOlll1.I000OOo1O(obj7) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256);
/* 833 */                                       Object objI00O0i0ii1122 = iloI0lOlll1.I00O0i0ii();
                                                obj4 = objI00O0i0ii1122;
/* 837 */                                       if (zI000OOo1O) {
                                                }
                                            }
                                        }
                                    } else {
/* 777 */                               zI000II = iloI0lOlll1.I000II(objI00000oIO) | ((i5 <= 256 && iloI0lOlll1.I000II(iiloOlIoIool2)) || (i62 & 384) == 256) | iloI0lOlll1.I000OOo1O(obj7);
/* 778 */                               Object objI00O0i0ii1022 = iloI0lOlll1.I00O0i0ii();
                                        obj3 = objI00O0i0ii1022;
/* 782 */                               if (zI000II) {
                                        }
                                    }
                                }
                            } else {
/* 720 */                       Object objI00O0i0ii922 = iloI0lOlll1.I00O0i0ii();
                                obj2 = objI00O0i0ii922;
/* 724 */                       if (z4) {
                                }
                            }
                        }
                    } else {
/* 987 */               iOii1l3 = iOii1l;
/* 989 */               iloI0lOlll1.I00OilO00Il();
/* 992 */               o1ooiI111i2 = o1ooiI111i;
/* 994 */               j2 = j;
                    }
/* 996 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1000 */          if (oOloioIlI001IO000 != null) {
/* 1005 */              OII0IOO1 oii0ioo1 = new OII0IOO1(0);
/* 1008 */              oii0ioo1.I00ilI0I1 = iOii1l3;
/* 1010 */              oii0ioo1.I00iiI = o1ooiI111i2;
/* 1012 */              oii0ioo1.I00io1l = iiloOlIoIool2;
/* 1016 */              oii0ioo1.I00iiO = z;
/* 1018 */              oii0ioo1.I00iio = j2;
/* 1022 */              oii0ioo1.I00ilO0 = iOii1l2;
/* 1024 */              VarHandle.storeStoreFence();
/* 1027 */              oOloioIlI001IO000.I0000O = oii0ioo1;
                    }
                }

                public static final IiloOlIoIool I0000O(IloI0lOlll1 iloI0lOlll1) {
/* 1 */             IiloiO iiloiO = IiloiO.I00iOIl;
/* 3 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 7 */             int i = 5;
/* 8 */             Object obj = IOl11li.I00000oIO;
/* 10 */            if (objI00O0i0ii == obj) {
/* 14 */                objI00O0i0ii = new OI1lOo(i);
/* 17 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 20 */            Function1 function1 = (Function1) objI00O0i0ii;
/* 23 */            Object[] objArr = new Object[0];
/* 27 */            int i2 = 1;
/* 28 */            IiI01lI iiI01lI = new IiI01lI(i2);
/* 33 */            II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(i2);
/* 36 */            iI0O1i0I1.I00iiI = function1;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(iiI01lI, iI0O1i0I1);
/* 45 */            boolean zI000II = iloI0lOlll1.I000II(function1);
/* 49 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj2 = objI00O0i0ii2;
/* 53 */            if (zI000II || objI00O0i0ii2 == obj) {
/* 59 */                Il1iIiI il1iIiI = new Il1iIiI(i);
/* 62 */                il1iIiI.I00iiI = function1;
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                iloI0lOlll1.I00iio(il1iIiI);
                        obj2 = il1iIiI;
                    }
/* 76 */            return (IiloOlIoIool) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj2, iloI0lOlll1, 0);
                }
            }
