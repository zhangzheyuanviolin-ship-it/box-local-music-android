            package p000;

            import android.os.Build;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class i1O1Ol extends i1Io0lIii {
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
/* 7 */                 i1O11IO i1o11io = (i1O11IO) I000O01llI0.poll();
/* 9 */                 if (i1o11io == null) {
/* 55 */                    return;
                        }
/* 13 */                I000II.getAndDecrement();
/* 16 */                i1O1Ol i1o1ol = i1o11io.I00000oIO;
/* 18 */                o0llO01llII1 o0llo01llii1 = i1o11io.I00000oOI;
/* 20 */                o0o1liIOOI1 o0o1liiooi1 = o0llo01llii1.I0000Il00O;
/* 22 */                if ((o0o1liiooi1 != null && Boolean.TRUE.equals(o0o1liiooi1.I0000O(o0o11001.I000II))) || i1o1ol.I00000oOI(o0llo01llii1.I00000oIO)) {
/* 47 */                    i1o1ol.I0000O(o0llo01llii1);
                        }
                    }
                }

                @Override
                public final boolean I00000oOI(Level level) {
                    return this.I00000oOI == null || this.I00000oOI.I00000oOI(level);
                }

                @Override
                public final void I0000O(o0llO01llII1 o0llo01llii1) {
/* 3 */             if (this.I00000oOI != null) {
/* 7 */                 this.I00000oOI.I0000O(o0llo01llii1);
/* 10 */                return;
                    }
/* 21 */            if (I000II.incrementAndGet() > 20) {
/* 25 */                I000O01llI0.poll();
/* 32 */                Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
                    }
/* 35 */            ConcurrentLinkedQueue concurrentLinkedQueue = I000O01llI0;
/* 39 */            i1O11IO i1o11io = new i1O11IO();
/* 42 */            i1o11io.I00000oIO = this;
/* 44 */            i1o11io.I00000oOI = o0llo01llii1;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            concurrentLinkedQueue.offer(i1o11io);
/* 54 */            if (this.I00000oOI != null) {
/* 56 */                I000II();
                    }
                }

                @Override
                public final void I0000oI00(RuntimeException runtimeException, o0llO01llII1 o0llo01llii1) {
/* 3 */             if (this.I00000oOI != null) {
/* 7 */                 this.I00000oOI.I0000oI00(runtimeException, o0llo01llii1);
                    } else {
/* 15 */                Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
                    }
                }
            }
