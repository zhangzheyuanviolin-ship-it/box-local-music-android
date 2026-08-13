            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO11IlilOl1 {
                public static final void I00000oIO(String str, String str2, String str3, Function1 function1, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 18 */            iloI0lOlll1.I00i0O(1944280101);
/* 37 */            int i3 = 16;
/* 69 */            int i4 = i | (iloI0lOlll1.I000II(str) ? 4 : 2) | (iloI0lOlll1.I000II(str2) ? 32 : 16) | (iloI0lOlll1.I000II(str3) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 16384 : 8192);
/* 74 */            if ((i & 196608) == 0) {
/* 87 */                i4 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 131072 : 65536;
                    }
/* 95 */            int i5 = 1;
/* 107 */           if (iloI0lOlll1.I00OIl(i4 & 1, (74899 & i4) != 74898)) {
/* 113 */               I0IilI00l i0IilI00l = new I0IilI00l(15);
/* 116 */               i0IilI00l.I00iiI = illOOo00lI;
/* 118 */               VarHandle.storeStoreFence();
/* 124 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1339860371, i0IilI00l, iloI0lOlll1);
/* 130 */               I0IilI00l i0IilI00l2 = new I0IilI00l(i3);
/* 133 */               i0IilI00l2.I00iiI = illOOo00lI2;
/* 135 */               VarHandle.storeStoreFence();
/* 141 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(259288687, i0IilI00l2, iloI0lOlll1);
/* 149 */               I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(10);
/* 152 */               i0Iooi0i1l0l.I00iiI = str;
/* 154 */               VarHandle.storeStoreFence();
/* 160 */               IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(1858437745, i0Iooi0i1l0l, iloI0lOlll1);
/* 166 */               O1iI110 o1iI110 = new O1iI110(i5);
/* 169 */               o1iI110.I00iiI = str2;
/* 171 */               o1iI110.I00iiO = str3;
/* 173 */               o1iI110.I00iio = function1;
/* 175 */               VarHandle.storeStoreFence();
/* 221 */               i2 = 4;
/* 225 */               iOIil10l.I00000oIO(illOOo00lI2, iOii1lI00000oOI, null, iOii1lI00000oOI2, null, iOii1lI00000oOI3, iiioOl1O.I00000oOI(-1636955022, o1iI110, iloI0lOlll1), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, ((i4 >> 15) & 14) | 1772592, 16276);
                    } else {
/* 229 */               i2 = 4;
/* 230 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 233 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 237 */           if (oOloioIlI001IO000 != null) {
/* 241 */               IOii0100lIi0 iOii0100lIi0 = new IOii0100lIi0(i2);
/* 244 */               iOii0100lIi0.I00iiO = str;
/* 246 */               iOii0100lIi0.I00iio = str2;
/* 248 */               iOii0100lIi0.I00ilI0I1 = str3;
/* 250 */               iOii0100lIi0.I00ilO0 = function1;
/* 254 */               iOii0100lIi0.I00io1l = illOOo00lI;
/* 256 */               iOii0100lIi0.I00ioIO = illOOo00lI2;
/* 260 */               iOii0100lIi0.I00iiI = i;
/* 262 */               VarHandle.storeStoreFence();
/* 265 */               oOloioIlI001IO000.I0000O = iOii0100lIi0;
                    }
                }
            }
