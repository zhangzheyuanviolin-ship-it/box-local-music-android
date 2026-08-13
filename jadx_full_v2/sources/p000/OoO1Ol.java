            package p000;

            import java.io.IOException;
            
            public class OoO1Ol extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
                    try {
/* 14 */                int iI00OOll1 = o01loll1loll.I00OOll1();
/* 20 */                if (iI00OOll1 <= 255 && iI00OOll1 >= -128) {
/* 27 */                    return Byte.valueOf((byte) iI00OOll1);
                        }
/* 38 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Lossy conversion from ", iI00OOll1, " to byte; at path ");
/* 47 */                sbI00100o1O0lo.append(o01loll1loll.I001l0I00(true));
/* 57 */                throw new O01Oo001(sbI00100o1O0lo.toString());
                    } catch (NumberFormatException e) {
/* 186 */               throw new O01Oo001(e);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 3 */             if (((Number) obj) == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
                    } else {
/* 14 */                o01ooi1IIiiO.I00OIl(r4.byteValue());
                    }
                }
            }
