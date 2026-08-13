            package p000;

            import android.content.Context;
            import android.text.TextUtils;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarProvider;
            
            public abstract class Ol0I000O1i1 {
                public static SidecarInterface I00000oIO(Context context) {
/* 5 */             return SidecarProvider.getSidecarImpl(context.getApplicationContext());
                }

                public static OooO0l0000 I00000oOI() {
                    try {
/* 1 */                 String apiVersion = SidecarProvider.getApiVersion();
/* 9 */                 if (TextUtils.isEmpty(apiVersion)) {
/* 18 */                    return null;
                        }
/* 11 */                OooO0l0000 oooO0l0000 = OooO0l0000.I00ilO0;
/* 13 */                return li1i0lii.I00000oIO(apiVersion);
                    } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
/* 18 */                return null;
                    }
                }
            }
