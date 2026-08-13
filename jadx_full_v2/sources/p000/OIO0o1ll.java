            package p000;

            import android.app.Notification;
            import android.graphics.Bitmap;
            import androidx.core.graphics.drawable.IconCompat;
            
            public final class OIO0o1ll extends I01O1lIi {
                public IconCompat I00iiI;
                public IconCompat I00iiO;
                public boolean I00iio;

                @Override
                public final void I00lll10(OlOO1i11110 olOO1i11110) {
/* 11 */            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) olOO1i11110.I00iiI).setBigContentTitle(null);
/* 15 */            IconCompat iconCompat = this.I00iiI;
/* 17 */            if (iconCompat != null) {
/* 23 */                OIO0llOi.I00000oIO(bigContentTitle, io1oI1iOIoOi.I00000oIO(iconCompat));
                    }
/* 28 */            if (this.I00iio) {
/* 30 */                IconCompat iconCompat2 = this.I00iiO;
/* 32 */                if (iconCompat2 == null) {
/* 34 */                    bigContentTitle.bigLargeIcon((Bitmap) null);
                        } else {
/* 42 */                    bigContentTitle.bigLargeIcon(io1oI1iOIoOi.I00000oIO(iconCompat2));
                        }
                    }
/* 46 */            OIO0llOi.I0000Il00O(bigContentTitle, false);
/* 49 */            OIO0llOi.I00000oOI(bigContentTitle, null);
                }

                @Override
                public final String I00oOio10iI1() {
/* 1 */             return "androidx.core.app.NotificationCompat$BigPictureStyle";
                }
            }
