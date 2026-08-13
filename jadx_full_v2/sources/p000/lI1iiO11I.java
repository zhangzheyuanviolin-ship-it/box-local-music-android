            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lI1iiO11I {
                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, I0olOlooIO0o i0olOlooIO0o) {
/* 3 */             OO1iIOi10OIo oO1iIOi10OIo = new OO1iIOi10OIo();
/* 6 */             oO1iIOi10OIo.I00000oIO = i0olOlooIO0o;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(oO1iIOi10OIo);
                }
            }
