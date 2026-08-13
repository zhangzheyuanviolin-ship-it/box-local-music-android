            package p000;

            import android.animation.ValueAnimator;
            import java.lang.invoke.VarHandle;
            
            public final class OiOOl1Iioo implements Ioi11lOIIO0O {
                public float I00000oIO;
                public ValueAnimator I00000oOI;
                public OiOOo110O I0000Il00O;

                @Override
                public final void I00000oIO(long j, I0IOIlIOIII i0IOIlIOIII) {
/* 4 */             l11I11lO.I0000O(3, "ScreenFlashView");
/* 7 */             OiOOo110O oiOOo110O = this.I0000Il00O;
/* 13 */            this.I00000oIO = oiOOo110O.getBrightness();
/* 1 */             oiOOo110O.setBrightness(1.0f);
/* 20 */            ValueAnimator valueAnimator = this.I00000oOI;
/* 22 */            if (valueAnimator != null) {
/* 24 */                valueAnimator.cancel();
                    }
/* 30 */            OOIl1i1 oOIl1i1 = new OOIl1i1(5);
/* 33 */            oOIl1i1.I00iiI = i0IOIlIOIII;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            l11I11lO.I0000O(3, "ScreenFlashView");
/* 47 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 55 */            valueAnimatorOfFloat.setDuration(oiOOo110O.getVisibilityRampUpAnimationDurationMillis());
/* 61 */            OiOOl11Oloi oiOOl11Oloi = new OiOOl11Oloi(0);
/* 64 */            oiOOl11Oloi.I00000oOI = oiOOo110O;
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            valueAnimatorOfFloat.addUpdateListener(oiOOl11Oloi);
/* 74 */            OiOOlIiiOi oiOOlIiiOi = new OiOOlIiiOi();
/* 77 */            oiOOlIiiOi.I00000oIO = oOIl1i1;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            valueAnimatorOfFloat.addListener(oiOOlIiiOi);
/* 85 */            valueAnimatorOfFloat.start();
/* 88 */            this.I00000oOI = valueAnimatorOfFloat;
                }

                @Override
                public final void clear() {
/* 1 */             OiOOo110O oiOOo110O = this.I0000Il00O;
/* 6 */             l11I11lO.I0000O(3, "ScreenFlashView");
/* 9 */             ValueAnimator valueAnimator = this.I00000oOI;
/* 11 */            if (valueAnimator != null) {
/* 13 */                valueAnimator.cancel();
/* 17 */                this.I00000oOI = null;
                    }
/* 20 */            oiOOo110O.setAlpha(0.0f);
/* 1 */             oiOOo110O.setBrightness(this.I00000oIO);
                }
            }
