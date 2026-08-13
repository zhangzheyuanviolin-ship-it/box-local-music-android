            package androidx.work.impl.background.systemjob;

            import android.app.Application;
            import android.app.job.JobParameters;
            import android.app.job.JobService;
            import android.os.Looper;
            import android.os.PersistableBundle;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import p000.I000II;
            import p000.IIi0oIl;
            import p000.IIloOI;
            import p000.Il11ii;
            import p000.IlIi0I0;
            import p000.IoOOl0iOl1io;
            import p000.OOIo1i0;
            import p000.OlO0000lIOII;
            import p000.OlilOlOiI;
            import p000.i000IO;
            import p000.i01IIlI;
            import p000.i01IlOO;
            
            public class SystemJobService extends JobService implements Il11ii {
                public static final String I00ilI0I1 = IIi0oIl.I000OiO("SystemJobService");
                public i01IlOO I00iOIl;
                public final HashMap I00iiI = new HashMap();
                public final IIloOI I00iiO;
                public i000IO I00iio;

                public SystemJobService() {
/* 15 */            IIloOI iIloOI = new IIloOI(26);
/* 23 */            iIloOI.I00iiI = new LinkedHashMap();
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            this.I00iiO = iIloOI;
                }

                public static void I00000oIO(String str) {
/* 13 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 15 */                return;
                    }
/* 24 */            I000II.I001IO000(IlIi0I0.I000lI("Cannot invoke ", str, " on a background thread"));
                }

                public static i01IIlI I00000oOI(JobParameters jobParameters) {
                    try {
/* 3 */                 PersistableBundle extras = jobParameters.getExtras();
/* 7 */                 if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
/* 31 */                    return null;
                        }
/* 27 */                return new i01IIlI(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                    } catch (NullPointerException unused) {
/* 31 */                return null;
                    }
                }

                @Override
                public final void I0000Il00O(i01IIlI i01iili, boolean z) {
/* 3 */             I00000oIO("onExecuted");
/* 6 */             IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 10 */            String str = i01iili.I00000oIO;
/* 12 */            iIi0oIlI000II.getClass();
/* 21 */            JobParameters jobParameters = (JobParameters) this.I00iiI.remove(i01iili);
/* 25 */            this.I00iiO.I00O0i0ii(i01iili);
/* 28 */            if (jobParameters != null) {
/* 30 */                jobFinished(jobParameters, z);
                    }
                }

                @Override
                public final void onCreate() {
/* 1 */             super.onCreate();
                    try {
/* 8 */                 i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(getApplicationContext());
/* 12 */                this.I00iOIl = i01ilooI00000oOI;
/* 14 */                OOIo1i0 oOIo1i0 = i01ilooI00000oOI.I0001Ioi1lo;
/* 24 */                this.I00iio = new i000IO(1, oOIo1i0, i01ilooI00000oOI.I0000O);
/* 26 */                oOIo1i0.I00000oIO(this);
                    } catch (IllegalStateException e) {
/* 45 */                if (Application.class.equals(getApplication().getClass())) {
/* 55 */                    IIi0oIl.I000II().I000l1(I00ilI0I1, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                        } else {
/* 61 */                    IoOOl0iOl1io.I000l1("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                        }
                    }
                }

                @Override
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 4 */             i01IlOO i01iloo = this.I00iOIl;
/* 6 */             if (i01iloo != null) {
/* 8 */                 OOIo1i0 oOIo1i0 = i01iloo.I0001Ioi1lo;
                        synchronized (oOIo1i0.I000iOII) {
/* 15 */                    oOIo1i0.I000OiO.remove(this);
                        }
                    }
                }

                @Override
                public final boolean onStartJob(JobParameters jobParameters) {
/* 3 */             I00000oIO("onStartJob");
/* 10 */            if (this.I00iOIl == null) {
/* 16 */                IIi0oIl.I000II().getClass();
/* 19 */                jobFinished(jobParameters, true);
/* 9 */                 return false;
                    }
/* 23 */            i01IIlI i01iiliI00000oOI = I00000oOI(jobParameters);
/* 27 */            if (i01iiliI00000oOI == null) {
/* 37 */                IIi0oIl.I000II().I0000oI00(I00ilI0I1, "WorkSpec id not found!");
/* 9 */                 return false;
                    }
/* 41 */            HashMap map = this.I00iiI;
/* 47 */            if (map.containsKey(i01iiliI00000oOI)) {
/* 49 */                IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 53 */                i01iiliI00000oOI.toString();
/* 56 */                iIi0oIlI000II.getClass();
/* 9 */                 return false;
                    }
/* 60 */            IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 64 */            i01iiliI00000oOI.toString();
/* 67 */            iIi0oIlI000II2.getClass();
/* 70 */            map.put(i01iiliI00000oOI, jobParameters);
/* 75 */            OlilOlOiI olilOlOiI = new OlilOlOiI();
/* 82 */            if (jobParameters.getTriggeredContentUris() != null) {
/* 92 */                olilOlOiI.I00iiO = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
/* 98 */            if (jobParameters.getTriggeredContentAuthorities() != null) {
/* 108 */               olilOlOiI.I00iiI = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
/* 114 */           olilOlOiI.I00iio = jobParameters.getNetwork();
/* 124 */           this.I00iio.I0000O(this.I00iiO.I00OIO1(i01iiliI00000oOI), olilOlOiI);
/* 8 */             return true;
                }

                @Override
                public final boolean onStopJob(JobParameters jobParameters) {
                    boolean zContains;
/* 3 */             I00000oIO("onStopJob");
/* 9 */             if (this.I00iOIl == null) {
/* 15 */                IIi0oIl.I000II().getClass();
/* 8 */                 return true;
                    }
/* 19 */            i01IIlI i01iiliI00000oOI = I00000oOI(jobParameters);
/* 23 */            if (i01iiliI00000oOI == null) {
/* 33 */                IIi0oIl.I000II().I0000oI00(I00ilI0I1, "WorkSpec id not found!");
/* 36 */                return false;
                    }
/* 38 */            IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 42 */            i01iiliI00000oOI.toString();
/* 45 */            iIi0oIlI000II.getClass();
/* 50 */            this.I00iiI.remove(i01iiliI00000oOI);
/* 55 */            OlO0000lIOII olO0000lIOIII00O0i0ii = this.I00iiO.I00O0i0ii(i01iiliI00000oOI);
/* 59 */            if (olO0000lIOIII00O0i0ii != null) {
/* 61 */                int stopReason = jobParameters.getStopReason();
                        switch (stopReason) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                break;
                            default:
/* 68 */                        stopReason = -512;
                                break;
                        }
/* 72 */                this.I00iio.I0000oI00(olO0000lIOIII00O0i0ii, stopReason);
                    }
/* 77 */            OOIo1i0 oOIo1i0 = this.I00iOIl.I0001Ioi1lo;
/* 79 */            String str = i01iiliI00000oOI.I00000oIO;
                    synchronized (oOIo1i0.I000iOII) {
/* 86 */                zContains = oOIo1i0.I000OOo1O.contains(str);
                    }
/* 91 */            return !zContains;
                }
            }
