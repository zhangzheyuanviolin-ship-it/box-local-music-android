            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            
/* 8 */     public final class Oi0Oi1ooI010 extends O1loO1O1OO {
                public final int I0000Il00O = 1;
                public Context I0000O;

                public Oi0Oi1ooI010(Context context, int i, int i2) {
/* 4 */             super(i, i2);
/* 7 */             this.I0000O = context;
                }

                @Override
                public final void I00000oOI(Olil0l0 olil0l0) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 180 */                   if (this.I00000oOI >= 10) {
/* 190 */                       olil0l0.I00O0o1oo(new Object[]{"reschedule_needed", 1});
/* 199 */                       return;
                            } else {
/* 196 */                       Oi010OO0.I001lllioOl(this.I0000O, "androidx.work.util.preferences", 0, "reschedule_needed", true);
/* 199 */                       return;
                            }
                        default:
/* 13 */                    olil0l0.I001IO000("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
/* 16 */                    Context context = this.I0000O;
/* 18 */                    SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
/* 28 */                    if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
/* 38 */                        long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
/* 46 */                        long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
/* 50 */                        olil0l0.I0010o();
                                try {
/* 61 */                            olil0l0.I00O0o1oo(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
/* 72 */                            olil0l0.I00O0o1oo(new Object[]{"reschedule_needed", Long.valueOf(j2)});
/* 83 */                            sharedPreferences.edit().clear().apply();
/* 86 */                            olil0l0.I00O10llo();
                                } finally {
                                }
                            }
/* 94 */                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
/* 104 */                   if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
/* 112 */                       int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
/* 118 */                       int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
/* 122 */                       olil0l0.I0010o();
                                try {
/* 133 */                           olil0l0.I00O0o1oo(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
/* 144 */                           olil0l0.I00O0o1oo(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
/* 155 */                           sharedPreferences2.edit().clear().apply();
/* 158 */                           olil0l0.I00O10llo();
/* 164 */                           return;
                                } finally {
                                }
                            }
/* 164 */                   return;
                    }
                }

/* 9 */         public Oi0Oi1ooI010(int i, int i2) {
                    super(i, i2);
                }
            }
