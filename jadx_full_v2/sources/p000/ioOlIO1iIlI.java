            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class ioOlIO1iIlI {
                public static final ioOlIO1iIlI I00000oOI;
                public Throwable I00000oIO;

                static {
/* 8 */             I010l10O i010l10O = new I010l10O("Failure occurred while trying to finish a future.", 5);
/* 11 */            ioOlIO1iIlI ioolio1iili = new ioOlIO1iIlI();
/* 14 */            ioolio1iili.I00000oIO = i010l10O;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oOI = ioolio1iili;
                }
            }
