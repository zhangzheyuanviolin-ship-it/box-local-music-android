            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.content.Context;
            import android.net.NetworkRequest;
            import android.os.Build;
            import android.os.PersistableBundle;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.background.systemjob.SystemJobService;
            import androidx.work.impl.model.SystemIdInfo;
            import androidx.work.impl.model.WorkSpec;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            
            public final class OllOoIIli0O implements OiOI1oIoooI {
                public static final String I00ilO0 = IIi0oIl.I000OiO("SystemJobScheduler");
                public Context I00iOIl;
                public JobScheduler I00iiI;
                public OllOlli I00iiO;
                public WorkDatabase I00iio;
                public IOllii I00ilI0I1;

                public static void I00000oIO(JobScheduler jobScheduler, int i) {
                    try {
/* 1 */                 jobScheduler.cancel(i);
                    } catch (Throwable th) {
/* 30 */                IIi0oIl.I000II().I0001Ioi1lo(I00ilO0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
                    }
                }

                public static ArrayList I0000Il00O(Context context, JobScheduler jobScheduler) {
                    List<JobInfo> allPendingJobs;
/* 1 */             String str = O01110.I00000oIO;
                    try {
/* 4 */                 allPendingJobs = jobScheduler.getAllPendingJobs();
                    } catch (Throwable th) {
/* 18 */                IIi0oIl.I000II().I0001Ioi1lo(O01110.I00000oIO, "getAllPendingJobs() is not reliable on this device.", th);
/* 21 */                allPendingJobs = null;
                    }
/* 22 */            if (allPendingJobs == null) {
/* 3 */                 return null;
                    }
/* 31 */            ArrayList arrayList = new ArrayList(allPendingJobs.size());
/* 38 */            ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
/* 49 */            for (JobInfo jobInfo : allPendingJobs) {
/* 65 */                if (componentName.equals(jobInfo.getService())) {
/* 67 */                    arrayList.add(jobInfo);
                        }
                    }
/* 106 */           return arrayList;
                }

                public static i01IIlI I0001Ioi1lo(JobInfo jobInfo) {
/* 3 */             PersistableBundle extras = jobInfo.getExtras();
/* 7 */             if (extras == null) {
/* 32 */                return null;
                    }
                    try {
/* 13 */                if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
/* 32 */                    return null;
                        }
/* 28 */                return new i01IIlI(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                    } catch (NullPointerException unused) {
/* 32 */                return null;
                    }
                }

                @Override
                public final void I00000oOI(WorkSpec... workSpecArr) {
                    int iIntValue;
/* 1 */             IOllii iOllii = this.I00ilI0I1;
/* 5 */             WorkDatabase workDatabase = this.I00iio;
/* 9 */             I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(12);
/* 12 */            i0IIiO0iI.I00iiI = workDatabase;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            for (WorkSpec workSpec : workSpecArr) {
/* 23 */                workDatabase.I00000oOI();
                        try {
/* 32 */                    WorkSpec workSpec2 = workDatabase.I001lIiIIo1O().getWorkSpec(workSpec.id);
/* 38 */                    String str = I00ilO0;
/* 40 */                    if (workSpec2 == null) {
/* 68 */                        IIi0oIl.I000II().I000l1(str, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB");
/* 71 */                        workDatabase.I0010o();
                            } else if (workSpec2.state != i01IOiO1lO.I00iOIl) {
/* 112 */                       IIi0oIl.I000II().I000l1(str, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued");
/* 115 */                       workDatabase.I0010o();
                            } else {
/* 119 */                       i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(workSpec);
/* 127 */                       SystemIdInfo systemIdInfo = workDatabase.I001i1lo1io().getSystemIdInfo(i01iiliI00000oIO);
/* 131 */                       if (systemIdInfo != null) {
/* 133 */                           iIntValue = systemIdInfo.systemId;
                                } else {
/* 136 */                           int i = iOllii.I000iOII;
/* 140 */                           WorkDatabase workDatabase2 = (WorkDatabase) i0IIiO0iI.I00iiI;
/* 144 */                           IoOoiOI1IIIO ioOoiOI1IIIO = new IoOoiOI1IIIO();
/* 147 */                           ioOoiOI1IIIO.I00000oIO = i0IIiO0iI;
/* 149 */                           ioOoiOI1IIIO.I00000oOI = i;
/* 151 */                           VarHandle.storeStoreFence();
/* 160 */                           iIntValue = ((Number) workDatabase2.I00100o1O0lo(ioOoiOI1IIIO)).intValue();
                                }
/* 164 */                       if (systemIdInfo == null) {
/* 179 */                           workDatabase.I001i1lo1io().insertSystemIdInfo(new SystemIdInfo(i01iiliI00000oIO.I00000oIO, i01iiliI00000oIO.I00000oOI, iIntValue));
                                }
/* 182 */                       I000II(workSpec, iIntValue);
/* 185 */                       workDatabase.I0010o();
                            }
                        } finally {
/* 193 */                   workDatabase.I000lI();
                        }
                    }
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return true;
                }

                @Override
                public final void I0000oI00(String str) {
                    ArrayList arrayList;
/* 1 */             Context context = this.I00iOIl;
/* 3 */             JobScheduler jobScheduler = this.I00iiI;
/* 5 */             ArrayList arrayListI0000Il00O = I0000Il00O(context, jobScheduler);
/* 9 */             if (arrayListI0000Il00O == null) {
/* 11 */                arrayList = null;
                    } else {
/* 16 */                ArrayList arrayList2 = new ArrayList(2);
/* 19 */                Iterator it = arrayListI0000Il00O.iterator();
/* 27 */                while (it.hasNext()) {
/* 33 */                    JobInfo jobInfo = (JobInfo) it.next();
/* 35 */                    i01IIlI i01iiliI0001Ioi1lo = I0001Ioi1lo(jobInfo);
/* 39 */                    if (i01iiliI0001Ioi1lo != null && str.equals(i01iiliI0001Ioi1lo.I00000oIO)) {
/* 57 */                        arrayList2.add(Integer.valueOf(jobInfo.getId()));
                            }
                        }
/* 61 */                arrayList = arrayList2;
                    }
/* 62 */            if (arrayList == null || arrayList.isEmpty()) {
/* 168 */               return;
                    }
/* 70 */            Iterator it2 = arrayList.iterator();
/* 78 */            while (it2.hasNext()) {
/* 90 */                I00000oIO(jobScheduler, ((Integer) it2.next()).intValue());
                    }
/* 100 */           this.I00iio.I001i1lo1io().removeSystemIdInfo(str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000II(WorkSpec workSpec, int i) throws IOException {
                    int i2;
                    List<JobInfo> allPendingJobs;
                    String strI00IlilI0i0i;
                    String traceTag;
/* 1 */             IOllii iOllii = this.I00ilI0I1;
/* 3 */             String str = I00ilO0;
/* 5 */             OllOlli ollOlli = this.I00iiO;
/* 7 */             IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 11 */            PersistableBundle persistableBundle = new PersistableBundle();
/* 18 */            persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.id);
/* 27 */            persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
/* 36 */            persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
/* 48 */            JobInfo.Builder requiresCharging = new JobInfo.Builder(i, ollOlli.I00000oIO).setRequiresCharging(iOo0o10i1IO.I0000Il00O);
/* 52 */            boolean z = iOo0o10i1IO.I0000O;
/* 58 */            JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
/* 62 */            NetworkRequest networkRequestI00000oIO = iOo0o10i1IO.I00000oIO();
/* 68 */            if (networkRequestI00000oIO != null) {
/* 70 */                extras.setRequiredNetwork(networkRequestI00000oIO);
                    } else {
/* 74 */                OIIOlI oIIOlI = iOo0o10i1IO.I00000oIO;
/* 78 */                if (oIIOlI == OIIOlI.I00ilO0) {
/* 95 */                    extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
                        } else {
/* 99 */                    int iOrdinal = oIIOlI.ordinal();
/* 103 */                   if (iOrdinal == 0) {
/* 128 */                       i2 = 0;
                            } else if (iOrdinal != 1) {
/* 107 */                       i2 = 2;
/* 108 */                       if (iOrdinal != 2) {
/* 110 */                           i2 = 3;
/* 111 */                           if (iOrdinal != 3) {
/* 113 */                               i2 = 4;
/* 114 */                               if (iOrdinal != 4) {
/* 116 */                                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 120 */                                   oIIOlI.toString();
/* 123 */                                   iIi0oIlI000II.getClass();
/* 126 */                                   i2 = 1;
                                        }
                                    }
                                }
                            } else {
/* 126 */                       i2 = 1;
                            }
/* 129 */                   extras.setRequiredNetworkType(i2);
                        }
                    }
/* 132 */           if (!z) {
/* 145 */               extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == I1o1O1Ii1l0l.I00iiI ? 0 : 1);
                    }
/* 148 */           long jCalculateNextRunTime = workSpec.calculateNextRunTime();
/* 154 */           ollOlli.I00000oOI.getClass();
/* 164 */           long jMax = Math.max(jCalculateNextRunTime - System.currentTimeMillis(), 0L);
/* 170 */           if (jMax > 0) {
/* 172 */               extras.setMinimumLatency(jMax);
                    } else if (!workSpec.expedited && ollOlli.I0000Il00O) {
/* 184 */               extras.setImportantWhileForeground(true);
                    }
/* 191 */           if (iOo0o10i1IO.I00000oOI()) {
/* 203 */               for (IOo0iolo iOo0iolo : iOo0o10i1IO.I000OOo1O) {
/* 220 */                   extras.addTriggerContentUri(new JobInfo.TriggerContentUri(iOo0iolo.I00000oIO, iOo0iolo.I00000oOI ? 1 : 0));
                        }
/* 226 */               extras.setTriggerContentUpdateDelay(iOo0o10i1IO.I000II);
/* 231 */               extras.setTriggerContentMaxDelay(iOo0o10i1IO.I000O01llI0);
                    }
/* 234 */           extras.setPersisted(false);
/* 239 */           extras.setRequiresBatteryNotLow(iOo0o10i1IO.I0000oI00);
/* 244 */           extras.setRequiresStorageNotLow(iOo0o10i1IO.I0001Ioi1lo);
/* 253 */           Object[] objArr = workSpec.runAttemptCount > 0;
/* 258 */           Object[] objArr2 = jMax > 0;
/* 261 */           if (workSpec.expedited && objArr == false && objArr2 == false) {
/* 267 */               extras.setExpedited(true);
                    }
/* 274 */           if (Build.VERSION.SDK_INT >= 35 && (traceTag = workSpec.getTraceTag()) != null) {
/* 1 */                 extras.setTraceTag(traceTag);
                    }
/* 285 */           JobInfo jobInfoBuild = extras.build();
/* 293 */           IIi0oIl.I000II().getClass();
                    try {
/* 302 */               if (this.I00iiI.schedule(jobInfoBuild) == 0) {
/* 327 */                   IIi0oIl.I000II().I000l1(str, "Unable to schedule work ID " + workSpec.id);
/* 332 */                   if (workSpec.expedited && workSpec.outOfQuotaPolicy == OIio0Ii1Ii.I00iOIl) {
/* 340 */                       workSpec.expedited = false;
/* 346 */                       IIi0oIl.I000II().getClass();
/* 349 */                       I000II(workSpec, i);
                            }
                        }
                    } catch (IllegalStateException e) {
/* 382 */               Context context = this.I00iOIl;
/* 384 */               WorkDatabase workDatabase = this.I00iio;
/* 386 */               String str2 = O01110.I00000oIO;
/* 396 */               int size = workDatabase.I001lIiIIo1O().getScheduledWork().size();
/* 400 */               JobScheduler jobSchedulerI00000oIO = O01110.I00000oIO(context);
                        try {
/* 405 */                   allPendingJobs = jobSchedulerI00000oIO.getAllPendingJobs();
                        } catch (Throwable th) {
/* 419 */                   IIi0oIl.I000II().I0001Ioi1lo(O01110.I00000oIO, "getAllPendingJobs() is not reliable on this device.", th);
/* 422 */                   allPendingJobs = null;
                        }
/* 423 */               if (allPendingJobs != null) {
/* 425 */                   ArrayList arrayListI0000Il00O = I0000Il00O(context, jobSchedulerI00000oIO);
/* 441 */                   int size2 = arrayListI0000Il00O != null ? allPendingJobs.size() - arrayListI0000Il00O.size() : 0;
/* 459 */                   String str3 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
/* 471 */                   ArrayList arrayListI0000Il00O2 = I0000Il00O(context, (JobScheduler) context.getSystemService("jobscheduler"));
/* 477 */                   int size3 = arrayListI0000Il00O2 != null ? arrayListI0000Il00O2.size() : 0;
/* 537 */                   strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(I1IoiO1l.I001IIilI0O(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str3, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                        } else {
/* 542 */                   strI00IlilI0i0i = "<faulty JobScheduler failed to getPendingJobs>";
                        }
/* 558 */               String strI001i1lo1io = Oi010OO0.I001i1lo1io(IIlIOloOOO.I00111O(size, "JobScheduler 150 job limit exceeded.\nIn JobScheduler there are ", strI00IlilI0i0i, ".\nThere are ", " jobs tracked by WorkManager's database;\nthe Configuration limit is "), iOllii.I000lI, '.');
/* 566 */               IIi0oIl.I000II().I0000oI00(str, strI001i1lo1io);
/* 569 */               IoOOl0iOl1io.I000l1(strI001i1lo1io, e);
                    } catch (Throwable th2) {
/* 378 */               IIi0oIl.I000II().I0001Ioi1lo(str, "Unable to schedule " + workSpec, th2);
                    }
                }
            }
