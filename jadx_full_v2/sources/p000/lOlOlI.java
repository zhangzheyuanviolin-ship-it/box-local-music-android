            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOlOlI {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0246  */
                /* JADX WARN: Type inference failed for: r12v7 */
                /* JADX WARN: Type inference failed for: r12v8 */
                /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v18, types: [int] */
                /* JADX WARN: Type inference failed for: r1v19 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, Oi1Oi0 oi1Oi0, O1ooiI111i o1ooiI111i, Function1 function1, boolean z, int i, int i2, IloI0lOlll1 iloI0lOlll1, int i3, int i4) {
                    O1ooiI111i o1ooiI111i2;
                    int i5;
                    Object objI00O0i0ii;
                    IOO0o0I1l iOO0o0I1l;
                    Oi1Oioi1oIO oi1Oioi1oIO;
                    boolean zI000II;
                    Object objI00O0i0ii2;
                    Object objI00000oIO;
                    boolean z2;
                    Object objI00O0i0ii3;
                    boolean z3;
                    Map map;
                    boolean z4;
                    Oi1O00I1 oi1O00I12;
                    Function1 function12;
                    O1ooiI111i o1ooiI111i3;
                    Function1 function13;
                    int i6;
                    ?? r1;
                    OOloioIl oOloioIlI001IO000;
/* 5 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 11 */            Map map2 = oi1Oi0.I00000oOI;
/* 16 */            iloI0lOlll12.I00i0O(659990650);
/* 34 */            int i7 = (i3 & 6) == 0 ? (iloI0lOlll12.I000II(oi1O00I1) ? 4 : 2) | i3 : i3;
/* 39 */            if ((i3 & 48) == 0) {
/* 51 */                i7 |= iloI0lOlll12.I000II(oi1Oi0) ? 32 : 16;
                    }
/* 52 */            int i8 = i4 & 2;
/* 54 */            if (i8 == 0) {
/* 63 */                if ((i3 & 384) == 0) {
/* 65 */                    o1ooiI111i2 = o1ooiI111i;
/* 78 */                    i7 |= iloI0lOlll12.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 82 */                i5 = i7 | 1797120;
/* 90 */                if ((599187 & i5) == 599186 || !iloI0lOlll12.I00IO1()) {
/* 119 */                   O1ooiI111i o1ooiI111i4 = i8 == 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 123 */                   iloI0lOlll12.I00i01iIIliI(730289910);
/* 126 */                   objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 132 */                   iOO0o0I1l = IOl11li.I00000oIO;
/* 134 */                   if (objI00O0i0ii == iOO0o0I1l) {
/* 138 */                       objI00O0i0ii = new Oo011oIOO1(9);
/* 141 */                       iloI0lOlll12.I00iio(objI00O0i0ii);
                            }
/* 144 */                   Function1 function14 = (Function1) objI00O0i0ii;
/* 147 */                   iloI0lOlll12.I0010I0i(false);
/* 154 */                   oi1Oioi1oIO = Oi1i0Oi.I00000oOI(iloI0lOlll12).I000O01llI0;
/* 158 */                   long jI0000Il00O = Oi1Io0I.I0000Il00O(iloI0lOlll12);
/* 165 */                   iloI0lOlll12.I00i01iIIliI(730297126);
/* 168 */                   int i9 = i5 & 112;
/* 187 */                   zI000II = (i9 != 32) | iloI0lOlll12.I000II(oi1Oioi1oIO) | iloI0lOlll12.I0001Ioi1lo(jI0000Il00O);
/* 189 */                   objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 193 */                   if (!zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 197 */                       if (oi1Oioi1oIO == null) {
/* 199 */                           oi1Oioi1oIO = Oi1Oioi1oIO.I000OOo1O;
                                }
/* 201 */                       Oi1Oioi1oIO oi1Oioi1oIOI00000oIO = oi1Oioi1oIO.I00000oIO();
/* 207 */                       I11110OIl i11110OIl = new I11110OIl();
/* 210 */                       I1111OO10i i1111OO10i = oi1Oi0.I00000oIO;
/* 212 */                       i11110OIl.I00000oOI(i1111OO10i);
/* 237 */                       for (I11110l0o i11110l0o : i1111OO10i.I00000oOI(i1111OO10i.I00iiI.length(), Oi1OOo1O.I00000oOI)) {
/* 245 */                           String str = Oi1OOo1O.I00000oOI;
/* 247 */                           Object obj = i11110l0o.I00000oIO;
/* 249 */                           int i10 = i11110l0o.I0000Il00O;
/* 251 */                           int i11 = i11110l0o.I00000oOI;
/* 253 */                           String str2 = (String) obj;
/* 257 */                           String strI00IOO = OlOoOIi0o.I00IOO("format:", str2);
/* 261 */                           Oi1OOo1O oi1OOo1O = null;
/* 263 */                           if (strI00IOO == str2) {
/* 275 */                               Iterator it = ((List) Oi1OOo1O.I0000Il00O.getValue()).iterator();
                                        while (true) {
/* 283 */                                   if (!it.hasNext()) {
                                                break;
                                            }
/* 285 */                                   ?? next = it.next();
/* 289 */                                   Iterator it2 = it;
/* 301 */                                   if (O0000Ioio00.I0000O(((Oi1OOo1O) next).I00000oIO, str2)) {
/* 303 */                                       oi1OOo1O = next;
                                                break;
                                            }
/* 306 */                                   it = it2;
                                        }
/* 309 */                               oi1OOo1O = oi1OOo1O;
                                    } else {
/* 314 */                               Object obj2 = map2.get(strI00IOO);
/* 320 */                               if (obj2 instanceof Oi1OOo1O) {
/* 324 */                                   oi1OOo1O = (Oi1OOo1O) obj2;
                                        }
                                    }
/* 311 */                           Oi1OOo1O oi1OOo1O2 = oi1OOo1O;
/* 327 */                           if (oi1OOo1O2 != null && (objI00000oIO = oi1OOo1O2.I00000oIO(oi1Oioi1oIOI00000oIO)) != null) {
/* 338 */                               if (objI00000oIO instanceof OlIIi1oIIOlo) {
/* 342 */                                   i11110OIl.I00000oIO((OlIIi1oIIOlo) objI00000oIO, i11, i10);
                                        } else if (objI00000oIO instanceof O0ooi0ll) {
/* 371 */                                   i11110OIl.I00iiO.add(new I111101Olo00(i11, i10, 8, (O0ooi0ll) objI00000oIO, null));
                                        }
                                    }
                                }
/* 379 */                       objI00O0i0ii2 = i11110OIl.I000OiO();
/* 383 */                       iloI0lOlll12.I00iio(objI00O0i0ii2);
                            }
/* 386 */                   I1111OO10i i1111OO10i2 = (I1111OO10i) objI00O0i0ii2;
/* 389 */                   iloI0lOlll12.I0010I0i(false);
/* 395 */                   iloI0lOlll12.I00i01iIIliI(730303487);
/* 404 */                   z2 = i9 != 32;
/* 405 */                   objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
/* 409 */                   if (!z2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 446 */                       z3 = false;
/* 450 */                       objI00O0i0ii3 = O1Oii0O0loo.I000OOo1O(new IlIo0o(new OoI10o0iO11O(IOOi0Ool1i.I001IO000(map2.entrySet()), new OOii01Ioi1(9)), false, new OiioI1Io0o(4)));
/* 454 */                       iloI0lOlll12.I00iio(objI00O0i0ii3);
                            } else {
/* 414 */                       z3 = false;
                            }
/* 457 */                   map = (Map) objI00O0i0ii3;
/* 459 */                   iloI0lOlll12.I0010I0i(z3);
/* 466 */                   if (map.isEmpty()) {
/* 517 */                       z4 = true;
/* 518 */                       oi1O00I12 = oi1O00I1;
/* 520 */                       function12 = function14;
/* 526 */                       iloI0lOlll12.I00i01iIIliI(1164825540);
/* 531 */                       IloilI011lI iloilI011lI = new IloilI011lI(1 == true ? 1 : 0);
/* 534 */                       iloilI011lI.I00iiO = map;
/* 536 */                       iloilI011lI.I00iio = oi1O00I12;
/* 538 */                       iloilI011lI.I00ilI0I1 = i1111OO10i2;
/* 540 */                       iloilI011lI.I00iiI = function12;
/* 542 */                       VarHandle.storeStoreFence();
/* 561 */                       o1ooiI111i3 = o1ooiI111i4;
/* 562 */                       iOi0ollol.I00000oIO(o1ooiI111i3, null, iiioOl1O.I00000oOI(-457052428, iloilI011lI, iloI0lOlll12), iloI0lOlll12, ((i5 >> 6) & 14) | 3072, 6);
/* 566 */                       iloI0lOlll12.I0010I0i(false);
                            } else {
/* 471 */                       iloI0lOlll12.I00i01iIIliI(1164651630);
/* 501 */                       z4 = true;
/* 505 */                       Oi1Io0I.I00000oIO(oi1O00I1, i1111OO10i2, null, function14, null, iloI0lOlll12, (i5 & 7182) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | (3670016 & i5), 66);
/* 508 */                       oi1O00I12 = oi1O00I1;
/* 509 */                       function12 = function14;
/* 510 */                       iloI0lOlll12 = iloI0lOlll12;
/* 512 */                       iloI0lOlll12.I0010I0i(false);
/* 515 */                       o1ooiI111i3 = o1ooiI111i4;
                            }
/* 572 */                   Function1 function15 = function12;
/* 573 */                   o1ooiI111i2 = o1ooiI111i3;
/* 574 */                   function13 = function15;
/* 575 */                   i6 = Integer.MAX_VALUE;
/* 576 */                   r1 = z4;
                        } else {
/* 99 */                    iloI0lOlll12.I00OilO00Il();
/* 102 */                   z4 = z;
/* 104 */                   r1 = i;
/* 106 */                   i6 = i2;
/* 108 */                   oi1O00I12 = oi1O00I1;
/* 109 */                   function13 = function1;
                        }
/* 577 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 581 */               if (oOloioIlI001IO000 == null) {
/* 585 */                   Oo0i0iI11lo oo0i0iI11lo = new Oo0i0iI11lo();
/* 588 */                   oo0i0iI11lo.I00iOIl = oi1O00I12;
/* 590 */                   oo0i0iI11lo.I00iiI = oi1Oi0;
/* 592 */                   oo0i0iI11lo.I00iiO = o1ooiI111i2;
/* 594 */                   oo0i0iI11lo.I00iio = function13;
/* 596 */                   oo0i0iI11lo.I00ilI0I1 = z4;
/* 598 */                   oo0i0iI11lo.I00ilO0 = r1;
/* 600 */                   oo0i0iI11lo.I00io1l = i6;
/* 602 */                   oo0i0iI11lo.I00ioIO = i3;
/* 604 */                   oo0i0iI11lo.I00l0I0l0lO1 = i4;
/* 606 */                   VarHandle.storeStoreFence();
/* 609 */                   oOloioIlI001IO000.I0000O = oo0i0iI11lo;
/* 2739 */                  return;
                        }
/* 2739 */              return;
                    }
/* 56 */            i7 |= 384;
/* 58 */            o1ooiI111i2 = o1ooiI111i;
/* 82 */            i5 = i7 | 1797120;
/* 90 */            if ((599187 & i5) == 599186) {
/* 119 */               if (i8 == 0) {
                        }
/* 123 */               iloI0lOlll12.I00i01iIIliI(730289910);
/* 126 */               objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 132 */               iOO0o0I1l = IOl11li.I00000oIO;
/* 134 */               if (objI00O0i0ii == iOO0o0I1l) {
                        }
/* 144 */               Function1 function142 = (Function1) objI00O0i0ii;
/* 147 */               iloI0lOlll12.I0010I0i(false);
/* 154 */               oi1Oioi1oIO = Oi1i0Oi.I00000oOI(iloI0lOlll12).I000O01llI0;
/* 158 */               long jI0000Il00O2 = Oi1Io0I.I0000Il00O(iloI0lOlll12);
/* 165 */               iloI0lOlll12.I00i01iIIliI(730297126);
/* 168 */               int i92 = i5 & 112;
/* 187 */               zI000II = (i92 != 32) | iloI0lOlll12.I000II(oi1Oioi1oIO) | iloI0lOlll12.I0001Ioi1lo(jI0000Il00O2);
/* 189 */               objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 193 */               if (!zI000II) {
/* 197 */                   if (oi1Oioi1oIO == null) {
                            }
/* 201 */                   Oi1Oioi1oIO oi1Oioi1oIOI00000oIO2 = oi1Oioi1oIO.I00000oIO();
/* 207 */                   I11110OIl i11110OIl2 = new I11110OIl();
/* 210 */                   I1111OO10i i1111OO10i3 = oi1Oi0.I00000oIO;
/* 212 */                   i11110OIl2.I00000oOI(i1111OO10i3);
/* 237 */                   while (r6.hasNext()) {
                            }
/* 379 */                   objI00O0i0ii2 = i11110OIl2.I000OiO();
/* 383 */                   iloI0lOlll12.I00iio(objI00O0i0ii2);
/* 386 */                   I1111OO10i i1111OO10i22 = (I1111OO10i) objI00O0i0ii2;
/* 389 */                   iloI0lOlll12.I0010I0i(false);
/* 395 */                   iloI0lOlll12.I00i01iIIliI(730303487);
/* 404 */                   if (i92 != 32) {
                            }
/* 405 */                   objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
/* 409 */                   if (z2) {
/* 446 */                       z3 = false;
/* 450 */                       objI00O0i0ii3 = O1Oii0O0loo.I000OOo1O(new IlIo0o(new OoI10o0iO11O(IOOi0Ool1i.I001IO000(map2.entrySet()), new OOii01Ioi1(9)), false, new OiioI1Io0o(4)));
/* 454 */                       iloI0lOlll12.I00iio(objI00O0i0ii3);
/* 457 */                       map = (Map) objI00O0i0ii3;
/* 459 */                       iloI0lOlll12.I0010I0i(z3);
/* 466 */                       if (map.isEmpty()) {
                                }
/* 572 */                       Function1 function152 = function12;
/* 573 */                       o1ooiI111i2 = o1ooiI111i3;
/* 574 */                       function13 = function152;
/* 575 */                       i6 = Integer.MAX_VALUE;
/* 576 */                       r1 = z4;
                            }
                        }
                    }
/* 577 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 581 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }
