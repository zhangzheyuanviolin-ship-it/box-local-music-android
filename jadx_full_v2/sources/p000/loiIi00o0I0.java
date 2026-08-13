            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class loiIi00o0I0 extends llOl001olOi {
                public static final loiI111o I00000oIO;

                static {
/* 3 */             loiIi00o0I0 loiii00o0i0 = new loiIi00o0I0();
/* 6 */             VarHandle.storeStoreFence();
/* 12 */            loiI111o loii111o = new loiI111o(0);
/* 15 */            loii111o.I00iiI = loiii00o0i0;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00000oIO = loii111o;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
/* 1 */             int iI00ooIo0 = o0iloioo.I00ooIo0();
                    int i = iI00ooIo0 - 1;
/* 8 */             if (i == 5 || i == 6) {
/* 69 */                return new llooo1oooI(o0iloioo.I00ioIO());
                    }
/* 15 */            if (i == 8) {
/* 17 */                o0iloioo.I00lli11();
/* 20 */                return null;
                    }
/* 22 */            String strI00000oIO = ll1OIi.I00000oIO(iI00ooIo0);
/* 29 */            String strI00100l0 = o0iloioo.I00100l0(false);
/* 62 */            throw new llO11IolIO(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI00000oIO.length() + 33 + strI00100l0.length()), "Expecting number, got: ", strI00000oIO, "; at path ", strI00100l0), 25);
                }
            }
