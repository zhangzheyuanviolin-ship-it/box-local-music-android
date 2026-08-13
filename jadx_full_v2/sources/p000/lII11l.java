            package p000;
            
            public abstract class lII11l {
                public static void I00000oIO(Class cls, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 37 */            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
                }

                public static void I00000oOI(Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 6 */             IOOlIIilOl0.I000II("Cannot return null from a non-@Nullable @Provides method");
                }
            }
