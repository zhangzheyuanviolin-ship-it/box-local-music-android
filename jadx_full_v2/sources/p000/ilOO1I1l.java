            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class ilOO1I1l {
                public static final ilOO1I1l I00000oOI;
                public Map I00000oIO;

                static {
/* 3 */             ilOO1I1l iloo1i1l = new ilOO1I1l();
/* 8 */             iloo1i1l.I00000oIO = Collections.EMPTY_MAP;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I00000oOI = iloo1i1l;
                }

                public final illI0ll I00000oIO(il00ioIl il00ioil, int i) {
/* 3 */             ilOIIl iloiil = new ilOIIl();
/* 6 */             iloiil.I00000oIO = il00ioil;
/* 8 */             iloiil.I00000oOI = i;
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (illI0ll) this.I00000oIO.get(iloiil);
                }
            }
