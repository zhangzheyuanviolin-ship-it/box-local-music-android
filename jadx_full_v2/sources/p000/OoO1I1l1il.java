            package p000;

            import java.io.IOException;
            
            public class OoO1I1l1il extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 1 */             int iPeek = o01loll1loll.peek();
/* 7 */             if (iPeek != 9) {
                        return iPeek == 6 ? Boolean.valueOf(Boolean.parseBoolean(o01loll1loll.I00lli11())) : Boolean.valueOf(o01loll1loll.I00IoiI());
                    }
/* 9 */             o01loll1loll.I00ioIO();
/* 12 */            return null;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             Boolean bool = (Boolean) obj;
/* 3 */             if (bool == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
/* 89 */                return;
                    }
/* 9 */             o01ooi1IIiiO.I00iiI();
/* 12 */            o01ooi1IIiiO.I00000oIO();
/* 28 */            o01ooi1IIiiO.I00iOIl.write(bool.booleanValue() ? "true" : "false");
                }
            }
