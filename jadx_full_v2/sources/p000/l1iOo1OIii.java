            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iOo1OIii {
                public static final void I00000oIO(OII11i oII11i, boolean z, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    IllOOo00lI illOOo00lI3;
/* 4 */             iloI0lOlll1.I00i0O(1220469155);
/* 11 */            int i2 = 2;
/* 45 */            int i3 = i | (iloI0lOlll1.I000II(oII11i) ? 4 : 2) | (iloI0lOlll1.I000O01llI0(z) ? 32 : 16) | 384 | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 61 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 63 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 67 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 69 */                if (objI00O0i0ii == iOO0o0I1l) {
/* 73 */                    objI00O0i0ii = new O1olloI0OlO(4);
/* 76 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 80 */                IllOOo00lI illOOo00lI4 = (IllOOo00lI) objI00O0i0ii;
/* 82 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 86 */                if (objI00O0i0ii2 == iOO0o0I1l) {
/* 91 */                    objI00O0i0ii2 = new O1olloI0OlO(5);
/* 94 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 97 */                IllOOo00lI illOOo00lI5 = (IllOOo00lI) objI00O0i0ii2;
/* 99 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 103 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 108 */                   objI00O0i0ii3 = new O1olloI0OlO(6);
/* 111 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 118 */               int i4 = (i3 & 14) | 3504;
/* 120 */               int i5 = i3 << 9;
/* 133 */               int i6 = (i5 & 3670016) | i4 | (57344 & i5) | 196608;
/* 134 */               illOOo00lI3 = illOOo00lI4;
/* 143 */               I00000oOI(oII11i, false, illOOo00lI5, (IllOOo00lI) objI00O0i0ii3, z, illOOo00lI3, illOOo00lI2, iloI0lOlll1, i6);
                    } else {
/* 147 */               iloI0lOlll1.I00OilO00Il();
/* 150 */               illOOo00lI3 = illOOo00lI;
                    }
/* 151 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 155 */           if (oOloioIlI001IO000 != null) {
/* 159 */               O1ioilo11 o1ioilo11 = new O1ioilo11(i2);
/* 162 */               o1ioilo11.I00iiO = oII11i;
/* 164 */               o1ioilo11.I00iiI = z;
/* 166 */               o1ioilo11.I00iio = illOOo00lI3;
/* 168 */               o1ioilo11.I00ilI0I1 = illOOo00lI2;
/* 170 */               VarHandle.storeStoreFence();
/* 173 */               oOloioIlI001IO000.I0000O = o1ioilo11;
                    }
                }

                public static final void I00000oOI(OII11i oII11i, boolean z, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, boolean z2, IllOOo00lI illOOo00lI3, IllOOo00lI illOOo00lI4, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    Object obj;
/* 22 */            iloI0lOlll1.I00i0O(898330592);
/* 28 */            if ((i & 6) == 0) {
/* 39 */                i2 = (iloI0lOlll1.I000II(oII11i) ? 4 : 2) | i;
                    } else {
/* 41 */                i2 = i;
                    }
/* 44 */            if ((i & 48) == 0) {
/* 57 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 60 */            if ((i & 384) == 0) {
/* 73 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 76 */            if ((i & 3072) == 0) {
/* 89 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 92 */            if ((i & 24576) == 0) {
/* 105 */               i2 |= iloI0lOlll1.I000O01llI0(z2) ? 16384 : 8192;
                    }
/* 109 */           if ((196608 & i) == 0) {
/* 122 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI3) ? 131072 : 65536;
                    }
/* 126 */           if ((1572864 & i) == 0) {
/* 139 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI4) ? 1048576 : 524288;
                    }
/* 159 */           if (!iloI0lOlll1.I00OIl(i2 & 1, (599187 & i2) != 599186)) {
/* 472 */               iloI0lOlll1.I00OilO00Il();
                    } else {
/* 173 */               if (((Boolean) iloI0lOlll1.I000iOII(Ioo1O1i.I00000oIO)).booleanValue()) {
/* 175 */                   OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 179 */                   if (oOloioIlI001IO000 != null) {
/* 183 */                       OII0lOOoill oII0lOOoill = new OII0lOOoill(0);
/* 186 */                       oII0lOOoill.I00iiI = oII11i;
/* 188 */                       oII0lOOoill.I00iiO = z;
/* 190 */                       oII0lOOoill.I00iio = illOOo00lI;
/* 192 */                       oII0lOOoill.I00ilI0I1 = illOOo00lI2;
/* 194 */                       oII0lOOoill.I00ilO0 = z2;
/* 196 */                       oII0lOOoill.I00io1l = illOOo00lI3;
/* 198 */                       oII0lOOoill.I00ioIO = illOOo00lI4;
/* 200 */                       oII0lOOoill.I00l0I0l0lO1 = i;
/* 202 */                       VarHandle.storeStoreFence();
/* 205 */                       oOloioIlI001IO000.I0000O = oII0lOOoill;
/* 207 */                       return;
                            }
/* 1821 */                  return;
                        }
/* 208 */               OII0l00 oII0l00I00000oIO = O11o0olil.I00000oIO(iloI0lOlll1);
/* 212 */               if (oII0l00I00000oIO == null) {
/* 468 */                   I000II.I001IO000("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
/* 471 */                   return;
                        }
/* 214 */               Object objI00000oIO = oII0l00I00000oIO.I00000oIO();
/* 218 */               int i3 = i2 & 14;
/* 225 */               boolean z3 = i3 == 4;
/* 227 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 231 */               Object obj2 = IOl11li.I00000oIO;
/* 233 */               if (z3 || objI00O0i0ii == obj2) {
/* 248 */                   OII10lO0 oII10lO0 = (OII10lO0) oII11i.I0000Il00O.getValue();
/* 254 */                   O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(26);
/* 257 */                   o0l0IlolloIO.I00iiI = oII11i;
/* 259 */                   VarHandle.storeStoreFence();
/* 263 */                   IOiolo0oi0o iOiolo0oi0o = new IOiolo0oi0o(oII10lO0, false, 0);
/* 266 */                   iOiolo0oi0o.I000O01llI0 = o0l0IlolloIO;
/* 274 */                   iOiolo0oi0o.I000OOo1O = new IIl11il0I0io(7);
/* 283 */                   iOiolo0oi0o.I000OiO = new IIl11il0I0io(9);
/* 292 */                   iOiolo0oi0o.I000iOII = new IIl11il0I0io(10);
/* 294 */                   VarHandle.storeStoreFence();
/* 297 */                   iloI0lOlll1.I00iio(iOiolo0oi0o);
                            obj = iOiolo0oi0o;
                        } else {
                            obj = objI00O0i0ii;
                        }
/* 300 */               IOiolo0oi0o iOiolo0oi0o2 = (IOiolo0oi0o) obj;
/* 376 */               boolean zI000OOo1O = ((i2 & 112) == 32) | iloI0lOlll1.I000OOo1O(iOiolo0oi0o2) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576) | (i3 == 4);
/* 377 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 381 */               if (zI000OOo1O || objI00O0i0ii2 == obj2) {
/* 387 */                   OII0liOOoIlO oII0liOOoIlO = new OII0liOOoIlO();
/* 390 */                   oII0liOOoIlO.I00iOIl = iOiolo0oi0o2;
/* 392 */                   oII0liOOoIlO.I00iiI = z;
/* 394 */                   oII0liOOoIlO.I00iiO = illOOo00lI;
/* 396 */                   oII0liOOoIlO.I00iio = illOOo00lI2;
/* 398 */                   oII0liOOoIlO.I00ilI0I1 = z2;
/* 400 */                   oII0liOOoIlO.I00ilO0 = illOOo00lI3;
/* 402 */                   oII0liOOoIlO.I00io1l = illOOo00lI4;
/* 404 */                   oII0liOOoIlO.I00ioIO = oII11i;
/* 406 */                   VarHandle.storeStoreFence();
/* 409 */                   iloI0lOlll1.I00iio(oII0liOOoIlO);
                            obj3 = oII0liOOoIlO;
                        }
/* 414 */               iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj3, iloI0lOlll1);
/* 432 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(iOiolo0oi0o2) | (i3 == 4) | iloI0lOlll1.I000OOo1O(objI00000oIO);
/* 433 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 437 */               if (zI000OOo1O2 || objI00O0i0ii3 == obj2) {
/* 445 */                   O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(8);
/* 448 */                   o11IOOoiI10i.I00iiI = oII11i;
/* 450 */                   o11IOOoiI10i.I00iiO = iOiolo0oi0o2;
/* 452 */                   o11IOOoiI10i.I00iio = objI00000oIO;
/* 454 */                   VarHandle.storeStoreFence();
/* 457 */                   iloI0lOlll1.I00iio(o11IOOoiI10i);
                            obj4 = o11IOOoiI10i;
                        }
/* 462 */               iIO0iiOiOl0l.I00000oOI(oII11i, (Function1) obj4, iloI0lOlll1);
                    }
/* 475 */           OOloioIl oOloioIlI001IO0002 = iloI0lOlll1.I001IO000();
/* 479 */           if (oOloioIlI001IO0002 != null) {
/* 484 */               OII0lOOoill oII0lOOoill2 = new OII0lOOoill(1);
/* 487 */               oII0lOOoill2.I00iiI = oII11i;
/* 489 */               oII0lOOoill2.I00iiO = z;
/* 491 */               oII0lOOoill2.I00iio = illOOo00lI;
/* 493 */               oII0lOOoill2.I00ilI0I1 = illOOo00lI2;
/* 495 */               oII0lOOoill2.I00ilO0 = z2;
/* 497 */               oII0lOOoill2.I00io1l = illOOo00lI3;
/* 499 */               oII0lOOoill2.I00ioIO = illOOo00lI4;
/* 503 */               oII0lOOoill2.I00l0I0l0lO1 = i;
/* 505 */               VarHandle.storeStoreFence();
/* 508 */               oOloioIlI001IO0002.I0000O = oII0lOOoill2;
                    }
                }
            }
