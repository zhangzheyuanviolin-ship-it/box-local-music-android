            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.text.TextUtils;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Locale;
            
            public abstract class i0Oo1Il {
                public static final Ol0Ii10o1 I00000oIO = new Ol0Ii10o1(0);
                public static Locale I00000oOI;

                public static String I00000oIO(Context context, int i) {
/* 1 */             Resources resources = context.getResources();
                    switch (i) {
                        case 1:
/* 140 */                   return resources.getString(R.string.common_google_play_services_install_title);
                        case 2:
/* 132 */                   return resources.getString(R.string.common_google_play_services_update_title);
                        case 3:
/* 124 */                   return resources.getString(R.string.common_google_play_services_enable_title);
                        case 4:
                        case 6:
                        case PoseLandmark.RIGHT_PINKY:
/* 5 */                     return null;
                        case 5:
/* 110 */                   Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
/* 115 */                   return I0000oI00(context, "common_google_play_services_invalid_account_title");
                        case 7:
/* 98 */                    Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
/* 103 */                   return I0000oI00(context, "common_google_play_services_network_error_title");
                        case 8:
/* 92 */                    Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
/* 5 */                     return null;
                        case 9:
/* 86 */                    Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
/* 5 */                     return null;
                        case 10:
/* 80 */                    Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
/* 5 */                     return null;
                        case 11:
/* 74 */                    Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
/* 5 */                     return null;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case PoseLandmark.LEFT_INDEX:
                        default:
/* 23 */                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
/* 28 */                    sb.append("Unexpected error code ");
/* 31 */                    sb.append(i);
/* 38 */                    Log.e("GoogleApiAvailability", sb.toString());
/* 5 */                     return null;
                        case 16:
/* 68 */                    Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
/* 5 */                     return null;
                        case 17:
/* 56 */                    Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
/* 61 */                    return I0000oI00(context, "common_google_play_services_sign_in_failed_title");
                        case PoseLandmark.RIGHT_INDEX:
/* 44 */                    Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
/* 49 */                    return I0000oI00(context, "common_google_play_services_restricted_profile_title");
                    }
                }

                public static String I00000oOI(Context context, int i) {
/* 1 */             Resources resources = context.getResources();
/* 5 */             String strI0000Il00O = I0000Il00O(context);
/* 10 */            if (i == 1) {
/* 151 */               return resources.getString(R.string.common_google_play_services_install_text, strI0000Il00O);
                    }
/* 13 */            if (i == 2) {
                        return il1OI0o0Il10.I00000oIO(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strI0000Il00O);
                    }
/* 16 */            if (i == 3) {
/* 113 */               return resources.getString(R.string.common_google_play_services_enable_text, strI0000Il00O);
                    }
/* 19 */            if (i == 5) {
/* 101 */               return I0000O(context, "common_google_play_services_invalid_account_text", strI0000Il00O);
                    }
/* 22 */            if (i == 7) {
/* 94 */                return I0000O(context, "common_google_play_services_network_error_text", strI0000Il00O);
                    }
/* 26 */            if (i == 9) {
/* 87 */                return resources.getString(R.string.common_google_play_services_unsupported_text, strI0000Il00O);
                    }
/* 30 */            if (i == 20) {
/* 75 */                return I0000O(context, "common_google_play_services_restricted_profile_text", strI0000Il00O);
                    }
                    switch (i) {
                        case 16:
/* 68 */                    return I0000O(context, "common_google_play_services_api_unavailable_text", strI0000Il00O);
                        case 17:
/* 61 */                    return I0000O(context, "common_google_play_services_sign_in_failed_text", strI0000Il00O);
                        case PoseLandmark.RIGHT_PINKY:
/* 54 */                    return resources.getString(R.string.common_google_play_services_updating_text, strI0000Il00O);
                        default:
/* 42 */                    return resources.getString(R.string.common_google_play_services_unknown_issue, strI0000Il00O);
                    }
                }

                public static String I0000Il00O(Context context) {
/* 1 */             String packageName = context.getPackageName();
                    try {
/* 9 */                 Context context2 = i01l1OO001.I00000oIO(context).I00000oIO;
/* 28 */                return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
/* 37 */                String str = context.getApplicationInfo().name;
                        return TextUtils.isEmpty(str) ? packageName : str;
                    }
                }

                public static String I0000O(Context context, String str, String str2) throws Resources.NotFoundException {
/* 1 */             Resources resources = context.getResources();
/* 5 */             String strI0000oI00 = I0000oI00(context, str);
/* 9 */             if (strI0000oI00 == null) {
/* 14 */                strI0000oI00 = resources.getString(R.string.common_google_play_services_unknown_issue);
                    }
/* 28 */            return String.format(resources.getConfiguration().locale, strI0000oI00, str2);
                }

                public static String I0000oI00(Context context, String str) {
                    Resources resourcesForApplication;
/* 1 */             Ol0Ii10o1 ol0Ii10o1 = I00000oIO;
                    synchronized (ol0Ii10o1) {
                        try {
/* 21 */                    Locale localeI00000oIO = iio00I0oi.I00000oIO(context.getResources().getConfiguration()).I00000oIO(0);
/* 31 */                    if (!localeI00000oIO.equals(I00000oOI)) {
/* 33 */                        ol0Ii10o1.clear();
/* 36 */                        I00000oOI = localeI00000oIO;
                            }
/* 45 */                    String str2 = (String) ol0Ii10o1.get(str);
/* 47 */                    if (str2 != null) {
/* 50 */                        return str2;
                            }
/* 51 */                    int i = Io0ii0lOoi.I0000oI00;
                            try {
/* 60 */                        resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                            } catch (PackageManager.NameNotFoundException unused) {
/* 65 */                        resourcesForApplication = null;
                            }
/* 66 */                    if (resourcesForApplication != null) {
/* 74 */                        int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
/* 78 */                        if (identifier == 0) {
/* 90 */                            StringBuilder sb = new StringBuilder(str.length() + 18);
/* 93 */                            sb.append("Missing resource: ");
/* 96 */                            sb.append(str);
/* 103 */                           Log.w("GoogleApiAvailability", sb.toString());
                                } else {
/* 108 */                           String string = resourcesForApplication.getString(identifier);
/* 116 */                           if (!TextUtils.isEmpty(string)) {
/* 146 */                               ol0Ii10o1.put(str, string);
/* 150 */                               return string;
                                    }
/* 128 */                           StringBuilder sb2 = new StringBuilder(str.length() + 20);
/* 131 */                           sb2.append("Got empty resource: ");
/* 134 */                           sb2.append(str);
/* 141 */                           Log.w("GoogleApiAvailability", sb2.toString());
                                }
                            }
/* 53 */                    return null;
                        } finally {
                        }
                    }
                }
            }
