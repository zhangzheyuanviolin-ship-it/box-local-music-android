            package p000;

            import java.io.IOException;
            
            public class OoO01OIiliI extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
                    try {
/* 18 */                return Long.valueOf(o01loll1loll.I00Ol00());
                    } catch (NumberFormatException e) {
/* 49 */                throw new O01Oo001(e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             Number number = (Number) obj;
/* 3 */             if (number == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
                    } else {
/* 13 */                o01ooi1IIiiO.I00OIl(number.longValue());
                    }
                }
            }
