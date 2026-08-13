            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class O10loilI10Oo implements Runnable {
                public final int I00iOIl;
                public AtomicBoolean I00iiI;
                public IIiOOI I00iiO;
                public IllOOo00lI I00iio;

                public O10loilI10Oo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    AtomicBoolean atomicBoolean = this.I00iiI;
/* 34 */                    IIiOOI iIiOOI = this.I00iiO;
/* 36 */                    IllOOo00lI illOOo00lI = this.I00iio;
/* 42 */                    if (!atomicBoolean.get()) {
                                try {
/* 49 */                            iIiOOI.I00000oOI(illOOo00lI.invoke());
                                    break;
                                } catch (Throwable th) {
/* 54 */                            iIiOOI.I0000O(th);
/* 57 */                            return;
                                }
                            }
                            break;
                        default:
/* 6 */                     AtomicBoolean atomicBoolean2 = this.I00iiI;
/* 8 */                     IIiOOI iIiOOI2 = this.I00iiO;
/* 10 */                    IllOOo00lI illOOo00lI2 = this.I00iio;
/* 16 */                    if (!atomicBoolean2.get()) {
                                try {
/* 23 */                            iIiOOI2.I00000oOI(illOOo00lI2.invoke());
                                    break;
                                } catch (Throwable th2) {
/* 28 */                            iIiOOI2.I0000O(th2);
                                }
                            }
                            break;
                    }
                }
            }
