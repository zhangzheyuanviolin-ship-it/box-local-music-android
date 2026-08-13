            package p000;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class O0o11IlioI implements OOiO0Il {
                public volatile Set I00000oIO;
                public volatile Set I00000oOI;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
                
                    throw r0;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get() {
/* 3 */             if (this.I00000oOI == null) {
                        synchronized (this) {
                            try {
/* 8 */                         if (this.I00000oOI == null) {
/* 19 */                            this.I00000oOI = Collections.newSetFromMap(new ConcurrentHashMap());
                                    synchronized (this) {
/* 24 */                                Iterator it = this.I00000oIO.iterator();
/* 32 */                                while (it.hasNext()) {
/* 46 */                                    this.I00000oOI.add(((OOiO0Il) it.next()).get());
                                        }
/* 53 */                                this.I00000oIO = null;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
/* 67 */            return Collections.unmodifiableSet(this.I00000oOI);
                }
            }
