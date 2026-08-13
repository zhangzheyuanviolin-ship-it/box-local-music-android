            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class Oli1lii10 {
                public static final lo1iloiI1 I00000oIO = new lo1iloiI1(15);
                public static final Object I00000oOI = new Object();

                public static final void I00000oIO(O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
/* 4 */             iloI0lOlll1.I00i0O(-1298353104);
/* 7 */             int i4 = i2 & 1;
/* 9 */             if (i4 != 0) {
/* 11 */                i3 = i | 6;
                    } else if ((i & 6) == 0) {
/* 27 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 29 */                i3 = i;
                    }
/* 32 */            if ((i & 48) == 0) {
/* 45 */                i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
/* 50 */            int i5 = 1;
/* 62 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 64 */                if (i4 != 0) {
/* 66 */                    o1ooiI111i = O1ooIo101ll.I00000oIO;
                        }
/* 68 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 74 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 80 */                    objI00O0i0ii = new Oli1o0i(i1O01oOIoI0I.I00oIiI10);
/* 83 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 92 */                I00000oOI((Oli1o0i) objI00O0i0ii, o1ooiI111i, illiIl1l11O, iloI0lOlll1, (i3 << 3) & 1008);
                    } else {
/* 96 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 99 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 103 */           if (oOloioIlI001IO000 != null) {
/* 107 */               Io1OiOO10 io1OiOO10 = new Io1OiOO10(i5);
/* 110 */               io1OiOO10.I00iio = o1ooiI111i;
/* 112 */               io1OiOO10.I00ilI0I1 = illiIl1l11O;
/* 114 */               io1OiOO10.I00iiI = i;
/* 116 */               io1OiOO10.I00iiO = i2;
/* 118 */               VarHandle.storeStoreFence();
/* 121 */               oOloioIlI001IO000.I0000O = io1OiOO10;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(Oli1o0i oli1o0i, O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-511989831);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000OOo1O(oli1o0i) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 72 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 76 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 80 */                Ilo1oli ilo1oliI0000Il00O = iilI1O0il0.I0000Il00O(iloI0lOlll1);
/* 84 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 88 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 92 */                iloI0lOlll1.I00i0oil();
/* 97 */                if (iloI0lOlll1.I00O10llo) {
/* 101 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 105 */                   iloI0lOlll1.I00io1l();
                        }
/* 110 */               li01Ooiio01.I0000Il00O(oli1o0i.I0000Il00O, iloI0lOlll1, oli1o0i);
/* 115 */               li01Ooiio01.I0000Il00O(oli1o0i.I0000O, iloI0lOlll1, ilo1oliI0000Il00O);
/* 120 */               li01Ooiio01.I0000Il00O(oli1o0i.I0000oI00, iloI0lOlll1, illiIl1l11O);
/* 125 */               IOl0oi0lOl1.I000lI.getClass();
/* 130 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 133 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 138 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 147 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 150 */               iloI0lOlll1.I0010I0i(true);
/* 157 */               if (iloI0lOlll1.I00IO1()) {
/* 204 */                   iloI0lOlll1.I00i01iIIliI(-1259187287);
/* 207 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 162 */                   iloI0lOlll1.I00i01iIIliI(-1259245908);
/* 165 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oli1o0i);
/* 169 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 173 */                   if (!zI000OOo1O) {
                                Object obj = objI00O0i0ii;
/* 177 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 181 */                           OlOi0iollo olOi0iollo = new OlOi0iollo(i3);
/* 184 */                           olOi0iollo.I00iiI = oli1o0i;
/* 186 */                           VarHandle.storeStoreFence();
/* 189 */                           iloI0lOlll1.I00iio(olOi0iollo);
                                    obj = olOi0iollo;
                                }
/* 194 */                       iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj, iloI0lOlll1);
/* 197 */                       iloI0lOlll1.I0010I0i(false);
                            }
                        }
                    } else {
/* 211 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 214 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 218 */           if (oOloioIlI001IO000 != null) {
/* 224 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(23);
/* 227 */               i0IliiililIo.I00iiO = oli1o0i;
/* 229 */               i0IliiililIo.I00iio = o1ooiI111i;
/* 231 */               i0IliiililIo.I00ilI0I1 = illiIl1l11O;
/* 233 */               i0IliiililIo.I00iiI = i;
/* 235 */               VarHandle.storeStoreFence();
/* 238 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }
