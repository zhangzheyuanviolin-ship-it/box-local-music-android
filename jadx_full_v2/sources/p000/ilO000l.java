            package p000;

            import android.view.View;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ilO000l {
                public static final void I00000oIO(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-1646555525);
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            int i3 = 0;
/* 38 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 60 */                I00000oOI((View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo), (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0), illOOo00lI, iloI0lOlll1, (i2 << 6) & 896);
                    } else {
/* 64 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 67 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 71 */            if (oOloioIlI001IO000 != null) {
/* 75 */                Il1iii01oI il1iii01oI = new Il1iii01oI(i3);
/* 78 */                il1iii01oI.I00iiI = illOOo00lI;
/* 80 */                il1iii01oI.I00iiO = i;
/* 82 */                VarHandle.storeStoreFence();
/* 85 */                oOloioIlI001IO000.I0000O = il1iii01oI;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(View view, IiIooOOOI iiIooOOOI, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-1319522472);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000OOo1O(view) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(iiIooOOOI) ? 32 : 16;
                    }
/* 44 */            if ((i & 384) == 0) {
/* 56 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 256 : Barcode.FORMAT_ITF;
                    }
/* 74 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 85 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(view) | ((i2 & 896) == 256);
/* 87 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 91 */                if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 95 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 99 */                        IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(i3);
/* 102 */                       iiioilIl1Il.I00iiI = view;
/* 104 */                       iiioilIl1Il.I00iiO = illOOo00lI;
/* 106 */                       VarHandle.storeStoreFence();
/* 109 */                       iloI0lOlll1.I00iio(iiioilIl1Il);
                                obj = iiioilIl1Il;
                            }
/* 114 */                   iIO0iiOiOl0l.I00000oIO(view, iiIooOOOI, (Function1) obj, iloI0lOlll1);
                        }
                    } else {
/* 118 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 121 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 125 */           if (oOloioIlI001IO000 != null) {
/* 131 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(10);
/* 134 */               i0IliiililIo.I00iiO = view;
/* 136 */               i0IliiililIo.I00ilI0I1 = iiIooOOOI;
/* 138 */               i0IliiililIo.I00iio = illOOo00lI;
/* 140 */               i0IliiililIo.I00iiI = i;
/* 142 */               VarHandle.storeStoreFence();
/* 145 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }
