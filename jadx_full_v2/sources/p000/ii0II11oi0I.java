            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class ii0II11oi0I {
                public static volatile ii0II11oi0I I00000oOI;
                public static final ii0II11oi0I I0000Il00O;
                public Map I00000oIO;

                static {
/* 3 */             ii0II11oi0I ii0ii11oi0i = new ii0II11oi0I();
/* 8 */             ii0ii11oi0i.I00000oIO = Collections.EMPTY_MAP;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I0000Il00O = ii0ii11oi0i;
                }

                public final ii0Olo0OlIIi I00000oIO(int i, ii00oo ii00ooVar) {
/* 3 */             ii0II0lII0 ii0ii0lii0 = new ii0II0lII0();
/* 6 */             ii0ii0lii0.I00000oIO = ii00ooVar;
/* 8 */             ii0ii0lii0.I00000oOI = i;
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (ii0Olo0OlIIi) this.I00000oIO.get(ii0ii0lii0);
                }
            }
