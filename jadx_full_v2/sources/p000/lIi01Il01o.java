            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIi01Il01o {
                public static void I00000oIO(Context context) {
                    Context applicationContext;
                    PackageManager packageManager;
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 12 */            if (lIi0lOOo10.I00000oIO(context).getBoolean("proxy_notification_initialized", false)) {
/* 14 */                return;
                    }
                    try {
/* 17 */                applicationContext = context.getApplicationContext();
/* 21 */                packageManager = applicationContext.getPackageManager();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 56 */            boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), Barcode.FORMAT_ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
/* 59 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 64 */            OOiO0lIIlO0i oOiO0lIIlO0i = new OOiO0lIIlO0i();
/* 67 */            oOiO0lIIlO0i.I00iOIl = context;
/* 69 */            oOiO0lIIlO0i.I00iiI = z;
/* 71 */            oOiO0lIIlO0i.I00iiO = oloIlI0ll;
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            oOiO0lIIlO0i.run();
                }
            }
