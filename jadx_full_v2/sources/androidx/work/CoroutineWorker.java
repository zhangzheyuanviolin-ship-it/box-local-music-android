            package androidx.work;

            import android.content.Context;
            import com.google.common.util.concurrent.ListenableFuture;
            import kotlin.Metadata;
            import p000.IOoilo;
            import p000.Ii00l101O;
            import p000.Ii01O0O;
            import p000.Ii01O1;
            import p000.O0000Ioio00;
            import p000.O010loOOi0Oo;
            import p000.O10oIiIi0OI0;
            import p000.iiollilo0IO1;
            import p000.l01oO1iOo;
            import p000.l10o11O01o1;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "LO10oIiIi0OI0;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ii01O0O", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
/* 18 */    public abstract class CoroutineWorker extends O10oIiIi0OI0 {
                public final WorkerParameters I00000oIO;
                public final Ii01O0O I00000oOI;

                public CoroutineWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
/* 4 */             this.I00000oIO = workerParameters;
/* 8 */             this.I00000oOI = Ii01O0O.I00iiI;
                }

                public abstract Object I00000oIO(IOoilo iOoilo);

                public Object I00000oOI() {
/* 20 */            throw new IllegalStateException("Not implemented");
                }

                @Override
                public final ListenableFuture getForegroundInfoAsync() {
/* 1 */             O010loOOi0Oo o010loOOi0OoI00000oIO = l01oO1iOo.I00000oIO();
/* 5 */             Ii01O0O ii01O0O = this.I00000oOI;
/* 7 */             ii01O0O.getClass();
/* 21 */            return l10o11O01o1.I00000oOI(iiollilo0IO1.I00000oIO(ii01O0O, o010loOOi0OoI00000oIO), new Ii01O1(this, null, 0));
                }

                @Override
                public final ListenableFuture startWork() {
/* 1 */             Ii01O0O ii01O0O = Ii01O0O.I00iiI;
/* 3 */             Ii00l101O ii00l101O = this.I00000oOI;
/* 9 */             if (O0000Ioio00.I0000O(ii00l101O, ii01O0O)) {
/* 14 */                ii00l101O = this.I00000oIO.I000II;
                    }
/* 31 */            return l10o11O01o1.I00000oOI(ii00l101O.I00ioIO(l01oO1iOo.I00000oIO()), new Ii01O1(this, null, 1));
                }

                @Override
/* 19 */        public final void onStopped() {
                }
            }
