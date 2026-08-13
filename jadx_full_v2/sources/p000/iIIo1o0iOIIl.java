            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIIo1o0iOIIl implements OliiillO {
                public static final iIIo1o0iOIIl I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iIIo1o0iOIIl iiio1o0ioiil = new iIIo1o0iOIIl();
/* 15 */            iiio1o0ioiil.I00iOIl = lOiIlo.I00000oOI(new iIO01olOlol());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iiio1o0ioiil;
                }

                @Override
                public final Object get() {
/* 5 */             return (iIO01olOlol) this.I00iOIl.I00iOIl;
                }
            }
