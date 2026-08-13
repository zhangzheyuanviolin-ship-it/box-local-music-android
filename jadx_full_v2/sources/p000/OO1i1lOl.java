            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class OO1i1lOl extends CancellationException {
                public OO1i1lOl(long j) {
/* 9 */             super(IlIi0I0.I000l1(j, "Timed out waiting for ", " ms"));
                }

                @Override
                public final Throwable fillInStackTrace() {
/* 3 */             setStackTrace(iO11OIIOIoo0.I00000oIO);
/* 20 */            return this;
                }
            }
