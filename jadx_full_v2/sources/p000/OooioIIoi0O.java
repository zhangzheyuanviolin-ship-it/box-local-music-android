            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            
/* 18 */    public abstract class OooioIIoi0O {
                public final OooioIil I00000oIO;

                public OooioIIoi0O() {
/* 6 */             OooioIil oooioIil = new OooioIil();
/* 16 */            oooioIil.I00000oIO = new loilIl10Ii(15);
/* 23 */            oooioIil.I00000oOI = new LinkedHashMap();
/* 30 */            oooioIil.I0000Il00O = new LinkedHashSet();
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            this.I00000oIO = oooioIil;
                }

                public final void I00000oIO(String str, AutoCloseable autoCloseable) {
                    AutoCloseable autoCloseable2;
/* 1 */             OooioIil oooioIil = this.I00000oIO;
/* 3 */             if (oooioIil != null) {
/* 7 */                 if (oooioIil.I0000O) {
/* 9 */                     OooioIil.I00000oIO(autoCloseable);
/* 12 */                    return;
                        }
                        synchronized (oooioIil.I00000oIO) {
/* 22 */                    autoCloseable2 = (AutoCloseable) oooioIil.I00000oOI.put(str, autoCloseable);
                        }
/* 25 */                OooioIil.I00000oIO(autoCloseable2);
                    }
                }

                public final void I00000oOI() {
/* 1 */             OooioIil oooioIil = this.I00000oIO;
/* 3 */             if (oooioIil != null && !oooioIil.I0000O) {
/* 11 */                oooioIil.I0000O = true;
                        synchronized (oooioIil.I00000oIO) {
                            try {
/* 22 */                        Iterator it = oooioIil.I00000oOI.values().iterator();
/* 30 */                        while (it.hasNext()) {
/* 38 */                            OooioIil.I00000oIO((AutoCloseable) it.next());
                                }
/* 46 */                        Iterator it2 = oooioIil.I0000Il00O.iterator();
/* 54 */                        while (it2.hasNext()) {
/* 62 */                            OooioIil.I00000oIO((AutoCloseable) it2.next());
                                }
/* 68 */                        oooioIil.I0000Il00O.clear();
                            } catch (Throwable th) {
/* 74 */                        throw th;
                            }
                        }
                    }
/* 75 */            I0000O();
                }

                public final AutoCloseable I0000Il00O(String str) {
                    AutoCloseable autoCloseable;
/* 1 */             OooioIil oooioIil = this.I00000oIO;
/* 3 */             if (oooioIil == null) {
/* 21 */                return null;
                    }
                    synchronized (oooioIil.I00000oIO) {
/* 14 */                autoCloseable = (AutoCloseable) oooioIil.I00000oOI.get(str);
                    }
/* 17 */            return autoCloseable;
                }

/* 19 */        public void I0000O() {
                }
            }
