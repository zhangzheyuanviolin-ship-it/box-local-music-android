            package p000;

            import java.io.IOException;
            
            public class OoO0IoiilIo extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            String strI00lli11 = o01loll1loll.I00lli11();
/* 23 */            if (strI00lli11.length() == 1) {
/* 30 */                return Character.valueOf(strI00lli11.charAt(0));
                    }
/* 41 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Expecting character, got: ", strI00lli11, "; at ");
/* 49 */            sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 186 */           throw new O01Oo001(sbI001IIilI0O.toString());
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             Character ch = (Character) obj;
/* 11 */            o01ooi1IIiiO.I00Ol00(ch == null ? null : String.valueOf(ch));
                }
            }
