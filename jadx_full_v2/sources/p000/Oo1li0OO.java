            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Oo1li0OO {
                public static final OIo1i1 I00000oIO = new OIo1i1(8.0f, 4.0f, 8.0f, 4.0f);

                public static final void I00000oIO(Oo1lliO oo1lliO, O1ooiI111i o1ooiI111i, float f, OioOIi1o0I oioOIi1o0I, long j, long j2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 11 */            long j3 = j2;
/* 22 */            iloI0lOlll1.I00i0O(-343758958);
/* 27 */            if ((i & 6) == 0) {
/* 47 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oo1lliO) : iloI0lOlll1.I000OOo1O(oo1lliO) ? 4 : 2) | i;
                    } else {
/* 49 */                i2 = i;
                    }
/* 52 */            if ((i & 48) == 0) {
/* 65 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 68 */            if ((i & 384) == 0) {
/* 82 */                i2 |= iloI0lOlll1.I000II(null) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 85 */            if ((i & 3072) == 0) {
/* 98 */                i2 |= iloI0lOlll1.I0000O(f) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 101 */           if ((i & 24576) == 0) {
/* 114 */               i2 |= iloI0lOlll1.I000II(oioOIi1o0I) ? 16384 : 8192;
                    }
/* 118 */           if ((196608 & i) == 0) {
/* 131 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? 131072 : 65536;
                    }
/* 135 */           if ((1572864 & i) == 0) {
/* 148 */               i2 |= iloI0lOlll1.I0001Ioi1lo(j3) ? 1048576 : 524288;
                    }
/* 154 */           if ((i & 12582912) == 0) {
/* 167 */               i2 |= iloI0lOlll1.I0000O(0.0f) ? 8388608 : 4194304;
                    }
/* 171 */           if ((100663296 & i) == 0) {
/* 184 */               i2 |= iloI0lOlll1.I0000O(0.0f) ? 67108864 : 33554432;
                    }
/* 188 */           if ((805306368 & i) == 0) {
/* 201 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 536870912 : 268435456;
                    }
/* 221 */           if (iloI0lOlll1.I00OIl(i2 & 1, (306783379 & i2) != 306783378)) {
/* 223 */               iloI0lOlll1.I00Ol00();
/* 228 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 237 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 240 */               iloI0lOlll1.I0010o();
/* 246 */               iloI0lOlll1.I00i01iIIliI(-1719803223);
/* 249 */               iloI0lOlll1.I0010I0i(false);
/* 254 */               Oo1lI1l1I0Oi oo1lI1l1I0Oi = new Oo1lI1l1I0Oi();
/* 257 */               oo1lI1l1I0Oi.I00iOIl = f;
/* 259 */               oo1lI1l1I0Oi.I00iiI = j;
/* 261 */               oo1lI1l1I0Oi.I00iiO = iOii1l;
/* 263 */               VarHandle.storeStoreFence();
/* 277 */               int i3 = 12582912 | ((i2 >> 12) & 896);
/* 278 */               int i4 = i2 >> 9;
/* 299 */               OlioioOl0O.I00000oIO(o1ooiI111i, oioOIi1o0I, j2, 0L, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(-1573998995, oo1lI1l1I0Oi, iloI0lOlll1), iloI0lOlll1, i3 | (57344 & i4) | (i4 & 458752), 72);
/* 302 */               j3 = j2;
                    } else {
/* 304 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 307 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 311 */           if (oOloioIlI001IO000 != null) {
/* 315 */               Oo1lO0 oo1lO0 = new Oo1lO0();
/* 318 */               oo1lO0.I00iOIl = oo1lliO;
/* 320 */               oo1lO0.I00iiI = o1ooiI111i;
/* 322 */               oo1lO0.I00iiO = f;
/* 324 */               oo1lO0.I00iio = oioOIi1o0I;
/* 328 */               oo1lO0.I00ilI0I1 = j;
/* 330 */               oo1lO0.I00ilO0 = j3;
/* 332 */               oo1lO0.I00io1l = iOii1l;
/* 336 */               oo1lO0.I00ioIO = i;
/* 338 */               VarHandle.storeStoreFence();
/* 341 */               oOloioIlI001IO000.I0000O = oo1lO0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(Oo1lliO oo1lliO, String str, O1ooiI111i o1ooiI111i, float f, OioOIi1o0I oioOIi1o0I, long j, long j2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
                    float f2;
                    OioOIi1o0I oioOIi1o0I2;
                    long j3;
                    long j4;
                    float f3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    int i3;
                    long jI0000oI00;
                    long j5;
/* 12 */            iloI0lOlll1.I00i0O(1931523930);
/* 18 */            if ((i & 6) == 0) {
/* 38 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oo1lliO) : iloI0lOlll1.I000OOo1O(oo1lliO) ? 4 : 2) | i;
                    } else {
/* 40 */                i2 = i;
                    }
/* 45 */            if ((i & 48) == 0) {
/* 57 */                i2 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 58 */            int i4 = i2 | 28032;
/* 63 */            if ((196608 & i) == 0) {
/* 68 */                i4 = 93568 | i2;
                    }
/* 72 */            if ((1572864 & i) == 0) {
/* 76 */                i4 |= 524288;
                    }
/* 80 */            if ((12582912 & i) == 0) {
/* 84 */                i4 |= 4194304;
                    }
/* 87 */            int i5 = 905969664 | i4;
/* 108 */           if (iloI0lOlll1.I00OIl(i5 & 1, (306783379 & i5) != 306783378)) {
/* 110 */               iloI0lOlll1.I00Ol00();
/* 113 */               int i6 = i & 1;
/* 115 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 120 */               if (i6 == 0 || iloI0lOlll1.I001lloI()) {
/* 144 */                   f3 = Oo1l1iOllo.I00000oIO;
/* 148 */                   oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(OO1I0Oiio1l.I00000oOI, iloI0lOlll1);
/* 154 */                   long jI0000oI002 = IOOl0iiliOl.I0000oI00(OO1I0Oiio1l.I0000Il00O, iloI0lOlll1);
/* 164 */                   i3 = i5 & (-33488897);
/* 160 */                   jI0000oI00 = IOOl0iiliOl.I0000oI00(OO1I0Oiio1l.I00000oIO, iloI0lOlll1);
/* 167 */                   j5 = jI0000oI002;
/* 168 */                   o1ooiI111i2 = o1ooIo101ll;
                        } else {
/* 129 */                   iloI0lOlll1.I00OilO00Il();
/* 132 */                   i3 = i5 & (-33488897);
/* 133 */                   o1ooiI111i2 = o1ooiI111i;
/* 135 */                   f3 = f;
/* 137 */                   oioOIi1o0II00000oOI = oioOIi1o0I;
/* 139 */                   j5 = j;
/* 141 */                   jI0000oI00 = j2;
                        }
/* 169 */               iloI0lOlll1.I0010o();
/* 174 */               boolean z = (i3 & 112) == 32;
/* 178 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 182 */               if (!z) {
                            Object obj = objI00O0i0ii;
/* 186 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 190 */                       OlOoOOIIi olOoOOIIi = new OlOoOOIIi(4);
/* 193 */                       olOoOOIIi.I00iiI = str;
/* 195 */                       VarHandle.storeStoreFence();
/* 198 */                       iloI0lOlll1.I00iio(olOoOOIIi);
                                obj = olOoOOIIi;
                            }
/* 207 */                   O1ooiI111i o1ooiI111iI0000O = OiioloIlOlIi.I00000oOI(o1ooIo101ll, false, (Function1) obj).I0000O(o1ooiI111i2);
/* 211 */                   int i7 = i3 & 14;
/* 213 */                   int i8 = i3 >> 3;
/* 231 */                   int i9 = (i8 & 234881024) | i7 | (i8 & 896) | (i8 & 7168) | (29360128 & i8) | 805306368;
/* 235 */                   f2 = f3;
/* 236 */                   oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 239 */                   j3 = j5;
/* 240 */                   j4 = jI0000oI00;
/* 242 */                   I00000oIO(oo1lliO, o1ooiI111iI0000O, f2, oioOIi1o0I2, j3, j4, iOii1l, iloI0lOlll1, i9);
                        }
                    } else {
/* 246 */               iloI0lOlll1.I00OilO00Il();
/* 249 */               o1ooiI111i2 = o1ooiI111i;
/* 251 */               f2 = f;
/* 253 */               oioOIi1o0I2 = oioOIi1o0I;
/* 255 */               j3 = j;
/* 257 */               j4 = j2;
                    }
/* 259 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 263 */           if (oOloioIlI001IO000 != null) {
/* 267 */               Oo1lOoii0I oo1lOoii0I = new Oo1lOoii0I();
/* 270 */               oo1lOoii0I.I00iOIl = oo1lliO;
/* 272 */               oo1lOoii0I.I00iiI = str;
/* 274 */               oo1lOoii0I.I00iiO = o1ooiI111i2;
/* 276 */               oo1lOoii0I.I00iio = f2;
/* 278 */               oo1lOoii0I.I00ilI0I1 = oioOIi1o0I2;
/* 280 */               oo1lOoii0I.I00ilO0 = j3;
/* 282 */               oo1lOoii0I.I00io1l = j4;
/* 286 */               oo1lOoii0I.I00ioIO = iOii1l;
/* 288 */               oo1lOoii0I.I00l0I0l0lO1 = i;
/* 290 */               VarHandle.storeStoreFence();
/* 293 */               oOloioIlI001IO000.I0000O = oo1lOoii0I;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:141:0x0342  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x0351  */
                /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(OO1ll1 oO1ll1, IOii1l iOii1l, Oo1o1iil oo1o1iil, O1ooiI111i o1ooiI111i, boolean z, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    boolean z2;
                    OOloioIl oOloioIlI001IO000;
                    Object objI00olI;
                    IOii1l iOii1l2;
                    Object obj;
                    boolean z3;
                    Object objI00olI2;
                    Ol1il1o1 ol1il1o1I000OOo1O;
                    Function1 function1I0000oI00;
                    Ol1il1o1 ol1il1o1I000iOII;
/* 1 */             OO1ll1 oO1ll12 = oO1ll1;
/* 5 */             Oo1o1iil oo1o1iil2 = oo1o1iil;
/* 16 */            iloI0lOlll1.I00i0O(-293753984);
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i3 = (iloI0lOlll1.I000II(oO1ll12) ? 4 : 2) | i;
                    } else {
/* 34 */                i3 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 75 */                i3 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll1.I000II(oo1o1iil2) : iloI0lOlll1.I000OOo1O(oo1o1iil2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 76 */            int i8 = i2 & 8;
/* 78 */            if (i8 == 0) {
/* 87 */                if ((i & 3072) == 0) {
/* 89 */                    o1ooiI111i2 = o1ooiI111i;
/* 102 */                   i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 106 */               i4 = i3 | 14376960;
/* 110 */               if ((100663296 & i) == 0) {
/* 123 */                   i4 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 67108864 : 33554432;
                        }
/* 131 */               int i9 = 1;
/* 144 */               if (iloI0lOlll1.I00OIl(i4 & 1, (38347923 & i4) == 38347922)) {
/* 835 */                   i5 = i2;
/* 837 */                   i6 = i;
/* 838 */                   i7 = 2;
/* 839 */                   iloI0lOlll1.I00OilO00Il();
/* 842 */                   z2 = z;
                        } else {
/* 151 */                   O1ooiI111i o1ooiI111i3 = i8 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 158 */                   OoI1Oi0l1I0o ooI1Oi0l1I0oI0000oI00 = iO1IIloiOoiO.I0000oI00(oo1o1iil2.I00000oOI, "tooltip transition", iloI0lOlll1, 48, 0);
/* 162 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 168 */                   Object obj2 = IOl11li.I00000oIO;
/* 170 */                   if (objI00O0i0ii == obj2) {
/* 172 */                       objI00O0i0ii = lOO00IiI0li.I00000oIO(null);
/* 176 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 179 */                   OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 181 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 185 */                   if (objI00O0i0ii2 == obj2) {
/* 189 */                       objI00O0i0ii2 = new Oo1lliO();
/* 192 */                       VarHandle.storeStoreFence();
/* 195 */                       iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 198 */                   Oo1lliO oo1lliO = (Oo1lliO) objI00O0i0ii2;
/* 202 */                   O110Io1OoiO o110Io1OoiO = new O110Io1OoiO(i9);
/* 205 */                   o110Io1OoiO.I00iiI = oI10i0Il;
/* 207 */                   o110Io1OoiO.I00iiO = illiIl1l11O;
/* 209 */                   VarHandle.storeStoreFence();
/* 215 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-23901870, o110Io1OoiO, iloI0lOlll1);
/* 219 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 223 */                   if (objI00O0i0ii3 == obj2) {
/* 225 */                       objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 229 */                       iloI0lOlll1.I00iio(objI00O0i0ii3);
                            }
/* 232 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 234 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 238 */                   if (objI00O0i0ii4 == obj2) {
/* 244 */                       I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(25);
/* 247 */                       i0IlOO10Ii1.I00iiI = oI10i0Il;
/* 249 */                       i0IlOO10Ii1.I00iiO = oI10i0Il2;
/* 251 */                       VarHandle.storeStoreFence();
/* 254 */                       objI00O0i0ii4 = Ol1llolil.I00000oOI(i0IlOO10Ii1);
/* 258 */                       iloI0lOlll1.I00iio(objI00O0i0ii4);
                            }
/* 261 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii4;
/* 265 */                   IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iiI, iloI0lOlll1);
/* 271 */                   IlIoO1ilo1 ilIoO1ilo1I00000oOI2 = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 275 */                   OoIoOiiO1 ooIoOiiO1 = Ooo0ii.I00000oIO;
/* 277 */                   boolean zI000OOo1O = ooI1Oi0l1I0oI0000oI00.I000OOo1O();
/* 283 */                   I01O1lIi i01O1lIi = ooI1Oi0l1I0oI0000oI00.I00000oIO;
/* 290 */                   if (zI000OOo1O) {
/* 357 */                       iloI0lOlll1.I00i01iIIliI(1666827533);
/* 360 */                       iloI0lOlll1.I0010I0i(false);
/* 363 */                       objI00olI = i01O1lIi.I00olI();
                            } else {
/* 292 */                       iloI0lOlll1.I00i01iIIliI(1666573488);
/* 295 */                       boolean zI000II = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 299 */                       objI00olI = iloI0lOlll1.I00O0i0ii();
/* 303 */                       if (zI000II || objI00olI == obj2) {
/* 310 */                           Ol1il1o1 ol1il1o1I000OOo1O2 = iOl0lOIi11.I000OOo1O();
/* 323 */                           Function1 function1I0000oI002 = ol1il1o1I000OOo1O2 != null ? ol1il1o1I000OOo1O2.I0000oI00() : null;
/* 325 */                           Ol1il1o1 ol1il1o1I000iOII2 = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O2);
                                    try {
/* 329 */                               Object objI00olI3 = i01O1lIi.I00olI();
/* 333 */                               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O2, ol1il1o1I000iOII2, function1I0000oI002);
/* 336 */                               iloI0lOlll1.I00iio(objI00olI3);
/* 339 */                               objI00olI = objI00olI3;
                                    } catch (Throwable th) {
/* 349 */                               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O2, ol1il1o1I000iOII2, function1I0000oI002);
/* 352 */                               throw th;
                                    }
                                }
/* 341 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 369 */                   boolean zBooleanValue = ((Boolean) objI00olI).booleanValue();
/* 376 */                   iloI0lOlll1.I00i01iIIliI(838300572);
/* 387 */                   float f = zBooleanValue ? 1.0f : 0.8f;
/* 391 */                   iloI0lOlll1.I0010I0i(false);
/* 394 */                   Float fValueOf = Float.valueOf(f);
/* 398 */                   boolean zI000II2 = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 402 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 406 */                   if (zI000II2 || objI00O0i0ii5 == obj2) {
/* 413 */                       O1iolI00olI o1iolI00olI = new O1iolI00olI(4);
/* 416 */                       o1iolI00olI.I00iiI = ooI1Oi0l1I0oI0000oI00;
/* 418 */                       VarHandle.storeStoreFence();
/* 421 */                       objI00O0i0ii5 = Ol1llolil.I00000oOI(o1iolI00olI);
/* 425 */                       iloI0lOlll1.I00iio(objI00O0i0ii5);
                            }
/* 436 */                   boolean zBooleanValue2 = ((Boolean) ((OlO01l1oOil) objI00O0i0ii5).getValue()).booleanValue();
/* 440 */                   iloI0lOlll1.I00i01iIIliI(838300572);
/* 449 */                   float f2 = zBooleanValue2 ? 1.0f : 0.8f;
/* 453 */                   iloI0lOlll1.I0010I0i(false);
/* 456 */                   Float fValueOf2 = Float.valueOf(f2);
/* 460 */                   boolean zI000II3 = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 464 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 468 */                   if (zI000II3 || objI00O0i0ii6 == obj2) {
/* 475 */                       O1iolI00olI o1iolI00olI2 = new O1iolI00olI(5);
/* 478 */                       o1iolI00olI2.I00iiI = ooI1Oi0l1I0oI0000oI00;
/* 480 */                       VarHandle.storeStoreFence();
/* 483 */                       objI00O0i0ii6 = Ol1llolil.I00000oOI(o1iolI00olI2);
/* 487 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            }
/* 501 */                   iloI0lOlll1.I00i01iIIliI(-1664496585);
/* 505 */                   iloI0lOlll1.I0010I0i(false);
/* 523 */                   OoI1O1OIoI ooI1O1OIoII0000O = iO1IIloiOoiO.I0000O(ooI1Oi0l1I0oI0000oI00, fValueOf, fValueOf2, ilIoO1ilo1I00000oOI, ooIoOiiO1, iloI0lOlll1, 196608);
/* 531 */                   if (ooI1Oi0l1I0oI0000oI00.I000OOo1O()) {
/* 596 */                       iOii1l2 = iOii1lI00000oOI;
/* 598 */                       obj = obj2;
/* 600 */                       z3 = false;
/* 604 */                       iloI0lOlll1.I00i01iIIliI(1666827533);
/* 607 */                       iloI0lOlll1.I0010I0i(false);
/* 610 */                       objI00olI2 = i01O1lIi.I00olI();
                            } else {
/* 533 */                       iloI0lOlll1.I00i01iIIliI(1666573488);
/* 536 */                       boolean zI000II4 = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 540 */                       objI00olI2 = iloI0lOlll1.I00O0i0ii();
                                try {
/* 544 */                           if (zI000II4) {
/* 555 */                               obj = obj2;
                                    } else {
/* 546 */                               obj = obj2;
/* 548 */                               if (objI00olI2 != obj) {
/* 551 */                                   iOii1l2 = iOii1lI00000oOI;
                                        }
/* 553 */                               z3 = false;
/* 587 */                               iloI0lOlll1.I0010I0i(false);
                                    }
/* 575 */                           Object objI00olI4 = i01O1lIi.I00olI();
/* 579 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 582 */                           iloI0lOlll1.I00iio(objI00olI4);
/* 585 */                           objI00olI2 = objI00olI4;
/* 553 */                           z3 = false;
/* 587 */                           iloI0lOlll1.I0010I0i(false);
                                } catch (Throwable th2) {
/* 592 */                           iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 595 */                           throw th2;
                                }
/* 557 */                       ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 563 */                       function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 569 */                       ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
/* 573 */                       iOii1l2 = iOii1lI00000oOI;
                            }
/* 616 */                   boolean zBooleanValue3 = ((Boolean) objI00olI2).booleanValue();
/* 623 */                   iloI0lOlll1.I00i01iIIliI(-1903393104);
/* 631 */                   float f3 = zBooleanValue3 ? 1.0f : 0.0f;
/* 632 */                   iloI0lOlll1.I0010I0i(z3);
/* 635 */                   Float fValueOf3 = Float.valueOf(f3);
/* 639 */                   boolean zI000II5 = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 643 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 648 */                   if (zI000II5 || objI00O0i0ii7 == obj) {
/* 654 */                       O1iolI00olI o1iolI00olI3 = new O1iolI00olI(6);
/* 657 */                       o1iolI00olI3.I00iiI = ooI1Oi0l1I0oI0000oI00;
/* 659 */                       VarHandle.storeStoreFence();
/* 662 */                       objI00O0i0ii7 = Ol1llolil.I00000oOI(o1iolI00olI3);
/* 666 */                       iloI0lOlll1.I00iio(objI00O0i0ii7);
                            }
/* 677 */                   boolean zBooleanValue4 = ((Boolean) ((OlO01l1oOil) objI00O0i0ii7).getValue()).booleanValue();
/* 681 */                   iloI0lOlll1.I00i01iIIliI(-1903393104);
/* 684 */                   float f4 = zBooleanValue4 ? 1.0f : 0.0f;
/* 691 */                   iloI0lOlll1.I0010I0i(false);
/* 694 */                   Float fValueOf4 = Float.valueOf(f4);
/* 698 */                   boolean zI000II6 = iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 702 */                   Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 706 */                   if (zI000II6 || objI00O0i0ii8 == obj) {
/* 713 */                       O1iolI00olI o1iolI00olI4 = new O1iolI00olI(7);
/* 716 */                       o1iolI00olI4.I00iiI = ooI1Oi0l1I0oI0000oI00;
/* 718 */                       VarHandle.storeStoreFence();
/* 721 */                       objI00O0i0ii8 = Ol1llolil.I00000oOI(o1iolI00olI4);
/* 725 */                       iloI0lOlll1.I00iio(objI00O0i0ii8);
                            }
/* 739 */                   iloI0lOlll1.I00i01iIIliI(-111222965);
/* 743 */                   iloI0lOlll1.I0010I0i(false);
/* 753 */                   OoI1O1OIoI ooI1O1OIoII0000O2 = iO1IIloiOoiO.I0000O(ooI1Oi0l1I0oI0000oI00, fValueOf3, fValueOf4, ilIoO1ilo1I00000oOI2, ooIoOiiO1, iloI0lOlll1, 196608);
/* 760 */                   O1i0oIO o1i0oIO = new O1i0oIO(6);
/* 763 */                   o1i0oIO.I00ilI0I1 = oI10i0Il2;
/* 765 */                   o1i0oIO.I00iiI = ooI1O1OIoII0000O;
/* 767 */                   o1i0oIO.I00iiO = ooI1O1OIoII0000O2;
/* 769 */                   o1i0oIO.I00iio = olO01l1oOil;
/* 771 */                   o1i0oIO.I00ilO0 = iOii1l;
/* 773 */                   o1i0oIO.I00io1l = oo1lliO;
/* 775 */                   VarHandle.storeStoreFence();
/* 813 */                   int i10 = (i4 & 14) | 100663344 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4);
/* 814 */                   oo1o1iil2 = oo1o1iil;
/* 816 */                   i6 = i;
/* 818 */                   i5 = i2;
/* 820 */                   O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 824 */                   i7 = 2;
/* 826 */                   oO1ll12 = oO1ll1;
/* 828 */                   iOOoI10.I00000oIO(oO1ll12, iiioOl1O.I00000oOI(-527401546, o1i0oIO, iloI0lOlll1), oo1o1iil2, o1ooiI111i4, iOii1l2, iloI0lOlll1, i10);
/* 831 */                   o1ooiI111i2 = o1ooiI111i4;
/* 832 */                   z2 = true;
                        }
/* 844 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 848 */               if (oOloioIlI001IO000 == null) {
/* 852 */                   II011lO11Io iI011lO11Io = new II011lO11Io(i7);
/* 855 */                   iI011lO11Io.I00ilO0 = oO1ll12;
/* 857 */                   iI011lO11Io.I00io1l = iOii1l;
/* 859 */                   iI011lO11Io.I00ioIO = oo1o1iil2;
/* 861 */                   iI011lO11Io.I00iiI = o1ooiI111i2;
/* 863 */                   iI011lO11Io.I00iiO = z2;
/* 865 */                   iI011lO11Io.I00l0I0l0lO1 = illiIl1l11O;
/* 867 */                   iI011lO11Io.I00iio = i6;
/* 869 */                   iI011lO11Io.I00ilI0I1 = i5;
/* 871 */                   VarHandle.storeStoreFence();
/* 874 */                   oOloioIlI001IO000.I0000O = iI011lO11Io;
/* 1821 */                  return;
                        }
/* 1821 */              return;
                    }
/* 80 */            i3 |= 3072;
/* 82 */            o1ooiI111i2 = o1ooiI111i;
/* 106 */           i4 = i3 | 14376960;
/* 110 */           if ((100663296 & i) == 0) {
                    }
/* 131 */           int i92 = 1;
/* 144 */           if (iloI0lOlll1.I00OIl(i4 & 1, (38347923 & i4) == 38347922)) {
                    }
/* 844 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 848 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Oo1o1iil I0000O(IloI0lOlll1 iloI0lOlll1) {
                    Object obj;
/* 1 */             OI11IlOoi oI11IlOoi = I1olll0O.I00000oIO;
/* 12 */            boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(false) | iloI0lOlll1.I000II(oI11IlOoi);
/* 13 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 17 */            if (!zI000O01llI0) {
                        obj = objI00O0i0ii;
/* 21 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 25 */                    Oo1o1iil oo1o1iil = new Oo1o1iil();
/* 28 */                    oo1o1iil.I00000oIO = oI11IlOoi;
/* 39 */                    oo1o1iil.I00000oOI = new OI10ooOi(false);
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    iloI0lOlll1.I00iio(oo1o1iil);
                            obj = oo1o1iil;
                        }
                    }
/* 47 */            return (Oo1o1iil) obj;
                }
            }
