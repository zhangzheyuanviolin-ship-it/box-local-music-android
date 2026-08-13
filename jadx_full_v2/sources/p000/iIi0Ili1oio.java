            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIi0Ili1oio implements OliiillO {
                public static final iIi0Ili1oio I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iIi0Ili1oio iii0ili1oio = new iIi0Ili1oio();
/* 15 */            iii0ili1oio.I00iOIl = lOiIlo.I00000oOI(new iIi0lllIlIi());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iii0ili1oio;
                }

                @Override
                public final Object get() {
/* 5 */             return (iIi0lllIlIi) this.I00iOIl.I00iOIl;
                }
            }
