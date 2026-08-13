            package androidx.work;

            import android.content.Context;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import kotlin.Metadata;
            import p000.IIoIil;
            import p000.IliliOOliOi;
            import p000.O10oI0l1;
            import p000.O10oIiIi0OI0;
            import p000.i01i0iliIOl;
            import p000.iOiiloIII0O;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "LO10oIiIi0OI0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public abstract class Worker extends O10oIiIi0OI0 {
                public Worker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
                }

                public abstract O10oI0l1 I00000oIO();

                public IliliOOliOi I00000oOI() {
/* 20 */            throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
                }

                @Override
                public final ListenableFuture getForegroundInfoAsync() {
/* 1 */             Executor backgroundExecutor = getBackgroundExecutor();
/* 8 */             i01i0iliIOl i01i0iliiol = new i01i0iliIOl(0);
/* 11 */            i01i0iliiol.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            IIoIil iIoIil = new IIoIil(24);
/* 23 */            iIoIil.I00iiI = backgroundExecutor;
/* 25 */            iIoIil.I00iiO = i01i0iliiol;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            return iOiiloIII0O.I00000oIO(iIoIil);
                }

                @Override
                public final ListenableFuture startWork() {
/* 1 */             Executor backgroundExecutor = getBackgroundExecutor();
/* 8 */             i01i0iliIOl i01i0iliiol = new i01i0iliIOl(1);
/* 11 */            i01i0iliiol.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            IIoIil iIoIil = new IIoIil(24);
/* 23 */            iIoIil.I00iiI = backgroundExecutor;
/* 25 */            iIoIil.I00iiO = i01i0iliiol;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            return iOiiloIII0O.I00000oIO(iIoIil);
                }
            }
