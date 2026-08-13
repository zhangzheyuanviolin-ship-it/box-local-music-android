            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.PowerManager;
            import android.os.WorkSource;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public abstract class iO1O101oi {
                public static final Object I00000oIO = new Object();
                public static OooooOi1 I00000oOI;

                public static void I00000oIO(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    boolean zBooleanValue;
/* 3 */             if (I00000oOI == null) {
/* 9 */                 String packageName = context.getPackageName();
/* 13 */                OooooOi1 oooooOi1 = new OooooOi1();
/* 21 */                oooooOi1.I00000oIO = new Object();
/* 24 */                oooooOi1.I0000Il00O = 0;
/* 31 */                oooooOi1.I0001Ioi1lo = new HashSet();
/* 34 */                oooooOi1.I000II = true;
/* 38 */                oooooOi1.I000OOo1O = Iioi0lilII.I00iiO;
/* 45 */                oooooOi1.I000iOII = new HashMap();
/* 52 */                oooooOi1.I000l1 = new AtomicInteger(0);
/* 56 */                lII0I0I000I.I0000oI00("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
/* 59 */                context.getApplicationContext();
/* 62 */                WorkSource workSource = null;
/* 63 */                oooooOi1.I000O01llI0 = null;
/* 75 */                if ("com.google.android.gms".equals(context.getPackageName())) {
/* 86 */                    oooooOi1.I000OiO = "wake:com.google.firebase.iid.WakeLockHolder";
                        } else {
/* 83 */                    oooooOi1.I000OiO = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
                        }
/* 94 */                PowerManager powerManager = (PowerManager) context.getSystemService("power");
/* 96 */                if (powerManager == null) {
/* 321 */                   StringBuilder sb = new StringBuilder(29);
/* 326 */                   sb.append((CharSequence) "expected a non-null reference", 0, 29);
/* 338 */                   throw new IOiIIo1l(sb.toString(), 23);
                        }
/* 102 */               oooooOi1.I00000oOI = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
/* 104 */               Method method = i01Oi1i.I00000oIO;
                        synchronized (i01Oi1i.class) {
/* 109 */                   Boolean bool = i01Oi1i.I0000Il00O;
/* 111 */                   if (bool != null) {
/* 113 */                       zBooleanValue = bool.booleanValue();
                            } else {
/* 132 */                       zBooleanValue = iOI10i0I11.I00000oIO(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
/* 137 */                       i01Oi1i.I0000Il00O = Boolean.valueOf(zBooleanValue);
                            }
                        }
/* 140 */               if (zBooleanValue) {
/* 142 */                   int i = OlOoO1.I00000oIO;
/* 144 */                   if (packageName == null || packageName.trim().isEmpty()) {
/* 156 */                       packageName = context.getPackageName();
                            }
/* 166 */                   if (context.getPackageManager() != null && packageName != null) {
                                try {
/* 174 */                           ApplicationInfo applicationInfoI00000oIO = i01l1OO001.I00000oIO(context).I00000oIO(0, packageName);
/* 178 */                           if (applicationInfoI00000oIO == null) {
/* 186 */                               Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                                    } else {
/* 190 */                               int i2 = applicationInfoI00000oIO.uid;
/* 194 */                               workSource = new WorkSource();
/* 199 */                               Method method2 = i01Oi1i.I00000oOI;
/* 201 */                               if (method2 != null) {
                                            try {
/* 211 */                                       method2.invoke(workSource, Integer.valueOf(i2), packageName);
                                            } catch (Exception e) {
/* 216 */                                       Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                            }
                                        } else {
/* 220 */                                   Method method3 = i01Oi1i.I00000oIO;
/* 222 */                                   if (method3 != null) {
                                                try {
/* 232 */                                           method3.invoke(workSource, Integer.valueOf(i2));
                                                } catch (Exception e2) {
/* 237 */                                           Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                                }
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
/* 247 */                           Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                                }
                            }
/* 250 */                   if (workSource != null) {
                                try {
/* 254 */                           oooooOi1.I00000oOI.setWorkSource(workSource);
                                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
/* 265 */                           Log.wtf("WakeLock", e3.toString());
                                }
                            }
                        }
/* 268 */               ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = OooooOi1.I000o00OoI0I;
/* 270 */               if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                            synchronized (OooooOi1.I000oI1ioi) {
                                try {
/* 275 */                           scheduledExecutorServiceUnconfigurableScheduledExecutorService = OooooOi1.I000o00OoI0I;
/* 277 */                           if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
/* 283 */                               scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
/* 287 */                               OooooOi1.I000o00OoI0I = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                                    }
                                } finally {
                                }
                            }
                        }
/* 296 */               oooooOi1.I000lI = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
/* 298 */               VarHandle.storeStoreFence();
/* 301 */               I00000oOI = oooooOi1;
                        synchronized (oooooOi1.I00000oIO) {
/* 306 */                   oooooOi1.I000II = true;
                        }
                    }
                }

                public static void I00000oOI(Intent intent) {
                    synchronized (I00000oIO) {
                        try {
/* 6 */                     if (I00000oOI != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
/* 19 */                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 24 */                        I00000oOI.I0000Il00O();
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public static ComponentName I0000Il00O(Context context, Intent intent) {
                    synchronized (I00000oIO) {
                        try {
/* 4 */                     I00000oIO(context);
/* 10 */                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 17 */                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
/* 20 */                    ComponentName componentNameStartService = context.startService(intent);
/* 24 */                    if (componentNameStartService == null) {
/* 26 */                        return null;
                            }
/* 31 */                    if (!booleanExtra) {
/* 35 */                        I00000oOI.I00000oIO();
                            }
/* 39 */                    return componentNameStartService;
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }
            }
