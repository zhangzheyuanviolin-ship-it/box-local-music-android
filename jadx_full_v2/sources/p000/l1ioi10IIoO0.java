            package p000;

            import java.math.BigDecimal;
            
            public abstract class l1ioi10IIoO0 {
                public static void I00000oIO(String str) {
/* 7 */             if (str.length() <= 10000) {
/* 9 */                 return;
                    }
/* 77 */            throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
                }

                public static BigDecimal I00000oOI(String str) {
/* 1 */             I00000oIO(str);
/* 6 */             BigDecimal bigDecimal = new BigDecimal(str);
/* 22 */            if (Math.abs(bigDecimal.scale()) < 10000) {
/* 24 */                return bigDecimal;
                    }
/* 77 */            throw new NumberFormatException("Number has unsupported scale: ".concat(str));
                }
            }
