            package p000;

            import android.view.Choreographer;
            import kotlin.jvm.functions.Function1;
            
            public final class I101Ooio111 implements Choreographer.FrameCallback {
                public IIoOoIol0Io0 I00iOIl;
                public Function1 I00iiI;

                @Override
                public final void doFrame(long j) {
                    Object objI00000oIO;
/* 1 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00iOIl;
                    try {
/* 9 */                 objI00000oIO = this.I00iiI.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
/* 15 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 19 */            iIoOoIol0Io0.resumeWith(objI00000oIO);
                }
            }
