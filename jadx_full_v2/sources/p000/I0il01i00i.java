            package p000;

            import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
            import java.lang.invoke.VarHandle;
            
/* 18 */    public final class I0il01i00i implements Runnable {
                public final int I00iOIl;

                public I0il01i00i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 44 */                    int i = AlarmManagerSchedulerBroadcastReceiver.I00000oIO;
/* 46 */                    return;
                        case 1:
/* 7 */                     OI0oiiIO0 oI0oiiIO0 = I0lio1O01i01.I01OIo;
                            synchronized (oI0oiiIO0) {
/* 10 */                        Object[] objArr = oI0oiiIO0.I00000oIO;
/* 12 */                        int i2 = oI0oiiIO0.I00000oOI;
/* 15 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 19 */                            I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) objArr[i3];
/* 24 */                            I0li0Io i0li0Io = new I0li0Io(2);
/* 27 */                            i0li0Io.I00iiI = i0lio1O01i01;
/* 29 */                            VarHandle.storeStoreFence();
/* 32 */                            i0lio1O01i01.post(i0li0Io);
                                }
                            }
/* 41 */                    return;
                        default:
/* 6 */                     return;
                    }
                }

/* 19 */        private final void I00000oIO() {
                }
            }
