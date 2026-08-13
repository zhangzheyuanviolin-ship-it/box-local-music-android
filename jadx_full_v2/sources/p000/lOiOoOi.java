            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOiOoOi {
                public static final void I00000oIO(boolean z, IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z2, long j, long j2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IOii1l iOii1l2;
                    int i3;
/* 9 */             long j3 = j;
/* 22 */            iloI0lOlll1.I00i0O(-1573136853);
/* 27 */            int i4 = 2;
/* 28 */            if ((i & 6) == 0) {
/* 39 */                i2 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i;
                    } else {
/* 41 */                i2 = i;
                    }
/* 44 */            if ((i & 48) == 0) {
/* 57 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 60 */            if ((i & 384) == 0) {
/* 73 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 76 */            if ((i & 3072) == 0) {
/* 89 */                i2 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 92 */            if ((i & 24576) == 0) {
/* 105 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j3) ? 16384 : 8192;
                    }
/* 109 */           if ((196608 & i) == 0) {
/* 122 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 131072 : 65536;
                    }
/* 126 */           if ((1572864 & i) == 0) {
/* 140 */               i2 |= iloI0lOlll1.I000II(null) ? 1048576 : 524288;
                    }
/* 144 */           if ((12582912 & i) == 0) {
/* 157 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 8388608 : 4194304;
                    }
/* 176 */           if (iloI0lOlll1.I00OIl(i2 & 1, (4793491 & i2) != 4793490)) {
/* 178 */               iloI0lOlll1.I00Ol00();
/* 183 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 192 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 195 */               iloI0lOlll1.I0010o();
/* 203 */               Oi1lioiOilI oi1lioiOilII00000oIO = Oi1iliO.I00000oIO(true, 0.0f, j3, null, 250);
/* 209 */               I0O0oiIO i0O0oiIO = new I0O0oiIO(i4);
/* 212 */               i0O0oiIO.I00iio = o1ooiI111i;
/* 214 */               i0O0oiIO.I00iiI = z;
/* 216 */               i0O0oiIO.I00ilI0I1 = oi1lioiOilII00000oIO;
/* 218 */               i0O0oiIO.I00iiO = z2;
/* 220 */               i0O0oiIO.I00ilO0 = illOOo00lI;
/* 222 */               i0O0oiIO.I00io1l = iOii1l;
/* 224 */               VarHandle.storeStoreFence();
/* 230 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1128552423, i0O0oiIO, iloI0lOlll1);
/* 234 */               int i5 = i2 >> 12;
/* 247 */               int i6 = ((i2 << 6) & 896) | (i5 & 112) | (i5 & 14) | 3072;
/* 251 */               iOii1l2 = iOii1l;
/* 252 */               i3 = i;
/* 255 */               I0000O(j, j2, z, iOii1lI00000oOI, iloI0lOlll1, i6);
/* 258 */               j3 = j;
                    } else {
/* 260 */               iOii1l2 = iOii1l;
/* 261 */               i3 = i;
/* 262 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 265 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 269 */           if (oOloioIlI001IO000 != null) {
/* 273 */               Ollioll1l1o ollioll1l1o = new Ollioll1l1o();
/* 276 */               ollioll1l1o.I00iOIl = z;
/* 278 */               ollioll1l1o.I00iiI = illOOo00lI;
/* 280 */               ollioll1l1o.I00iiO = o1ooiI111i;
/* 282 */               ollioll1l1o.I00iio = z2;
/* 284 */               ollioll1l1o.I00ilI0I1 = j3;
/* 286 */               ollioll1l1o.I00ilO0 = j2;
/* 288 */               ollioll1l1o.I00io1l = iOii1l2;
/* 290 */               ollioll1l1o.I00ioIO = i3;
/* 292 */               VarHandle.storeStoreFence();
/* 295 */               oOloioIlI001IO000.I0000O = ollioll1l1o;
                    }
                }

                public static final void I00000oOI(boolean z, IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z2, IlliIl1l11O illiIl1l11O, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    O1ooiI111i o1ooiI111i2;
                    int i3;
                    boolean z3;
                    int i4;
                    long j3;
                    long j4;
                    int i5;
                    boolean z4;
                    long j5;
                    O1ooiI111i o1ooiI111i3;
                    long j6;
                    IOii1l iOii1l;
/* 1 */             boolean z5 = z;
/* 16 */            iloI0lOlll1.I00i0O(1015017965);
/* 28 */            int i6 = (iloI0lOlll1.I000O01llI0(z5) ? 4 : 2) | i;
/* 31 */            if ((i & 48) == 0) {
/* 44 */                i6 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 45 */            int i7 = i2 & 4;
/* 47 */            if (i7 != 0) {
/* 49 */                i3 = i6 | 384;
/* 51 */                o1ooiI111i2 = o1ooiI111i;
                    } else {
/* 54 */                o1ooiI111i2 = o1ooiI111i;
/* 67 */                i3 = i6 | (iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
                    }
/* 68 */            int i8 = i2 & 8;
/* 70 */            if (i8 != 0) {
/* 72 */                i4 = i3 | 3072;
/* 74 */                z3 = z2;
                    } else {
/* 77 */                z3 = z2;
/* 90 */                i4 = i3 | (iloI0lOlll1.I000O01llI0(z3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
                    }
/* 93 */            int i9 = i4 | 105578496;
/* 113 */           if (iloI0lOlll1.I00OIl(i9 & 1, (38347923 & i9) != 38347922)) {
/* 115 */               iloI0lOlll1.I00Ol00();
/* 123 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 144 */                   if (i7 != 0) {
/* 146 */                       o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                            }
/* 149 */                   if (i8 != 0) {
/* 151 */                       z3 = true;
                            }
/* 162 */                   i5 = i9 & (-33030145);
/* 163 */                   z4 = z3;
/* 160 */                   j5 = ((IOOiio0i) iloI0lOlll1.I000iOII(IOoIioIOoolI.I00000oIO)).I00000oIO;
/* 165 */                   o1ooiI111i3 = o1ooiI111i2;
/* 166 */                   j6 = j5;
                        } else {
/* 132 */                   iloI0lOlll1.I00OilO00Il();
/* 135 */                   i5 = i9 & (-33030145);
/* 136 */                   o1ooiI111i3 = o1ooiI111i2;
/* 137 */                   z4 = z3;
/* 138 */                   j6 = j;
/* 140 */                   j5 = j2;
                        }
/* 168 */               iloI0lOlll1.I0010o();
/* 171 */               if (illiIl1l11O == null) {
/* 176 */                   iloI0lOlll1.I00i01iIIliI(1830887765);
/* 179 */                   iloI0lOlll1.I0010I0i(false);
/* 182 */                   iOii1l = null;
                        } else {
/* 187 */                   iloI0lOlll1.I00i01iIIliI(1830887766);
/* 193 */                   I0ili1O00li i0ili1O00li = new I0ili1O00li(5);
/* 196 */                   i0ili1O00li.I00iiI = illiIl1l11O;
/* 198 */                   VarHandle.storeStoreFence();
/* 204 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1745256900, i0ili1O00li, iloI0lOlll1);
/* 208 */                   iloI0lOlll1.I0010I0i(false);
/* 211 */                   iOii1l = iOii1lI00000oOI;
                        }
/* 218 */               O1ooiI111i o1ooiI111iI00000oIO = iIoIo1lll0lI.I00000oIO(o1ooiI111i3, new IOiiOiIOII00(7));
/* 225 */               I0I0Oi i0I0Oi = new I0I0Oi(1);
/* 228 */               i0I0Oi.I00iiI = iOii1l;
/* 230 */               VarHandle.storeStoreFence();
/* 256 */               z5 = z;
/* 258 */               I00000oIO(z5, illOOo00lI, o1ooiI111iI00000oIO, z4, j6, j5, iiioOl1O.I00000oOI(-906085472, i0I0Oi, iloI0lOlll1), iloI0lOlll1, 1572864 | (i5 & 7168) | (i5 & 14) | 12582912 | (i5 & 112));
/* 261 */               j4 = j5;
/* 262 */               z3 = z4;
/* 263 */               j3 = j6;
/* 264 */               o1ooiI111i2 = o1ooiI111i3;
                    } else {
/* 266 */               iloI0lOlll1.I00OilO00Il();
/* 269 */               j3 = j;
/* 271 */               j4 = j2;
                    }
/* 273 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 277 */           if (oOloioIlI001IO000 != null) {
/* 281 */               OllioiIo01I ollioiIo01I = new OllioiIo01I();
/* 284 */               ollioiIo01I.I00iOIl = z5;
/* 286 */               ollioiIo01I.I00iiI = illOOo00lI;
/* 288 */               ollioiIo01I.I00iiO = o1ooiI111i2;
/* 290 */               ollioiIo01I.I00iio = z3;
/* 292 */               ollioiIo01I.I00ilI0I1 = illiIl1l11O;
/* 294 */               ollioiIo01I.I00ilO0 = j3;
/* 296 */               ollioiIo01I.I00io1l = j4;
/* 298 */               ollioiIo01I.I00ioIO = i;
/* 300 */               ollioiIo01I.I00l0I0l0lO1 = i2;
/* 302 */               VarHandle.storeStoreFence();
/* 305 */               oOloioIlI001IO000.I0000O = ollioiIo01I;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 1 */             II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 6 */             iloI0lOlll1.I00i0O(-1349901398);
/* 13 */            int i2 = 2;
/* 34 */            int i3 = i | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(null) ? 32 : 16);
/* 52 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 54 */                int i4 = i3 & 14;
/* 68 */                boolean z = ((i3 & 112) == 32) | (i4 == 4);
/* 69 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 73 */                if (!z) {
                            Object obj = objI00O0i0ii;
/* 77 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 81 */                        O100loO1 o100loO1 = new O100loO1(i2);
/* 84 */                        o100loO1.I00000oOI = illiIl1l11O;
/* 86 */                        VarHandle.storeStoreFence();
/* 89 */                        iloI0lOlll1.I00iio(o100loO1);
                                obj = o100loO1;
                            }
/* 92 */                    O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj;
/* 96 */                    int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 100 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 104 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 106 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 112 */                   IOl0oi0lOl1.I000lI.getClass();
/* 115 */                   iloI0lOlll1.I00i0oil();
/* 118 */                   boolean z2 = iloI0lOlll1.I00O10llo;
/* 120 */                   IllOOo00lI illOOo00lI = O0iiOioolIi.I01101IOlO;
/* 122 */                   if (z2) {
/* 124 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 128 */                       iloI0lOlll1.I00io1l();
                            }
/* 131 */                   IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 133 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10);
/* 136 */                   IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 138 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 141 */                   Integer numValueOf = Integer.valueOf(iHashCode);
/* 145 */                   IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 147 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 150 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 153 */                   IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 155 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 158 */                   if (illiIl1l11O != null) {
/* 163 */                       iloI0lOlll1.I00i01iIIliI(870361332);
/* 175 */                       O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(iIoIOo00o.I00000oOI(o1ooIo101ll, "text"), 16.0f, 0.0f, 2);
/* 179 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 185 */                       int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 189 */                       OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 193 */                       O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000O01llI0);
/* 197 */                       iloI0lOlll1.I00i0oil();
/* 202 */                       if (iloI0lOlll1.I00O10llo) {
/* 204 */                           iloI0lOlll1.I000l1(illOOo00lI);
                                } else {
/* 208 */                           iloI0lOlll1.I00io1l();
                                }
/* 211 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 214 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 217 */                       IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 220 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 227 */                       illiIl1l11O.invoke(iloI0lOlll1, Integer.valueOf(i4));
/* 230 */                       iloI0lOlll1.I0010I0i(true);
/* 233 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 240 */                       iloI0lOlll1.I00i01iIIliI(870466081);
/* 243 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 249 */                   iloI0lOlll1.I00i01iIIliI(870557345);
/* 252 */                   iloI0lOlll1.I0010I0i(false);
/* 255 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    } else {
/* 259 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 262 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 266 */           if (oOloioIlI001IO000 != null) {
/* 271 */               I0ili1O00li i0ili1O00li = new I0ili1O00li(6);
/* 274 */               i0ili1O00li.I00iiI = illiIl1l11O;
/* 276 */               VarHandle.storeStoreFence();
/* 279 */               oOloioIlI001IO000.I0000O = i0ili1O00li;
                    }
                }

                public static final void I0000O(long j, long j2, boolean z, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    boolean z2;
                    Object objI00olI;
                    boolean z3;
                    IlIoO1ilo1 ilIoO1ilo1I00000oOI;
/* 16 */            iloI0lOlll1.I00i0O(-833145221);
/* 22 */            if ((i & 6) == 0) {
/* 33 */                i2 = (iloI0lOlll1.I0001Ioi1lo(j) ? 4 : 2) | i;
                    } else {
/* 35 */                i2 = i;
                    }
/* 38 */            if ((i & 48) == 0) {
/* 51 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 32 : 16;
                    }
/* 54 */            if ((i & 384) == 0) {
/* 67 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            if ((i & 3072) == 0) {
/* 83 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 100 */           if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 106 */               int i3 = i2 >> 6;
/* 111 */               OoI1iOl0IoI ooI1iOl0IoII0001Ioi1lo = iO1IIloiOoiO.I0001Ioi1lo(Boolean.valueOf(z), null, iloI0lOlll1, i3 & 14, 2);
/* 115 */               I01O1lIi i01O1lIi = ooI1iOl0IoII0001Ioi1lo.I00000oIO;
/* 125 */               boolean zBooleanValue = ((Boolean) ooI1iOl0IoII0001Ioi1lo.I0000O.getValue()).booleanValue();
/* 132 */               iloI0lOlll1.I00i01iIIliI(-1069234984);
/* 140 */               long j3 = zBooleanValue ? j : j2;
/* 142 */               iloI0lOlll1.I0010I0i(false);
/* 145 */               Object objI0001Ioi1lo = IOOiio0i.I0001Ioi1lo(j3);
/* 149 */               boolean zI000II = iloI0lOlll1.I000II(objI0001Ioi1lo);
/* 153 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 157 */               Object obj = IOl11li.I00000oIO;
/* 159 */               if (zI000II || objI00O0i0ii == obj) {
/* 170 */                   objI00O0i0ii = Ooo0ii.I00000oIO(I10i1IOOol.I00l0I0l0lO1, new I10iOo0il1(objI0001Ioi1lo, 2));
/* 174 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 177 */               OoIoOiiO1 ooIoOiiO1 = (OoIoOiiO1) objI00O0i0ii;
/* 183 */               if (ooI1iOl0IoII0001Ioi1lo.I000OOo1O()) {
/* 244 */                   z2 = false;
/* 248 */                   iloI0lOlll1.I00i01iIIliI(1666827533);
/* 251 */                   iloI0lOlll1.I0010I0i(false);
/* 254 */                   objI00olI = i01O1lIi.I00olI();
                        } else {
/* 188 */                   iloI0lOlll1.I00i01iIIliI(1666573488);
/* 191 */                   boolean zI000II2 = iloI0lOlll1.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 195 */                   objI00olI = iloI0lOlll1.I00O0i0ii();
/* 199 */                   if (zI000II2 || objI00olI == obj) {
/* 206 */                       Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 217 */                       Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 218 */                       Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                                try {
/* 222 */                           Object objI00olI2 = i01O1lIi.I00olI();
/* 226 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 229 */                           iloI0lOlll1.I00iio(objI00olI2);
/* 232 */                           objI00olI = objI00olI2;
                                } catch (Throwable th) {
/* 240 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 243 */                           throw th;
                                }
                            }
/* 234 */                   iloI0lOlll1.I0010I0i(false);
/* 237 */                   z2 = false;
                        }
/* 260 */               boolean zBooleanValue2 = ((Boolean) objI00olI).booleanValue();
/* 267 */               iloI0lOlll1.I00i01iIIliI(-1069234984);
/* 274 */               long j4 = zBooleanValue2 ? j : j2;
/* 275 */               iloI0lOlll1.I0010I0i(z2);
/* 278 */               IOOiio0i iOOiio0iI00000oIO = IOOiio0i.I00000oIO(j4);
/* 282 */               boolean zI000II3 = iloI0lOlll1.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 286 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 290 */               if (zI000II3 || objI00O0i0ii2 == obj) {
/* 297 */                   IOI0iIo1o iOI0iIo1o = new IOI0iIo1o(4);
/* 300 */                   iOI0iIo1o.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 302 */                   VarHandle.storeStoreFence();
/* 305 */                   objI00O0i0ii2 = Ol1llolil.I00000oOI(iOI0iIo1o);
/* 309 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 320 */               boolean zBooleanValue3 = ((Boolean) ((OlO01l1oOil) objI00O0i0ii2).getValue()).booleanValue();
/* 327 */               iloI0lOlll1.I00i01iIIliI(-1069234984);
/* 335 */               long j5 = zBooleanValue3 ? j : j2;
/* 337 */               iloI0lOlll1.I0010I0i(false);
/* 340 */               IOOiio0i iOOiio0iI00000oIO2 = IOOiio0i.I00000oIO(j5);
/* 344 */               boolean zI000II4 = iloI0lOlll1.I000II(ooI1iOl0IoII0001Ioi1lo);
/* 348 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 352 */               if (zI000II4 || objI00O0i0ii3 == obj) {
/* 359 */                   IOI0iIo1o iOI0iIo1o2 = new IOI0iIo1o(5);
/* 362 */                   iOI0iIo1o2.I00iiI = ooI1iOl0IoII0001Ioi1lo;
/* 364 */                   VarHandle.storeStoreFence();
/* 367 */                   objI00O0i0ii3 = Ol1llolil.I00000oOI(iOI0iIo1o2);
/* 371 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 380 */               OoI1O01lI ooI1O01lI = (OoI1O01lI) ((OlO01l1oOil) objI00O0i0ii3).getValue();
/* 385 */               iloI0lOlll1.I00i01iIIliI(1058649156);
/* 396 */               if (ooI1O01lI.I0000O(Boolean.FALSE, Boolean.TRUE)) {
/* 401 */                   iloI0lOlll1.I00i01iIIliI(272207019);
/* 406 */                   ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iiO, iloI0lOlll1);
/* 410 */                   z3 = false;
/* 411 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 415 */                   z3 = false;
/* 419 */                   iloI0lOlll1.I00i01iIIliI(272326989);
/* 424 */                   ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 428 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 431 */               iloI0lOlll1.I0010I0i(z3);
/* 471 */               iiliio0o.I00000oIO(IOoIioIOoolI.I00000oIO.I00000oIO(IOOiio0i.I00000oIO(((IOOiio0i) iO1IIloiOoiO.I0000O(ooI1iOl0IoII0001Ioi1lo, iOOiio0iI00000oIO, iOOiio0iI00000oIO2, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll1, 0).I00l0OO0IO.getValue()).I00000oIO)), iOii1l, iloI0lOlll1, (i3 & 112) | 8);
                    } else {
/* 475 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 478 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 482 */           if (oOloioIlI001IO000 != null) {
/* 486 */               Olll00iI0iO olll00iI0iO = new Olll00iI0iO();
/* 489 */               olll00iI0iO.I00iOIl = j;
/* 491 */               olll00iI0iO.I00iiI = j2;
/* 493 */               olll00iI0iO.I00iiO = z;
/* 495 */               olll00iI0iO.I00iio = iOii1l;
/* 497 */               olll00iI0iO.I00ilI0I1 = i;
/* 499 */               VarHandle.storeStoreFence();
/* 502 */               oOloioIlI001IO000.I0000O = olll00iI0iO;
                    }
                }
            }
