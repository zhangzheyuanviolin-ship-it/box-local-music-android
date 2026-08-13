            package p000;

            import android.content.ComponentCallbacks2;
            import android.content.res.Configuration;
            import android.view.ViewTreeObserver;
            
            public final class IOl1001oO1OI implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
                public IOl10lI1 I00iOIl;

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 3 */             this.I00iOIl.I0000O(configuration);
                }

                @Override
                public final void onLowMemory() {
/* 1 */             IOl10lI1 iOl10lI1 = this.I00iOIl;
/* 7 */             iOl10lI1.I000II.I00000oIO.clear();
/* 10 */            Oi0lI0 oi0lI0 = iOl10lI1.I000O01llI0;
                    synchronized (oi0lI0) {
/* 15 */                oi0lI0.I00000oIO.I0000Il00O();
                    }
                }

                @Override
                public final void onTrimMemory(int i) {
/* 1 */             IOl10lI1 iOl10lI1 = this.I00iOIl;
/* 7 */             iOl10lI1.I000II.I00000oIO.clear();
/* 10 */            Oi0lI0 oi0lI0 = iOl10lI1.I000O01llI0;
                    synchronized (oi0lI0) {
/* 15 */                oi0lI0.I00000oIO.I0000Il00O();
                    }
                }

                @Override
                public final void onWindowFocusChanged(boolean z) {
/* 11 */            this.I00iOIl.I00111O.I0000Il00O.setValue(Boolean.valueOf(z));
                }
            }
