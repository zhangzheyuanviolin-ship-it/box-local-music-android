            package p000;

            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IIo000I0ilI {
                public O010OIi I00000oIO;
                public Object I00000oOI;
                public ArrayList I0000Il00O;
                public Object I0000O;
                public ArrayList I0000oI00;
                public Object I0001Ioi1lo;
                public ArrayList I000II;

                public final void I00000oIO(IIlooO0iI iIlooO0iI, Runnable runnable) {
                    boolean zAdd;
/* 1 */             int iOrdinal = iIlooO0iI.ordinal();
/* 5 */             if (iOrdinal == 0) {
                        synchronized (this.I00000oOI) {
/* 50 */                    zAdd = this.I0000Il00O.add(runnable);
                        }
                    } else if (iOrdinal == 1) {
                        synchronized (this.I0000O) {
/* 36 */                    zAdd = this.I0000oI00.add(runnable);
                        }
                    } else if (iOrdinal != 2) {
/* 27 */                I000II.I00000oIO();
/* 30 */                return;
                    } else {
                        synchronized (this.I0001Ioi1lo) {
/* 18 */                    zAdd = this.I000II.add(runnable);
                        }
                    }
/* 55 */            if (zAdd) {
/* 84 */                return;
                    }
/* 78 */            Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + iIlooO0iI + " shutdown action immediately...");
/* 81 */            runnable.run();
                }

                public final void I00000oOI() {
                    synchronized (this.I00000oOI) {
/* 6 */                 Iterator it = this.I0000Il00O.iterator();
/* 14 */                while (it.hasNext()) {
/* 22 */                    ((Runnable) it.next()).run();
                        }
                    }
                    synchronized (this.I0000O) {
                        try {
/* 34 */                    Iterator it2 = this.I0000oI00.iterator();
/* 42 */                    while (it2.hasNext()) {
/* 50 */                        ((Runnable) it2.next()).run();
                            }
                        } catch (Throwable th) {
/* 104 */                   throw th;
                        }
                    }
                    synchronized (this.I0001Ioi1lo) {
/* 77 */                Iterator it3 = this.I000II.iterator();
/* 85 */                while (it3.hasNext()) {
/* 93 */                    ((Runnable) it3.next()).run();
                        }
                    }
                }
            }
