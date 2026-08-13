            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OOO0iOio0oil {
                public static final Ii0i0o1lliO1 I00000oIO;
                public static final Ii0i0o1lliO1 I00000oOI;

                static {
/* 1 */             Ii0i0o1lliO1 ii0i0o1lliO1 = OI0I100IO.I00000oIO;
/* 5 */             I00000oIO = OI0I100IO.I00000oIO;
/* 9 */             I00000oOI = OI0I100IO.I0000O;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x024a  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x025a  */
                /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, long j, float f, long j2, int i, float f2, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    float f3;
                    int i5;
                    long j3;
                    int i6;
                    float f4;
                    IloI0lOlll1 iloI0lOlll12;
                    OOloioIl oOloioIlI001IO000;
                    long jI0000oI00;
                    long j4;
                    int i7;
/* 8 */             iloI0lOlll1.I00i0O(333154241);
/* 11 */            int i8 = i3 & 1;
/* 14 */            if (i8 != 0) {
/* 16 */                i4 = i2 | 6;
/* 19 */                o1ooiI111i2 = o1ooiI111i;
                    } else if ((i2 & 6) == 0) {
/* 26 */                o1ooiI111i2 = o1ooiI111i;
/* 37 */                i4 = (iloI0lOlll1.I000II(o1ooiI111i2) ? 4 : 2) | i2;
                    } else {
/* 39 */                o1ooiI111i2 = o1ooiI111i;
/* 41 */                i4 = i2;
                    }
/* 59 */            int i9 = i4 | (((i3 & 2) == 0 && iloI0lOlll1.I0001Ioi1lo(j)) ? 32 : 16);
/* 60 */            int i10 = i3 & 4;
/* 62 */            if (i10 == 0) {
/* 71 */                if ((i2 & 384) == 0) {
/* 73 */                    f3 = f;
/* 86 */                    i9 |= iloI0lOlll1.I0000O(f3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 89 */                long j5 = j2;
/* 108 */               i5 = i9 | (((i3 & 8) == 0 || !iloI0lOlll1.I0001Ioi1lo(j5)) ? Barcode.FORMAT_UPC_E : Barcode.FORMAT_PDF417) | 221184;
/* 127 */               if (iloI0lOlll1.I00OIl(i5 & 1, (74899 & i5) == 74898)) {
/* 587 */                   IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 588 */                   iloI0lOlll13.I00OilO00Il();
/* 591 */                   j3 = j;
/* 593 */                   i6 = i;
/* 595 */                   f4 = f2;
                            iloI0lOlll12 = iloI0lOlll13;
                        } else {
/* 129 */                   iloI0lOlll1.I00Ol00();
/* 134 */                   if ((i2 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 166 */                       if (i8 != 0) {
/* 168 */                           o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                                }
/* 173 */                       if ((i3 & 2) != 0) {
/* 177 */                           jI0000oI00 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oIO, iloI0lOlll1);
/* 181 */                           i5 &= -113;
                                } else {
/* 184 */                           jI0000oI00 = j;
                                }
/* 188 */                       if (i10 != 0) {
/* 190 */                           f3 = 4.0f;
                                }
/* 193 */                       if ((i3 & 8) != 0) {
/* 195 */                           j4 = IOOiio0i.I000lI;
/* 197 */                           i5 &= -7169;
                                } else {
/* 200 */                           j4 = j5;
                                }
/* 201 */                       f4 = 4.0f;
/* 202 */                       i7 = i5;
/* 203 */                       j5 = j4;
/* 204 */                       j3 = jI0000oI00;
/* 206 */                       i6 = 1;
                            } else {
/* 143 */                       iloI0lOlll1.I00OilO00Il();
/* 148 */                       if ((i3 & 2) != 0) {
/* 150 */                           i5 &= -113;
                                }
/* 154 */                       if ((i3 & 8) != 0) {
/* 156 */                           i5 &= -7169;
                                }
/* 158 */                       i6 = i;
/* 160 */                       f4 = f2;
/* 162 */                       i7 = i5;
/* 163 */                       j3 = j;
                            }
/* 207 */                   iloI0lOlll1.I0010o();
/* 246 */                   OlOooI0l0011 olOooI0l0011 = new OlOooI0l0011(((IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0)).I00i0ilIl0i(f3), 0.0f, i6, 0, null, 26);
/* 251 */                   IolIiIl iolIiIlI00000oOI = ioilliiOI0.I00000oOI(iloI0lOlll1);
/* 285 */                   IolIOll iolIOllI00000oIO = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 1080.0f, iOO01lio0.I00000oIO(iOO01lio0.I0000O(6000, 2, IioO00o.I0000O), null, 6), iloI0lOlll1, 4536);
/* 297 */                   OI1lOo oI1lOo = new OI1lOo(27);
/* 304 */                   O0OO1iIo o0OO1iIo = new O0OO1iIo();
/* 309 */                   o0OO1iIo.I00000oIO = 300;
/* 311 */                   OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 318 */                   o0OO1iIo.I00000oOI = new OI0l1oli1I();
/* 320 */                   oI1lOo.invoke(o0OO1iIo);
/* 323 */                   O0OO1il1o0 o0OO1il1o0 = new O0OO1il1o0();
/* 326 */                   o0OO1il1o0.I00000oIO = o0OO1iIo;
/* 328 */                   VarHandle.storeStoreFence();
/* 348 */                   IolIOll iolIOllI00000oIO2 = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 360.0f, iOO01lio0.I00000oIO(o0OO1il1o0, null, 6), iloI0lOlll1, 4536);
/* 358 */                   O0OO1iIo o0OO1iIo2 = new O0OO1iIo();
/* 363 */                   o0OO1iIo2.I00000oIO = 300;
/* 370 */                   o0OO1iIo2.I00000oOI = new OI0l1oli1I();
/* 374 */                   o0OO1iIo2.I00000oIO = 6000;
/* 391 */                   o0OO1iIo2.I00000oIO(Float.valueOf(0.87f), 3000).I00000oOI = I00000oOI;
/* 402 */                   o0OO1iIo2.I00000oIO(Float.valueOf(0.1f), 6000);
/* 405 */                   O0OO1il1o0 o0OO1il1o02 = new O0OO1il1o0();
/* 408 */                   o0OO1il1o02.I00000oIO = o0OO1iIo2;
/* 410 */                   VarHandle.storeStoreFence();
/* 431 */                   IolIOll iolIOllI00000oIO3 = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.1f, 0.87f, iOO01lio0.I00000oIO(o0OO1il1o02, null, 6), iloI0lOlll1, 4536);
/* 435 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 451 */                   O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(OiioloIlOlIi.I00000oOI(o1ooiI111i2, true, new OI1lOo(28)), 40.0f);
/* 459 */                   O1ooiI111i o1ooiI111i3 = o1ooiI111i2;
/* 537 */                   boolean zI000II = iloI0lOlll14.I000II(iolIOllI00000oIO3) | ((i7 & 896) == 256) | iloI0lOlll14.I000II(iolIOllI00000oIO) | iloI0lOlll14.I000II(iolIOllI00000oIO2) | ((((i7 & 7168) ^ 3072) > 2048 && iloI0lOlll14.I0001Ioi1lo(j5)) || (i7 & 3072) == 2048) | iloI0lOlll14.I000OOo1O(olOooI0l0011) | ((((i7 & 112) ^ 48) > 32 && iloI0lOlll14.I0001Ioi1lo(j3)) || (i7 & 48) == 32);
/* 539 */                   Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 543 */                   if (!zI000II) {
                                Object obj = objI00O0i0ii;
/* 547 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 551 */                           OOO0IIOIOi1 oOO0IIOIOi1 = new OOO0IIOIOi1();
/* 554 */                           oOO0IIOIOi1.I00iOIl = iolIOllI00000oIO3;
/* 556 */                           oOO0IIOIOi1.I00iiI = i6;
/* 558 */                           oOO0IIOIOi1.I00iiO = f4;
/* 560 */                           oOO0IIOIOi1.I00iio = f3;
/* 562 */                           oOO0IIOIOi1.I00ilI0I1 = iolIOllI00000oIO;
/* 564 */                           oOO0IIOIOi1.I00ilO0 = iolIOllI00000oIO2;
/* 566 */                           oOO0IIOIOi1.I00io1l = j5;
/* 568 */                           oOO0IIOIOi1.I00ioIO = olOooI0l0011;
/* 570 */                           oOO0IIOIOi1.I00l0I0l0lO1 = j3;
/* 572 */                           VarHandle.storeStoreFence();
/* 575 */                           iloI0lOlll14.I00iio(oOO0IIOIOi1);
                                    obj = oOO0IIOIOi1;
                                }
/* 581 */                       iOl0ilO1.I00000oIO(o1ooiI111iI000lI, (Function1) obj, iloI0lOlll14, 0);
/* 584 */                       o1ooiI111i2 = o1ooiI111i3;
                                iloI0lOlll12 = iloI0lOlll14;
                            }
                        }
/* 597 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 601 */               if (oOloioIlI001IO000 == null) {
/* 605 */                   OOO0OoO00il0 oOO0OoO00il0 = new OOO0OoO00il0();
/* 608 */                   oOO0OoO00il0.I00iOIl = o1ooiI111i2;
/* 610 */                   oOO0OoO00il0.I00iiI = j3;
/* 612 */                   oOO0OoO00il0.I00iiO = f3;
/* 614 */                   oOO0OoO00il0.I00iio = j5;
/* 616 */                   oOO0OoO00il0.I00ilI0I1 = i6;
/* 618 */                   oOO0OoO00il0.I00ilO0 = f4;
/* 622 */                   oOO0OoO00il0.I00io1l = i2;
/* 626 */                   oOO0OoO00il0.I00ioIO = i3;
/* 628 */                   VarHandle.storeStoreFence();
/* 631 */                   oOloioIlI001IO000.I0000O = oOO0OoO00il0;
/* 1821 */                  return;
                        }
/* 1821 */              return;
                    }
/* 64 */            i9 |= 384;
/* 66 */            f3 = f;
/* 89 */            long j52 = j2;
/* 108 */           i5 = i9 | (((i3 & 8) == 0 || !iloI0lOlll1.I0001Ioi1lo(j52)) ? Barcode.FORMAT_UPC_E : Barcode.FORMAT_PDF417) | 221184;
/* 127 */           if (iloI0lOlll1.I00OIl(i5 & 1, (74899 & i5) == 74898)) {
                    }
/* 597 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 601 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, long j, float f, long j2, int i, float f2, IloI0lOlll1 iloI0lOlll1, int i2) {
                    long jI0000oI00;
                    float f3;
                    long jI0000oI002;
                    int i3;
                    float f4;
                    int i4;
/* 10 */            iloI0lOlll1.I00i0O(-1798883595);
/* 28 */            int i5 = i2 | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | 1780864;
/* 48 */            if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) != 599186)) {
/* 50 */                iloI0lOlll1.I00Ol00();
/* 58 */                if ((i2 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 85 */                    jI0000oI00 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oIO, iloI0lOlll1);
/* 91 */                    jI0000oI002 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oOI, iloI0lOlll1);
/* 96 */                    f3 = 4.0f;
/* 95 */                    i4 = i5 & (-58241);
/* 99 */                    f4 = 4.0f;
/* 100 */                   i3 = 1;
                        } else {
/* 67 */                    iloI0lOlll1.I00OilO00Il();
/* 71 */                    jI0000oI00 = j;
/* 73 */                    f3 = f;
/* 75 */                    jI0000oI002 = j2;
/* 77 */                    f4 = f2;
/* 70 */                    i4 = i5 & (-58241);
/* 80 */                    i3 = i;
                        }
/* 101 */               iloI0lOlll1.I0010o();
/* 110 */               boolean z = (i4 & 14) == 4;
/* 111 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 115 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 117 */               if (z || objI00O0i0ii == obj) {
/* 125 */                   I0O1OI i0o1oi = new I0O1OI(17);
/* 128 */                   i0o1oi.I00iiI = illOOo00lI;
/* 130 */                   VarHandle.storeStoreFence();
/* 133 */                   iloI0lOlll1.I00iio(i0o1oi);
                            obj2 = i0o1oi;
                        }
/* 136 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj2;
/* 174 */               OlOooI0l0011 olOooI0l0011 = new OlOooI0l0011(((IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0)).I00i0ilIl0i(f3), 0.0f, i3, 0, null, 26);
/* 179 */               boolean zI000II = iloI0lOlll1.I000II(illOOo00lI2);
/* 183 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 187 */               if (zI000II || objI00O0i0ii2 == obj) {
/* 195 */                   I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(10);
/* 198 */                   i11i0ol0l0.I00iiI = illOOo00lI2;
/* 200 */                   VarHandle.storeStoreFence();
/* 203 */                   iloI0lOlll1.I00iio(i11i0ol0l0);
                            obj3 = i11i0ol0l0;
                        }
/* 214 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(OiioloIlOlIi.I00000oOI(o1ooiI111i, true, (Function1) obj3), 40.0f);
/* 236 */               boolean zI000II2 = iloI0lOlll1.I000II(illOOo00lI2) | iloI0lOlll1.I0001Ioi1lo(jI0000oI002) | iloI0lOlll1.I000OOo1O(olOooI0l0011) | iloI0lOlll1.I0001Ioi1lo(jI0000oI00);
/* 237 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 241 */               if (zI000II2 || objI00O0i0ii3 == obj) {
/* 247 */                   OOO0iIO1I1 oOO0iIO1I1 = new OOO0iIO1I1();
/* 250 */                   oOO0iIO1I1.I00iOIl = illOOo00lI2;
/* 252 */                   oOO0iIO1I1.I00iiI = i3;
/* 254 */                   oOO0iIO1I1.I00iiO = f4;
/* 256 */                   oOO0iIO1I1.I00iio = f3;
/* 258 */                   oOO0iIO1I1.I00ilI0I1 = jI0000oI002;
/* 260 */                   oOO0iIO1I1.I00ilO0 = olOooI0l0011;
/* 262 */                   oOO0iIO1I1.I00io1l = jI0000oI00;
/* 264 */                   VarHandle.storeStoreFence();
/* 267 */                   iloI0lOlll1.I00iio(oOO0iIO1I1);
                            obj4 = oOO0iIO1I1;
                        }
/* 273 */               iOl0ilO1.I00000oIO(o1ooiI111iI000lI, (Function1) obj4, iloI0lOlll1, 0);
                    } else {
/* 277 */               iloI0lOlll1.I00OilO00Il();
/* 280 */               jI0000oI00 = j;
/* 282 */               f3 = f;
/* 284 */               jI0000oI002 = j2;
/* 286 */               i3 = i;
/* 288 */               f4 = f2;
                    }
/* 290 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 294 */           if (oOloioIlI001IO000 != null) {
/* 298 */               OOO0IiI oOO0IiI = new OOO0IiI();
/* 301 */               oOO0IiI.I00iOIl = illOOo00lI;
/* 303 */               oOO0IiI.I00iiI = o1ooiI111i;
/* 305 */               oOO0IiI.I00iiO = jI0000oI00;
/* 307 */               oOO0IiI.I00iio = f3;
/* 309 */               oOO0IiI.I00ilI0I1 = jI0000oI002;
/* 311 */               oOO0IiI.I00ilO0 = i3;
/* 313 */               oOO0IiI.I00io1l = f4;
/* 315 */               VarHandle.storeStoreFence();
/* 318 */               oOloioIlI001IO000.I0000O = oOO0IiI;
                    }
                }

                public static final void I0000Il00O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, long j, long j2, int i, float f, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    float f2;
                    Function1 function12;
                    int i5;
/* 10 */            iloI0lOlll1.I00i0O(-339970038);
/* 29 */            long jI0000oI00 = j;
/* 46 */            long jI0000oI002 = j2;
/* 65 */            int i6 = i2 | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | (((i3 & 4) == 0 && iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) ? 256 : Barcode.FORMAT_ITF) | (((i3 & 8) == 0 && iloI0lOlll1.I0001Ioi1lo(jI0000oI002)) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | 745472;
/* 85 */            if (iloI0lOlll1.I00OIl(i6 & 1, (599187 & i6) != 599186)) {
/* 87 */                iloI0lOlll1.I00Ol00();
/* 90 */                int i7 = i2 & 1;
/* 95 */                Object obj = IOl11li.I00000oIO;
/* 97 */                if (i7 == 0 || iloI0lOlll1.I001lloI()) {
/* 133 */                   if ((i3 & 4) != 0) {
/* 137 */                       jI0000oI00 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oIO, iloI0lOlll1);
/* 141 */                       i6 &= -897;
                            }
/* 145 */                   if ((i3 & 8) != 0) {
/* 149 */                       jI0000oI002 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oOI, iloI0lOlll1);
/* 153 */                       i6 &= -7169;
                            }
/* 173 */                   boolean z = (((i6 & 896) ^ 384) > 256 && iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) || (i6 & 384) == 256;
/* 174 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            Object obj2 = objI00O0i0ii;
/* 178 */                   if (z || objI00O0i0ii == obj) {
/* 186 */                       I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(8);
/* 189 */                       i0o0iioo0IO.I00iiI = jI0000oI00;
/* 191 */                       VarHandle.storeStoreFence();
/* 194 */                       iloI0lOlll1.I00iio(i0o0iioo0IO);
                                obj2 = i0o0iioo0IO;
                            }
/* 200 */                   i5 = i6 & (-3670017);
/* 198 */                   function12 = (Function1) obj2;
/* 204 */                   i4 = 1;
/* 205 */                   f2 = 4.0f;
                        } else {
/* 106 */                   iloI0lOlll1.I00OilO00Il();
/* 111 */                   if ((i3 & 4) != 0) {
/* 113 */                       i6 &= -897;
                            }
/* 117 */                   if ((i3 & 8) != 0) {
/* 119 */                       i6 &= -7169;
                            }
/* 123 */                   f2 = f;
/* 125 */                   function12 = function1;
/* 121 */                   i5 = i6 & (-3670017);
/* 128 */                   i4 = i;
                        }
/* 207 */               iloI0lOlll1.I0010o();
/* 216 */               boolean z2 = (i5 & 14) == 4;
/* 217 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 221 */               if (z2 || objI00O0i0ii2 == obj) {
/* 229 */                   I0O1OI i0o1oi = new I0O1OI(16);
/* 232 */                   i0o1oi.I00iiI = illOOo00lI;
/* 234 */                   VarHandle.storeStoreFence();
/* 237 */                   iloI0lOlll1.I00iio(i0o1oi);
                            obj3 = i0o1oi;
                        }
/* 240 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj3;
/* 244 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(I01olIOo10.I00000oOI);
/* 248 */               boolean zI000II = iloI0lOlll1.I000II(illOOo00lI2);
/* 252 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 256 */               if (zI000II || objI00O0i0ii3 == obj) {
/* 264 */                   I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(9);
/* 267 */                   i11i0ol0l0.I00iiI = illOOo00lI2;
/* 269 */                   VarHandle.storeStoreFence();
/* 272 */                   iloI0lOlll1.I00iio(i11i0ol0l0);
                            obj4 = i11i0ol0l0;
                        }
/* 286 */               O1ooiI111i o1ooiI111iI000o00OoI0I = Ol0iOOO0.I000o00OoI0I(OiioloIlOlIi.I00000oOI(o1ooiI111iI0000O, true, (Function1) obj4), 240.0f, 4.0f);
/* 348 */               boolean zI000II2 = iloI0lOlll1.I000II(illOOo00lI2) | ((((i5 & 7168) ^ 3072) > 2048 && iloI0lOlll1.I0001Ioi1lo(jI0000oI002)) || (i5 & 3072) == 2048) | ((((i5 & 896) ^ 384) > 256 && iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) || (i5 & 384) == 256) | iloI0lOlll1.I000II(function12);
/* 349 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii4;
/* 353 */               if (zI000II2 || objI00O0i0ii4 == obj) {
/* 359 */                   OOO0i0l oOO0i0l = new OOO0i0l();
/* 362 */                   oOO0i0l.I00iOIl = i4;
/* 364 */                   oOO0i0l.I00iiI = f2;
/* 366 */                   oOO0i0l.I00iiO = illOOo00lI2;
/* 368 */                   oOO0i0l.I00iio = jI0000oI002;
/* 370 */                   oOO0i0l.I00ilI0I1 = jI0000oI00;
/* 372 */                   oOO0i0l.I00ilO0 = function12;
/* 374 */                   VarHandle.storeStoreFence();
/* 377 */                   iloI0lOlll1.I00iio(oOO0i0l);
                            obj5 = oOO0i0l;
                        }
/* 383 */               iOl0ilO1.I00000oIO(o1ooiI111iI000o00OoI0I, (Function1) obj5, iloI0lOlll1, 0);
                    } else {
/* 387 */               iloI0lOlll1.I00OilO00Il();
/* 390 */               i4 = i;
/* 392 */               f2 = f;
/* 394 */               function12 = function1;
                    }
/* 396 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 400 */           if (oOloioIlI001IO000 != null) {
/* 404 */               OOO0iI110 oOO0iI110 = new OOO0iI110();
/* 407 */               oOO0iI110.I00iOIl = illOOo00lI;
/* 409 */               oOO0iI110.I00iiI = o1ooiI111i;
/* 411 */               oOO0iI110.I00iiO = jI0000oI00;
/* 413 */               oOO0iI110.I00iio = jI0000oI002;
/* 415 */               oOO0iI110.I00ilI0I1 = i4;
/* 417 */               oOO0iI110.I00ilO0 = f2;
/* 419 */               oOO0iI110.I00io1l = function12;
/* 423 */               oOO0iI110.I00ioIO = i3;
/* 425 */               VarHandle.storeStoreFence();
/* 428 */               oOloioIlI001IO000.I0000O = oOO0iI110;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x01a9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000O(O1ooiI111i o1ooiI111i, long j, long j2, int i, float f, IloI0lOlll1 iloI0lOlll1, int i2) {
                    long jI0000oI00;
                    long jI0000oI002;
                    int i3;
                    float f2;
                    IloI0lOlll1 iloI0lOlll12;
/* 9 */             Float fValueOf = Float.valueOf(1.0f);
/* 14 */            Float fValueOf2 = Float.valueOf(0.0f);
/* 21 */            iloI0lOlll1.I00i0O(567589233);
/* 24 */            int i4 = i2 | 27792;
/* 42 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 9363) != 9362)) {
/* 44 */                iloI0lOlll1.I00Ol00();
/* 48 */                if ((i2 & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 71 */                    jI0000oI00 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oIO, iloI0lOlll1);
/* 77 */                    jI0000oI002 = IOOl0iiliOl.I0000oI00(OOO0io1ol.I00000oOI, iloI0lOlll1);
/* 81 */                    i3 = 1;
/* 82 */                    f2 = 4.0f;
                        } else {
/* 57 */                    iloI0lOlll1.I00OilO00Il();
/* 60 */                    jI0000oI00 = j;
/* 62 */                    jI0000oI002 = j2;
/* 64 */                    i3 = i;
/* 66 */                    f2 = f;
                        }
/* 84 */                iloI0lOlll1.I0010o();
/* 87 */                IolIiIl iolIiIlI00000oOI = ioilliiOI0.I00000oOI(iloI0lOlll1);
/* 95 */                O0OO1iIo o0OO1iIo = new O0OO1iIo();
/* 100 */               o0OO1iIo.I00000oIO = 300;
/* 102 */               OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 109 */               o0OO1iIo.I00000oOI = new OI0l1oli1I();
/* 113 */               o0OO1iIo.I00000oIO = 1750;
/* 115 */               O0OO0OlO o0OO0OlOI00000oIO = o0OO1iIo.I00000oIO(fValueOf2, 0);
/* 119 */               Ii0i0o1lliO1 ii0i0o1lliO1 = I00000oIO;
/* 121 */               o0OO0OlOI00000oIO.I00000oOI = ii0i0o1lliO1;
/* 125 */               o0OO1iIo.I00000oIO(fValueOf, 1000);
/* 128 */               O0OO1il1o0 o0OO1il1o0 = new O0OO1il1o0();
/* 131 */               o0OO1il1o0.I00000oIO = o0OO1iIo;
/* 133 */               VarHandle.storeStoreFence();
/* 160 */               IolIOll iolIOllI00000oIO = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 1.0f, iOO01lio0.I00000oIO(o0OO1il1o0, null, 6), iloI0lOlll1, 4536);
/* 168 */               O0OO1iIo o0OO1iIo2 = new O0OO1iIo();
/* 171 */               o0OO1iIo2.I00000oIO = 300;
/* 178 */               o0OO1iIo2.I00000oOI = new OI0l1oli1I();
/* 182 */               o0OO1iIo2.I00000oIO = 1750;
/* 190 */               o0OO1iIo2.I00000oIO(fValueOf2, 250).I00000oOI = ii0i0o1lliO1;
/* 194 */               o0OO1iIo2.I00000oIO(fValueOf, 1250);
/* 197 */               O0OO1il1o0 o0OO1il1o02 = new O0OO1il1o0();
/* 200 */               o0OO1il1o02.I00000oIO = o0OO1iIo2;
/* 202 */               VarHandle.storeStoreFence();
/* 223 */               IolIOll iolIOllI00000oIO2 = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 1.0f, iOO01lio0.I00000oIO(o0OO1il1o02, null, 6), iloI0lOlll1, 4536);
/* 233 */               O0OO1iIo o0OO1iIo3 = new O0OO1iIo();
/* 238 */               o0OO1iIo3.I00000oIO = 300;
/* 245 */               o0OO1iIo3.I00000oOI = new OI0l1oli1I();
/* 249 */               o0OO1iIo3.I00000oIO = 1750;
/* 257 */               o0OO1iIo3.I00000oIO(fValueOf2, 650).I00000oOI = ii0i0o1lliO1;
/* 261 */               o0OO1iIo3.I00000oIO(fValueOf, 1500);
/* 264 */               O0OO1il1o0 o0OO1il1o03 = new O0OO1il1o0();
/* 267 */               o0OO1il1o03.I00000oIO = o0OO1iIo3;
/* 269 */               VarHandle.storeStoreFence();
/* 289 */               IolIOll iolIOllI00000oIO3 = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 1.0f, iOO01lio0.I00000oIO(o0OO1il1o03, null, 6), iloI0lOlll1, 4536);
/* 299 */               O0OO1iIo o0OO1iIo4 = new O0OO1iIo();
/* 304 */               o0OO1iIo4.I00000oIO = 300;
/* 311 */               o0OO1iIo4.I00000oOI = new OI0l1oli1I();
/* 315 */               o0OO1iIo4.I00000oIO = 1750;
/* 323 */               o0OO1iIo4.I00000oIO(fValueOf2, 900).I00000oOI = ii0i0o1lliO1;
/* 327 */               o0OO1iIo4.I00000oIO(fValueOf, 1750);
/* 330 */               O0OO1il1o0 o0OO1il1o04 = new O0OO1il1o0();
/* 333 */               o0OO1il1o04.I00000oIO = o0OO1iIo4;
/* 335 */               VarHandle.storeStoreFence();
/* 355 */               IolIOll iolIOllI00000oIO4 = ioilliiOI0.I00000oIO(iolIiIlI00000oOI, 0.0f, 1.0f, iOO01lio0.I00000oIO(o0OO1il1o04, null, 6), iloI0lOlll1, 4536);
/* 359 */               IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 383 */               O1ooiI111i o1ooiI111iI000o00OoI0I = Ol0iOOO0.I000o00OoI0I(OiioloIlOlIi.I00000oOI(o1ooiI111i.I0000O(I01olIOo10.I00000oOI), true, new OI1lOo(28)), 240.0f, 4.0f);
/* 415 */               boolean zI000II = iloI0lOlll13.I000II(iolIOllI00000oIO) | iloI0lOlll13.I0001Ioi1lo(jI0000oI002) | iloI0lOlll13.I000II(iolIOllI00000oIO2) | iloI0lOlll13.I0001Ioi1lo(jI0000oI00) | iloI0lOlll13.I000II(iolIOllI00000oIO3) | iloI0lOlll13.I000II(iolIOllI00000oIO4);
/* 416 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 420 */               if (!zI000II) {
                            Object obj = objI00O0i0ii;
/* 424 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 428 */                       OOO0O1 ooo0o1 = new OOO0O1();
/* 431 */                       ooo0o1.I00iOIl = i3;
/* 433 */                       ooo0o1.I00iiI = f2;
/* 435 */                       ooo0o1.I00iiO = iolIOllI00000oIO;
/* 437 */                       ooo0o1.I00iio = jI0000oI002;
/* 439 */                       ooo0o1.I00ilI0I1 = iolIOllI00000oIO2;
/* 441 */                       ooo0o1.I00ilO0 = jI0000oI00;
/* 443 */                       ooo0o1.I00io1l = iolIOllI00000oIO3;
/* 445 */                       ooo0o1.I00ioIO = iolIOllI00000oIO4;
/* 447 */                       VarHandle.storeStoreFence();
/* 450 */                       iloI0lOlll13.I00iio(ooo0o1);
                                obj = ooo0o1;
                            }
/* 456 */                   iOl0ilO1.I00000oIO(o1ooiI111iI000o00OoI0I, (Function1) obj, iloI0lOlll13, 0);
                            iloI0lOlll12 = iloI0lOlll13;
                        }
                    } else {
/* 460 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 461 */               iloI0lOlll14.I00OilO00Il();
/* 464 */               jI0000oI00 = j;
/* 466 */               jI0000oI002 = j2;
/* 468 */               i3 = i;
/* 470 */               f2 = f;
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 472 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 476 */           if (oOloioIlI001IO000 != null) {
/* 480 */               OOO0Oo0i oOO0Oo0i = new OOO0Oo0i();
/* 483 */               oOO0Oo0i.I00iOIl = o1ooiI111i;
/* 485 */               oOO0Oo0i.I00iiI = jI0000oI00;
/* 487 */               oOO0Oo0i.I00iiO = jI0000oI002;
/* 489 */               oOO0Oo0i.I00iio = i3;
/* 491 */               oOO0Oo0i.I00ilI0I1 = f2;
/* 493 */               VarHandle.storeStoreFence();
/* 496 */               oOloioIlI001IO000.I0000O = oOO0Oo0i;
                    }
                }

                public static final void I0000oI00(IilloIOOO0i iilloIOOO0i, float f, float f2, long j, OlOooI0l0011 olOooI0l0011) {
/* 19 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) - (2.0f * (olOooI0l0011.I00000oIO / 2.0f));
/* 57 */            iilloIOOO0i.I00oo1iO0ll(j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), olOooI0l0011);
                }

                public static final void I0001Ioi1lo(IilloIOOO0i iilloIOOO0i, float f, float f2, long j, float f3, int i) {
/* 9 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32));
/* 24 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 30 */            float f4 = fIntBitsToFloat2 / 2.0f;
/* 42 */            boolean z = iilloIOOO0i.getLayoutDirection() == O0iOOoiioO.I00iOIl;
/* 52 */            float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
/* 60 */            float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
/* 61 */            if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
/* 109 */               IilloIOOO0i.I00oli(iilloIOOO0i, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, 0, null, 496);
/* 112 */               return;
                    }
/* 113 */           float f7 = f3 / 2.0f;
/* 115 */           float f8 = fIntBitsToFloat - f7;
/* 118 */           if (f5 < f7) {
/* 120 */               f5 = f7;
                    }
/* 123 */           if (f5 > f8) {
/* 125 */               f5 = f8;
                    }
/* 128 */           if (f6 < f7) {
/* 130 */               f6 = f7;
                    }
/* 133 */           if (f6 <= f8) {
/* 136 */               f8 = f6;
                    }
/* 146 */           if (Math.abs(f2 - f) > 0.0f) {
/* 188 */               IilloIOOO0i.I00oli(iilloIOOO0i, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, i, null, 480);
                    }
                }
            }
