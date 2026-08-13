            package p000;

            import android.os.SystemClock;
            import java.io.Closeable;
            import java.util.HashMap;
            import java.util.Locale;
            
            public class lO01OoOo implements Closeable {
                public static final HashMap I00ilO0 = new HashMap();
                public int I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public long I00iio = 2147483647L;
                public long I00ilI0I1 = -2147483648L;

                public lO01OoOo(String str) {
                }

                public void I00000oIO() {
/* 8 */             this.I00iiI = SystemClock.elapsedRealtimeNanos() / 1000;
                }

                public void I0000Il00O(long j) {
/* 11 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
/* 12 */            long j2 = this.I00iiO;
/* 25 */            if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
/* 36 */                this.I00iOIl = 0;
/* 38 */                this.I00iiI = 0L;
/* 40 */                this.I00iio = 2147483647L;
/* 42 */                this.I00ilI0I1 = -2147483648L;
                    }
/* 44 */            this.I00iiO = jElapsedRealtimeNanos;
                    this.I00iOIl++;
/* 58 */            this.I00iio = Math.min(this.I00iio, j);
/* 66 */            this.I00ilI0I1 = Math.max(this.I00ilI0I1, j);
/* 72 */            if (this.I00iOIl % 50 == 0) {
/* 74 */                Locale locale = Locale.US;
/* 76 */                lOOlOoll.I0000O();
                    }
/* 83 */            if (this.I00iOIl % 500 == 0) {
/* 85 */                this.I00iOIl = 0;
/* 87 */                this.I00iiI = 0L;
/* 89 */                this.I00iio = 2147483647L;
/* 91 */                this.I00ilI0I1 = -2147483648L;
                    }
                }

                public void I000II(long j) {
/* 9 */             I0000Il00O((SystemClock.elapsedRealtimeNanos() / 1000) - j);
                }

                @Override
                public void close() {
/* 1 */             long j = this.I00iiI;
/* 7 */             if (j != 0) {
/* 9 */                 I000II(j);
                    } else {
/* 15 */                I000II.I001IO000("Did you forget to call start()?");
                    }
                }
            }
