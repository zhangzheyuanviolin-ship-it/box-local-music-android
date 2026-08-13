            package p000;

            import android.content.Context;
            import android.net.Network;
            import android.net.Uri;
            import androidx.work.WorkerParameters;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.List;
            import java.util.Set;
            import java.util.UUID;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 18 */    public abstract class O10oIiIi0OI0 {
                private Context mAppContext;
                private final AtomicInteger mStopReason = new AtomicInteger(-256);
                private boolean mUsed;
                private WorkerParameters mWorkerParams;

                public O10oIiIi0OI0(Context context, WorkerParameters workerParameters) {
/* 14 */            if (context == null) {
/* 31 */                I000II.I000iOII("Application Context is null");
/* 37 */                throw null;
                    }
/* 16 */            if (workerParameters == null) {
/* 25 */                I000II.I000iOII("WorkerParameters is null");
/* 28 */                throw null;
                    }
/* 18 */            this.mAppContext = context;
/* 20 */            this.mWorkerParams = workerParameters;
                }

                public final Context getApplicationContext() {
/* 1 */             return this.mAppContext;
                }

                public Executor getBackgroundExecutor() {
/* 3 */             return this.mWorkerParams.I0001Ioi1lo;
                }

                public ListenableFuture getForegroundInfoAsync() {
/* 8 */             return iOiiloIII0O.I00000oIO(new IoOOl0iOl1io(16));
                }

                public final UUID getId() {
/* 3 */             return this.mWorkerParams.I00000oIO;
                }

                public final Ii11I1OOII1 getInputData() {
/* 3 */             return this.mWorkerParams.I00000oOI;
                }

                public final Network getNetwork() {
/* 7 */             return (Network) this.mWorkerParams.I0000O.I00iio;
                }

                public final int getRunAttemptCount() {
/* 3 */             return this.mWorkerParams.I0000oI00;
                }

                public final int getStopReason() {
/* 3 */             return this.mStopReason.get();
                }

                public final Set<String> getTags() {
/* 3 */             return this.mWorkerParams.I0000Il00O;
                }

                public OloIli getTaskExecutor() {
/* 3 */             return this.mWorkerParams.I000O01llI0;
                }

                public final List<String> getTriggeredContentAuthorities() {
/* 7 */             return (List) this.mWorkerParams.I0000O.I00iiI;
                }

                public final List<Uri> getTriggeredContentUris() {
/* 7 */             return (List) this.mWorkerParams.I0000O.I00iiO;
                }

                public i01i10I1Io1 getWorkerFactory() {
/* 3 */             return this.mWorkerParams.I000OOo1O;
                }

                public final boolean isStopped() {
                    return this.mStopReason.get() != -256;
                }

                public final boolean isUsed() {
/* 1 */             return this.mUsed;
                }

                public final ListenableFuture setForegroundAsync(IliliOOliOi ililiOOliOi) {
/* 13 */            return this.mWorkerParams.I000iOII.I00000oIO(getApplicationContext(), getId(), ililiOOliOi);
                }

                public ListenableFuture setProgressAsync(Ii11I1OOII1 ii11I1OOII1) {
/* 13 */            return this.mWorkerParams.I000OiO.I0000Il00O(getApplicationContext(), getId(), ii11I1OOII1);
                }

                public final void setUsed() {
/* 2 */             this.mUsed = true;
                }

                public abstract ListenableFuture startWork();

                public final void stop(int i) {
/* 9 */             if (this.mStopReason.compareAndSet(-256, i)) {
/* 11 */                onStopped();
                    }
                }

/* 19 */        public void onStopped() {
                }
            }
