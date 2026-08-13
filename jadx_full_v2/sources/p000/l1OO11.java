            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1OO11 {
                public static final void I00000oIO(IO1OO01i0 iO1OO01i0, String str, int i, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    I1IiiOO0i0io i1IiiOO0i0io;
/* 7 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 12 */            iloI0lOlll12.I00i0O(-1911886945);
/* 49 */            int i4 = i2 | (iloI0lOlll12.I000II(iO1OO01i0) ? 4 : 2) | (iloI0lOlll12.I000II(str) ? 32 : 16) | (iloI0lOlll12.I0000oI00(i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 66 */            if (!iloI0lOlll12.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 478 */               i3 = 1;
/* 479 */               iloI0lOlll12.I00OilO00Il();
                    } else {
/* 74 */                if (iO1OO01i0.I0000O() == IO1loo.I00iiO) {
/* 76 */                    OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 80 */                    if (oOloioIlI001IO000 != null) {
/* 84 */                        O1lIol1o o1lIol1o = new O1lIol1o(0);
/* 87 */                        o1lIol1o.I00iiI = iO1OO01i0;
/* 89 */                        o1lIol1o.I00iiO = str;
/* 91 */                        o1lIol1o.I00iio = i;
/* 93 */                        VarHandle.storeStoreFence();
/* 96 */                        oOloioIlI001IO000.I0000O = o1lIol1o;
/* 98 */                        return;
                            }
/* 2230 */                  return;
                        }
/* 102 */               String strI00000oOI = lOOoli.I00000oOI(R.string.chat_you, iloI0lOlll12);
/* 109 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 114 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll, 0.0f, 0.0f, 0.0f, 2.0f, 7);
/* 124 */               if (iO1OO01i0.I0000O() == IO1loo.I00iiI) {
/* 126 */                   strI00000oOI = str;
                        }
/* 127 */               boolean z = iO1OO01i0 instanceof IO1Oii;
/* 129 */               if (z) {
/* 133 */                   o1ooiI111iI000OiO = Ol0iOOO0.I0000oI00(o1ooiI111iI000OiO, 1.0f);
/* 140 */                   String str2 = ((IO1Oii) iO1OO01i0).I000OOo1O;
/* 142 */                   int length = str2.length();
/* 146 */                   i1IiiOO0i0io = I1IiooiI1IlO.I0001Ioi1lo;
/* 157 */                   strI00000oOI = length > 0 ? "Stats on ".concat(str2) : "Stats";
                        } else {
/* 160 */                   i1IiiOO0i0io = I1IiooiI1IlO.I00000oOI;
                        }
/* 162 */               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 166 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IiiOO0i0io, iI0O000iIl, iloI0lOlll12, 48);
/* 172 */               int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 176 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 180 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000OiO);
/* 186 */               IOl0oi0lOl1.I000lI.getClass();
/* 189 */               iloI0lOlll12.I00i0oil();
/* 192 */               boolean z2 = iloI0lOlll12.I00O10llo;
/* 194 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 196 */               if (z2) {
/* 198 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 202 */                   iloI0lOlll12.I00io1l();
                        }
/* 205 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 207 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 210 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 212 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 215 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 219 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 221 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 224 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 227 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 229 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 234 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, iI0O000iIl, iloI0lOlll12, 48);
/* 241 */               int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 245 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 249 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 253 */               iloI0lOlll12.I00i0oil();
/* 258 */               if (iloI0lOlll12.I00O10llo) {
/* 260 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 264 */                   iloI0lOlll12.I00io1l();
                        }
/* 267 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO2);
/* 270 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI2);
/* 273 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 276 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 279 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 359 */               Oo0i1oIIoOO.I00000oOI(strI00000oOI, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000OOo1O, iloI0lOlll1, 0, 0, 131070);
/* 362 */               iloI0lOlll12 = iloI0lOlll1;
/* 364 */               if (z) {
/* 369 */                   iloI0lOlll12.I00i01iIIliI(-856075924);
/* 375 */                   iloI0lOlll12.I00i01iIIliI(-855794661);
/* 378 */                   iloI0lOlll12.I0010I0i(false);
/* 381 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 389 */                   iloI0lOlll12.I00i01iIIliI(-855156805);
/* 392 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 396 */               iloI0lOlll12.I0010I0i(true);
/* 399 */               if (z) {
/* 404 */                   iloI0lOlll12.I00i01iIIliI(-80048883);
/* 454 */                   Oo0i1oIIoOO.I00000oOI("", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 0, 0, 131070);
/* 457 */                   iloI0lOlll12 = iloI0lOlll1;
/* 459 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 467 */                   iloI0lOlll12.I00i01iIIliI(-79964129);
/* 470 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 462 */               i3 = 1;
/* 474 */               iloI0lOlll12.I0010I0i(true);
                    }
/* 482 */           OOloioIl oOloioIlI001IO0002 = iloI0lOlll12.I001IO000();
/* 486 */           if (oOloioIlI001IO0002 != null) {
/* 490 */               O1lIol1o o1lIol1o2 = new O1lIol1o(i3);
/* 493 */               o1lIol1o2.I00iiI = iO1OO01i0;
/* 497 */               o1lIol1o2.I00iiO = str;
/* 501 */               o1lIol1o2.I00iio = i;
/* 503 */               VarHandle.storeStoreFence();
/* 506 */               oOloioIlI001IO0002.I0000O = o1lIol1o2;
                    }
                }
            }
