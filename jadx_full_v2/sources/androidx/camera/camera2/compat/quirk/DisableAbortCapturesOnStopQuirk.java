            package androidx.camera.camera2.compat.quirk;

            import android.os.Build;
            import kotlin.Metadata;
            import p000.OOiio1i;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "LOOiio1i;", "<init>", "()V", "camera-camera2"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class DisableAbortCapturesOnStopQuirk implements OOiio1i {
                public static final boolean I00000oIO;
                public static final boolean I00000oOI;

                static {
/* 1 */             String str = Build.MANUFACTURER;
/* 9 */             boolean z = false;
/* 34 */            I00000oIO = (str.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "d2q".equalsIgnoreCase(Build.DEVICE);
/* 42 */            if ((str.equalsIgnoreCase("Poco") || Build.BRAND.equalsIgnoreCase("Poco")) && "M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
/* 62 */                z = true;
                    }
/* 63 */            I00000oOI = z;
                }
            }
