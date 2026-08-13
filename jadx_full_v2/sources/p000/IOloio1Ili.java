            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.content.pm.PackageManager;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.NoSuchElementException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            
            public final class IOloio1Ili {
                public static final Object I00000oOI = new Object();
                public static volatile IOloio1Ili I0000Il00O;
                public ConcurrentHashMap I00000oIO;

                public static IOloio1Ili I00000oOI() {
/* 3 */             if (I0000Il00O == null) {
                        synchronized (I00000oOI) {
                            try {
/* 10 */                        if (I0000Il00O == null) {
/* 14 */                            IOloio1Ili iOloio1Ili = new IOloio1Ili();
/* 22 */                            iOloio1Ili.I00000oIO = new ConcurrentHashMap();
/* 24 */                            VarHandle.storeStoreFence();
/* 27 */                            I0000Il00O = iOloio1Ili;
                                }
                            } finally {
                            }
                        }
                    }
/* 36 */            IOloio1Ili iOloio1Ili2 = I0000Il00O;
/* 38 */            lII0I0I000I.I000II(iOloio1Ili2);
/* 55 */            return iOloio1Ili2;
                }

                public boolean I00000oIO(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
/* 15 */            return I0000O(context, context.getClass().getName(), intent, serviceConnection, i, null);
                }

                public void I0000Il00O(Context context, ServiceConnection serviceConnection) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 5 */             if ((serviceConnection instanceof li0ill) || !concurrentHashMap.containsKey(serviceConnection)) {
                        try {
/* 33 */                    context.unbindService(serviceConnection);
                        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                        }
                    } else {
                        try {
                            try {
/* 19 */                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                            }
                        } finally {
/* 29 */                    concurrentHashMap.remove(serviceConnection);
                        }
                    }
                }

                public boolean I0000O(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 3 */             ComponentName component = intent.getComponent();
/* 10 */            if (component != null) {
/* 13 */                String packageName = component.getPackageName();
/* 19 */                "com.google.android.gms".equals(packageName);
                        try {
/* 35 */                    if ((i01l1OO001.I00000oIO(context).I00000oIO(0, packageName).flags & 2097152) != 0) {
/* 39 */                        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
/* 9 */                         return false;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
/* 46 */            if (serviceConnection instanceof li0ill) {
/* 102 */               if (executor == null) {
/* 104 */                   executor = null;
                        }
/* 113 */               return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
                    }
/* 52 */            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
/* 54 */            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
/* 72 */                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
                    }
/* 75 */            if (executor == null) {
/* 77 */                executor = null;
                    }
                    try {
/* 87 */                boolean zBindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
/* 91 */                if (zBindService) {
/* 685 */                   return zBindService;
                        }
/* 94 */                concurrentHashMap.remove(serviceConnection, serviceConnection);
/* 9 */                 return false;
                    } catch (Throwable th) {
/* 98 */                concurrentHashMap.remove(serviceConnection, serviceConnection);
/* 101 */               throw th;
                    }
                }
            }
