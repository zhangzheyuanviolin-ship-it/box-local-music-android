            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1Ol0lOOi1 implements IlliIl1l11O {
                public final int I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public O1Ol0lOOi1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 109 */                   String str = (String) this.I00iio;
/* 114 */                   O1ooiI111i o1ooiI111i = (O1ooiI111i) this.I00ilI0I1;
/* 119 */                   Oi1Oo0Il0 oi1Oo0Il0 = (Oi1Oo0Il0) this.I00ilO0;
/* 121 */                   long j = this.I00iiI;
/* 123 */                   long j2 = this.I00iiO;
/* 126 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 132 */                   int iIntValue = ((Integer) obj2).intValue();
/* 146 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 153 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 149 */                       O1Ol1io1o.I0001Ioi1lo(str, o1ooiI111i, oi1Oo0Il0, j, j2, iloI0lOlll1, 0);
                                break;
                            }
                        default:
/* 13 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 17 */                    IOii1l iOii1l = (IOii1l) this.I00ilI0I1;
/* 21 */                    IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00ilO0;
/* 23 */                    long j3 = this.I00iiI;
/* 25 */                    long j4 = this.I00iiO;
/* 28 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 34 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 49 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 102 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 53 */                        Oo0lloOiiIOI oo0lloOiiIOII00000oIO = OoOoOOilil.I00000oIO(Ol1i0Oo.I000O01llI0, iloI0lOlll12);
/* 59 */                        Oo0lloOiiIOI oo0lloOiiIOII00000oIO2 = OoOoOOilil.I00000oIO(Ol1i0Oo.I00000oOI, iloI0lOlll12);
/* 65 */                        OOiIo1lll oOiIo1lllI00000oIO = Oo0i1oIIoOO.I00000oIO.I00000oIO(oo0lloOiiIOII00000oIO);
/* 71 */                        Ol1OoIOl0i ol1OoIOl0i = new Ol1OoIOl0i(i2);
/* 74 */                        ol1OoIOl0i.I00iiI = illiIl1l11O;
/* 76 */                        ol1OoIOl0i.I00iiO = iOii1l;
/* 78 */                        ol1OoIOl0i.I00iio = illiIl1l11O2;
/* 80 */                        ol1OoIOl0i.I00ilI0I1 = oo0lloOiiIOII00000oIO2;
/* 82 */                        ol1OoIOl0i.I00ilO0 = j3;
/* 84 */                        ol1OoIOl0i.I00io1l = j4;
/* 86 */                        VarHandle.storeStoreFence();
/* 98 */                        iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(969655473, ol1OoIOl0i, iloI0lOlll12), iloI0lOlll12, 56);
                                break;
                            }
                    }
/* 105 */           return ooiIlOl1iI;
                }
            }
