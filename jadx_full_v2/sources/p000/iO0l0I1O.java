            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0l0I1O {
                public static final void I00000oIO(String str, O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, long j, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
/* 16 */            iloI0lOlll1.I00i0O(-2078815310);
/* 21 */            int i3 = 4;
/* 22 */            if ((i & 6) == 0) {
/* 33 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 35 */                i2 = i;
                    }
/* 36 */            int i4 = i2 | 48;
/* 42 */            if ((i & 384) == 0) {
/* 54 */                i4 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 256 : Barcode.FORMAT_ITF;
                    }
/* 57 */            if ((i & 3072) == 0) {
/* 70 */                i4 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 73 */            if ((i & 24576) == 0) {
/* 86 */                i4 |= iloI0lOlll1.I0001Ioi1lo(j) ? 16384 : 8192;
                    }
/* 91 */            int i5 = 0;
/* 103 */           if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 9363) != 9362)) {
/* 105 */               iloI0lOlll1.I00Ol00();
/* 108 */               int i6 = i & 1;
/* 110 */               O1ooiI111i o1ooiI111iI00000oOI = O1ooIo101ll.I00000oIO;
/* 112 */               if (i6 == 0 || iloI0lOlll1.I001lloI()) {
/* 127 */                   o1ooiI111i2 = o1ooiI111iI00000oOI;
                        } else {
/* 121 */                   iloI0lOlll1.I00OilO00Il();
/* 124 */                   o1ooiI111i2 = o1ooiI111i;
                        }
/* 128 */               iloI0lOlll1.I0010o();
/* 135 */               if (j != 16) {
/* 140 */                   iloI0lOlll1.I00i01iIIliI(-853219337);
/* 143 */                   Object obj = IOl11li.I00000oIO;
/* 145 */                   if (illOOo00lI != null) {
/* 150 */                       iloI0lOlll1.I00i01iIIliI(-853120974);
/* 153 */                       int i7 = i4 & 896;
/* 160 */                       boolean z = i7 == 256;
/* 162 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj2 = objI00O0i0ii;
/* 166 */                       if (z || objI00O0i0ii == obj) {
/* 172 */                           I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(i3);
/* 175 */                           i0o1Oi0IO1.I00000oOI = illOOo00lI;
/* 177 */                           VarHandle.storeStoreFence();
/* 180 */                           iloI0lOlll1.I00iio(i0o1Oi0IO1);
                                    obj2 = i0o1Oi0IO1;
                                }
/* 185 */                       O1ooiI111i o1ooiI111iI00000oIO = Oll10I.I00000oIO(o1ooiI111iI00000oOI, illOOo00lI, (PointerInputEventHandler) obj2);
/* 201 */                       boolean z2 = ((i4 & 14) == 4) | (i7 == 256);
/* 202 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii2;
/* 206 */                       if (z2 || objI00O0i0ii2 == obj) {
/* 212 */                           OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(i5);
/* 215 */                           oiOi011iI1ol.I00iiI = str;
/* 217 */                           oiOi011iI1ol.I00iiO = illOOo00lI;
/* 219 */                           VarHandle.storeStoreFence();
/* 222 */                           iloI0lOlll1.I00iio(oiOi011iI1ol);
                                    obj3 = oiOi011iI1ol;
                                }
/* 228 */                       o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO, true, (Function1) obj3);
/* 232 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 239 */                       iloI0lOlll1.I00i01iIIliI(-852623672);
/* 242 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 251 */                   O1ooiI111i o1ooiI111iI0000O = o1ooiI111i2.I0000O(Ol0iOOO0.I0000Il00O).I0000O(o1ooiI111iI00000oOI);
/* 287 */                   boolean z3 = ((i4 & 7168) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && iloI0lOlll1.I0001Ioi1lo(j)) || (i4 & 24576) == 16384);
/* 288 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii3;
/* 292 */                   if (z3 || objI00O0i0ii3 == obj) {
/* 299 */                       O0lOli0Il o0lOli0Il = new O0lOli0Il(1);
/* 302 */                       o0lOli0Il.I00iiI = j;
/* 304 */                       o0lOli0Il.I00iiO = illOOo00lI2;
/* 306 */                       VarHandle.storeStoreFence();
/* 309 */                       iloI0lOlll1.I00iio(o0lOli0Il);
                                obj4 = o0lOli0Il;
                            }
/* 314 */                   iOl0ilO1.I00000oIO(o1ooiI111iI0000O, (Function1) obj4, iloI0lOlll1, 0);
/* 317 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 324 */                   iloI0lOlll1.I00i01iIIliI(-852426512);
/* 327 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    } else {
/* 331 */               iloI0lOlll1.I00OilO00Il();
/* 334 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 336 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 340 */           if (oOloioIlI001IO000 != null) {
/* 344 */               OiOi0I0io oiOi0I0io = new OiOi0I0io();
/* 347 */               oiOi0I0io.I00iOIl = str;
/* 349 */               oiOi0I0io.I00iiI = o1ooiI111i2;
/* 351 */               oiOi0I0io.I00iiO = illOOo00lI;
/* 353 */               oiOi0I0io.I00iio = illOOo00lI2;
/* 355 */               oiOi0I0io.I00ilI0I1 = j;
/* 357 */               oiOi0I0io.I00ilO0 = i;
/* 359 */               VarHandle.storeStoreFence();
/* 362 */               oOloioIlI001IO000.I0000O = oiOi0I0io;
                    }
                }
            }
