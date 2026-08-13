            package p000;

            import java.util.Locale;
            
            public abstract class lII1OI11o1I {
                public static void I00000oIO(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I000iOII(str);
                }

                public static void I00000oOI(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             OIiilo1Ool0o.I00100o1O0lo();
                }

                public static void I0000Il00O(int i, int i2, int i3, String str) {
/* 5 */             if (i < i2) {
/* 46 */                Locale locale = Locale.US;
/* 204 */               throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
                    }
/* 7 */             if (i <= i3) {
/* 9 */                 return;
                    }
/* 12 */            Locale locale2 = Locale.US;
/* 43 */            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
                }

                public static void I0000O(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static void I0000oI00(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I001IO000(str);
                }
            }
