            package p000;

            import android.net.Uri;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            
            public final class lo0OOo implements loIo0iiOoi {
                @Override
                public final lo1IiOOl1 I00000oIO(Uri uri) {
/* 5 */             return lo1IiOOl1.I0000Il00O(ll10II0o1.I00000oIO(uri));
                }

                @Override
                public final boolean I00000oOI(Uri uri) {
/* 5 */             return ll10II0o1.I00000oIO(uri).exists();
                }

                @Override
                public final File I0000Il00O(Uri uri) {
/* 1 */             return ll10II0o1.I00000oIO(uri);
                }

                @Override
                public final OutputStream I0000O(Uri uri) throws IOException {
/* 1 */             File fileI00000oIO = ll10II0o1.I00000oIO(uri);
/* 5 */             ilOIo0iOI.I00000oIO(fileI00000oIO);
/* 12 */            FileOutputStream fileOutputStream = new FileOutputStream(fileI00000oIO);
/* 15 */            lo1OoIIlll lo1ooiilll = new lo1OoIIlll(fileOutputStream);
/* 18 */            lo1ooiilll.I00iOIl = fileOutputStream;
/* 20 */            lo1ooiilll.I00iiI = fileI00000oIO;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return lo1ooiilll;
                }

                @Override
                public final void I0000oI00(Uri uri) throws IOException {
/* 1 */             File fileI00000oIO = ll10II0o1.I00000oIO(uri);
/* 9 */             if (fileI00000oIO.isDirectory()) {
/* 77 */                throw new FileNotFoundException(String.format("%s is a directory", uri));
                    }
/* 15 */            if (fileI00000oIO.delete()) {
/* 55 */                return;
                    }
/* 21 */            if (!fileI00000oIO.exists()) {
/* 38 */                throw new FileNotFoundException(String.format("%s does not exist", uri));
                    }
/* 54 */            throw new IOException(String.format("%s could not be deleted", uri));
                }

                @Override
                public final void I0001Ioi1lo(Uri uri, Uri uri2) throws IOException {
/* 1 */             File fileI00000oIO = ll10II0o1.I00000oIO(uri);
/* 5 */             File fileI00000oIO2 = ll10II0o1.I00000oIO(uri2);
/* 9 */             ilOIo0iOI.I00000oIO(fileI00000oIO2);
/* 16 */            if (!fileI00000oIO.renameTo(fileI00000oIO2)) {
/* 37 */                throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
                    }
                }

                @Override
                public final String zzc() {
/* 1 */             return "file";
                }
            }
