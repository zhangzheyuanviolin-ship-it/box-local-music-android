            package p000;

            import android.os.SystemClock;
            
            public final class iO11101I {
                public final int I00000oIO;

                public final long I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    return SystemClock.elapsedRealtimeNanos();
                        default:
/* 13 */                    return SystemClock.elapsedRealtime() * 1000000;
                    }
                }
            }
