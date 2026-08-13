            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1IO0iooIIll {
                /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(String str, String str2, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 12 */            iloI0lOlll1.I00i0O(-940156068);
/* 51 */            int i3 = i | (iloI0lOlll1.I000II(str) ? 4 : 2) | (iloI0lOlll1.I000II(str2) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(function1) ? 256 : Barcode.FORMAT_ITF);
/* 69 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 77 */                boolean z = (i3 & 896) == 256;
/* 78 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 82 */                if (!z) {
                            Object obj = objI00O0i0ii;
/* 86 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 90 */                        Il1iIiI il1iIiI = new Il1iIiI(1);
/* 93 */                        il1iIiI.I00iiI = function1;
/* 95 */                        VarHandle.storeStoreFence();
/* 98 */                        iloI0lOlll1.I00iio(il1iIiI);
                                obj = il1iIiI;
                            }
/* 105 */                   O1IIii o1IIii = new O1IIii(4);
/* 108 */                   o1IIii.I00iiI = function1;
/* 110 */                   VarHandle.storeStoreFence();
/* 116 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1892045804, o1IIii, iloI0lOlll1);
/* 124 */                   Ilo0lI ilo0lI = new Ilo0lI(20);
/* 127 */                   ilo0lI.I00iiI = str;
/* 129 */                   ilo0lI.I00iiO = str2;
/* 131 */                   VarHandle.storeStoreFence();
/* 176 */                   i2 = 0;
/* 180 */                   iOIil10l.I00000oIO((IllOOo00lI) obj, iOii1lI00000oOI, null, null, null, i1iIO1i.I0000O, iiioOl1O.I00000oOI(678342767, ilo0lI, iloI0lOlll1), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1769520, 16284);
                        }
                    } else {
/* 184 */               i2 = 0;
/* 185 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 188 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 192 */           if (oOloioIlI001IO000 != null) {
/* 196 */               O1iI110 o1iI110 = new O1iI110(i2);
/* 199 */               o1iI110.I00iiI = str;
/* 201 */               o1iI110.I00iiO = str2;
/* 205 */               o1iI110.I00iio = function1;
/* 207 */               VarHandle.storeStoreFence();
/* 210 */               oOloioIlI001IO000.I0000O = o1iI110;
                    }
                }
            }
