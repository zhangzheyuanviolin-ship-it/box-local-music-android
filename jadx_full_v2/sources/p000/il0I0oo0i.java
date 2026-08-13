            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il0I0oo0i {
                public static final void I00000oIO(Float f, IloI0lOlll1 iloI0lOlll1, int i) {
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(1987605186);
/* 51 */            int i2 = i | (iloI0lOlll12.I000II("Decode") ? 4 : 2) | (iloI0lOlll12.I000II(f) ? 32 : 16) | (iloI0lOlll12.I000II("tok/s") ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | 27648;
/* 70 */            if (iloI0lOlll12.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 72 */                Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 78 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 84 */                    objI00O0i0ii = new IO1I11OO(19);
/* 87 */                    iloI0lOlll12.I00iio(objI00O0i0ii);
                        }
/* 92 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 94 */                O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooIo101ll, false, (Function1) objI00O0i0ii);
/* 102 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 108 */               int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 112 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 116 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oOI);
/* 122 */               IOl0oi0lOl1.I000lI.getClass();
/* 125 */               iloI0lOlll12.I00i0oil();
/* 130 */               if (iloI0lOlll12.I00O10llo) {
/* 134 */                   iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 138 */                   iloI0lOlll12.I00io1l();
                        }
/* 143 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 148 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 157 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 160 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 165 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 237 */               Oo0i1oIIoOO.I00000oOI("Decode", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, OoOOIOo00OoI.I00100o1O0lo, iloI0lOlll1, i2 & 14, 12582912, 131070);
/* 245 */               iloI0lOlll1.I00i01iIIliI(-346504892);
/* 264 */               String str = f == null ? "-" : String.format("%.2f", Arrays.copyOf(new Object[]{f}, 1));
/* 271 */               iloI0lOlll1.I00i01iIIliI(-346308073);
/* 283 */               String str2 = str;
/* 333 */               Oo0i1oIIoOO.I00000oOI(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, OoOOIOo00OoI.I0010o, iloI0lOlll1, 0, 12582912, 131070);
/* 337 */               iloI0lOlll12 = iloI0lOlll1;
/* 340 */               iloI0lOlll12.I0010I0i(false);
/* 343 */               iloI0lOlll12.I0010I0i(false);
/* 350 */               if (str2.equals("-")) {
/* 433 */                   iloI0lOlll12.I00i01iIIliI(-346113610);
/* 436 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 355 */                   iloI0lOlll12.I00i01iIIliI(-346205091);
/* 419 */                   Oo0i1oIIoOO.I00000oOI("tok/s", iO0100loIol.I0000Il00O(iOIiO1OII1.I00000oIO(o1ooIo101ll, 0.5f), 0.0f, -1.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, OoOOIOo00OoI.I00100l0, iloI0lOlll12, ((i2 >> 6) & 14) | 48, 12582912, 131068);
/* 422 */                   iloI0lOlll12 = iloI0lOlll12;
/* 424 */                   iloI0lOlll12.I0010I0i(false);
                        }
/* 440 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 444 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 447 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 451 */           if (oOloioIlI001IO000 != null) {
/* 457 */               I00oooO i00oooO = new I00oooO(16);
/* 462 */               i00oooO.I00iiI = f;
/* 464 */               VarHandle.storeStoreFence();
/* 467 */               oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }
            }
