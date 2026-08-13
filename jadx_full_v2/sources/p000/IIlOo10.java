            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class IIlOo10 implements ThreadFactory {
                public final int I00000oIO;
                public AtomicInteger I00000oOI;

                @Override
                public final Thread newThread(Runnable runnable) {
                    switch (this.I00000oIO) {
                        case 0:
/* 98 */                    I0100i i0100i = new I0100i(11);
/* 101 */                   i0100i.I00iiI = runnable;
/* 103 */                   VarHandle.storeStoreFence();
/* 106 */                   Thread thread = new Thread(i0100i);
/* 110 */                   thread.setPriority(7);
/* 113 */                   Locale locale = Locale.US;
/* 135 */                   thread.setName("CameraX-core_camera_" + this.I00000oOI.getAndIncrement());
/* 138 */                   return thread;
                        case 1:
/* 65 */                    Thread thread2 = new Thread(runnable);
/* 88 */                    thread2.setName("arch_disk_io_" + this.I00000oOI.getAndIncrement());
/* 91 */                    return thread2;
                        case 2:
/* 34 */                    Thread thread3 = new Thread(runnable);
/* 37 */                    Locale locale2 = Locale.US;
/* 59 */                    thread3.setName("CameraX-camerax_io_" + this.I00000oOI.getAndIncrement());
/* 62 */                    return thread3;
                        default:
/* 28 */                    return new Thread(runnable, "ModernAsyncTask #" + this.I00000oOI.getAndIncrement());
                    }
                }
            }
