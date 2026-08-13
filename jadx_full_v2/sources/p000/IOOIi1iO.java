            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class IOOIi1iO {
                public static final Oo0lloOiiIOI I00000oIO = new Oo0lloOiiIOI(0, 0, null, null, 0, 0, 0, 0, 16777183);
                public static final long I00000oOI;
                public static final O1ooiI111i I0000Il00O;
                public static final long I0000O;

                static {
/* 28 */            long jI0000Il00O = IOOiio0i.I0000Il00O(0.5f, IOOiio0i.I0000oI00);
/* 32 */            I00000oOI = jI0000Il00O;
/* 42 */            I0000Il00O = i0I1I0.I00000oOI(O1ooIo101ll.I00000oIO, jI0000Il00O, iO0ioilo.I00000oIO);
/* 50 */            I0000O = lOlilO1lOIO.I0000O(16);
                }

                public static final void I00000oIO(Oi1O00I1 oi1O00I1, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(1957181635);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(null) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 60 */            if ((i2 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 69 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 83 */                IOOIiI1o iOOIiI1o = Oi1i0Oi.I0000Il00O(Oi1i0Oi.I00000oOI(iloI0lOlll1)).I0000oI00;
/* 91 */                Oo0lloOiiIOI oo0lloOiiIOII0001Ioi1lo = Oi1Io0I.I0000O(iloI0lOlll1).I0001Ioi1lo(iOOIiI1o.I00000oIO);
/* 95 */                O1ooiI111i o1ooiI111i = iOOIiI1o.I00000oOI;
/* 109 */               float fI001lIiIIo1O = ((IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0)).I001lIiIIo1O(iOOIiI1o.I0000Il00O.I00000oIO);
/* 115 */               boolean zBooleanValue = iOOIiI1o.I0000O.booleanValue();
/* 121 */               IOOIi1 iOOIi1 = new IOOIi1();
/* 124 */               iOOIi1.I00iOIl = o1ooiI111i;
/* 126 */               iOOIi1.I00iiI = fI001lIiIIo1O;
/* 128 */               iOOIi1.I00iiO = oo0lloOiiIOII0001Ioi1lo;
/* 130 */               iOOIi1.I00iio = iOii1l;
/* 132 */               VarHandle.storeStoreFence();
/* 144 */               ii1il0.I00000oIO(oi1O00I1, zBooleanValue, iiioOl1O.I00000oOI(1968694299, iOOIi1, iloI0lOlll1), iloI0lOlll1, (i2 & 14) | 384);
                    }
/* 147 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 151 */           if (oOloioIlI001IO000 != null) {
/* 156 */               II0oliolO11 iI0oliolO11 = new II0oliolO11(1);
/* 159 */               iI0oliolO11.I00iiI = oi1O00I1;
/* 161 */               iI0oliolO11.I00iiO = iOii1l;
/* 163 */               iI0oliolO11.I00iio = i;
/* 165 */               VarHandle.storeStoreFence();
/* 168 */               oOloioIlI001IO000.I0000O = iI0oliolO11;
                    }
                }

                public static final void I00000oOI(Oi1O00I1 oi1O00I1, String str, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-1183188838);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 40 */            int i4 = i2 | 384;
/* 46 */            int i5 = 3;
/* 47 */            if ((i4 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 56 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 62 */                IO1O01l iO1O01l = new IO1O01l(i3);
/* 65 */                iO1O01l.I00iiI = str;
/* 67 */                VarHandle.storeStoreFence();
/* 85 */                I00000oIO(oi1O00I1, iiioOl1O.I00000oOI(1557188131, iO1O01l, iloI0lOlll1), iloI0lOlll1, ((i4 >> 3) & 112) | (i4 & 14) | 384);
                    }
/* 88 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 92 */            if (oOloioIlI001IO000 != null) {
/* 96 */                I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(i5);
/* 99 */                i0O0llIiIlOO.I00iiO = oi1O00I1;
/* 101 */               i0O0llIiIlOO.I00iio = str;
/* 103 */               i0O0llIiIlOO.I00iiI = i;
/* 105 */               VarHandle.storeStoreFence();
/* 108 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }
            }
