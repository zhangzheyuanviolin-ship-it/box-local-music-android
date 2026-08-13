            package p000;

            import android.view.ScrollFeedbackProvider;
            import androidx.core.widget.NestedScrollView;
            
            public final class OiOiIO0 implements OiOiIl1 {
                public final ScrollFeedbackProvider I00iOIl;

                public OiOiIO0(NestedScrollView nestedScrollView) {
/* 8 */             this.I00iOIl = ScrollFeedbackProvider.createProvider(nestedScrollView);
                }

                @Override
                public final void onScrollLimit(int i, int i2, int i3, boolean z) {
/* 3 */             this.I00iOIl.onScrollLimit(i, i2, i3, z);
                }

                @Override
                public final void onScrollProgress(int i, int i2, int i3, int i4) {
/* 3 */             this.I00iOIl.onScrollProgress(i, i2, i3, i4);
                }
            }
