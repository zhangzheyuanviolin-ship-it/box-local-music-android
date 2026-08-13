            package p000;

            import android.os.Looper;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class I1OoI1 implements Runnable {
                public static final ThreadPoolExecutor I00ioIO;
                public static O1oo1il01OoO I00l0I0l0lO1;
                public Io11llo0i I00iOIl;
                public O1oo1I0il I00iiI;
                public volatile int I00iiO;
                public AtomicBoolean I00iio;
                public AtomicBoolean I00ilI0I1;
                public CountDownLatch I00ilO0;
                public lO0Ol0 I00io1l;

                static {
/* 4 */             IIlOo10 iIlOo10 = new IIlOo10(3);
/* 13 */            iIlOo10.I00000oOI = new AtomicInteger(1);
/* 15 */            VarHandle.storeStoreFence();
/* 37 */            I00ioIO = new ThreadPoolExecutor(5, Barcode.FORMAT_ITF, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), iIlOo10);
                }

                public final void I00000oIO(Object obj) {
                    O1oo1il01OoO o1oo1il01OoO;
                    synchronized (I1OoI1.class) {
                        try {
/* 4 */                     o1oo1il01OoO = I00l0I0l0lO1;
/* 6 */                     if (o1oo1il01OoO == null) {
/* 15 */                        o1oo1il01OoO = new O1oo1il01OoO(Looper.getMainLooper(), 0, false);
/* 18 */                        I00l0I0l0lO1 = o1oo1il01OoO;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 30 */            O1oo1i01I o1oo1i01I = new O1oo1i01I();
/* 33 */            o1oo1i01I.I00000oIO = this;
/* 35 */            o1oo1i01I.I00000oOI = new Object[]{obj};
/* 37 */            VarHandle.storeStoreFence();
/* 45 */            o1oo1il01OoO.obtainMessage(1, o1oo1i01I).sendToTarget();
                }

                @Override
                public final void run() {
/* 3 */             this.I00io1l.I00000oOI();
                }
            }
