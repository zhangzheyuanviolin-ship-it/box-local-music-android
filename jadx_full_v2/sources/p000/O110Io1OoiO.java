            package p000;

            import android.graphics.Bitmap;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class O110Io1OoiO implements IlliIl1l11O {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public IlliIl1l11O I00iiO;

                public O110Io1OoiO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 151 */                   IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 155 */                   Bitmap bitmap = (Bitmap) obj;
/* 164 */                   this.I00iiI.setValue(new I0oO00o(bitmap));
/* 167 */                   illiIl1l11O.invoke(bitmap, (IoiO1IO1I1i) obj2);
                            break;
                        default:
/* 8 */                     OI10i0Il oI10i0Il = this.I00iiI;
/* 10 */                    IlliIl1l11O illiIl1l11O2 = this.I00iiO;
/* 12 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 16 */                    int iIntValue = ((Integer) obj2).intValue();
/* 35 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 147 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 37 */                        Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 43 */                        if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 49 */                            O1i0lolo o1i0lolo = new O1i0lolo(21);
/* 52 */                            o1i0lolo.I00iiI = oI10i0Il;
/* 54 */                            VarHandle.storeStoreFence();
/* 57 */                            iloI0lOlll1.I00iio(o1i0lolo);
                                    obj3 = o1i0lolo;
                                }
/* 64 */                        O1ooiI111i o1ooiI111iI00000oIO = iO010ilOIO.I00000oIO(O1ooIo101ll.I00000oIO, (Function1) obj3);
/* 70 */                        O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 76 */                        int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 80 */                        OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 84 */                        O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 90 */                        IOl0oi0lOl1.I000lI.getClass();
/* 93 */                        iloI0lOlll1.I00i0oil();
/* 98 */                        if (iloI0lOlll1.I00O10llo) {
/* 102 */                           iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 106 */                           iloI0lOlll1.I00io1l();
                                }
/* 111 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 116 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 125 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 128 */                       li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 133 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 140 */                       illiIl1l11O2.invoke(iloI0lOlll1, 0);
/* 143 */                       iloI0lOlll1.I0010I0i(true);
                                break;
                            }
                    }
/* 150 */           return ooiIlOl1iI;
                }
            }
