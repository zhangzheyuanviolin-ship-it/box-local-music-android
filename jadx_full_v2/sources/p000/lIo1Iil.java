            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.os.PersistableBundle;
            
            public final class lIo1Iil extends iolOI0li {
                public JobScheduler I00iiO;

                @Override
                public final boolean I010iIIOlo() {
/* 1 */             return true;
                }

                public final void I010ioo(long j) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010OIo1l();
/* 8 */             I010II();
/* 11 */            JobScheduler jobScheduler = this.I00iiO;
/* 15 */            if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(l0olllo1i.I00iOIl.getPackageName())).hashCode()) != null) {
/* 41 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 43 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 50 */                l01o0io1ooo0.I00lll10.I00000oOI("[sgtm] There's an existing pending job, skip this schedule.");
/* 53 */                return;
                    }
/* 54 */            int iI010l10O = I010l10O();
/* 59 */            if (iI010l10O != 2) {
/* 172 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 174 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 185 */               l01o0io1ooo02.I00lll10.I0000Il00O("[sgtm] Not eligible for Scion upload", io1OllI.I001IIilI0O(iI010l10O));
/* 437 */               return;
                    }
/* 61 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 63 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 74 */            l01o0io1ooo03.I00lll10.I0000Il00O("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
/* 79 */            PersistableBundle persistableBundle = new PersistableBundle();
/* 86 */            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
/* 139 */           JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(l0olllo1i.I00iOIl.getPackageName())).hashCode(), new ComponentName(l0olllo1i.I00iOIl, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
/* 143 */           JobScheduler jobScheduler2 = this.I00iiO;
/* 145 */           lII0I0I000I.I000II(jobScheduler2);
/* 148 */           int iSchedule = jobScheduler2.schedule(jobInfoBuild);
/* 152 */           l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 154 */           l0olllO1i.I000II(l01o0io1ooo04);
/* 168 */           l01o0io1ooo04.I00lll10.I0000Il00O("[sgtm] Scion upload job scheduled with result", iSchedule == 1 ? "SUCCESS" : "FAILURE");
                }

                public final int I010l10O() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010OIo1l();
/* 8 */             I010II();
/* 13 */            if (this.I00iiO == null) {
/* 75 */                return 7;
                    }
/* 19 */            Boolean boolI0110OiO = l0olllo1i.I00iio.I0110OiO("google_analytics_sgtm_upload_enabled");
/* 31 */            if (!(boolI0110OiO == null ? false : boolI0110OiO.booleanValue())) {
/* 72 */                return 8;
                    }
/* 44 */            if (l0olllo1i.I000iOII().I00l0OO0IO < 119000) {
/* 70 */                return 6;
                    }
/* 52 */            if (lioil0ilIOi.I011iIOio(l0olllo1i.I00iOIl)) {
                        return !l0olllo1i.I000OOo1O().I010l1ol111() ? 5 : 2;
                    }
/* 54 */            return 3;
                }
            }
