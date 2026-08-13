            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import com.box.gallery.R;
            
            public abstract class ll011I {
                public static String I00000oIO(Context context) {
                    try {
/* 8 */                 return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                    } catch (Resources.NotFoundException unused) {
/* 13 */                return context.getPackageName();
                    }
                }
            }
