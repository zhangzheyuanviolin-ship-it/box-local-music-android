            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OollloolI {
                public static final OIo1i1 I00000oIO = new OIo1i1(16.0f, 8.0f, 16.0f, 8.0f);

                /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(String str, Oo0lloOiiIOI oo0lloOiiIOI, float f, O1ooiI111i o1ooiI111i, OloOOIoO1ii1 oloOOIoO1ii1, float f2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
                    float f3;
                    IloI0lOlll1 iloI0lOlll12;
/* 3 */             Oo0lloOiiIOI oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 9 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 14 */            iloI0lOlll13.I00i0O(-676935853);
/* 27 */            int i3 = i | (iloI0lOlll13.I000II(str) ? 4 : 2);
/* 31 */            if ((i & 48) == 0) {
/* 44 */                i3 |= iloI0lOlll13.I000II(oo0lloOiiIOI2) ? 32 : 16;
                    }
/* 73 */            int i4 = i3 | (iloI0lOlll13.I0000O(f) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | 3072 | (iloI0lOlll13.I000II(oloOOIoO1ii1) ? 16384 : 8192) | 196608;
/* 94 */            if (iloI0lOlll13.I00OIl(i4 & 1, (74899 & i4) != 74898)) {
/* 98 */                float f4 = 1.5f * f;
/* 143 */               O0oo1oi0oil o0oo1oi0oilI000OiO = i1O10l1io1iO.I000OiO(new OIoi0IIoi[]{new OIoi0IIoi(Float.valueOf(f4 - 0.5f), IOOiio0i.I00000oIO(IOOiio0i.I000lI)), new OIoi0IIoi(Float.valueOf(f4), IOOiio0i.I00000oIO(IOOiio0i.I000II))}, 0L, 0L, 14);
/* 152 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 167 */               O1ooiI111i o1ooiI111iI00000oOI = iIlll1lo.I00000oOI(o1ooIo101ll, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, false, 983035);
/* 172 */               boolean zI000II = iloI0lOlll13.I000II(o0oo1oi0oilI000OiO);
/* 176 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 180 */               if (!zI000II) {
                            Object obj = objI00O0i0ii;
/* 184 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 190 */                       Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(19);
/* 193 */                       ol1OiIli00Ii.I00iiI = o0oo1oi0oilI000OiO;
/* 195 */                       VarHandle.storeStoreFence();
/* 198 */                       iloI0lOlll13.I00iio(ol1OiIli00Ii);
                                obj = ol1OiIli00Ii;
                            }
/* 203 */                   O1ooiI111i o1ooiI111iI0000Il00O = iIO01l11OlO.I0000Il00O(o1ooiI111iI00000oOI, (Function1) obj);
/* 209 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 215 */                   int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 219 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 223 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 229 */                   IOl0oi0lOl1.I000lI.getClass();
/* 232 */                   iloI0lOlll13.I00i0oil();
/* 237 */                   if (iloI0lOlll13.I00O10llo) {
/* 241 */                       iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 245 */                       iloI0lOlll13.I00io1l();
                            }
/* 250 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 255 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 264 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 267 */                   li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 272 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 342 */                   Oo0i1oIIoOO.I00000oOI(str, iO01II.I000O01llI0(o1ooIo101ll, 16.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, oloOOIoO1ii1, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, i4 & 14, ((i4 >> 12) & 14) | ((i4 << 18) & 29360128), 130044);
/* 345 */                   oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 347 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 349 */                   i2 = 1;
/* 350 */                   iloI0lOlll14.I0010I0i(true);
/* 353 */                   f3 = 0.5f;
/* 355 */                   o1ooiI111i2 = o1ooIo101ll;
                            iloI0lOlll12 = iloI0lOlll14;
                        }
                    } else {
/* 358 */               i2 = 1;
/* 359 */               iloI0lOlll13.I00OilO00Il();
/* 362 */               o1ooiI111i2 = o1ooiI111i;
/* 364 */               f3 = f2;
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 366 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 370 */           if (oOloioIlI001IO000 != null) {
/* 374 */               Olllii000 olllii000 = new Olllii000(i2);
/* 377 */               olllii000.I00ilI0I1 = str;
/* 379 */               olllii000.I00ilO0 = oo0lloOiiIOI2;
/* 383 */               olllii000.I00iiI = f;
/* 385 */               olllii000.I00io1l = o1ooiI111i2;
/* 387 */               olllii000.I00ioIO = oloOOIoO1ii1;
/* 389 */               olllii000.I00iiO = f3;
/* 393 */               olllii000.I00iio = i;
/* 395 */               VarHandle.storeStoreFence();
/* 398 */               oOloioIlI001IO000.I0000O = olllii000;
                    }
                }

                public static String I00000oOI(int i, long j) {
/* 7 */             boolean z = (i & 2) == 0;
/* 12 */            if (j < 1000) {
/* 27 */                return j + " B";
                    }
                    double d = j;
/* 47 */            int iLog = (int) (Math.log(d) / Math.log(1000.0d));
/* 69 */            String str = "kMGTPE".charAt(iLog - 1) + "";
/* 120 */           return String.format((!z || str.toLowerCase(Locale.ROOT).equals("k") || str.equals("M")) ? "%.1f %sB" : "%.2f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(1000.0d, iLog)), str}, 2));
                }

                public static final float I0000Il00O(long j, int i, String str, IloI0lOlll1 iloI0lOlll1, int i2) {
/* 1 */             Ii0i0o1lliO1 ii0i0o1lliO1 = IioO00o.I00000oIO;
/* 3 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 7 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 9 */             if (objI00O0i0ii == iOO0o0I1l) {
/* 13 */                objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 17 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 20 */            OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 51 */            OlO01l1oOil olO01l1oOilI00000oOI = I10i0IOl.I00000oOI(((Boolean) oI10i0Il.getValue()).booleanValue() ? 1.0f : 0.0f, iOO01lio0.I0000O(i, 2, ii0i0o1lliO1), str, iloI0lOlll1, 3072, 20);
/* 74 */            boolean z = (((i2 & 14) ^ 6) > 4 && iloI0lOlll1.I0001Ioi1lo(j)) || (i2 & 6) == 4;
/* 75 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 79 */            if (z || objI00O0i0ii2 == iOO0o0I1l) {
/* 89 */                I10I1l i10I1l = new I10I1l(j, oI10i0Il, (IOoil1iiIilo) null, 7);
/* 92 */                iloI0lOlll1.I00iio(i10I1l);
/* 95 */                objI00O0i0ii2 = i10I1l;
                    }
/* 100 */           iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, OoiIlOl1iI.I00000oIO);
/* 109 */           return ((Number) olO01l1oOilI00000oOI.getValue()).floatValue();
                }
            }
