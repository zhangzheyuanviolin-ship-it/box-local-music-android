            package p000;

            import android.graphics.Bitmap;
            import android.graphics.RectF;
            import android.util.Size;
            import android.view.Display;
            import android.view.TextureView;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.google.common.util.concurrent.ListenableFuture;
            
            public abstract class OOIO1OOiI0 {
                public Size I00000oIO;
                public final FrameLayout I00000oOI;
                public final OOIIloi0 I0000Il00O;
                public boolean I0000O = false;

                public OOIO1OOiI0(FrameLayout frameLayout, OOIIloi0 oOIIloi0) {
/* 7 */             this.I00000oOI = frameLayout;
/* 9 */             this.I0000Il00O = oOIIloi0;
                }

                public abstract View I00000oIO();

                public abstract Bitmap I00000oOI();

                public abstract void I0000Il00O();

                public abstract void I0000O();

                public abstract void I0000oI00(Oll0I0l1i1 oll0I0l1i1, IiI0oIlol0 iiI0oIlol0);

                public final void I0001Ioi1lo() {
/* 1 */             View viewI00000oIO = I00000oIO();
/* 5 */             if (viewI00000oIO == null || !this.I0000O) {
/* 245 */               return;
                    }
/* 15 */            FrameLayout frameLayout = this.I00000oOI;
/* 25 */            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
/* 28 */            int layoutDirection = frameLayout.getLayoutDirection();
/* 32 */            OOIIloi0 oOIIloi0 = this.I0000Il00O;
/* 34 */            oOIIloi0.getClass();
/* 43 */            if (size.getHeight() == 0 || size.getWidth() == 0) {
/* 205 */               l11I11lO.I0000oI00("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
/* 245 */               return;
                    }
/* 57 */            if (oOIIloi0.I0001Ioi1lo()) {
/* 63 */                if (viewI00000oIO instanceof TextureView) {
/* 72 */                    ((TextureView) viewI00000oIO).setTransform(oOIIloi0.I0000O());
                        } else {
/* 76 */                    Display display = viewI00000oIO.getDisplay();
/* 82 */                    boolean z = false;
/* 98 */                    boolean z2 = (!oOIIloi0.I000II || display == null || display.getRotation() == oOIIloi0.I0000oI00) ? false : true;
/* 99 */                    boolean z3 = oOIIloi0.I000II;
/* 101 */                   if (!z3) {
/* 115 */                       if ((!z3 ? oOIIloi0.I0000Il00O : -iOioOiio.I00000oOI(oOIIloi0.I0000oI00)) != 0) {
/* 117 */                           z = true;
                                }
                            }
/* 118 */                   if (z2 || z) {
/* 124 */                       l11I11lO.I00000oIO("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                            }
                        }
/* 127 */               RectF rectFI0000oI00 = oOIIloi0.I0000oI00(layoutDirection, size);
/* 132 */               viewI00000oIO.setPivotX(0.0f);
/* 135 */               viewI00000oIO.setPivotY(0.0f);
/* 150 */               viewI00000oIO.setScaleX(rectFI0000oI00.width() / oOIIloi0.I00000oIO.getWidth());
/* 165 */               viewI00000oIO.setScaleY(rectFI0000oI00.height() / oOIIloi0.I00000oIO.getHeight());
/* 176 */               viewI00000oIO.setTranslationX(rectFI0000oI00.left - viewI00000oIO.getLeft());
/* 187 */               viewI00000oIO.setTranslationY(rectFI0000oI00.top - viewI00000oIO.getTop());
                    }
                }

                public abstract ListenableFuture I000II();
            }
