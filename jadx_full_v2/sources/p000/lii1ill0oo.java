            package p000;

            import java.math.BigDecimal;
            
            public abstract class lii1ill0oo {
                public static BigDecimal I00000oIO(String str) {
/* 1 */             I00000oOI(str);
/* 6 */             BigDecimal bigDecimal = new BigDecimal(str);
/* 22 */            if (Math.abs(bigDecimal.scale()) < 10000) {
/* 24 */                return bigDecimal;
                    }
/* 77 */            throw new NumberFormatException("Number has unsupported scale: ".concat(str));
                }

                public static void I00000oOI(String str) {
/* 7 */             if (str.length() > 10000) {
/* 77 */                throw new NumberFormatException(IlIi0I0.I000lI("Number string too large: ", str.substring(0, 30), "..."));
                    }
                }
            }
