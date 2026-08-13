            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public abstract class iOOo1000 {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, Oi1Oo0Il0 oi1Oo0Il0, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
/* 4 */             iloI0lOlll1.I00i0O(1819794447);
/* 7 */             int i4 = i2 & 1;
/* 9 */             int i5 = 2;
/* 10 */            if (i4 != 0) {
/* 12 */                i3 = i | 6;
                    } else if ((i & 6) == 0) {
/* 28 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 30 */                i3 = i;
                    }
/* 31 */            int i6 = i2 & 2;
/* 33 */            if (i6 != 0) {
/* 35 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 53 */                i3 |= iloI0lOlll1.I000II(oi1Oo0Il0) ? 32 : 16;
                    }
/* 56 */            if ((i & 384) == 0) {
/* 69 */                i3 |= iloI0lOlll1.I000OOo1O(function3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 74 */            if ((i3 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 83 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 87 */                if (i4 != 0) {
/* 89 */                    o1ooiI111i = O1ooIo101ll.I00000oIO;
                        }
/* 91 */                if (i6 != 0) {
/* 93 */                    oi1Oo0Il0 = null;
                        }
/* 97 */                I1oilOoo1iO i1oilOoo1iO = new I1oilOoo1iO(0);
/* 100 */               i1oilOoo1iO.I00iiI = oi1Oo0Il0;
/* 102 */               i1oilOoo1iO.I00iiO = o1ooiI111i;
/* 104 */               i1oilOoo1iO.I00iio = function3;
/* 106 */               VarHandle.storeStoreFence();
/* 117 */               IlioO0oO.I0000Il00O(iiioOl1O.I00000oOI(234074522, i1oilOoo1iO, iloI0lOlll1), iloI0lOlll1, 6);
                    }
/* 120 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 124 */           if (oOloioIlI001IO000 != null) {
/* 128 */               I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(i5);
/* 131 */               i0O0Ol1O0O.I00ilI0I1 = o1ooiI111i;
/* 133 */               i0O0Ol1O0O.I00iiI = oi1Oo0Il0;
/* 135 */               i0O0Ol1O0O.I00ilO0 = function3;
/* 137 */               i0O0Ol1O0O.I00iiO = i;
/* 139 */               i0O0Ol1O0O.I00iio = i2;
/* 141 */               VarHandle.storeStoreFence();
/* 144 */               oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
                    }
                }
            }
