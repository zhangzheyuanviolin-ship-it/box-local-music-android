            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class iOlO11i {
                public static volatile iOlO11i I00000oIO;
                public static final iOlO11i I00000oOI;

                static {
/* 3 */             iOlO11i iolo11i = new iOlO11i();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I00000oOI = iolo11i;
                }

                public static iOlO11i I00000oIO() {
/* 1 */             iOlO11i iolo11i = I00000oIO;
/* 3 */             if (iolo11i != null) {
/* 5 */                 return iolo11i;
                    }
                    synchronized (iOlO11i.class) {
                        try {
/* 9 */                     iOlO11i iolo11i2 = I00000oIO;
/* 11 */                    if (iolo11i2 != null) {
/* 14 */                        return iolo11i2;
                            }
/* 17 */                    int i = iOl10iIiIiOi.I00000oIO;
/* 19 */                    iOlO11i iolo11iI00000oIO = iOlOI11ii1ii.I00000oIO();
/* 23 */                    I00000oIO = iolo11iI00000oIO;
/* 26 */                    return iolo11iI00000oIO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }
