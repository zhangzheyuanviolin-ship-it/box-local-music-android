            package p000;
            
            public abstract class lOiOi1 {
                public static final long I00000oIO(long j, String str, long j2, long j3) {
                    String property;
/* 1 */             int i = Olli0OOiloi.I00000oIO;
                    try {
/* 3 */                 property = System.getProperty(str);
                    } catch (SecurityException unused) {
/* 8 */                 property = null;
                    }
/* 9 */             if (property == null) {
/* 11 */                return j;
                    }
/* 12 */            Long lI000o00OoI0I = OlOolloIIOl0.I000o00OoI0I(property);
/* 20 */            if (lI000o00OoI0I == null) {
/* 483 */               throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
                    }
/* 22 */            long jLongValue = lI000o00OoI0I.longValue();
/* 28 */            if (j2 <= jLongValue && jLongValue <= j3) {
/* 34 */                return jLongValue;
                    }
/* 83 */            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
                }

                public static int I00000oOI(int i, int i2, String str) {
/* 21 */            return (int) I00000oIO(i, str, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
                }
            }
