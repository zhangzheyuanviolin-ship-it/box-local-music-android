            package p000;

            import android.database.ContentObserver;
            import android.net.Uri;
            import android.os.Handler;
            
            public final class i0100lioil extends ContentObserver {
                public final IIIII1OI1 I00000oIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0100lioil(IIIII1OI1 iiiii1oi1, Handler handler) {
/* 3 */             super(handler);
/* 1 */             this.I00000oIO = iiiii1oi1;
                }

                @Override
                public final void onChange(boolean z, Uri uri) {
/* 5 */             this.I00000oIO.I000lI(OoiIlOl1iI.I00000oIO);
                }
            }
