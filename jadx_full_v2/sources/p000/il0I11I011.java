            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            public final class il0I11I011 implements iO110O11Ii {
                public static final ComponentName I00li1OI;
                public static final ComponentName I00ll1;
                public l01I1iOlI I00iOIl;
                public Context I00iiI;
                public Executor I00iiO;
                public boolean I00iio;
                public long I00ilI0I1;
                public ScheduledExecutorService I00ilO0;
                public boolean I00io1l;
                public Object I00ioIO;
                public iiooi0i I00l0I0l0lO1;
                public ScheduledFuture I00l0OO0IO;

                static {
/* 7 */             ComponentName componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
/* 10 */            I00li1OI = componentName;
/* 23 */            I00ll1 = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
                }

                public final iiooi0i I00000oIO() {
                    synchronized (this.I00ioIO) {
                        try {
/* 4 */                     I000II();
/* 7 */                     iiooi0i iiooi0iVar = this.I00l0I0l0lO1;
/* 9 */                     if (iiooi0iVar != null) {
/* 12 */                        return iiooi0iVar;
                            }
/* 18 */                    iiooi0i iiooi0iVar2 = new iiooi0i(1);
/* 21 */                    iiooi0iVar2.I00ilI0I1 = this;
/* 28 */                    iiooi0iVar2.I00iiI = new Object();
/* 35 */                    iiooi0iVar2.I00iio = new il0llll00oO(1);
/* 37 */                    iiooi0iVar2.I0001Ioi1lo();
/* 40 */                    VarHandle.storeStoreFence();
/* 43 */                    this.I00l0I0l0lO1 = iiooi0iVar2;
/* 45 */                    iiooi0iVar2.I0000oI00();
/* 49 */                    return iiooi0iVar2;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I0000Il00O() {
                    synchronized (this.I00ioIO) {
/* 4 */                 iiooi0i iiooi0iVar = this.I00l0I0l0lO1;
/* 7 */                 if (iiooi0iVar != null) {
                            synchronized (iiooi0iVar.I00iiI) {
/* 18 */                        ((il0I11I011) iiooi0iVar.I00ilI0I1).I00iiI.unbindService(iiooi0iVar);
/* 25 */                        ((il0llll00oO) iiooi0iVar.I00iio).I000iOII();
                            }
/* 29 */                    this.I00l0I0l0lO1 = null;
                        }
/* 37 */                ScheduledFuture scheduledFuture = this.I00l0OO0IO;
/* 39 */                if (scheduledFuture != null) {
/* 42 */                    scheduledFuture.cancel(false);
/* 45 */                    this.I00l0OO0IO = null;
                        }
                    }
                }

                public final void I000II() {
/* 1 */             long j = this.I00ilI0I1;
/* 7 */             if (j <= 0) {
/* 9 */                 return;
                    }
                    synchronized (this.I00ioIO) {
                        try {
/* 13 */                    ScheduledFuture scheduledFuture = this.I00l0OO0IO;
/* 15 */                    if (scheduledFuture != null) {
/* 18 */                        scheduledFuture.cancel(false);
                            }
/* 24 */                    ScheduledExecutorService scheduledExecutorService = this.I00ilO0;
/* 30 */                    I0lil01 i0lil01 = new I0lil01(21);
/* 33 */                    i0lil01.I00iiI = this;
/* 35 */                    VarHandle.storeStoreFence();
/* 44 */                    this.I00l0OO0IO = scheduledExecutorService.schedule(i0lil01, j, TimeUnit.MILLISECONDS);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void close() {
/* 1 */             I0000Il00O();
                }
            }
