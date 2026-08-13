            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.os.Trace;
            import androidx.work.impl.WorkDatabase;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.UUID;
            
            public final class i01IlOO {
                public static i01IlOO I000l1;
                public static i01IlOO I000lI;
                public static final Object I000o00OoI0I;
                public Context I00000oIO;
                public IOllii I00000oOI;
                public WorkDatabase I0000Il00O;
                public OloIli I0000O;
                public List I0000oI00;
                public OOIo1i0 I0001Ioi1lo;
                public Oi00IilOloo0 I000II;
                public boolean I000O01llI0;
                public BroadcastReceiver.PendingResult I000OOo1O;
                public volatile Oi00O10io I000OiO;
                public OillOo0 I000iOII;

                static {
/* 3 */             IIi0oIl.I000OiO("WorkManagerImpl");
/* 7 */             I000l1 = null;
/* 9 */             I000lI = null;
/* 16 */            I000o00OoI0I = new Object();
                }

                public static i01IlOO I00000oOI(Context context) {
                    i01IlOO i01iloo;
/* 1 */             Object obj = I000o00OoI0I;
                    synchronized (obj) {
                        try {
                            synchronized (obj) {
/* 5 */                         i01iloo = I000l1;
/* 7 */                         if (i01iloo == null) {
/* 13 */                            i01iloo = I000lI;
                                }
                            }
/* 19 */                    return i01iloo;
                        } catch (Throwable th) {
/* 34 */                    throw th;
                        } finally {
                        }
                    }
/* 16 */            if (i01iloo != null) {
/* 19 */                return i01iloo;
                    }
/* 22 */            context.getApplicationContext();
/* 32 */            throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }

                public static void I0000oI00(Context context, IOllii iOllii) {
                    synchronized (I000o00OoI0I) {
                        try {
/* 4 */                     i01IlOO i01iloo = I000l1;
/* 6 */                     if (i01iloo != null && I000lI != null) {
/* 20 */                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                            }
/* 23 */                    if (i01iloo == null) {
/* 25 */                        Context applicationContext = context.getApplicationContext();
/* 29 */                        i01IlOO i01ilooI0000oI00 = I000lI;
/* 31 */                        if (i01ilooI0000oI00 == null) {
/* 33 */                            i01ilooI0000oI00 = i01IoIoO00oO.I0000oI00(applicationContext, iOllii);
/* 37 */                            I000lI = i01ilooI0000oI00;
                                }
/* 39 */                        I000l1 = i01ilooI0000oI00;
                            }
                        } finally {
                        }
                    }
                }

                public final IIloOI I00000oIO(String str) {
/* 3 */             O1oO0lOoI1 o1oO0lOoI1 = this.I00000oOI.I000oI1ioi;
/* 7 */             String strConcat = "CancelWorkByTag_".concat(str);
/* 17 */            OilOol oilOol = (OilOol) ((OillOo0) this.I0000O).I00iiI;
/* 22 */            IIoOlIoO iIoOlIoO = new IIoOlIoO(0);
/* 25 */            iIoOlIoO.I00iiO = this;
/* 27 */            iIoOlIoO.I00iiI = str;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            return l1l1IO0Ii.I00000oIO(o1oO0lOoI1, strConcat, oilOol, iIoOlIoO);
                }

                public final O1ii11 I0000Il00O(UUID uuid) {
/* 15 */            O110lI workStatusPojoLiveDataForIds = this.I0000Il00O.I001lIiIIo1O().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString()));
/* 23 */            o0iOli o0ioli = new o0iOli(16);
/* 26 */            OloIli oloIli = this.I0000O;
/* 30 */            Object obj = new Object();
/* 35 */            O1ii11 o1ii11 = new O1ii11();
/* 40 */            OiIi1OI oiIi1OI = new OiIi1OI();
/* 43 */            o1ii11.I000l1 = oiIi1OI;
/* 47 */            O110oO o110oO = new O110oO();
/* 50 */            o110oO.I00iiI = oloIli;
/* 52 */            o110oO.I00iiO = obj;
/* 54 */            o110oO.I00iio = o0ioli;
/* 56 */            o110oO.I00ilI0I1 = o1ii11;
/* 59 */            o110oO.I00iOIl = null;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            if (workStatusPojoLiveDataForIds == null) {
/* 113 */               IOOlIIilOl0.I000II("source cannot be null");
/* 58 */                return null;
                    }
/* 68 */            O1ii10Iil1O o1ii10Iil1O = new O1ii10Iil1O();
/* 72 */            o1ii10Iil1O.I00iiO = -1;
/* 74 */            o1ii10Iil1O.I00iOIl = workStatusPojoLiveDataForIds;
/* 76 */            o1ii10Iil1O.I00iiI = o110oO;
/* 78 */            VarHandle.storeStoreFence();
/* 85 */            O1ii10Iil1O o1ii10Iil1O2 = (O1ii10Iil1O) oiIi1OI.I00000oOI(workStatusPojoLiveDataForIds, o1ii10Iil1O);
/* 87 */            if (o1ii10Iil1O2 != null && o1ii10Iil1O2.I00iiI != o110oO) {
/* 96 */                I000II.I000iOII("This source was already added with the different observer");
/* 58 */                return null;
                    }
/* 100 */           if (o1ii10Iil1O2 == null && o1ii11.I0000Il00O > 0) {
/* 107 */               workStatusPojoLiveDataForIds.I0001Ioi1lo(o1ii10Iil1O);
                    }
/* 110 */           return o1ii11;
                }

                public final IIiOiI0il I0000O(O0i0I0 o0i0I0) {
/* 1 */             WorkDatabase workDatabase = this.I0000Il00O;
/* 3 */             OloIli oloIli = this.I0000O;
/* 8 */             Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(2);
/* 11 */            ol1OiIli00Ii.I00iiI = o0i0I0;
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            OilOol oilOol = (OilOol) ((OillOo0) oloIli).I00iiI;
/* 26 */            O1l110o o1l110o = new O1l110o(26);
/* 29 */            o1l110o.I00iiI = ol1OiIli00Ii;
/* 31 */            o1l110o.I00iiO = workDatabase;
/* 33 */            VarHandle.storeStoreFence();
/* 38 */            return l10o11O01o1.I00000oIO(oilOol, "loadStatusFuture", o1l110o);
                }

                public final void I0001Ioi1lo() {
                    synchronized (I000o00OoI0I) {
                        try {
/* 5 */                     this.I000O01llI0 = true;
/* 7 */                     BroadcastReceiver.PendingResult pendingResult = this.I000OOo1O;
/* 9 */                     if (pendingResult != null) {
/* 11 */                        pendingResult.finish();
/* 15 */                        this.I000OOo1O = null;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I000II() {
/* 1 */             IOllii iOllii = this.I00000oOI;
/* 3 */             O1oO0lOoI1 o1oO0lOoI1 = iOllii.I000oI1ioi;
/* 7 */             boolean zIsEnabled = Trace.isEnabled();
/* 11 */            if (zIsEnabled) {
                        try {
/* 13 */                    lOo0I0iOi11O.I00000oIO("ReschedulingWork");
                        } catch (Throwable th) {
/* 94 */                    if (zIsEnabled) {
/* 96 */                        Trace.endSection();
                            }
/* 110 */                   throw th;
                        }
                    }
/* 19 */            WorkDatabase workDatabase = this.I0000Il00O;
/* 21 */            Context context = this.I00000oIO;
/* 23 */            String str = OllOoIIli0O.I00ilO0;
/* 29 */            O01110.I00000oIO(context).cancelAll();
/* 38 */            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
/* 40 */            ArrayList arrayListI0000Il00O = OllOoIIli0O.I0000Il00O(context, jobScheduler);
/* 44 */            if (arrayListI0000Il00O != null && !arrayListI0000Il00O.isEmpty()) {
/* 52 */                Iterator it = arrayListI0000Il00O.iterator();
/* 60 */                while (it.hasNext()) {
/* 72 */                    OllOoIIli0O.I00000oIO(jobScheduler, ((JobInfo) it.next()).getId());
                        }
                    }
/* 80 */            workDatabase.I001lIiIIo1O().resetScheduledState();
/* 85 */            OiOIOI.I00000oOI(iOllii, workDatabase, this.I0000oI00);
/* 88 */            if (zIsEnabled) {
/* 90 */                Trace.endSection();
                    }
                }
            }
