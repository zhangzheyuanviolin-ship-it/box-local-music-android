            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class I1IiIl extends lOilIII {
                public static volatile I1IiIl I00000oOI;
                public static final I1Ii1lIoOI I0000Il00O = new I1Ii1lIoOI(0);
                public final IiII0i11oIo I00000oIO;

                public I1IiIl() {
/* 6 */             IiII0i11oIo iiII0i11oIo = new IiII0i11oIo();
/* 14 */            iiII0i11oIo.I00000oIO = new Object();
/* 19 */            IIlOo10 iIlOo10 = new IIlOo10(1);
/* 28 */            iIlOo10.I00000oOI = new AtomicInteger(0);
/* 30 */            VarHandle.storeStoreFence();
/* 38 */            iiII0i11oIo.I00000oOI = Executors.newFixedThreadPool(4, iIlOo10);
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            this.I00000oIO = iiII0i11oIo;
                }

                public static I1IiIl I00000oIO() {
/* 3 */             if (I00000oOI != null) {
/* 5 */                 return I00000oOI;
                    }
                    synchronized (I1IiIl.class) {
                        try {
/* 13 */                    if (I00000oOI == null) {
/* 20 */                        I00000oOI = new I1IiIl();
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 26 */            return I00000oOI;
                }

                public final void I00000oOI(Runnable runnable) {
/* 1 */             IiII0i11oIo iiII0i11oIo = this.I00000oIO;
/* 5 */             if (iiII0i11oIo.I0000Il00O == null) {
                        synchronized (iiII0i11oIo.I00000oIO) {
                            try {
/* 12 */                        if (iiII0i11oIo.I0000Il00O == null) {
/* 22 */                            iiII0i11oIo.I0000Il00O = Handler.createAsync(Looper.getMainLooper());
                                }
                            } finally {
                            }
                        }
                    }
/* 33 */            iiII0i11oIo.I0000Il00O.post(runnable);
                }
            }
