            package p000;

            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public class OoO1o010 extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) {
                    try {
/* 7 */                 return new AtomicInteger(o01loll1loll.I00OOll1());
                    } catch (NumberFormatException e) {
/* 49 */                throw new O01Oo001(e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 8 */             o01ooi1IIiiO.I00OIl(((AtomicInteger) obj).get());
                }
            }
