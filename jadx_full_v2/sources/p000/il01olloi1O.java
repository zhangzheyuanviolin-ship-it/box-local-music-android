            package p000;

            import android.os.Build;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class il01olloi1O extends i1Io0lIii {
                public static final boolean I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final AtomicReference I0001Ioi1lo;
                public static final AtomicLong I000II;
                public static final ConcurrentLinkedQueue I000O01llI0;
                public volatile i1Io0lIii I00000oOI;

                static {
/* 1 */             String str = Build.FINGERPRINT;
/* 18 */            I0000Il00O = str == null || "robolectric".equals(str);
/* 20 */            String str2 = Build.HARDWARE;
/* 41 */            I0000O = "goldfish".equals(str2) || "ranchu".equals(str2);
/* 43 */            String str3 = Build.TYPE;
/* 62 */            I0000oI00 = "eng".equals(str3) || "userdebug".equals(str3);
/* 69 */            I0001Ioi1lo = new AtomicReference();
/* 76 */            I000II = new AtomicLong();
/* 83 */            I000O01llI0 = new ConcurrentLinkedQueue();
                }

                public static void I000II() {
                    while (true) {
/* 7 */                 il00oIlOoOo1 il00oiloooo1 = (il00oIlOoOo1) I000O01llI0.poll();
/* 9 */                 if (il00oiloooo1 == null) {
/* 55 */                    return;
                        }
/* 13 */                I000II.getAndDecrement();
/* 16 */                il01olloi1O il01olloi1o = il00oiloooo1.I00000oIO;
/* 18 */                lIOl0o0 liol0o0 = il00oiloooo1.I00000oOI;
/* 20 */                loll1I0I0iI loll1i0i0ii = liol0o0.I0000Il00O;
/* 22 */                if ((loll1i0i0ii != null && Boolean.TRUE.equals(loll1i0i0ii.I0000Il00O(loO1I0io.I000II))) || il01olloi1o.I0001Ioi1lo(liol0o0.I00000oIO)) {
/* 47 */                    il01olloi1o.I0000Il00O(liol0o0);
                        }
                    }
                }

                @Override
                public final void I00000oIO(RuntimeException runtimeException, lIOl0o0 liol0o0) {
/* 3 */             if (this.I00000oOI != null) {
/* 7 */                 this.I00000oOI.I00000oIO(runtimeException, liol0o0);
                    } else {
/* 15 */                Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
                    }
                }

                @Override
                public final void I0000Il00O(lIOl0o0 liol0o0) {
/* 3 */             if (this.I00000oOI != null) {
/* 7 */                 this.I00000oOI.I0000Il00O(liol0o0);
/* 10 */                return;
                    }
/* 21 */            if (I000II.incrementAndGet() > 20) {
/* 25 */                I000O01llI0.poll();
/* 32 */                Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
                    }
/* 35 */            ConcurrentLinkedQueue concurrentLinkedQueue = I000O01llI0;
/* 39 */            il00oIlOoOo1 il00oiloooo1 = new il00oIlOoOo1();
/* 42 */            il00oiloooo1.I00000oIO = this;
/* 44 */            il00oiloooo1.I00000oOI = liol0o0;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            concurrentLinkedQueue.offer(il00oiloooo1);
/* 54 */            if (this.I00000oOI != null) {
/* 56 */                I000II();
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(Level level) {
                    return this.I00000oOI == null || this.I00000oOI.I0001Ioi1lo(level);
                }
            }
