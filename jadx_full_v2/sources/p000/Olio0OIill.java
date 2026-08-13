            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class Olio0OIill implements Runnable {
                public final int I00iOIl;
                public OlioOil I00iiI;

                public Olio0OIill(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OlioOil olioOil = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 23 */                    Olio0OIill olio0OIill = new Olio0OIill(1);
/* 26 */                    olio0OIill.I00iiI = olioOil;
/* 28 */                    VarHandle.storeStoreFence();
/* 33 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(olio0OIill);
                            break;
                        default:
/* 10 */                    if (!olioOil.I000o00OoI0I) {
/* 12 */                        olioOil.I0000oI00();
                                break;
                            }
                            break;
                    }
                }
            }
