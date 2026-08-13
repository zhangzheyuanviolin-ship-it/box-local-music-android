            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class II0I00Io1 implements IlliIl1l11O {
                public final int I00iOIl;
                public IllOOo00lI I00iiI;
                public OI10i0Il I00iiO;

                public II0I00Io1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 96 */                    boolean z = false;
/* 97 */                    IllOOo00lI illOOo00lI = this.I00iiI;
/* 99 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 103 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 109 */                   int iIntValue = ((Integer) obj2).intValue();
/* 115 */                   if ((iIntValue & 3) != 2) {
/* 117 */                       z = true;
                            }
/* 124 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, z)) {
/* 149 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 145 */                       iIo1101O.I00000oIO(illOOo00lI, null, ((Boolean) oI10i0Il.getValue()).booleanValue(), null, null, i1OOlO1O0i.I00000oIO, iloI0lOlll1, 1572864, 58);
                                break;
                            }
                        default:
/* 13 */                    IllOOo00lI illOOo00lI2 = this.I00iiI;
/* 15 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 19 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 25 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 40 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 92 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 42 */                        boolean zI000II = iloI0lOlll12.I000II(illOOo00lI2);
/* 46 */                        Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 50 */                        if (!zI000II) {
                                    Object obj3 = objI00O0i0ii;
/* 54 */                            if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 59 */                                II00l001Iooo iI00l001Iooo = new II00l001Iooo(4);
/* 62 */                                iI00l001Iooo.I00iiI = illOOo00lI2;
/* 64 */                                iI00l001Iooo.I00iiO = oI10i0Il2;
/* 66 */                                VarHandle.storeStoreFence();
/* 69 */                                iloI0lOlll12.I00iio(iI00l001Iooo);
                                        obj3 = iI00l001Iooo;
                                    }
/* 88 */                            iOiO0o0oi.I00000oIO((IllOOo00lI) obj3, null, false, null, null, null, null, null, iIIO1o00ioIO.I0000Il00O, iloI0lOlll12, 805306368, 510);
                                    break;
                                }
                            }
                    }
/* 95 */            return ooiIlOl1iI;
                }
            }
