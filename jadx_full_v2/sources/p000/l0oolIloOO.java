            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l0oolIloOO {
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, O0llioI1 o0llioI1, O0liioil o0liioil, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1055276397);
/* 52 */            int i2 = i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | (iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16) | (iloI0lOlll1.I000II(o0llioI1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000II(o0liioil) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 57 */            int i3 = 1;
/* 68 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 70 */                OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(illOOo00lI, iloI0lOlll1);
/* 76 */                IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(i3);
/* 79 */                iO1oIiIi1O01.I00iiO = o0llioI1;
/* 81 */                iO1oIiIi1O01.I00iio = o1ooiI111i;
/* 83 */                iO1oIiIi1O01.I00ilI0I1 = o0liioil;
/* 85 */                iO1oIiIi1O01.I00iiI = oI10i0IlI00000oOI;
/* 87 */                VarHandle.storeStoreFence();
/* 98 */                l101loO1o0oO.I00000oIO(iiioOl1O.I00000oOI(-933153643, iO1oIiIi1O01, iloI0lOlll1), iloI0lOlll1, 6);
                    } else {
/* 102 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 105 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 109 */           if (oOloioIlI001IO000 != null) {
/* 115 */               O11iol o11iol = new O11iol(15);
/* 118 */               o11iol.I00iiI = illOOo00lI;
/* 120 */               o11iol.I00iiO = o1ooiI111i;
/* 122 */               o11iol.I00iio = o0llioI1;
/* 124 */               o11iol.I00ilI0I1 = o0liioil;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               oOloioIlI001IO000.I0000O = o11iol;
                    }
                }
            }
