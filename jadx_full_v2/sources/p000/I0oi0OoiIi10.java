            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I0oi0OoiIi10 implements IlliIl1l11O {
                public final int I00iOIl;
                public O1ooiI111i I00iiI;
                public OI10ooOi I00iiO;
                public OiOl01il10lO I00iio;
                public OioOIi1o0I I00ilI0I1;
                public long I00ilO0;
                public float I00io1l;
                public IOii1l I00ioIO;
                public Object I00l0I0l0lO1;

                public I0oi0OoiIi10(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 49 */                    O1ooiI111i o1ooiI111i = this.I00iiI;
/* 51 */                    OI10ooOi oI10ooOi = this.I00iiO;
/* 55 */                    Iio0oiOoI0 iio0oiOoI0 = (Iio0oiOoI0) this.I00l0I0l0lO1;
/* 57 */                    OiOl01il10lO oiOl01il10lO = this.I00iio;
/* 59 */                    OioOIi1o0I oioOIi1o0I = this.I00ilI0I1;
/* 61 */                    long j = this.I00ilO0;
/* 63 */                    float f = this.I00io1l;
/* 65 */                    IOii1l iOii1l = this.I00ioIO;
/* 69 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 75 */                    int iIntValue = ((Integer) obj2).intValue();
/* 92 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 147 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 94 */                        boolean zI000II = iloI0lOlll1.I000II(iio0oiOoI0);
/* 98 */                        Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 102 */                       if (!zI000II) {
                                    Object obj3 = objI00O0i0ii;
/* 106 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 110 */                               I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i2);
/* 113 */                               i0OIOO00l0O.I00iiI = iio0oiOoI0;
/* 115 */                               VarHandle.storeStoreFence();
/* 118 */                               iloI0lOlll1.I00iio(i0OIOO00l0O);
                                        obj3 = i0OIOO00l0O;
                                    }
/* 141 */                           O1ioliIli0o.I00000oIO(o1ooiI111i, oI10ooOi, (IllOOo00lI) obj3, oiOl01il10lO, oioOIi1o0I, j, f, iOii1l, iloI0lOlll1, 0);
                                    break;
                                }
                            }
                        default:
/* 38 */                    ((Integer) obj2).getClass();
/* 45 */                    O1ioliIli0o.I00000oIO(this.I00iiI, this.I00iiO, (IllOOo00lI) this.I00l0I0l0lO1, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                    }
/* 48 */            return ooiIlOl1iI;
                }
            }
