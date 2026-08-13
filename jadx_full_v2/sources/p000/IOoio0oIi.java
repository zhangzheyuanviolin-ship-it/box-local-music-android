            package p000;

            import android.os.OutcomeReceiver;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IOoio0oIi extends AtomicBoolean implements OutcomeReceiver {
                public IIoOoIol0Io0 I00iOIl;

                @Override
                public final void onError(Throwable th) {
/* 7 */             if (compareAndSet(false, true)) {
/* 15 */                this.I00iOIl.resumeWith(lIoii1l01l0i.I00000oIO(th));
                    }
                }

                @Override
                public final void onResult(Object obj) {
/* 7 */             if (compareAndSet(false, true)) {
/* 11 */                this.I00iOIl.resumeWith(obj);
                    }
                }

                @Override
                public final String toString() {
/* 20 */            return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ")";
                }
            }
