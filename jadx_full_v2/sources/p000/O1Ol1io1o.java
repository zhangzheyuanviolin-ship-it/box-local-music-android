            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1Ol1io1o {
                public static final OOoiliiIoloI I00000oIO = new OOoiliiIoloI("^\\s*```(\\w*)\\s*$");
                public static final OOoiliiIoloI I00000oOI = new OOoiliiIoloI("\\\\documentclass|\\\\begin\\{document\\}");
                public static final OOoiliiIoloI I0000Il00O = new OOoiliiIoloI("\\\\begin\\{(equation|align|gather|multline|eqnarray)\\*?\\}([\\s\\S]*?)\\\\end\\{(?:equation|align|gather|multline|eqnarray)\\*?\\}");
                public static final OOoiliiIoloI I0000O = new OOoiliiIoloI("\\\\begin\\{(?:equation|align\\*?|gather\\*?|multline\\*?|eqnarray\\*?)\\}|\\\\end\\{(?:equation|align\\*?|gather\\*?|multline\\*?|eqnarray\\*?)\\}");
                public static final OOoiliiIoloI I0000oI00 = new OOoiliiIoloI("\\\\\\[([\\s\\S]*?)\\\\\\]");
                public static final OOoiliiIoloI I0001Ioi1lo = new OOoiliiIoloI("^\\s*([*+-]|\\d+\\.)\\s+");

                public static final void I00000oIO(String str, String str2, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
                    Object obj;
/* 1 */             String str3 = str;
/* 5 */             long j3 = j;
/* 7 */             long j4 = j2;
/* 9 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 14 */            iloI0lOlll13.I00i0O(-1155858841);
/* 63 */            int i2 = i | (iloI0lOlll13.I000II(str3) ? 4 : 2) | (iloI0lOlll13.I000II(str2) ? 32 : 16) | (iloI0lOlll13.I0001Ioi1lo(j3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll13.I0001Ioi1lo(j4) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 81 */            if (iloI0lOlll13.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 89 */                IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) iloI0lOlll13.I000iOII(IOlO0o100i1i.I0000oI00);
/* 91 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 130 */               O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0.0f, 4.0f, 1), OiI11O1i1.I00000oOI(8.0f)), ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010I0i, iO0ioilo.I00000oIO);
/* 138 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll13, 0);
/* 144 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 148 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 152 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI);
/* 158 */               IOl0oi0lOl1.I000lI.getClass();
/* 161 */               iloI0lOlll13.I00i0oil();
/* 164 */               boolean z = iloI0lOlll13.I00O10llo;
/* 166 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 168 */               if (z) {
/* 170 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 174 */                   iloI0lOlll13.I00io1l();
                        }
/* 177 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 179 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 182 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 184 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI);
/* 187 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 191 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 193 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, numValueOf);
/* 196 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 199 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 201 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 222 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 12.0f, 0.0f, 4.0f, 0.0f, 10);
/* 234 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 54);
/* 240 */               int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 244 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 248 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000OiO);
/* 252 */               iloI0lOlll13.I00i0oil();
/* 259 */               if (iloI0lOlll13.I00O10llo) {
/* 261 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 265 */                   iloI0lOlll13.I00io1l();
                        }
/* 268 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 271 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 274 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 277 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 285 */               String str4 = str2 == null ? "" : str2;
/* 290 */               long jI0000Il00O = IOOiio0i.I0000Il00O(0.6f, j4);
/* 299 */               int i3 = (i2 << 6) & 57344;
/* 320 */               Io010i0 io010i0 = IliO1o11o.I00iio;
/* 382 */               Oo0i1oIIoOO.I00000oOI(str4, null, jI0000Il00O, null, j, null, null, io010i0, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll13, i3, 0, 261994);
/* 395 */               int i4 = i2 & 14;
/* 402 */               boolean zI000OOo1O = (i4 == 4) | iloI0lOlll13.I000OOo1O(iOO0i0o1O0l);
/* 403 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 408 */               if (zI000OOo1O || objI00O0i0ii == IOl11li.I00000oIO) {
/* 420 */                   IloO0O0 iloO0O0 = new IloO0O0(3);
/* 423 */                   iloO0O0.I00iiI = iOO0i0o1O0l;
/* 425 */                   str3 = str;
/* 427 */                   iloO0O0.I00iiO = str3;
/* 429 */                   VarHandle.storeStoreFence();
/* 432 */                   iloI0lOlll13.I00iio(iloO0O0);
                            obj = iloO0O0;
                        } else {
/* 415 */                   str3 = str;
                            obj = objI00O0i0ii;
                        }
/* 439 */               O1Ol00OIo o1Ol00OIo = new O1Ol00OIo();
/* 444 */               o1Ol00OIo.I00iOIl = j2;
/* 446 */               VarHandle.storeStoreFence();
/* 465 */               iIo1101O.I00000oIO((IllOOo00lI) obj, null, false, null, null, iiioOl1O.I00000oOI(-2054736161, o1Ol00OIo, iloI0lOlll13), iloI0lOlll13, 1572864, 62);
/* 469 */               iloI0lOlll13.I0010I0i(true);
/* 497 */               O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(iO0l10O.I0000Il00O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), iO0l10O.I00000oOI(iloI0lOlll13), false), 12.0f, 0.0f, 12.0f, 12.0f, 2);
/* 503 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 509 */               int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 513 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 517 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000OiO2);
/* 521 */               iloI0lOlll13.I00i0oil();
/* 526 */               if (iloI0lOlll13.I00O10llo) {
/* 530 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 536 */                   iloI0lOlll13.I00io1l();
                        }
/* 540 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 545 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI3);
/* 550 */               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 555 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 558 */               lOlilO1lOIO.I00000oIO(j);
/* 606 */               j3 = j;
/* 608 */               j4 = j2;
/* 612 */               Oo0i1oIIoOO.I00000oOI(str3, null, j4, null, j3, null, null, io010i0, 0L, null, IlIi0I0.I0000O(1.4f, j, 1095216660480L & j), 0, false, 0, 0, null, null, iloI0lOlll1, ((i2 >> 3) & 896) | i4 | i3, 0, 259946);
/* 615 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 618 */               iloI0lOlll14.I0010I0i(true);
/* 621 */               iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 625 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 628 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 632 */           if (oOloioIlI001IO000 != null) {
/* 636 */               O1Ol0illillO o1Ol0illillO = new O1Ol0illillO();
/* 639 */               o1Ol0illillO.I00iOIl = str3;
/* 643 */               o1Ol0illillO.I00iiI = str2;
/* 645 */               o1Ol0illillO.I00iiO = j3;
/* 647 */               o1Ol0illillO.I00iio = j4;
/* 649 */               VarHandle.storeStoreFence();
/* 652 */               oOloioIlI001IO000.I0000O = o1Ol0illillO;
                    }
                }

                public static final void I00000oOI(String str, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(-1697433596);
/* 45 */            int i2 = i | (iloI0lOlll1.I000II(str) ? 4 : 2) | (iloI0lOlll1.I0001Ioi1lo(j) ? 32 : 16) | (iloI0lOlll1.I0001Ioi1lo(j2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 61 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 80 */                int i3 = (i2 & 14) | 14352432;
/* 81 */                int i4 = i2 << 3;
/* 94 */                O1O0Ol.I00000oIO(str, Ol0iOOO0.I00111O(O1ooIo101ll.I00000oIO, null, 3), j, j2, O1O0iI0oo.I00iOIl, O1O11o01I1Il.I00iiI, false, 0L, iloI0lOlll1, i3 | (i4 & 896) | (i4 & 7168));
                    } else {
/* 98 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 101 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 105 */           if (oOloioIlI001IO000 != null) {
/* 109 */               O1OioIIlI o1OioIIlI = new O1OioIIlI();
/* 112 */               o1OioIIlI.I00iOIl = str;
/* 114 */               o1OioIIlI.I00iiI = j;
/* 116 */               o1OioIIlI.I00iiO = j2;
/* 118 */               VarHandle.storeStoreFence();
/* 121 */               oOloioIlI001IO000.I0000O = o1OioIIlI;
                    }
                }

                public static final void I0000Il00O(String str, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 11 */            iloI0lOlll1.I00i0O(-1932390927);
/* 16 */            if ((i & 6) == 0) {
/* 27 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 29 */                i2 = i;
                    }
/* 32 */            if ((i & 48) == 0) {
/* 45 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j) ? 32 : 16;
                    }
/* 48 */            if ((i & 384) == 0) {
/* 61 */                i2 |= iloI0lOlll1.I0001Ioi1lo(j2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 77 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 97 */                int i3 = (i2 & 14) | 14352432;
/* 98 */                int i4 = i2 << 3;
/* 110 */               O1O0Ol.I00000oIO(str, Ol0iOOO0.I00111O(O1ooIo101ll.I00000oIO, null, 3), j, j2, O1O0iI0oo.I00iiI, O1O11o01I1Il.I00iOIl, false, 0L, iloI0lOlll1, (i4 & 896) | i3 | (i4 & 7168));
                    } else {
/* 114 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 117 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 121 */           if (oOloioIlI001IO000 != null) {
/* 125 */               O1Oioo o1Oioo = new O1Oioo();
/* 128 */               o1Oioo.I00iOIl = str;
/* 130 */               o1Oioo.I00iiI = j;
/* 132 */               o1Oioo.I00iiO = j2;
/* 134 */               o1Oioo.I00iio = i;
/* 136 */               VarHandle.storeStoreFence();
/* 139 */               oOloioIlI001IO000.I0000O = o1Oioo;
                    }
                }

                public static final void I0000O(List list, List list2, O1ooiI111i o1ooiI111i, long j, long j2, Oi1Oo0Il0 oi1Oo0Il0, long j3, long j4, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
/* 20 */            iloI0lOlll1.I00i0O(-1686832033);
/* 107 */           int i3 = i | (iloI0lOlll1.I000OOo1O(list) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(list2) ? 32 : 16) | 384 | (iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I0001Ioi1lo(j2) ? 16384 : 8192) | (iloI0lOlll1.I000II(oi1Oo0Il0) ? 131072 : 65536) | (iloI0lOlll1.I0001Ioi1lo(j3) ? 1048576 : 524288) | (iloI0lOlll1.I0001Ioi1lo(j4) ? 8388608 : 4194304);
/* 126 */           if (iloI0lOlll1.I00OIl(i3 & 1, (4793491 & i3) != 4793490)) {
/* 128 */               int size = list.size();
/* 134 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 136 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 142 */               O1Ol1OIIo0O o1Ol1OIIo0O = new O1Ol1OIIo0O();
/* 145 */               o1Ol1OIIo0O.I00iOIl = size;
/* 147 */               o1Ol1OIIo0O.I00iiI = j;
/* 149 */               o1Ol1OIIo0O.I00iiO = list;
/* 151 */               o1Ol1OIIo0O.I00iio = j2;
/* 153 */               o1Ol1OIIo0O.I00ilI0I1 = oi1Oo0Il0;
/* 155 */               o1Ol1OIIo0O.I00ilO0 = j3;
/* 157 */               o1Ol1OIIo0O.I00io1l = j4;
/* 159 */               o1Ol1OIIo0O.I00ioIO = list2;
/* 161 */               VarHandle.storeStoreFence();
/* 180 */               i2 = 1;
/* 181 */               iOi0ollol.I00000oIO(o1ooiI111iI0000oI00, null, iiioOl1O.I00000oOI(-1092378807, o1Ol1OIIo0O, iloI0lOlll1), iloI0lOlll1, 3072, 6);
/* 184 */               o1ooiI111i2 = o1ooIo101ll;
                    } else {
/* 187 */               i2 = 1;
/* 188 */               iloI0lOlll1.I00OilO00Il();
/* 191 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 193 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 197 */           if (oOloioIlI001IO000 != null) {
/* 201 */               I0io101i i0io101i = new I0io101i(i2);
/* 204 */               i0io101i.I00ilO0 = list;
/* 206 */               i0io101i.I00io1l = list2;
/* 208 */               i0io101i.I00ioIO = o1ooiI111i2;
/* 210 */               i0io101i.I00iiI = j;
/* 212 */               i0io101i.I00iiO = j2;
/* 214 */               i0io101i.I00l0I0l0lO1 = oi1Oo0Il0;
/* 216 */               i0io101i.I00iio = j3;
/* 220 */               i0io101i.I00ilI0I1 = j4;
/* 222 */               VarHandle.storeStoreFence();
/* 225 */               oOloioIlI001IO000.I0000O = i0io101i;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x02e6  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x03e2  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x03ec  */
                /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0293  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x029a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000oI00(String str, O1ooiI111i o1ooiI111i, boolean z, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    long j3;
                    long j4;
                    IloI0lOlll1 iloI0lOlll12;
                    OOloioIl oOloioIlI001IO000;
                    long j5;
                    long j6;
                    O1OlOOioiI o1OlOOioiII00000oIO;
                    String string;
                    O1OlOOioiI o1OlOOioiII00000oIO2;
                    long j7;
                    String string2;
                    List listI00II0Ol1O0l;
                    int i5;
                    Oi1Oo0Il0 oi1Oo0Il0;
                    int i6;
/* 10 */            iloI0lOlll1.I00i0O(-108904286);
/* 15 */            if ((i & 6) == 0) {
/* 26 */                i3 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 28 */                i3 = i;
                    }
/* 29 */            int i7 = i2 & 2;
/* 31 */            if (i7 != 0) {
/* 33 */                i3 |= 48;
                    } else {
/* 40 */                if ((i & 48) == 0) {
/* 42 */                    o1ooiI111i2 = o1ooiI111i;
/* 55 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 56 */                i4 = i2 & 4;
/* 58 */                if (i4 != 0) {
/* 67 */                    if ((i & 384) == 0) {
/* 69 */                        z2 = z;
/* 82 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 85 */                    if ((i & 3072) == 0) {
/* 89 */                        if ((i2 & 8) == 0) {
/* 91 */                            j3 = j;
/* 97 */                            if (iloI0lOlll1.I0001Ioi1lo(j3)) {
/* 99 */                                i6 = Barcode.FORMAT_PDF417;
                                    }
/* 106 */                           i3 |= i6;
                                } else {
/* 102 */                           j3 = j;
                                }
/* 104 */                       i6 = Barcode.FORMAT_UPC_E;
/* 106 */                       i3 |= i6;
                            } else {
/* 108 */                       j3 = j;
                            }
/* 112 */                   if ((i & 24576) == 0) {
/* 116 */                       if ((i2 & 16) == 0) {
/* 118 */                           j4 = j2;
/* 124 */                           int i8 = iloI0lOlll1.I0001Ioi1lo(j4) ? 16384 : 8192;
/* 133 */                           i3 |= i8;
                                } else {
/* 129 */                           j4 = j2;
                                }
/* 133 */                       i3 |= i8;
                            } else {
/* 135 */                       j4 = j2;
                            }
/* 141 */                   int i9 = 1;
/* 156 */                   if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 9363) != 9362)) {
/* 158 */                       iloI0lOlll1.I00Ol00();
/* 163 */                       if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 178 */                           if (i7 != 0) {
/* 180 */                               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                                    }
/* 183 */                           if (i4 != 0) {
/* 185 */                               z2 = false;
                                    }
/* 188 */                           if ((i2 & 8) != 0) {
/* 200 */                               j3 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100o1O0lo;
                                    }
/* 205 */                           if ((i2 & 16) != 0) {
/* 215 */                               j5 = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I000iOII;
                                    }
/* 219 */                           iloI0lOlll1.I0010o();
/* 222 */                           if (z2) {
/* 247 */                               iloI0lOlll1.I00i01iIIliI(-1577792502);
/* 258 */                               j6 = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000OiO.I00000oIO.I00000oOI;
/* 260 */                               iloI0lOlll1.I0010I0i(false);
                                    } else {
/* 227 */                               iloI0lOlll1.I00i01iIIliI(-1577794198);
/* 238 */                               j6 = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000iOII.I00000oIO.I00000oOI;
/* 240 */                               iloI0lOlll1.I0010I0i(false);
                                    }
/* 271 */                           long j8 = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1.I00000oIO.I00000oOI;
/* 273 */                           lOlilO1lOIO.I00000oIO(j6);
/* 281 */                           long j9 = j6 & 1095216660480L;
/* 286 */                           long jI0000O = IlIi0I0.I0000O(1.1f, j6, j9);
/* 290 */                           lOlilO1lOIO.I00000oIO(j6);
/* 301 */                           long jI0000oI00 = lOlilO1lOIO.I0000oI00(Oo0o1OiIo.I0000O(j6) * 2.0f, j9);
/* 322 */                           Olo0loOlIO olo0loOlIO = new Olo0loOlIO(IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I001lllioOl), 3);
/* 329 */                           lOlilO1lOIO.I00000oIO(j8);
/* 332 */                           long j10 = j8 & 1095216660480L;
/* 429 */                           Oi1Oo0Il0 oi1Oo0Il02 = new Oi1Oo0Il0(null, new IOOIiI1o(new Oo0lloOiiIOI(0L, j8, null, null, 0L, 0L, 0, IlIi0I0.I0000O(1.4f, j8, j10), 16646109), 14), olo0loOlIO, new Oi1Oioi1oIO(new Oo0io0OO1(new OlIIi1oIIOlo(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14), 127), 79);
/* 440 */                           Oo0o1OiIo oo0o1OiIoI00000oIO = Oo0o1OiIo.I00000oIO(lOlilO1lOIO.I0000O(0));
/* 448 */                           lOlilO1lOIO.I00000oIO(j8);
/* 531 */                           Oi1Oo0Il0 oi1Oo0Il03 = new Oi1Oo0Il0(oo0o1OiIoI00000oIO, new IOOIiI1o(new Oo0lloOiiIOI(0L, j8, null, null, 0L, 0L, 0, IlIi0I0.I0000O(1.4f, j8, j10), 16646109), 14), null, new Oi1Oioi1oIO(new Oo0io0OO1(new OlIIi1oIIOlo(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14), 127), 110);
/* 540 */                           String strI000iOII = OlOolloIIOl0.I000iOII(str, "\\\r\n", "\\n");
/* 556 */                           o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("(?<!\\\\)\\\\\\n").matcher(strI000iOII), 0, strI000iOII);
/* 560 */                           if (o1OlOOioiII00000oIO != null) {
/* 562 */                               string = strI000iOII.toString();
                                    } else {
/* 567 */                               int length = strI000iOII.length();
/* 573 */                               StringBuilder sb = new StringBuilder(length);
/* 576 */                               O1OlOOioiI o1OlOOioiI = o1OlOOioiII00000oIO;
/* 578 */                               int i10 = 0;
                                        while (true) {
/* 585 */                                   sb.append((CharSequence) strI000iOII, i10, o1OlOOioiI.I00000oOI().I00iOIl);
/* 588 */                                   sb.append((CharSequence) "\\n");
/* 597 */                                   i10 = o1OlOOioiI.I00000oOI().I00iiI + 1;
/* 599 */                                   O1OlOOioiI o1OlOOioiII0000Il00O = o1OlOOioiI.I0000Il00O();
/* 603 */                                   if (i10 >= length || o1OlOOioiII0000Il00O == null) {
                                                break;
                                            } else {
/* 608 */                                       o1OlOOioiI = o1OlOOioiII0000Il00O;
                                            }
                                        }
/* 611 */                               if (i10 < length) {
/* 613 */                                   sb.append((CharSequence) strI000iOII, i10, length);
                                        }
/* 616 */                               string = sb.toString();
                                    }
/* 632 */                           String strI000iOII2 = OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(string, "\\\r", "\\r"), "\nabla", "\\nabla");
/* 638 */                           Pattern patternCompile = Pattern.compile("```(?:latex|math)\\s*([\\s\\S]*?)```");
/* 646 */                           O0o01OIl o0o01OIl = new O0o01OIl(12);
/* 654 */                           o1OlOOioiII00000oIO2 = lIo0ol0oI010.I00000oIO(patternCompile.matcher(strI000iOII2), 0, strI000iOII2);
/* 658 */                           if (o1OlOOioiII00000oIO2 != null) {
/* 660 */                               string2 = strI000iOII2.toString();
/* 664 */                               j7 = j8;
                                    } else {
/* 667 */                               int length2 = strI000iOII2.length();
/* 673 */                               StringBuilder sb2 = new StringBuilder(length2);
/* 676 */                               j7 = j8;
/* 678 */                               int i11 = 0;
/* 711 */                               do {
/* 685 */                                   sb2.append((CharSequence) strI000iOII2, i11, o1OlOOioiII00000oIO2.I00000oOI().I00iOIl);
/* 694 */                                   sb2.append((CharSequence) o0o01OIl.invoke(o1OlOOioiII00000oIO2));
/* 703 */                                   i11 = o1OlOOioiII00000oIO2.I00000oOI().I00iiI + 1;
/* 705 */                                   o1OlOOioiII00000oIO2 = o1OlOOioiII00000oIO2.I0000Il00O();
/* 709 */                                   if (i11 >= length2) {
                                                break;
                                            }
/* 711 */                               } while (o1OlOOioiII00000oIO2 != null);
/* 713 */                               if (i11 < length2) {
/* 715 */                                   sb2.append((CharSequence) strI000iOII2, i11, length2);
                                        }
/* 718 */                               string2 = sb2.toString();
                                    }
/* 722 */                           listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(string2);
/* 728 */                           ArrayList arrayList = new ArrayList();
/* 733 */                           StringBuilder sb3 = new StringBuilder();
/* 736 */                           i5 = 0;
/* 741 */                           while (i5 < listI00II0Ol1O0l.size()) {
/* 751 */                               O1OlOOioiI o1OlOOioiII00000oIO3 = OOoiliiIoloI.I00000oIO(I00000oIO, (CharSequence) listI00II0Ol1O0l.get(i5));
/* 755 */                               if (o1OlOOioiII00000oIO3 != null) {
/* 757 */                                   int i12 = i5 + 1;
/* 761 */                                   StringBuilder sb4 = new StringBuilder();
/* 766 */                                   int i13 = i12;
                                            while (true) {
/* 773 */                                       if (i13 >= listI00II0Ol1O0l.size()) {
/* 890 */                                           oi1Oo0Il0 = oi1Oo0Il03;
/* 904 */                                           sb3.append((String) listI00II0Ol1O0l.get(i5));
/* 907 */                                           sb3.append('\n');
/* 910 */                                           i5 = i12;
                                                    break;
                                                }
/* 789 */                                       int i14 = i12;
/* 797 */                                       if (O0000Ioio00.I0000O(OlOoOIi0o.I00OIo((String) listI00II0Ol1O0l.get(i13)).toString(), "```")) {
/* 799 */                                           I00100o1O0lo(sb3, arrayList);
/* 808 */                                           int i15 = i9;
/* 810 */                                           Object obj = ((O1OlO1II) o1OlOOioiII00000oIO3.I00000oIO()).get(i15);
/* 821 */                                           if (OlOoOIi0o.I001l0I00((String) obj)) {
/* 824 */                                               obj = null;
                                                    }
/* 829 */                                           String string3 = sb4.toString();
/* 833 */                                           oi1Oo0Il0 = oi1Oo0Il03;
/* 835 */                                           char[] cArr = new char[i15];
/* 839 */                                           cArr[0] = '\n';
/* 841 */                                           String strI00OOll1 = OlOoOIi0o.I00OOll1(string3, cArr);
/* 845 */                                           Oloi0i01o1i oloi0i01o1i = new Oloi0i01o1i();
/* 848 */                                           oloi0i01o1i.I00000oIO = strI00OOll1;
/* 850 */                                           oloi0i01o1i.I00000oOI = (String) obj;
/* 852 */                                           VarHandle.storeStoreFence();
/* 855 */                                           arrayList.add(oloi0i01o1i);
/* 858 */                                           i5 = i13 + 1;
/* 860 */                                           i9 = i15;
                                                } else {
/* 875 */                                           sb4.append((String) listI00II0Ol1O0l.get(i13));
/* 880 */                                           sb4.append('\n');
/* 883 */                                           i13++;
/* 885 */                                           oi1Oo0Il03 = oi1Oo0Il03;
/* 887 */                                           i12 = i14;
                                                }
                                            }
                                        } else {
/* 913 */                                   oi1Oo0Il0 = oi1Oo0Il03;
/* 925 */                                   sb3.append((String) listI00II0Ol1O0l.get(i5));
/* 928 */                                   sb3.append('\n');
/* 931 */                                   i5++;
                                        }
/* 862 */                               oi1Oo0Il03 = oi1Oo0Il0;
                                    }
/* 934 */                           Oi1Oo0Il0 oi1Oo0Il04 = oi1Oo0Il03;
/* 936 */                           I00100o1O0lo(sb3, arrayList);
/* 944 */                           O1Oii10Ill o1Oii10Ill = new O1Oii10Ill();
/* 947 */                           o1Oii10Ill.I00iOIl = j6;
/* 949 */                           o1Oii10Ill.I00iiI = z2;
/* 951 */                           o1Oii10Ill.I00iiO = j3;
/* 953 */                           o1Oii10Ill.I00iio = o1ooiI111i2;
/* 955 */                           o1Oii10Ill.I00ilI0I1 = arrayList;
/* 957 */                           o1Oii10Ill.I00ilO0 = oi1Oo0Il02;
/* 961 */                           o1Oii10Ill.I00io1l = oi1Oo0Il04;
/* 965 */                           o1Oii10Ill.I00ioIO = jI0000O;
/* 969 */                           o1Oii10Ill.I00l0I0l0lO1 = j7;
/* 973 */                           o1Oii10Ill.I00l0OO0IO = jI0000oI00;
/* 975 */                           VarHandle.storeStoreFence();
/* 981 */                           iloI0lOlll12 = iloI0lOlll1;
/* 989 */                           iiliio0o.I00000oOI(new OOiIo1lll[0], iiioOl1O.I00000oOI(334062946, o1Oii10Ill, iloI0lOlll12), iloI0lOlll12, 48);
/* 992 */                           j4 = j5;
                                } else {
/* 172 */                           iloI0lOlll1.I00OilO00Il();
                                }
/* 175 */                       j5 = j4;
/* 219 */                       iloI0lOlll1.I0010o();
/* 222 */                       if (z2) {
                                }
/* 271 */                       long j82 = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1.I00000oIO.I00000oOI;
/* 273 */                       lOlilO1lOIO.I00000oIO(j6);
/* 281 */                       long j92 = j6 & 1095216660480L;
/* 286 */                       long jI0000O2 = IlIi0I0.I0000O(1.1f, j6, j92);
/* 290 */                       lOlilO1lOIO.I00000oIO(j6);
/* 301 */                       long jI0000oI002 = lOlilO1lOIO.I0000oI00(Oo0o1OiIo.I0000O(j6) * 2.0f, j92);
/* 322 */                       Olo0loOlIO olo0loOlIO2 = new Olo0loOlIO(IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I001lllioOl), 3);
/* 329 */                       lOlilO1lOIO.I00000oIO(j82);
/* 332 */                       long j102 = j82 & 1095216660480L;
/* 429 */                       Oi1Oo0Il0 oi1Oo0Il022 = new Oi1Oo0Il0(null, new IOOIiI1o(new Oo0lloOiiIOI(0L, j82, null, null, 0L, 0L, 0, IlIi0I0.I0000O(1.4f, j82, j102), 16646109), 14), olo0loOlIO2, new Oi1Oioi1oIO(new Oo0io0OO1(new OlIIi1oIIOlo(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14), 127), 79);
/* 440 */                       Oo0o1OiIo oo0o1OiIoI00000oIO2 = Oo0o1OiIo.I00000oIO(lOlilO1lOIO.I0000O(0));
/* 448 */                       lOlilO1lOIO.I00000oIO(j82);
/* 531 */                       Oi1Oo0Il0 oi1Oo0Il032 = new Oi1Oo0Il0(oo0o1OiIoI00000oIO2, new IOOIiI1o(new Oo0lloOiiIOI(0L, j82, null, null, 0L, 0L, 0, IlIi0I0.I0000O(1.4f, j82, j102), 16646109), 14), null, new Oi1Oioi1oIO(new Oo0io0OO1(new OlIIi1oIIOlo(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, 14), 127), 110);
/* 540 */                       String strI000iOII3 = OlOolloIIOl0.I000iOII(str, "\\\r\n", "\\n");
/* 556 */                       o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("(?<!\\\\)\\\\\\n").matcher(strI000iOII3), 0, strI000iOII3);
/* 560 */                       if (o1OlOOioiII00000oIO != null) {
                                }
/* 632 */                       String strI000iOII22 = OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(string, "\\\r", "\\r"), "\nabla", "\\nabla");
/* 638 */                       Pattern patternCompile2 = Pattern.compile("```(?:latex|math)\\s*([\\s\\S]*?)```");
/* 646 */                       O0o01OIl o0o01OIl2 = new O0o01OIl(12);
/* 654 */                       o1OlOOioiII00000oIO2 = lIo0ol0oI010.I00000oIO(patternCompile2.matcher(strI000iOII22), 0, strI000iOII22);
/* 658 */                       if (o1OlOOioiII00000oIO2 != null) {
                                }
/* 722 */                       listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(string2);
/* 728 */                       ArrayList arrayList2 = new ArrayList();
/* 733 */                       StringBuilder sb32 = new StringBuilder();
/* 736 */                       i5 = 0;
/* 741 */                       while (i5 < listI00II0Ol1O0l.size()) {
                                }
/* 934 */                       Oi1Oo0Il0 oi1Oo0Il042 = oi1Oo0Il032;
/* 936 */                       I00100o1O0lo(sb32, arrayList2);
/* 944 */                       O1Oii10Ill o1Oii10Ill2 = new O1Oii10Ill();
/* 947 */                       o1Oii10Ill2.I00iOIl = j6;
/* 949 */                       o1Oii10Ill2.I00iiI = z2;
/* 951 */                       o1Oii10Ill2.I00iiO = j3;
/* 953 */                       o1Oii10Ill2.I00iio = o1ooiI111i2;
/* 955 */                       o1Oii10Ill2.I00ilI0I1 = arrayList2;
/* 957 */                       o1Oii10Ill2.I00ilO0 = oi1Oo0Il022;
/* 961 */                       o1Oii10Ill2.I00io1l = oi1Oo0Il042;
/* 965 */                       o1Oii10Ill2.I00ioIO = jI0000O2;
/* 969 */                       o1Oii10Ill2.I00l0I0l0lO1 = j7;
/* 973 */                       o1Oii10Ill2.I00l0OO0IO = jI0000oI002;
/* 975 */                       VarHandle.storeStoreFence();
/* 981 */                       iloI0lOlll12 = iloI0lOlll1;
/* 989 */                       iiliio0o.I00000oOI(new OOiIo1lll[0], iiioOl1O.I00000oOI(334062946, o1Oii10Ill2, iloI0lOlll12), iloI0lOlll12, 48);
/* 992 */                       j4 = j5;
                            } else {
/* 995 */                       iloI0lOlll12 = iloI0lOlll1;
/* 996 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 999 */                   oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1003 */                  if (oOloioIlI001IO000 != null) {
/* 1007 */                      O1Ol11i o1Ol11i = new O1Ol11i();
/* 1012 */                      o1Ol11i.I00iOIl = str;
/* 1014 */                      o1Ol11i.I00iiI = o1ooiI111i2;
/* 1016 */                      o1Ol11i.I00iiO = z2;
/* 1018 */                      o1Ol11i.I00iio = j3;
/* 1020 */                      o1Ol11i.I00ilI0I1 = j4;
/* 1024 */                      o1Ol11i.I00ilO0 = i;
/* 1028 */                      o1Ol11i.I00io1l = i2;
/* 1030 */                      VarHandle.storeStoreFence();
/* 1033 */                      oOloioIlI001IO000.I0000O = o1Ol11i;
/* 1750 */                      return;
                            }
/* 1750 */                  return;
                        }
/* 60 */                i3 |= 384;
/* 62 */                z2 = z;
/* 85 */                if ((i & 3072) == 0) {
                        }
/* 112 */               if ((i & 24576) == 0) {
                        }
/* 141 */               int i92 = 1;
/* 156 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 9363) != 9362)) {
                        }
/* 999 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1003 */              if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 35 */            o1ooiI111i2 = o1ooiI111i;
/* 56 */            i4 = i2 & 4;
/* 58 */            if (i4 != 0) {
                    }
/* 62 */            z2 = z;
/* 85 */            if ((i & 3072) == 0) {
                    }
/* 112 */           if ((i & 24576) == 0) {
                    }
/* 141 */           int i922 = 1;
/* 156 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 9363) != 9362)) {
                    }
/* 999 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1003 */          if (oOloioIlI001IO000 != null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0182 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00d8 A[EDGE_INSN: B:71:0x00d8->B:72:0x00d9 BREAK  A[LOOP:0: B:62:0x00b6->B:69:0x00d3]] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0001Ioi1lo(String str, O1ooiI111i o1ooiI111i, Oi1Oo0Il0 oi1Oo0Il0, long j, long j2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    boolean z;
                    boolean z2;
                    boolean zI000II;
                    Object objI00O0i0ii;
                    Iterator it;
                    int i3;
                    boolean z3;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    IOioOOi0I iOioOOi0I4;
                    IOioOOi0I iOioOOi0I5;
                    IOioOOi0I iOioOOi0I6;
                    OIoi0IIoi oIoi0IIoi;
                    String str2;
                    boolean zI000II2;
                    Object objI00O0i0ii2;
                    String str3;
/* 3 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 7 */             long j3 = j;
/* 9 */             long j4 = j2;
/* 11 */            IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 15 */            IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ilI0I1;
/* 17 */            IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ioIO;
/* 19 */            IOioOOi0I iOioOOi0I9 = lolOiIoiillI.I00ilO0;
/* 21 */            IOioOOi0I iOioOOi0I10 = lolOiIoiillI.I00io1l;
/* 26 */            iloI0lOlll12.I00i0O(1653576681);
/* 31 */            if ((i & 6) == 0) {
/* 42 */                i2 = (iloI0lOlll12.I000II(str) ? 4 : 2) | i;
                    } else {
/* 44 */                i2 = i;
                    }
/* 47 */            if ((i & 48) == 0) {
/* 60 */                i2 |= iloI0lOlll12.I000II(o1ooiI111i2) ? 32 : 16;
                    }
/* 64 */            if ((i & 384) == 0) {
/* 77 */                i2 |= iloI0lOlll12.I000II(oi1Oo0Il0) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 80 */            if ((i & 3072) == 0) {
/* 93 */                i2 |= iloI0lOlll12.I0001Ioi1lo(j3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 96 */            if ((i & 24576) == 0) {
/* 109 */               i2 |= iloI0lOlll12.I0001Ioi1lo(j4) ? 16384 : 8192;
                    }
/* 125 */           if (iloI0lOlll12.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 127 */               ArrayList arrayListI00100l0 = I00100l0(str);
/* 135 */               if (arrayListI00100l0.isEmpty()) {
/* 137 */                   z = false;
/* 170 */                   if (z) {
/* 176 */                       if (!arrayListI00100l0.isEmpty()) {
/* 179 */                           Iterator it2 = arrayListI00100l0.iterator();
/* 187 */                           while (it2.hasNext()) {
/* 193 */                               Oii1OOolio1 oii1OOolio1 = (Oii1OOolio1) it2.next();
/* 195 */                               Iterator it3 = it2;
/* 199 */                               if ((oii1OOolio1 instanceof Oii1IO1oIiOi) && !OlOoOIi0o.I001l0I00(((Oii1IO1oIiOi) oii1OOolio1).I00000oIO)) {
/* 217 */                                   z2 = false;
                                            break;
                                        }
/* 212 */                               it2 = it3;
                                    }
                                }
/* 215 */                       z2 = true;
/* 222 */                       boolean z4 = z2;
/* 233 */                       zI000II = ((i2 & 7168) != 2048) | iloI0lOlll12.I000II(arrayListI00100l0);
/* 234 */                       objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 238 */                       Object obj = IOl11li.I00000oIO;
/* 240 */                       if (zI000II) {
/* 259 */                           ArrayList arrayList = new ArrayList();
/* 262 */                           it = arrayListI00100l0.iterator();
/* 268 */                           int i4 = 0;
/* 273 */                           while (it.hasNext()) {
                                    }
/* 407 */                           i3 = i2;
/* 409 */                           z3 = z;
/* 411 */                           iOioOOi0I = iOioOOi0I7;
/* 413 */                           iOioOOi0I2 = iOioOOi0I8;
/* 415 */                           iOioOOi0I3 = iOioOOi0I9;
/* 417 */                           objI00O0i0ii = O1Oii0O0loo.I000OiO(arrayList);
/* 421 */                           iloI0lOlll12.I00iio(objI00O0i0ii);
/* 424 */                           Map map = (Map) objI00O0i0ii;
/* 426 */                           zI000II2 = iloI0lOlll12.I000II(arrayListI00100l0);
/* 430 */                           objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 434 */                           if (!zI000II2) {
/* 440 */                               I11110OIl i11110OIl = new I11110OIl();
/* 446 */                               I0o0oO111 i0o0oO111 = new I0o0oO111(2);
/* 449 */                               i0o0oO111.I00iiI = arrayListI00100l0;
/* 451 */                               VarHandle.storeStoreFence();
/* 454 */                               I000O01llI0(i11110OIl, arrayListI00100l0, i0o0oO111);
/* 457 */                               objI00O0i0ii2 = i11110OIl.I000OiO();
/* 461 */                               iloI0lOlll12.I00iio(objI00O0i0ii2);
/* 465 */                               I1111OO10i i1111OO10i = (I1111OO10i) objI00O0i0ii2;
/* 467 */                               if (z3) {
                                        }
                                    }
                                }
                            } else {
/* 217 */                       z2 = false;
/* 222 */                       boolean z42 = z2;
/* 233 */                       zI000II = ((i2 & 7168) != 2048) | iloI0lOlll12.I000II(arrayListI00100l0);
/* 234 */                       objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 238 */                       Object obj2 = IOl11li.I00000oIO;
/* 240 */                       if (!zI000II || objI00O0i0ii == obj2) {
/* 259 */                           ArrayList arrayList2 = new ArrayList();
/* 262 */                           it = arrayListI00100l0.iterator();
/* 268 */                           int i42 = 0;
/* 273 */                           while (it.hasNext()) {
/* 275 */                               Object next = it.next();
/* 279 */                               int i5 = i42 + 1;
/* 283 */                               if (i42 < 0) {
/* 403 */                                   IOOi1I.I000lI();
/* 406 */                                   throw null;
                                        }
/* 285 */                               int i6 = i2;
/* 289 */                               Oii1OOolio1 oii1OOolio12 = (Oii1OOolio1) next;
/* 291 */                               boolean z5 = z;
/* 295 */                               if (oii1OOolio12 instanceof Oii11i01O) {
/* 299 */                                   str2 = ((Oii11i01O) oii1OOolio12).I00000oIO;
                                        } else if (oii1OOolio12 instanceof Oii11Ol1OOo1) {
/* 308 */                                   str2 = ((Oii11Ol1OOo1) oii1OOolio12).I00000oIO;
                                        } else {
/* 374 */                                   iOioOOi0I4 = iOioOOi0I7;
/* 376 */                                   iOioOOi0I5 = iOioOOi0I8;
/* 378 */                                   iOioOOi0I6 = iOioOOi0I9;
/* 380 */                                   oIoi0IIoi = null;
/* 382 */                                   if (oIoi0IIoi == null) {
/* 384 */                                       arrayList2.add(oIoi0IIoi);
                                            }
/* 387 */                                   j3 = j;
/* 389 */                                   z = z5;
/* 391 */                                   i42 = i5;
/* 393 */                                   i2 = i6;
/* 395 */                                   iOioOOi0I8 = iOioOOi0I5;
/* 397 */                                   iOioOOi0I7 = iOioOOi0I4;
/* 399 */                                   iOioOOi0I9 = iOioOOi0I6;
                                        }
/* 312 */                               String strI000oI1ioi = Oi010OO0.I000oI1ioi(i42, "m");
/* 330 */                               OO1I0OI0o oO1I0OI0o = new OO1I0OI0o(7, I000iOII(j3, str2), I000OiO(j3, str2));
/* 333 */                               iOioOOi0I4 = iOioOOi0I7;
/* 337 */                               iOioOOi0I5 = iOioOOi0I8;
/* 341 */                               iOioOOi0I6 = iOioOOi0I9;
/* 344 */                               O1Ol10I1I o1Ol10I1I = new O1Ol10I1I(0);
/* 347 */                               o1Ol10I1I.I00iiI = str2;
/* 349 */                               o1Ol10I1I.I00iiO = j3;
/* 351 */                               o1Ol10I1I.I00iio = j4;
/* 353 */                               VarHandle.storeStoreFence();
/* 370 */                               oIoi0IIoi = new OIoi0IIoi(strI000oI1ioi, new IollOOl0o0(oO1I0OI0o, new IOii1l(-407709738, o1Ol10I1I, true)));
/* 382 */                               if (oIoi0IIoi == null) {
                                        }
/* 387 */                               j3 = j;
/* 389 */                               z = z5;
/* 391 */                               i42 = i5;
/* 393 */                               i2 = i6;
/* 395 */                               iOioOOi0I8 = iOioOOi0I5;
/* 397 */                               iOioOOi0I7 = iOioOOi0I4;
/* 399 */                               iOioOOi0I9 = iOioOOi0I6;
                                    }
/* 407 */                           i3 = i2;
/* 409 */                           z3 = z;
/* 411 */                           iOioOOi0I = iOioOOi0I7;
/* 413 */                           iOioOOi0I2 = iOioOOi0I8;
/* 415 */                           iOioOOi0I3 = iOioOOi0I9;
/* 417 */                           objI00O0i0ii = O1Oii0O0loo.I000OiO(arrayList2);
/* 421 */                           iloI0lOlll12.I00iio(objI00O0i0ii);
                                } else {
/* 245 */                           i3 = i2;
/* 247 */                           z3 = z;
/* 249 */                           iOioOOi0I = iOioOOi0I7;
/* 251 */                           iOioOOi0I2 = iOioOOi0I8;
/* 253 */                           iOioOOi0I3 = iOioOOi0I9;
                                }
/* 424 */                       Map map2 = (Map) objI00O0i0ii;
/* 426 */                       zI000II2 = iloI0lOlll12.I000II(arrayListI00100l0);
/* 430 */                       objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
/* 434 */                       if (!zI000II2 || objI00O0i0ii2 == obj2) {
/* 440 */                           I11110OIl i11110OIl2 = new I11110OIl();
/* 446 */                           I0o0oO111 i0o0oO1112 = new I0o0oO111(2);
/* 449 */                           i0o0oO1112.I00iiI = arrayListI00100l0;
/* 451 */                           VarHandle.storeStoreFence();
/* 454 */                           I000O01llI0(i11110OIl2, arrayListI00100l0, i0o0oO1112);
/* 457 */                           objI00O0i0ii2 = i11110OIl2.I000OiO();
/* 461 */                           iloI0lOlll12.I00iio(objI00O0i0ii2);
                                }
/* 465 */                       I1111OO10i i1111OO10i2 = (I1111OO10i) objI00O0i0ii2;
/* 467 */                       if (z3) {
/* 472 */                           iloI0lOlll12.I00i01iIIliI(-50665830);
/* 478 */                           I1iIllIiO i1iIllIiO = new I1iIllIiO(4);
/* 481 */                           i1iIllIiO.I00iiI = str;
/* 483 */                           VarHandle.storeStoreFence();
/* 489 */                           IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1923677564, i1iIllIiO, iloI0lOlll12);
/* 493 */                           int i7 = i3 >> 3;
/* 501 */                           int i8 = (i7 & 14) | 384 | (i7 & 112);
/* 504 */                           o1ooiI111i2 = o1ooiI111i;
/* 508 */                           Oi1Iilll.I00000oIO(o1ooiI111i2, oi1Oo0Il0, iOii1lI00000oOI, iloI0lOlll12, i8, 0);
/* 513 */                           iloI0lOlll12.I0010I0i(false);
                                } else if (z42) {
/* 526 */                           iloI0lOlll12.I00i01iIIliI(-50662324);
/* 533 */                           IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 539 */                           int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 543 */                           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 547 */                           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111i);
/* 553 */                           IOl0oi0lOl1.I000lI.getClass();
/* 556 */                           iloI0lOlll12.I00i0oil();
/* 559 */                           boolean z6 = iloI0lOlll12.I00O10llo;
/* 561 */                           Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 563 */                           if (z6) {
/* 565 */                               iloI0lOlll12.I000l1(iloi111);
                                    } else {
/* 569 */                               iloI0lOlll12.I00io1l();
                                    }
/* 572 */                           li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 575 */                           IOioOOi0I iOioOOi0I11 = iOioOOi0I3;
/* 577 */                           li01Ooiio01.I0000Il00O(iOioOOi0I11, iloI0lOlll12, oO0lO0l0I000lI);
/* 580 */                           IOioOOi0I iOioOOi0I12 = iOioOOi0I2;
/* 582 */                           IIl001iO0Io.I001IIilI0O(iHashCode, iloI0lOlll12, iOioOOi0I12, iloI0lOlll12);
/* 585 */                           IOioOOi0I iOioOOi0I13 = iOioOOi0I;
/* 587 */                           li01Ooiio01.I0000Il00O(iOioOOi0I13, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 593 */                           iloI0lOlll12.I00i01iIIliI(-116928062);
/* 596 */                           Iterator it4 = arrayListI00100l0.iterator();
/* 604 */                           while (it4.hasNext()) {
/* 610 */                               Oii1OOolio1 oii1OOolio13 = (Oii1OOolio1) it4.next();
/* 614 */                               if (oii1OOolio13 instanceof Oii11i01O) {
/* 618 */                                   str3 = ((Oii11i01O) oii1OOolio13).I00000oIO;
                                        } else if (oii1OOolio13 instanceof Oii11Ol1OOo1) {
/* 627 */                                   str3 = ((Oii11Ol1OOo1) oii1OOolio13).I00000oIO;
                                        } else {
/* 715 */                                   j4 = j2;
                                        }
/* 642 */                               O1ooiI111i o1ooiI111iI0000Il00O2 = iO0l10O.I0000Il00O(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f), iO0l10O.I00000oOI(iloI0lOlll12), false);
/* 648 */                               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 654 */                               int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 658 */                               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 662 */                               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 668 */                               IOl0oi0lOl1.I000lI.getClass();
/* 671 */                               iloI0lOlll12.I00i0oil();
/* 676 */                               if (iloI0lOlll12.I00O10llo) {
/* 678 */                                   iloI0lOlll12.I000l1(iloi111);
                                        } else {
/* 682 */                                   iloI0lOlll12.I00io1l();
                                        }
/* 685 */                               li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 688 */                               li01Ooiio01.I0000Il00O(iOioOOi0I11, iloI0lOlll12, oO0lO0l0I000lI2);
/* 691 */                               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I12, iloI0lOlll12);
/* 694 */                               li01Ooiio01.I0000Il00O(iOioOOi0I13, iloI0lOlll12, o1ooiI111iI0000Il00O3);
/* 703 */                               IloI0lOlll1 iloI0lOlll13 = iloI0lOlll12;
/* 705 */                               I0000Il00O(str3, j, j4, iloI0lOlll13, (i3 >> 6) & 1008);
/* 708 */                               iloI0lOlll12 = iloI0lOlll13;
/* 710 */                               iloI0lOlll12.I0010I0i(true);
/* 715 */                               j4 = j2;
                                    }
/* 720 */                           Oi010OO0.I001l0I00(iloI0lOlll12, false, true, false);
/* 723 */                           j4 = j2;
/* 725 */                           o1ooiI111i2 = o1ooiI111i;
                                } else {
/* 731 */                           iloI0lOlll12.I00i01iIIliI(-50648826);
/* 772 */                           Oo0i1oIIoOO.I0000Il00O(i1111OO10i2, o1ooiI111i, j2, 0L, 0L, null, 0L, 0, false, 0, 0, map2, null, null, iloI0lOlll12, (i3 & 112) | ((i3 >> 6) & 896), 0, 458744);
/* 775 */                           o1ooiI111i2 = o1ooiI111i;
/* 776 */                           j4 = j2;
/* 777 */                           iloI0lOlll12 = iloI0lOlll12;
/* 779 */                           iloI0lOlll12.I0010I0i(false);
                                }
                            }
                        } else {
/* 139 */                   Iterator it5 = arrayListI00100l0.iterator();
/* 147 */                   while (it5.hasNext()) {
/* 155 */                       Oii1OOolio1 oii1OOolio14 = (Oii1OOolio1) it5.next();
/* 159 */                       if ((oii1OOolio14 instanceof Oii11i01O) || (oii1OOolio14 instanceof Oii11Ol1OOo1)) {
/* 169 */                           z = true;
                                    break;
                                }
                            }
/* 137 */                   z = false;
/* 170 */                   if (z) {
                            }
                        }
                    } else {
/* 783 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 786 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 790 */           if (oOloioIlI001IO000 != null) {
/* 794 */               O1Ol1OI0o0O o1Ol1OI0o0O = new O1Ol1OI0o0O();
/* 799 */               o1Ol1OI0o0O.I00iOIl = str;
/* 801 */               o1Ol1OI0o0O.I00iiI = o1ooiI111i2;
/* 805 */               o1Ol1OI0o0O.I00iiO = oi1Oo0Il0;
/* 809 */               o1Ol1OI0o0O.I00iio = j;
/* 811 */               o1Ol1OI0o0O.I00ilI0I1 = j4;
/* 815 */               o1Ol1OI0o0O.I00ilO0 = i;
/* 817 */               VarHandle.storeStoreFence();
/* 820 */               oOloioIlI001IO000.I0000O = o1Ol1OI0o0O;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I000II(List list, int i, float f, boolean z, long j, long j2, Oi1Oo0Il0 oi1Oo0Il0, long j3, long j4, IloI0lOlll1 iloI0lOlll1, int i2) {
                    Object obj;
                    O1ooIo101ll o1ooIo101ll;
/* 5 */             float f2 = f;
/* 22 */            iloI0lOlll1.I00i0O(-1668125216);
/* 119 */           int i3 = i2 | (iloI0lOlll1.I000OOo1O(list) ? 4 : 2) | (iloI0lOlll1.I0000oI00(i) ? 32 : 16) | (iloI0lOlll1.I0000O(f2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I0001Ioi1lo(j) ? 16384 : 8192) | (iloI0lOlll1.I0001Ioi1lo(j2) ? 131072 : 65536) | (iloI0lOlll1.I000II(oi1Oo0Il0) ? 1048576 : 524288) | (iloI0lOlll1.I0001Ioi1lo(j3) ? 8388608 : 4194304) | (iloI0lOlll1.I0001Ioi1lo(j4) ? 67108864 : 33554432);
/* 140 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 38347923) != 38347922)) {
/* 142 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 153 */               O1ooiI111i o1ooiI111iI00000oOI = z ? i0I1I0.I00000oOI(o1ooIo101ll2, j, iO0ioilo.I00000oIO) : o1ooIo101ll2;
/* 159 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00ll1, iloI0lOlll1, 0);
/* 165 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 169 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 173 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI);
/* 179 */               IOl0oi0lOl1.I000lI.getClass();
/* 182 */               iloI0lOlll1.I00i0oil();
/* 189 */               if (iloI0lOlll1.I00O10llo) {
/* 193 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 197 */                   iloI0lOlll1.I00io1l();
                        }
/* 202 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 207 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 216 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 219 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 224 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 230 */               iloI0lOlll1.I00i01iIIliI(-1192592652);
/* 233 */               int i4 = 0;
/* 234 */               while (i4 < i) {
/* 242 */                   boolean z2 = i4 == i + (-1);
/* 258 */                   String str = (String) ((i4 < 0 || i4 >= list.size()) ? "" : list.get(i4));
/* 260 */                   O1ooiI111i o1ooiI111iI00100o1O0lo = Ol0iOOO0.I00100o1O0lo(o1ooIo101ll2, f2);
/* 270 */                   int i5 = i4;
/* 281 */                   boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(z2) | ((i3 & 458752) == 131072);
/* 283 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 287 */                   if (!zI000O01llI0) {
                                obj = objI00O0i0ii;
/* 291 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 295 */                           O1Ol0l0OO1 o1Ol0l0OO1 = new O1Ol0l0OO1();
/* 298 */                           o1Ol0l0OO1.I00iOIl = z2;
/* 300 */                           o1Ol0l0OO1.I00iiI = j2;
/* 302 */                           VarHandle.storeStoreFence();
/* 305 */                           iloI0lOlll1.I00iio(o1Ol0l0OO1);
                                    obj = o1Ol0l0OO1;
                                }
                            }
/* 318 */                   O1ooiI111i o1ooiI111iI000II = iO01II.I000II(iIO01l11OlO.I00000oIO(o1ooiI111iI00100o1O0lo, (Function1) obj), 8.0f, 6.0f);
/* 322 */                   if (z) {
/* 327 */                       iloI0lOlll1.I00i01iIIliI(-886680294);
/* 351 */                       Oo0lloOiiIOI oo0lloOiiIOI = new Oo0lloOiiIOI(0L, 0L, IlilIIiIiO.I00l0OO0IO, null, 0L, 0L, 0, 0L, 16777211);
/* 359 */                       O1Ol0lOOi1 o1Ol0lOOi1 = new O1Ol0lOOi1(0);
/* 362 */                       o1Ol0lOOi1.I00iio = str;
/* 364 */                       o1Ol0lOOi1.I00ilI0I1 = o1ooiI111iI000II;
/* 366 */                       o1Ol0lOOi1.I00ilO0 = oi1Oo0Il0;
/* 368 */                       o1Ol0lOOi1.I00iiI = j3;
/* 370 */                       o1Ol0lOOi1.I00iiO = j4;
/* 372 */                       VarHandle.storeStoreFence();
/* 384 */                       Oo0i1oIIoOO.I00000oIO(oo0lloOiiIOI, iiioOl1O.I00000oOI(205363032, o1Ol0lOOi1, iloI0lOlll1), iloI0lOlll1, 54);
/* 387 */                       iloI0lOlll1.I0010I0i(false);
/* 390 */                       o1ooIo101ll = o1ooIo101ll2;
                            } else {
/* 396 */                       iloI0lOlll1.I00i01iIIliI(-886363846);
/* 406 */                       o1ooIo101ll = o1ooIo101ll2;
/* 408 */                       I0001Ioi1lo(str, o1ooiI111iI000II, oi1Oo0Il0, j3, j4, iloI0lOlll1, (i3 >> 12) & 65408);
/* 411 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 416 */                   o1ooIo101ll2 = o1ooIo101ll;
/* 414 */                   i4 = i5 + 1;
/* 418 */                   f2 = f;
                        }
/* 423 */               iloI0lOlll1.I0010I0i(false);
/* 427 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 431 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 434 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 438 */           if (oOloioIlI001IO000 != null) {
/* 442 */               O1Ol0o01l o1Ol0o01l = new O1Ol0o01l();
/* 445 */               o1Ol0o01l.I00iOIl = list;
/* 447 */               o1Ol0o01l.I00iiI = i;
/* 451 */               o1Ol0o01l.I00iiO = f;
/* 455 */               o1Ol0o01l.I00iio = z;
/* 459 */               o1Ol0o01l.I00ilI0I1 = j;
/* 461 */               o1Ol0o01l.I00ilO0 = j2;
/* 463 */               o1Ol0o01l.I00io1l = oi1Oo0Il0;
/* 465 */               o1Ol0o01l.I00ioIO = j3;
/* 467 */               o1Ol0o01l.I00l0I0l0lO1 = j4;
/* 469 */               VarHandle.storeStoreFence();
/* 472 */               oOloioIlI001IO000.I0000O = o1Ol0o01l;
                    }
                }

                public static final void I000O01llI0(I11110OIl i11110OIl, List list, Function1 function1) {
/* 12 */            boolean z = false;
/* 13 */            int i = 0;
/* 14 */            boolean z2 = false;
/* 19 */            for (Object obj : list) {
/* 25 */                int i2 = i + 1;
/* 27 */                if (i < 0) {
/* 216 */                   IOOi1I.I000lI();
/* 220 */                   throw null;
                        }
/* 29 */                Oii1OOolio1 oii1OOolio1 = (Oii1OOolio1) obj;
/* 33 */                if (oii1OOolio1 instanceof Oii1IO1oIiOi) {
/* 37 */                    String str = ((Oii1IO1oIiOi) oii1OOolio1).I00000oIO;
/* 39 */                    int i3 = 0;
/* 44 */                    while (i3 < str.length()) {
/* 53 */                        if (str.startsWith("**", i3)) {
/* 55 */                            if (z2) {
/* 57 */                                i11110OIl.I0000oI00();
/* 60 */                                z2 = false;
                                    } else {
/* 98 */                                i11110OIl.I000OOo1O(new OlIIi1oIIOlo(0L, 0L, IlilIIiIiO.I00li1OI, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
/* 101 */                               z2 = true;
                                    }
/* 102 */                           i3 += 2;
                                } else if (str.charAt(i3) == '*') {
/* 113 */                           if (z) {
/* 115 */                               i11110OIl.I0000oI00();
/* 118 */                               z = false;
                                    } else {
/* 158 */                               i11110OIl.I000OOo1O(new OlIIi1oIIOlo(0L, 0L, null, Ilil10i.I00000oIO(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527));
/* 161 */                               z = true;
                                    }
/* 162 */                           i3++;
                                } else {
/* 165 */                           int i4 = i3;
/* 170 */                           while (i4 < str.length() && str.charAt(i4) != '*') {
/* 178 */                               i4++;
                                    }
/* 185 */                           i11110OIl.I0000O(str.substring(i3, i4));
/* 188 */                           i3 = i4;
                                }
                            }
                        } else {
/* 204 */                   String str2 = (String) function1.invoke(Integer.valueOf(i));
/* 206 */                   if (str2 != null) {
/* 210 */                       ioo10l.I00000oIO(i11110OIl, str2, " ");
                            }
                        }
/* 213 */               i = i2;
                    }
/* 221 */           if (z) {
/* 223 */               i11110OIl.I0000oI00();
                    }
/* 226 */           if (z2) {
/* 228 */               i11110OIl.I0000oI00();
                    }
                }

                public static final String I000OOo1O(String str) {
/* 49 */            return OlOoOIi0o.I00OIo(Pattern.compile("&\\s*").matcher(Pattern.compile("\\\\tag\\{[^}]*\\}").matcher(Pattern.compile("\\\\label\\{[^}]*\\}").matcher(str).replaceAll("")).replaceAll("")).replaceAll("")).toString();
                }

                public static final long I000OiO(long j, String str) {
/* 13 */            if (OlOoOIi0o.I000oI1ioi(str, "\\frac", false) || OlOoOIi0o.I000oI1ioi(str, "\\dfrac", false)) {
/* 104 */               lOlilO1lOIO.I00000oIO(j);
/* 111 */               return IlIi0I0.I0000O(3.0f, j, j & 1095216660480L);
                    }
/* 30 */            if (OlOoOIi0o.I000oI1ioi(str, "\\int", false) || OlOoOIi0o.I000oI1ioi(str, "\\sum", false) || OlOoOIi0o.I000oI1ioi(str, "\\prod", false)) {
/* 92 */                lOlilO1lOIO.I00000oIO(j);
/* 99 */                return IlIi0I0.I0000O(2.5f, j, j & 1095216660480L);
                    }
/* 55 */            if (OlOoOIi0o.I000oI1ioi(str, "_", false) || OlOoOIi0o.I000oI1ioi(str, "^", false)) {
/* 79 */                lOlilO1lOIO.I00000oIO(j);
/* 87 */                return IlIi0I0.I0000O(1.8f, j, j & 1095216660480L);
                    }
/* 66 */            lOlilO1lOIO.I00000oIO(j);
/* 74 */            return IlIi0I0.I0000O(1.4f, j, j & 1095216660480L);
                }

                public static final long I000iOII(long j, String str) {
                    float length;
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
/* 51 */            String strReplaceAll = Pattern.compile("[{}\\s]").matcher(Pattern.compile("\\\\[a-zA-Z]+").matcher(Pattern.compile("\\\\[a-zA-Z]+\\{([^{}]*)\\}").matcher(string).replaceAll("$1")).replaceAll("")).replaceAll("");
/* 62 */            if (OlOoOIi0o.I000oI1ioi(string, "\\frac", false) || OlOoOIi0o.I000oI1ioi(string, "\\dfrac", false)) {
/* 152 */               length = 5.5f;
                    } else if (OlOoOIi0o.I000oI1ioi(string, "\\nabla", false) || OlOoOIi0o.I000oI1ioi(string, "\\times", false) || OlOoOIi0o.I000oI1ioi(string, "\\cdot", false)) {
/* 149 */               length = 5.0f;
                    } else if (strReplaceAll.length() <= 1) {
/* 105 */               length = 2.2f;
                    } else if (strReplaceAll.length() <= 3) {
/* 116 */               length = 3.0f;
                    } else if (strReplaceAll.length() <= 6) {
/* 126 */               length = 4.0f;
                    } else {
/* 140 */               length = (strReplaceAll.length() * 0.35f) + 2.0f;
/* 145 */               if (length > 10.0f) {
/* 147 */                   length = 10.0f;
                        }
                    }
/* 154 */           lOlilO1lOIO.I00000oIO(j);
/* 163 */           return IlIi0I0.I0000O(length, j, 1095216660480L & j);
                }

                public static final boolean I000l1(String str) {
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
                    return OlOolloIIOl0.I000l1(string, "|", false) && OlOolloIIOl0.I000II(string, "|", false) && string.length() > 2;
                }

                public static final boolean I000lI(String str) {
/* 5 */             String string = OlOoOIi0o.I00OIo(str).toString();
                    return OlOolloIIOl0.I000l1(string, "|", false) && OlOolloIIOl0.I000II(string, "|", false) && Pattern.compile("[|\\-:\\s]").matcher(string).replaceAll("").length() == 0;
                }

                public static final ArrayList I000o00OoI0I(String str) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 17 */            Iterator it = OOoiliiIoloI.I00000oOI(new OOoiliiIoloI("\\$((?:[^$]|\\\\\\$)+?)\\$"), str).iterator();
/* 21 */            int i = 0;
                    while (true) {
/* 23 */                Io00llIoO1lO io00llIoO1lO = (Io00llIoO1lO) it;
/* 29 */                if (!io00llIoO1lO.hasNext()) {
                            break;
                        }
/* 37 */                O1OlOOioiI o1OlOOioiI = (O1OlOOioiI) ((O1OlIoo) io00llIoO1lO.next());
/* 45 */                if (o1OlOOioiI.I00000oOI().I00iOIl > i) {
/* 53 */                    String strSubstring = str.substring(i, o1OlOOioiI.I00000oOI().I00iOIl);
/* 61 */                    if (strSubstring.length() > 0) {
/* 68 */                        arrayList.add(new Oii1IO1oIiOi(strSubstring));
                            }
                        }
/* 84 */                String str2 = (String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(1);
/* 86 */                Oii11i01O oii11i01O = new Oii11i01O();
/* 89 */                oii11i01O.I00000oIO = str2;
/* 91 */                VarHandle.storeStoreFence();
/* 94 */                arrayList.add(oii11i01O);
/* 103 */               i = o1OlOOioiI.I00000oOI().I00iiI + 1;
                    }
/* 109 */           if (i < str.length()) {
/* 111 */               String strSubstring2 = str.substring(i);
/* 119 */               if (strSubstring2.length() > 0) {
/* 126 */                   arrayList.add(new Oii1IO1oIiOi(strSubstring2));
                        }
                    }
/* 168 */           return arrayList;
                }

                public static final ArrayList I000oI1ioi(String str) {
/* 24 */            List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(OlOoOIi0o.I00IioO0OiOi(OlOoOIi0o.I00IOO("|", OlOoOIi0o.I00OIo(str).toString()), "|"), new String[]{"|"}, 6);
/* 38 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00IoIO0lI, 10));
/* 41 */            Iterator it = listI00IoIO0lI.iterator();
/* 49 */            while (it.hasNext()) {
/* 65 */                arrayList.add(OlOoOIi0o.I00OIo((String) it.next()).toString());
                    }
/* 77 */            return arrayList;
                }

                public static final ArrayList I00100l0(String str) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 17 */            Iterator it = OOoiliiIoloI.I00000oOI(new OOoiliiIoloI("\\$\\$([\\s\\S]*?)\\$\\$"), str).iterator();
/* 21 */            int i = 0;
                    while (true) {
/* 23 */                Io00llIoO1lO io00llIoO1lO = (Io00llIoO1lO) it;
/* 29 */                if (!io00llIoO1lO.hasNext()) {
                            break;
                        }
/* 37 */                O1OlOOioiI o1OlOOioiI = (O1OlOOioiI) ((O1OlIoo) io00llIoO1lO.next());
/* 45 */                if (o1OlOOioiI.I00000oOI().I00iOIl > i) {
/* 61 */                    arrayList.addAll(I000o00OoI0I(str.substring(i, o1OlOOioiI.I00000oOI().I00iOIl)));
                        }
/* 81 */                String string = OlOoOIi0o.I00OIo((String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(1)).toString();
/* 89 */                if (string.length() > 0) {
/* 93 */                    Oii11Ol1OOo1 oii11Ol1OOo1 = new Oii11Ol1OOo1();
/* 96 */                    oii11Ol1OOo1.I00000oIO = string;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   arrayList.add(oii11Ol1OOo1);
                        }
/* 110 */               i = o1OlOOioiI.I00000oOI().I00iiI + 1;
                    }
/* 116 */           if (i < str.length()) {
/* 126 */               arrayList.addAll(I000o00OoI0I(str.substring(i)));
                    }
/* 168 */           return arrayList;
                }

                public static final void I00100o1O0lo(StringBuilder sb, ArrayList arrayList) {
/* 5 */             if (sb.length() > 0) {
/* 23 */                List listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(OlOoOIi0o.I00OOll1(sb.toString(), '\n'));
/* 29 */                ArrayList arrayList2 = new ArrayList();
/* 34 */                StringBuilder sb2 = new StringBuilder();
/* 37 */                int i = 0;
/* 42 */                while (i < listI00II0Ol1O0l.size()) {
/* 48 */                    String str = (String) listI00II0Ol1O0l.get(i);
/* 50 */                    int i2 = i + 1;
/* 65 */                    String str2 = i2 < listI00II0Ol1O0l.size() ? (String) listI00II0Ol1O0l.get(i2) : "";
/* 71 */                    if (I000l1(str) && I000lI(str2)) {
/* 83 */                        if (sb2.length() > 0) {
/* 102 */                           arrayList2.add(new Oloi1Ilio(OlOoOIi0o.I00OOll1(sb2.toString(), '\n')));
/* 105 */                           sb2.setLength(0);
                                }
/* 110 */                       StringBuilder sb3 = new StringBuilder();
/* 117 */                       while (i < listI00II0Ol1O0l.size() && (I000l1((String) listI00II0Ol1O0l.get(i)) || I000lI((String) listI00II0Ol1O0l.get(i)))) {
/* 149 */                           sb3.append((String) listI00II0Ol1O0l.get(i));
/* 152 */                           sb3.append('\n');
/* 155 */                           i++;
                                }
/* 168 */                       String strI00OOll1 = OlOoOIi0o.I00OOll1(sb3.toString(), '\n');
/* 172 */                       Oloi1OI oloi1OI = new Oloi1OI();
/* 175 */                       oloi1OI.I00000oIO = strI00OOll1;
/* 177 */                       VarHandle.storeStoreFence();
/* 180 */                       arrayList2.add(oloi1OI);
                            } else {
/* 185 */                       sb2.append(str);
/* 188 */                       sb2.append('\n');
/* 191 */                       i = i2;
                            }
                        }
/* 198 */               if (sb2.length() > 0) {
/* 217 */                   arrayList2.add(new Oloi1Ilio(OlOoOIi0o.I00OOll1(sb2.toString(), '\n')));
                        }
/* 220 */               arrayList.addAll(arrayList2);
/* 223 */               sb.setLength(0);
                    }
                }
            }
