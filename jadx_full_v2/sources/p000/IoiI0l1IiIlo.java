            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.util.Log;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.Objects;
            import java.util.concurrent.Future;
            
            public final class IoiI0l1IiIlo implements Closeable {
                public URL I00iOIl;
                public volatile Future I00iiI;
                public o0IiOl I00iiO;

                public final Bitmap I00000oIO() throws IOException {
/* 1 */             URL url = this.I00iOIl;
/* 10 */            if (Log.isLoggable("FirebaseMessaging", 4)) {
/* 26 */                Log.i("FirebaseMessaging", "Starting download of: " + url);
                    }
/* 29 */            URLConnection uRLConnectionOpenConnection = url.openConnection();
/* 40 */            if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
/* 118 */               IioIoO10iOiI.I000OOo1O("Content-Length exceeds max size of 1048576");
/* 37 */                return null;
                    }
/* 42 */            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
/* 51 */                byte[] bArrI00000oOI = iOiOl1i1oO.I00000oOI(new IIO11OII01ii(inputStream));
/* 55 */                if (inputStream != null) {
/* 57 */                    inputStream.close();
                        }
/* 65 */                if (Log.isLoggable("FirebaseMessaging", 2)) {
/* 67 */                    Objects.toString(url);
                        }
/* 71 */                if (bArrI00000oOI.length > 1048576) {
/* 100 */                   IioIoO10iOiI.I000OOo1O("Image exceeds max size of 1048576");
/* 37 */                    return null;
                        }
/* 75 */                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI00000oOI, 0, bArrI00000oOI.length);
/* 79 */                if (bitmapDecodeByteArray == null) {
/* 94 */                    IOOlIIilOl0.I000l1("Failed to decode image: ", url);
/* 37 */                    return null;
                        }
/* 86 */                if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 88 */                    Objects.toString(url);
                        }
/* 91 */                return bitmapDecodeByteArray;
                    } catch (Throwable th) {
/* 105 */               if (inputStream != null) {
                            try {
/* 107 */                       inputStream.close();
                            } catch (Throwable th2) {
/* 112 */                       th.addSuppressed(th2);
                            }
                        }
/* 115 */               throw th;
                    }
                }

                @Override
                public final void close() {
/* 4 */             this.I00iiI.cancel(true);
                }
            }
