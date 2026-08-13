            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class lI0011loIOIo {
                public static final lI0011loIOIo I00000oOI;
                public Map I00000oIO;

                static {
/* 3 */             lI0011loIOIo li0011loioio = new lI0011loIOIo();
/* 8 */             li0011loioio.I00000oIO = Collections.EMPTY_MAP;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I00000oOI = li0011loioio;
                }

                public final void I00000oIO(lIoolOoilO lioolooilo, int i) {
/* 3 */             l1ooIOO00l l1ooioo00l = new l1ooIOO00l();
/* 6 */             l1ooioo00l.I00000oIO = lioolooilo;
/* 8 */             l1ooioo00l.I00000oOI = i;
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            if (this.I00000oIO.get(l1ooioo00l) == null) {
/* 21 */                return;
                    }
/* 22 */            OIiilo1Ool0o.I00000oIO();
                }
            }
