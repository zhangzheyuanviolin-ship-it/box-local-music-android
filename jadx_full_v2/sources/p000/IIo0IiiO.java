            package p000;

            import android.os.SystemClock;
            import java.io.Serializable;
            import java.net.URL;
            
/* 56 */    public final class IIo0IiiO {
                public final int I00000oIO;
                public final long I00000oOI;
                public final Serializable I0000Il00O;

                public IIo0IiiO(long j, Exception exc) {
/* 9 */             this.I00000oOI = SystemClock.elapsedRealtime() - j;
/* 14 */            if (exc instanceof IIoIiOlOIiO) {
/* 16 */                this.I00000oIO = 2;
/* 18 */                this.I0000Il00O = exc;
/* 20 */                return;
                    }
/* 24 */            if (!(exc instanceof IolIoOoi11)) {
/* 53 */                this.I00000oIO = 0;
/* 55 */                this.I0000Il00O = exc;
/* 106 */               return;
                    }
/* 26 */            Throwable cause = exc.getCause();
/* 30 */            exc = cause != null ? cause : exc;
/* 33 */            this.I0000Il00O = exc;
/* 37 */            if (exc instanceof IIoII01) {
/* 39 */                this.I00000oIO = 2;
                    } else if (exc instanceof IllegalArgumentException) {
/* 47 */                this.I00000oIO = 1;
                    } else {
/* 50 */                this.I00000oIO = 0;
                    }
                }

/* 57 */        public IIo0IiiO(int i, URL url, long j) {
/* 59 */            this.I00000oIO = i;
/* 60 */            this.I0000Il00O = url;
/* 61 */            this.I00000oOI = j;
                }
            }
