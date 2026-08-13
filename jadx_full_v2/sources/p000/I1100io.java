            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            import java.util.Random;
            
            public final class I1100io implements Choreographer.FrameCallback {
                public final int I00iOIl;
                public Object I00iiI;

                public I1100io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void doFrame(long j) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 67 */                    ((Runnable) obj).run();
                            break;
                        case 1:
/* 53 */                    IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 61 */                    ((IIoOoIol0Io0) obj).I001lloI(O1OI1l011OO1.I00000oIO, Long.valueOf(j));
                            break;
                        default:
/* 14 */                    Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
/* 30 */                    int iNextInt = new Random().nextInt(Math.max(1000, 1));
/* 36 */                    I11lIIO1ol0i i11lIIO1ol0i = new I11lIIO1ol0i(1);
/* 39 */                    i11lIIO1ol0i.I00iiI = (Context) obj;
/* 41 */                    VarHandle.storeStoreFence();
/* 47 */                    handlerCreateAsync.postDelayed(i11lIIO1ol0i, iNextInt + 5000);
                            break;
                    }
                }
            }
