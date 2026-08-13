            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.os.Build;
            import android.util.Log;
            import com.google.android.gms.common.api.GoogleApiActivity;
            
            public final class i0OoOl1OOii implements DialogInterface.OnClickListener {
                public Intent I00iOIl;
                public GoogleApiActivity I00iiI;

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        try {
/* 1 */                     Intent intent = this.I00iOIl;
/* 3 */                     if (intent != null) {
/* 8 */                         this.I00iiI.startActivityForResult(intent, 2);
                            }
                        } catch (ActivityNotFoundException e) {
/* 31 */                    Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
                        }
                    } finally {
/* 39 */                dialogInterface.dismiss();
                    }
                }
            }
