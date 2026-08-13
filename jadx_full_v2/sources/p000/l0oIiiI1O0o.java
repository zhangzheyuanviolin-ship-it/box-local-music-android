            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l0oIiiI1O0o {
                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, O0o0I1i0O o0o0I1i0O, OIo1Oi1l1lI oIo1Oi1l1lI, I1IioI1l10 i1IioI1l10, I0iol11I1OI i0iol11I1OI, IlOIll0o11Ii ilOIll0o11Ii, boolean z, I0o1iIoolIi i0o1iIoolIi, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    O1ooiI111i o1ooiI111i2;
                    int i3;
                    O0o0I1i0O o0o0I1i0OI00000oIO;
                    OIo1Oi1l1lI oIo1i1;
                    I1IioI1l10 i1IioI1l102;
                    int i4;
                    I0iol11I1OI i0iol11I1OI2;
                    boolean z2;
                    I0o1iIoolIi i0o1iIoolIi2;
                    O1ooiI111i o1ooiI111i3;
                    IlOIll0o11Ii ilOIll0o11Ii2;
                    OOloioIl oOloioIlI001IO000;
                    O1ooiI111i o1ooiI111i4;
                    IlOIll0o11Ii ilOIll0o11Ii3;
                    I0iol11I1OI i0iol11I1OI3;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    I0o1iIoolIi i0o1iIoolIiI00000oOI;
                    I1IioI1l10 i1IioI1l103;
                    int i5;
                    boolean z3;
/* 10 */            iloI0lOlll1.I00i0O(53695811);
/* 13 */            int i6 = i2 & 1;
/* 15 */            if (i6 != 0) {
/* 17 */                i3 = i | 6;
/* 20 */                o1ooiI111i2 = o1ooiI111i;
                    } else if ((i & 6) == 0) {
/* 27 */                o1ooiI111i2 = o1ooiI111i;
/* 38 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i2) ? 4 : 2) | i;
                    } else {
/* 40 */                o1ooiI111i2 = o1ooiI111i;
/* 42 */                i3 = i;
                    }
/* 45 */            if ((i & 48) == 0) {
/* 49 */                if ((i2 & 2) == 0) {
/* 51 */                    o0o0I1i0OI00000oIO = o0o0I1i0O;
/* 57 */                    int i7 = iloI0lOlll1.I000II(o0o0I1i0OI00000oIO) ? 32 : 16;
/* 66 */                    i3 |= i7;
                        } else {
/* 62 */                    o0o0I1i0OI00000oIO = o0o0I1i0O;
                        }
/* 66 */                i3 |= i7;
                    } else {
/* 68 */                o0o0I1i0OI00000oIO = o0o0I1i0O;
                    }
/* 70 */            int i8 = i2 & 4;
/* 72 */            if (i8 == 0) {
/* 81 */                if ((i & 384) == 0) {
/* 83 */                    oIo1i1 = oIo1Oi1l1lI;
/* 96 */                    i3 |= iloI0lOlll1.I000II(oIo1i1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 97 */                int i9 = i3 | 3072;
/* 101 */               if ((i & 24576) != 0) {
/* 105 */                   if ((i2 & 16) == 0) {
/* 107 */                       i1IioI1l102 = i1IioI1l10;
/* 113 */                       int i10 = iloI0lOlll1.I000II(i1IioI1l102) ? 16384 : 8192;
/* 122 */                       i9 |= i10;
                            } else {
/* 118 */                       i1IioI1l102 = i1IioI1l10;
                            }
/* 122 */                   i9 |= i10;
                        } else {
/* 124 */                   i1IioI1l102 = i1IioI1l10;
                        }
/* 128 */               int i11 = 196608 | i9;
/* 132 */               if ((1572864 & i) == 0) {
/* 136 */                   i11 = 720896 | i9;
                        }
/* 139 */               i4 = 12582912 | i11;
/* 143 */               if ((100663296 & i) == 0) {
/* 147 */                   i4 = 46137344 | i11;
                        }
/* 151 */               if ((805306368 & i) == 0) {
/* 164 */                   i4 |= iloI0lOlll1.I000OOo1O(function1) ? 536870912 : 268435456;
                        }
/* 184 */               if (iloI0lOlll1.I00OIl(i4 & 1, (306783379 & i4) == 306783378)) {
/* 370 */                   iloI0lOlll1.I00OilO00Il();
/* 373 */                   i0iol11I1OI2 = i0iol11I1OI;
/* 375 */                   z2 = z;
/* 377 */                   i0o1iIoolIi2 = i0o1iIoolIi;
/* 379 */                   o1ooiI111i3 = o1ooiI111i2;
/* 380 */                   ilOIll0o11Ii2 = ilOIll0o11Ii;
                        } else {
/* 186 */                   iloI0lOlll1.I00Ol00();
/* 197 */                   if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 240 */                       o1ooiI111i4 = i6 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 243 */                       if ((i2 & 2) != 0) {
/* 249 */                           i4 &= -113;
/* 245 */                           o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll1);
                                }
/* 252 */                       if (i8 != 0) {
/* 257 */                           oIo1i1 = new OIo1i1(0.0f, 0.0f, 0.0f, 0.0f);
                                }
/* 263 */                       if ((i2 & 16) != 0) {
/* 265 */                           i4 &= -57345;
/* 266 */                           i1IioI1l102 = I1IiooiI1IlO.I0000Il00O;
                                }
/* 269 */                       II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 271 */                       Ii1OoIll0 ii1OoIll0I00000oIO = OlIO0l.I00000oIO(iloI0lOlll1);
/* 275 */                       boolean zI000II = iloI0lOlll1.I000II(ii1OoIll0I00000oIO);
/* 279 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 283 */                       if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 291 */                           objI00O0i0ii = new Ii1oIilI(ii1OoIll0I00000oIO);
/* 294 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 298 */                       ilOIll0o11Ii3 = (Ii1oIilI) objI00O0i0ii;
/* 305 */                       I1IioI1l10 i1IioI1l104 = i1IioI1l102;
/* 306 */                       i0iol11I1OI3 = iI0IlloOiO0i;
/* 307 */                       oIo1Oi1l1lI2 = oIo1i1;
/* 300 */                       i0o1iIoolIiI00000oOI = OIlIo0OII1.I00000oOI(iloI0lOlll1);
/* 309 */                       i1IioI1l103 = i1IioI1l104;
/* 304 */                       i5 = i4 & (-238551041);
/* 311 */                       z3 = true;
                            } else {
/* 206 */                       iloI0lOlll1.I00OilO00Il();
/* 211 */                       if ((i2 & 2) != 0) {
/* 213 */                           i4 &= -113;
                                }
/* 217 */                       if ((i2 & 16) != 0) {
/* 219 */                           i4 &= -57345;
                                }
/* 220 */                       int i12 = i4 & (-238551041);
/* 222 */                       ilOIll0o11Ii3 = ilOIll0o11Ii;
/* 224 */                       z3 = z;
/* 226 */                       i5 = i12;
/* 227 */                       o1ooiI111i4 = o1ooiI111i2;
/* 228 */                       oIo1Oi1l1lI2 = oIo1i1;
/* 229 */                       i1IioI1l103 = i1IioI1l102;
/* 230 */                       i0iol11I1OI3 = i0iol11I1OI;
/* 232 */                       i0o1iIoolIiI00000oOI = i0o1iIoolIi;
                            }
/* 312 */                   iloI0lOlll1.I0010o();
/* 351 */                   o1ooiI111i3 = o1ooiI111i4;
/* 352 */                   O0o0I1i0O o0o0I1i0O2 = o0o0I1i0OI00000oIO;
/* 353 */                   IlOIll0o11Ii ilOIll0o11Ii4 = ilOIll0o11Ii3;
/* 354 */                   z2 = z3;
/* 360 */                   l101l11I.I00000oIO(o1ooiI111i3, o0o0I1i0O2, oIo1Oi1l1lI2, true, ilOIll0o11Ii4, z2, i0o1iIoolIiI00000oOI, i0iol11I1OI3, i1IioI1l103, null, null, function1, iloI0lOlll1, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i5 >> 3) & 3670016) | ((i5 << 12) & 1879048192), ((i5 >> 12) & 14) | ((i5 >> 18) & 7168), 6400);
/* 363 */                   i0o1iIoolIi2 = i0o1iIoolIiI00000oOI;
/* 364 */                   oIo1i1 = oIo1Oi1l1lI2;
/* 365 */                   ilOIll0o11Ii2 = ilOIll0o11Ii4;
/* 366 */                   o0o0I1i0OI00000oIO = o0o0I1i0O2;
/* 367 */                   i0iol11I1OI2 = i0iol11I1OI3;
/* 368 */                   i1IioI1l102 = i1IioI1l103;
                        }
/* 382 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 386 */               if (oOloioIlI001IO000 == null) {
/* 391 */                   IIIi1l iIIi1l = new IIIi1l(1);
/* 394 */                   iIIi1l.I00iiI = o1ooiI111i3;
/* 396 */                   iIIi1l.I00io1l = o0o0I1i0OI00000oIO;
/* 398 */                   iIIi1l.I00iiO = oIo1i1;
/* 400 */                   iIIi1l.I00ioIO = i1IioI1l102;
/* 402 */                   iIIi1l.I00l0I0l0lO1 = i0iol11I1OI2;
/* 404 */                   iIIi1l.I00l0OO0IO = ilOIll0o11Ii2;
/* 406 */                   iIIi1l.I00iio = z2;
/* 408 */                   iIIi1l.I00li1OI = i0o1iIoolIi2;
/* 410 */                   iIIi1l.I00ll1 = function1;
/* 414 */                   iIIi1l.I00ilI0I1 = i;
/* 418 */                   iIIi1l.I00ilO0 = i2;
/* 420 */                   VarHandle.storeStoreFence();
/* 423 */                   oOloioIlI001IO000.I0000O = iIIi1l;
/* 1925 */                  return;
                        }
/* 1925 */              return;
                    }
/* 74 */            i3 |= 384;
/* 76 */            oIo1i1 = oIo1Oi1l1lI;
/* 97 */            int i92 = i3 | 3072;
/* 101 */           if ((i & 24576) != 0) {
                    }
/* 128 */           int i112 = 196608 | i92;
/* 132 */           if ((1572864 & i) == 0) {
                    }
/* 139 */           i4 = 12582912 | i112;
/* 143 */           if ((100663296 & i) == 0) {
                    }
/* 151 */           if ((805306368 & i) == 0) {
                    }
/* 184 */           if (iloI0lOlll1.I00OIl(i4 & 1, (306783379 & i4) == 306783378)) {
                    }
/* 382 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 386 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, O0o0I1i0O o0o0I1i0O, OIo1Oi1l1lI oIo1Oi1l1lI, I1IiiOO0i0io i1IiiOO0i0io, II0O000iIl iI0O000iIl, IlOIll0o11Ii ilOIll0o11Ii, boolean z, I0o1iIoolIi i0o1iIoolIi, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    II0O000iIl iI0O000iIl2;
                    IlOIll0o11Ii ilOIll0o11Ii2;
                    I0o1iIoolIi i0o1iIoolIiI00000oOI;
                    int i2;
                    boolean z2;
/* 12 */            iloI0lOlll1.I00i0O(-1884325601);
/* 53 */            int i3 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | (iloI0lOlll1.I000II(o0o0I1i0O) ? 32 : 16) | 46861696 | (iloI0lOlll1.I000OOo1O(function1) ? 536870912 : 268435456);
/* 61 */            boolean z3 = true;
/* 73 */            if (iloI0lOlll1.I00OIl(i3 & 1, (306783379 & i3) != 306783378)) {
/* 75 */                iloI0lOlll1.I00Ol00();
/* 83 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 112 */                   OIo1i1 oIo1i1 = new OIo1i1(0.0f, 0.0f, 0.0f, 0.0f);
/* 115 */                   II0O000iIl iI0O000iIl3 = i1O01oOIoI0I.I00ll1;
/* 117 */                   Ii1OoIll0 ii1OoIll0I00000oIO = OlIO0l.I00000oIO(iloI0lOlll1);
/* 121 */                   boolean zI000II = iloI0lOlll1.I000II(ii1OoIll0I00000oIO);
/* 125 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 129 */                   if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 137 */                       objI00O0i0ii = new Ii1oIilI(ii1OoIll0I00000oIO);
/* 140 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 144 */                   Ii1oIilI ii1oIilI = (Ii1oIilI) objI00O0i0ii;
/* 150 */                   i2 = i3 & (-238551041);
/* 153 */                   oIo1Oi1l1lI2 = oIo1i1;
/* 154 */                   iI0O000iIl2 = iI0O000iIl3;
/* 155 */                   ilOIll0o11Ii2 = ii1oIilI;
/* 146 */                   i0o1iIoolIiI00000oOI = OIlIo0OII1.I00000oOI(iloI0lOlll1);
/* 157 */                   z2 = true;
                        } else {
/* 92 */                    iloI0lOlll1.I00OilO00Il();
/* 96 */                    iI0O000iIl2 = iI0O000iIl;
/* 98 */                    ilOIll0o11Ii2 = ilOIll0o11Ii;
/* 100 */                   i0o1iIoolIiI00000oOI = i0o1iIoolIi;
/* 95 */                    i2 = i3 & (-238551041);
/* 103 */                   z2 = true;
/* 104 */                   oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 106 */                   z3 = z;
                        }
/* 158 */               iloI0lOlll1.I0010o();
/* 190 */               l101l11I.I00000oIO(o1ooiI111i, o0o0I1i0O, oIo1Oi1l1lI2, false, ilOIll0o11Ii2, z3, i0o1iIoolIiI00000oOI, null, null, iI0O000iIl2, i1IiiOO0i0io, function1, iloI0lOlll1, (i2 & 14) | 24576 | (i2 & 112) | 1576320, 432 | ((i2 >> 18) & 7168), 1792);
                    } else {
/* 194 */               iloI0lOlll1.I00OilO00Il();
/* 197 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 199 */               iI0O000iIl2 = iI0O000iIl;
/* 201 */               ilOIll0o11Ii2 = ilOIll0o11Ii;
/* 203 */               z3 = z;
/* 205 */               i0o1iIoolIiI00000oOI = i0o1iIoolIi;
                    }
/* 207 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 211 */           if (oOloioIlI001IO000 != null) {
/* 216 */               I0O11lO0IoO i0O11lO0IoO = new I0O11lO0IoO(1);
/* 219 */               i0O11lO0IoO.I00iiO = o1ooiI111i;
/* 221 */               i0O11lO0IoO.I00iio = o0o0I1i0O;
/* 223 */               i0O11lO0IoO.I00ilI0I1 = oIo1Oi1l1lI2;
/* 227 */               i0O11lO0IoO.I00ilO0 = i1IiiOO0i0io;
/* 229 */               i0O11lO0IoO.I00io1l = iI0O000iIl2;
/* 231 */               i0O11lO0IoO.I00ioIO = ilOIll0o11Ii2;
/* 233 */               i0O11lO0IoO.I00iiI = z3;
/* 235 */               i0O11lO0IoO.I00l0I0l0lO1 = i0o1iIoolIiI00000oOI;
/* 237 */               i0O11lO0IoO.I00l0OO0IO = function1;
/* 239 */               VarHandle.storeStoreFence();
/* 242 */               oOloioIlI001IO000.I0000O = i0O11lO0IoO;
                    }
                }
            }
