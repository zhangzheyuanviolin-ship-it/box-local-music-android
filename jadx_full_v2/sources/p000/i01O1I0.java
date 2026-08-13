            package p000;

            import android.content.Context;
            import androidx.work.impl.WorkDatabase;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public final class i01O1I0 implements OOO11l {
                public static final String I00iiO = IIi0oIl.I000OiO("WorkProgressUpdater");
                public final WorkDatabase I00iOIl;
                public final OloIli I00iiI;

                public i01O1I0(WorkDatabase workDatabase, OloIli oloIli) {
/* 4 */             this.I00iOIl = workDatabase;
/* 6 */             this.I00iiI = oloIli;
                }

                @Override
                public final ListenableFuture I0000Il00O(Context context, UUID uuid, Ii11I1OOII1 ii11I1OOII1) {
/* 7 */             OilOol oilOol = (OilOol) ((OillOo0) this.I00iiI).I00iiI;
/* 13 */            O1oiilO o1oiilO = new O1oiilO(23);
/* 16 */            o1oiilO.I00iiI = this;
/* 18 */            o1oiilO.I00iiO = uuid;
/* 20 */            o1oiilO.I00iio = ii11I1OOII1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            return l10o11O01o1.I00000oIO(oilOol, "updateProgress", o1oiilO);
                }
            }
