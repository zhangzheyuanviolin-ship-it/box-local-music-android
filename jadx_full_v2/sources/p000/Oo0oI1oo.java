            package p000;

            import android.graphics.Bitmap;
            import android.graphics.SurfaceTexture;
            import android.util.Size;
            import android.view.Surface;
            import android.view.TextureView;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Oo0oI1oo extends OOIO1OOiI0 {
                public TextureView I0000oI00;
                public SurfaceTexture I0001Ioi1lo;
                public IIiOiI0il I000II;
                public Oll0I0l1i1 I000O01llI0;
                public boolean I000OOo1O;
                public SurfaceTexture I000OiO;
                public AtomicReference I000iOII;
                public IiI0oIlol0 I000l1;

                @Override
                public final View I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Bitmap I00000oOI() {
/* 1 */             TextureView textureView = this.I0000oI00;
/* 3 */             if (textureView == null || !textureView.isAvailable()) {
/* 19 */                return null;
                    }
/* 14 */            return this.I0000oI00.getBitmap();
                }

                @Override
                public final void I0000Il00O() {
/* 3 */             if (!this.I000OOo1O || this.I000OiO == null) {
/* 55 */                return;
                    }
/* 11 */            SurfaceTexture surfaceTexture = this.I0000oI00.getSurfaceTexture();
/* 15 */            SurfaceTexture surfaceTexture2 = this.I000OiO;
/* 17 */            if (surfaceTexture != surfaceTexture2) {
/* 21 */                this.I0000oI00.setSurfaceTexture(surfaceTexture2);
/* 25 */                this.I000OiO = null;
/* 28 */                this.I000OOo1O = false;
                    }
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I000OOo1O = true;
                }

                @Override
                public final void I0000oI00(Oll0I0l1i1 oll0I0l1i1, IiI0oIlol0 iiI0oIlol0) {
                    IiI0oIlol0 iiI0oIlol02;
/* 1 */             Size size = oll0I0l1i1.I00000oOI;
/* 3 */             this.I00000oIO = size;
/* 5 */             size.getClass();
/* 10 */            FrameLayout frameLayout = this.I00000oOI;
/* 16 */            TextureView textureView = new TextureView(frameLayout.getContext());
/* 19 */            this.I0000oI00 = textureView;
/* 38 */            textureView.setLayoutParams(new FrameLayout.LayoutParams(this.I00000oIO.getWidth(), this.I00000oIO.getHeight()));
/* 41 */            TextureView textureView2 = this.I0000oI00;
/* 45 */            Oo0o1l oo0o1l = new Oo0o1l();
/* 48 */            oo0o1l.I00000oIO = this;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            textureView2.setSurfaceTextureListener(oo0o1l);
/* 56 */            frameLayout.removeAllViews();
/* 61 */            frameLayout.addView(this.I0000oI00);
/* 64 */            Oll0I0l1i1 oll0I0l1i12 = this.I000O01llI0;
/* 66 */            if (oll0I0l1i12 != null && oll0I0l1i12.I0000Il00O() && (iiI0oIlol02 = this.I000l1) != null) {
/* 78 */                iiI0oIlol02.I00000oIO();
/* 82 */                this.I000l1 = null;
                    }
/* 84 */            this.I000O01llI0 = oll0I0l1i1;
/* 86 */            this.I000l1 = iiI0oIlol0;
/* 94 */            Executor mainExecutor = this.I0000oI00.getContext().getMainExecutor();
/* 102 */           Io11iII11ll io11iII11ll = new Io11iII11ll(21);
/* 105 */           io11iII11ll.I00iiI = this;
/* 107 */           io11iII11ll.I00iiO = oll0I0l1i1;
/* 109 */           VarHandle.storeStoreFence();
/* 114 */           oll0I0l1i1.I000OiO.I00000oIO(io11iII11ll, mainExecutor);
/* 117 */           I000O01llI0();
                }

                @Override
                public final ListenableFuture I000II() {
/* 4 */             Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(2);
/* 7 */             olio1i0OI00i.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            return iOiiloIII0O.I00000oIO(olio1i0OI00i);
                }

                public final void I000O01llI0() {
                    SurfaceTexture surfaceTexture;
/* 1 */             Size size = this.I00000oIO;
/* 3 */             if (size == null || (surfaceTexture = this.I0001Ioi1lo) == null || this.I000O01llI0 == null) {
/* 110 */               return;
                    }
/* 24 */            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.I00000oIO.getHeight());
/* 31 */            Surface surface = new Surface(this.I0001Ioi1lo);
/* 34 */            Oll0I0l1i1 oll0I0l1i1 = this.I000O01llI0;
/* 40 */            IIoIil iIoIil = new IIoIil(20);
/* 43 */            iIoIil.I00iiI = this;
/* 45 */            iIoIil.I00iiO = surface;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(iIoIil);
/* 54 */            this.I000II = iIiOiI0ilI00000oIO;
/* 59 */            IIl1IO iIl1IO = new IIl1IO(4);
/* 62 */            iIl1IO.I00iiI = this;
/* 64 */            iIl1IO.I00iiO = surface;
/* 66 */            iIl1IO.I00iio = iIiOiI0ilI00000oIO;
/* 68 */            iIl1IO.I00ilI0I1 = oll0I0l1i1;
/* 70 */            VarHandle.storeStoreFence();
/* 85 */            iIiOiI0ilI00000oIO.I00iiI.addListener(iIl1IO, this.I0000oI00.getContext().getMainExecutor());
/* 89 */            this.I0000O = true;
/* 91 */            I0001Ioi1lo();
                }
            }
