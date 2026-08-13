            package p000;

            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class OiOIOI {
                public static final int I00000oIO = 0;

                static {
/* 3 */             IIi0oIl.I000OiO("Schedulers");
                }

                public static void I00000oIO(WorkSpecDao workSpecDao, o0llIi o0llii, List list) {
/* 5 */             if (list.size() > 0) {
/* 7 */                 o0llii.getClass();
/* 10 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */                Iterator it = list.iterator();
/* 22 */                while (it.hasNext()) {
/* 32 */                    workSpecDao.markWorkSpecScheduled(((WorkSpec) it.next()).id, jCurrentTimeMillis);
                        }
                    }
                }

                public static void I00000oOI(IOllii iOllii, WorkDatabase workDatabase, List list) {
/* 1 */             if (list == null || list.size() == 0) {
/* 408 */               return;
                    }
/* 11 */            WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 15 */            workDatabase.I00000oOI();
                    try {
/* 18 */                List<WorkSpec> eligibleWorkForSchedulingWithContentUris = workSpecDaoI001lIiIIo1O.getEligibleWorkForSchedulingWithContentUris();
/* 24 */                I00000oIO(workSpecDaoI001lIiIIo1O, iOllii.I0000O, eligibleWorkForSchedulingWithContentUris);
/* 29 */                List<WorkSpec> eligibleWorkForScheduling = workSpecDaoI001lIiIIo1O.getEligibleWorkForScheduling(iOllii.I000lI);
/* 35 */                I00000oIO(workSpecDaoI001lIiIIo1O, iOllii.I0000O, eligibleWorkForScheduling);
/* 38 */                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
/* 43 */                List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDaoI001lIiIIo1O.getAllEligibleWorkSpecsForScheduling(200);
/* 47 */                workDatabase.I0010o();
/* 50 */                workDatabase.I000lI();
/* 57 */                if (eligibleWorkForScheduling.size() > 0) {
/* 69 */                    WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
/* 71 */                    Iterator it = list.iterator();
/* 79 */                    while (it.hasNext()) {
/* 85 */                        OiOI1oIoooI oiOI1oIoooI = (OiOI1oIoooI) it.next();
/* 91 */                        if (oiOI1oIoooI.I0000O()) {
/* 93 */                            oiOI1oIoooI.I00000oOI(workSpecArr);
                                }
                            }
                        }
/* 101 */               if (allEligibleWorkSpecsForScheduling.size() > 0) {
/* 113 */                   WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
/* 115 */                   Iterator it2 = list.iterator();
/* 123 */                   while (it2.hasNext()) {
/* 129 */                       OiOI1oIoooI oiOI1oIoooI2 = (OiOI1oIoooI) it2.next();
/* 135 */                       if (!oiOI1oIoooI2.I0000O()) {
/* 137 */                           oiOI1oIoooI2.I00000oOI(workSpecArr2);
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 142 */               workDatabase.I000lI();
/* 145 */               throw th;
                    }
                }
            }
