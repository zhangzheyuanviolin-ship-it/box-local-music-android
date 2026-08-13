            package p000;

            import java.io.InterruptedIOException;
            import java.util.concurrent.TimeUnit;
            
            public class Oo11IoI {
                public static final Oo11IiOoo0oO I0000O = new Oo11IiOoo0oO();
                public boolean I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;

                public Oo11IoI I00000oIO() {
/* 2 */             this.I00000oIO = false;
/* 29 */            return this;
                }

                public Oo11IoI I00000oOI() {
/* 3 */             this.I0000Il00O = 0L;
/* 29 */            return this;
                }

                public long I0000Il00O() {
/* 3 */             if (this.I00000oIO) {
/* 5 */                 return this.I00000oOI;
                    }
/* 10 */            I000II.I001IO000("No deadline");
/* 13 */            return 0L;
                }

                public Oo11IoI I0000O(long j) {
/* 2 */             this.I00000oIO = true;
/* 4 */             this.I00000oOI = j;
/* 49 */            return this;
                }

                public boolean I0000oI00() {
/* 1 */             return this.I00000oIO;
                }

                public void I0001Ioi1lo() throws InterruptedIOException {
/* 9 */             if (Thread.currentThread().isInterrupted()) {
/* 113 */               throw new InterruptedIOException("interrupted");
                    }
/* 13 */            if (this.I00000oIO && this.I00000oOI - System.nanoTime() <= 0) {
/* 36 */                throw new InterruptedIOException("deadline reached");
                    }
                }

                public Oo11IoI I000II(long j) {
/* 5 */             if (j >= 0) {
/* 13 */                this.I0000Il00O = TimeUnit.MILLISECONDS.toNanos(j);
/* 15 */                return this;
                    }
/* 22 */            I000II.I0010I0i(IlIi0I0.I000iOII(j, "timeout < 0: "));
/* 25 */            return null;
                }
            }
