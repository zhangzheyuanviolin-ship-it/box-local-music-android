            package p000;

            import java.io.IOException;
            import java.util.BitSet;
            
            public class OoO11I extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException, NumberFormatException {
                    boolean zI00IoiI;
/* 3 */             BitSet bitSet = new BitSet();
/* 6 */             o01loll1loll.I00000oIO();
/* 9 */             int iPeek = o01loll1loll.peek();
/* 14 */            int i = 0;
/* 16 */            while (iPeek != 2) {
/* 18 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iPeek);
/* 23 */                if (iI001lIiIIo1O == 5 || iI001lIiIIo1O == 6) {
/* 72 */                    int iI00OOll1 = o01loll1loll.I00OOll1();
/* 76 */                    if (iI00OOll1 == 0) {
/* 78 */                        zI00IoiI = false;
                            } else {
/* 81 */                        if (iI00OOll1 != 1) {
/* 102 */                           StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Invalid bitset value ", iI00OOll1, ", expected 0 or 1; at path ");
/* 110 */                           sbI00100o1O0lo.append(o01loll1loll.I001l0I00(true));
/* 120 */                           throw new O01Oo001(sbI00100o1O0lo.toString());
                                }
/* 83 */                        zI00IoiI = true;
                            }
                        } else {
/* 29 */                    if (iI001lIiIIo1O != 7) {
/* 71 */                        throw new O01Oo001("Invalid bitset value type: " + IlIi0I0.I001IO000(iPeek) + "; at path " + o01loll1loll.I001l0I00(false));
                            }
/* 31 */                    zI00IoiI = o01loll1loll.I00IoiI();
                        }
/* 84 */                if (zI00IoiI) {
/* 86 */                    bitSet.set(i);
                        }
/* 89 */                i++;
/* 91 */                iPeek = o01loll1loll.peek();
                    }
/* 121 */           o01loll1loll.I000l1();
/* 186 */           return bitSet;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             BitSet bitSet = (BitSet) obj;
/* 3 */             o01ooi1IIiiO.I0000Il00O();
/* 6 */             int length = bitSet.length();
/* 11 */            for (int i = 0; i < length; i++) {
/* 18 */                o01ooi1IIiiO.I00OIl(bitSet.get(i) ? 1L : 0L);
                    }
/* 24 */            o01ooi1IIiiO.I000l1();
                }
            }
