            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IlioIlil1 implements IlliIl1l11O {
                public final int I00iOIl;
                public IOii1l I00iiI;

                public IlioIlil1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 168 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 178 */                   if ((((Number) obj2).intValue() & 3) != 2 || !iloI0lOlll1.I00IO1()) {
/* 197 */                       this.I00iiI.invoke(iloI0lOlll1, 0);
                                break;
                            } else {
/* 187 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            }
                            break;
                        case 1:
/* 135 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 145 */                   if ((((Number) obj2).intValue() & 3) != 2 || !iloI0lOlll12.I00IO1()) {
/* 164 */                       this.I00iiI.invoke(iloI0lOlll12, 0);
                                break;
                            } else {
/* 154 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            }
                        case 2:
/* 78 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 88 */                    if ((((Number) obj2).intValue() & 3) != 2 || !iloI0lOlll13.I00IO1()) {
/* 105 */                       OOiIo1lll oOiIo1lllI00000oIO = Oi1Iilll.I00000oIO.I00000oIO(Boolean.TRUE);
/* 111 */                       IOii1l iOii1l = this.I00iiI;
/* 114 */                       IlioIlil1 ilioIlil1 = new IlioIlil1(1);
/* 117 */                       ilioIlil1.I00iiI = iOii1l;
/* 119 */                       VarHandle.storeStoreFence();
/* 131 */                       iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(1492427592, ilioIlil1, iloI0lOlll13), iloI0lOlll13, 56);
                                break;
                            } else {
/* 97 */                        iloI0lOlll13.I00OilO00Il();
                                break;
                            }
                            break;
                        case 3:
/* 43 */                    IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj;
/* 53 */                    if ((((Number) obj2).intValue() & 3) != 2 || !iloI0lOlll14.I00IO1()) {
/* 74 */                        this.I00iiI.invoke(Oi1O00I1.I00000oIO, iloI0lOlll14, 0);
                                break;
                            } else {
/* 62 */                        iloI0lOlll14.I00OilO00Il();
                                break;
                            }
                        default:
/* 10 */                    IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj;
/* 20 */                    if ((((Number) obj2).intValue() & 3) != 2 || !iloI0lOlll15.I00IO1()) {
/* 39 */                        this.I00iiI.invoke(iloI0lOlll15, 0);
                                break;
                            } else {
/* 29 */                        iloI0lOlll15.I00OilO00Il();
                                break;
                            }
                            break;
                    }
/* 42 */            return ooiIlOl1iI;
                }
            }
