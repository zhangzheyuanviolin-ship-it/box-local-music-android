            package p000;
            
            public final class IlOllOl implements IlOil1iooOO0 {
                public final int I00iOIl;
                public IlOil1iooOO0 I00iiI;
                public IlliIl1l11O I00iiO;

                /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IlOlioI ilOlioI;
                    IlOoIi0 ilOoIi0;
                    IlOil1iooOO0 ilOil1iooOO0;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i2 = 0;
                    switch (i) {
                        case 0:
/* 110 */                   if (iOoil1iiIilo instanceof IlOlioI) {
/* 113 */                       ilOlioI = (IlOlioI) iOoil1iiIilo;
/* 115 */                       int i3 = ilOlioI.I00iiI;
/* 119 */                       if ((i3 & Integer.MIN_VALUE) != 0) {
/* 122 */                           ilOlioI.I00iiI = i3 - Integer.MIN_VALUE;
                                } else {
/* 127 */                           ilOlioI = new IlOlioI(this, iOoil1iiIilo);
                                }
                            }
/* 130 */                   Object objInvoke = ilOlioI.I00iOIl;
/* 132 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 134 */                   int i4 = ilOlioI.I00iiI;
/* 136 */                   if (i4 == 0) {
/* 159 */                       lIoii1l01l0i.I00000oOI(objInvoke);
/* 162 */                       IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 164 */                       ilOlioI.I00iio = obj;
/* 166 */                       ilOlioI.I00ilI0I1 = 0;
/* 168 */                       ilOlioI.I00iiI = 1;
/* 170 */                       objInvoke = illiIl1l11O.invoke(obj, ilOlioI);
/* 174 */                       if (objInvoke != ii0111o) {
                                }
/* 199 */                       return ii0111o;
                            }
/* 138 */                   if (i4 != 1) {
/* 140 */                       if (i4 == 2) {
/* 142 */                           lIoii1l01l0i.I00000oOI(objInvoke);
/* 200 */                           return ooiIlOl1iI;
                                }
/* 146 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 151 */                   i2 = ilOlioI.I00ilI0I1;
/* 153 */                   obj = ilOlioI.I00iio;
/* 155 */                   lIoii1l01l0i.I00000oOI(objInvoke);
/* 183 */                   if (!((Boolean) objInvoke).booleanValue()) {
/* 206 */                       throw new I00i0ilIl0i(this);
                            }
/* 185 */                   IlOil1iooOO0 ilOil1iooOO02 = this.I00iiI;
/* 187 */                   ilOlioI.I00iio = null;
/* 189 */                   ilOlioI.I00ilI0I1 = i2;
/* 191 */                   ilOlioI.I00iiI = 2;
/* 197 */                   if (ilOil1iooOO02.emit(obj, ilOlioI) != ii0111o) {
/* 200 */                       return ooiIlOl1iI;
                            }
/* 199 */                   return ii0111o;
                        default:
/* 18 */                    if (iOoil1iiIilo instanceof IlOoIi0) {
/* 21 */                        ilOoIi0 = (IlOoIi0) iOoil1iiIilo;
/* 23 */                        int i5 = ilOoIi0.I00iiI;
/* 27 */                        if ((i5 & Integer.MIN_VALUE) != 0) {
/* 30 */                            ilOoIi0.I00iiI = i5 - Integer.MIN_VALUE;
                                } else {
/* 35 */                            ilOoIi0 = new IlOoIi0(this, iOoil1iiIilo);
                                }
                            }
/* 38 */                    Object obj2 = ilOoIi0.I00iOIl;
/* 40 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 42 */                    int i6 = ilOoIi0.I00iiI;
/* 44 */                    if (i6 == 0) {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj2);
/* 72 */                        IlOil1iooOO0 ilOil1iooOO03 = this.I00iiI;
/* 74 */                        IlliIl1l11O illiIl1l11O2 = this.I00iiO;
/* 76 */                        ilOoIi0.I00iio = obj;
/* 78 */                        ilOoIi0.I00ilI0I1 = ilOil1iooOO03;
/* 80 */                        ilOoIi0.I00ilO0 = 0;
/* 82 */                        ilOoIi0.I00iiI = 1;
/* 88 */                        if (illiIl1l11O2.invoke(obj, ilOoIi0) != ii0111o2) {
/* 91 */                            ilOil1iooOO0 = ilOil1iooOO03;
                                }
/* 106 */                       return ii0111o2;
                            }
/* 46 */                    if (i6 != 1) {
/* 48 */                        if (i6 == 2) {
/* 50 */                            lIoii1l01l0i.I00000oOI(obj2);
/* 107 */                           return ooiIlOl1iI;
                                }
/* 54 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 59 */                    i2 = ilOoIi0.I00ilO0;
/* 61 */                    ilOil1iooOO0 = ilOoIi0.I00ilI0I1;
/* 63 */                    obj = ilOoIi0.I00iio;
/* 65 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 92 */                    ilOoIi0.I00iio = null;
/* 94 */                    ilOoIi0.I00ilI0I1 = null;
/* 96 */                    ilOoIi0.I00ilO0 = i2;
/* 98 */                    ilOoIi0.I00iiI = 2;
/* 104 */                   if (ilOil1iooOO0.emit(obj, ilOoIi0) != ii0111o2) {
/* 107 */                       return ooiIlOl1iI;
                            }
/* 106 */                   return ii0111o2;
                    }
                }
            }
