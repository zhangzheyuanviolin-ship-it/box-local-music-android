            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.os.SystemClock;
            import java.util.concurrent.CountDownLatch;
            
/* 25 */    public class O1oo1il01OoO extends Handler {
                public final int I00000oIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1oo1il01OoO(Looper looper, int i) {
/* 6 */             super(looper);
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 5:
/* 20 */                    super(looper);
/* 23 */                    Looper.getMainLooper();
                            break;
                        case 6:
/* 13 */                    super(looper);
/* 16 */                    Looper.getMainLooper();
                            break;
                        default:
/* 9 */                     Looper.getMainLooper();
                            break;
                    }
                }

                @Override
                public void handleMessage(Message message) {
                    switch (this.I00000oIO) {
                        case 0:
/* 12 */                    O1oo1i01I o1oo1i01I = (O1oo1i01I) message.obj;
/* 14 */                    int i = message.what;
/* 17 */                    if (i != 1) {
/* 20 */                        if (i != 2) {
/* 76 */                            return;
                                }
/* 23 */                        I1OoI1 i1OoI1 = o1oo1i01I.I00000oIO;
/* 76 */                        return;
                            }
/* 26 */                    I1OoI1 i1OoI12 = o1oo1i01I.I00000oIO;
/* 31 */                    Object obj = o1oo1i01I.I00000oOI[0];
/* 35 */                    boolean z = i1OoI12.I00iio.get();
/* 39 */                    CountDownLatch countDownLatch = i1OoI12.I00ilO0;
/* 41 */                    lO0Ol0 lo0ol0 = i1OoI12.I00io1l;
/* 43 */                    if (z) {
                                try {
/* 47 */                            if (lo0ol0.I000OiO == i1OoI12) {
/* 49 */                                SystemClock.uptimeMillis();
/* 53 */                                lo0ol0.I000OiO = null;
/* 55 */                                lo0ol0.I00000oOI();
                                    }
/* 58 */                            countDownLatch.countDown();
                                } finally {
                                }
                            } else {
                                try {
/* 67 */                            lo0ol0.I00000oIO(i1OoI12, obj);
                                } finally {
                                }
                            }
/* 74 */                    i1OoI12.I00iiO = 3;
/* 76 */                    return;
                        default:
/* 6 */                     super.handleMessage(message);
/* 9 */                     return;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 26 */        public O1oo1il01OoO(Looper looper, Handler.Callback callback, int i) {
                    super(looper, callback);
/* 27 */            this.I00000oIO = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 27 */        public O1oo1il01OoO(Looper looper, int i, boolean z) {
                    super(looper);
/* 28 */            this.I00000oIO = i;
                }
            }
