            package p000;

            import androidx.work.multiprocess.RemoteWorkManagerClient;
            
            public final class Oi00Oii00lil implements Runnable {
                public RemoteWorkManagerClient I00iOIl;

                static {
/* 3 */             IIi0oIl.I000OiO("SessionHandler");
                }

                @Override
                public final void run() {
/* 3 */             long j = this.I00iOIl.I0000oI00;
                    synchronized (this.I00iOIl.I0000O) {
                        try {
/* 12 */                    long j2 = this.I00iOIl.I0000oI00;
/* 16 */                    Oi00Oi0 oi00Oi0 = this.I00iOIl.I00000oIO;
/* 18 */                    if (oi00Oi0 != null) {
/* 22 */                        if (j == j2) {
/* 28 */                            IIi0oIl.I000II().getClass();
/* 35 */                            this.I00iOIl.I00000oOI.unbindService(oi00Oi0);
/* 42 */                            IIi0oIl.I000II().getClass();
/* 54 */                            oi00Oi0.I00iOIl.I000II(new RuntimeException("Binding died"));
/* 59 */                            oi00Oi0.I00iiI.I00000oOI();
                                } else {
/* 69 */                            IIi0oIl.I000II().getClass();
                                }
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }
            }
