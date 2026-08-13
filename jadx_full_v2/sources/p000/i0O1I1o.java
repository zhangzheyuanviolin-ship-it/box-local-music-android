            package p000;

            import java.util.HashMap;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class i0O1I1o {
                public static final OlOilIlol1 I0001Ioi1lo = new OlOilIlol1("ExtractorSessionStoreView");
                public i0Il00O1 I00000oIO;
                public i0O0oOiO11 I00000oOI;
                public HashMap I0000Il00O;
                public ReentrantLock I0000O;
                public i0IOo0i0 I0000oI00;

                public final i0O10o1 I00000oIO(int i) {
/* 1 */             HashMap map = this.I0000Il00O;
/* 3 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            i0O10o1 i0o10o1 = (i0O10o1) map.get(numValueOf);
/* 13 */            if (i0o10o1 != null) {
/* 15 */                return i0o10o1;
                    }
/* 49 */            throw new i0O0lI1oiO(String.format("Could not find session %d while trying to get it", numValueOf), i);
                }

                public final Object I00000oOI(i0O11oO1 i0o11oo1) {
/* 1 */             ReentrantLock reentrantLock = this.I0000O;
                    try {
/* 3 */                 reentrantLock.lock();
/* 6 */                 return i0o11oo1.I0000Il00O();
                    } finally {
/* 15 */                reentrantLock.unlock();
                    }
                }
            }
