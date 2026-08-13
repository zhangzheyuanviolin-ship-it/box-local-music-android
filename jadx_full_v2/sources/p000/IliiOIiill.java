            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.ThreadPoolExecutor;
            
            public final class IliiOIiill implements IiollO {
                public Context I00iOIl;
                public IliiOI0I0 I00iiI;
                public o0llIi I00iiO;
                public Object I00iio;
                public Handler I00ilI0I1;
                public ThreadPoolExecutor I00ilO0;
                public ThreadPoolExecutor I00io1l;
                public ilI1Io1io I00ioIO;

                @Override
                public final void I00000oIO(ilI1Io1io ili1io1io) {
                    synchronized (this.I00iio) {
/* 4 */                 this.I00ioIO = ili1io1io;
                    }
                    synchronized (this.I00iio) {
                        try {
/* 12 */                    if (this.I00ioIO == null) {
/* 48 */                        return;
                            }
/* 18 */                    ThreadPoolExecutor threadPoolExecutorI00000oIO = this.I00ilO0;
/* 20 */                    if (threadPoolExecutorI00000oIO == null) {
/* 24 */                        threadPoolExecutorI00000oIO = iilo0loOlooi.I00000oIO("emojiCompat");
/* 28 */                        this.I00io1l = threadPoolExecutorI00000oIO;
/* 30 */                        this.I00ilO0 = threadPoolExecutorI00000oIO;
                            }
/* 36 */                    I0100i i0100i = new I0100i(22);
/* 39 */                    i0100i.I00iiI = this;
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    threadPoolExecutorI00000oIO.execute(i0100i);
                        } finally {
                        }
                    }
                }

                public final void I00000oOI() {
                    synchronized (this.I00iio) {
                        try {
/* 5 */                     this.I00ioIO = null;
/* 7 */                     Handler handler = this.I00ilI0I1;
/* 9 */                     if (handler != null) {
/* 11 */                        handler.removeCallbacks(null);
                            }
/* 17 */                    this.I00ilI0I1 = null;
/* 19 */                    ThreadPoolExecutor threadPoolExecutor = this.I00io1l;
/* 21 */                    if (threadPoolExecutor != null) {
/* 23 */                        threadPoolExecutor.shutdown();
                            }
/* 26 */                    this.I00ilO0 = null;
/* 28 */                    this.I00io1l = null;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final Ilili1O1io I0000Il00O() {
                    try {
/* 1 */                 o0llIi o0llii = this.I00iiO;
/* 3 */                 Context context = this.I00iOIl;
/* 5 */                 IliiOI0I0 iliiOI0I0 = this.I00iiI;
/* 7 */                 o0llii.getClass();
/* 14 */                IlilOiIoo ililOiIooI00000oIO = IliiO10OiIOl.I00000oIO(context, List.of(iliiOI0I0));
/* 18 */                int i = ililOiIooI00000oIO.I00000oIO;
/* 20 */                if (i != 0) {
/* 60 */                    throw new RuntimeException(IIlIOloOOO.I00100l0("fetchFonts failed (", i, ")"));
                        }
/* 29 */                Ilili1O1io[] ilili1O1ioArr = (Ilili1O1io[]) ililOiIooI00000oIO.I00000oOI.get(0);
/* 31 */                if (ilili1O1ioArr == null || ilili1O1ioArr.length == 0) {
/* 46 */                    throw new RuntimeException("fetchFonts failed (empty result)");
                        }
/* 36 */                return ilili1O1ioArr[0];
                    } catch (PackageManager.NameNotFoundException e) {
/* 64 */                OIiilo1Ool0o.I000iOII("provider not found", e);
/* 67 */                return null;
                    }
                }
            }
