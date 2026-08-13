            package p000;

            import android.view.View;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOIo11 {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(2064964257);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 66 */                I00000oOI(o1ooiI111i, iOii1l, iloI0lOlll1, ((i2 << 3) & 896) | (i2 & 14) | 48);
                    } else {
/* 70 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 73 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 77 */            if (oOloioIlI001IO000 != null) {
/* 81 */                I100Oio0OiOo i100Oio0OiOo = new I100Oio0OiOo(0);
/* 84 */                i100Oio0OiOo.I00iiI = o1ooiI111i;
/* 86 */                i100Oio0OiOo.I00iiO = iOii1l;
/* 88 */                i100Oio0OiOo.I00iio = i;
/* 90 */                VarHandle.storeStoreFence();
/* 93 */                oOloioIlI001IO000.I0000O = i100Oio0OiOo;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(771959668);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000OOo1O(null) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 72 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 74 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 78 */                Object obj = IOl11li.I00000oIO;
/* 80 */                if (objI00O0i0ii == obj) {
/* 86 */                    Object oIooliIO0 = new OIooliIO0(null, IIIOlol.I00ilO0);
/* 89 */                    iloI0lOlll1.I00iio(oIooliIO0);
/* 92 */                    objI00O0i0ii = oIooliIO0;
                        }
/* 93 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 95 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 99 */                if (objI00O0i0ii2 == obj) {
/* 105 */                   I0Il0000oli i0Il0000oli = new I0Il0000oli(27);
/* 108 */                   i0Il0000oli.I00iiI = oI10i0Il;
/* 110 */                   VarHandle.storeStoreFence();
/* 113 */                   iloI0lOlll1.I00iio(i0Il0000oli);
                            obj2 = i0Il0000oli;
                        }
/* 124 */               OOiIo1lll oOiIo1lllI00000oIO = OloloO.I00000oOI.I00000oIO(I0000Il00O((IllOOo00lI) obj2, iloI0lOlll1, 0));
/* 130 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(1);
/* 133 */               i01oi1lIIO.I00iiI = o1ooiI111i;
/* 135 */               i01oi1lIIO.I00iiO = oI10i0Il;
/* 137 */               i01oi1lIIO.I00iio = iOii1l;
/* 139 */               VarHandle.storeStoreFence();
/* 151 */               iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(-291176396, i01oi1lIIO, iloI0lOlll1), iloI0lOlll1, 56);
                    } else {
/* 155 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 158 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 162 */           if (oOloioIlI001IO000 != null) {
/* 166 */               I100Oio0OiOo i100Oio0OiOo = new I100Oio0OiOo(1);
/* 169 */               i100Oio0OiOo.I00iiI = o1ooiI111i;
/* 171 */               i100Oio0OiOo.I00iiO = iOii1l;
/* 173 */               i100Oio0OiOo.I00iio = i;
/* 175 */               VarHandle.storeStoreFence();
/* 178 */               oOloioIlI001IO000.I0000O = i100Oio0OiOo;
                    }
                }

                public static final I100OOIO0oio I0000Il00O(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 7 */             View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 9 */             boolean zI000II = iloI0lOlll1.I000II(view);
/* 13 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 17 */            Object obj = IOl11li.I00000oIO;
                    Object obj2 = objI00O0i0ii;
/* 19 */            if (zI000II || objI00O0i0ii == obj) {
/* 25 */                I100OOIO0oio i100OOIO0oio = new I100OOIO0oio();
/* 28 */                i100OOIO0oio.I00000oIO = view;
/* 31 */                i100OOIO0oio.I00000oOI = null;
/* 33 */                i100OOIO0oio.I0000Il00O = illOOo00lI;
/* 40 */                i100OOIO0oio.I0000O = new OI11IlOoi();
/* 47 */                I1001OoI0 i1001OoI0 = new I1001OoI0(0);
/* 50 */                i1001OoI0.I00iiI = i100OOIO0oio;
/* 52 */                VarHandle.storeStoreFence();
/* 58 */                i100OOIO0oio.I0000oI00 = new Ol1olI0o1I01(i1001OoI0);
/* 63 */                I1001OoI0 i1001OoI02 = new I1001OoI0(1);
/* 66 */                i1001OoI02.I00iiI = i100OOIO0oio;
/* 68 */                VarHandle.storeStoreFence();
/* 71 */                i100OOIO0oio.I0001Ioi1lo = i1001OoI02;
/* 76 */                I1001OoI0 i1001OoI03 = new I1001OoI0(2);
/* 79 */                i1001OoI03.I00iiI = i100OOIO0oio;
/* 81 */                VarHandle.storeStoreFence();
/* 84 */                i100OOIO0oio.I000II = i1001OoI03;
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                iloI0lOlll1.I00iio(i100OOIO0oio);
                        obj2 = i100OOIO0oio;
                    }
/* 92 */            I100OOIO0oio i100OOIO0oio2 = (I100OOIO0oio) obj2;
/* 94 */            boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(i100OOIO0oio2);
/* 98 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj3 = objI00O0i0ii2;
/* 102 */           if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 109 */               I1001OoI0 i1001OoI04 = new I1001OoI0(3);
/* 112 */               i1001OoI04.I00iiI = i100OOIO0oio2;
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               iloI0lOlll1.I00iio(i1001OoI04);
                        obj3 = i1001OoI04;
                    }
/* 122 */           iIO0iiOiOl0l.I00000oOI(i100OOIO0oio2, (Function1) obj3, iloI0lOlll1);
/* 408 */           return i100OOIO0oio2;
                }
            }
