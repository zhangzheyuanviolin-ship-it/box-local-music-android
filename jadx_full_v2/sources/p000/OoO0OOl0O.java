            package p000;

            import java.io.IOException;
            import java.math.BigInteger;
            
            public class OoO0OOl0O extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            String strI00lli11 = o01loll1loll.I00lli11();
                    try {
/* 18 */                l1ioi10IIoO0.I00000oIO(strI00lli11);
/* 23 */                return new BigInteger(strI00lli11);
                    } catch (NumberFormatException e) {
/* 34 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Failed parsing '", strI00lli11, "' as BigInteger; at path ");
/* 43 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 186 */               throw new O01Oo001(sbI001IIilI0O.toString(), e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             o01ooi1IIiiO.I00OOll1((BigInteger) obj);
                }
            }
