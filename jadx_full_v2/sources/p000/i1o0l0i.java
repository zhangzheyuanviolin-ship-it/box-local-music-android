            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class i1o0l0i {
                public static volatile i1o0l0i I00000oIO;
                public static final i1o0l0i I00000oOI;

                static {
/* 3 */             i1o0l0i i1o0l0iVar = new i1o0l0i();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I00000oOI = i1o0l0iVar;
                }

                public static i1o0l0i I00000oIO() {
/* 1 */             i1o0l0i i1o0l0iVar = I00000oIO;
/* 3 */             if (i1o0l0iVar != null) {
/* 5 */                 return i1o0l0iVar;
                    }
                    synchronized (i1o0l0i.class) {
                        try {
/* 9 */                     i1o0l0i i1o0l0iVar2 = I00000oIO;
/* 11 */                    if (i1o0l0iVar2 != null) {
/* 14 */                        return i1o0l0iVar2;
                            }
/* 17 */                    int i = i1ioiooIiOol.I00000oIO;
/* 19 */                    i1o0l0i i1o0l0iVarI00000oIO = i1oIli1o0ilo.I00000oIO();
/* 23 */                    I00000oIO = i1o0l0iVarI00000oIO;
/* 26 */                    return i1o0l0iVarI00000oIO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }
