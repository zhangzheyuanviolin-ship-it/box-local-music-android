            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class IIIO1Io implements I111oOiIiO0 {
                public final O0i1lI0o1io I00000oIO;
                public final Ill0IO I00000oOI;
                public final Map I0000Il00O;
                public final O0ioIllo0i1 I0000O;

                public IIIO1Io(O0i1lI0o1io o0i1lI0o1io, Ill0IO ill0IO, Map map) {
/* 4 */             this.I00000oIO = o0i1lI0o1io;
/* 6 */             this.I00000oOI = ill0IO;
/* 8 */             this.I0000Il00O = map;
/* 10 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 15 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(5);
/* 18 */            i01iiIii10O.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 27 */            this.I0000O = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01iiIii10O);
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return OlI1o0ooI.I00IO1;
                }

                @Override
                public final Ill0IO I0010o() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Map I00111O() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final O0iIl1 getType() {
/* 7 */             return (O0iIl1) this.I0000O.getValue();
                }
            }
