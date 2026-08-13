            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class Il1llOool {
                public static volatile Il1llOool I00000oIO;
                public static final Il1llOool I00000oOI;

                static {
/* 3 */             Il1llOool il1llOool = new Il1llOool();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I00000oOI = il1llOool;
                }

                public static Il1llOool I00000oIO() {
                    Il1llOool il1llOool;
/* 1 */             Class cls = I0lI0Ooo.I00000oIO;
/* 3 */             Il1llOool il1llOool2 = I00000oIO;
/* 5 */             if (il1llOool2 != null) {
/* 113 */               return il1llOool2;
                    }
                    synchronized (Il1llOool.class) {
                        try {
/* 10 */                    il1llOool = I00000oIO;
/* 12 */                    if (il1llOool == null) {
/* 16 */                        Class cls2 = Il1li10lOi.I00000oIO;
/* 18 */                        Il1llOool il1llOool3 = null;
/* 19 */                        if (cls2 != null) {
                                    try {
/* 30 */                                il1llOool3 = (Il1llOool) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                                    } catch (Exception unused) {
                                    }
                                }
/* 37 */                        il1llOool = il1llOool3 != null ? il1llOool3 : I00000oOI;
/* 39 */                        I00000oIO = il1llOool;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return il1llOool;
                }
            }
