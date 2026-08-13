            package p000;

            import java.util.Iterator;
            import java.util.concurrent.ScheduledFuture;
            
            public final class IIo00ilO implements Runnable {
                public final int I00iOIl;
                public IIo0IOlilI I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIo0IOlilI iIo0IOlilI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 41 */                    Iterator it = iIo0IOlilI.I000iOII.iterator();
/* 49 */                    while (it.hasNext()) {
/* 61 */                        iIo0IOlilI.I00000oIO(((IIllII) it.next()).I00000oIO());
                            }
/* 65 */                    return;
                        default:
                            synchronized (iIo0IOlilI.I0000O) {
                                try {
/* 11 */                            ScheduledFuture scheduledFuture = iIo0IOlilI.I0000oI00;
/* 13 */                            if (scheduledFuture != null) {
/* 16 */                                scheduledFuture.cancel(false);
                                    }
/* 25 */                            l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 30 */                            iIo0IOlilI.I0000O(3, iIo0IOlilI.I000iOII);
                                } catch (Throwable th) {
/* 36 */                            throw th;
                                }
                            }
/* 34 */                    return;
                    }
                }
            }
