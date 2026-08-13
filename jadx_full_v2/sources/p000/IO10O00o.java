            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class IO10O00o extends IO101i {
                public final IlOil1ii I00iio;

                public IO10O00o(int i, IIII0i iIII0i, Ii00l101O ii00l101O, IlOil1ii ilOil1ii) {
/* 1 */             super(ii00l101O, i, iIII0i);
/* 4 */             this.I00iio = ilOil1ii;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 9 */             if (this.I00iiI == -3) {
/* 11 */                Ii00l101O context = iOoil1iiIilo.getContext();
/* 15 */                Boolean bool = Boolean.FALSE;
/* 21 */                IOioOOi0I iOioOOi0I = new IOioOOi0I(27);
/* 24 */                Ii00l101O ii00l101O = this.I00iOIl;
/* 43 */                Ii00l101O ii00l101OI00ioIO = !((Boolean) ii00l101O.I00IoiI(iOioOOi0I, bool)).booleanValue() ? context.I00ioIO(ii00l101O) : iioloOl.I00000oIO(context, ii00l101O, false);
/* 51 */                if (O0000Ioio00.I0000O(ii00l101OI00ioIO, context)) {
/* 53 */                    Object objI000iOII = I000iOII(ilOil1iooOO0, iOoil1iiIilo);
/* 59 */                    if (objI000iOII == Ii0111o.I00iOIl) {
/* 61 */                        return objI000iOII;
                            }
                        } else {
/* 62 */                    o0iOli o0ioli = o0iOli.I00iiO;
/* 76 */                    if (O0000Ioio00.I0000O(ii00l101OI00ioIO.I00lli11(o0ioli), context.I00lli11(o0ioli))) {
/* 78 */                        Ii00l101O context2 = iOoil1iiIilo.getContext();
/* 82 */                        boolean z = ilOil1iooOO0 instanceof Oil1iii;
/* 84 */                        Oll1iiOII oll1iiOII = Oo0ooOi10I.I00000oOI;
/* 86 */                        IOoil1iiIilo iOoil1iiIilo2 = null;
/* 87 */                        if (!z && !(ilOil1iooOO0 instanceof OIIoiOooI1)) {
/* 97 */                            I0l0lIoI i0l0lIoI = new I0l0lIoI(7);
/* 100 */                           i0l0lIoI.I00iiI = context2;
/* 106 */                           i0l0lIoI.I00iiO = context2.I00IoiI(oll1iiOII, 0);
/* 113 */                           i0l0lIoI.I00iio = new Ol110ii1I(ilOil1iooOO0, null);
/* 115 */                           VarHandle.storeStoreFence();
/* 118 */                           ilOil1iooOO0 = i0l0lIoI;
                                }
/* 130 */                       Object objI00000oIO = iOl1OoiOoil.I00000oIO(ii00l101OI00ioIO, ilOil1iooOO0, ii00l101OI00ioIO.I00IoiI(oll1iiOII, 0), new I00oI0i(this, iOoil1iiIilo2, 21), iOoil1iiIilo);
/* 136 */                       if (objI00000oIO == Ii0111o.I00iOIl) {
/* 138 */                           return objI00000oIO;
                                }
                            } else {
/* 139 */                       Object objI00000oIO2 = super.I00000oIO(ilOil1iooOO0, iOoil1iiIilo);
/* 145 */                       if (objI00000oIO2 == Ii0111o.I00iOIl) {
/* 147 */                           return objI00000oIO2;
                                }
                            }
                        }
                    }
/* 148 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object I000II(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             Object objI000iOII = I000iOII(new Oil1iii(oOIoOo0O), iOoil1iiIilo);
                    return objI000iOII == Ii0111o.I00iOIl ? objI000iOII : OoiIlOl1iI.I00000oIO;
                }

                public abstract Object I000iOII(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo);

                @Override
                public final String toString() {
/* 23 */            return this.I00iio + " -> " + super.toString();
                }
            }
