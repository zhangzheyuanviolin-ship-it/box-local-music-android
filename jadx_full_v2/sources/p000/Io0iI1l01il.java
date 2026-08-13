            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageInstaller;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
            import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Iterator;
            
            public class Io0iI1l01il {
                public static final int I00000oIO;
                public static final Io0iI1l01il I00000oOI;

                static {
/* 1 */             int i = Io0ii0lOoi.I0000oI00;
/* 6 */             I00000oIO = 12451000;
/* 13 */            I00000oOI = new Io0iI1l01il();
                }

                public Intent I00000oIO(int i, Context context, String str) {
/* 4 */             if (i != 1 && i != 2) {
/* 11 */                if (i != 3) {
/* 10 */                    return null;
                        }
/* 16 */                Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
/* 24 */                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
/* 27 */                intent.setData(uriFromParts);
/* 30 */                return intent;
                    }
/* 31 */            if (context != null && il1OI0o0Il10.I00000oIO(context)) {
/* 44 */                Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
/* 49 */                intent2.setPackage("com.google.android.wearable.app");
/* 52 */                return intent2;
                    }
/* 57 */            StringBuilder sb = new StringBuilder("gcore_");
/* 62 */            sb.append(I00000oIO);
/* 67 */            sb.append("-");
/* 74 */            if (!TextUtils.isEmpty(str)) {
/* 76 */                sb.append(str);
                    }
/* 79 */            sb.append("-");
/* 82 */            if (context != null) {
/* 88 */                sb.append(context.getPackageName());
                    }
/* 91 */            sb.append("-");
/* 94 */            if (context != null) {
                        try {
/* 111 */                   sb.append(i01l1OO001.I00000oIO(context).I0000Il00O(0, context.getPackageName()).versionCode);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
/* 114 */           String string = sb.toString();
/* 122 */           Intent intent3 = new Intent("android.intent.action.VIEW");
/* 137 */           Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
/* 145 */           if (!TextUtils.isEmpty(string)) {
/* 149 */               builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
                    }
/* 156 */           intent3.setData(builderAppendQueryParameter.build());
/* 161 */           intent3.setPackage("com.android.vending");
/* 166 */           intent3.addFlags(524288);
/* 408 */           return intent3;
                }

                /* JADX WARN: Removed duplicated region for block: B:108:0x0229 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x022a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int I00000oOI(Context context, int i) {
                    boolean z;
                    PackageInfo packageInfo;
                    Bundle bundle;
/* 1 */             int i2 = Io0ii0lOoi.I0000oI00;
                    try {
/* 10 */                context.getResources().getString(R.string.common_google_play_services_unknown_issue);
                    } catch (Throwable unused) {
/* 18 */                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                    }
/* 31 */            boolean z2 = true;
/* 32 */            if (!"com.google.android.gms".equals(context.getPackageName()) && !Io0ii0lOoi.I0000O.get()) {
                        synchronized (iO1iiliIOi.I00000oIO) {
                            try {
/* 49 */                        if (!iO1iiliIOi.I00000oOI) {
/* 55 */                            iO1iiliIOi.I00000oOI = true;
                                    try {
/* 71 */                                bundle = i01l1OO001.I00000oIO(context).I00000oIO(Barcode.FORMAT_ITF, context.getPackageName()).metaData;
                                    } catch (PackageManager.NameNotFoundException e) {
/* 96 */                                Log.wtf("MetadataValueReader", "This should never happen.", e);
                                    }
/* 73 */                            if (bundle != null) {
/* 79 */                                bundle.getString("com.google.app.id");
/* 88 */                                iO1iiliIOi.I0000Il00O = bundle.getInt("com.google.android.gms.version");
                                    }
                                }
                            } finally {
                            }
                        }
/* 100 */               int i3 = iO1iiliIOi.I0000Il00O;
/* 102 */               if (i3 == 0) {
/* 165 */                   throw new GooglePlayServicesMissingManifestValueException();
                        }
/* 107 */               if (i3 != 12451000) {
/* 112 */                   int i4 = I00000oIO;
/* 137 */                   StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 104 + String.valueOf(i3).length() + 194);
/* 144 */                   IIlIOloOOO.I001l0I00(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i4, " but found ", i3);
/* 149 */                   sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
/* 159 */                   throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
                        }
                    }
/* 173 */           if (il1OI0o0Il10.I00000oIO(context)) {
/* 203 */               z = false;
                    } else {
/* 175 */               Boolean boolValueOf = il1OI0o0Il10.I0000Il00O;
/* 177 */               if (boolValueOf == null) {
/* 189 */                   boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
/* 193 */                   il1OI0o0Il10.I0000Il00O = boolValueOf;
                        }
/* 199 */               if (!boolValueOf.booleanValue()) {
/* 201 */                   z = true;
                        }
                    }
/* 209 */           lII0I0I000I.I00000oOI(i >= 0);
/* 212 */           String packageName = context.getPackageName();
/* 216 */           PackageManager packageManager = context.getPackageManager();
/* 220 */           int i5 = 9;
/* 222 */           if (z) {
                        try {
/* 229 */                   packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
                        } catch (PackageManager.NameNotFoundException unused2) {
/* 246 */                   Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    } else {
/* 251 */               packageInfo = null;
                    }
                    try {
/* 257 */               PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
/* 261 */               Io0ii1o0.I00000oIO(context);
/* 268 */               if (!Io0ii1o0.I0000Il00O(packageInfo2, true)) {
/* 282 */                   Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                        } else if (z) {
/* 289 */                   lII0I0I000I.I000II(packageInfo);
/* 296 */                   if (!Io0ii1o0.I0000Il00O(packageInfo, true)) {
/* 310 */                       Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            } else if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
/* 350 */                       int i6 = packageInfo2.versionCode;
/* 364 */                       if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
/* 398 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i6).length());
/* 403 */                           sb2.append("Google Play services out of date for ");
/* 406 */                           sb2.append(packageName);
/* 411 */                           sb2.append(".  Requires ");
/* 414 */                           sb2.append(i);
/* 419 */                           sb2.append(" but found ");
/* 422 */                           sb2.append(i6);
/* 431 */                           Log.w("GooglePlayServicesUtil", sb2.toString());
/* 434 */                           i5 = 2;
                                } else {
/* 436 */                           ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
/* 438 */                           if (applicationInfo == null) {
                                        try {
/* 442 */                                   applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                        } catch (PackageManager.NameNotFoundException e2) {
/* 460 */                                   Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
/* 463 */                                   i5 = 1;
/* 491 */                                   if (i5 != 18) {
                                            }
/* 552 */                                   if (z2) {
                                            }
                                        }
                                    }
/* 471 */                           i5 = !applicationInfo.enabled ? 3 : 0;
                                }
                            } else {
/* 345 */                       Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
/* 485 */               Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                    }
/* 491 */           if (i5 != 18) {
/* 494 */               if (i5 == 1) {
                            try {
/* 510 */                       Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                                while (true) {
/* 518 */                           if (!it.hasNext()) {
/* 547 */                               z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                        break;
                                    }
/* 534 */                           if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                        break;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException | Exception unused4) {
                            }
                        } else {
/* 551 */                   z2 = false;
                        }
                    }
/* 552 */           if (z2) {
/* 900 */               return i5;
                    }
/* 489 */           return 18;
                }
            }
