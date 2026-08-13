            package p000;

            import android.graphics.Bitmap;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.Size;
            import android.view.PixelCopy;
            import android.view.SurfaceView;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Semaphore;
            import java.util.concurrent.TimeUnit;
            
/* 18 */    public final class Oll0OO0O extends OOIO1OOiI0 {
                public SurfaceView I0000oI00;
                public Oll0IoIOoi1 I0001Ioi1lo;

                @Override
                public final View I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Bitmap I00000oOI() {
/* 3 */             SurfaceView surfaceView = this.I0000oI00;
/* 5 */             if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.I0000oI00.getHolder().getSurface().isValid()) {
/* 130 */               return null;
                    }
/* 37 */            Semaphore semaphore = new Semaphore(0);
/* 54 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.I0000oI00.getWidth(), this.I0000oI00.getHeight(), Bitmap.Config.ARGB_8888);
/* 62 */            HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
/* 65 */            handlerThread.start();
/* 74 */            Handler handler = new Handler(handlerThread.getLooper());
/* 77 */            SurfaceView surfaceView2 = this.I0000oI00;
/* 81 */            Oll0IllO oll0IllO = new Oll0IllO();
/* 84 */            oll0IllO.I00000oIO = semaphore;
/* 86 */            VarHandle.storeStoreFence();
/* 89 */            PixelCopy.request(surfaceView2, bitmapCreateBitmap, oll0IllO, handler);
                    try {
/* 101 */               if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
/* 105 */                   l11I11lO.I00000oIO("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                        }
/* 116 */               return bitmapCreateBitmap;
                    } catch (InterruptedException e) {
/* 119 */               l11I11lO.I00000oOI("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
/* 125 */               return bitmapCreateBitmap;
                    } finally {
/* 126 */               handlerThread.quitSafely();
                    }
                }

                @Override
                public final void I0000oI00(Oll0I0l1i1 oll0I0l1i1, IiI0oIlol0 iiI0oIlol0) {
/* 1 */             SurfaceView surfaceView = this.I0000oI00;
/* 7 */             boolean zEquals = Objects.equals(this.I00000oIO, oll0I0l1i1.I00000oOI);
/* 11 */            if (surfaceView == null || !zEquals) {
/* 16 */                Size size = oll0I0l1i1.I00000oOI;
/* 18 */                this.I00000oIO = size;
/* 20 */                size.getClass();
/* 25 */                FrameLayout frameLayout = this.I00000oOI;
/* 31 */                SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
/* 34 */                this.I0000oI00 = surfaceView2;
/* 53 */                surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.I00000oIO.getWidth(), this.I00000oIO.getHeight()));
/* 56 */                frameLayout.removeAllViews();
/* 61 */                frameLayout.addView(this.I0000oI00);
/* 72 */                this.I0000oI00.getHolder().addCallback(this.I0001Ioi1lo);
                    }
/* 81 */            Executor mainExecutor = this.I0000oI00.getContext().getMainExecutor();
/* 89 */            OOIl1i1 oOIl1i1 = new OOIl1i1(12);
/* 92 */            oOIl1i1.I00iiI = iiI0oIlol0;
/* 94 */            VarHandle.storeStoreFence();
/* 99 */            oll0I0l1i1.I000OiO.I00000oIO(oOIl1i1, mainExecutor);
/* 102 */           SurfaceView surfaceView3 = this.I0000oI00;
/* 108 */           I00ioIO i00ioIO = new I00ioIO(15);
/* 111 */           i00ioIO.I00iiI = this;
/* 113 */           i00ioIO.I00iiO = oll0I0l1i1;
/* 115 */           i00ioIO.I00iio = iiI0oIlol0;
/* 117 */           VarHandle.storeStoreFence();
/* 120 */           surfaceView3.post(i00ioIO);
                }

                @Override
                public final ListenableFuture I000II() {
/* 1 */             return Ioil1IIo.I00iiO;
                }

                @Override
/* 19 */        public final void I0000Il00O() {
                }

                @Override
/* 19 */        public final void I0000O() {
                }
            }
