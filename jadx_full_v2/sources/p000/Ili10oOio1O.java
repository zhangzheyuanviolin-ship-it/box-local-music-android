            package p000;

            import java.util.ArrayList;
            
            public final class Ili10oOio1O implements IlOil1iooOO0 {
                public final int I00iOIl;
                public ArrayList I00iiI;
                public OI10i0Il I00iiO;

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 59 */                    IooiIloo0i iooiIloo0i = (IooiIloo0i) obj;
/* 61 */                    ArrayList arrayList = this.I00iiI;
/* 65 */                    if (iooiIloo0i instanceof Ili10OO0ii) {
/* 67 */                        arrayList.add(iooiIloo0i);
                            } else if (iooiIloo0i instanceof Ili10ii1li1) {
/* 79 */                        arrayList.remove(((Ili10ii1li1) iooiIloo0i).I00000oIO);
                            }
/* 94 */                    this.I00iiO.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                            break;
                        default:
/* 8 */                     IooiIloo0i iooiIloo0i2 = (IooiIloo0i) obj;
/* 10 */                    ArrayList arrayList2 = this.I00iiI;
/* 14 */                    if (iooiIloo0i2 instanceof OOIII1oOoolO) {
/* 16 */                        arrayList2.add(iooiIloo0i2);
                            } else if (iooiIloo0i2 instanceof OOIIIiOOili) {
/* 28 */                        arrayList2.remove(((OOIIIiOOili) iooiIloo0i2).I00000oIO);
                            } else if (iooiIloo0i2 instanceof OOIII1l) {
/* 40 */                        arrayList2.remove(((OOIII1l) iooiIloo0i2).I00000oIO);
                            }
/* 55 */                    this.I00iiO.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                            break;
                    }
/* 58 */            return ooiIlOl1iI;
                }
            }
