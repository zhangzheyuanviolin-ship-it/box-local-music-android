            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I10OIo implements IlOil1ii {
                public final int I00iOIl;
                public IlOil1ii I00iiI;

                public I10OIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 31 */                    IlOil1ii ilOil1ii = this.I00iiI;
/* 36 */                    I10OIli10o1 i10OIli10o1 = new I10OIli10o1(0);
/* 39 */                    i10OIli10o1.I00iiI = ilOil1iooOO0;
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    Object objI00000oIO = ilOil1ii.I00000oIO(i10OIli10o1, iOoil1iiIilo);
                            return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                        default:
/* 8 */                     IlOil1ii ilOil1ii2 = this.I00iiI;
/* 13 */                    I10OIli10o1 i10OIli10o12 = new I10OIli10o1(1);
/* 16 */                    i10OIli10o12.I00iiI = ilOil1iooOO0;
/* 18 */                    VarHandle.storeStoreFence();
/* 21 */                    Object objI00000oIO2 = ilOil1ii2.I00000oIO(i10OIli10o12, iOoil1iiIilo);
                            return objI00000oIO2 == Ii0111o.I00iOIl ? objI00000oIO2 : ooiIlOl1iI;
                    }
                }
            }
