            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class I1liIOOo0i {
                public static final AtomicIntegerFieldUpdater I00000oOI = AtomicIntegerFieldUpdater.newUpdater(I1liIOOo0i.class, "notCompletedCount$volatile");
                public final IiIOI1ol0o[] I00000oIO;
                private volatile int notCompletedCount$volatile;

                public I1liIOOo0i(IiIOI1ol0o[] iiIOI1ol0oArr) {
/* 4 */             this.I00000oIO = iiIOI1ol0oArr;
/* 7 */             this.notCompletedCount$volatile = iiIOI1ol0oArr.length;
                }
            }
