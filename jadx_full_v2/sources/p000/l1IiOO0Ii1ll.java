            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1IiOO0Ii1ll {
                /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(String str, IoiOolO1iOo ioiOolO1iOo, IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    boolean z2;
                    int i4;
                    O1ooiI111i o1ooiI111i2;
                    IloI0lOlll1 iloI0lOlll12;
                    long j;
                    O1ooiI111i o1ooiI111iI00000oOI;
/* 7 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 12 */            iloI0lOlll13.I00i0O(-653554866);
/* 18 */            if ((i & 6) == 0) {
/* 29 */                i3 = i | (iloI0lOlll13.I000II(str) ? 4 : 2);
                    } else {
/* 32 */                i3 = i;
                    }
/* 58 */            int i5 = i3 | (iloI0lOlll13.I000II(ioiOolO1iOo) ? 32 : 16) | (iloI0lOlll13.I000OOo1O(illOOo00lI) ? 256 : Barcode.FORMAT_ITF);
/* 59 */            int i6 = i5 | 3072;
/* 61 */            int i7 = i2 & 16;
/* 63 */            if (i7 != 0) {
/* 65 */                i4 = i5 | 27648;
/* 68 */                z2 = z;
                    } else {
/* 71 */                z2 = z;
/* 84 */                i4 = i6 | (iloI0lOlll13.I000O01llI0(z2) ? 16384 : 8192);
                    }
/* 103 */           if (iloI0lOlll13.I00OIl(i4 & 1, (i4 & 9363) != 9362)) {
/* 110 */               boolean z3 = i7 != 0 ? true : z2;
/* 116 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 129 */               O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(iO01II.I000OiO(o1ooIo101ll, 0.0f, 4.0f, 0.0f, 0.0f, 13), OiI11O1i1.I00000oIO);
/* 133 */               if (z3) {
/* 138 */                   iloI0lOlll13.I00i01iIIliI(-1000991360);
/* 145 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I000O01llI0;
/* 147 */                   iloI0lOlll13.I0010I0i(false);
                        } else {
/* 154 */                   iloI0lOlll13.I00i01iIIliI(-1000989502);
/* 161 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I00IO1oi11O;
/* 163 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 168 */               O1ooiI111i o1ooiI111iI00000oOI2 = i0I1I0.I00000oOI(o1ooiI111iI00000oIO, j, iO0ioilo.I00000oIO);
/* 178 */               float f = z3 ? 1.0f : 0.3f;
/* 182 */               if (z3) {
/* 187 */                   iloI0lOlll13.I00i01iIIliI(-1000985499);
/* 196 */                   boolean z4 = (i4 & 896) == 256;
/* 197 */                   Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 201 */                   if (!z4) {
                                Object obj = objI00O0i0ii;
/* 205 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 211 */                           I0O1OI i0o1oi = new I0O1OI(11);
/* 214 */                           i0o1oi.I00iiI = illOOo00lI;
/* 216 */                           VarHandle.storeStoreFence();
/* 219 */                           iloI0lOlll13.I00iio(i0o1oi);
                                    obj = i0o1oi;
                                }
/* 227 */                       o1ooiI111iI00000oOI = i1Ioo1o0.I00000oOI(o1ooiI111iI00000oOI2, false, null, (IllOOo00lI) obj, 15);
/* 231 */                       iloI0lOlll13.I0010I0i(false);
                            }
                        } else {
/* 238 */                   iloI0lOlll13.I00i01iIIliI(-1000984586);
/* 241 */                   iloI0lOlll13.I0010I0i(false);
/* 244 */                   o1ooiI111iI00000oOI = o1ooIo101ll;
                        }
/* 251 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 48);
/* 259 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 263 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 267 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI);
/* 273 */               IOl0oi0lOl1.I000lI.getClass();
/* 276 */               iloI0lOlll13.I00i0oil();
/* 281 */               if (iloI0lOlll13.I00O10llo) {
/* 285 */                   iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 289 */                   iloI0lOlll13.I00io1l();
                        }
/* 294 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 299 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 308 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 311 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 316 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 347 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOo, null, iOIiO1OII1.I00000oIO(iO0100loIol.I0000Il00O(Ol0iOOO0.I000lI(o1ooIo101ll, 16.0f), 6.0f, 0.0f, 2), f), 0L, iloI0lOlll13, ((i4 >> 3) & 14) | 48, 8);
/* 416 */               Oo0i1oIIoOO.I00000oOI(str, iOIiO1OII1.I00000oIO(iO01II.I000OOo1O(o1ooIo101ll, 10.0f, 4.0f, 8.0f, 4.0f), f), liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I000OOo1O, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, OoOOIOo00OoI.I0010I0i, iloI0lOlll1, i4 & 14, 12582912, 131064);
/* 419 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 422 */               iloI0lOlll14.I0010I0i(true);
/* 425 */               z2 = z3;
/* 427 */               o1ooiI111i2 = o1ooIo101ll;
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 430 */               iloI0lOlll13.I00OilO00Il();
/* 433 */               o1ooiI111i2 = o1ooiI111i;
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 435 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 439 */           if (oOloioIlI001IO000 != null) {
/* 443 */               O1l10IIIo1I o1l10IIIo1I = new O1l10IIIo1I();
/* 446 */               o1l10IIIo1I.I00iOIl = str;
/* 450 */               o1l10IIIo1I.I00iiI = ioiOolO1iOo;
/* 454 */               o1l10IIIo1I.I00iiO = illOOo00lI;
/* 456 */               o1l10IIIo1I.I00iio = o1ooiI111i2;
/* 458 */               o1l10IIIo1I.I00ilI0I1 = z2;
/* 462 */               o1l10IIIo1I.I00ilO0 = i;
/* 466 */               o1l10IIIo1I.I00io1l = i2;
/* 468 */               VarHandle.storeStoreFence();
/* 471 */               oOloioIlI001IO000.I0000O = o1l10IIIo1I;
                    }
                }
            }
