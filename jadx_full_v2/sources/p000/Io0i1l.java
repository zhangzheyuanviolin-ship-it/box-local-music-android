            package p000;

            import android.R;
            import android.app.AlertDialog;
            import android.app.FragmentManager;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.util.Log;
            import android.util.TypedValue;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import java.lang.invoke.VarHandle;
            
            public final class Io0i1l extends Io0iI1l01il {
                public static final Object I0000O = new Object();
                public static final Io0i1l I0000oI00 = new Io0i1l();
                public i0i01Ii0iII I0000Il00O;

                public final void I0000Il00O(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
                    AlertDialog alertDialogCreate;
/* 3 */             Intent intentI00000oIO = super.I00000oIO(i, googleApiActivity, "d");
/* 9 */             i0OoOl1OOii i0oool1ooii = new i0OoOl1OOii();
/* 12 */            i0oool1ooii.I00iOIl = intentI00000oIO;
/* 14 */            i0oool1ooii.I00iiI = googleApiActivity;
/* 16 */            VarHandle.storeStoreFence();
/* 21 */            if (i == 0) {
/* 23 */                alertDialogCreate = null;
                    } else {
/* 28 */                TypedValue typedValue = new TypedValue();
/* 38 */                googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
/* 66 */                AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
/* 67 */                if (builder == null) {
/* 71 */                    builder = new AlertDialog.Builder(googleApiActivity);
                        }
/* 78 */                builder.setMessage(i0Oo1Il.I00000oOI(googleApiActivity, i));
/* 81 */                if (googleApiActivity2 != null) {
/* 83 */                    builder.setOnCancelListener(googleApiActivity2);
                        }
/* 86 */                Resources resources = googleApiActivity.getResources();
/* 125 */               String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.box.gallery.R.string.common_google_play_services_enable_button) : resources.getString(com.box.gallery.R.string.common_google_play_services_update_button) : resources.getString(com.box.gallery.R.string.common_google_play_services_install_button);
/* 129 */               if (string != null) {
/* 131 */                   builder.setPositiveButton(string, i0oool1ooii);
                        }
/* 134 */               String strI00000oIO = i0Oo1Il.I00000oIO(googleApiActivity, i);
/* 138 */               if (strI00000oIO != null) {
/* 140 */                   builder.setTitle(strI00000oIO);
                        }
/* 156 */               Log.w("GoogleApiAvailability", Oi010OO0.I000oI1ioi(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
/* 159 */               alertDialogCreate = builder.create();
                    }
/* 163 */           if (alertDialogCreate == null) {
/* 165 */               return;
                    }
/* 170 */           FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
/* 176 */           Il0oIo0lo il0oIo0lo = new Il0oIo0lo();
/* 179 */           lII0I0I000I.I000O01llI0("Cannot display null dialog", alertDialogCreate);
/* 182 */           alertDialogCreate.setOnCancelListener(null);
/* 185 */           alertDialogCreate.setOnDismissListener(null);
/* 188 */           il0oIo0lo.I00iOIl = alertDialogCreate;
/* 190 */           if (googleApiActivity2 != null) {
/* 192 */               il0oIo0lo.I00iiI = googleApiActivity2;
                    }
/* 194 */           il0oIo0lo.show(fragmentManager, "GooglePlayServicesErrorDialog");
                }

                public final void I0000O(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
                    int i2;
/* 16 */            Log.w("GoogleApiAvailability", IIlIOloOOO.I00100l0("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
/* 22 */            if (i == 18) {
/* 32 */                new i0Oo10I111(this, context).sendEmptyMessageDelayed(1, 120000L);
/* 35 */                return;
                    }
/* 37 */            if (pendingIntent == null) {
/* 39 */                if (i == 6) {
/* 45 */                    Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
/* 48 */                    return;
                        }
/* 48 */                return;
                    }
/* 58 */            String strI0000oI00 = i == 6 ? i0Oo1Il.I0000oI00(context, "common_google_play_services_resolution_required_title") : i0Oo1Il.I00000oIO(context, i);
/* 65 */            if (strI0000oI00 == null) {
/* 71 */                strI0000oI00 = context.getResources().getString(com.box.gallery.R.string.common_google_play_services_notification_ticker);
                    }
/* 93 */            String strI0000O = (i == 6 || i == 19) ? i0Oo1Il.I0000O(context, "common_google_play_services_resolution_required_text", i0Oo1Il.I0000Il00O(context)) : i0Oo1Il.I00000oOI(context, i);
/* 97 */            Resources resources = context.getResources();
/* 103 */           Object systemService = context.getSystemService("notification");
/* 107 */           lII0I0I000I.I000II(systemService);
/* 110 */           NotificationManager notificationManager = (NotificationManager) systemService;
/* 115 */           OIO0oiOO oIO0oiOO = new OIO0oiOO(context, null);
/* 118 */           oIO0oiOO.I000oI1ioi = true;
/* 122 */           oIO0oiOO.I0000O(16, true);
/* 129 */           oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(strI0000oI00);
/* 133 */           OIO0oiIOo1 oIO0oiIOo1 = new OIO0oiIOo1();
/* 140 */           oIO0oiIOo1.I00iiI = OIO0oiOO.I0000Il00O(strI0000O);
/* 142 */           oIO0oiOO.I0000oI00(oIO0oiIOo1);
/* 145 */           PackageManager packageManager = context.getPackageManager();
/* 149 */           Boolean boolValueOf = il1OI0o0Il10.I00000oIO;
/* 151 */           if (boolValueOf == null) {
/* 159 */               boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
/* 163 */               il1OI0o0Il10.I00000oIO = boolValueOf;
                    }
/* 165 */           boolean zBooleanValue = boolValueOf.booleanValue();
/* 170 */           int i3 = R.drawable.stat_sys_warning;
/* 173 */           if (zBooleanValue) {
/* 179 */               int i4 = context.getApplicationInfo().icon;
/* 181 */               if (i4 != 0) {
/* 184 */                   i3 = i4;
                        }
/* 187 */               oIO0oiOO.I001IIilI0O.icon = i3;
/* 189 */               oIO0oiOO.I000OiO = 2;
/* 195 */               if (il1OI0o0Il10.I00000oIO(context)) {
/* 207 */                   oIO0oiOO.I00000oIO(com.box.gallery.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(com.box.gallery.R.string.common_open_on_phone));
                        } else {
/* 211 */                   oIO0oiOO.I000II = pendingIntent;
                        }
                    } else {
/* 216 */               oIO0oiOO.I001IIilI0O.icon = R.drawable.stat_sys_warning;
/* 228 */               oIO0oiOO.I001IIilI0O.tickerText = OIO0oiOO.I0000Il00O(resources.getString(com.box.gallery.R.string.common_google_play_services_notification_ticker));
/* 236 */               oIO0oiOO.I001IIilI0O.when = System.currentTimeMillis();
/* 238 */               oIO0oiOO.I000II = pendingIntent;
/* 244 */               oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(strI0000O);
                    }
                    synchronized (I0000O) {
                    }
/* 252 */           NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
/* 263 */           String string = context.getResources().getString(com.box.gallery.R.string.common_google_play_services_notification_channel_name);
/* 267 */           if (notificationChannel == null) {
/* 275 */               notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
/* 289 */               notificationChannel.setName(string);
/* 292 */               notificationManager.createNotificationChannel(notificationChannel);
                    }
/* 295 */           oIO0oiOO.I0010o = "com.google.android.gms.availability";
/* 297 */           Notification notificationI00000oOI = oIO0oiOO.I00000oOI();
/* 301 */           if (i == 1 || i == 2 || i == 3) {
/* 315 */               Io0ii0lOoi.I00000oIO.set(false);
/* 318 */               i2 = 10436;
                    } else {
/* 308 */               i2 = 39789;
                    }
/* 320 */           notificationManager.notify(i2, notificationI00000oOI);
                }
            }
