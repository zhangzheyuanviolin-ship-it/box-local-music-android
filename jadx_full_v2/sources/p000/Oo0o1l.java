            package p000;

            import android.graphics.SurfaceTexture;
            import android.view.TextureView;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class Oo0o1l implements TextureView.SurfaceTextureListener {
                public Oo0oI1oo I00000oIO;

                @Override
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
/* 4 */             l11I11lO.I0000O(3, "TextureViewImpl");
/* 7 */             Oo0oI1oo oo0oI1oo = this.I00000oIO;
/* 9 */             oo0oI1oo.I0001Ioi1lo = surfaceTexture;
/* 13 */            if (oo0oI1oo.I000II == null) {
/* 36 */                oo0oI1oo.I000O01llI0();
/* 98 */                return;
                    }
/* 17 */            oo0oI1oo.I000O01llI0.getClass();
/* 22 */            Objects.toString(oo0oI1oo.I000O01llI0);
/* 25 */            l11I11lO.I0000O(3, "TextureViewImpl");
/* 32 */            oo0oI1oo.I000O01llI0.I000iOII.I00000oIO();
                }

                @Override
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
/* 1 */             Oo0oI1oo oo0oI1oo = this.I00000oIO;
/* 4 */             oo0oI1oo.I0001Ioi1lo = null;
/* 6 */             IIiOiI0il iIiOiI0il = oo0oI1oo.I000II;
/* 8 */             if (iIiOiI0il == null) {
/* 44 */                l11I11lO.I0000O(3, "TextureViewImpl");
/* 47 */                return true;
                    }
/* 14 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(29);
/* 17 */            i1I0i0Ilo1Oi.I00iiO = this;
/* 19 */            i1I0i0Ilo1Oi.I00iiI = surfaceTexture;
/* 21 */            VarHandle.storeStoreFence();
/* 34 */            iIllIoiiIO.I00000oIO(iIiOiI0il, i1I0i0Ilo1Oi, oo0oI1oo.I0000oI00.getContext().getMainExecutor());
/* 37 */            oo0oI1oo.I000OiO = surfaceTexture;
/* 39 */            return false;
                }

                @Override
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
/* 4 */             l11I11lO.I0000O(3, "TextureViewImpl");
                }

                @Override
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
/* 10 */            IIiOOI iIiOOI = (IIiOOI) this.I00000oIO.I000iOII.getAndSet(null);
/* 12 */            if (iIiOOI != null) {
/* 14 */                iIiOOI.I00000oOI(null);
                    }
                }
            }
