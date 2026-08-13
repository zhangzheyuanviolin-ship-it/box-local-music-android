            package p000;

            import android.util.Log;
            import java.util.Objects;
            
            public final class iil1ilo extends ClassLoader {
                @Override
                public final Class loadClass(String str, boolean z) {
/* 7 */             if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
/* 18 */                return super.loadClass(str, z);
                    }
/* 12 */            Log.isLoggable("CloudMessengerCompat", 3);
/* 15 */            return il1IIi0oI.class;
                }
            }
