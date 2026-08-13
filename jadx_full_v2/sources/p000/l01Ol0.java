            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l01Ol0 {
                public static final l01Ol0 I00000oOI;
                public Throwable I00000oIO;

                static {
/* 8 */             I010l10O i010l10O = new I010l10O("Failure occurred while trying to finish a future.", 6);
/* 11 */            l01Ol0 l01ol0 = new l01Ol0();
/* 14 */            l01ol0.I00000oIO = i010l10O;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oOI = l01ol0;
                }
            }
