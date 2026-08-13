            package p000;

            import android.view.PixelCopy;
            import java.util.concurrent.Semaphore;
            
            public final class Oll0IllO implements PixelCopy.OnPixelCopyFinishedListener {
                public Semaphore I00000oIO;

                @Override
                public final void onPixelCopyFinished(int i) {
/* 1 */             Semaphore semaphore = this.I00000oIO;
/* 5 */             if (i == 0) {
/* 8 */                 l11I11lO.I0000O(3, "SurfaceViewImpl");
                    } else {
/* 26 */                l11I11lO.I00000oIO("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                    }
/* 29 */            semaphore.release();
                }
            }
