            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.logging.Level;
            
            public abstract class ll0ii0IllI {
                public static final void I00000oIO(Level level, Executor executor, Exception exc, String str, Object... objArr) {
/* 5 */             IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(11);
/* 8 */             iO0iIlI1li.I00iiI = level;
/* 10 */            iO0iIlI1li.I00iiO = exc;
/* 12 */            iO0iIlI1li.I00iio = str;
/* 14 */            iO0iIlI1li.I00ilI0I1 = objArr;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            int i = o0iOII1liI.I00000oIO;
/* 21 */            o0OllIoI o0ollioiI00000oIO = o0IOOIili01o.I00000oIO();
/* 27 */            OOo0ooi oOo0ooi = new OOo0ooi();
/* 34 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(22);
/* 37 */            o10oO1IiI1.I00iiI = oOo0ooi;
/* 39 */            o10oO1IiI1.I00iiO = o0ollioiI00000oIO;
/* 41 */            o10oO1IiI1.I00iio = iO0iIlI1li;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            executor.execute(o10oO1IiI1);
                }
            }
