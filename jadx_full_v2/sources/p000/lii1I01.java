            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
/* 5 */     public final class lii1I01 implements ListenableFuture {
                public static final lii1I01 I00iiI = new lii1I01(null);
                public static final O0o0ill01o0 I00iiO = new O0o0ill01o0(8, lii1I01.class);
                public final Object I00iOIl;

                public lii1I01(Object obj) {
/* 4 */             this.I00iOIl = obj;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             ll0OlOllOl.I00000oOI("Runnable was null.", runnable);
/* 8 */             ll0OlOllOl.I00000oOI("Executor was null.", executor);
                    try {
/* 11 */                executor.execute(runnable);
                    } catch (Exception e) {
/* 19 */                Logger loggerI00000oOI = I00iiO.I00000oOI();
/* 23 */                Level level = Level.SEVERE;
/* 25 */                String strValueOf = String.valueOf(runnable);
/* 29 */                String strValueOf2 = String.valueOf(executor);
/* 61 */                loggerI00000oOI.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", IIl001iO0Io.I00100o1O0lo(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
                    }
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) {
/* 1 */             timeUnit.getClass();
/* 4 */             return this.I00iOIl;
                }

                @Override
                public final boolean isCancelled() {
/* 1 */             return false;
                }

                @Override
                public final boolean isDone() {
/* 1 */             return true;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 7 */             String strValueOf = String.valueOf(this.I00iOIl);
/* 37 */            return IIl001iO0Io.I00100o1O0lo(new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2), string, "[status=SUCCESS, result=[", strValueOf, "]]");
                }

                @Override
/* 6 */         public final Object get() {
/* 7 */             return this.I00iOIl;
                }
            }
