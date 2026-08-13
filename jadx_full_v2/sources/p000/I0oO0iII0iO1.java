            package p000;

            import android.media.ImageReader;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class I0oO0iII0iO1 implements ImageReader.OnImageAvailableListener {
                public I0oO0iO1l0lo I00iOIl;
                public Executor I00iiI;
                public IoiO1iOOil11 I00iiO;

                @Override
                public final void onImageAvailable(ImageReader imageReader) {
/* 1 */             I0oO0iO1l0lo i0oO0iO1l0lo = this.I00iOIl;
/* 3 */             Executor executor = this.I00iiI;
/* 5 */             IoiO1iOOil11 ioiO1iOOil11 = this.I00iiO;
                    synchronized (i0oO0iO1l0lo.I00iio) {
                        try {
/* 12 */                    if (!i0oO0iO1l0lo.I00iiI) {
/* 17 */                        I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(3);
/* 20 */                        i0iOo0oioiO.I00iiI = i0oO0iO1l0lo;
/* 22 */                        i0iOo0oioiO.I00iiO = ioiO1iOOil11;
/* 24 */                        VarHandle.storeStoreFence();
/* 27 */                        executor.execute(i0iOo0oioiO);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
