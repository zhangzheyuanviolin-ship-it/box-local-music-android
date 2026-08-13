            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class Ioi0IO1l implements IIiOOIoi0 {
                public Ioi0O0l1Ol I00iOIl;
                public Executor I00iiI;
                public IoiO1IO1I1i I00iiO;
                public Matrix I00iio;
                public IoiO1IO1I1i I00ilI0I1;
                public Rect I00ilO0;
                public IoOoo0ll I00io1l;

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             Ioi0O0l1Ol ioi0O0l1Ol = this.I00iOIl;
/* 3 */             Executor executor = this.I00iiI;
/* 5 */             IoiO1IO1I1i ioiO1IO1I1i = this.I00iiO;
/* 7 */             Matrix matrix = this.I00iio;
/* 9 */             IoiO1IO1I1i ioiO1IO1I1i2 = this.I00ilI0I1;
/* 11 */            Rect rect = this.I00ilO0;
/* 13 */            IoOoo0ll ioOoo0ll = this.I00io1l;
/* 17 */            Ioi0IiIIO ioi0IiIIO = new Ioi0IiIIO();
/* 20 */            ioi0IiIIO.I00iOIl = ioi0O0l1Ol;
/* 22 */            ioi0IiIIO.I00iiI = ioiO1IO1I1i;
/* 24 */            ioi0IiIIO.I00iiO = matrix;
/* 26 */            ioi0IiIIO.I00iio = ioiO1IO1I1i2;
/* 28 */            ioi0IiIIO.I00ilI0I1 = rect;
/* 30 */            ioi0IiIIO.I00ilO0 = ioOoo0ll;
/* 32 */            ioi0IiIIO.I00io1l = iIiOOI;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            executor.execute(ioi0IiIIO);
/* 40 */            return "analyzeImage";
                }
            }
