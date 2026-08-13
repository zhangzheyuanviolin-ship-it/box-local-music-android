            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class IO101i implements Illo1I00lOl {
                public final Ii00l101O I00iOIl;
                public final int I00iiI;
                public final IIII0i I00iiO;

                public IO101i(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 4 */             this.I00iOIl = ii00l101O;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = iIII0i;
                }

                @Override
                public Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             Object objI0000Il00O = il001oo1.I0000Il00O(new I00oIiI10(ilOil1iooOO0, this, null, 21), iOoil1iiIilo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IlOil1ii I00000oOI(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 1 */             Ii00l101O ii00l101O2 = this.I00iOIl;
/* 3 */             Ii00l101O ii00l101OI00ioIO = ii00l101O.I00ioIO(ii00l101O2);
/* 7 */             IIII0i iIII0i2 = IIII0i.I00iOIl;
/* 9 */             IIII0i iIII0i3 = this.I00iiO;
/* 11 */            int i2 = this.I00iiI;
/* 13 */            if (iIII0i == iIII0i2) {
/* 17 */                if (i2 != -3) {
/* 20 */                    if (i != -3) {
/* 25 */                        if (i2 != -2) {
/* 28 */                            if (i == -2) {
/* 22 */                                i = i2;
                                    } else {
/* 31 */                                i += i2;
/* 32 */                                if (i < 0) {
/* 35 */                                    i = Integer.MAX_VALUE;
                                        }
                                    }
                                }
                            }
                        }
/* 38 */                iIII0i = iIII0i3;
                    }
                    return (O0000Ioio00.I0000O(ii00l101OI00ioIO, ii00l101O2) && i == i2 && iIII0i == iIII0i3) ? this : I000O01llI0(ii00l101OI00ioIO, i, iIII0i);
                }

                public String I0000O() {
/* 1 */             return null;
                }

                public abstract Object I000II(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo);

                public abstract IO101i I000O01llI0(Ii00l101O ii00l101O, int i, IIII0i iIII0i);

                public IlOil1ii I000OOo1O() {
/* 1 */             return null;
                }

                public OOlloO I000OiO(Ii0110 ii0110) {
/* 2 */             int i = this.I00iiI;
/* 4 */             if (i == -3) {
/* 6 */                 i = -2;
                    }
/* 7 */             Ii01I10 ii01I10 = Ii01I10.I00iiO;
/* 14 */            IlliIl1l11O i00oI0i = new I00oI0i(this, (IOoil1iiIilo) null, 20);
/* 20 */            IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(i, this.I00iiO, null, 4);
/* 33 */            OOIoO0IIOO0 oOIoO0IIOO0 = new OOIoO0IIOO0(iioloOl.I00000oOI(ii0110, this.I00iOIl), true);
/* 36 */            oOIoO0IIOO0.I00ilI0I1 = iiiii1oi1I00000oIO;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            oOIoO0IIOO0.I00iiO(ii01I10, oOIoO0IIOO0, i00oI0i);
/* 49 */            return oOIoO0IIOO0;
                }

                public String toString() {
/* 4 */             ArrayList arrayList = new ArrayList(4);
/* 7 */             String strI0000O = I0000O();
/* 11 */            if (strI0000O != null) {
/* 13 */                arrayList.add(strI0000O);
                    }
/* 16 */            Il00o11 il00o11 = Il00o11.I00iOIl;
/* 18 */            Ii00l101O ii00l101O = this.I00iOIl;
/* 20 */            if (ii00l101O != il00o11) {
/* 36 */                arrayList.add("context=" + ii00l101O);
                    }
/* 40 */            int i = this.I00iiI;
/* 42 */            if (i != -3) {
/* 58 */                arrayList.add("capacity=" + i);
                    }
/* 61 */            IIII0i iIII0i = IIII0i.I00iOIl;
/* 63 */            IIII0i iIII0i2 = this.I00iiO;
/* 65 */            if (iIII0i2 != iIII0i) {
/* 81 */                arrayList.add("onBufferOverflow=" + iIII0i2);
                    }
/* 94 */            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
/* 99 */            sb.append('[');
/* 115 */           return IlIi0I0.I000oI1ioi(sb, IOOi0Ool1i.I00IlilI0i0i(arrayList, ", ", null, null, null, 62), ']');
                }
            }
