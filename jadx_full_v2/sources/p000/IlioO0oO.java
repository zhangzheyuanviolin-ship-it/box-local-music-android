            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class IlioO0oO {
                public static final long I00000oIO = lOlilO1lOIO.I0000O(8);
                public static final long I00000oOI = lOlilO1lOIO.I0000O(4);
                public static final long I0000Il00O = lOlilO1lOIO.I0000O(4);
                public static final Iil0iiOiI I0000O = new Iil0iiOiI(16);
                public static final Iil0iiOiI I0000oI00 = new Iil0iiOiI(17);
                public static final IOlO1IilOlOl I0001Ioi1lo = iiliio0o.I0000Il00O(new IOlIlo1(25));

                /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, O10lioiO o10lioiO, List list, int i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    int i5;
                    int i6;
                    OOloioIl oOloioIlI001IO000;
/* 18 */            iloI0lOlll1.I00i0O(991783985);
/* 23 */            if ((i2 & 6) == 0) {
/* 34 */                i4 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i2;
                    } else {
/* 36 */                i4 = i2;
                    }
/* 39 */            if ((i2 & 48) == 0) {
/* 52 */                i4 |= iloI0lOlll1.I000II(o10lioiO) ? 32 : 16;
                    }
/* 55 */            if ((i2 & 384) == 0) {
/* 68 */                i4 |= iloI0lOlll1.I000OOo1O(list) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 69 */            int i7 = i3 & 4;
/* 71 */            if (i7 == 0) {
/* 80 */                if ((i2 & 3072) == 0) {
/* 82 */                    i5 = i;
/* 95 */                    i4 |= iloI0lOlll1.I0000oI00(i5) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 98 */                if ((i2 & 24576) == 0) {
/* 111 */                   i4 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 16384 : 8192;
                        }
/* 116 */               if ((i4 & 9363) == 9362 || !iloI0lOlll1.I00IO1()) {
/* 136 */                   i6 = i7 == 0 ? 0 : i5;
/* 145 */                   O10l1oIi0o o10l1oIi0o = Oi1i0Oi.I0000Il00O(Oi1i0Oi.I00000oOI(iloI0lOlll1)).I0000Il00O;
/* 153 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 159 */                   float fI001lIiIIo1O = iiIooOOOI.I001lIiIIo1O(o10l1oIi0o.I00000oIO.I00000oIO);
/* 167 */                   float fI001lIiIIo1O2 = iiIooOOOI.I001lIiIIo1O(o10l1oIi0o.I00000oOI.I00000oIO);
/* 175 */                   float fI001lIiIIo1O3 = iiIooOOOI.I001lIiIIo1O(o10l1oIi0o.I0000Il00O.I00000oIO);
/* 187 */                   int iIntValue = ((Number) iloI0lOlll1.I000iOII(I0001Ioi1lo)).intValue();
/* 191 */                   int size = list.size();
/* 198 */                   OIo1i1 oIo1i1I00000oOI = iO01II.I00000oOI(fI001lIiIIo1O, fI001lIiIIo1O2, 0.0f, 10);
/* 204 */                   Ililo1Ii ililo1Ii = new Ililo1Ii();
/* 207 */                   ililo1Ii.I00iOIl = o10lioiO;
/* 209 */                   ililo1Ii.I00iiI = o10l1oIi0o;
/* 211 */                   ililo1Ii.I00iiO = oi1O00I1;
/* 213 */                   ililo1Ii.I00iio = iIntValue;
/* 215 */                   ililo1Ii.I00ilI0I1 = i6;
/* 217 */                   VarHandle.storeStoreFence();
/* 223 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(936007618, ililo1Ii, iloI0lOlll1);
/* 229 */                   Ilio10 ilio10 = new Ilio10();
/* 232 */                   ilio10.I00iOIl = o10l1oIi0o;
/* 234 */                   ilio10.I00iiI = iIntValue;
/* 236 */                   ilio10.I00iiO = iOii1l;
/* 238 */                   ilio10.I00iio = list;
/* 240 */                   VarHandle.storeStoreFence();
/* 253 */                   I00000oOI(size, fI001lIiIIo1O3, oIo1i1I00000oOI, iOii1lI00000oOI, iiioOl1O.I00000oOI(1128938819, ilio10, iloI0lOlll1), iloI0lOlll1, 27648);
                        } else {
/* 125 */                   iloI0lOlll1.I00OilO00Il();
/* 128 */                   i6 = i5;
                        }
/* 256 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 260 */               if (oOloioIlI001IO000 == null) {
/* 264 */                   Ililll0 ililll0 = new Ililll0();
/* 267 */                   ililll0.I00iOIl = oi1O00I1;
/* 269 */                   ililll0.I00iiI = o10lioiO;
/* 271 */                   ililll0.I00iiO = list;
/* 273 */                   ililll0.I00iio = i6;
/* 275 */                   ililll0.I00ilI0I1 = iOii1l;
/* 277 */                   ililll0.I00ilO0 = i2;
/* 279 */                   ililll0.I00io1l = i3;
/* 281 */                   VarHandle.storeStoreFence();
/* 284 */                   oOloioIlI001IO000.I0000O = ililll0;
/* 294 */                   return;
                        }
/* 294 */               return;
                    }
/* 73 */            i4 |= 3072;
/* 75 */            i5 = i;
/* 98 */            if ((i2 & 24576) == 0) {
                    }
/* 116 */           if ((i4 & 9363) == 9362) {
/* 136 */               if (i7 == 0) {
                        }
/* 145 */               O10l1oIi0o o10l1oIi0o2 = Oi1i0Oi.I0000Il00O(Oi1i0Oi.I00000oOI(iloI0lOlll1)).I0000Il00O;
/* 153 */               IiIooOOOI iiIooOOOI2 = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 159 */               float fI001lIiIIo1O4 = iiIooOOOI2.I001lIiIIo1O(o10l1oIi0o2.I00000oIO.I00000oIO);
/* 167 */               float fI001lIiIIo1O22 = iiIooOOOI2.I001lIiIIo1O(o10l1oIi0o2.I00000oOI.I00000oIO);
/* 175 */               float fI001lIiIIo1O32 = iiIooOOOI2.I001lIiIIo1O(o10l1oIi0o2.I0000Il00O.I00000oIO);
/* 187 */               int iIntValue2 = ((Number) iloI0lOlll1.I000iOII(I0001Ioi1lo)).intValue();
/* 191 */               int size2 = list.size();
/* 198 */               OIo1i1 oIo1i1I00000oOI2 = iO01II.I00000oOI(fI001lIiIIo1O4, fI001lIiIIo1O22, 0.0f, 10);
/* 204 */               Ililo1Ii ililo1Ii2 = new Ililo1Ii();
/* 207 */               ililo1Ii2.I00iOIl = o10lioiO;
/* 209 */               ililo1Ii2.I00iiI = o10l1oIi0o2;
/* 211 */               ililo1Ii2.I00iiO = oi1O00I1;
/* 213 */               ililo1Ii2.I00iio = iIntValue2;
/* 215 */               ililo1Ii2.I00ilI0I1 = i6;
/* 217 */               VarHandle.storeStoreFence();
/* 223 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(936007618, ililo1Ii2, iloI0lOlll1);
/* 229 */               Ilio10 ilio102 = new Ilio10();
/* 232 */               ilio102.I00iOIl = o10l1oIi0o2;
/* 234 */               ilio102.I00iiI = iIntValue2;
/* 236 */               ilio102.I00iiO = iOii1l;
/* 238 */               ilio102.I00iio = list;
/* 240 */               VarHandle.storeStoreFence();
/* 253 */               I00000oOI(size2, fI001lIiIIo1O32, oIo1i1I00000oOI2, iOii1lI00000oOI2, iiioOl1O.I00000oOI(1128938819, ilio102, iloI0lOlll1), iloI0lOlll1, 27648);
                    }
/* 256 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 260 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(int i, float f, OIo1i1 oIo1i1, IOii1l iOii1l, IOii1l iOii1l2, IloI0lOlll1 iloI0lOlll1, int i2) {
/* 4 */             iloI0lOlll1.I00i0O(-1888378294);
/* 42 */            int i3 = i2 | (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | (iloI0lOlll1.I0000O(f) ? 32 : 16) | (iloI0lOlll1.I000II(oIo1i1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 47 */            int i4 = 0;
/* 48 */            if ((i3 & 9363) == 9362 && iloI0lOlll1.I00IO1()) {
/* 57 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 65 */                iloI0lOlll1.I00i01iIIliI(874495906);
/* 83 */                boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
/* 84 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 88 */                if (!z) {
                            Object obj = objI00O0i0ii;
/* 92 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 96 */                        IlioIiIllIO0 ilioIiIllIO0 = new IlioIiIllIO0();
/* 99 */                        ilioIiIllIO0.I00000oIO = i;
/* 101 */                       ilioIiIllIO0.I00000oOI = f;
/* 103 */                       VarHandle.storeStoreFence();
/* 106 */                       iloI0lOlll1.I00iio(ilioIiIllIO0);
                                obj = ilioIiIllIO0;
                            }
/* 109 */                   O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj;
/* 111 */                   iloI0lOlll1.I0010I0i(false);
/* 114 */                   int iI00000oIO = iilI1O0il0.I00000oIO(iloI0lOlll1);
/* 118 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 124 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, O1ooIo101ll.I00000oIO);
/* 130 */                   IOl0oi0lOl1.I000lI.getClass();
/* 133 */                   iloI0lOlll1.I00i0oil();
/* 138 */                   if (iloI0lOlll1.I00O10llo) {
/* 142 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 146 */                       iloI0lOlll1.I00io1l();
                            }
/* 151 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 156 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 159 */                   IlliIl1l11O illiIl1l11O = lolOiIoiillI.I00ioIO;
/* 163 */                   if (iloI0lOlll1.I00O10llo || !O0000Ioio00.I0000O(iloI0lOlll1.I00O0i0ii(), Integer.valueOf(iI00000oIO))) {
/* 183 */                       iloI0lOlll1.I00iio(Integer.valueOf(iI00000oIO));
/* 190 */                       iloI0lOlll1.I00000oOI(illiIl1l11O, Integer.valueOf(iI00000oIO));
                            }
/* 195 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 200 */                   Ilio110 ilio110 = new Ilio110(i4);
/* 203 */                   ilio110.I00iiI = i;
/* 205 */                   ilio110.I00iiO = oIo1i1;
/* 207 */                   ilio110.I00iio = iOii1l;
/* 209 */                   VarHandle.storeStoreFence();
/* 220 */                   lO1Ili0ii.I00000oIO(iiioOl1O.I00000oOI(-1117232110, ilio110, iloI0lOlll1), iloI0lOlll1, 6);
/* 226 */                   iloI0lOlll1.I00i01iIIliI(1936501445);
/* 230 */                   for (int i5 = 0; i5 < i; i5++) {
/* 242 */                       iOii1l2.invoke(Integer.valueOf(i5), iloI0lOlll1, 48);
                            }
/* 248 */                   iloI0lOlll1.I0010I0i(false);
/* 251 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    }
/* 254 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 258 */           if (oOloioIlI001IO000 != null) {
/* 262 */               Ililloo1Ii ililloo1Ii = new Ililloo1Ii(i4);
/* 265 */               ililloo1Ii.I00iiO = i;
/* 267 */               ililloo1Ii.I00iiI = f;
/* 269 */               ililloo1Ii.I00iio = oIo1i1;
/* 271 */               ililloo1Ii.I00ilI0I1 = iOii1l;
/* 273 */               ililloo1Ii.I00ilO0 = iOii1l2;
/* 275 */               VarHandle.storeStoreFence();
/* 278 */               oOloioIlI001IO000.I0000O = ililloo1Ii;
                    }
                }

                public static final void I0000Il00O(IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(824663458);
/* 10 */            if ((i & 3) == 2 && iloI0lOlll1.I00IO1()) {
/* 19 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 30 */                OOiIo1lll oOiIo1lllI00000oIO = I0001Ioi1lo.I00000oIO(0);
/* 36 */                IlioIlil1 ilioIlil1 = new IlioIlil1(0);
/* 39 */                ilioIlil1.I00iiI = iOii1l;
/* 41 */                VarHandle.storeStoreFence();
/* 53 */                iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(20615394, ilioIlil1, iloI0lOlll1), iloI0lOlll1, 56);
                    }
/* 56 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 60 */            if (oOloioIlI001IO000 != null) {
/* 65 */                IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(4);
/* 68 */                ioOo1I0o1.I00iiI = iOii1l;
/* 70 */                VarHandle.storeStoreFence();
/* 73 */                oOloioIlI001IO000.I0000O = ioOo1I0o1;
                    }
                }
            }
