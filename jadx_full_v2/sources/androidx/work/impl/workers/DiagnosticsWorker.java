            package androidx.work.impl.workers;

            import android.content.Context;
            import androidx.work.Worker;
            import androidx.work.WorkerParameters;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.SystemIdInfoDao;
            import androidx.work.impl.model.WorkNameDao;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import androidx.work.impl.model.WorkTagDao;
            import java.util.List;
            import kotlin.Metadata;
            import p000.IIi0oIl;
            import p000.Ii11I1OOII1;
            import p000.IiOooOI;
            import p000.O10o0oOio1;
            import p000.O10oI0l1;
            import p000.i01IlOO;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class DiagnosticsWorker extends Worker {
                public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
                }

                @Override
                public final O10oI0l1 I00000oIO() {
/* 5 */             i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(getApplicationContext());
/* 9 */             WorkDatabase workDatabase = i01ilooI00000oOI.I0000Il00O;
/* 11 */            WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 15 */            WorkNameDao workNameDaoI001iOo1i0O = workDatabase.I001iOo1i0O();
/* 19 */            WorkTagDao workTagDaoI001lllioOl = workDatabase.I001lllioOl();
/* 23 */            SystemIdInfoDao systemIdInfoDaoI001i1lo1io = workDatabase.I001i1lo1io();
/* 31 */            i01ilooI00000oOI.I00000oOI.I0000O.getClass();
/* 42 */            List<WorkSpec> recentlyCompletedWork = workSpecDaoI001lIiIIo1O.getRecentlyCompletedWork(System.currentTimeMillis() - 86400000);
/* 46 */            List<WorkSpec> runningWork = workSpecDaoI001lIiIIo1O.getRunningWork();
/* 52 */            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDaoI001lIiIIo1O.getAllEligibleWorkSpecsForScheduling(200);
/* 63 */            if (!recentlyCompletedWork.isEmpty()) {
/* 65 */                IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 69 */                String str = IiOooOI.I00000oIO;
/* 73 */                iIi0oIlI000II.I000OOo1O(str, "Recently completed work:\n\n");
/* 84 */                IIi0oIl.I000II().I000OOo1O(str, IiOooOI.I00000oIO(workNameDaoI001iOo1i0O, workTagDaoI001lllioOl, systemIdInfoDaoI001i1lo1io, recentlyCompletedWork));
                    }
/* 94 */            if (!runningWork.isEmpty()) {
/* 96 */                IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 100 */               String str2 = IiOooOI.I00000oIO;
/* 104 */               iIi0oIlI000II2.I000OOo1O(str2, "Running work:\n\n");
/* 115 */               IIi0oIl.I000II().I000OOo1O(str2, IiOooOI.I00000oIO(workNameDaoI001iOo1i0O, workTagDaoI001lllioOl, systemIdInfoDaoI001i1lo1io, runningWork));
                    }
/* 125 */           if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
/* 127 */               IIi0oIl iIi0oIlI000II3 = IIi0oIl.I000II();
/* 131 */               String str3 = IiOooOI.I00000oIO;
/* 135 */               iIi0oIlI000II3.I000OOo1O(str3, "Enqueued work:\n\n");
/* 146 */               IIi0oIl.I000II().I000OOo1O(str3, IiOooOI.I00000oIO(workNameDaoI001iOo1i0O, workTagDaoI001lllioOl, systemIdInfoDaoI001i1lo1io, allEligibleWorkSpecsForScheduling));
                    }
/* 153 */           return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                }
            }
