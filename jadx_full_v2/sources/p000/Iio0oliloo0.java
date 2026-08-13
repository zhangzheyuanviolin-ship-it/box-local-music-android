            package p000;

            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            
            public final class Iio0oliloo0 implements IOo1llI {
                public Iio1000IOoi1 I00000oIO;
                public SurfaceTexture I00000oOI;
                public Surface I0000Il00O;

                @Override
                public final void accept(Object obj) {
/* 1 */             Iio1000IOoi1 iio1000IOoi1 = this.I00000oIO;
/* 3 */             SurfaceTexture surfaceTexture = this.I00000oOI;
/* 5 */             Surface surface = this.I0000Il00O;
/* 10 */            surfaceTexture.setOnFrameAvailableListener(null);
/* 13 */            surfaceTexture.release();
/* 16 */            surface.release();
                    iio1000IOoi1.I0000oI00--;
/* 25 */            iio1000IOoi1.I0000oI00();
                }
            }
