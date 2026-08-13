            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class Il1llli0O1 {
                public static volatile Il1llli0O1 I00000oIO;
                public static final Il1llli0O1 I00000oOI;

                static {
/* 3 */             Il1llli0O1 il1llli0O1 = new Il1llli0O1();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I00000oOI = il1llli0O1;
                }

                public static Il1llli0O1 I00000oIO() {
                    Il1llli0O1 il1llli0O1;
/* 1 */             OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 3 */             Il1llli0O1 il1llli0O12 = I00000oIO;
/* 5 */             if (il1llli0O12 != null) {
/* 55 */                return il1llli0O12;
                    }
                    synchronized (Il1llli0O1.class) {
                        try {
/* 10 */                    il1llli0O1 = I00000oIO;
/* 12 */                    if (il1llli0O1 == null) {
/* 16 */                        Class cls = Il1liiOOo1l.I00000oIO;
/* 18 */                        Il1llli0O1 il1llli0O13 = null;
/* 19 */                        if (cls != null) {
                                    try {
/* 30 */                                il1llli0O13 = (Il1llli0O1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                                    } catch (Exception unused) {
                                    }
                                }
/* 37 */                        il1llli0O1 = il1llli0O13 != null ? il1llli0O13 : I00000oOI;
/* 39 */                        I00000oIO = il1llli0O1;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return il1llli0O1;
                }
            }
