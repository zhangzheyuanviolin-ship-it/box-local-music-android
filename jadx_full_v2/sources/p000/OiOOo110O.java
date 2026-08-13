            package p000;

            import android.view.View;
            import android.view.Window;
            import android.view.WindowManager;
            import java.lang.invoke.VarHandle;
            
            public final class OiOOo110O extends View {
                public Window I00iOIl;
                public OiOOl1Iioo I00iiI;

                private float getBrightness() {
/* 1 */             Window window = this.I00iOIl;
/* 3 */             if (window != null) {
/* 19 */                return window.getAttributes().screenBrightness;
                    }
/* 9 */             l11I11lO.I00000oIO("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
/* 12 */            return Float.NaN;
                }

                private void setBrightness(float f) {
/* 5 */             if (this.I00iOIl == null) {
/* 9 */                 l11I11lO.I00000oIO("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
/* 12 */                return;
                    }
/* 17 */            if (Float.isNaN(f)) {
/* 21 */                l11I11lO.I00000oIO("ScreenFlashView", "setBrightness: value is NaN!");
/* 24 */                return;
                    }
/* 27 */            WindowManager.LayoutParams attributes = this.I00iOIl.getAttributes();
/* 31 */            attributes.screenBrightness = f;
/* 35 */            this.I00iOIl.setAttributes(attributes);
/* 39 */            l11I11lO.I0000O(3, "ScreenFlashView");
                }

                private void setScreenFlashUiInfo(Ioi11lOIIO0O ioi11lOIIO0O) {
/* 4 */             l11I11lO.I0000O(3, "ScreenFlashView");
                }

                public Ioi11lOIIO0O getScreenFlash() {
/* 1 */             return this.I00iiI;
                }

                public long getVisibilityRampUpAnimationDurationMillis() {
/* 1 */             return 1000L;
                }

                public void setController(IIlOIio1 iIlOIio1) {
/* 1 */             lOllIO.I00000oIO();
                }

                public void setScreenFlashWindow(Window window) {
                    OiOOl1Iioo oiOOl1Iioo;
/* 1 */             lOllIO.I00000oIO();
/* 7 */             l11I11lO.I0000O(3, "ScreenFlashView");
/* 12 */            if (this.I00iOIl != window) {
/* 14 */                if (window == null) {
/* 16 */                    oiOOl1Iioo = null;
                        } else {
/* 20 */                    oiOOl1Iioo = new OiOOl1Iioo();
/* 23 */                    oiOOl1Iioo.I0000Il00O = this;
/* 25 */                    VarHandle.storeStoreFence();
                        }
/* 28 */                this.I00iiI = oiOOl1Iioo;
                    }
/* 30 */            this.I00iOIl = window;
/* 36 */            setScreenFlashUiInfo(getScreenFlash());
                }
            }
