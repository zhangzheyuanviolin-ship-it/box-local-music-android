            package p000;

            import android.content.ComponentCallbacks2;
            import android.content.res.Configuration;
            
/* 18 */    public final class I0oIl0OolO implements ComponentCallbacks2 {
                public I0oIoiI0 I00iOIl;

                @Override
                public final void onTrimMemory(int i) {
/* 3 */             if (i >= 40) {
/* 7 */                 this.I00iOIl.I0000O();
                    }
                }

                @Override
/* 19 */        public final void onLowMemory() {
                }

                @Override
/* 28 */        public final void onConfigurationChanged(Configuration configuration) {
                }
            }
