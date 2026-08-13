            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            
/* 5 */     public final class l00lIloiio implements ListenableFuture {
                public static final l00lIloiio I00iiI = new l00lIloiio(null);
                public static final O0o0ill01o0 I00iiO = new O0o0ill01o0(6, l00lIloiio.class);
                public final Object I00iOIl;

                public l00lIloiio(Object obj) {
/* 4 */             this.I00iOIl = obj;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 1 */             if (runnable == null) {
/* 51 */                IOOlIIilOl0.I000II("Runnable was null.");
/* 106 */               return;
                    }
/* 3 */             if (executor == null) {
/* 45 */                IOOlIIilOl0.I000II("Executor was null.");
/* 48 */                return;
                    }
                    try {
/* 5 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 39 */                I00iiO.I00000oOI().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", IIl001iO0Io.I000oI1ioi("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
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
/* 15 */            return Oi010OO0.I001IIilI0O(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.I00iOIl), "]]");
                }

                @Override
/* 6 */         public final Object get() {
/* 7 */             return this.I00iOIl;
                }
            }
