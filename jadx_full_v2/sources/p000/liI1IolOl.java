            package p000;

            import android.app.AlarmManager;
            import android.app.PendingIntent;
            import android.app.job.JobScheduler;
            import android.content.Context;
            import android.content.Intent;
            
            public final class liI1IolOl extends liOO10o0 {
                public AlarmManager I00iio;
                public li0O100iO01 I00ilI0I1;
                public Integer I00ilO0;

                @Override
                public final void I010iIIOlo() {
/* 1 */             AlarmManager alarmManager = this.I00iio;
/* 3 */             if (alarmManager != null) {
/* 9 */                 Context context = ((l0olllO1i) this.I00iOIl).I00iOIl;
/* 35 */                alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
                    }
/* 38 */            I010l10O();
                }

                public final void I010ioo() {
/* 1 */             I010OIo1l();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */            l01o0io1ooo0.I00lll10.I00000oOI("Unscheduling upload");
/* 20 */            AlarmManager alarmManager = this.I00iio;
/* 22 */            if (alarmManager != null) {
/* 24 */                Context context = l0olllo1i.I00iOIl;
/* 50 */                alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
                    }
/* 53 */            li0O100iO01 li0o100io01 = this.I00ilI0I1;
/* 55 */            if (li0o100io01 == null) {
/* 64 */                li0O100iO01 li0o100io012 = new li0O100iO01(this, this.I00iiI.I00ll1, 1);
/* 67 */                this.I00ilI0I1 = li0o100io012;
/* 69 */                li0o100io01 = li0o100io012;
                    }
/* 70 */            li0o100io01.I0000Il00O();
/* 73 */            I010l10O();
                }

                public final void I010l10O() {
/* 13 */            JobScheduler jobScheduler = (JobScheduler) ((l0olllO1i) this.I00iOIl).I00iOIl.getSystemService("jobscheduler");
/* 15 */            if (jobScheduler != null) {
/* 21 */                jobScheduler.cancel(I010l1O());
                    }
                }

                public final int I010l1O() {
/* 1 */             Integer numValueOf = this.I00ilO0;
/* 3 */             if (numValueOf == null) {
/* 29 */                numValueOf = Integer.valueOf("measurement".concat(String.valueOf(((l0olllO1i) this.I00iOIl).I00iOIl.getPackageName())).hashCode());
/* 33 */                this.I00ilO0 = numValueOf;
                    }
/* 35 */            return numValueOf.intValue();
                }
            }
