            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class OIOiOOI extends OoO00O1IiOl {
                public static final OIOiIoll11Ol I0000Il00O;
                public OoIlIoo1oiOo I00000oIO;
                public int I00000oOI;

                static {
/* 3 */             OIOiIoll11Ol oIOiIoll11Ol = new OIOiIoll11Ol();
/* 7 */             oIOiIoll11Ol.I00iOIl = 1;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            I0000Il00O = oIOiIoll11Ol;
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    Object arrayList;
                    Serializable arrayList2;
/* 1 */             int iPeek = o01loll1loll.peek();
/* 5 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iPeek);
/* 12 */            if (iI001lIiIIo1O == 0) {
/* 27 */                o01loll1loll.I00000oIO();
/* 32 */                arrayList = new ArrayList();
                    } else if (iI001lIiIIo1O != 2) {
/* 16 */                arrayList = null;
                    } else {
/* 18 */                o01loll1loll.I0000Il00O();
/* 23 */                arrayList = new O100l1O0IiiO(true);
                    }
/* 35 */            if (arrayList == null) {
/* 37 */                return I0000O(iPeek, o01loll1loll);
                    }
/* 44 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 51 */                if (o01loll1loll.I00IOO()) {
/* 62 */                    String strI00iOIl = arrayList instanceof Map ? o01loll1loll.I00iOIl() : null;
/* 63 */                    int iPeek2 = o01loll1loll.peek();
/* 67 */                    int iI001lIiIIo1O2 = IIlIOloOOO.I001lIiIIo1O(iPeek2);
/* 71 */                    if (iI001lIiIIo1O2 == 0) {
/* 86 */                        o01loll1loll.I00000oIO();
/* 91 */                        arrayList2 = new ArrayList();
                            } else if (iI001lIiIIo1O2 != 2) {
/* 75 */                        arrayList2 = null;
                            } else {
/* 77 */                        o01loll1loll.I0000Il00O();
/* 82 */                        arrayList2 = new O100l1O0IiiO(true);
                            }
/* 98 */                    boolean z = arrayList2 != null;
/* 99 */                    if (arrayList2 == null) {
/* 101 */                       arrayList2 = I0000O(iPeek2, o01loll1loll);
                            }
/* 107 */                   if (arrayList instanceof List) {
/* 112 */                       ((List) arrayList).add(arrayList2);
                            } else {
/* 119 */                       ((Map) arrayList).put(strI00iOIl, arrayList2);
                            }
/* 122 */                   if (z) {
/* 124 */                       arrayDeque.addLast(arrayList);
/* 127 */                       arrayList = arrayList2;
                            }
                        } else {
/* 131 */                   if (arrayList instanceof List) {
/* 133 */                       o01loll1loll.I000l1();
                            } else {
/* 137 */                       o01loll1loll.I00100l0();
                            }
/* 144 */                   if (arrayDeque.isEmpty()) {
/* 146 */                       return arrayList;
                            }
/* 147 */                   arrayList = arrayDeque.removeLast();
                        }
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             if (obj == null) {
/* 3 */                 o01ooi1IIiiO.I00IOO();
/* 6 */                 return;
                    }
/* 7 */             OoIlIoo1oiOo ooIlIoo1oiOo = this.I00000oIO;
/* 9 */             Class<?> cls = obj.getClass();
/* 13 */            ooIlIoo1oiOo.getClass();
/* 21 */            OoO00O1IiOl ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(new OoOilO(cls));
/* 27 */            if (!(ooO00O1IiOlI0000O instanceof OIOiOOI)) {
/* 36 */                ooO00O1IiOlI0000O.I0000Il00O(o01ooi1IIiiO, obj);
                    } else {
/* 29 */                o01ooi1IIiiO.I000II();
/* 32 */                o01ooi1IIiiO.I00100l0();
                    }
                }

                public final Serializable I0000O(int i, O01loll1loll o01loll1loll) throws IOException {
/* 1 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 6 */             if (iI001lIiIIo1O == 5) {
/* 53 */                return o01loll1loll.I00lli11();
                    }
/* 9 */             if (iI001lIiIIo1O == 6) {
/* 48 */                return Oi010OO0.I00000oOI(this.I00000oOI, o01loll1loll);
                    }
/* 12 */            if (iI001lIiIIo1O == 7) {
/* 41 */                return Boolean.valueOf(o01loll1loll.I00IoiI());
                    }
/* 17 */            if (iI001lIiIIo1O == 8) {
/* 19 */                o01loll1loll.I00ioIO();
/* 16 */                return null;
                    }
/* 33 */            I000II.I001IO000("Unexpected token: ".concat(IlIi0I0.I001IO000(i)));
/* 16 */            return null;
                }
            }
