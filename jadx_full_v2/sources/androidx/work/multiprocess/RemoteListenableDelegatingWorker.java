            package androidx.work.multiprocess;

            import android.content.ComponentName;
            import android.content.Context;
            import androidx.work.WorkerParameters;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            import kotlin.Metadata;
            import p000.I0IOIlIOIII;
            import p000.IOO01l00ol;
            import p000.Ii00lIOoi;
            import p000.O10oIiIi0OI0;
            import p000.O10oOoo101iO;
            import p000.Oi000I;
            import p000.OillOo0;
            import p000.Oll101;
            import p000.i01IlOO;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;", "LO10oIiIi0OI0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-multiprocess_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class RemoteListenableDelegatingWorker extends O10oIiIi0OI0 {
                public final Context I00000oIO;
                public final WorkerParameters I00000oOI;
                public final O10oOoo101iO I0000Il00O;
                public ComponentName I0000O;

                public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
/* 4 */             this.I00000oIO = context;
/* 6 */             this.I00000oOI = workerParameters;
/* 10 */            ExecutorService executorService = workerParameters.I0001Ioi1lo;
/* 12 */            O10oOoo101iO o10oOoo101iO = new O10oOoo101iO();
/* 15 */            o10oOoo101iO.I00000oIO = context;
/* 17 */            o10oOoo101iO.I00000oOI = executorService;
/* 24 */            o10oOoo101iO.I0000Il00O = new Object();
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            this.I0000Il00O = o10oOoo101iO;
                }

                @Override
                public final ListenableFuture getForegroundInfoAsync() {
/* 17 */            Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((OillOo0) i01IlOO.I00000oOI(this.I00000oIO.getApplicationContext()).I0000O).I00iiO;
/* 19 */            IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 29 */            return Oll101.I00000oIO(ii00lIOoi, true, new Oi000I(this, null, this, 0));
                }

                @Override
                public final void onStopped() {
/* 1 */             ComponentName componentName = this.I0000O;
/* 3 */             if (componentName != null) {
/* 9 */                 I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(24);
/* 12 */                i0IOIlIOIII.I00iiI = this;
/* 14 */                VarHandle.storeStoreFence();
/* 19 */                this.I0000Il00O.I00000oIO(componentName, i0IOIlIOIII);
                    }
                }

                @Override
                public final ListenableFuture startWork() {
/* 17 */            Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((OillOo0) i01IlOO.I00000oOI(this.I00000oIO.getApplicationContext()).I0000O).I00iiO;
/* 19 */            IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 28 */            return Oll101.I00000oIO(ii00lIOoi, true, new Oi000I(this, null, this, 1));
                }
            }
