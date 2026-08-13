            package p000;

            import android.os.SystemClock;
            import java.util.Objects;
            
/* 18 */    public abstract class iloOo1lIio implements Runnable {
                public final long I00iOIl;
                public final long I00iiI;
                public final boolean I00iiO;
                public final io0oIOI1o1i I00iio;

                public iloOo1lIio(io0oIOI1o1i io0oioi1o1i, boolean z) {
/* 4 */             Objects.requireNonNull(io0oioi1o1i);
/* 7 */             this.I00iio = io0oioi1o1i;
/* 13 */            this.I00iOIl = System.currentTimeMillis();
/* 19 */            this.I00iiI = SystemClock.elapsedRealtime();
/* 21 */            this.I00iiO = z;
                }

                public abstract void I00000oIO();

                @Override
                public final void run() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00iio;
/* 5 */             if (io0oioi1o1i.I0000O) {
/* 7 */                 I00000oOI();
/* 10 */                return;
                    }
                    try {
/* 11 */                I00000oIO();
                    } catch (Exception e) {
/* 19 */                io0oioi1o1i.I00000oOI(e, false, this.I00iiO);
/* 22 */                I00000oOI();
                    }
                }

/* 19 */        public void I00000oOI() {
                }
            }
