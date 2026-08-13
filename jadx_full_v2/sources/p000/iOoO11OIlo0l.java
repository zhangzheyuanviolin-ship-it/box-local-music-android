            package p000;

            import java.lang.ref.WeakReference;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            public final class iOoO11OIlo0l extends Thread {
                public WeakReference I00iOIl;
                public long I00iiI;
                public CountDownLatch I00iiO;
                public boolean I00iio;

                @Override
                public final void run() {
                    I0OIOO i0oioo;
/* 1 */             WeakReference weakReference = this.I00iOIl;
                    try {
/* 14 */                if (this.I00iiO.await(this.I00iiI, TimeUnit.MILLISECONDS) || (i0oioo = (I0OIOO) weakReference.get()) == null) {
/* 55 */                    return;
                        }
/* 24 */                i0oioo.I00000oOI();
/* 27 */                this.I00iio = true;
                    } catch (InterruptedException unused) {
/* 34 */                I0OIOO i0oioo2 = (I0OIOO) weakReference.get();
/* 36 */                if (i0oioo2 != null) {
/* 38 */                    i0oioo2.I00000oOI();
/* 41 */                    this.I00iio = true;
                        }
                    }
                }
            }
