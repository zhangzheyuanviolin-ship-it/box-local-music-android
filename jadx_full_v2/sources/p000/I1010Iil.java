            package p000;

            import android.os.Process;
            import java.util.function.IntConsumer;
            
            public final class I1010Iil implements Runnable {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public I1010Iil(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws SecurityException, IllegalArgumentException {
                    switch (this.I00iOIl) {
                        case 0:
/* 56 */                    int i = this.I00iiI;
/* 60 */                    Runnable runnable = (Runnable) this.I00iiO;
/* 62 */                    Process.setThreadPriority(i);
/* 65 */                    runnable.run();
                            break;
                        case 1:
/* 52 */                    ((IntConsumer) this.I00iiO).accept(this.I00iiI);
                            break;
                        case 2:
/* 42 */                    ((IIl1Ol) this.I00iiO).I00000oIO(this.I00iiI);
                            break;
                        case 3:
/* 18 */                    IIl1i10oO iIl1i10oO = (IIl1i10oO) this.I00iiO;
/* 20 */                    int i2 = this.I00iiI;
/* 28 */                    OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) ((I0Oi111ii) iIl1i10oO.I00000oOI).I00iiI;
/* 30 */                    if (oOIo1Iiiil != null) {
/* 32 */                        oOIo1Iiiil.I00000oIO(i2);
                                break;
                            }
                            break;
                        default:
/* 12 */                    ((I1I1OO00o1o) this.I00iiO).I001IO000(this.I00iiI);
                            break;
                    }
                }
            }
