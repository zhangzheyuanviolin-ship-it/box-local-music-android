            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I0io00O implements IlliIl1l11O {
                public final int I00iOIl;
                public IOii1l I00iiI;
                public IlliIl1l11O I00iiO;

                public I0io00O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 70 */                    IOii1l iOii1l = this.I00iiI;
/* 72 */                    IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 74 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 78 */                    int iIntValue = ((Integer) obj2).intValue();
/* 92 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 193 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 102 */                       float f = ((Iil1010O) iloI0lOlll1.I000iOII(IooiioIo.I0000Il00O)).I00iOIl;
/* 109 */                       if (Float.isNaN(f)) {
/* 112 */                           f = 0.0f;
                                }
/* 122 */                       Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(8.0f - (f - IIIi0o0.I0000Il00O()));
/* 126 */                       Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(0.0f);
/* 130 */                       Iil1010O iil1010OI00000oIO3 = Iil1010O.I00000oIO(8.0f);
/* 138 */                       if (iil1010OI00000oIO2.compareTo(iil1010OI00000oIO3) > 0) {
/* 188 */                           IioIoO10iOiI.I000iOII("Cannot coerce value to an empty range: maximum ", iil1010OI00000oIO3, " is less than minimum ", iil1010OI00000oIO2, 46);
                                    break;
                                } else {
/* 144 */                           if (iil1010OI00000oIO.compareTo(iil1010OI00000oIO2) < 0) {
/* 146 */                               iil1010OI00000oIO = iil1010OI00000oIO2;
                                    } else if (iil1010OI00000oIO.compareTo(iil1010OI00000oIO3) > 0) {
/* 154 */                               iil1010OI00000oIO = iil1010OI00000oIO3;
                                    }
/* 155 */                           float f2 = iil1010OI00000oIO.I00iOIl;
/* 159 */                           I0io00O i0io00O = new I0io00O(i2);
/* 162 */                           i0io00O.I00iiI = iOii1l;
/* 164 */                           i0io00O.I00iiO = illiIl1l11O;
/* 166 */                           VarHandle.storeStoreFence();
/* 178 */                           I0ioOOo1i0l1.I00000oOI(f2, iiioOl1O.I00000oOI(-459506658, i0io00O, iloI0lOlll1), iloI0lOlll1, 384);
                                    break;
                                }
                            }
                        default:
/* 11 */                    IOii1l iOii1l2 = this.I00iiI;
/* 13 */                    IlliIl1l11O illiIl1l11O2 = this.I00iiO;
/* 15 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 19 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 39 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 66 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 41 */                        iOii1l2.invoke(iloI0lOlll12, 0);
/* 44 */                        if (illiIl1l11O2 == null) {
/* 49 */                            iloI0lOlll12.I00i01iIIliI(-1102003461);
                                } else {
/* 59 */                            iloI0lOlll12.I00i01iIIliI(795735494);
/* 62 */                            illiIl1l11O2.invoke(iloI0lOlll12, 0);
                                }
/* 52 */                        iloI0lOlll12.I0010I0i(false);
                                break;
                            }
                    }
/* 69 */            return ooiIlOl1iI;
                }
            }
