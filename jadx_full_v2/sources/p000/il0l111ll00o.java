            package p000;

            import java.util.List;
            
            public abstract class il0l111ll00o {
                public static void I00000oIO(List list) throws IiIO1IliI1Ol {
/* 5 */             if (list.isEmpty()) {
/* 77 */                return;
                    }
/* 7 */             int i = 0;
/* 23 */            do {
                        try {
/* 14 */                    ((IiIO1ol1i1o0) list.get(i)).I0000O();
/* 17 */                    i++;
                        } catch (IiIO1IliI1Ol e) {
/* 29 */                    for (int i2 = i - 1; i2 >= 0; i2--) {
/* 37 */                        ((IiIO1ol1i1o0) list.get(i2)).I00000oOI();
                            }
/* 43 */                    throw e;
                        }
/* 23 */            } while (i < list.size());
                }
            }
