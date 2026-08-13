            package p000;

            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function3;
            
            public abstract class I1oool0O {
                public static final List I00000oIO;
                public static final Map I00000oOI;

                static {
/* 3 */             ValueType valueType = ValueType.INT;
/* 40 */            I00000oIO = IOOi1I.I000O01llI0(new OIOOoO1O1oO(iIIiO0.I0010I0i, 10.0f, 200.0f, 50.0f, valueType, true), new OIOOoO1O1oO(iIIiO0.I0010o, 50.0f, 500.0f, 200.0f, valueType, true));
/* 76 */            I00000oOI = O1Oii0O0loo.I0000O(new OIoi0IIoi("Warm up iterations", Float.valueOf(50.0f)), new OIoi0IIoi("Benchmark iterations", Float.valueOf(200.0f)));
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, IO1OO01i0 iO1OO01i0, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i) {
/* 12 */            iloI0lOlll1.I00i0O(1293064708);
/* 41 */            int i2 = i | (iloI0lOlll1.I000II(iO1OO01i0) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(function3) ? 256 : Barcode.FORMAT_ITF);
/* 59 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 73 */                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
/* 75 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 79 */                if (!z) {
                            Object obj = objI00O0i0ii;
/* 83 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 87 */                        I1iO0OloOl i1iO0OloOl = new I1iO0OloOl(1);
/* 90 */                        i1iO0OloOl.I00iiI = illOOo00lI;
/* 92 */                        i1iO0OloOl.I00iiO = iO1OO01i0;
/* 94 */                        i1iO0OloOl.I00iio = function3;
/* 96 */                        VarHandle.storeStoreFence();
/* 99 */                        iloI0lOlll1.I00iio(i1iO0OloOl);
                                obj = i1iO0OloOl;
                            }
/* 124 */                   IOll1OIIi0O1.I00000oOI("Benchmark configs", I00000oIO, I00000oOI, illOOo00lI, (Function3) obj, "Start", null, false, false, null, null, iloI0lOlll1, 199686, 0, 1984);
                        }
                    } else {
/* 128 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 131 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 135 */           if (oOloioIlI001IO000 != null) {
/* 140 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(2);
/* 143 */               i01oi1lIIO.I00iio = illOOo00lI;
/* 145 */               i01oi1lIIO.I00iiI = iO1OO01i0;
/* 149 */               i01oi1lIIO.I00iiO = function3;
/* 151 */               VarHandle.storeStoreFence();
/* 154 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }
            }
