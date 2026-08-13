            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class loiiO1l extends llOl001olOi {
                public static final loiOl1olllIO I00000oOI;
                public int I00000oIO;

                static {
/* 3 */             loiOl1olllIO loiol1olllio = new loiOl1olllIO();
/* 7 */             loiol1olllio.I00iOIl = 1;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            I00000oOI = loiol1olllio;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
                    Object arrayList;
                    Serializable arrayList2;
/* 1 */             int iI00ooIo0 = o0iloioo.I00ooIo0();
                    int i = iI00ooIo0 - 1;
/* 10 */            if (i == 0) {
/* 25 */                o0iloioo.I00Io1lO();
/* 30 */                arrayList = new ArrayList();
                    } else if (i != 2) {
/* 14 */                arrayList = null;
                    } else {
/* 16 */                o0iloioo.I00OIl();
/* 21 */                arrayList = new lo0olliO11(true);
                    }
/* 33 */            if (arrayList == null) {
/* 35 */                return I0000Il00O(o0iloioo, iI00ooIo0);
                    }
/* 42 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 49 */                if (o0iloioo.I00Ol00()) {
/* 60 */                    String strI00iiI = arrayList instanceof Map ? o0iloioo.I00iiI() : null;
/* 61 */                    int iI00ooIo02 = o0iloioo.I00ooIo0();
                            int i2 = iI00ooIo02 - 1;
/* 67 */                    if (i2 == 0) {
/* 82 */                        o0iloioo.I00Io1lO();
/* 87 */                        arrayList2 = new ArrayList();
                            } else if (i2 != 2) {
/* 71 */                        arrayList2 = null;
                            } else {
/* 73 */                        o0iloioo.I00OIl();
/* 78 */                        arrayList2 = new lo0olliO11(true);
                            }
/* 97 */                    Serializable serializableI0000Il00O = arrayList2 == null ? I0000Il00O(o0iloioo, iI00ooIo02) : arrayList2;
/* 100 */                   if (arrayList instanceof List) {
/* 105 */                       ((List) arrayList).add(serializableI0000Il00O);
                            } else {
/* 112 */                       ((Map) arrayList).put(strI00iiI, serializableI0000Il00O);
                            }
/* 115 */                   if (arrayList2 != null) {
/* 117 */                       arrayDeque.addLast(arrayList);
/* 120 */                       arrayList = serializableI0000Il00O;
                            }
                        } else {
/* 124 */                   if (arrayList instanceof List) {
/* 126 */                       o0iloioo.I00IoiI();
                            } else {
/* 130 */                       o0iloioo.I00OOll1();
                            }
/* 137 */                   if (arrayDeque.isEmpty()) {
/* 139 */                       return arrayList;
                            }
/* 140 */                   arrayList = arrayDeque.removeLast();
                        }
                    }
                }

                public final Serializable I0000Il00O(o0IlOioo o0iloioo, int i) {
                    int i2 = i - 1;
/* 4 */             if (i2 == 5) {
/* 69 */                return o0iloioo.I00ioIO();
                    }
/* 7 */             if (i2 == 6) {
                        return this.I00000oIO + (-1) != 0 ? new llooo1oooI(o0iloioo.I00ioIO()) : Double.valueOf(o0iloioo.I00lll10());
                    }
/* 10 */            if (i2 == 7) {
/* 39 */                return Boolean.valueOf(o0iloioo.I00l0I0l0lO1());
                    }
/* 15 */            if (i2 == 8) {
/* 17 */                o0iloioo.I00lli11();
/* 14 */                return null;
                    }
/* 31 */            I000II.I001IO000("Unexpected token: ".concat(ll1OIi.I00000oIO(i)));
/* 14 */            return null;
                }
            }
