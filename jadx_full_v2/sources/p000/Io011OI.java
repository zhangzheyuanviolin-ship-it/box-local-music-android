            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class Io011OI extends CancellationException {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io011OI(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 1:
/* 13 */                    setStackTrace(iO0I0I0O0.I00000oIO);
/* 16 */                    return this;
                        default:
/* 6 */                     return super.fillInStackTrace();
                    }
                }
            }
