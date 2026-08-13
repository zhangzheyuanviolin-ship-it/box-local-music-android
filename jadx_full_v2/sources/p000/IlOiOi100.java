            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IlOiOi100 implements IlliIl1l11O {
                public final int I00iOIl;
                public float I00iiI;
                public long I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IlOiOi100(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 45 */                    long j = this.I00iiO;
/* 50 */                    Oo0lloOiiIOI oo0lloOiiIOI = (Oo0lloOiiIOI) this.I00iio;
/* 52 */                    float f = this.I00iiI;
/* 56 */                    IOii1l iOii1l = (IOii1l) this.I00ilI0I1;
/* 60 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 66 */                    int iIntValue = ((Integer) obj2).intValue();
/* 73 */                    int i2 = 1;
/* 84 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 111 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 88 */                        I0ilioi0II i0ilioi0II = new I0ilioi0II(i2);
/* 91 */                        i0ilioi0II.I00iiI = f;
/* 93 */                        i0ilioi0II.I00iiO = iOii1l;
/* 95 */                        VarHandle.storeStoreFence();
/* 107 */                       lIOi11I01oo.I00000oIO(j, oo0lloOiiIOI, iiioOl1O.I00000oOI(-1767363041, i0ilioi0II, iloI0lOlll1), iloI0lOlll1, 384);
                                break;
                            }
                        default:
/* 32 */                    ((Integer) obj2).getClass();
/* 41 */                    ((i1O10l1io1iO) this.I00iio).I000II((O1ooiI111i) this.I00ilI0I1, this.I00iiI, this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(3073));
                            break;
                    }
/* 44 */            return ooiIlOl1iI;
                }
            }
