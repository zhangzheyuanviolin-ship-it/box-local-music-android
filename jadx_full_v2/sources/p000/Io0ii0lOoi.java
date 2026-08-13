            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.util.Log;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public abstract class Io0ii0lOoi {
                public static boolean I00000oOI = false;
                public static boolean I0000Il00O = false;
                public static final int I0000oI00 = 0;
                public static final AtomicBoolean I00000oIO = new AtomicBoolean();
                public static final AtomicBoolean I0000O = new AtomicBoolean();

                public static int I00000oIO(Context context) {
                    try {
/* 12 */                return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 19 */                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
/* 1 */                 return 0;
                    }
                }

                public static boolean I00000oOI(Context context) {
                    try {
/* 5 */                 if (!I0000Il00O) {
                            try {
/* 16 */                        PackageInfo packageInfoI0000Il00O = i01l1OO001.I00000oIO(context).I0000Il00O(134217792, "com.google.android.gms");
/* 20 */                        Io0ii1o0.I00000oIO(context);
/* 23 */                        if (packageInfoI0000Il00O == null || Io0ii1o0.I0000Il00O(packageInfoI0000Il00O, false) || !Io0ii1o0.I0000Il00O(packageInfoI0000Il00O, true)) {
/* 44 */                            I00000oOI = false;
                                } else {
/* 37 */                            I00000oOI = true;
                                }
/* 46 */                        I0000Il00O = true;
                            } catch (PackageManager.NameNotFoundException e) {
/* 53 */                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
/* 56 */                        I0000Il00O = true;
                            }
                        }
                        return I00000oOI || !"user".equals(Build.TYPE);
                    } catch (Throwable th) {
/* 59 */                I0000Il00O = true;
/* 61 */                throw th;
                    }
                }
            }
