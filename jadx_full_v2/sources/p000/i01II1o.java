            package p000;

            import android.content.Context;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkSpecDao;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public final class i01II1o implements IliliOoOloi {
                public final OloIli I00iOIl;
                public final OOIo1i0 I00iiI;
                public final WorkSpecDao I00iiO;

                static {
/* 3 */             IIi0oIl.I000OiO("WMFgUpdater");
                }

                public i01II1o(WorkDatabase workDatabase, OOIo1i0 oOIo1i0, OloIli oloIli) {
/* 4 */             this.I00iiI = oOIo1i0;
/* 6 */             this.I00iOIl = oloIli;
/* 12 */            this.I00iiO = workDatabase.I001lIiIIo1O();
                }

                @Override
                public final ListenableFuture I00000oIO(Context context, UUID uuid, IliliOOliOi ililiOOliOi) {
/* 7 */             OilOol oilOol = (OilOol) ((OillOo0) this.I00iOIl).I00iiI;
/* 12 */            OioI1O oioI1O = new OioI1O(5);
/* 15 */            oioI1O.I00iiI = this;
/* 17 */            oioI1O.I00iiO = uuid;
/* 19 */            oioI1O.I00iio = ililiOOliOi;
/* 21 */            oioI1O.I00ilI0I1 = context;
/* 23 */            VarHandle.storeStoreFence();
/* 28 */            return l10o11O01o1.I00000oIO(oilOol, "setForegroundAsync", oioI1O);
                }
            }
