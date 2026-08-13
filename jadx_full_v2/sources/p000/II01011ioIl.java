            package p000;

            import java.util.ArrayList;
            
            public final class II01011ioIl implements IllOOo00lI {
                public final int I00iOIl;
                public II0IOO1i I00iiI;

                public II01011ioIl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Object value;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             II0IOO1i iI0IOO1i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 19 */                    OlO0OIIl1 olO0OIIl1 = iI0IOO1i.I0000O;
/* 33 */                    ArrayList arrayList = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 36 */                    int size = arrayList.size();
/* 40 */                    for (int i2 = 0; i2 < size; i2++) {
/* 59 */                        arrayList.set(i2, II00Ol1Ii.I00000oIO((II00Ol1Ii) arrayList.get(i2), true, true, true, null, 35));
                            }
/* 95 */                    do {
/* 65 */                        value = olO0OIIl1.getValue();
/* 95 */                    } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList, null, false, false, 0, 0, null, 126)));
                        case 1:
/* 15 */                    iI0IOO1i.I000O01llI0();
                            break;
                        default:
/* 11 */                    iI0IOO1i.I000lI(false);
                            break;
                    }
/* 14 */            return ooiIlOl1iI;
                }
            }
