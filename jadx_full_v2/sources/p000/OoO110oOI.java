            package p000;

            import java.io.IOException;
            import java.util.Currency;
            
            public class OoO110oOI extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) {
/* 1 */             String strI00lli11 = o01loll1loll.I00lli11();
                    try {
/* 5 */                 return Currency.getInstance(strI00lli11);
                    } catch (IllegalArgumentException e) {
/* 17 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Failed parsing '", strI00lli11, "' as Currency; at path ");
/* 26 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 49 */                throw new O01Oo001(sbI001IIilI0O.toString(), e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 7 */             o01ooi1IIiiO.I00Ol00(((Currency) obj).getCurrencyCode());
                }
            }
