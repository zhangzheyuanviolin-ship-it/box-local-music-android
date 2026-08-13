            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOI0ooi {
                /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O0oiOi o0oiOi, Function1 function1, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1868327245);
/* 42 */            int i2 = i | (iloI0lOlll1.I000OOo1O(o0oiOi) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(function1) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 256 : Barcode.FORMAT_ITF);
/* 47 */            int i3 = 0;
/* 60 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 80 */                boolean zI000OOo1O = ((i2 & 112) == 32) | iloI0lOlll1.I000OOo1O(o0oiOi) | ((i2 & 896) == 256);
/* 82 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 86 */                if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 90 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 94 */                        I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(0);
/* 97 */                        i01oIoOI01l.I00iiI = o0oiOi;
/* 99 */                        i01oIoOI01l.I00iiO = function1;
/* 101 */                       i01oIoOI01l.I00iio = illOOo00lI;
/* 103 */                       VarHandle.storeStoreFence();
/* 106 */                       iloI0lOlll1.I00iio(i01oIoOI01l);
                                obj = i01oIoOI01l;
                            }
/* 111 */                   iIO0iiOiOl0l.I00000oOI(o0oiOi, (Function1) obj, iloI0lOlll1);
                        }
                    } else {
/* 115 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 118 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 122 */           if (oOloioIlI001IO000 != null) {
/* 126 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(i3);
/* 129 */               i01oi1lIIO.I00iiI = o0oiOi;
/* 131 */               i01oi1lIIO.I00iiO = function1;
/* 133 */               i01oi1lIIO.I00iio = illOOo00lI;
/* 135 */               VarHandle.storeStoreFence();
/* 138 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }
            }
