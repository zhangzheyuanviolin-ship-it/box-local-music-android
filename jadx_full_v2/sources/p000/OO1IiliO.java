            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class OO1IiliO extends CancellationException {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OO1IiliO(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    setStackTrace(iO01loO1l.I00000oIO);
                            break;
                        case 1:
/* 14 */                    setStackTrace(iO0IIIo.I00000oIO);
                            break;
                        default:
/* 8 */                     setStackTrace(iO0I01oOl1O.I00000oIO);
                            break;
                    }
/* 11 */            return this;
                }
            }
