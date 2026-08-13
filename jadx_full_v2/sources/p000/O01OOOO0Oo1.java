            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.util.ArrayDeque;
            import java.util.Iterator;
            
            public class O01OOOO0Oo1 extends OoO00O1IiOl {
                public static final O01OOOO0Oo1 I00000oIO = new O01OOOO0Oo1();

                private O01OOOO0Oo1() {
                }

                public static O01O10Ii I0000O(O01loll1loll o01loll1loll) throws IOException {
                    O01O10Ii o01I0il01001;
                    O01O10Ii o01I0il010012;
/* 1 */             int iPeek = o01loll1loll.peek();
/* 5 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iPeek);
/* 11 */            if (iI001lIiIIo1O == 0) {
/* 26 */                o01loll1loll.I00000oIO();
/* 31 */                o01I0il01001 = new O01I0il01001();
                    } else if (iI001lIiIIo1O != 2) {
/* 15 */                o01I0il01001 = null;
                    } else {
/* 17 */                o01loll1loll.I0000Il00O();
/* 22 */                o01I0il01001 = new O01l0lO0li();
                    }
/* 34 */            if (o01I0il01001 == null) {
/* 36 */                return I0000oI00(iPeek, o01loll1loll);
                    }
/* 43 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 50 */                if (o01loll1loll.I00IOO()) {
/* 61 */                    String strI00iOIl = o01I0il01001 instanceof O01l0lO0li ? o01loll1loll.I00iOIl() : null;
/* 62 */                    int iPeek2 = o01loll1loll.peek();
/* 66 */                    int iI001lIiIIo1O2 = IIlIOloOOO.I001lIiIIo1O(iPeek2);
/* 70 */                    if (iI001lIiIIo1O2 == 0) {
/* 85 */                        o01loll1loll.I00000oIO();
/* 90 */                        o01I0il010012 = new O01I0il01001();
                            } else if (iI001lIiIIo1O2 != 2) {
/* 74 */                        o01I0il010012 = null;
                            } else {
/* 76 */                        o01loll1loll.I0000Il00O();
/* 81 */                        o01I0il010012 = new O01l0lO0li();
                            }
/* 97 */                    boolean z = o01I0il010012 != null;
/* 98 */                    if (o01I0il010012 == null) {
/* 100 */                       o01I0il010012 = I0000oI00(iPeek2, o01loll1loll);
                            }
/* 106 */                   if (o01I0il01001 instanceof O01I0il01001) {
/* 111 */                       ((O01I0il01001) o01I0il01001).I0000oI00(o01I0il010012);
                            } else {
/* 118 */                       ((O01l0lO0li) o01I0il01001).I0000oI00(strI00iOIl, o01I0il010012);
                            }
/* 121 */                   if (z) {
/* 123 */                       arrayDeque.addLast(o01I0il01001);
/* 126 */                       o01I0il01001 = o01I0il010012;
                            }
                        } else {
/* 130 */                   if (o01I0il01001 instanceof O01I0il01001) {
/* 132 */                       o01loll1loll.I000l1();
                            } else {
/* 136 */                       o01loll1loll.I00100l0();
                            }
/* 143 */                   if (arrayDeque.isEmpty()) {
/* 145 */                       return o01I0il01001;
                            }
/* 150 */                   o01I0il01001 = (O01O10Ii) arrayDeque.removeLast();
                        }
                    }
                }

                public static O01O10Ii I0000oI00(int i, O01loll1loll o01loll1loll) throws IOException {
/* 1 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 6 */             if (iI001lIiIIo1O == 5) {
/* 78 */                return new O01li1IO(o01loll1loll.I00lli11());
                    }
/* 9 */             if (iI001lIiIIo1O == 6) {
/* 63 */                O0ioIi o0ioIi = new O0ioIi(o01loll1loll.I00lli11());
/* 66 */                O01li1IO o01li1IO = new O01li1IO();
/* 69 */                o01li1IO.I00iOIl = o0ioIi;
/* 71 */                return o01li1IO;
                    }
/* 12 */            if (iI001lIiIIo1O == 7) {
/* 45 */                Boolean boolValueOf = Boolean.valueOf(o01loll1loll.I00IoiI());
/* 49 */                O01li1IO o01li1IO2 = new O01li1IO();
/* 52 */                o01li1IO2.I00iOIl = boolValueOf;
/* 54 */                return o01li1IO2;
                    }
/* 16 */            if (iI001lIiIIo1O == 8) {
/* 18 */                o01loll1loll.I00ioIO();
/* 21 */                return O01iIOolI.I00iOIl;
                    }
/* 34 */            I000II.I001IO000("Unexpected token: ".concat(IlIi0I0.I001IO000(i)));
/* 37 */            return null;
                }

                public static void I0001Ioi1lo(O01ooi1IIiiO o01ooi1IIiiO, O01O10Ii o01O10Ii) throws IOException {
/* 1 */             if (o01O10Ii == null || (o01O10Ii instanceof O01iIOolI)) {
/* 156 */               o01ooi1IIiiO.I00IOO();
/* 551 */               return;
                    }
/* 11 */            if (o01O10Ii instanceof O01li1IO) {
/* 13 */                O01li1IO o01li1IO = (O01li1IO) o01O10Ii;
/* 15 */                Serializable serializable = o01li1IO.I00iOIl;
/* 19 */                if (serializable instanceof Number) {
/* 25 */                    o01ooi1IIiiO.I00OOll1(o01li1IO.I000OiO());
/* 28 */                    return;
                        } else if (serializable instanceof Boolean) {
/* 37 */                    o01ooi1IIiiO.I00iOIl(o01li1IO.I0001Ioi1lo());
/* 40 */                    return;
                        } else {
/* 45 */                    o01ooi1IIiiO.I00Ol00(o01li1IO.I0000O());
/* 48 */                    return;
                        }
                    }
/* 51 */            if (o01O10Ii instanceof O01I0il01001) {
/* 53 */                o01ooi1IIiiO.I0000Il00O();
/* 60 */                Iterator it = ((O01I0il01001) o01O10Ii).I00iOIl.iterator();
/* 68 */                while (it.hasNext()) {
/* 76 */                    I0001Ioi1lo(o01ooi1IIiiO, (O01O10Ii) it.next());
                        }
/* 80 */                o01ooi1IIiiO.I000l1();
/* 83 */                return;
                    }
/* 86 */            if (!(o01O10Ii instanceof O01l0lO0li)) {
/* 152 */               IoOOl0iOl1io.I001l0I00("Couldn't write ", o01O10Ii.getClass());
/* 155 */               return;
                    }
/* 88 */            o01ooi1IIiiO.I000II();
/* 103 */           Iterator it2 = ((O100Oo) o01O10Ii.I00000oOI().I00iOIl.entrySet()).iterator();
/* 114 */           while (((O100iii0I0i) it2).hasNext()) {
/* 119 */               O100l1 o100l1I00000oIO = ((O100O1O) it2).I00000oIO();
/* 129 */               o01ooi1IIiiO.I001i1lo1io((String) o100l1I00000oIO.getKey());
/* 138 */               I0001Ioi1lo(o01ooi1IIiiO, (O01O10Ii) o100l1I00000oIO.getValue());
                    }
/* 142 */           o01ooi1IIiiO.I00100l0();
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) {
/* 1 */             return I0000O(o01loll1loll);
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             I0001Ioi1lo(o01ooi1IIiiO, (O01O10Ii) obj);
                }
            }
