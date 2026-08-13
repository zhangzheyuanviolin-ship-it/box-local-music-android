            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIoi0l {
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O11l1I o11l1I, O1ol100o0O o1ol100o0O, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ol100o0O o1ol100o0O2;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    OOOIOO1 oooioo1;
                    Object i0O0Ooi10l;
                    OiOl01il10lO oiOl01il10lO;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
                    OIooi1iOiOol oIooi1iOiOol;
                    IOO0IOIll iOO0IOIll;
/* 1 */             OloIl1l1oOii oloIl1l1oOii2 = oloIl1l1oOii;
/* 16 */            iloI0lOlll1.I00i0O(343465364);
/* 77 */            int i2 = i | (iloI0lOlll1.I000OOo1O(oloIl1l1oOii2) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(o11l1I) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(o1ol100o0O) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000II(o1ooiI111i) ? 16384 : 8192);
/* 94 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 98 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o11l1I.I0000Il00O, iloI0lOlll1);
/* 104 */               OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll1);
/* 114 */               boolean z = ((O11l0oi0) oI10i0IlI00000oOI.getValue()).I00000oIO;
/* 122 */               boolean z2 = ((O11l0oi0) oI10i0IlI00000oOI.getValue()).I00000oOI;
/* 130 */               OOOIOO1 oooioo12 = ((O11l0oi0) oI10i0IlI00000oOI.getValue()).I0000O;
/* 132 */               OiOl01il10lO oiOl01il10lOI00000oOI = iO0l10O.I00000oOI(iloI0lOlll1);
/* 136 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 142 */               Object obj3 = IOl11li.I00000oIO;
/* 144 */               if (objI00O0i0ii == obj3) {
/* 148 */                   objI00O0i0ii = new OIooi1iOiOol(0);
/* 151 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 154 */               OIooi1iOiOol oIooi1iOiOol2 = (OIooi1iOiOol) objI00O0i0ii;
/* 162 */               IOO0IOIll iOO0IOIll2 = (IOO0IOIll) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0001Ioi1lo);
/* 164 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 168 */               if (objI00O0i0ii2 == obj3) {
/* 170 */                   objI00O0i0ii2 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 174 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 177 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii2;
/* 181 */               int iIndexOf = oloIl1l1oOii2.I000OiO.indexOf(o1oIOiI11o0);
/* 185 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oloIl1l1oOii2);
/* 191 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 195 */               if (zI000OOo1O || objI00O0i0ii3 == obj3) {
/* 205 */                   oI10i0Il = oI10i0IlI00000oOI2;
/* 208 */                   Io1olIi io1olIi = new Io1olIi(4);
/* 211 */                   io1olIi.I00iiI = oloIl1l1oOii2;
/* 213 */                   VarHandle.storeStoreFence();
/* 216 */                   iloI0lOlll1.I00iio(io1olIi);
                            obj = io1olIi;
                        } else {
/* 200 */                   oI10i0Il = oI10i0IlI00000oOI2;
                            obj = objI00O0i0ii3;
                        }
/* 223 */               IiI0O1Io iiI0O1IoI00000oOI = OIoIol.I00000oOI(iIndexOf, (IllOOo00lI) obj, iloI0lOlll1, 0, 2);
/* 253 */               Object obj4 = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 255 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 260 */               if (objI00O0i0ii4 == obj3) {
/* 266 */                   objI00O0i0ii4 = new I1iOI0oo(oIooi1iOiOol2, (IOoil1iiIilo) null, 17);
/* 269 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 274 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll1, oooioo12);
/* 281 */               Integer numValueOf = Integer.valueOf(iiI0O1IoI00000oOI.I00100o1O0lo());
/* 311 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oloIl1l1oOii2) | iloI0lOlll1.I000II(iiI0O1IoI00000oOI) | iloI0lOlll1.I000OOo1O(o1oIOiI11o0) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(obj4);
/* 313 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 317 */               if (zI000OOo1O2 || objI00O0i0ii5 == obj3) {
/* 321 */                   oooioo1 = oooioo12;
/* 346 */                   oiOl01il10lO = oiOl01il10lOI00000oOI;
/* 348 */                   oI10i0Il2 = oI10i0IlI00000oOI;
/* 350 */                   obj2 = obj3;
/* 352 */                   oIooi1iOiOol = oIooi1iOiOol2;
/* 354 */                   iOO0IOIll = iOO0IOIll2;
/* 356 */                   i0O0Ooi10l = new I0O0Ooi10l(oloIl1l1oOii2, iiI0O1IoI00000oOI, o1oIOiI11o0, o1ol100o0O, obj4, null, 7);
/* 359 */                   o1ol100o0O2 = o1ol100o0O;
/* 360 */                   iloI0lOlll1.I00iio(i0O0Ooi10l);
                        } else {
/* 324 */                   oooioo1 = oooioo12;
/* 325 */                   i0O0Ooi10l = objI00O0i0ii5;
/* 326 */                   oiOl01il10lO = oiOl01il10lOI00000oOI;
/* 328 */                   oIooi1iOiOol = oIooi1iOiOol2;
/* 330 */                   oI10i0Il2 = oI10i0IlI00000oOI;
/* 332 */                   iOO0IOIll = iOO0IOIll2;
/* 334 */                   obj2 = obj3;
/* 335 */                   o1ol100o0O2 = o1ol100o0O;
                        }
/* 365 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) i0O0Ooi10l, iloI0lOlll1, numValueOf);
/* 374 */               O1oIOiI11o0 o1oIOiI11o02 = ((O1oiOloOo) oI10i0Il.getValue()).I000II;
/* 389 */               boolean zI000II = iloI0lOlll1.I000II(iiI0O1IoI00000oOI) | iloI0lOlll1.I000OOo1O(oloIl1l1oOii2) | iloI0lOlll1.I000OOo1O(o1oIOiI11o0);
/* 390 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 394 */               if (zI000II || objI00O0i0ii6 == obj2) {
/* 406 */                   Object oO11OilO = new OO11OilO(iiI0O1IoI00000oOI, oloIl1l1oOii2, o1oIOiI11o0, null, 8);
/* 411 */                   iiI0O1IoI00000oOI = iiI0O1IoI00000oOI;
/* 412 */                   oloIl1l1oOii2 = oloIl1l1oOii2;
/* 414 */                   iloI0lOlll1.I00iio(oO11OilO);
/* 417 */                   objI00O0i0ii6 = oO11OilO;
                        }
/* 420 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii6, iloI0lOlll1, o1oIOiI11o02);
/* 425 */               Oi1010l0l0o oi1010l0l0o = new Oi1010l0l0o();
/* 428 */               oi1010l0l0o.I00iOIl = oloIl1l1oOii2;
/* 430 */               oi1010l0l0o.I00iiI = oooioo1;
/* 432 */               oi1010l0l0o.I00iiO = z;
/* 434 */               oi1010l0l0o.I00iio = oiOl01il10lO;
/* 436 */               oi1010l0l0o.I00ilI0I1 = z2;
/* 438 */               oi1010l0l0o.I00ilO0 = o1ooiI111i;
/* 442 */               oi1010l0l0o.I00io1l = oI10i0Il2;
/* 446 */               oi1010l0l0o.I00ioIO = oIooi1iOiOol;
/* 450 */               oi1010l0l0o.I00l0I0l0lO1 = ii0110;
/* 454 */               oi1010l0l0o.I00l0OO0IO = iOO0IOIll;
/* 456 */               VarHandle.storeStoreFence();
/* 489 */               l1loiOIllii.I00000oIO(100663296, 16126, null, null, null, iiioOl1O.I00000oOI(-817259, oi1010l0l0o, iloI0lOlll1), iloI0lOlll1, null, null, null, iiI0O1IoI00000oOI, null, null, false);
                    } else {
/* 493 */               o1ol100o0O2 = o1ol100o0O;
/* 494 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 497 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 501 */           if (oOloioIlI001IO000 != null) {
/* 507 */               O11l0o011lO1 o11l0o011lO1 = new O11l0o011lO1(10);
/* 510 */               o11l0o011lO1.I00iiI = oloIl1l1oOii2;
/* 512 */               o11l0o011lO1.I00iiO = o1oIOiI11o0;
/* 516 */               o11l0o011lO1.I00iio = o11l1I;
/* 518 */               o11l0o011lO1.I00ilI0I1 = o1ol100o0O2;
/* 520 */               o11l0o011lO1.I00ilO0 = o1ooiI111i;
/* 522 */               VarHandle.storeStoreFence();
/* 525 */               oOloioIlI001IO000.I0000O = o11l0o011lO1;
                    }
                }
            }
