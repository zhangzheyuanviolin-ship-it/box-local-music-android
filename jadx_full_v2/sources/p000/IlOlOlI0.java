            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IlOlOlI0 implements IlOil1ii {
                public final int I00iOIl;
                public IlOil1ii I00iiI;
                public IlliIl1l11O I00iiO;

                public IlOlOlI0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
                    IlOlill ilOlill;
                    IlOllOl ilOllOl;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 133 */                   OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 136 */                   IlOil1ii ilOil1ii = this.I00iiI;
/* 140 */                   IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 143 */                   I0l0lIoI i0l0lIoI = new I0l0lIoI(4);
/* 146 */                   i0l0lIoI.I00iiI = oOo0l0ii10l;
/* 148 */                   i0l0lIoI.I00iiO = ilOil1iooOO0;
/* 150 */                   i0l0lIoI.I00iio = illiIl1l11O;
/* 152 */                   VarHandle.storeStoreFence();
/* 155 */                   Object objI00000oIO = ilOil1ii.I00000oIO(i0l0lIoI, iOoil1iiIilo);
                            return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : ooiIlOl1iI;
                        case 1:
/* 37 */                    if (iOoil1iiIilo instanceof IlOlill) {
/* 40 */                        ilOlill = (IlOlill) iOoil1iiIilo;
/* 42 */                        int i2 = ilOlill.I00iiI;
/* 48 */                        if ((i2 & Integer.MIN_VALUE) != 0) {
/* 51 */                            ilOlill.I00iiI = i2 - Integer.MIN_VALUE;
                                } else {
/* 56 */                            ilOlill = new IlOlill(this, iOoil1iiIilo);
                                }
                            }
/* 59 */                    Object obj = ilOlill.I00iOIl;
/* 61 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 63 */                    int i3 = ilOlill.I00iiI;
/* 65 */                    if (i3 == 0) {
/* 84 */                        lIoii1l01l0i.I00000oOI(obj);
/* 87 */                        IlOil1ii ilOil1ii2 = this.I00iiI;
/* 91 */                        IlliIl1l11O illiIl1l11O2 = this.I00iiO;
/* 94 */                        IlOllOl ilOllOl2 = new IlOllOl(0);
/* 97 */                        ilOllOl2.I00iiO = illiIl1l11O2;
/* 99 */                        ilOllOl2.I00iiI = ilOil1iooOO0;
/* 101 */                       VarHandle.storeStoreFence();
                                try {
/* 104 */                           ilOlill.I00iio = ilOllOl2;
/* 106 */                           ilOlill.I00iiI = 1;
                                    return ilOil1ii2.I00000oIO(ilOllOl2, ilOlill) == ii0111o ? ii0111o : ooiIlOl1iI;
                                } catch (I00i0ilIl0i e) {
/* 116 */                           e = e;
/* 117 */                           ilOllOl = ilOllOl2;
                                }
                            } else {
/* 67 */                        if (i3 != 1) {
/* 79 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 82 */                            return null;
                                }
/* 69 */                        ilOllOl = ilOlill.I00iio;
                                try {
/* 71 */                            lIoii1l01l0i.I00000oOI(obj);
/* 129 */                           return ooiIlOl1iI;
                                } catch (I00i0ilIl0i e2) {
/* 75 */                            e = e2;
                                }
                            }
/* 120 */                   if (e.I00iOIl != ilOllOl) {
/* 130 */                       throw e;
                            }
/* 126 */                   l01oO1iOo.I0000O(ilOlill.getContext());
/* 129 */                   return ooiIlOl1iI;
                        default:
/* 9 */                     IlOil1ii ilOil1ii3 = this.I00iiI;
/* 13 */                    IlliIl1l11O illiIl1l11O3 = this.I00iiO;
/* 15 */                    IlOllOl ilOllOl3 = new IlOllOl(1);
/* 18 */                    ilOllOl3.I00iiI = ilOil1iooOO0;
/* 20 */                    ilOllOl3.I00iiO = illiIl1l11O3;
/* 22 */                    VarHandle.storeStoreFence();
/* 25 */                    Object objI00000oIO2 = ilOil1ii3.I00000oIO(ilOllOl3, iOoil1iiIilo);
                            return objI00000oIO2 == Ii0111o.I00iOIl ? objI00000oIO2 : ooiIlOl1iI;
                    }
                }
            }
