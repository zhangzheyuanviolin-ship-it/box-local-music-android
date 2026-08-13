            package p000;

            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            
            public final class IiI1o00 implements IOo1llI {
                public IiI1oOoo I00000oIO;
                public Oll0I0l1i1 I00000oOI;
                public SurfaceTexture I0000Il00O;
                public Surface I0000O;

                @Override
                public final void accept(Object obj) {
/* 1 */             IiI1oOoo iiI1oOoo = this.I00000oIO;
/* 3 */             Oll0I0l1i1 oll0I0l1i1 = this.I00000oOI;
/* 5 */             SurfaceTexture surfaceTexture = this.I0000Il00O;
/* 7 */             Surface surface = this.I0000O;
                    synchronized (oll0I0l1i1.I00000oIO) {
/* 15 */                oll0I0l1i1.I000lI = null;
/* 17 */                oll0I0l1i1.I000o00OoI0I = null;
                    }
/* 20 */            surfaceTexture.setOnFrameAvailableListener(null);
/* 23 */            surfaceTexture.release();
/* 26 */            surface.release();
                    iiI1oOoo.I000OOo1O--;
/* 35 */            iiI1oOoo.I0000oI00();
                }
            }
