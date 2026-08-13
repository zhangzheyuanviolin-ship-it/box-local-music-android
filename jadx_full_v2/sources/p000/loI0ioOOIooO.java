            package p000;

            import android.net.Uri;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class loI0ioOOIooO implements lloO1Oolo {
                public boolean I00iOIl;

                static {
/* 3 */             new AtomicInteger();
                }

                @Override
                public final Object I00000oIO(OillOo0 oillOo0) throws IOException {
/* 3 */             if (this.I00iOIl) {
/* 13 */                if (((IoillO0OOoo) oillOo0.I00iiO).isEmpty()) {
/* 23 */                    return ((loIo0iiOoi) oillOo0.I00iiI).I0000Il00O((Uri) oillOo0.I00ilI0I1);
                        }
/* 35 */                throw new IOO1IOl1O10("Short circuit would skip transforms.");
                    }
/* 36 */            Closeable closeableI00000oOI = ll1110lO.I00000oOI(oillOo0);
                    try {
/* 42 */                if (!(closeableI00000oOI instanceof lo0liol11lI)) {
/* 66 */                    throw new IOException("Not convertible and fallback to pipe is disabled.");
                        }
/* 47 */                File fileZza = ((lo0liol11lI) closeableI00000oOI).zza();
/* 51 */                if (closeableI00000oOI != null) {
/* 53 */                    closeableI00000oOI.close();
                        }
/* 56 */                return fileZza;
                    } catch (Throwable th) {
/* 67 */                if (closeableI00000oOI != null) {
                            try {
/* 69 */                        closeableI00000oOI.close();
                            } catch (Throwable th2) {
/* 74 */                        th.addSuppressed(th2);
                            }
                        }
/* 77 */                throw th;
                    }
                }
            }
