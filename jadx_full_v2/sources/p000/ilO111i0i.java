            package p000;

            import android.os.Build;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class ilO111i0i extends i1Io0lIii {
                public static final boolean I00000oOI;
                public static final boolean I0000Il00O;
                public static final boolean I0000O;
                public static final AtomicReference I0000oI00;
                public static final ConcurrentLinkedQueue I0001Ioi1lo;

                static {
/* 1 */             String str = Build.FINGERPRINT;
/* 18 */            I00000oOI = str == null || "robolectric".equals(str);
/* 20 */            String str2 = Build.HARDWARE;
/* 41 */            I0000Il00O = "goldfish".equals(str2) || "ranchu".equals(str2);
/* 43 */            String str3 = Build.TYPE;
/* 62 */            I0000O = "eng".equals(str3) || "userdebug".equals(str3);
/* 69 */            I0000oI00 = new AtomicReference();
/* 73 */            new AtomicLong();
/* 81 */            I0001Ioi1lo = new ConcurrentLinkedQueue();
                }
            }
