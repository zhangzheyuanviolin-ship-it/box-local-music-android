            package p000;

            import java.util.concurrent.TimeUnit;
            
            public abstract class OloO11o0 {
                public static final String I00000oIO;
                public static final long I00000oOI;
                public static final int I0000Il00O;
                public static final int I0000O;
                public static final long I0000oI00;
                public static final lolOiIoiillI I0001Ioi1lo;

                static {
                    String property;
/* 3 */             int i = Olli0OOiloi.I00000oIO;
                    try {
/* 5 */                 property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
                    } catch (SecurityException unused) {
/* 10 */                property = null;
                    }
/* 11 */            if (property == null) {
/* 13 */                property = "DefaultDispatcher";
                    }
/* 15 */            I00000oIO = property;
/* 33 */            I00000oOI = lOiOi1.I00000oIO(100000L, "kotlinx.coroutines.scheduler.resolution.ns", 1L, Long.MAX_VALUE);
/* 35 */            int i2 = Olli0OOiloi.I00000oIO;
/* 38 */            if (i2 < 2) {
/* 40 */                i2 = 2;
                    }
/* 49 */            I0000Il00O = lOiOi1.I00000oOI(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
/* 61 */            I0000O = lOiOi1.I00000oOI(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
/* 84 */            I0000oI00 = TimeUnit.SECONDS.toNanos(lOiOi1.I00000oIO(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", 1L, Long.MAX_VALUE));
/* 88 */            I0001Ioi1lo = lolOiIoiillI.I00li1OI;
                }
            }
