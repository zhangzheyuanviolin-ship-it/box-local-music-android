            package p000;

            import android.view.View;
            import android.view.Window;
            
            public final class Oo1iOI0 implements View.OnClickListener {
                public I0I1101l0 I00iOIl;
                public Oo1ilOl I00iiI;

                @Override
                public final void onClick(View view) {
/* 1 */             Oo1ilOl oo1ilOl = this.I00iiI;
/* 3 */             Window.Callback callback = oo1ilOl.I000iOII;
/* 5 */             if (callback == null || !oo1ilOl.I000l1) {
/* 29 */                return;
                    }
/* 14 */            callback.onMenuItemSelected(0, this.I00iOIl);
                }
            }
