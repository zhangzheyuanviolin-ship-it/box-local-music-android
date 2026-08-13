            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lIOlOiilOIo implements IlliIl1l11O {
                public final int I00iOIl;
                public IllOOo00lI I00iiI;

                public lIOlOiilOIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    boolean z;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 9 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 108 */                   int iIntValue = ((Integer) obj2).intValue();
/* 112 */                   int i2 = iIntValue & 1;
/* 115 */                   z = (iIntValue & 3) != 2;
/* 121 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 127 */                   if (!iloI0lOlll1.I00OIl(i2, z)) {
/* 186 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 129 */                       IllOOo00lI illOOo00lI = this.I00iiI;
/* 131 */                       boolean zI000II = iloI0lOlll1.I000II(illOOo00lI);
/* 135 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 139 */                       if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 145 */                           IiOliI0O0 iiOliI0O0 = new IiOliI0O0(2);
/* 148 */                           iiOliI0O0.I00iiI = illOOo00lI;
/* 150 */                           VarHandle.storeStoreFence();
/* 153 */                           iloI0lOlll1.I00iio(iiOliI0O0);
                                    obj3 = iiOliI0O0;
                                }
/* 180 */                       iIo1101O.I00000oIO(ilI0IIll1l.I00000oIO((IllOOo00lI) obj3, iloI0lOlll1), iO11ilOI.I00000oIO(o1ooIo101ll, "LicenseDetailNavigationIcon"), false, null, null, iOoIiil.I00000oIO, iloI0lOlll1, 1572912, 60);
                                break;
                            }
                        default:
/* 22 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 26 */                    int i3 = iIntValue2 & 1;
/* 29 */                    z = (iIntValue2 & 3) != 2;
/* 35 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 41 */                    if (!iloI0lOlll12.I00OIl(i3, z)) {
/* 100 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 43 */                        IllOOo00lI illOOo00lI2 = this.I00iiI;
/* 45 */                        boolean zI000II2 = iloI0lOlll12.I000II(illOOo00lI2);
/* 49 */                        Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 53 */                        if (zI000II2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 59 */                            IiOliI0O0 iiOliI0O02 = new IiOliI0O0(3);
/* 62 */                            iiOliI0O02.I00iiI = illOOo00lI2;
/* 64 */                            VarHandle.storeStoreFence();
/* 67 */                            iloI0lOlll12.I00iio(iiOliI0O02);
                                    obj4 = iiOliI0O02;
                                }
/* 94 */                        iIo1101O.I00000oIO(ilI0IIll1l.I00000oIO((IllOOo00lI) obj4, iloI0lOlll12), iO11ilOI.I00000oIO(o1ooIo101ll, "LicenseListNavigationIcon"), false, null, null, il11lo0l0ii1.I00000oIO, iloI0lOlll12, 1572912, 60);
                                break;
                            }
                    }
/* 103 */           return ooiIlOl1iI;
                }
            }
