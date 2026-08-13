            package p000;

            import java.util.concurrent.ScheduledFuture;
            import kotlin.jvm.functions.Function1;
            
            public final class IIoOIOIIIl implements IIoOOiIO0o1I {
                public final int I00iOIl;
                public Object I00iiI;

                @Override
                public final void I00000oOI(Throwable th) {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    ((ScheduledFuture) this.I00iiI).cancel(false);
                            break;
                        case 1:
/* 18 */                    ((Function1) this.I00iiI).invoke(th);
                            break;
                        default:
/* 10 */                    ((IiiOlIiio) this.I00iiI).I00000oOI();
                            break;
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 89 */                    return "CancelFutureOnCancel[" + ((ScheduledFuture) this.I00iiI) + ']';
                        case 1:
/* 67 */                    return "CancelHandler.UserSupplied[" + ((Function1) this.I00iiI).getClass().getSimpleName() + '@' + Ii1Oo1l.I00000oIO(this) + ']';
                        default:
/* 25 */                    return "DisposeOnCancel[" + ((IiiOlIiio) this.I00iiI) + ']';
                    }
                }
            }
