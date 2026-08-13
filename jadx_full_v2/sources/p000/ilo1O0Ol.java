            package p000;

            import java.util.concurrent.Future;
            import java.util.concurrent.TimeUnit;
            
/* 5 */     public final class ilo1O0Ol implements Future {
                public Float I00iOIl;

                static {
/* 6 */             new O0o0ill01o0(3, ilo1O0Ol.class);
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
/* 15 */            return Oi010OO0.I001IIilI0O(super.toString(), "[status=SUCCESS, result=[", this.I00iOIl.toString(), "]]");
                }

                @Override
/* 6 */         public final Object get() {
/* 7 */             return this.I00iOIl;
                }
            }
