            package p000;
            
            public abstract class ilIiIlIII0 {
                public static final boolean I00000oIO(Throwable th) {
/* 1 */             Class<?> superclass = th.getClass();
/* 15 */            while (!O0000Ioio00.I0000O(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
/* 19 */                superclass = superclass.getSuperclass();
/* 23 */                if (superclass == null) {
/* 25 */                    return false;
                        }
                    }
/* 17 */            return true;
                }
            }
