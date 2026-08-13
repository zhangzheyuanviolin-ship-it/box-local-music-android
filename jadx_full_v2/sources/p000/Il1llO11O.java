            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class Il1llO11O {
                public static volatile Il1llO11O I00000oIO;
                public static final Il1llO11O I00000oOI;

                static {
/* 3 */             Il1llO11O il1llO11O = new Il1llO11O();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I00000oOI = il1llO11O;
                }

                public static Il1llO11O I00000oIO() {
                    Il1llO11O il1llO11O;
/* 1 */             Il1llO11O il1llO11O2 = I00000oIO;
/* 3 */             if (il1llO11O2 != null) {
/* 113 */               return il1llO11O2;
                    }
                    synchronized (Il1llO11O.class) {
                        try {
/* 8 */                     il1llO11O = I00000oIO;
/* 10 */                    if (il1llO11O == null) {
/* 14 */                        Class cls = Il1lO1I011.I00000oIO;
/* 16 */                        Il1llO11O il1llO11O3 = null;
/* 17 */                        if (cls != null) {
                                    try {
/* 28 */                                il1llO11O3 = (Il1llO11O) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                                    } catch (Exception unused) {
                                    }
                                }
/* 35 */                        il1llO11O = il1llO11O3 != null ? il1llO11O3 : I00000oOI;
/* 37 */                        I00000oIO = il1llO11O;
                            }
                        } catch (Throwable th) {
/* 45 */                    throw th;
                        }
                    }
/* 43 */            return il1llO11O;
                }
            }
