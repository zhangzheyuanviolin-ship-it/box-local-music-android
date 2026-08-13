            package p000;

            import java.math.BigDecimal;
            
            public abstract class ll10OIO0I {
                public static BigDecimal I00000oIO(String str) {
/* 1 */             I00000oOI(str);
/* 6 */             BigDecimal bigDecimal = new BigDecimal(str);
/* 22 */            if (Math.abs(bigDecimal.scale()) < 10000) {
/* 24 */                return bigDecimal;
                    }
/* 77 */            throw new NumberFormatException("Number has unsupported scale: ".concat(str));
                }

                public static void I00000oOI(String str) {
/* 7 */             if (str.length() <= 10000) {
/* 9 */                 return;
                    }
/* 15 */            String strSubstring = str.substring(0, 30);
/* 77 */            throw new NumberFormatException(IIlIOloOOO.I0010I0i(new StringBuilder(strSubstring.length() + 28), "Number string too large: ", strSubstring, "..."));
                }
            }
