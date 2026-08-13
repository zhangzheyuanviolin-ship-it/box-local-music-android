            package p000;

            import java.io.IOException;
            import java.math.BigDecimal;
            
            public class OoO0OII extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            String strI00lli11 = o01loll1loll.I00lli11();
                    try {
/* 18 */                return l1ioi10IIoO0.I00000oOI(strI00lli11);
                    } catch (NumberFormatException e) {
/* 30 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Failed parsing '", strI00lli11, "' as BigDecimal; at path ");
/* 39 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 49 */                throw new O01Oo001(sbI001IIilI0O.toString(), e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             o01ooi1IIiiO.I00OOll1((BigDecimal) obj);
                }
            }
