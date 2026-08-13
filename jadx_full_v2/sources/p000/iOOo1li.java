            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOOo1li {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, OOiIOoiOO oOiIOoiOO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-714464401);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(oOiIOoiOO) ? 32 : 16;
                    }
/* 39 */            int i3 = i & 384;
/* 41 */            IOii1l iOii1l2 = i1Olol.I00000oIO;
/* 43 */            if (i3 == 0) {
/* 56 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 59 */            if ((i & 3072) == 0) {
/* 72 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 89 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 91 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 97 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 104 */                   Object oIooliIO0 = new OIooliIO0(null, IIIOlol.I00ilO0);
/* 107 */                   iloI0lOlll1.I00iio(oIooliIO0);
/* 110 */                   objI00O0i0ii = oIooliIO0;
                        }
/* 117 */               I1oiliiOol i1oiliiOolI00000oOI = I00000oOI(iOii1l2, iloI0lOlll1, (i2 >> 6) & 14);
/* 121 */               OOiIo1lll oOiIo1lllI00000oIO = oOiIOoiOO.I00000oIO(i1oiliiOolI00000oOI);
/* 127 */               O11iol o11iol = new O11iol(3);
/* 130 */               o11iol.I00iiI = o1ooiI111i;
/* 132 */               o11iol.I00iiO = (OI10i0Il) objI00O0i0ii;
/* 134 */               o11iol.I00iio = iOii1l;
/* 136 */               o11iol.I00ilI0I1 = i1oiliiOolI00000oOI;
/* 138 */               VarHandle.storeStoreFence();
/* 150 */               iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(274270255, o11iol, iloI0lOlll1), iloI0lOlll1, 56);
                    } else {
/* 154 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 157 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 161 */           if (oOloioIlI001IO000 != null) {
/* 165 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(3);
/* 168 */               i0IliiililIo.I00iiO = o1ooiI111i;
/* 170 */               i0IliiililIo.I00iio = oOiIOoiOO;
/* 172 */               i0IliiililIo.I00ilI0I1 = iOii1l;
/* 174 */               i0IliiililIo.I00iiI = i;
/* 176 */               VarHandle.storeStoreFence();
/* 179 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final I1oiliiOol I00000oOI(IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
/* 20 */            boolean z = (((i & 14) ^ 6) > 4 && iloI0lOlll1.I000II(iOii1l)) || (i & 6) == 4;
/* 21 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 25 */            Object obj = IOl11li.I00000oIO;
                    Object obj2 = objI00O0i0ii;
/* 27 */            if (z || objI00O0i0ii == obj) {
/* 33 */                I1oiliiOol i1oiliiOol = new I1oiliiOol();
/* 36 */                i1oiliiOol.I00000oIO = iOii1l;
/* 43 */                i1oiliiOol.I00000oOI = new OI11IlOoi();
/* 50 */                i1oiliiOol.I0000Il00O = lOO00IiI0li.I00000oIO(null);
/* 52 */                VarHandle.storeStoreFence();
/* 55 */                iloI0lOlll1.I00iio(i1oiliiOol);
                        obj2 = i1oiliiOol;
                    }
/* 58 */            I1oiliiOol i1oiliiOol2 = (I1oiliiOol) obj2;
/* 60 */            boolean zI000II = iloI0lOlll1.I000II(i1oiliiOol2);
/* 64 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj3 = objI00O0i0ii2;
/* 68 */            if (zI000II || objI00O0i0ii2 == obj) {
/* 76 */                IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(15);
/* 79 */                iIOIlOoI111.I00iiI = i1oiliiOol2;
/* 81 */                VarHandle.storeStoreFence();
/* 84 */                iloI0lOlll1.I00iio(iIOIlOoI111);
                        obj3 = iIOIlOoI111;
                    }
/* 89 */            iIO0iiOiOl0l.I00000oOI(i1oiliiOol2, (Function1) obj3, iloI0lOlll1);
/* 98 */            return i1oiliiOol2;
                }
            }
