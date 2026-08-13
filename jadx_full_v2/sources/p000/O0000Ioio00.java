            package p000;

            import android.content.Context;
            import android.view.View;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O0000Ioio00 {
                public static final I10I0o1ii10 I00000oIO = new I10I0o1ii10(1);

                public static final void I00000oIO(Function1 function1, O1ooiI111i o1ooiI111i, Function1 function12, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    Function1 function13;
                    O1ooiI111i o1ooiI111i2;
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(-1783766393);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000OOo1O(function1) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 40 */            int i4 = i2 | 384;
/* 57 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 75 */                I10I0o1ii10 i10I0o1ii10 = I00000oIO;
/* 78 */                function13 = function1;
/* 79 */                o1ooiI111i2 = o1ooiI111i;
/* 80 */                iloI0lOlll12 = iloI0lOlll1;
/* 81 */                I00000oOI(function13, o1ooiI111i2, i10I0o1ii10, i10I0o1ii10, iloI0lOlll12, (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344), 4);
/* 84 */                function12 = i10I0o1ii10;
                    } else {
/* 86 */                function13 = function1;
/* 87 */                o1ooiI111i2 = o1ooiI111i;
/* 88 */                iloI0lOlll12 = iloI0lOlll1;
/* 89 */                iloI0lOlll12.I00OilO00Il();
                    }
/* 92 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 96 */            if (oOloioIlI001IO000 != null) {
/* 100 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(i3);
/* 103 */               i0IliiililIo.I00iiO = function13;
/* 105 */               i0IliiililIo.I00iio = o1ooiI111i2;
/* 107 */               i0IliiililIo.I00ilI0I1 = function12;
/* 109 */               i0IliiililIo.I00iiI = i;
/* 111 */               VarHandle.storeStoreFence();
/* 114 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(Function1 function1, O1ooiI111i o1ooiI111i, Function1 function12, Function1 function13, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    Object obj;
                    int i4;
                    Object obj2;
                    OOloioIl oOloioIlI001IO000;
/* 5 */             Object obj3 = function12;
/* 14 */            iloI0lOlll1.I00i0O(-180024211);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(function1) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 35 */            if ((i & 48) == 0) {
/* 48 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 49 */            int i5 = i3 | 384;
/* 53 */            if ((i & 3072) == 0) {
/* 66 */                i5 |= iloI0lOlll1.I000OOo1O(obj3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 67 */            int i6 = i2 & 16;
/* 69 */            if (i6 == 0) {
/* 78 */                if ((i & 24576) == 0) {
/* 80 */                    obj = function13;
/* 93 */                    i5 |= iloI0lOlll1.I000OOo1O(obj) ? 16384 : 8192;
                        }
/* 109 */               if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 9363) == 9362)) {
/* 430 */                   i4 = 1;
/* 431 */                   iloI0lOlll1.I00OilO00Il();
/* 434 */                   obj2 = obj;
                        } else {
/* 116 */                   obj2 = i6 != 0 ? I00000oIO : obj;
/* 119 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 147 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i.I0000O(Ili0l1l01l1.I00000oIO).I0000O(IliIIi1o1.I00000oIO).I0000O(IliIOIIo0Il0.I00000oIO).I0000O(IliI0ili.I00000oIO));
/* 157 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 165 */                   O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 167 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 177 */                   O0oiOi o0oiOi = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 185 */                   OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) iloI0lOlll1.I000iOII(O11oI0.I00000oIO);
/* 190 */                   iloI0lOlll1.I00i01iIIliI(1314774735);
/* 193 */                   int i7 = i5 & 14;
/* 199 */                   int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 209 */                   Object obj4 = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 211 */                   Object objI0000Il00O = iilI1O0il0.I0000Il00O(iloI0lOlll1);
/* 223 */                   Object obj5 = (OiIiol10) iloI0lOlll1.I000iOII(OiIl0oI.I00000oIO);
/* 231 */                   Object obj6 = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 239 */                   int i8 = 6;
/* 280 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj4) | ((((i7 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(function1)) || (i7 & 6) == 4) | iloI0lOlll1.I000OOo1O(objI0000Il00O) | iloI0lOlll1.I000OOo1O(obj5) | iloI0lOlll1.I0000oI00(iHashCode2) | iloI0lOlll1.I000OOo1O(obj6);
/* 281 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 285 */                   if (!zI000OOo1O) {
                                Object obj7 = objI00O0i0ii;
/* 289 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 294 */                           I10OI0 i10oi0 = new I10OI0(0);
/* 297 */                           i10oi0.I00iiO = obj4;
/* 299 */                           i10oi0.I00iio = function1;
/* 301 */                           i10oi0.I00ilI0I1 = objI0000Il00O;
/* 303 */                           i10oi0.I00ilO0 = obj5;
/* 305 */                           i10oi0.I00iiI = iHashCode2;
/* 307 */                           i10oi0.I00io1l = obj6;
/* 309 */                           VarHandle.storeStoreFence();
/* 312 */                           iloI0lOlll1.I00iio(i10oi0);
                                    obj7 = i10oi0;
                                }
/* 315 */                       IllOOo00lI illOOo00lI = (IllOOo00lI) obj7;
/* 321 */                       iloI0lOlll1.I00Oio(null, 125, 1, null);
/* 324 */                       iloI0lOlll1.I0010I0i = true;
/* 328 */                       if (iloI0lOlll1.I00O10llo) {
/* 330 */                           iloI0lOlll1.I000l1(illOOo00lI);
                                } else {
/* 334 */                           iloI0lOlll1.I00io1l();
                                }
/* 339 */                       IOl0oi0lOl1.I000lI.getClass();
/* 344 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 353 */                       li01Ooiio01.I0000Il00O(new I000OiO(3), iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 362 */                       li01Ooiio01.I0000Il00O(new I000OiO(4), iloI0lOlll1, iiIooOOOI);
/* 371 */                       li01Ooiio01.I0000Il00O(new I000OiO(5), iloI0lOlll1, o0oiOi);
/* 381 */                       li01Ooiio01.I0000Il00O(new I000OiO(i8), iloI0lOlll1, oiIoOoIi01);
/* 390 */                       li01Ooiio01.I0000Il00O(new I000OiO(7), iloI0lOlll1, o0iOOoiioO);
/* 399 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 404 */                       i4 = 1;
/* 408 */                       li01Ooiio01.I0000Il00O(new I000OiO(i4), iloI0lOlll1, obj2);
/* 417 */                       obj3 = function12;
/* 419 */                       li01Ooiio01.I0000Il00O(new I000OiO(2), iloI0lOlll1, obj3);
/* 422 */                       iloI0lOlll1.I0010I0i(true);
/* 426 */                       iloI0lOlll1.I0010I0i(false);
                            }
                        }
/* 435 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 439 */               if (oOloioIlI001IO000 == null) {
/* 443 */                   I0oliIo i0oliIo = new I0oliIo(i4);
/* 446 */                   i0oliIo.I00iio = function1;
/* 450 */                   i0oliIo.I00ilI0I1 = o1ooiI111i;
/* 452 */                   i0oliIo.I00ilO0 = obj3;
/* 454 */                   i0oliIo.I00io1l = obj2;
/* 458 */                   i0oliIo.I00iiI = i;
/* 462 */                   i0oliIo.I00iiO = i2;
/* 464 */                   VarHandle.storeStoreFence();
/* 467 */                   oOloioIlI001IO000.I0000O = i0oliIo;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 71 */            i5 |= 24576;
/* 73 */            obj = function13;
/* 109 */           if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 9363) == 9362)) {
                    }
/* 435 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 439 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static boolean I0000Il00O(float f, Float f2) {
                    return f2 != null && f == f2.floatValue();
                }

                public static boolean I0000O(Object obj, Object obj2) {
                    return obj == null ? obj2 == null : obj.equals(obj2);
                }

                public static int I0000oI00(int i, int i2) {
/* 1 */             if (i < i2) {
/* 3 */                 return -1;
                    }
                    return i == i2 ? 0 : 1;
                }

                public static int I0001Ioi1lo(long j, long j2) {
/* 3 */             if (j < j2) {
/* 5 */                 return -1;
                    }
                    return j == j2 ? 0 : 1;
                }

                public static final Oooio0iiI0 I000II(O0iiOioolIi o0iiOioolIi) {
/* 1 */             Oooio0iiI0 oooio0iiI0 = o0iiOioolIi.I00o0l1o1o0;
/* 3 */             if (oooio0iiI0 != null) {
/* 5 */                 return oooio0iiI0;
                    }
/* 29 */            throw IIlIOloOOO.I000OOo1O("Required value was null.");
                }

                public static void I000O01llI0(RuntimeException runtimeException, String str) {
/* 1 */             StackTraceElement[] stackTrace = runtimeException.getStackTrace();
/* 5 */             int length = stackTrace.length;
/* 6 */             int i = -1;
/* 8 */             for (int i2 = 0; i2 < length; i2++) {
/* 20 */                if (str.equals(stackTrace[i2].getClassName())) {
/* 22 */                    i = i2;
                        }
                    }
/* 34 */            runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
                }

                public static void I000OOo1O(String str) {
/* 13 */            IOiIIo1l iOiIIo1l = new IOiIIo1l(IlIi0I0.I000lI("lateinit property ", str, " has not been initialized"), 12);
/* 22 */            I000O01llI0(iOiIIo1l, O0000Ioio00.class.getName());
/* 29 */            throw iOiIIo1l;
                }
            }
