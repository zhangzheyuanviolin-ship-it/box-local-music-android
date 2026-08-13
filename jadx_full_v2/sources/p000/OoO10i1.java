            package p000;

            import java.io.IOException;
            import java.net.InetAddress;
            
            public class OoO10i1 extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() != 9) {
/* 18 */                return InetAddress.getByName(o01loll1loll.I00lli11());
                    }
/* 9 */             o01loll1loll.I00ioIO();
/* 12 */            return null;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             InetAddress inetAddress = (InetAddress) obj;
/* 11 */            o01ooi1IIiiO.I00Ol00(inetAddress == null ? null : inetAddress.getHostAddress());
                }
            }
