            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class li101looI0I {
                public static final li101looI0I I00000oOI;
                public Throwable I00000oIO;

                static {
/* 8 */             I010l10O i010l10O = new I010l10O("Failure occurred while trying to finish a future.", 7);
/* 11 */            li101looI0I li101looi0i = new li101looI0I();
/* 14 */            li101looi0i.I00000oIO = i010l10O;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I00000oOI = li101looi0i;
                }

                public li101looI0I(Throwable th) {
/* 4 */             th.getClass();
/* 7 */             this.I00000oIO = th;
                }
            }
