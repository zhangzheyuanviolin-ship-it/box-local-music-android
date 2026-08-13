            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIIl1IIl implements OliiillO {
                public static final iIIl1IIl I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iIIl1IIl iiil1iil = new iIIl1IIl();
/* 15 */            iiil1iil.I00iOIl = lOiIlo.I00000oOI(new iIIlIllIoll());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iiil1iil;
                }

                @Override
                public final Object get() {
/* 5 */             return (iIIlIllIoll) this.I00iOIl.I00iOIl;
                }
            }
