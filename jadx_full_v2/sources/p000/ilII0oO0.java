            package p000;

            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.multiprocess.RemoteListenableWorker;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class ilII0oO0 {
                public static final void I00000oIO(WorkDatabase workDatabase, IOllii iOllii, i01I0IOOI10 i01i0iooi10) {
                    int i;
/* 5 */             ArrayList arrayListI000OiO = IOOi1I.I000OiO(i01i0iooi10);
/* 10 */            int i2 = 0;
/* 15 */            while (!arrayListI000OiO.isEmpty()) {
/* 21 */                i01I0IOOI10 i01i0iooi102 = (i01I0IOOI10) IOOii0O10Io0.I00111O(arrayListI000OiO);
/* 23 */                List list = i01i0iooi102.I0000O;
/* 29 */                if ((list instanceof Collection) && list.isEmpty()) {
/* 40 */                    i = 0;
                        } else {
/* 42 */                    Iterator it = list.iterator();
/* 46 */                    i = 0;
/* 51 */                    while (it.hasNext()) {
/* 67 */                        if (((i01OOII) it.next()).I00000oOI.constraints.I00000oOI() && (i = i + 1) < 0) {
/* 74 */                            IOOi1I.I000l1();
/* 78 */                            throw null;
                                }
                            }
                        }
/* 79 */                i2 += i;
/* 80 */                List list2 = i01i0iooi102.I000II;
/* 82 */                if (list2 != null) {
/* 86 */                    arrayListI000OiO.addAll(list2);
                        }
                    }
/* 90 */            if (i2 == 0) {
/* 107 */               return;
                    }
/* 97 */            int iCountNonFinishedContentUriTriggerWorkers = workDatabase.I001lIiIIo1O().countNonFinishedContentUriTriggerWorkers();
/* 101 */           int i3 = iOllii.I000l1;
/* 105 */           if (iCountNonFinishedContentUriTriggerWorkers + i2 <= i3) {
/* 107 */               return;
                    }
/* 124 */           I000II.I000iOII(IIl001iO0Io.I000lI(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", IIl001iO0Io.I0010I0i("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i3, ";\nalready enqueued count: ", iCountNonFinishedContentUriTriggerWorkers, ";\ncurrent enqueue operation count: ")));
                }

                public static final WorkSpec I00000oOI(WorkSpec workSpec) {
/* 7 */             boolean zI0000oI00 = workSpec.input.I0000oI00("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
/* 15 */            boolean zI0000oI002 = workSpec.input.I0000oI00("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
/* 23 */            boolean zI0000oI003 = workSpec.input.I0000oI00(RemoteListenableWorker.ARGUMENT_CLASS_NAME);
/* 27 */            if (zI0000oI00 || !zI0000oI002 || !zI0000oI003) {
/* 168 */               return workSpec;
                    }
/* 33 */            String str = workSpec.workerClassName;
/* 37 */            Ii11I0l ii11I0l = new Ii11I0l();
/* 40 */            LinkedHashMap linkedHashMap = ii11I0l.I00000oIO;
/* 46 */            ii11I0l.I00000oIO(workSpec.input.I00000oIO);
/* 49 */            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
/* 54 */            Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 57 */            il01ool0o.I0000Il00O(ii11I1OOII1);
/* 107 */           return WorkSpec.copy$default(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, ii11I1OOII1, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
                }
            }
