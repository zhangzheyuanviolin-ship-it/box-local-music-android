            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I010l1ol111 {
                public static final I010l1ol111 I00000oOI;
                public Throwable I00000oIO;

                static {
/* 8 */             I010l10O i010l10O = new I010l10O("Failure occurred while trying to finish a future.", 0);
/* 11 */            I010l1ol111 i010l1ol111 = new I010l1ol111();
/* 14 */            i010l1ol111.I00000oIO = i010l10O;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oOI = i010l1ol111;
                }
            }
