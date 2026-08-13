            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            
            public final class I101liloIo1 {
                public Context I00000oIO;

                public final void I00000oIO(String str) {
                    try {
/* 14 */                this.I00000oIO.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (ActivityNotFoundException e) {
/* 77 */                throw new IllegalArgumentException(IlIi0I0.I000lI("Can't open ", str, "."), e);
                    }
                }
            }
