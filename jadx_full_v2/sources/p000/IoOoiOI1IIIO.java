            package p000;

            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.Preference;
            import java.util.concurrent.Callable;
            
            public final class IoOoiOI1IIIO implements Callable {
                public I0IIiO0iI I00000oIO;
                public int I00000oOI;

                @Override
                public final Object call() {
/* 1 */             I0IIiO0iI i0IIiO0iI = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 7 */             WorkDatabase workDatabase = (WorkDatabase) i0IIiO0iI.I00iiI;
/* 15 */            Long longValue = workDatabase.I001IO000().getLongValue("next_job_scheduler_id");
/* 19 */            int i2 = 0;
/* 28 */            int iLongValue = longValue != null ? (int) longValue.longValue() : 0;
/* 52 */            workDatabase.I001IO000().insertPreference(new Preference("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
/* 55 */            if (iLongValue < 0 || iLongValue > i) {
/* 80 */                ((WorkDatabase) i0IIiO0iI.I00iiI).I001IO000().insertPreference(new Preference("next_job_scheduler_id", (Long) 1L));
                    } else {
/* 59 */                i2 = iLongValue;
                    }
/* 83 */            return Integer.valueOf(i2);
                }
            }
