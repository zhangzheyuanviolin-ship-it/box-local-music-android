            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ListIterator;
            import java.util.concurrent.ScheduledExecutorService;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1OIIoio0i1 {
                public static volatile Io11oioo I00000oIO;

                public static final void I00000oIO(OoI1Oi0l1I0o ooI1Oi0l1I0o, O1ooiI111i o1ooiI111i, Function1 function1, I0iolI1I11l1 i0iolI1I11l1, Function1 function12, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 8 */             iloI0lOlll1.I00i0O(511725103);
/* 13 */            if ((i & 6) == 0) {
/* 24 */                i2 = (iloI0lOlll1.I000II(ooI1Oi0l1I0o) ? 4 : 2) | i;
                    } else {
/* 26 */                i2 = i;
                    }
/* 29 */            if ((i & 48) == 0) {
/* 42 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 45 */            if ((i & 384) == 0) {
/* 58 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 61 */            if ((i & 3072) == 0) {
/* 74 */                i2 |= iloI0lOlll1.I000II(i0iolI1I11l1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 77 */            if ((i & 24576) == 0) {
/* 90 */                i2 |= iloI0lOlll1.I000OOo1O(function12) ? 16384 : 8192;
                    }
/* 95 */            if ((i & 196608) == 0) {
/* 108 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 131072 : 65536;
                    }
/* 127 */           if (iloI0lOlll1.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 129 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 135 */               if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 137 */                   objI00O0i0ii = I10i1IOOol.I00iio;
/* 139 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 175 */               I0000Il00O(ooI1Oi0l1I0o, o1ooiI111i, function1, i0iolI1I11l1, function12, (Function1) objI00O0i0ii, iOii1l, iloI0lOlll1, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016));
                    } else {
/* 179 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 182 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 186 */           if (oOloioIlI001IO000 != null) {
/* 200 */               oOloioIlI001IO000.I0000O = new I10iIIo1(ooI1Oi0l1I0o, o1ooiI111i, function1, i0iolI1I11l1, function12, iOii1l, i);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(Object obj, O1ooiI111i o1ooiI111i, Function1 function1, I0iolI1I11l1 i0iolI1I11l1, String str, Function1 function12, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    Function1 function13;
                    int i5;
                    I0iolI1I11l1 i0iolI1I11l12;
                    int i6;
                    String str2;
                    int i7;
                    IOii1l iOii1l2;
                    O1ooiI111i o1ooiI111i3;
                    Function1 function14;
                    I0iolI1I11l1 i0iolI1I11l13;
                    Function1 function15;
                    OOloioIl oOloioIlI001IO000;
/* 10 */            iloI0lOlll1.I00i0O(1501828832);
/* 15 */            if ((i & 6) == 0) {
/* 35 */                i3 = ((i & 8) == 0 ? iloI0lOlll1.I000II(obj) : iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | i;
                    } else {
/* 37 */                i3 = i;
                    }
/* 38 */            int i8 = i2 & 2;
/* 40 */            if (i8 != 0) {
/* 42 */                i3 |= 48;
                    } else {
/* 49 */                if ((i & 48) == 0) {
/* 51 */                    o1ooiI111i2 = o1ooiI111i;
/* 64 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 65 */                i4 = i2 & 4;
/* 67 */                if (i4 == 0) {
/* 69 */                    i3 |= 384;
                        } else {
/* 76 */                    if ((i & 384) == 0) {
/* 78 */                        function13 = function1;
/* 91 */                        i3 |= iloI0lOlll1.I000OOo1O(function13) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 92 */                    i5 = i2 & 8;
/* 94 */                    if (i5 != 0) {
/* 96 */                        i3 |= 3072;
                            } else {
/* 103 */                       if ((i & 3072) == 0) {
/* 105 */                           i0iolI1I11l12 = i0iolI1I11l1;
/* 118 */                           i3 |= iloI0lOlll1.I000II(i0iolI1I11l12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                                }
/* 119 */                       i6 = i2 & 16;
/* 121 */                       if (i6 != 0) {
/* 130 */                           if ((i & 24576) == 0) {
/* 132 */                               str2 = str;
/* 145 */                               i3 |= iloI0lOlll1.I000II(str2) ? 16384 : 8192;
                                    }
/* 148 */                           i7 = i3 | 196608;
/* 152 */                           if ((1572864 & i) == 0) {
/* 154 */                               iOii1l2 = iOii1l;
/* 167 */                               i7 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? 1048576 : 524288;
                                    } else {
/* 169 */                               iOii1l2 = iOii1l;
                                    }
/* 190 */                           if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
/* 197 */                               O1ooiI111i o1ooiI111i4 = i8 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 198 */                               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 200 */                               if (i4 != 0) {
/* 202 */                                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 206 */                                   if (objI00O0i0ii == iOO0o0I1l) {
/* 208 */                                       objI00O0i0ii = I10i1IOOol.I00iiI;
/* 210 */                                       iloI0lOlll1.I00iio(objI00O0i0ii);
                                            }
/* 213 */                                   function13 = (Function1) objI00O0i0ii;
                                        }
/* 221 */                               I0iolI1I11l1 i0iolI1I11l14 = i5 != 0 ? i1O01oOIoI0I.I00iiO : i0iolI1I11l12;
/* 222 */                               if (i6 != 0) {
/* 224 */                                   str2 = "AnimatedContent";
                                        }
/* 227 */                               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 231 */                               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 233 */                                   objI00O0i0ii2 = I10i1IOOol.I00iiO;
/* 235 */                                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                                        }
/* 239 */                               Function1 function16 = (Function1) objI00O0i0ii2;
/* 248 */                               OoI1iOl0IoI ooI1iOl0IoII0001Ioi1lo = iO1IIloiOoiO.I0001Ioi1lo(obj, str2, iloI0lOlll1, (i7 & 14) | ((i7 >> 9) & 112), 0);
/* 252 */                               int i9 = i7 & 8176;
/* 254 */                               int i10 = i7 >> 3;
/* 264 */                               int i11 = i9 | (57344 & i10) | (i10 & 458752);
/* 265 */                               Function1 function17 = function13;
/* 266 */                               function15 = function16;
/* 270 */                               I00000oIO(ooI1iOl0IoII0001Ioi1lo, o1ooiI111i4, function17, i0iolI1I11l14, function15, iOii1l2, iloI0lOlll1, i11);
/* 273 */                               o1ooiI111i3 = o1ooiI111i4;
/* 274 */                               function14 = function17;
/* 275 */                               i0iolI1I11l13 = i0iolI1I11l14;
                                    } else {
/* 278 */                               iloI0lOlll1.I00OilO00Il();
/* 281 */                               o1ooiI111i3 = o1ooiI111i2;
/* 282 */                               function14 = function13;
/* 283 */                               i0iolI1I11l13 = i0iolI1I11l12;
/* 284 */                               function15 = function12;
                                    }
/* 276 */                           String str3 = str2;
/* 287 */                           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 291 */                           if (oOloioIlI001IO000 != null) {
/* 304 */                               oOloioIlI001IO000.I0000O = new I10i1oO01ol(obj, o1ooiI111i3, function14, i0iolI1I11l13, str3, function15, iOii1l, i, i2);
/* 2739 */                              return;
                                    }
/* 2739 */                          return;
                                }
/* 123 */                       i3 |= 24576;
/* 125 */                       str2 = str;
/* 148 */                       i7 = i3 | 196608;
/* 152 */                       if ((1572864 & i) == 0) {
                                }
/* 190 */                       if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
                                }
/* 276 */                       String str32 = str2;
/* 287 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 291 */                       if (oOloioIlI001IO000 != null) {
                                }
                            }
/* 98 */                    i0iolI1I11l12 = i0iolI1I11l1;
/* 119 */                   i6 = i2 & 16;
/* 121 */                   if (i6 != 0) {
                            }
/* 125 */                   str2 = str;
/* 148 */                   i7 = i3 | 196608;
/* 152 */                   if ((1572864 & i) == 0) {
                            }
/* 190 */                   if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
                            }
/* 276 */                   String str322 = str2;
/* 287 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 291 */                   if (oOloioIlI001IO000 != null) {
                            }
                        }
/* 71 */                function13 = function1;
/* 92 */                i5 = i2 & 8;
/* 94 */                if (i5 != 0) {
                        }
/* 98 */                i0iolI1I11l12 = i0iolI1I11l1;
/* 119 */               i6 = i2 & 16;
/* 121 */               if (i6 != 0) {
                        }
/* 125 */               str2 = str;
/* 148 */               i7 = i3 | 196608;
/* 152 */               if ((1572864 & i) == 0) {
                        }
/* 190 */               if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
                        }
/* 276 */               String str3222 = str2;
/* 287 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 291 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 44 */            o1ooiI111i2 = o1ooiI111i;
/* 65 */            i4 = i2 & 4;
/* 67 */            if (i4 == 0) {
                    }
/* 71 */            function13 = function1;
/* 92 */            i5 = i2 & 8;
/* 94 */            if (i5 != 0) {
                    }
/* 98 */            i0iolI1I11l12 = i0iolI1I11l1;
/* 119 */           i6 = i2 & 16;
/* 121 */           if (i6 != 0) {
                    }
/* 125 */           str2 = str;
/* 148 */           i7 = i3 | 196608;
/* 152 */           if ((1572864 & i) == 0) {
                    }
/* 190 */           if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
                    }
/* 276 */           String str32222 = str2;
/* 287 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 291 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                public static final void I0000Il00O(OoI1Oi0l1I0o ooI1Oi0l1I0o, O1ooiI111i o1ooiI111i, Function1 function1, I0iolI1I11l1 i0iolI1I11l1, Function1 function12, Function1 function13, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    Function1 function14;
                    IloI0lOlll1 iloI0lOlll12;
                    Object obj;
                    OI10I1IoI0Ol oI10I1IoI0Ol;
                    Ol1o0O0O0 ol1o0O0O0;
                    I10llI0II11l i10llI0II11l;
                    Ol1o0O0O0 ol1o0O0O02;
                    OoI1I1i1 ooI1I1i1I0000Il00O;
                    IloI0lOlll1 iloI0lOlll13;
                    boolean z;
                    int i2;
                    int i3;
/* 20 */            iloI0lOlll1.I00i0O(1935038908);
/* 39 */            int i4 = (i & 6) == 0 ? (iloI0lOlll1.I000II(ooI1Oi0l1I0o) ? 4 : 2) | i : i;
/* 42 */            if ((i & 48) == 0) {
/* 55 */                i4 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 58 */            if ((i & 384) == 0) {
/* 71 */                i4 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i & 3072) == 0) {
/* 87 */                i4 |= iloI0lOlll1.I000II(i0iolI1I11l1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            if ((i & 24576) == 0) {
/* 103 */               i4 |= iloI0lOlll1.I000OOo1O(function12) ? 16384 : 8192;
                    }
/* 107 */           if ((196608 & i) == 0) {
/* 120 */               i4 |= iloI0lOlll1.I000OOo1O(function13) ? 131072 : 65536;
                    }
/* 124 */           IOii1l iOii1l2 = iOii1l;
/* 126 */           if ((1572864 & i) == 0) {
/* 139 */               i4 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? 1048576 : 524288;
                    }
/* 158 */           if (iloI0lOlll1.I00OIl(i4 & 1, (599187 & i4) != 599186)) {
/* 166 */               O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 168 */               int i5 = i4 & 14;
/* 175 */               boolean z2 = i5 == 4;
/* 177 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 181 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 183 */               if (z2 || objI00O0i0ii == iOO0o0I1l) {
/* 189 */                   I10llI0II11l i10llI0II11l2 = new I10llI0II11l();
/* 192 */                   i10llI0II11l2.I00000oIO = ooI1Oi0l1I0o;
/* 194 */                   i10llI0II11l2.I00000oOI = i0iolI1I11l1;
/* 196 */                   i10llI0II11l2.I0000Il00O = o0iOOoiioO;
/* 208 */                   i10llI0II11l2.I0000O = lOO00IiI0li.I00000oIO(IooOl0ol01.I00000oIO(0L));
/* 210 */                   long[] jArr = OiO10oio.I00000oIO;
/* 217 */                   i10llI0II11l2.I0000oI00 = new OI10I1IoI0Ol();
/* 219 */                   VarHandle.storeStoreFence();
/* 222 */                   iloI0lOlll1.I00iio(i10llI0II11l2);
                            obj2 = i10llI0II11l2;
                        }
/* 225 */               I10llI0II11l i10llI0II11l3 = (I10llI0II11l) obj2;
/* 231 */               boolean z3 = i5 == 4;
/* 232 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 236 */               if (z3 || objI00O0i0ii2 == iOO0o0I1l) {
/* 246 */                   Object[] objArr = {ooI1Oi0l1I0o.I00000oIO.I00olI()};
/* 252 */                   Ol1o0O0O0 ol1o0O0O03 = new Ol1o0O0O0();
/* 261 */                   ol1o0O0O03.addAll(I1IoiO1l.I00IioO0OiOi(objArr));
/* 264 */                   iloI0lOlll1.I00iio(ol1o0O0O03);
/* 267 */                   objI00O0i0ii2 = ol1o0O0O03;
                        }
/* 268 */               Ol1o0O0O0 ol1o0O0O04 = (Ol1o0O0O0) objI00O0i0ii2;
/* 270 */               OIooliIO0 oIooliIO0 = ooI1Oi0l1I0o.I0000oI00;
/* 272 */               int i6 = i4;
/* 274 */               OIooliIO0 oIooliIO02 = ooI1Oi0l1I0o.I0000O;
/* 278 */               I01O1lIi i01O1lIi = ooI1Oi0l1I0o.I00000oIO;
/* 296 */               boolean zI000II = iloI0lOlll1.I000II(oIooliIO0.getValue()) | (i5 == 4);
/* 297 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 301 */               if (zI000II || objI00O0i0ii3 == iOO0o0I1l) {
/* 305 */                   long[] jArr2 = OiO10oio.I00000oIO;
/* 309 */                   objI00O0i0ii3 = new OI10I1IoI0Ol();
/* 312 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 316 */               OI10I1IoI0Ol oI10I1IoI0Ol2 = (OI10I1IoI0Ol) objI00O0i0ii3;
/* 326 */               if (!ol1o0O0O04.contains(i01O1lIi.I00olI())) {
/* 328 */                   ol1o0O0O04.clear();
/* 335 */                   ol1o0O0O04.add(i01O1lIi.I00olI());
                        }
/* 350 */               if (O0000Ioio00.I0000O(i01O1lIi.I00olI(), oIooliIO02.getValue()) && oIooliIO0.getValue() == null) {
/* 363 */                   if (ol1o0O0O04.size() != 1 || !O0000Ioio00.I0000O(ol1o0O0O04.get(0), i01O1lIi.I00olI())) {
/* 380 */                       ol1o0O0O04.clear();
/* 387 */                       ol1o0O0O04.add(i01O1lIi.I00olI());
                            }
/* 393 */                   if (oI10I1IoI0Ol2.I0000oI00 != 1 || oI10I1IoI0Ol2.I0000Il00O(i01O1lIi.I00olI())) {
/* 405 */                       oI10I1IoI0Ol2.I00000oIO();
                            }
/* 408 */                   i10llI0II11l3.I00000oOI = i0iolI1I11l1;
/* 410 */                   i10llI0II11l3.I0000Il00O = o0iOOoiioO;
                        }
/* 412 */               Object value = oIooliIO0.getValue();
/* 416 */               if (value != null && !value.equals(i01O1lIi.I00olI())) {
/* 428 */                   ListIterator listIterator = ol1o0O0O04.listIterator();
/* 432 */                   int i7 = 0;
                            while (true) {
/* 436 */                       Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 442 */                       if (!io1ioiIIO1lI.hasNext()) {
/* 471 */                           i3 = -1;
                                    break;
                                } else {
/* 460 */                           if (O0000Ioio00.I0000O(function12.invoke(io1ioiIIO1lI.next()), function12.invoke(value))) {
/* 462 */                               i3 = i7;
                                        break;
                                    }
/* 466 */                           i7++;
                                }
                            }
/* 473 */                   if (i3 == -1) {
/* 475 */                       ol1o0O0O04.add(value);
                            } else if (!O0000Ioio00.I0000O(ol1o0O0O04.get(i3), value)) {
/* 489 */                       ol1o0O0O04.set(i3, value);
                            }
                        }
/* 504 */               if (!O0000Ioio00.I0000O(i01O1lIi.I00olI(), oIooliIO02.getValue())) {
/* 506 */                   ListIterator listIterator2 = ol1o0O0O04.listIterator();
/* 510 */                   int i8 = 0;
                            while (true) {
/* 512 */                       Io1ioiIIO1lI io1ioiIIO1lI2 = (Io1ioiIIO1lI) listIterator2;
/* 518 */                       if (!io1ioiIIO1lI2.hasNext()) {
/* 548 */                           i2 = -1;
                                    break;
                                } else {
/* 540 */                           if (O0000Ioio00.I0000O(function12.invoke(io1ioiIIO1lI2.next()), function12.invoke(oIooliIO02.getValue()))) {
/* 542 */                               i2 = i8;
                                        break;
                                    }
/* 545 */                           i8++;
                                }
                            }
/* 550 */                   if (i2 == -1) {
/* 556 */                       ol1o0O0O04.add(oIooliIO02.getValue());
                            } else if (!O0000Ioio00.I0000O(ol1o0O0O04.get(i2), oIooliIO02.getValue()) || i2 != ol1o0O0O04.size() - 1) {
/* 592 */                       O0000Ioio00.I0000O(oIooliIO02.getValue(), ol1o0O0O04.get(i2));
/* 595 */                       ol1o0O0O04.remove(i2);
/* 602 */                       ol1o0O0O04.add(oIooliIO02.getValue());
                            }
                        }
/* 605 */               Object value2 = oIooliIO0.getValue();
/* 609 */               boolean zI000II2 = iloI0lOlll1.I000II(value2);
/* 613 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 617 */               if (zI000II2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 634 */                   objI00O0i0ii4 = value2 != null ? new OO0iol0(i10llI0II11l3, oIooliIO02.getValue(), value2) : null;
/* 635 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 638 */               OO0iol0 oO0iol0 = (OO0iol0) objI00O0i0ii4;
/* 657 */               boolean zI000II3 = iloI0lOlll1.I000II(oO0iol0) | ((i6 & 458752) == 131072);
/* 659 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 663 */               if (!zI000II3 && objI00O0i0ii5 != iOO0o0I1l) {
/* 668 */                   obj = objI00O0i0ii5;
                        } else if (oO0iol0 != null && function13.invoke(oO0iol0) != null) {
/* 681 */                   OIiilo1Ool0o.I00000oIO();
/* 684 */                   return;
                        } else {
/* 685 */                   iloI0lOlll1.I00iio(null);
/* 688 */                   obj = null;
                        }
/* 689 */               if (obj != null) {
/* 1202 */                  OIiilo1Ool0o.I00000oIO();
/* 1205 */                  return;
                        }
/* 699 */               if (oI10I1IoI0Ol2.I00000oOI(oIooliIO02.getValue()) && oI10I1IoI0Ol2.I00000oOI(i01O1lIi.I00olI()) && (value2 == null || oI10I1IoI0Ol2.I00000oOI(value2))) {
/* 723 */                   iloI0lOlll1.I00i01iIIliI(-296960154);
/* 727 */                   iloI0lOlll1.I0010I0i(false);
/* 730 */                   function14 = function1;
/* 732 */                   oI10I1IoI0Ol = oI10I1IoI0Ol2;
/* 733 */                   ol1o0O0O0 = ol1o0O0O04;
/* 734 */                   i10llI0II11l = i10llI0II11l3;
                        } else {
/* 739 */                   iloI0lOlll1.I00i01iIIliI(-302058259);
/* 742 */                   oI10I1IoI0Ol2.I00000oIO();
/* 745 */                   int size = ol1o0O0O04.size();
/* 749 */                   int i9 = 0;
/* 750 */                   while (i9 < size) {
/* 752 */                       int i10 = size;
/* 754 */                       Object obj3 = ol1o0O0O04.get(i9);
/* 758 */                       OI10I1IoI0Ol oI10I1IoI0Ol3 = oI10I1IoI0Ol2;
/* 762 */                       I10llI0II11l i10llI0II11l4 = i10llI0II11l3;
/* 767 */                       int i11 = i9;
/* 769 */                       Ol1o0O0O0 ol1o0O0O05 = ol1o0O0O04;
/* 784 */                       oI10I1IoI0Ol3.I000lI(obj3, iiioOl1O.I00000oOI(427839334, new I10ill1(obj3, ooI1Oi0l1I0o, ol1o0O0O05, oO0iol0, function1, i10llI0II11l4, iOii1l2), iloI0lOlll1));
/* 789 */                       ol1o0O0O04 = ol1o0O0O05;
/* 790 */                       i10llI0II11l3 = i10llI0II11l4;
/* 791 */                       size = i10;
/* 794 */                       iOii1l2 = iOii1l;
/* 787 */                       i9 = i11 + 1;
/* 797 */                       oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
                            }
/* 801 */                   function14 = function1;
/* 803 */                   oI10I1IoI0Ol = oI10I1IoI0Ol2;
/* 804 */                   ol1o0O0O0 = ol1o0O0O04;
/* 805 */                   i10llI0II11l = i10llI0II11l3;
/* 807 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 831 */               boolean zI000II4 = iloI0lOlll1.I000II(ooI1Oi0l1I0o.I0001Ioi1lo()) | iloI0lOlll1.I000II(i10llI0II11l) | iloI0lOlll1.I000II(oIooliIO0.getValue());
/* 832 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 836 */               if (zI000II4 || objI00O0i0ii6 == iOO0o0I1l) {
/* 845 */                   objI00O0i0ii6 = (IOoOi11Io0o) function14.invoke(i10llI0II11l);
/* 847 */                   iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 850 */               IOoOi11Io0o iOoOi11Io0o = (IOoOi11Io0o) objI00O0i0ii6;
/* 852 */               OoI1Oi0l1I0o ooI1Oi0l1I0o2 = i10llI0II11l.I00000oIO;
/* 854 */               boolean zI000II5 = iloI0lOlll1.I000II(i10llI0II11l);
/* 858 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 862 */               if (zI000II5 || objI00O0i0ii7 == iOO0o0I1l) {
/* 868 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 872 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 875 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii7;
/* 879 */               OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(iOoOi11Io0o.I0000O, iloI0lOlll1);
/* 899 */               if (O0000Ioio00.I0000O(ooI1Oi0l1I0o2.I00000oIO.I00olI(), ooI1Oi0l1I0o2.I0000O.getValue())) {
/* 903 */                   oI10i0Il.setValue(Boolean.FALSE);
                        } else if (oI10i0IlI00000oOI.getValue() != null) {
/* 915 */                   oI10i0Il.setValue(Boolean.TRUE);
                        }
/* 924 */               boolean zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 928 */               O1ooiI111i o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 930 */               if (zBooleanValue) {
/* 935 */                   iloI0lOlll1.I00i01iIIliI(1353077497);
/* 947 */                   ol1o0O0O02 = ol1o0O0O0;
/* 948 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 950 */                   ooI1I1i1I0000Il00O = iO1IIloiOoiO.I0000Il00O(i10llI0II11l.I00000oIO, Ooo0ii.I000O01llI0, null, iloI0lOlll14, 0, 2);
/* 954 */                   boolean zI000II6 = iloI0lOlll14.I000II(ooI1I1i1I0000Il00O);
/* 958 */                   Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
/* 962 */                   if (zI000II6 || objI00O0i0ii8 == iOO0o0I1l) {
/* 972 */                       objI00O0i0ii8 = ii0OOOOo0i.I00000oOI(o1ooiI111i2);
/* 976 */                       iloI0lOlll14.I00iio(objI00O0i0ii8);
                            }
/* 981 */                   o1ooiI111i2 = (O1ooiI111i) objI00O0i0ii8;
/* 984 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll14;
                        } else {
/* 991 */                   ol1o0O0O02 = ol1o0O0O0;
/* 992 */                   IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 997 */                   iloI0lOlll15.I00i01iIIliI(1353343539);
/* 1000 */                  iloI0lOlll15.I0010I0i(false);
/* 1003 */                  ooI1I1i1I0000Il00O = null;
/* 1004 */                  i10llI0II11l.I0001Ioi1lo = null;
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 987 */               O1ooiI111i o1ooiI111i3 = o1ooiI111i2;
/* 1009 */              I10lI0lI i10lI0lI = new I10lI0lI();
/* 1012 */              i10lI0lI.I00000oIO = ooI1I1i1I0000Il00O;
/* 1014 */              i10lI0lI.I00000oOI = oI10i0IlI00000oOI;
/* 1016 */              i10lI0lI.I0000Il00O = i10llI0II11l;
/* 1018 */              VarHandle.storeStoreFence();
/* 1025 */              O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(o1ooiI111i3.I0000O(i10lI0lI));
/* 1029 */              Object objI00O0i0ii9 = iloI0lOlll13.I00O0i0ii();
                        Object obj4 = objI00O0i0ii9;
/* 1033 */              if (objI00O0i0ii9 == iOO0o0I1l) {
/* 1037 */                  I10l0oo1oO i10l0oo1oO = new I10l0oo1oO();
/* 1040 */                  i10l0oo1oO.I00000oIO = i10llI0II11l;
/* 1048 */                  i10l0oo1oO.I000O01llI0 = new I10l0iiI10I(i10l0oo1oO, 1);
/* 1056 */                  i10l0oo1oO.I000OOo1O = new I10l0iiI10I(i10l0oo1oO, 0);
/* 1058 */                  VarHandle.storeStoreFence();
/* 1061 */                  iloI0lOlll13.I00iio(i10l0oo1oO);
                            obj4 = i10l0oo1oO;
                        }
/* 1064 */              I10l0oo1oO i10l0oo1oO2 = (I10l0oo1oO) obj4;
/* 1068 */              int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 1072 */              OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 1076 */              O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000O);
/* 1082 */              IOl0oi0lOl1.I000lI.getClass();
/* 1085 */              iloI0lOlll13.I00i0oil();
/* 1090 */              if (iloI0lOlll13.I00O10llo) {
/* 1094 */                  iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 1098 */                  iloI0lOlll13.I00io1l();
                        }
/* 1103 */              li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, i10l0oo1oO2);
/* 1108 */              li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 1115 */              li01Ooiio01.I00000oIO(iloI0lOlll13, Integer.valueOf(iHashCode));
/* 1118 */              li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 1123 */              li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 1129 */              iloI0lOlll13.I00i01iIIliI(758586195);
/* 1132 */              int size2 = ol1o0O0O02.size();
/* 1137 */              for (int i12 = 0; i12 < size2; i12++) {
/* 1139 */                  Object obj5 = ol1o0O0O02.get(i12);
/* 1150 */                  iloI0lOlll13.I00Ol1ll1(1420119555, function12.invoke(obj5));
/* 1157 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) oI10I1IoI0Ol.I000II(obj5);
/* 1159 */                  if (illiIl1l11O == null) {
/* 1164 */                      iloI0lOlll13.I00i01iIIliI(1074069702);
/* 1167 */                      z = false;
                            } else {
/* 1172 */                      z = false;
/* 1176 */                      iloI0lOlll13.I00i01iIIliI(1420120731);
/* 1183 */                      illiIl1l11O.invoke(iloI0lOlll13, 0);
                            }
/* 1168 */                  iloI0lOlll13.I0010I0i(z);
/* 1187 */                  iloI0lOlll13.I0010I0i(z);
                        }
/* 1194 */              iloI0lOlll13.I0010I0i(false);
/* 1198 */              iloI0lOlll13.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll13;
                    } else {
/* 1206 */              function14 = function1;
/* 1207 */              IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 1208 */              iloI0lOlll16.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll16;
                    }
/* 1211 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1215 */          if (oOloioIlI001IO000 != null) {
/* 1233 */              oOloioIlI001IO000.I0000O = new I10iIoiio1l(ooI1Oi0l1I0o, o1ooiI111i, function14, i0iolI1I11l1, function12, function13, iOii1l, i);
                    }
                }

                public static ScheduledExecutorService I0000O() {
/* 3 */             if (I00000oIO != null) {
/* 5 */                 return I00000oIO;
                    }
                    synchronized (O1OIIoio0i1.class) {
                        try {
/* 13 */                    if (I00000oIO == null) {
/* 29 */                        I00000oIO = new Io11oioo(new Handler(Looper.getMainLooper()));
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 35 */            return I00000oIO;
                }
            }
