            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class i11IO0ii {
                public static volatile i11IO0ii I00000oOI;
                public static final i11IO0ii I0000Il00O;
                public Map I00000oIO;

                static {
/* 3 */             i11IO0ii i11io0ii = new i11IO0ii();
/* 8 */             i11io0ii.I00000oIO = Collections.EMPTY_MAP;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            I0000Il00O = i11io0ii;
                }

                public final i11O1OiiO1 I00000oIO(i1111ll i1111llVar, int i) {
/* 3 */             i11IIlolll i11iilolll = new i11IIlolll();
/* 6 */             i11iilolll.I00000oIO = i1111llVar;
/* 8 */             i11iilolll.I00000oOI = i;
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (i11O1OiiO1) this.I00000oIO.get(i11iilolll);
                }
            }
