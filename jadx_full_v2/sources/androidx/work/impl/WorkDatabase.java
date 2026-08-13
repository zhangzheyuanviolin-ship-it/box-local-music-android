            package androidx.work.impl;

            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.PreferenceDao;
            import androidx.work.impl.model.RawWorkInfoDao;
            import androidx.work.impl.model.SystemIdInfoDao;
            import androidx.work.impl.model.WorkNameDao;
            import androidx.work.impl.model.WorkProgressDao;
            import androidx.work.impl.model.WorkSpecDao;
            import androidx.work.impl.model.WorkTagDao;
            import kotlin.Metadata;
            import p000.Oi1oIiOiIi0;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "LOi1oIiOiIi0;", "<init>", "()V", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public abstract class WorkDatabase extends Oi1oIiOiIi0 {
                public abstract DependencyDao I001IIilI0O();

                public abstract PreferenceDao I001IO000();

                public abstract RawWorkInfoDao I001i1O0Ol();

                public abstract SystemIdInfoDao I001i1lo1io();

                public abstract WorkNameDao I001iOo1i0O();

                public abstract WorkProgressDao I001l0I00();

                public abstract WorkSpecDao I001lIiIIo1O();

                public abstract WorkTagDao I001lllioOl();
            }
