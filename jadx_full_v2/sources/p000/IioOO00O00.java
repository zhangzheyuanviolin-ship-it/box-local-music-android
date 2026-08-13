            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.view.View;
            
            public final class IioOO00O00 extends View {
                public final IioOIoool1 I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IioOO00O00(IioOIoool1 iioOIoool1, Context context) {
/* 3 */             super(context);
/* 1 */             this.I00iOIl = iioOIoool1;
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 3 */             this.I00iOIl.run();
                }
            }
