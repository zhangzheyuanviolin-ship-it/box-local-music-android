            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l10IoIli0i {
                /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Boolean bool, Object obj, O0oiOi o0oiOi, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(696924721);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(bool) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(obj) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 43 */                i2 |= Barcode.FORMAT_ITF;
                    }
/* 47 */            if ((i & 3072) == 0) {
/* 60 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 76 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 78 */                iloI0lOlll1.I00Ol00();
/* 83 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 104 */                   o0oiOi = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
                        } else {
/* 92 */                    iloI0lOlll1.I00OilO00Il();
                        }
/* 95 */                int i3 = i2 & (-897);
/* 107 */               iloI0lOlll1.I0010o();
/* 123 */               boolean zI000II = iloI0lOlll1.I000II(bool) | iloI0lOlll1.I000II(obj) | iloI0lOlll1.I000II(o0oiOi);
/* 124 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 128 */               if (!zI000II) {
                            Object obj2 = objI00O0i0ii;
/* 132 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 136 */                       I01O1lIi i01O1lIiI000iOII = o0oiOi.I000iOII();
/* 140 */                       O0ol0iIl0 o0ol0iIl0 = new O0ol0iIl0();
/* 143 */                       o0ol0iIl0.I00iOIl = i01O1lIiI000iOII;
/* 145 */                       VarHandle.storeStoreFence();
/* 148 */                       iloI0lOlll1.I00iio(o0ol0iIl0);
                                obj2 = o0ol0iIl0;
                            }
/* 157 */                   I00000oOI(o0oiOi, (O0ol0iIl0) obj2, function1, iloI0lOlll1, (i3 >> 3) & 896);
                        }
                    } else {
/* 161 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 164 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 168 */           if (oOloioIlI001IO000 != null) {
/* 173 */               I0io0io i0io0io = new I0io0io(5);
/* 176 */               i0io0io.I00ilI0I1 = bool;
/* 178 */               i0io0io.I00iiI = obj;
/* 180 */               i0io0io.I00ilO0 = o0oiOi;
/* 182 */               i0io0io.I00iiO = function1;
/* 184 */               i0io0io.I00iio = i;
/* 186 */               VarHandle.storeStoreFence();
/* 189 */               oOloioIlI001IO000.I0000O = i0io0io;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(O0oiOi o0oiOi, O0ol0iIl0 o0ol0iIl0, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(228371534);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(o0oiOi) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(o0ol0iIl0) ? 32 : 16;
                    }
/* 43 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? 256 : Barcode.FORMAT_ITF;
                    }
/* 73 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 90 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o0ol0iIl0) | ((i2 & 896) == 256) | iloI0lOlll1.I000OOo1O(o0oiOi);
/* 91 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 95 */                if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 99 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 105 */                       I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(28);
/* 108 */                       i01oIoOI01l.I00iiI = o0oiOi;
/* 110 */                       i01oIoOI01l.I00iio = o0ol0iIl0;
/* 112 */                       i01oIoOI01l.I00iiO = function1;
/* 114 */                       VarHandle.storeStoreFence();
/* 117 */                       iloI0lOlll1.I00iio(i01oIoOI01l);
                                obj = i01oIoOI01l;
                            }
/* 122 */                   iIO0iiOiOl0l.I00000oIO(o0oiOi, o0ol0iIl0, (Function1) obj, iloI0lOlll1);
                        }
                    } else {
/* 126 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 129 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 133 */           if (oOloioIlI001IO000 != null) {
/* 139 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(15);
/* 142 */               i0IliiililIo.I00iiO = o0oiOi;
/* 144 */               i0IliiililIo.I00iio = o0ol0iIl0;
/* 146 */               i0IliiililIo.I00ilI0I1 = function1;
/* 148 */               i0IliiililIo.I00iiI = i;
/* 150 */               VarHandle.storeStoreFence();
/* 153 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }
