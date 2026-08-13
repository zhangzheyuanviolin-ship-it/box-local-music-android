            package p000;

            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            
            public final class Il10OII implements OliIolIIi, OOiiOioO0 {
                public HashMap I00000oIO;
                public ArrayDeque I00000oOI;
                public Executor I0000Il00O;

                public final synchronized void I00000oIO(Executor executor, Il10iOl il10iOl) {
                    try {
/* 4 */                 executor.getClass();
/* 13 */                if (!this.I00000oIO.containsKey(Ii11O1o111i.class)) {
/* 22 */                    this.I00000oIO.put(Ii11O1o111i.class, new ConcurrentHashMap());
                        }
/* 36 */                ((ConcurrentHashMap) this.I00000oIO.get(Ii11O1o111i.class)).put(il10iOl, executor);
                    } catch (Throwable th) {
/* 106 */               throw th;
                    }
                }
            }
