            package p000;

            import androidx.work.impl.WorkDatabase;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OiOII0lI1 implements Il11ii {
                public OilOol I00iOIl;
                public List I00iiI;
                public IOllii I00iiO;
                public WorkDatabase I00iio;

                @Override
                public final void I0000Il00O(i01IIlI i01iili, boolean z) {
/* 1 */             OilOol oilOol = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
/* 5 */             IOllii iOllii = this.I00iiO;
/* 7 */             WorkDatabase workDatabase = this.I00iio;
/* 12 */            IIl1IO iIl1IO = new IIl1IO(3);
/* 15 */            iIl1IO.I00iiI = list;
/* 17 */            iIl1IO.I00iiO = i01iili;
/* 19 */            iIl1IO.I00iio = iOllii;
/* 21 */            iIl1IO.I00ilI0I1 = workDatabase;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            oilOol.execute(iIl1IO);
                }
            }
