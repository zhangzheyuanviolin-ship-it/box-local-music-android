            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO1o1O {
                public static final Iii10I11ll0 I00000oIO(int i) {
/* 3 */             Iii10I11ll0 iii10I11ll0 = new Iii10I11ll0();
/* 6 */             iii10I11ll0.I00000oIO = i;
/* 8 */             if (i > 0) {
/* 10 */                VarHandle.storeStoreFence();
/* 13 */                return iii10I11ll0;
                    }
/* 16 */            I000II.I000iOII("px must be > 0.");
/* 19 */            return null;
                }
            }
