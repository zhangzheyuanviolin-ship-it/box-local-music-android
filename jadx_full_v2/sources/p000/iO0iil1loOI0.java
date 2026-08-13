            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0iil1loOI0 {
                public static final void I00000oIO(OOio1iliiii oOio1iliiii, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(-877793437);
/* 40 */            int i2 = i | (iloI0lOlll1.I000II(oOio1iliiii) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 56 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 60 */                boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(oOio1iliiii.I0000O);
/* 64 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 68 */                if (zI0001Ioi1lo || objI00O0i0ii == IOl11li.I00000oIO) {
/* 92 */                    objI00O0i0ii = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(oOio1iliiii.I0000O));
/* 96 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 105 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f);
/* 111 */               IO0i0lIl iO0i0lIlI0000O = iOl10Oi0oo0.I0000O(62);
/* 119 */               IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(14);
/* 122 */               iO1oIiIi1O01.I00iiO = illOOo00lI;
/* 124 */               iO1oIiIi1O01.I00iio = illOOo00lI2;
/* 126 */               iO1oIiIi1O01.I00iiI = oOio1iliiii;
/* 128 */               iO1oIiIi1O01.I00ilI0I1 = (String) objI00O0i0ii;
/* 130 */               VarHandle.storeStoreFence();
/* 145 */               iloI0lOlll12 = iloI0lOlll1;
/* 146 */               iOl111l1l.I0000O(o1ooiI111iI0000oI00, null, null, iO0i0lIlI0000O, iiioOl1O.I00000oOI(-1572132322, iO1oIiIi1O01, iloI0lOlll1), iloI0lOlll12, 24582, 6);
                    } else {
/* 150 */               iloI0lOlll12 = iloI0lOlll1;
/* 151 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 154 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 158 */           if (oOloioIlI001IO000 != null) {
/* 164 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(25);
/* 167 */               i01oi1lIIO.I00iiI = oOio1iliiii;
/* 169 */               i01oi1lIIO.I00iio = illOOo00lI;
/* 171 */               i01oi1lIIO.I00iiO = illOOo00lI2;
/* 173 */               VarHandle.storeStoreFence();
/* 176 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(877559927);
/* 28 */            if (iloI0lOlll12.I00OIl(i & 1, (i & 3) != 2)) {
/* 32 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 38 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 42 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 46 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111i);
/* 52 */                IOl0oi0lOl1.I000lI.getClass();
/* 55 */                iloI0lOlll12.I00i0oil();
/* 58 */                boolean z = iloI0lOlll12.I00O10llo;
/* 60 */                Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 62 */                if (z) {
/* 64 */                    iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 68 */                    iloI0lOlll12.I00io1l();
                        }
/* 71 */                IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 73 */                li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 76 */                IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 78 */                li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 81 */                Integer numValueOf = Integer.valueOf(iHashCode);
/* 85 */                IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 87 */                li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 90 */                li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 93 */                IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 95 */                li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 98 */                II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0l1o1o0;
/* 102 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 107 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 111 */               O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(o1ooIo101ll, 48.0f, 0.0f, 2);
/* 117 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IioII0000oI00, iI0IlloOiO0i, iloI0lOlll12, 54);
/* 123 */               int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 127 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 131 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000O01llI0);
/* 135 */               iloI0lOlll12.I00i0oil();
/* 140 */               if (iloI0lOlll12.I00O10llo) {
/* 142 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 146 */                   iloI0lOlll12.I00io1l();
                        }
/* 149 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 152 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI2);
/* 155 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 158 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 161 */               IoiOolO1iOo ioiOolO1iOoI00000oIO = il0oOiiOoO1.I00000oIO();
/* 165 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, 48.0f);
/* 169 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 192 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOoI00000oIO, null, o1ooiI111iI000lI, IOOiio0i.I0000Il00O(0.4f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o), iloI0lOlll12, 432, 0);
/* 266 */               i2 = 3;
/* 274 */               Oo0i1oIIoOO.I00000oOI("No documents yet", null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000O01llI0, iloI0lOlll1, 6, 0, 131066);
/* 320 */               Oo0i1oIIoOO.I00000oOI("Tap + to import a PDF and ask questions about it", null, IOOiio0i.I0000Il00O(0.7f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o), null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 6, 0, 130042);
/* 323 */               iloI0lOlll12 = iloI0lOlll1;
/* 326 */               iloI0lOlll12.I0010I0i(true);
/* 329 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 333 */               i2 = 3;
/* 335 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 338 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 342 */           if (oOloioIlI001IO000 != null) {
/* 348 */               I1o0III0ll i1o0III0ll = new I1o0III0ll(i2);
/* 353 */               i1o0III0ll.I00iiI = o1ooiI111i;
/* 355 */               VarHandle.storeStoreFence();
/* 358 */               oOloioIlI001IO000.I0000O = i1o0III0ll;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:72:0x0245  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(OOl0llI oOl0llI, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    IllOOo00lI illOOo00lI2;
                    IloI0lOlll1 iloI0lOlll12;
                    String strConcat;
                    Float fValueOf;
                    long j;
                    long j2;
                    Float f;
                    IloI0lOlll1 iloI0lOlll13;
                    IloI0lOlll1 iloI0lOlll14;
/* 5 */             IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 10 */            iloI0lOlll15.I00i0O(1133869223);
/* 35 */            int i2 = i | (iloI0lOlll15.I000II(oOl0llI) ? 4 : 2) | (iloI0lOlll15.I000OOo1O(illOOo00lI) ? 32 : 16);
/* 54 */            if (iloI0lOlll15.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 56 */                boolean z = oOl0llI instanceof OOl0l00Oii1I;
/* 60 */                if (oOl0llI instanceof OOl0liilI11) {
/* 62 */                    strConcat = "Reading PDF…";
                        } else if (oOl0llI instanceof OOl0lIoOoo1l) {
/* 69 */                    strConcat = "Extracting text…";
                        } else if (oOl0llI instanceof OOl0OIOl) {
/* 85 */                    strConcat = IIlIOloOOO.I00100l0("Splitting into ", ((OOl0OIOl) oOl0llI).I00000oIO, " chunks…");
                        } else if (oOl0llI instanceof OOl0OoOIlO0) {
/* 95 */                    OOl0OoOIlO0 oOl0OoOIlO0 = (OOl0OoOIlO0) oOl0llI;
/* 107 */                   strConcat = Oi010OO0.I0010o("Embedding chunk ", oOl0OoOIlO0.I00000oIO, "/", oOl0OoOIlO0.I00000oOI, "…");
                        } else if (oOl0llI instanceof OOl0Oll) {
/* 116 */                   strConcat = "Done";
                        } else if (z) {
/* 124 */                   Throwable th = ((OOl0l00Oii1I) oOl0llI).I00000oIO;
/* 126 */                   String message = th.getMessage();
/* 130 */                   if (message == null) {
/* 136 */                       message = th.getClass().getSimpleName();
                            }
/* 142 */                   strConcat = "Import failed: ".concat(message);
                        } else {
/* 147 */                   if (oOl0llI != null) {
/* 670 */                       I000II.I00000oIO();
/* 673 */                       return;
                            }
/* 149 */                   strConcat = "";
                        }
/* 153 */               if (oOl0llI instanceof OOl0OoOIlO0) {
/* 156 */                   OOl0OoOIlO0 oOl0OoOIlO02 = (OOl0OoOIlO0) oOl0llI;
/* 158 */                   float f2 = oOl0OoOIlO02.I00000oIO;
/* 161 */                   int i3 = oOl0OoOIlO02.I00000oOI;
/* 163 */                   if (i3 < 1) {
/* 165 */                       i3 = 1;
                            }
/* 168 */                   fValueOf = Float.valueOf(f2 / i3);
                        } else {
/* 173 */                   fValueOf = null;
                        }
/* 174 */               if (z) {
/* 179 */                   iloI0lOlll15.I00i01iIIliI(-1273341419);
/* 186 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll15).I001iOo1i0O;
/* 188 */                   iloI0lOlll15.I0010I0i(false);
                        } else {
/* 195 */                   iloI0lOlll15.I00i01iIIliI(-1273339367);
/* 202 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll15).I000O01llI0;
/* 204 */                   iloI0lOlll15.I0010I0i(false);
                        }
/* 207 */               if (z) {
/* 212 */                   iloI0lOlll15.I00i01iIIliI(-1273336873);
/* 219 */                   j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll15).I001l0I00;
/* 221 */                   iloI0lOlll15.I0010I0i(false);
                        } else {
/* 228 */                   iloI0lOlll15.I00i01iIIliI(-1273334693);
/* 235 */                   j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll15).I000OOo1O;
/* 237 */                   iloI0lOlll15.I0010I0i(false);
                        }
/* 240 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 258 */               O1ooiI111i o1ooiI111iI000II = iO01II.I000II(i0I1I0.I00000oOI(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), j, iO0ioilo.I00000oIO), 16.0f, 10.0f);
/* 266 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll15, 0);
/* 272 */               int iHashCode = Long.hashCode(iloI0lOlll15.I00OI1);
/* 276 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll15.I000lI();
/* 280 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll15, o1ooiI111iI000II);
/* 286 */               IOl0oi0lOl1.I000lI.getClass();
/* 289 */               iloI0lOlll15.I00i0oil();
/* 292 */               boolean z2 = iloI0lOlll15.I00O10llo;
/* 294 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 296 */               if (z2) {
/* 298 */                   iloI0lOlll15.I000l1(iloi111);
                        } else {
/* 302 */                   iloI0lOlll15.I00io1l();
                        }
/* 305 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 307 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll15, iOOlo1O01OI00000oIO);
/* 310 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 312 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll15, oO0lO0l0I000lI);
/* 315 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 319 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 321 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll15, numValueOf);
/* 324 */               li01Ooiio01.I00000oOI(iloI0lOlll15);
/* 327 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 329 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll15, o1ooiI111iI0000Il00O);
/* 338 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll15, 48);
/* 343 */               String str = strConcat;
/* 346 */               int iHashCode2 = Long.hashCode(iloI0lOlll15.I00OI1);
/* 350 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll15.I000lI();
/* 354 */               Float f3 = fValueOf;
/* 356 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll15, o1ooIo101ll);
/* 360 */               iloI0lOlll15.I00i0oil();
/* 367 */               if (iloI0lOlll15.I00O10llo) {
/* 369 */                   iloI0lOlll15.I000l1(iloi111);
                        } else {
/* 373 */                   iloI0lOlll15.I00io1l();
                        }
/* 376 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll15, oiI1iiIl1Oi0I00000oIO);
/* 379 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll15, oO0lO0l0I000lI2);
/* 382 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll15, iOioOOi0I3, iloI0lOlll15);
/* 385 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll15, o1ooiI111iI0000Il00O2);
/* 415 */               long j3 = j2;
/* 468 */               Oo0i1oIIoOO.I00000oOI(str, new O0io1O(1.0f, true), j3, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll15).I000o00OoI0I, iloI0lOlll1, 0, 0, 131064);
/* 471 */               IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 473 */               if (z) {
/* 478 */                   iloI0lOlll16.I00i01iIIliI(957154372);
/* 483 */                   OOl100Io0oi oOl100Io0oi = new OOl100Io0oi();
/* 486 */                   oOl100Io0oi.I00iOIl = j3;
/* 488 */                   VarHandle.storeStoreFence();
/* 513 */                   f = f3;
/* 516 */                   iOiO0o0oi.I0000O(illOOo00lI, null, false, null, null, null, iiioOl1O.I00000oOI(-876553767, oOl100Io0oi, iloI0lOlll16), iloI0lOlll16, ((i2 >> 3) & 14) | 805306368, 510);
/* 519 */                   illOOo00lI2 = illOOo00lI;
/* 520 */                   iloI0lOlll16.I0010I0i(false);
                        } else {
/* 525 */                   illOOo00lI2 = illOOo00lI;
/* 527 */                   f = f3;
/* 531 */                   iloI0lOlll16.I00i01iIIliI(957336001);
/* 534 */                   iloI0lOlll16.I0010I0i(false);
                        }
/* 538 */               iloI0lOlll16.I0010I0i(true);
/* 541 */               if (z) {
/* 659 */                   iloI0lOlll16.I00i01iIIliI(2037187877);
/* 662 */                   iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 546 */                   iloI0lOlll16.I00i01iIIliI(2036898616);
/* 557 */                   lOO1OIO00.I00000oIO(iloI0lOlll16, Ol0iOOO0.I000II(o1ooIo101ll, 6.0f));
/* 560 */                   if (f != null) {
/* 565 */                       iloI0lOlll16.I00i01iIIliI(2036970257);
/* 568 */                       boolean zI000II = iloI0lOlll16.I000II(f);
/* 572 */                       Object objI00O0i0ii = iloI0lOlll16.I00O0i0ii();
/* 576 */                       if (!zI000II) {
                                    Object obj = objI00O0i0ii;
/* 580 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 585 */                               I1iO0O0O i1iO0O0O = new I1iO0O0O(1);
/* 588 */                               i1iO0O0O.I00iiI = f;
/* 590 */                               VarHandle.storeStoreFence();
/* 593 */                               iloI0lOlll16.I00iio(i1iO0O0O);
                                        obj = i1iO0O0O;
                                    }
/* 618 */                           OOO0iOio0oil.I0000Il00O((IllOOo00lI) obj, Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0L, 0L, 0, 0.0f, null, iloI0lOlll1, 48, 124);
/* 621 */                           IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 622 */                           iloI0lOlll17.I0010I0i(false);
                                    iloI0lOlll14 = iloI0lOlll17;
                                }
                            } else {
/* 629 */                       iloI0lOlll16.I00i01iIIliI(2037090506);
/* 645 */                       OOO0iOio0oil.I0000O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0L, 0L, 0, 0.0f, iloI0lOlll16, 6);
/* 648 */                       iloI0lOlll16.I0010I0i(false);
                                iloI0lOlll14 = iloI0lOlll16;
                            }
/* 651 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll14;
                        }
/* 666 */               iloI0lOlll13.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll13;
                    } else {
/* 674 */               illOOo00lI2 = illOOo00lI;
/* 675 */               iloI0lOlll15.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll15;
                    }
/* 678 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 682 */           if (oOloioIlI001IO000 != null) {
/* 687 */               O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(5);
/* 692 */               o1oiiIIo111o.I00iiI = oOl0llI;
/* 694 */               o1oiiIIo111o.I00iiO = illOOo00lI2;
/* 696 */               VarHandle.storeStoreFence();
/* 699 */               oOloioIlI001IO000.I0000O = o1oiiIIo111o;
                    }
                }

                public static final void I0000O(OOio00 oOio00, IloI0lOlll1 iloI0lOlll1, int i) {
                    OOio00 oOio002;
                    int i2;
                    long j;
                    long j2;
                    boolean z;
                    O1ooIo101ll o1ooIo101ll;
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(268623045);
/* 21 */            int i3 = i | (iloI0lOlll12.I000OOo1O(oOio00) ? 4 : 2);
/* 37 */            if (iloI0lOlll12.I00OIl(i3 & 1, (i3 & 3) != 2)) {
/* 39 */                boolean z2 = oOio00.I00000oOI;
/* 41 */                if (z2) {
/* 46 */                    iloI0lOlll12.I00i01iIIliI(448712629);
/* 53 */                    j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll12).I0000Il00O;
/* 55 */                    iloI0lOlll12.I0010I0i(false);
                        } else {
/* 62 */                    iloI0lOlll12.I00i01iIIliI(448714291);
/* 69 */                    j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll12).I0010I0i;
/* 71 */                    iloI0lOlll12.I0010I0i(false);
                        }
/* 74 */                if (z2) {
/* 79 */                    iloI0lOlll12.I00i01iIIliI(448716631);
/* 86 */                    j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll12).I0000O;
/* 88 */                    iloI0lOlll12.I0010I0i(false);
                        } else {
/* 95 */                    iloI0lOlll12.I00i01iIIliI(448718357);
/* 102 */                   j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll12).I0010o;
/* 104 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 109 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 111 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f);
/* 124 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, z2 ? i1O01oOIoI0I.I00o101lO : i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 130 */               int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 134 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 138 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000oI00);
/* 144 */               IOl0oi0lOl1.I000lI.getClass();
/* 147 */               iloI0lOlll12.I00i0oil();
/* 150 */               boolean z3 = iloI0lOlll12.I00O10llo;
/* 152 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 154 */               if (z3) {
/* 156 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 160 */                   iloI0lOlll12.I00io1l();
                        }
/* 163 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 165 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 168 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 170 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 173 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 177 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 179 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 182 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 185 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 187 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 222 */               O1ooiI111i o1ooiI111iI000II = iO01II.I000II(i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(o1ooIo101ll2, OiI11O1i1.I0000Il00O(16.0f, 16.0f, z2 ? 4.0f : 16.0f, z2 ? 16.0f : 4.0f)), j, iO0ioilo.I00000oIO), 14.0f, 10.0f);
/* 228 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 234 */               int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 238 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 242 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000II);
/* 246 */               iloI0lOlll12.I00i0oil();
/* 251 */               if (iloI0lOlll12.I00O10llo) {
/* 253 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 257 */                   iloI0lOlll12.I00io1l();
                        }
/* 260 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 263 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI2);
/* 266 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 269 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 278 */               if (oOio00.I0000Il00O.length() > 0) {
/* 283 */                   iloI0lOlll12.I00i01iIIliI(-1113519533);
/* 353 */                   o1ooIo101ll = o1ooIo101ll2;
/* 355 */                   z = false;
/* 357 */                   Oo0i1oIIoOO.I00000oOI(oOio00.I0000Il00O, null, j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll12).I000iOII, iloI0lOlll1, 0, 0, 131066);
/* 360 */                   iloI0lOlll12 = iloI0lOlll1;
/* 362 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 367 */                   z = false;
/* 368 */                   o1ooIo101ll = o1ooIo101ll2;
/* 373 */                   iloI0lOlll12.I00i01iIIliI(-1113413823);
/* 376 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 380 */               iloI0lOlll12.I0010I0i(true);
/* 383 */               oOio002 = oOio00;
/* 393 */               if (oOio002.I0000O.isEmpty()) {
/* 456 */                   i2 = 16;
/* 461 */                   iloI0lOlll12.I00i01iIIliI(610919783);
/* 464 */                   iloI0lOlll12.I0010I0i(z);
                        } else {
/* 398 */                   iloI0lOlll12.I00i01iIIliI(610576706);
/* 409 */                   lOO1OIO00.I00000oIO(iloI0lOlll12, Ol0iOOO0.I000II(o1ooIo101ll, 4.0f));
/* 412 */                   I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(4.0f);
/* 416 */                   I1IioI i1IioII0000oI002 = I1IiooiI1IlO.I0000oI00(4.0f);
/* 422 */                   i2 = 16;
/* 424 */                   I0iII1i10I i0iII1i10I = new I0iII1i10I(i2);
/* 427 */                   i0iII1i10I.I00iiI = oOio002;
/* 429 */                   VarHandle.storeStoreFence();
/* 448 */                   ilOoiO0Ii1.I00000oIO(null, i1IioII0000oI00, i1IioII0000oI002, null, 0, 0, iiioOl1O.I00000oOI(1221347771, i0iII1i10I, iloI0lOlll12), iloI0lOlll12, 1573296, 57);
/* 451 */                   iloI0lOlll12.I0010I0i(z);
                        }
/* 468 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 472 */               oOio002 = oOio00;
/* 473 */               i2 = 16;
/* 475 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 478 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 482 */           if (oOloioIlI001IO000 != null) {
/* 486 */               O1IIii o1IIii = new O1IIii(i2);
/* 489 */               o1IIii.I00iiI = oOio002;
/* 491 */               VarHandle.storeStoreFence();
/* 494 */               oOloioIlI001IO000.I0000O = o1IIii;
                    }
                }

                public static final void I0000oI00(O1ol100o0O o1ol100o0O, String str, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IloI0lOlll1 iloI0lOlll12;
                    ArrayList arrayList;
                    String str2;
                    IOioOOi0I iOioOOi0I;
                    String str3;
                    IoiOolO1iOo ioiOolO1iOo;
                    float f;
                    OI10i0Il oI10i0Il;
                    Object obj;
/* 5 */             Function1 function12 = function1;
/* 7 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 12 */            iloI0lOlll13.I00i0O(-1307686178);
/* 49 */            int i3 = i | (iloI0lOlll13.I000OOo1O(o1ol100o0O) ? 4 : 2) | (iloI0lOlll13.I000II(str) ? 32 : 16) | (iloI0lOlll13.I000OOo1O(function12) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 54 */            int i4 = 0;
/* 66 */            if (iloI0lOlll13.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 70 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll13);
/* 80 */                boolean zI000II = iloI0lOlll13.I000II((O1oiOloOo) oI10i0IlI00000oOI.getValue());
/* 84 */                Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 88 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 90 */                if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 96 */                    objI00O0i0ii = o1ol100o0O.I001i1O0Ol("llm_chat");
/* 100 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 103 */               OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) objI00O0i0ii;
/* 111 */               boolean zI000II2 = iloI0lOlll13.I000II((O1oiOloOo) oI10i0IlI00000oOI.getValue());
/* 115 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 119 */               Object obj2 = null;
/* 120 */               if (zI000II2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 124 */                   if (oloIl1l1oOii == null || (arrayList = oloIl1l1oOii.I000OiO) == null) {
/* 184 */                       objI00O0i0ii2 = Il01100l.I00iOIl;
                            } else {
/* 132 */                       ArrayList arrayList2 = new ArrayList();
/* 143 */                       for (Object obj3 : arrayList) {
/* 166 */                           O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) oI10i0IlI00000oOI.getValue()).I0000Il00O.get(((O1oIOiI11o0) obj3).I00000oIO);
/* 176 */                           if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 178 */                               arrayList2.add(obj3);
                                    }
                                }
/* 182 */                       objI00O0i0ii2 = arrayList2;
                            }
/* 187 */                   iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 191 */               List list = (List) objI00O0i0ii2;
/* 197 */               if (list.isEmpty()) {
/* 199 */                   OOloioIl oOloioIlI001IO000 = iloI0lOlll13.I001IO000();
/* 203 */                   if (oOloioIlI001IO000 != null) {
/* 207 */                       OOl0oo1 oOl0oo1 = new OOl0oo1(i4);
/* 210 */                       oOl0oo1.I00iiI = o1ol100o0O;
/* 212 */                       oOl0oo1.I00iiO = str;
/* 214 */                       oOl0oo1.I00iio = function12;
/* 216 */                       VarHandle.storeStoreFence();
/* 219 */                       oOloioIlI001IO000.I0000O = oOl0oo1;
/* 221 */                       return;
                            }
/* 2230 */                  return;
                        }
/* 225 */               Iterator it = list.iterator();
                        while (true) {
/* 233 */                   if (!it.hasNext()) {
                                break;
                            }
/* 235 */                   Object next = it.next();
/* 248 */                   if (O0000Ioio00.I0000O(((O1oIOiI11o0) next).I00000oIO, str)) {
/* 250 */                       obj2 = next;
                                break;
                            }
                        }
/* 251 */               O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj2;
/* 253 */               if (o1oIOiI11o0 == null || (str2 = o1oIOiI11o0.I00000oIO) == null) {
/* 265 */                   str2 = ((O1oIOiI11o0) IOOi0Ool1i.I001lllioOl(list)).I00000oIO;
                        }
/* 267 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 271 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 275 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 279 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 282 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 286 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 296 */               O1ooiI111i o1ooiI111iI000II = iO01II.I000II(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 6.0f);
/* 306 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 48);
/* 312 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 316 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 320 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000II);
/* 326 */               IOl0oi0lOl1.I000lI.getClass();
/* 329 */               iloI0lOlll13.I00i0oil();
/* 332 */               boolean z = iloI0lOlll13.I00O10llo;
/* 336 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 338 */               if (z) {
/* 340 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 346 */                   iloI0lOlll13.I00io1l();
                        }
/* 350 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00io1l;
/* 352 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 355 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 357 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, oO0lO0l0I000lI);
/* 360 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 364 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ioIO;
/* 366 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, numValueOf);
/* 369 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 372 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 374 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 377 */               IoiOolO1iOo ioiOolO1iOo2 = lOIlO0l0o0o.I00000oIO;
/* 381 */               if (ioiOolO1iOo2 != null) {
/* 383 */                   str3 = str2;
/* 385 */                   ioiOolO1iOo = ioiOolO1iOo2;
/* 386 */                   f = 16.0f;
/* 387 */                   iOioOOi0I = iOioOOi0I2;
                        } else {
/* 414 */                   IoiOo1iI ioiOo1iI = new IoiOo1iI("Outlined.SmartToy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 419 */                   int i5 = Ooo1iOO.I00000oIO;
/* 423 */                   iOioOOi0I = iOioOOi0I2;
/* 427 */                   OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 432 */                   OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 439 */                   oO0Ii1.I000OiO(20.0f, 9.0f);
/* 444 */                   oO0Ii1.I000o00OoI0I(7.0f);
/* 463 */                   oO0Ii1.I0000oI00(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
/* 470 */                   oO0Ii1.I000II(-3.0f);
/* 485 */                   oO0Ii1.I0000oI00(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
/* 493 */                   str3 = str2;
/* 497 */                   oO0Ii1.I000l1(9.0f, 3.34f, 9.0f, 5.0f);
/* 502 */                   oO0Ii1.I0001Ioi1lo(6.0f);
/* 519 */                   oO0Ii1.I0000O(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f);
/* 524 */                   oO0Ii1.I000oI1ioi(2.0f);
/* 541 */                   oO0Ii1.I0000oI00(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
/* 549 */                   oO0Ii1.I000lI(1.34f, 3.0f, 3.0f, 3.0f);
/* 554 */                   oO0Ii1.I000oI1ioi(4.0f);
/* 571 */                   oO0Ii1.I0000oI00(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
/* 576 */                   oO0Ii1.I000II(12.0f);
/* 591 */                   oO0Ii1.I0000oI00(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
/* 596 */                   oO0Ii1.I000oI1ioi(-4.0f);
/* 611 */                   oO0Ii1.I0000oI00(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
/* 621 */                   oO0Ii1.I000l1(21.66f, 9.0f, 20.0f, 9.0f);
/* 630 */                   IIl001iO0Io.I001i1O0Ol(oO0Ii1, 18.0f, 19.0f, 6.0f, 19.0f);
/* 635 */                   oO0Ii1.I000o00OoI0I(7.0f);
/* 640 */                   oO0Ii1.I000II(12.0f);
/* 645 */                   oO0Ii1.I000o00OoI0I(19.0f);
/* 648 */                   oO0Ii1.I0000Il00O();
/* 655 */                   oO0Ii1.I000OiO(9.0f, 13.0f);
/* 670 */                   oO0Ii1.I0000oI00(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
/* 680 */                   oO0Ii1.I000l1(8.17f, 10.0f, 9.0f, 10.0f);
/* 688 */                   oO0Ii1.I000lI(1.5f, 0.67f, 1.5f, 1.5f);
/* 696 */                   oO0Ii1.I000l1(9.83f, 13.0f, 9.0f, 13.0f);
/* 699 */                   oO0Ii1.I0000Il00O();
/* 706 */                   oO0Ii1.I000OiO(16.5f, 11.5f);
/* 721 */                   oO0Ii1.I0000oI00(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
/* 729 */                   oO0Ii1.I000lI(-1.5f, -0.67f, -1.5f, -1.5f);
/* 739 */                   oO0Ii1.I000l1(14.17f, 10.0f, 15.0f, 10.0f);
/* 749 */                   oO0Ii1.I000l1(16.5f, 10.67f, 16.5f, 11.5f);
/* 752 */                   oO0Ii1.I0000Il00O();
/* 759 */                   oO0Ii1.I000OiO(8.0f, 15.0f);
/* 762 */                   oO0Ii1.I000II(8.0f);
/* 767 */                   oO0Ii1.I000oI1ioi(2.0f);
/* 770 */                   oO0Ii1.I0001Ioi1lo(8.0f);
/* 775 */                   oO0Ii1.I000o00OoI0I(15.0f);
/* 778 */                   oO0Ii1.I0000Il00O();
/* 784 */                   IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1.I00000oIO, 0, olI00IIlOO);
/* 787 */                   IoiOolO1iOo ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 791 */                   lOIlO0l0o0o.I00000oIO = ioiOolO1iOoI0000O;
/* 793 */                   ioiOolO1iOo = ioiOolO1iOoI0000O;
/* 794 */                   f = 16.0f;
                        }
/* 796 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, f);
/* 800 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 832 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOo, null, o1ooiI111iI000lI, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, iloI0lOlll13, 432, 0);
/* 839 */               lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 6.0f));
/* 910 */               IOioOOi0I iOioOOi0I6 = iOioOOi0I;
/* 940 */               Oo0i1oIIoOO.I00000oOI("Model:", null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oOI.I000oI1ioi, iloI0lOlll1, 6, 0, 131066);
/* 949 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 955 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 961 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 965 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 969 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 973 */               iloI0lOlll1.I00i0oil();
/* 978 */               if (iloI0lOlll1.I00O10llo) {
/* 980 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 986 */                   iloI0lOlll1.I00io1l();
                        }
/* 990 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 995 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oO0lO0l0I000lI2);
/* 1000 */              IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 1005 */              li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 1008 */              Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 1014 */              if (objI00O0i0ii4 == iOO0o0I1l) {
/* 1019 */                  OI1oil oI1oil = new OI1oil(5);
/* 1022 */                  oI10i0Il = oI10i0Il2;
/* 1024 */                  oI1oil.I00iiI = oI10i0Il;
/* 1026 */                  VarHandle.storeStoreFence();
/* 1029 */                  iloI0lOlll1.I00iio(oI1oil);
                            obj = oI1oil;
                        } else {
/* 1033 */                  oI10i0Il = oI10i0Il2;
                            obj = objI00O0i0ii4;
                        }
/* 1036 */              IllOOo00lI illOOo00lI = (IllOOo00lI) obj;
/* 1042 */              I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(9);
/* 1047 */              i0Iooi0i1l0l.I00iiI = str3;
/* 1049 */              VarHandle.storeStoreFence();
/* 1078 */              IOIIio0.I0000oI00(true, illOOo00lI, iiioOl1O.I00000oOI(2079210721, i0Iooi0i1l0l, iloI0lOlll1), null, false, null, i1oIli1o0ilo.I000OOo1O, null, null, null, null, null, null, iloI0lOlll1, 1573302, 16312);
/* 1081 */              IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 1089 */              boolean zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 1093 */              Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                        Object obj4 = objI00O0i0ii5;
/* 1097 */              if (objI00O0i0ii5 == iOO0o0I1l) {
/* 1102 */                  OI1oil oI1oil2 = new OI1oil(6);
/* 1105 */                  oI1oil2.I00iiI = oI10i0Il;
/* 1107 */                  VarHandle.storeStoreFence();
/* 1110 */                  iloI0lOlll14.I00iio(oI1oil2);
                            obj4 = oI1oil2;
                        }
/* 1114 */              IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj4;
/* 1118 */              i2 = 1;
/* 1119 */              I0O0O11i0lio i0O0O11i0lio = new I0O0O11i0lio(i2);
/* 1124 */              i0O0O11i0lio.I00iiI = list;
/* 1128 */              i0O0O11i0lio.I00iiO = function1;
/* 1130 */              i0O0O11i0lio.I00iio = oI10i0Il;
/* 1132 */              VarHandle.storeStoreFence();
/* 1153 */              function12 = function1;
/* 1155 */              iOIliO1I1i.I00000oIO(zBooleanValue, illOOo00lI2, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(610980015, i0O0O11i0lio, iloI0lOlll14), iloI0lOlll14, 48);
/* 1158 */              iloI0lOlll14.I0010I0i(true);
/* 1161 */              iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 1165 */              i2 = 1;
/* 1166 */              iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 1169 */          OOloioIl oOloioIlI001IO0002 = iloI0lOlll12.I001IO000();
/* 1173 */          if (oOloioIlI001IO0002 != null) {
/* 1177 */              OOl0oo1 oOl0oo12 = new OOl0oo1(i2);
/* 1182 */              oOl0oo12.I00iiI = o1ol100o0O;
/* 1186 */              oOl0oo12.I00iiO = str;
/* 1188 */              oOl0oo12.I00iio = function12;
/* 1190 */              VarHandle.storeStoreFence();
/* 1193 */              oOloioIlI001IO0002.I0000O = oOl0oo12;
                    }
                }

                public static final void I0001Ioi1lo(int i, Ii0l0Olio10 ii0l0Olio10, IloI0lOlll1 iloI0lOlll1, OOl1OlI0 oOl1OlI0) {
                    int i2;
                    Ii0l0Olio10 ii0l0Olio102;
                    OOl1OlI0 oOl1OlI02;
                    int i3;
                    IloI0lOlll1 iloI0lOlll12;
                    Object next;
                    String str;
                    Integer num;
                    O0o0I1i0O o0o0I1i0O;
                    OI10i0Il oI10i0Il;
                    IOioOOi0I iOioOOi0I;
                    OI10i0Il oI10i0Il2;
                    Object obj;
                    OI10i0Il oI10i0Il3;
                    Object obj2;
                    long j;
/* 3 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 10 */            iloI0lOlll13.I00i0O(-157959175);
/* 15 */            if ((i & 6) == 0) {
/* 26 */                i2 = i | (iloI0lOlll1.I000OOo1O(oOl1OlI0) ? 4 : 2);
                    } else {
/* 29 */                i2 = i;
                    }
/* 33 */            if ((i & 48) == 0) {
/* 46 */                i2 |= iloI0lOlll13.I000OOo1O(ii0l0Olio10) ? 32 : 16;
                    }
/* 63 */            if (iloI0lOlll13.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 67 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(oOl1OlI0.I000l1, iloI0lOlll13);
/* 73 */                OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(oOl1OlI0.I000o00OoI0I, iloI0lOlll13);
/* 79 */                OI10i0Il oI10i0IlI00000oOI3 = lOIoiooI1i01.I00000oOI(oOl1OlI0.I000OiO, iloI0lOlll13);
/* 85 */                OI10i0Il oI10i0IlI00000oOI4 = lOIoiooI1i01.I00000oOI(oOl1OlI0.I0001Ioi1lo, iloI0lOlll13);
/* 89 */                O0o0I1i0O o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll13);
/* 93 */                Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 97 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 99 */                if (objI00O0i0ii == iOO0o0I1l) {
/* 101 */                   objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll13);
/* 105 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 108 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 130 */               boolean zI000II = iloI0lOlll13.I000II((OOl1IO) oI10i0IlI00000oOI3.getValue()) | iloI0lOlll13.I000II((List) oI10i0IlI00000oOI4.getValue());
/* 131 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 137 */               if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 145 */                   OOl1IO oOl1IO = (OOl1IO) oI10i0IlI00000oOI3.getValue();
/* 154 */                   OOl11i0l oOl11i0l = oOl1IO instanceof OOl11i0l ? (OOl11i0l) oOl1IO : null;
/* 160 */                   String str2 = oOl11i0l != null ? oOl11i0l.I00000oIO : null;
/* 161 */                   if (str2 == null) {
/* 163 */                       str = "All Documents";
                            } else {
/* 175 */                       Iterator it = ((List) oI10i0IlI00000oOI4.getValue()).iterator();
                                while (true) {
/* 183 */                           if (!it.hasNext()) {
/* 201 */                               next = null;
                                        break;
                                    } else {
/* 185 */                               next = it.next();
/* 198 */                               if (((OOio1iliiii) next).I00000oIO.equals(str2)) {
                                            break;
                                        }
                                    }
                                }
/* 202 */                       OOio1iliiii oOio1iliiii = (OOio1iliiii) next;
/* 209 */                       str = oOio1iliiii != null ? oOio1iliiii.I00000oOI : "Document Q&A";
                            }
/* 165 */                   objI00O0i0ii2 = str;
/* 212 */                   iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 217 */               String str3 = (String) objI00O0i0ii2;
/* 219 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 223 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 227 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 231 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 234 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 246 */               Integer numValueOf = Integer.valueOf(((List) oI10i0IlI00000oOI.getValue()).size());
/* 263 */               boolean zI000II2 = iloI0lOlll13.I000II(oI10i0IlI00000oOI) | iloI0lOlll13.I000OOo1O(ii0110) | iloI0lOlll13.I000II(o0o0I1i0OI00000oIO);
/* 264 */               Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 268 */               if (zI000II2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 284 */                   num = numValueOf;
/* 286 */                   I0O0il1iIl i0O0il1iIl = new I0O0il1iIl((Object) ii0110, oI10i0IlI00000oOI, (Object) o0o0I1i0OI00000oIO, (IOoil1iiIilo) null, 29);
/* 289 */                   o0o0I1i0O = o0o0I1i0OI00000oIO;
/* 293 */                   iloI0lOlll13.I00iio(i0O0il1iIl);
/* 296 */                   objI00O0i0ii4 = i0O0il1iIl;
                        } else {
/* 274 */                   num = numValueOf;
/* 275 */                   o0o0I1i0O = o0o0I1i0OI00000oIO;
                        }
/* 299 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll13, num);
/* 304 */               O1ooiI111i o1ooiI111iI00000oIO = iO1Oii0i.I00000oIO(Ol0iOOO0.I0000Il00O);
/* 312 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll13, 0);
/* 318 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 322 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 326 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oIO);
/* 332 */               IOl0oi0lOl1.I000lI.getClass();
/* 335 */               iloI0lOlll13.I00i0oil();
/* 338 */               boolean z = iloI0lOlll13.I00O10llo;
/* 340 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 342 */               if (z) {
/* 344 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 348 */                   iloI0lOlll13.I00io1l();
                        }
/* 351 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00io1l;
/* 353 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 356 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 358 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, oO0lO0l0I000lI);
/* 361 */               Integer numValueOf2 = Integer.valueOf(iHashCode);
/* 365 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ioIO;
/* 367 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, numValueOf2);
/* 370 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 373 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 375 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 378 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 404 */               O1ooiI111i o1ooiI111iI000II = iO01II.I000II(i0I1I0.I00000oOI(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010I0i, iO0ioilo.I00000oIO), 16.0f, 8.0f);
/* 408 */               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 410 */               I1IiOI0 i1IiOI0 = I1IiooiI1IlO.I00000oIO;
/* 416 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll13, 48);
/* 424 */               int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 428 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 432 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000II);
/* 436 */               iloI0lOlll13.I00i0oil();
/* 441 */               if (iloI0lOlll13.I00O10llo) {
/* 443 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 447 */                   iloI0lOlll13.I00io1l();
                        }
/* 450 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 453 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, oO0lO0l0I000lI2);
/* 456 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 459 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 462 */               IoiOolO1iOo ioiOolO1iOoI0000O = ililIi.I00000oIO;
/* 464 */               if (ioiOolO1iOoI0000O != null) {
/* 466 */                   oI10i0Il = oI10i0Il4;
/* 468 */                   iOioOOi0I = iOioOOi0I3;
                        } else {
/* 494 */                   IoiOo1iI ioiOo1iI = new IoiOo1iI("AutoMirrored.Outlined.FormatListBulleted", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
/* 499 */                   int i4 = Ooo1iOO.I00000oIO;
/* 505 */                   OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 512 */                   OO0Ii1 oO0Ii1I000II = IIl001iO0Io.I000II(4.0f, 10.5f);
/* 530 */                   oO0Ii1I000II.I0000oI00(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
/* 540 */                   oO0Ii1I000II.I000lI(0.67f, 1.5f, 1.5f, 1.5f);
/* 546 */                   oI10i0Il = oI10i0Il4;
/* 550 */                   oO0Ii1I000II.I000lI(1.5f, -0.67f, 1.5f, -1.5f);
/* 553 */                   oO0Ii1I000II.I000lI(-0.67f, -1.5f, -1.5f, -1.5f);
/* 556 */                   oO0Ii1I000II.I0000Il00O();
/* 563 */                   oO0Ii1I000II.I000OiO(4.0f, 4.5f);
/* 566 */                   oO0Ii1I000II.I0000oI00(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
/* 574 */                   oO0Ii1I000II.I000l1(3.17f, 7.5f, 4.0f, 7.5f);
/* 584 */                   oO0Ii1I000II.I000l1(5.5f, 6.83f, 5.5f, 6.0f);
/* 594 */                   oO0Ii1I000II.I000l1(4.83f, 4.5f, 4.0f, 4.5f);
/* 597 */                   oO0Ii1I000II.I0000Il00O();
/* 602 */                   oO0Ii1I000II.I000OiO(4.0f, 16.5f);
/* 608 */                   oO0Ii1I000II.I0000oI00(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f);
/* 616 */                   oO0Ii1I000II.I000lI(0.68f, 1.5f, 1.5f, 1.5f);
/* 624 */                   oO0Ii1I000II.I000lI(1.5f, -0.68f, 1.5f, -1.5f);
/* 630 */                   oO0Ii1I000II.I000lI(-0.67f, -1.5f, -1.5f, -1.5f);
/* 633 */                   oO0Ii1I000II.I0000Il00O();
/* 640 */                   oO0Ii1I000II.I000OiO(7.0f, 19.0f);
/* 645 */                   oO0Ii1I000II.I000II(14.0f);
/* 650 */                   oO0Ii1I000II.I000oI1ioi(-2.0f);
/* 655 */                   oO0Ii1I000II.I000O01llI0(7.0f, 17.0f);
/* 660 */                   oO0Ii1I000II.I000oI1ioi(2.0f);
/* 663 */                   oO0Ii1I000II.I0000Il00O();
/* 668 */                   iOioOOi0I = iOioOOi0I3;
/* 672 */                   IIlIOloOOO.I001i1O0Ol(oO0Ii1I000II, 7.0f, 13.0f, 14.0f, -2.0f);
/* 677 */                   oO0Ii1I000II.I000O01llI0(7.0f, 11.0f);
/* 682 */                   oO0Ii1I000II.I000oI1ioi(2.0f);
/* 685 */                   oO0Ii1I000II.I0000Il00O();
/* 690 */                   oO0Ii1I000II.I000OiO(7.0f, 5.0f);
/* 693 */                   oO0Ii1I000II.I000oI1ioi(2.0f);
/* 696 */                   oO0Ii1I000II.I000II(14.0f);
/* 701 */                   OooioIOo1.I001i1O0Ol(oO0Ii1I000II, 21.0f, 5.0f, 7.0f, 5.0f);
/* 707 */                   IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000II.I00000oIO, 0, olI00IIlOO);
/* 710 */                   ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 714 */                   ililIi.I00000oIO = ioiOolO1iOoI0000O;
                        }
/* 753 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, Ol0iOOO0.I000lI(o1ooIo101ll, 16.0f), liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, iloI0lOlll13, 432, 0);
/* 762 */               lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 6.0f));
/* 849 */               IOioOOi0I iOioOOi0I6 = iOioOOi0I;
/* 863 */               Oo0i1oIIoOO.I00000oOI(str3, null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000o00OoI0I, iloI0lOlll1, 0, 24960, 110586);
/* 868 */               iloI0lOlll1.I0010I0i(true);
/* 875 */               O0io1O o0io1O = new O0io1O(1.0f, true);
/* 882 */               OIo1i1 oIo1i1 = new OIo1i1(12.0f, 8.0f, 12.0f, 8.0f);
/* 885 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 901 */               boolean zI000II3 = iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000II(oI10i0IlI00000oOI2);
/* 902 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii5;
/* 908 */               if (zI000II3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 916 */                   I0IoiIiOoi i0IoiIiOoi = new I0IoiIiOoi(10);
/* 919 */                   i0IoiIiOoi.I00iiI = oI10i0IlI00000oOI;
/* 921 */                   i0IoiIiOoi.I00iiO = oI10i0IlI00000oOI2;
/* 923 */                   VarHandle.storeStoreFence();
/* 926 */                   iloI0lOlll1.I00iio(i0IoiIiOoi);
                            obj3 = i0IoiIiOoi;
                        }
/* 942 */               l0oIiiI1O0o.I00000oIO(o0io1O, o0o0I1i0O, oIo1i1, i1IioII0000oI00, null, null, false, null, (Function1) obj3, iloI0lOlll1, 24960, 488);
/* 965 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(iO01II.I000II(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 8.0f, 8.0f), 0.0f, 0.0f, 0.0f, ii0l0Olio10.I00000oOI, 7);
/* 975 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(i1IiOI0, i1O01oOIoI0I.I00lll10, iloI0lOlll1, 48);
/* 981 */               int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 985 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 989 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 993 */               iloI0lOlll1.I00i0oil();
/* 998 */               if (iloI0lOlll1.I00O10llo) {
/* 1002 */                  iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 1008 */                  iloI0lOlll1.I00io1l();
                        }
/* 1012 */              li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO2);
/* 1017 */              li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, oO0lO0l0I000lI3);
/* 1022 */              IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 1027 */              li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 1034 */              String str4 = (String) oI10i0Il.getValue();
/* 1043 */              O0io1O o0io1O2 = new O0io1O(1.0f, true);
/* 1048 */              OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(24.0f);
/* 1057 */              O0OO00iO o0OO00iO = new O0OO00iO(4, 119);
/* 1073 */              boolean zI000II4 = iloI0lOlll1.I000II(oI10i0IlI00000oOI2) | iloI0lOlll1.I000OOo1O(oOl1OlI0) | iloI0lOlll1.I000OOo1O(ii0l0Olio10);
/* 1074 */              Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 1078 */              if (zI000II4 || objI00O0i0ii6 == iOO0o0I1l) {
/* 1092 */                  I0O1IO i0o1io = new I0O1IO(20);
/* 1097 */                  i0o1io.I00iiI = oOl1OlI0;
/* 1099 */                  i0o1io.I00iiO = ii0l0Olio10;
/* 1101 */                  oI10i0Il2 = oI10i0Il;
/* 1103 */                  i0o1io.I00ilI0I1 = oI10i0Il2;
/* 1105 */                  i0o1io.I00iio = oI10i0IlI00000oOI2;
/* 1107 */                  VarHandle.storeStoreFence();
/* 1110 */                  iloI0lOlll1.I00iio(i0o1io);
                            obj = i0o1io;
                        } else {
/* 1085 */                  oI10i0Il2 = oI10i0Il;
                            obj = objI00O0i0ii6;
                        }
/* 1120 */              O0OO00i o0OO00i = new O0OO00i(null, (Function1) obj, 31);
                        boolean z2 = !((Boolean) oI10i0IlI00000oOI2.getValue()).booleanValue();
/* 1134 */              Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii7;
/* 1138 */              if (objI00O0i0ii7 == iOO0o0I1l) {
/* 1144 */                  O1i0lolo o1i0lolo = new O1i0lolo(9);
/* 1147 */                  o1i0lolo.I00iiI = oI10i0Il2;
/* 1149 */                  VarHandle.storeStoreFence();
/* 1152 */                  iloI0lOlll1.I00iio(o1i0lolo);
                            obj4 = o1i0lolo;
                        }
/* 1168 */              OI10i0Il oI10i0Il5 = oI10i0Il2;
/* 1202 */              l1liIOil0i1o.I00000oOI(str4, (Function1) obj4, o0io1O2, z2, false, null, null, i1oIli1o0ilo.I000O01llI0, null, null, null, false, null, o0OO00iO, o0OO00i, false, 4, 0, oiI111II00000oOI, null, iloI0lOlll1, 12582960, 100859904, 5930864);
/* 1205 */              IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 1211 */              lOO1OIO00.I00000oIO(iloI0lOlll14, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 1224 */              boolean zI000II5 = iloI0lOlll14.I000II(oI10i0IlI00000oOI2) | iloI0lOlll1.I000OOo1O(oOl1OlI0);
/* 1225 */              ii0l0Olio102 = ii0l0Olio10;
/* 1231 */              boolean zI000OOo1O = zI000II5 | iloI0lOlll14.I000OOo1O(ii0l0Olio102);
/* 1232 */              Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
/* 1236 */              if (zI000OOo1O || objI00O0i0ii8 == iOO0o0I1l) {
/* 1252 */                  I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(25);
/* 1255 */                  oOl1OlI02 = oOl1OlI0;
/* 1257 */                  i0IoO01lIoO.I00iiI = oOl1OlI02;
/* 1259 */                  i0IoO01lIoO.I00iio = ii0l0Olio102;
/* 1261 */                  oI10i0Il3 = oI10i0Il5;
/* 1263 */                  i0IoO01lIoO.I00iiO = oI10i0Il3;
/* 1265 */                  i0IoO01lIoO.I00ilI0I1 = oI10i0IlI00000oOI2;
/* 1267 */                  VarHandle.storeStoreFence();
/* 1270 */                  iloI0lOlll14.I00iio(i0IoO01lIoO);
                            obj2 = i0IoO01lIoO;
                        } else {
/* 1243 */                  oOl1OlI02 = oOl1OlI0;
/* 1245 */                  oI10i0Il3 = oI10i0Il5;
                            obj2 = objI00O0i0ii8;
                        }
/* 1273 */              IllOOo00lI illOOo00lI = (IllOOo00lI) obj2;
/* 1277 */              O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, 48.0f);
/* 1291 */              if (OlOoOIi0o.I001l0I00((String) oI10i0Il3.getValue()) || ((Boolean) oI10i0IlI00000oOI2.getValue()).booleanValue()) {
/* 1327 */                  iloI0lOlll14.I00i01iIIliI(-590549194);
/* 1334 */                  j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll14).I0010I0i;
/* 1336 */                  iloI0lOlll14.I0010I0i(false);
                        } else {
/* 1308 */                  iloI0lOlll14.I00i01iIIliI(-590551601);
/* 1315 */                  j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll14).I00000oIO;
/* 1318 */                  iloI0lOlll14.I0010I0i(false);
                        }
/* 1321 */              long j2 = j;
/* 1344 */              IloIo1011 iloIo1011 = new IloIo1011(8);
/* 1347 */              iloIo1011.I00iiI = oI10i0Il3;
/* 1349 */              iloIo1011.I00iiO = oI10i0IlI00000oOI2;
/* 1351 */              VarHandle.storeStoreFence();
/* 1370 */              IlOii10.I00000oIO(illOOo00lI, o1ooiI111iI000lI, null, j2, 0L, null, iiioOl1O.I00000oOI(217005766, iloIo1011, iloI0lOlll14), iloI0lOlll14, 12582960, 116);
/* 1373 */              i3 = 1;
/* 1374 */              iloI0lOlll14.I0010I0i(true);
/* 1377 */              iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 1381 */              ii0l0Olio102 = ii0l0Olio10;
/* 1382 */              oOl1OlI02 = oOl1OlI0;
/* 1383 */              i3 = 1;
/* 1384 */              iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 1387 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1391 */          if (oOloioIlI001IO000 != null) {
/* 1395 */              OOl0lo11loIO oOl0lo11loIO = new OOl0lo11loIO(i3);
/* 1398 */              oOl0lo11loIO.I00iiI = oOl1OlI02;
/* 1400 */              oOl0lo11loIO.I00iiO = ii0l0Olio102;
/* 1404 */              oOl0lo11loIO.I00iio = i;
/* 1406 */              VarHandle.storeStoreFence();
/* 1409 */              oOloioIlI001IO000.I0000O = oOl0lo11loIO;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0288  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0303  */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v2, types: [int] */
                /* JADX WARN: Type inference failed for: r1v32 */
                /* JADX WARN: Type inference failed for: r1v33 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I000II(int i, Ii0l0Olio10 ii0l0Olio10, IloI0lOlll1 iloI0lOlll1, OOl1OlI0 oOl1OlI0) {
                    int i2;
                    OOl1OlI0 oOl1OlI02;
                    ?? r1;
                    IloI0lOlll1 iloI0lOlll12;
                    IOO0o0I1l iOO0o0I1l;
                    OI10i0Il oI10i0Il;
                    O1OIi1 o1OIi1;
                    boolean z;
                    boolean z2;
                    IloI0lOlll1 iloI0lOlll13;
                    IOO0o0I1l iOO0o0I1l2;
                    Object obj;
/* 3 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 10 */            iloI0lOlll14.I00i0O(-521637750);
/* 15 */            if ((i & 6) == 0) {
/* 26 */                i2 = i | (iloI0lOlll1.I000OOo1O(oOl1OlI0) ? 4 : 2);
                    } else {
/* 29 */                i2 = i;
                    }
/* 33 */            if ((i & 48) == 0) {
/* 46 */                i2 |= iloI0lOlll14.I000OOo1O(ii0l0Olio10) ? 32 : 16;
                    }
/* 52 */            int i3 = 1;
/* 63 */            if (iloI0lOlll14.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 67 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(oOl1OlI0.I0001Ioi1lo, iloI0lOlll14);
/* 73 */                OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(oOl1OlI0.I000O01llI0, iloI0lOlll14);
/* 79 */                OI10i0Il oI10i0IlI00000oOI3 = lOIoiooI1i01.I00000oOI(oOl1OlI0.I00100l0, iloI0lOlll14);
/* 89 */                Context context = (Context) iloI0lOlll14.I000iOII(I0lloOI0oio.I00000oOI);
/* 91 */                float f = ii0l0Olio10.I00000oOI;
/* 93 */                O1ol100o0O o1ol100o0O = ii0l0Olio10.I00000oIO;
/* 95 */                Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 99 */                IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 101 */               if (objI00O0i0ii == iOO0o0I1l3) {
/* 104 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(null);
/* 108 */                   iloI0lOlll14.I00iio(objI00O0i0ii);
                        }
/* 111 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii;
/* 113 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 117 */               if (objI00O0i0ii2 == iOO0o0I1l3) {
/* 121 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO("");
/* 125 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 128 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 132 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(i3);
/* 143 */               boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(oOl1OlI0);
/* 145 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
/* 149 */               if (zI000OOo1O || objI00O0i0ii3 == iOO0o0I1l3) {
/* 157 */                   O1lIIi o1lIIi = new O1lIIi(25);
/* 160 */                   o1lIIi.I00iiI = context;
/* 162 */                   o1lIIi.I00iiO = oOl1OlI0;
/* 164 */                   VarHandle.storeStoreFence();
/* 167 */                   iloI0lOlll14.I00iio(o1lIIi);
                            obj2 = o1lIIi;
                        }
/* 172 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll14, 0);
/* 176 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 180 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 189 */               int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 193 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 197 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii1);
/* 203 */               IOl0oi0lOl1.I000lI.getClass();
/* 206 */               iloI0lOlll14.I00i0oil();
/* 211 */               boolean z3 = iloI0lOlll14.I00O10llo;
/* 215 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 217 */               if (z3) {
/* 219 */                   iloI0lOlll14.I000l1(iloi111);
                        } else {
/* 225 */                   iloI0lOlll14.I00io1l();
                        }
/* 229 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 231 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, o1iOIl0o10I0000Il00O);
/* 234 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 236 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI);
/* 239 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 245 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 247 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll14, numValueOf);
/* 250 */               li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 253 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 255 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 267 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll14, 0);
/* 273 */               int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 277 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 281 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii1);
/* 285 */               iloI0lOlll14.I00i0oil();
/* 290 */               if (iloI0lOlll14.I00O10llo) {
/* 292 */                   iloI0lOlll14.I000l1(iloi111);
                        } else {
/* 296 */                   iloI0lOlll14.I00io1l();
                        }
/* 299 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO);
/* 302 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI2);
/* 305 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 308 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O2);
/* 321 */               boolean z4 = ((OOl0llI) oI10i0IlI00000oOI2.getValue()) != null;
/* 326 */               I0illI1iI i0illI1iI = new I0illI1iI(15);
/* 329 */               i0illI1iI.I00iiI = oOl1OlI0;
/* 331 */               i0illI1iI.I00iiO = oI10i0IlI00000oOI2;
/* 333 */               VarHandle.storeStoreFence();
/* 370 */               O1OooO0IlOo.I0000O(z4, null, null, null, null, iiioOl1O.I00000oOI(299863390, i0illI1iI, iloI0lOlll14), iloI0lOlll14, 1572870, 30);
/* 377 */               String str = (String) oI10i0IlI00000oOI3.getValue();
/* 379 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oOl1OlI0);
/* 383 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
                        Object obj3 = objI00O0i0ii4;
/* 387 */               if (zI000OOo1O2 || objI00O0i0ii4 == iOO0o0I1l3) {
/* 395 */                   OIoO1Ol oIoO1Ol = new OIoO1Ol(11);
/* 398 */                   oIoO1Ol.I00iiI = oOl1OlI0;
/* 400 */                   VarHandle.storeStoreFence();
/* 403 */                   iloI0lOlll14.I00iio(oIoO1Ol);
                            obj3 = oIoO1Ol;
                        }
/* 409 */               I0000oI00(o1ol100o0O, str, (Function1) obj3, iloI0lOlll14, 0);
/* 422 */               int i4 = 21;
/* 424 */               if (((List) oI10i0IlI00000oOI.getValue()).isEmpty() && ((OOl0llI) oI10i0IlI00000oOI2.getValue()) == null) {
/* 437 */                   iloI0lOlll14.I00i01iIIliI(273319458);
/* 441 */                   I00000oOI(ilIl1Io0lii1, iloI0lOlll14, 6);
/* 445 */                   iloI0lOlll14.I0010I0i(false);
/* 448 */                   z2 = false;
/* 449 */                   oI10i0Il = oI10i0Il3;
/* 451 */                   iOO0o0I1l = iOO0o0I1l3;
/* 453 */                   o1OIi1 = o1OIi1I00000oIO;
/* 455 */                   z = true;
/* 456 */                   iloI0lOlll13 = iloI0lOlll14;
                        } else {
/* 461 */                   iloI0lOlll14.I00i01iIIliI(273438095);
/* 474 */                   OIo1i1 oIo1i1 = new OIo1i1(16.0f, 12.0f, 16.0f, f + 88.0f);
/* 479 */                   I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(10.0f);
/* 491 */                   boolean zI000II = iloI0lOlll14.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(oOl1OlI0);
/* 492 */                   Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                            Object obj4 = objI00O0i0ii5;
/* 496 */                   if (zI000II || objI00O0i0ii5 == iOO0o0I1l3) {
/* 502 */                       I0O1IO i0o1io = new I0O1IO(i4);
/* 505 */                       i0o1io.I00ilI0I1 = oI10i0IlI00000oOI;
/* 507 */                       i0o1io.I00iiI = oOl1OlI0;
/* 509 */                       i0o1io.I00iiO = oI10i0Il2;
/* 511 */                       i0o1io.I00iio = oI10i0Il3;
/* 513 */                       VarHandle.storeStoreFence();
/* 516 */                       iloI0lOlll14.I00iio(i0o1io);
                                obj4 = i0o1io;
                            }
/* 536 */                   iOO0o0I1l = iOO0o0I1l3;
/* 538 */                   oI10i0Il = oI10i0Il3;
/* 540 */                   o1OIi1 = o1OIi1I00000oIO;
/* 542 */                   z = true;
/* 543 */                   IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 545 */                   l0oIiiI1O0o.I00000oIO(null, null, oIo1i1, i1IioII0000oI00, null, null, false, null, (Function1) obj4, iloI0lOlll15, 24576, 491);
/* 548 */                   z2 = false;
/* 549 */                   iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 552 */               iloI0lOlll13.I0010I0i(z);
/* 555 */               boolean zI000OOo1O3 = iloI0lOlll13.I000OOo1O(o1OIi1);
/* 559 */               Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
/* 563 */               if (zI000OOo1O3) {
/* 570 */                   iOO0o0I1l2 = iOO0o0I1l;
                        } else {
/* 565 */                   iOO0o0I1l2 = iOO0o0I1l;
                            obj = objI00O0i0ii6;
/* 567 */                   if (objI00O0i0ii6 == iOO0o0I1l2) {
                            }
/* 619 */                   boolean z5 = z2;
/* 630 */                   IOO0o0I1l iOO0o0I1l4 = iOO0o0I1l2;
/* 635 */                   IlOii10.I00000oIO((IllOOo00lI) obj, iO01II.I000OiO(II1oili.I00000oIO.I00000oOI(O1ooIo101ll.I00000oIO, i1O01oOIoI0I.I00li1OI), 0.0f, 0.0f, 16.0f, f + 24.0f, 3), null, 0L, 0L, null, i1oIli1o0ilo.I00000oIO, iloI0lOlll13, 12582912, 124);
/* 638 */                   iloI0lOlll13.I0010I0i(z);
/* 647 */                   if (((String) oI10i0Il2.getValue()) == null) {
/* 652 */                       iloI0lOlll13.I00i01iIIliI(-915451269);
/* 655 */                       Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
/* 659 */                       int i5 = 7;
                                Object obj5 = objI00O0i0ii7;
/* 660 */                       if (objI00O0i0ii7 == iOO0o0I1l4) {
/* 664 */                           OI1oil oI1oil = new OI1oil(i5);
/* 667 */                           oI1oil.I00iiI = oI10i0Il2;
/* 669 */                           VarHandle.storeStoreFence();
/* 672 */                           iloI0lOlll13.I00iio(oI1oil);
                                    obj5 = oI1oil;
                                }
/* 679 */                       O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(i5);
/* 682 */                       o1oiiIIo111o.I00iiI = oOl1OlI0;
/* 684 */                       o1oiiIIo111o.I00iiO = oI10i0Il2;
/* 686 */                       VarHandle.storeStoreFence();
/* 692 */                       IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-778600803, o1oiiIIo111o, iloI0lOlll13);
/* 700 */                       IloIlOOIi iloIlOOIi = new IloIlOOIi(21);
/* 703 */                       iloIlOOIi.I00iiI = oI10i0Il2;
/* 705 */                       VarHandle.storeStoreFence();
/* 711 */                       IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1380483291, iloIlOOIi, iloI0lOlll13);
/* 719 */                       IloIlOOIi iloIlOOIi2 = new IloIlOOIi(20);
/* 724 */                       iloIlOOIi2.I00iiI = oI10i0Il;
/* 726 */                       VarHandle.storeStoreFence();
/* 732 */                       IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(324142136, iloIlOOIi2, iloI0lOlll13);
/* 757 */                       boolean z6 = z5;
/* 761 */                       oOl1OlI02 = oOl1OlI0;
/* 763 */                       iOIil10l.I00000oIO((IllOOo00lI) obj5, iOii1lI00000oOI, null, iOii1lI00000oOI2, null, i1oIli1o0ilo.I0000O, iOii1lI00000oOI3, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 766 */                       IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 768 */                       iloI0lOlll16.I0010I0i(z6);
                                r1 = z6;
                                iloI0lOlll12 = iloI0lOlll16;
                            } else {
/* 772 */                       oOl1OlI02 = oOl1OlI0;
/* 773 */                       boolean z7 = z5;
/* 778 */                       iloI0lOlll13.I00i01iIIliI(-914869864);
/* 781 */                       iloI0lOlll13.I0010I0i(z7);
                                r1 = z7;
                                iloI0lOlll12 = iloI0lOlll13;
                            }
                        }
/* 576 */               I0O1I11 i0o1i11 = new I0O1I11(19);
/* 579 */               i0o1i11.I00iiI = o1OIi1;
/* 581 */               VarHandle.storeStoreFence();
/* 584 */               iloI0lOlll13.I00iio(i0o1i11);
                        obj = i0o1i11;
/* 619 */               boolean z52 = z2;
/* 630 */               IOO0o0I1l iOO0o0I1l42 = iOO0o0I1l2;
/* 635 */               IlOii10.I00000oIO((IllOOo00lI) obj, iO01II.I000OiO(II1oili.I00000oIO.I00000oOI(O1ooIo101ll.I00000oIO, i1O01oOIoI0I.I00li1OI), 0.0f, 0.0f, 16.0f, f + 24.0f, 3), null, 0L, 0L, null, i1oIli1o0ilo.I00000oIO, iloI0lOlll13, 12582912, 124);
/* 638 */               iloI0lOlll13.I0010I0i(z);
/* 647 */               if (((String) oI10i0Il2.getValue()) == null) {
                        }
                    } else {
/* 785 */               oOl1OlI02 = oOl1OlI0;
/* 786 */               r1 = 0;
/* 787 */               iloI0lOlll14.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 790 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 794 */           if (oOloioIlI001IO000 != null) {
/* 798 */               OOl0lo11loIO oOl0lo11loIO = new OOl0lo11loIO(r1);
/* 801 */               oOl0lo11loIO.I00iiI = oOl1OlI02;
/* 805 */               oOl0lo11loIO.I00iiO = ii0l0Olio10;
/* 809 */               oOl0lo11loIO.I00iio = i;
/* 811 */               VarHandle.storeStoreFence();
/* 814 */               oOloioIlI001IO000.I0000O = oOl0lo11loIO;
                    }
                }

                public static final void I000O01llI0(int i, Ii0l0Olio10 ii0l0Olio10, IloI0lOlll1 iloI0lOlll1, OOl1OlI0 oOl1OlI0) {
                    Ii0l0Olio10 ii0l0Olio102;
/* 4 */             iloI0lOlll1.I00i0O(926294553);
/* 11 */            int i2 = 4;
/* 18 */            int i3 = (iloI0lOlll1.I000OOo1O(ii0l0Olio10) ? 4 : 2) | i | 16;
/* 37 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 39 */                iloI0lOlll1.I00Ol00();
/* 43 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 59 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll1);
/* 63 */                    if (oool1Ii0II00000oIO == null) {
/* 250 */                       I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 253 */                       return;
                            }
/* 90 */                    oOl1OlI0 = (OOl1OlI0) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(OOl1OlI0.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll1), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll1);
                        } else {
/* 52 */                    iloI0lOlll1.I00OilO00Il();
                        }
/* 55 */                int i4 = i3 & (-113);
/* 57 */                OOl1OlI0 oOl1OlI02 = oOl1OlI0;
/* 93 */                iloI0lOlll1.I0010o();
/* 98 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(oOl1OlI02.I000OiO, iloI0lOlll1);
/* 102 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii0l0Olio10);
/* 106 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 110 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 112 */               if (zI000OOo1O || objI00O0i0ii == obj) {
/* 120 */                   OIoO1Ol oIoO1Ol = new OIoO1Ol(10);
/* 123 */                   oIoO1Ol.I00iiI = ii0l0Olio10;
/* 125 */                   VarHandle.storeStoreFence();
/* 128 */                   iloI0lOlll1.I00iio(oIoO1Ol);
                            obj2 = oIoO1Ol;
                        }
/* 135 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj2, iloI0lOlll1);
/* 142 */               OOl1IO oOl1IO = (OOl1IO) oI10i0IlI00000oOI.getValue();
/* 157 */               boolean zI000II = iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(ii0l0Olio10) | iloI0lOlll1.I000OOo1O(oOl1OlI02);
/* 158 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 162 */               if (zI000II || objI00O0i0ii2 == obj) {
/* 173 */                   ii0l0Olio102 = ii0l0Olio10;
/* 174 */                   Object oOl11O0ii0II = new OOl11O0ii0II(ii0l0Olio102, oI10i0IlI00000oOI, oOl1OlI02, null, 0);
/* 177 */                   iloI0lOlll1.I00iio(oOl11O0ii0II);
/* 180 */                   objI00O0i0ii2 = oOl11O0ii0II;
                        } else {
/* 167 */                   ii0l0Olio102 = ii0l0Olio10;
                        }
/* 183 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, oOl1IO);
/* 190 */               OOl1IO oOl1IO2 = (OOl1IO) oI10i0IlI00000oOI.getValue();
/* 194 */               if (oOl1IO2 instanceof OOl11o1IO0o) {
/* 199 */                   iloI0lOlll1.I00i01iIIliI(1110855117);
/* 206 */                   I000II((i4 << 3) & 112, ii0l0Olio102, iloI0lOlll1, oOl1OlI02);
/* 209 */                   iloI0lOlll1.I0010I0i(false);
                        } else if (!(oOl1IO2 instanceof OOl11i0l)) {
/* 238 */                   iloI0lOlll1.I00i01iIIliI(1110853409);
/* 241 */                   iloI0lOlll1.I0010I0i(false);
/* 244 */                   I000II.I00000oIO();
/* 247 */                   return;
                        } else {
/* 220 */                   iloI0lOlll1.I00i01iIIliI(1110857898);
/* 227 */                   I0001Ioi1lo((i4 << 3) & 112, ii0l0Olio102, iloI0lOlll1, oOl1OlI02);
/* 230 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 233 */               oOl1OlI0 = oOl1OlI02;
                    } else {
/* 254 */               ii0l0Olio102 = ii0l0Olio10;
/* 255 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 258 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 262 */           if (oOloioIlI001IO000 != null) {
/* 266 */               O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(i2);
/* 269 */               o1oiiIIo111o.I00iiI = ii0l0Olio102;
/* 271 */               o1oiiIIo111o.I00iiO = oOl1OlI0;
/* 273 */               VarHandle.storeStoreFence();
/* 276 */               oOloioIlI001IO000.I0000O = o1oiiIIo111o;
                    }
                }

                public static final void I000OOo1O(Oi10ooi oi10ooi, IloI0lOlll1 iloI0lOlll1, int i) {
/* 8 */             iloI0lOlll1.I00i0O(1633825511);
/* 21 */            int i2 = i | (iloI0lOlll1.I000II(oi10ooi) ? 4 : 2);
/* 36 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 59 */                String str = String.format(Locale.US, "%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(oi10ooi.I0000Il00O * 100.0f)}, 1));
/* 63 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 69 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 75 */                    objI00O0i0ii = new O1olloI0OlO(20);
/* 78 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 81 */                IllOOo00lI illOOo00lI = (IllOOo00lI) objI00O0i0ii;
/* 86 */                O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(6);
/* 89 */                o1oiiIIo111o.I00iiI = str;
/* 91 */                o1oiiIIo111o.I00iiO = oi10ooi;
/* 93 */                VarHandle.storeStoreFence();
/* 99 */                IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(734185385, o1oiiIIo111o, iloI0lOlll1);
/* 103 */               float f = OliOll.I00000oIO;
/* 105 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 115 */               long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I000l1;
/* 125 */               long j2 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I000lI;
/* 127 */               long j3 = IOOiio0i.I000o00OoI0I;
/* 137 */               IOI111 ioi111I000O01llI0 = IOIIio0.I000O01llI0(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO);
/* 145 */               if (j == 16) {
/* 149 */                   j = ioi111I000O01llI0.I00000oIO;
                        }
/* 147 */               long j4 = j;
/* 154 */               if (j2 == 16) {
/* 159 */                   j2 = ioi111I000O01llI0.I00000oOI;
                        }
/* 156 */               long j5 = j2;
/* 169 */               long j6 = j3 != 16 ? j3 : ioi111I000O01llI0.I0000Il00O;
/* 178 */               long j7 = j3 != 16 ? j3 : ioi111I000O01llI0.I0000O;
/* 187 */               long j8 = j3 != 16 ? j3 : ioi111I000O01llI0.I0000oI00;
/* 196 */               long j9 = j3 != 16 ? j3 : ioi111I000O01llI0.I0001Ioi1lo;
/* 205 */               long j10 = j3 != 16 ? j3 : ioi111I000O01llI0.I000II;
/* 209 */               if (j3 == 16) {
/* 214 */                   j3 = ioi111I000O01llI0.I000O01llI0;
                        }
/* 237 */               IOIIio0.I000II(illOOo00lI, iOii1lI00000oOI, null, false, null, new IOI111(j4, j5, j6, j7, j8, j9, j10, j3), null, null, null, null, iloI0lOlll1, 54, 4028);
                    } else {
/* 241 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 244 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 248 */           if (oOloioIlI001IO000 != null) {
/* 254 */               O1IIii o1IIii = new O1IIii(17);
/* 257 */               o1IIii.I00iiI = oi10ooi;
/* 259 */               VarHandle.storeStoreFence();
/* 262 */               oOloioIlI001IO000.I0000O = o1IIii;
                    }
                }
            }
