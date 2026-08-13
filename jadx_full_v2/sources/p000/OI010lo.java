            package p000;

            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class OI010lo implements Executor {
                public Executor I00iOIl;
                public IlOooOIi1o I00iiI;

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             Executor executor = this.I00iOIl;
/* 3 */             IlOooOIi1o ilOooOIi1o = this.I00iiI;
                    try {
/* 5 */                 executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
/* 10 */                ilOooOIi1o.I000lI(e);
                    }
                }
            }
