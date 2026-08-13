            package androidx.camera.camera2.compat.quirk;

            import android.os.Build;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import kotlin.Metadata;
            import p000.I1IoiO1l;
            import p000.IOOi1I;
            import p000.O0000Ioio00;
            import p000.OOiio1i;
            import p000.OlOolloIIOl0;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "LOOiio1i;", "<init>", "()V", "camera-camera2"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements OOiio1i {
                public static final boolean I00000oIO;
                public static final boolean I00000oOI;
                public static final boolean I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
                static {
                    boolean z;
/* 1 */             String str = Build.HARDWARE;
/* 9 */             I00000oIO = O0000Ioio00.I0000O(str, "samsungexynos7570");
/* 17 */            I00000oOI = O0000Ioio00.I0000O(str, "samsungexynos7870");
/* 19 */            String str2 = Build.MANUFACTURER;
/* 27 */            boolean z2 = false;
/* 64 */            I0000Il00O = (str2.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) && I1IoiO1l.I0001Ioi1lo(new String[]{"aurora", "houji"}, Build.DEVICE.toLowerCase(Locale.ROOT));
/* 72 */            if (str2.equalsIgnoreCase("Sony") || Build.BRAND.equalsIgnoreCase("Sony")) {
/* 92 */                List listI000O01llI0 = IOOi1I.I000O01llI0("XQ-DQ", "SO", "A301SO");
/* 100 */               if ((listI000O01llI0 instanceof Collection) && listI000O01llI0.isEmpty()) {
/* 138 */                   z = false;
                        } else {
/* 112 */                   Iterator it = listI000O01llI0.iterator();
/* 120 */                   while (it.hasNext()) {
/* 134 */                       if (OlOolloIIOl0.I000l1(Build.DEVICE, (String) it.next(), true)) {
/* 136 */                           z = true;
                                    break;
                                }
                            }
/* 138 */                   z = false;
                        }
                    }
/* 139 */           I0000O = z;
/* 149 */           if ((Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && Build.VERSION.SDK_INT <= 34) {
/* 165 */               z2 = true;
                    }
/* 166 */           I0000oI00 = z2;
                }
            }
