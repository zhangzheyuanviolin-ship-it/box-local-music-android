            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOlO11lll0l {
                public static final IOlO11lll0l I0000Il00O;
                public OIoi11oolo I00000oIO;
                public OIoi11oolo I00000oOI;

                static {
/* 3 */             Float fValueOf = Float.valueOf(1.0f);
/* 8 */             Float fValueOf2 = Float.valueOf(0.0f);
/* 14 */            OIoi11oolo oIoi11oolo = new OIoi11oolo(fValueOf2, fValueOf2);
/* 19 */            OIoi11oolo oIoi11oolo2 = new OIoi11oolo(fValueOf, fValueOf);
/* 24 */            IOlO11lll0l iOlO11lll0l = new IOlO11lll0l();
/* 27 */            iOlO11lll0l.I00000oIO = oIoi11oolo;
/* 29 */            iOlO11lll0l.I00000oOI = oIoi11oolo2;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            I0000Il00O = iOlO11lll0l;
                }
            }
