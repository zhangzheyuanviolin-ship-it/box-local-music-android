            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class I00i0ilIl0i extends CancellationException {
                public final transient IlOil1iooOO0 I00iOIl;

                public I00i0ilIl0i(IlOil1iooOO0 ilOil1iooOO0) {
/* 3 */             super("Flow was aborted, no more elements needed");
/* 6 */             this.I00iOIl = ilOil1iooOO0;
                }

                @Override
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 29 */            return this;
                }
            }
