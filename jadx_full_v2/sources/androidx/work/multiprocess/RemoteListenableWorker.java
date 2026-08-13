            package androidx.work.multiprocess;

            import android.content.Context;
            import androidx.work.WorkerParameters;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import p000.IIi0oIl;
            import p000.O10oIiIi0OI0;
            import p000.iOiiloIII0O;
            
            public abstract class RemoteListenableWorker extends O10oIiIi0OI0 {
                public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
                public static final String ARGUMENT_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
                static final String TAG = IIi0oIl.I000OiO("RemoteListenableWorker");

                public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
                }

                public abstract ListenableFuture startRemoteWork();

                @Override
                public final ListenableFuture startWork() {
/* 3 */             I00000oIO i00000oIO = new I00000oIO();
/* 6 */             VarHandle.storeStoreFence();
/* 9 */             return iOiiloIII0O.I00000oIO(i00000oIO);
                }
            }
