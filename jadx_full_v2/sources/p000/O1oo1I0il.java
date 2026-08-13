            package p000;

            import android.util.Log;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.FutureTask;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class O1oo1I0il extends FutureTask {
                public final I1OoI1 I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1oo1I0il(I1OoI1 i1OoI1, Io11llo0i io11llo0i) {
/* 3 */             super(io11llo0i);
/* 1 */             this.I00iOIl = i1OoI1;
                }

                @Override
                public final void done() {
/* 3 */             I1OoI1 i1OoI1 = this.I00iOIl;
/* 5 */             AtomicBoolean atomicBoolean = i1OoI1.I00ilI0I1;
                    try {
/* 7 */                 Object obj = get();
/* 15 */                if (atomicBoolean.get()) {
/* 55 */                    return;
                        }
/* 17 */                i1OoI1.I00000oIO(obj);
                    } catch (InterruptedException e) {
/* 49 */                Log.w("AsyncTask", e);
                    } catch (CancellationException unused) {
/* 30 */                if (atomicBoolean.get()) {
/* 55 */                    return;
                        }
/* 33 */                i1OoI1.I00000oIO(null);
                    } catch (ExecutionException e2) {
/* 42 */                OIiilo1Ool0o.I000iOII("An error occurred while executing doInBackground()", e2.getCause());
                    } catch (Throwable th) {
/* 22 */                OIiilo1Ool0o.I000iOII("An error occurred while executing doInBackground()", th);
                    }
                }
            }
