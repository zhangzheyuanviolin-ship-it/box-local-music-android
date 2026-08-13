            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.IBinder;
            import android.os.UserManager;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 18 */    public final class l00Iil implements IBinder.DeathRecipient, AutoCloseable {
                public static final ComponentName I00ll1;
                public static final ComponentName I00lli11;
                public lil11i I00iOIl;
                public Context I00iiI;
                public Executor I00iiO;
                public boolean I00iio;
                public long I00ilI0I1;
                public ScheduledExecutorService I00ilO0;
                public UserManager I00io1l;
                public boolean I00ioIO;
                public Object I00l0I0l0lO1;
                public l001Oo I00l0OO0IO;
                public ScheduledFuture I00li1OI;

                static {
/* 7 */             ComponentName componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
/* 10 */            I00ll1 = componentName;
/* 23 */            I00lli11 = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
                }

                public final li10Io11 I00000oIO() {
                    l001Oo l001oo;
                    lio0IOO101oI lio0ioo101oi;
/* 1 */             UserManager userManager = this.I00io1l;
/* 3 */             if (userManager == null || !userManager.isUserUnlocked()) {
/* 95 */                return ll0li01oO0li.I00000oOI(ilIoOl.I0000O("User is not unlocked.", null, 601));
                    }
                    synchronized (this.I00l0I0l0lO1) {
                        try {
/* 14 */                    I000II();
/* 17 */                    l001oo = this.I00l0OO0IO;
/* 19 */                    if (l001oo == null) {
/* 27 */                        l001oo = new l001Oo();
/* 30 */                        l001oo.I00ilI0I1 = this;
/* 32 */                        l001oo.I00iio = this;
/* 39 */                        l001oo.I00iOIl = new Object();
/* 47 */                        l001oo.I00iiO = new il0llll00oO(4);
/* 49 */                        l001oo.I00000oIO();
/* 52 */                        VarHandle.storeStoreFence();
/* 55 */                        this.I00l0OO0IO = l001oo;
/* 57 */                        l001oo.I00000oOI();
                            }
                        } finally {
                        }
                    }
                    synchronized (l001oo.I00iOIl) {
                        try {
/* 70 */                    if (l001oo.I00iiI.I00iOIl instanceof li0olooIo) {
/* 72 */                        l001oo.I00000oIO();
                            }
/* 78 */                    lio0ioo101oi = l001oo.I00iiI;
                        } finally {
                        }
                    }
/* 81 */            return lio0ioo101oi;
                }

                public final void I0000Il00O() {
                    synchronized (this.I00l0I0l0lO1) {
                        try {
/* 4 */                     l001Oo l001oo = this.I00l0OO0IO;
/* 7 */                     if (l001oo != null) {
/* 9 */                         l001oo.I0000Il00O();
/* 12 */                        this.I00l0OO0IO = null;
                            }
/* 17 */                    ScheduledFuture scheduledFuture = this.I00li1OI;
/* 19 */                    if (scheduledFuture != null) {
/* 22 */                        scheduledFuture.cancel(false);
/* 25 */                        this.I00li1OI = null;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I000II() {
/* 1 */             long j = this.I00ilI0I1;
/* 7 */             if (j <= 0) {
/* 9 */                 return;
                    }
                    synchronized (this.I00l0I0l0lO1) {
                        try {
/* 13 */                    ScheduledFuture scheduledFuture = this.I00li1OI;
/* 15 */                    if (scheduledFuture != null) {
/* 18 */                        scheduledFuture.cancel(false);
                            }
/* 24 */                    ScheduledExecutorService scheduledExecutorService = this.I00ilO0;
/* 30 */                    I0lil01 i0lil01 = new I0lil01(27);
/* 33 */                    i0lil01.I00iiI = this;
/* 35 */                    VarHandle.storeStoreFence();
/* 44 */                    this.I00li1OI = scheduledExecutorService.schedule(i0lil01, j, TimeUnit.MILLISECONDS);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void binderDied(IBinder iBinder) {
/* 13 */            Log.i("l00Iil", "Binder died for component: ".concat(String.valueOf(iBinder)));
/* 16 */            I0000Il00O();
                }

                @Override
                public final void close() {
/* 1 */             I0000Il00O();
                }

                @Override
/* 19 */        public final void binderDied() {
                }
            }
