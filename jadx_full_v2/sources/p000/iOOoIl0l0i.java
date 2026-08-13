            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Locale;
            
            public abstract class iOOoIl0l0i {
                public static final void I00000oIO(String str, Ooo010llO ooo010llO, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
/* 14 */            iloI0lOlll1.I00i0O(-1375817921);
/* 19 */            int i4 = 4;
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 34 */                i2 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i2 |= iloI0lOlll1.I000II(ooo010llO) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 66 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 82 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 85 */                Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll1);
/* 99 */                long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100l0;
/* 103 */               I0illI1iI i0illI1iI = new I0illI1iI(i4);
/* 106 */               i0illI1iI.I00iiI = str;
/* 108 */               i0illI1iI.I00iiO = ooo010llO;
/* 110 */               VarHandle.storeStoreFence();
/* 149 */               i3 = 4;
/* 153 */               l1OloIOiO01.I00000oIO(illOOo00lI, null, ol010000lo00I00000oOI, 0.0f, false, null, j, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(-1204447459, i0illI1iI, iloI0lOlll1), iloI0lOlll1, (i2 >> 6) & 14, 3072, 8122);
                    } else {
/* 157 */               i3 = 4;
/* 158 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 161 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 165 */           if (oOloioIlI001IO000 != null) {
/* 169 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(i3);
/* 172 */               i0IliiililIo.I00iiO = str;
/* 176 */               i0IliiililIo.I00ilI0I1 = ooo010llO;
/* 178 */               i0IliiililIo.I00iio = illOOo00lI;
/* 182 */               i0IliiililIo.I00iiI = i;
/* 184 */               VarHandle.storeStoreFence();
/* 187 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final void I00000oOI(String str, double d, IloI0lOlll1 iloI0lOlll1, int i) {
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(1163230993);
/* 22 */            int i2 = i | (iloI0lOlll12.I0000Il00O(d) ? 32 : 16);
/* 40 */            if (iloI0lOlll12.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 46 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 52 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 56 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 62 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, O1ooIo101ll.I00000oIO);
/* 68 */                IOl0oi0lOl1.I000lI.getClass();
/* 71 */                iloI0lOlll12.I00i0oil();
/* 76 */                if (iloI0lOlll12.I00O10llo) {
/* 80 */                    iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 84 */                    iloI0lOlll12.I00io1l();
                        }
/* 89 */                li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 94 */                li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 103 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 106 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 111 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 132 */               String str2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
/* 136 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 241 */               Oo0i1oIIoOO.I00000oOI(str2, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, i1i0olI.I000OOo1O(lOlilO1lOIO.I0000O(8), lOlilO1lOIO.I0000O(12), lOlilO1lOIO.I0000O(1)), 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 0, 24576, 114674);
/* 288 */               Oo0i1oIIoOO.I00000oOI(str, null, IOOiio0i.I0000Il00O(0.7f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000oI1ioi, iloI0lOlll1, 6, 0, 131066);
/* 291 */               iloI0lOlll12 = iloI0lOlll1;
/* 293 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 297 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 300 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 304 */           if (oOloioIlI001IO000 != null) {
/* 308 */               II0I1II ii0i1ii = new II0I1II();
/* 313 */               ii0i1ii.I00iOIl = str;
/* 317 */               ii0i1ii.I00iiI = d;
/* 319 */               VarHandle.storeStoreFence();
/* 322 */               oOloioIlI001IO000.I0000O = ii0i1ii;
                    }
                }
            }
