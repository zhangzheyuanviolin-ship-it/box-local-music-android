            package net.zetetic.database.sqlcipher;

            import android.util.Log;
            
            public final class SQLiteDebug {
                public static final boolean I00000oIO;
                public static final boolean I00000oOI;

                public static class DbStats {
                    public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
                    }
                }

                public static class PagerStats {
                    public int largestMemAlloc;
                    public int memoryUsed;
                    public int pageCacheOverflow;
                }

                static {
/* 4 */             Log.isLoggable("SQLiteLog", 2);
/* 13 */            I00000oIO = Log.isLoggable("SQLiteStatements", 2);
/* 21 */            I00000oOI = Log.isLoggable("SQLiteTime", 2);
                }

                private static native void nativeGetPagerStats(PagerStats pagerStats);
            }
