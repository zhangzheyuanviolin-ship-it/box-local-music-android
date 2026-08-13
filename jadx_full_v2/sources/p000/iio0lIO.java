            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class iio0lIO {
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
/* 14 */            iloI0lOlll1.I00i0O(424640667);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i2 = (iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 4 : 2) | i;
                    } else {
/* 32 */                i2 = i;
                    }
/* 35 */            if ((i & 48) == 0) {
/* 48 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 51 */            if ((i & 384) == 0) {
/* 64 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 82 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 86 */                I0IilI00l i0IilI00l = new I0IilI00l(6);
/* 89 */                i0IilI00l.I00iiI = illOOo00lI;
/* 91 */                VarHandle.storeStoreFence();
/* 97 */                IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(648788819, i0IilI00l, iloI0lOlll1);
/* 104 */               I0IilI00l i0IilI00l2 = new I0IilI00l(7);
/* 107 */               i0IilI00l2.I00iiI = illOOo00lI2;
/* 109 */               VarHandle.storeStoreFence();
/* 115 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(1219060625, i0IilI00l2, iloI0lOlll1);
/* 121 */               IOlo00IiI1IO iOlo00IiI1IO = new IOlo00IiI1IO(0);
/* 124 */               iOlo00IiI1IO.I00iiI = o1oIOiI11o0;
/* 126 */               VarHandle.storeStoreFence();
/* 173 */               i3 = 6;
/* 177 */               iOIil10l.I00000oIO(illOOo00lI2, iOii1lI00000oOI, null, iOii1lI00000oOI2, null, i1OliO1.I0000Il00O, iiioOl1O.I00000oOI(2074468334, iOlo00IiI1IO, iloI0lOlll1), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, ((i2 >> 6) & 14) | 1772592, 16276);
                    } else {
/* 181 */               i3 = 6;
/* 182 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 185 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 189 */           if (oOloioIlI001IO000 != null) {
/* 193 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(i3);
/* 196 */               i0IliiililIo.I00iiO = o1oIOiI11o0;
/* 200 */               i0IliiililIo.I00iio = illOOo00lI;
/* 202 */               i0IliiililIo.I00ilI0I1 = illOOo00lI2;
/* 206 */               i0IliiililIo.I00iiI = i;
/* 208 */               VarHandle.storeStoreFence();
/* 211 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }
