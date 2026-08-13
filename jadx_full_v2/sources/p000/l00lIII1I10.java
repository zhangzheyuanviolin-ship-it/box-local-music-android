            package p000;

            import android.util.Pair;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.function.Consumer;
            
            public final class l00lIII1I10 implements Consumer {
                public i1IoOl I00000oIO;
                public OoIol00Ool I00000oOI;

                @Override
                public final void accept(Object obj) {
/* 1 */             i1IoOl i1iool = this.I00000oIO;
/* 3 */             OoIol00Ool ooIol00Ool = this.I00000oOI;
/* 10 */            IlloOIoilIl illoOIoilIl = new IlloOIoilIl(7);
/* 13 */            illoOIoilIl.I00iiI = (Pair) obj;
/* 15 */            illoOIoilIl.I00iiO = ooIol00Ool;
/* 17 */            VarHandle.storeStoreFence();
/* 24 */            ((Executor) i1iool.I00iOIl).execute(illoOIoilIl);
                }
            }
