            package p000;

            import android.app.ActivityManager;
            import android.app.ApplicationExitInfo;
            import android.app.PendingIntent;
            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.database.sqlite.SQLiteAccessPermException;
            import android.database.sqlite.SQLiteCantOpenDatabaseException;
            import android.database.sqlite.SQLiteConstraintException;
            import android.database.sqlite.SQLiteDatabaseCorruptException;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteDiskIOException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteFullException;
            import android.database.sqlite.SQLiteTableLockedException;
            import android.text.TextUtils;
            import android.util.Log;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.Preference;
            import androidx.work.impl.model.WorkProgressDao;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IliliO1llI implements Runnable {
                public static final String I00ilI0I1 = IIi0oIl.I000OiO("ForceStopRunnable");
                public static final long I00ilO0 = 315360000000L;
                public Context I00iOIl;
                public i01IlOO I00iiI;
                public Oi00IilOloo0 I00iiO;
                public int I00iio;

                /* JADX WARN: Finally extract failed */
                public final void I00000oIO() {
                    boolean z;
                    List<ApplicationExitInfo> historicalProcessExitReasons;
/* 5 */             Oi00IilOloo0 oi00IilOloo0 = this.I00iiO;
/* 7 */             Context context = this.I00iOIl;
/* 9 */             i01IlOO i01iloo = this.I00iiI;
/* 11 */            IOllii iOllii = i01iloo.I00000oOI;
/* 13 */            Oi00IilOloo0 oi00IilOloo02 = i01iloo.I000II;
/* 15 */            WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 17 */            String str = OllOoIIli0O.I00ilO0;
/* 19 */            JobScheduler jobSchedulerI00000oIO = O01110.I00000oIO(context);
/* 23 */            ArrayList arrayListI0000Il00O = OllOoIIli0O.I0000Il00O(context, jobSchedulerI00000oIO);
/* 31 */            List<String> workSpecIds = workDatabase.I001i1lo1io().getWorkSpecIds();
/* 45 */            HashSet hashSet = new HashSet(arrayListI0000Il00O != null ? arrayListI0000Il00O.size() : 0);
/* 48 */            if (arrayListI0000Il00O != null && !arrayListI0000Il00O.isEmpty()) {
/* 56 */                Iterator it = arrayListI0000Il00O.iterator();
/* 64 */                while (it.hasNext()) {
/* 70 */                    JobInfo jobInfo = (JobInfo) it.next();
/* 72 */                    i01IIlI i01iiliI0001Ioi1lo = OllOoIIli0O.I0001Ioi1lo(jobInfo);
/* 76 */                    if (i01iiliI0001Ioi1lo != null) {
/* 80 */                        hashSet.add(i01iiliI0001Ioi1lo.I00000oIO);
                            } else {
/* 88 */                        OllOoIIli0O.I00000oIO(jobSchedulerI00000oIO, jobInfo.getId());
                            }
                        }
                    }
/* 92 */            Iterator<String> it2 = workSpecIds.iterator();
                    while (true) {
/* 100 */               if (it2.hasNext()) {
/* 112 */                   if (!hashSet.contains(it2.next())) {
/* 118 */                       IIi0oIl.I000II().getClass();
/* 121 */                       z = true;
                                break;
                            }
                        } else {
/* 123 */                   z = false;
                            break;
                        }
                    }
/* 126 */           if (z) {
/* 128 */               workDatabase.I00000oOI();
                        try {
/* 131 */                   WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 135 */                   Iterator<String> it3 = workSpecIds.iterator();
/* 143 */                   while (it3.hasNext()) {
/* 151 */                       workSpecDaoI001lIiIIo1O.markWorkSpecScheduled(it3.next(), -1L);
                            }
/* 157 */                   workDatabase.I0010o();
/* 160 */                   workDatabase.I000lI();
                        } catch (Throwable th) {
/* 167 */                   throw th;
                        }
                    }
/* 168 */           WorkSpecDao workSpecDaoI001lIiIIo1O2 = workDatabase.I001lIiIIo1O();
/* 172 */           WorkProgressDao workProgressDaoI001l0I00 = workDatabase.I001l0I00();
/* 176 */           workDatabase.I00000oOI();
                    try {
/* 179 */               List<WorkSpec> runningWork = workSpecDaoI001lIiIIo1O2.getRunningWork();
/* 196 */               boolean z2 = (runningWork == null || runningWork.isEmpty()) ? false : true;
/* 197 */               if (z2) {
/* 207 */                   for (WorkSpec workSpec : runningWork) {
/* 221 */                       workSpecDaoI001lIiIIo1O2.setState(i01IOiO1lO.I00iOIl, workSpec.id);
/* 228 */                       workSpecDaoI001lIiIIo1O2.setStopReason(workSpec.id, -512);
/* 235 */                       workSpecDaoI001lIiIIo1O2.markWorkSpecScheduled(workSpec.id, -1L);
                            }
                        }
/* 240 */               workProgressDaoI001l0I00.deleteAll();
/* 243 */               workDatabase.I0010o();
/* 246 */               workDatabase.I000lI();
/* 256 */               boolean z3 = z2 || z;
/* 267 */               Long longValue = ((WorkDatabase) oi00IilOloo02.I00iOIl).I001IO000().getLongValue("reschedule_needed");
/* 271 */               if (longValue != null && longValue.longValue() == 1) {
/* 287 */                   IIi0oIl.I000II().getClass();
/* 290 */                   i01iloo.I000II();
/* 293 */                   oi00IilOloo02.getClass();
/* 310 */                   ((WorkDatabase) oi00IilOloo02.I00iOIl).I001IO000().insertPreference(new Preference("reschedule_needed", false));
/* 313 */                   return;
                        }
                        try {
/* 316 */                   Intent intent = new Intent();
/* 326 */                   intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
/* 331 */                   intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
/* 337 */                   PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 570425344);
/* 341 */                   if (broadcast != null) {
/* 343 */                       broadcast.cancel();
                            }
/* 359 */                   historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        } catch (IllegalArgumentException | SecurityException e) {
/* 447 */                   if (IIi0oIl.I000II().I00iOIl <= 5) {
/* 453 */                       Log.w(I00ilI0I1, "Ignoring exception", e);
                            }
                        }
/* 363 */               if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
/* 379 */                   Long longValue2 = ((WorkDatabase) oi00IilOloo0.I00iOIl).I001IO000().getLongValue("last_force_stop_ms");
/* 390 */                   long jLongValue = longValue2 != null ? longValue2.longValue() : 0L;
/* 397 */                   for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
/* 399 */                       ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i);
/* 411 */                       if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
/* 460 */                           IIi0oIl.I000II().getClass();
/* 463 */                           i01iloo.I000II();
/* 468 */                           iOllii.I0000O.getClass();
/* 471 */                           long jCurrentTimeMillis = System.currentTimeMillis();
/* 475 */                           oi00IilOloo0.getClass();
/* 495 */                           ((WorkDatabase) oi00IilOloo0.I00iOIl).I001IO000().insertPreference(new Preference("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
/* 498 */                           return;
                                }
                            }
                        }
/* 425 */               if (z3) {
/* 431 */                   IIi0oIl.I000II().getClass();
/* 436 */                   OiOIOI.I00000oOI(iOllii, workDatabase, i01iloo.I0000oI00);
                        }
                    } finally {
/* 499 */               workDatabase.I000lI();
                    }
                }

                @Override
                public final void run() {
                    boolean zI00000oIO;
/* 1 */             String str = I00ilI0I1;
/* 3 */             Context context = this.I00iOIl;
/* 5 */             i01IlOO i01iloo = this.I00iiI;
/* 7 */             IOllii iOllii = i01iloo.I00000oOI;
                    try {
/* 16 */                if (TextUtils.isEmpty(iOllii.I000O01llI0)) {
/* 22 */                    IIi0oIl.I000II().getClass();
/* 25 */                    zI00000oIO = true;
                        } else {
/* 27 */                    zI00000oIO = OOIloi.I00000oIO(context, iOllii);
/* 35 */                    IIi0oIl.I000II().getClass();
                        }
/* 38 */                if (!zI00000oIO) {
/* 43 */                    return;
                        }
                        while (true) {
                            try {
/* 44 */                        liIO1liI.I00000oIO(context);
/* 51 */                        IIi0oIl.I000II().getClass();
                                try {
/* 54 */                            I00000oIO();
/* 60 */                            return;
                                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
/* 66 */                            int i = this.I00iio + 1;
/* 67 */                            this.I00iio = i;
/* 70 */                            if (i >= 3) {
/* 81 */                                String str2 = li0O01lloo01.I00000oIO(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
/* 87 */                                IIi0oIl.I000II().I0001Ioi1lo(str, str2, e);
/* 92 */                                IllegalStateException illegalStateException = new IllegalStateException(str2, e);
/* 95 */                                iOllii.getClass();
/* 98 */                                throw illegalStateException;
                                    }
/* 103 */                           IIi0oIl.I000II().getClass();
                                    try {
/* 112 */                               Thread.sleep(this.I00iio * 300);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            } catch (SQLiteException e2) {
/* 123 */                       IIi0oIl.I000II().I0000oI00(str, "Unexpected SQLite exception during migrations");
/* 128 */                       IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
/* 131 */                       iOllii.getClass();
/* 134 */                       throw illegalStateException2;
                            }
                        }
                    } finally {
/* 135 */               i01iloo.I0001Ioi1lo();
                    }
                }
            }
