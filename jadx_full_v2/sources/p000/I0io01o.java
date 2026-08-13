            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I0io01o implements IlliIl1l11O {
                public final int I00iOIl;
                public O1ooiI111i I00iiI;
                public IOii1l I00iiO;

                public I0io01o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 48 */                    O1ooiI111i o1ooiI111i = this.I00iiI;
/* 50 */                    IOii1l iOii1l = this.I00iiO;
/* 52 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 56 */                    int iIntValue = ((Integer) obj2).intValue();
/* 63 */                    int i2 = 0;
/* 75 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 213 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 80 */                        String strI00000oIO = lOi10Ol.I00000oIO(R.string.m3c_dialog, iloI0lOlll1);
/* 91 */                        O1ooiI111i o1ooiI111iI00100l0 = Ol0iOOO0.I00100l0(o1ooiI111i, 280.0f, 0.0f, 560.0f, 10);
/* 95 */                        boolean zI000II = iloI0lOlll1.I000II(strI00000oIO);
/* 99 */                        Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 103 */                       if (!zI000II) {
                                    Object obj3 = objI00O0i0ii;
/* 107 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 111 */                               I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(i2);
/* 114 */                               i0ioO0Oio0ll.I00iiI = strI00000oIO;
/* 116 */                               VarHandle.storeStoreFence();
/* 119 */                               iloI0lOlll1.I00iio(i0ioO0Oio0ll);
                                        obj3 = i0ioO0Oio0ll;
                                    }
/* 130 */                           O1ooiI111i o1ooiI111iI0000O = o1ooiI111iI00100l0.I0000O(OiioloIlOlIi.I00000oOI(O1ooIo101ll.I00000oIO, false, (Function1) obj3));
/* 136 */                           O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, true);
/* 142 */                           int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 146 */                           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 150 */                           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O);
/* 156 */                           IOl0oi0lOl1.I000lI.getClass();
/* 159 */                           iloI0lOlll1.I00i0oil();
/* 164 */                           if (iloI0lOlll1.I00O10llo) {
/* 168 */                               iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                                    } else {
/* 172 */                               iloI0lOlll1.I00io1l();
                                    }
/* 177 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 182 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 191 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 194 */                           li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 199 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 206 */                           iOii1l.invoke(iloI0lOlll1, 0);
/* 209 */                           iloI0lOlll1.I0010I0i(true);
                                    break;
                                }
                            }
                        case 1:
/* 37 */                    ((Integer) obj2).getClass();
/* 44 */                    lO1Ili0ii.I00000oOI(this.I00iiI, this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(49));
                            break;
                        default:
/* 18 */                    ((Integer) obj2).getClass();
/* 25 */                    lOIOOl.I00000oIO(this.I00iiI, this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(49));
                            break;
                    }
/* 28 */            return ooiIlOl1iI;
                }
            }
