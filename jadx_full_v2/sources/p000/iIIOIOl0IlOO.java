            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIIOIOl0IlOO implements OliiillO {
                public static final iIIOIOl0IlOO I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iIIOIOl0IlOO iiioiol0iloo = new iIIOIOl0IlOO();
/* 15 */            iiioiol0iloo.I00iOIl = lOiIlo.I00000oOI(new iIIOiiI01I0i());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iiioiol0iloo;
                }

                @Override
                public final Object get() {
/* 5 */             return (iIIOiiI01I0i) this.I00iOIl.I00iOIl;
                }
            }
