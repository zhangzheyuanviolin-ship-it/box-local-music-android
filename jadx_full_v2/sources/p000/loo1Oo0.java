            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class loo1Oo0 {
                public static final loo1Oo0 I00000oOI;
                public Map I00000oIO;

                static {
/* 3 */             loo1Oo0 loo1oo0 = new loo1Oo0();
/* 8 */             loo1oo0.I00000oIO = Collections.EMPTY_MAP;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I00000oOI = loo1oo0;
                }
            }
