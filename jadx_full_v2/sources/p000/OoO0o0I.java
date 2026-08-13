            package p000;

            import java.io.IOException;
            import java.net.URI;
            import java.net.URISyntaxException;
            
            public class OoO0o0I extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 8 */             if (o01loll1loll.peek() == 9) {
/* 10 */                o01loll1loll.I00ioIO();
/* 7 */                 return null;
                    }
                    try {
/* 14 */                String strI00lli11 = o01loll1loll.I00lli11();
/* 24 */                if (strI00lli11.equals("null")) {
/* 7 */                     return null;
                        }
/* 29 */                return new URI(strI00lli11);
                    } catch (URISyntaxException e) {
/* 49 */                throw new O01Oo001(e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             URI uri = (URI) obj;
/* 11 */            o01ooi1IIiiO.I00Ol00(uri == null ? null : uri.toASCIIString());
                }
            }
