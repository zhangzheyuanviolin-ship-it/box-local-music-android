            package androidx.work.impl.model;

            import kotlin.Metadata;
            import p000.Ii11I1OOII1;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/model/WorkProgress;", "", "", "workSpecId", "LIi11I1OOII1;", "progress", "<init>", "(Ljava/lang/String;LIi11I1OOII1;)V", "Ljava/lang/String;", "getWorkSpecId", "()Ljava/lang/String;", "LIi11I1OOII1;", "getProgress", "()LIi11I1OOII1;", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class WorkProgress {
                private final Ii11I1OOII1 progress;
                private final String workSpecId;

                public WorkProgress(String str, Ii11I1OOII1 ii11I1OOII1) {
/* 4 */             this.workSpecId = str;
/* 6 */             this.progress = ii11I1OOII1;
                }

                public final Ii11I1OOII1 getProgress() {
/* 1 */             return this.progress;
                }

                public final String getWorkSpecId() {
/* 1 */             return this.workSpecId;
                }
            }
