            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            
            public abstract class l1OO1oIO0i1o {
                public static boolean I00000oIO() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
                    try {
/* 4 */                 IlIoliIO.I00000oOI();
/* 7 */                 IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 11 */                ilIoliIOI00000oOI.I00000oIO();
/* 14 */                Context context = ilIoliIOI00000oOI.I00000oIO;
/* 18 */                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
/* 28 */                if (sharedPreferences.contains("export_to_big_query")) {
/* 30 */                    return sharedPreferences.getBoolean("export_to_big_query", false);
                        }
                        try {
/* 35 */                    PackageManager packageManager = context.getPackageManager();
/* 39 */                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Barcode.FORMAT_ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
/* 65 */                        return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
/* 3 */                 return false;
                    } catch (IllegalStateException unused2) {
/* 75 */                Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
/* 3 */                 return false;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:105:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oOI(Intent intent) {
                    int iIntValue;
                    Object[] objArr;
                    String string;
                    String string2;
                    long j;
                    OoIOiO ooIOiO;
                    String str;
/* 7 */             if (I0000O(intent)) {
/* 15 */                I0000Il00O("_nr", intent.getExtras());
                    }
/* 18 */            int i = 0;
/* 40 */            if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : I00000oIO()) {
/* 48 */                OoIOiO ooIOiO2 = (OoIOiO) FirebaseMessaging.I000lI.get();
/* 52 */                if (ooIOiO2 == null) {
/* 56 */                    Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
/* 59 */                    return;
                        }
/* 60 */                String str2 = null;
/* 60 */                O1lOl1101O o1lOl1101O = null;
/* 60 */                str2 = null;
/* 61 */                if (intent == null) {
/* 63 */                    ooIOiO = ooIOiO2;
/* 50 */                    str = "FirebaseMessaging";
                        } else {
/* 68 */                    Bundle extras = intent.getExtras();
/* 72 */                    if (extras == null) {
/* 74 */                        extras = Bundle.EMPTY;
                            }
/* 78 */                    Object obj = extras.get("google.ttl");
/* 84 */                    if (obj instanceof Integer) {
/* 88 */                        iIntValue = ((Integer) obj).intValue();
                            } else if (obj instanceof String) {
                                try {
/* 100 */                           iIntValue = Integer.parseInt((String) obj);
                                } catch (NumberFormatException unused) {
/* 119 */                           Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                }
                            } else {
/* 122 */                       iIntValue = 0;
                            }
/* 125 */                   String string3 = extras.getString("google.to");
/* 133 */                   if (TextUtils.isEmpty(string3)) {
                                try {
/* 136 */                           IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 140 */                           Object obj2 = IlO01o11oOOO.I000lI;
/* 144 */                           ilIoliIOI00000oOI.I00000oIO();
/* 163 */                           string3 = (String) lOio0o.I00000oIO(((IlO01o11oOOO) ilIoliIOI00000oOI.I0000O.I00000oIO(IlO0Ii1Il00o.class)).I0000Il00O());
                                } catch (InterruptedException | ExecutionException e) {
/* 558 */                           IioIoO10iOiI.I000lI(e);
/* 966 */                           return;
                                }
                            }
/* 165 */                   IlIoliIO ilIoliIOI00000oOI2 = IlIoliIO.I00000oOI();
/* 169 */                   ilIoliIOI00000oOI2.I00000oIO();
/* 174 */                   String packageName = ilIoliIOI00000oOI2.I00000oIO.getPackageName();
/* 187 */                   O1lOOl011IoI o1lOOl011IoI = iiOlilo0IIIl.I00IO1(extras) ? O1lOOl011IoI.DISPLAY_NOTIFICATION : O1lOOl011IoI.DATA_MESSAGE;
/* 191 */                   String string4 = extras.getString("google.delivered_priority");
/* 197 */                   if (string4 != null) {
/* 240 */                       objArr = !"high".equals(string4) ? (char) 1 : "normal".equals(string4) ? (char) 2 : (char) 0;
/* 241 */                       if (objArr == 2) {
/* 243 */                           i = 5;
                                } else if (objArr == 1) {
/* 248 */                           i = 10;
                                }
/* 244 */                       int i2 = i;
/* 253 */                       string = extras.getString("google.message_id");
/* 257 */                       if (string == null) {
/* 261 */                           string = extras.getString("message_id");
                                }
/* 269 */                       String str3 = string != null ? string : "";
/* 274 */                       string2 = extras.getString("from");
/* 278 */                       if (string2 != null && string2.startsWith("/topics/")) {
/* 288 */                           str2 = string2;
                                }
/* 289 */                       if (str2 == null) {
/* 265 */                           str2 = "";
                                }
/* 295 */                       String string5 = extras.getString("collapse_key");
/* 301 */                       String str4 = string5 != null ? string5 : "";
/* 306 */                       String string6 = extras.getString("google.c.a.m_l");
/* 314 */                       String str5 = string6 != null ? string6 : "";
/* 319 */                       String string7 = extras.getString("google.c.a.c_l");
/* 265 */                       String str6 = string7 != null ? string7 : "";
/* 334 */                       if (extras.containsKey("google.c.sender.id")) {
                                    try {
/* 340 */                               j = Long.parseLong(extras.getString("google.c.sender.id"));
                                    } catch (NumberFormatException e2) {
/* 350 */                               Log.w("FirebaseMessaging", "error parsing project number", e2);
                                    }
/* 344 */                           ooIOiO = ooIOiO2;
/* 50 */                            str = "FirebaseMessaging";
/* 447 */                           long j2 = j > 0 ? j : 0L;
/* 451 */                           O1lOl1101O o1lOl1101O2 = new O1lOl1101O();
/* 454 */                           o1lOl1101O2.I00000oIO = j2;
/* 456 */                           o1lOl1101O2.I00000oOI = str3;
/* 458 */                           o1lOl1101O2.I0000Il00O = string3;
/* 460 */                           o1lOl1101O2.I0000O = o1lOOl011IoI;
/* 462 */                           o1lOl1101O2.I0000oI00 = packageName;
/* 464 */                           o1lOl1101O2.I0001Ioi1lo = str4;
/* 466 */                           o1lOl1101O2.I000II = i2;
/* 468 */                           o1lOl1101O2.I000O01llI0 = iIntValue;
/* 470 */                           o1lOl1101O2.I000OOo1O = str2;
/* 472 */                           o1lOl1101O2.I000OiO = str5;
/* 474 */                           o1lOl1101O2.I000iOII = str6;
/* 476 */                           VarHandle.storeStoreFence();
/* 479 */                           o1lOl1101O = o1lOl1101O2;
                                } else {
/* 353 */                           IlIoliIO ilIoliIOI00000oOI3 = IlIoliIO.I00000oOI();
/* 357 */                           IlO0oiiii0IO ilO0oiiii0IO = ilIoliIOI00000oOI3.I0000Il00O;
/* 359 */                           ilIoliIOI00000oOI3.I00000oIO();
/* 362 */                           String str7 = ilO0oiiii0IO.I0000oI00;
/* 364 */                           if (str7 != null) {
                                        try {
/* 366 */                                   j = Long.parseLong(str7);
/* 344 */                                   ooIOiO = ooIOiO2;
                                        } catch (NumberFormatException e3) {
/* 372 */                                   ooIOiO = ooIOiO2;
/* 376 */                                   Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                        }
/* 50 */                                str = "FirebaseMessaging";
/* 447 */                               if (j > 0) {
                                        }
/* 451 */                               O1lOl1101O o1lOl1101O22 = new O1lOl1101O();
/* 454 */                               o1lOl1101O22.I00000oIO = j2;
/* 456 */                               o1lOl1101O22.I00000oOI = str3;
/* 458 */                               o1lOl1101O22.I0000Il00O = string3;
/* 460 */                               o1lOl1101O22.I0000O = o1lOOl011IoI;
/* 462 */                               o1lOl1101O22.I0000oI00 = packageName;
/* 464 */                               o1lOl1101O22.I0001Ioi1lo = str4;
/* 466 */                               o1lOl1101O22.I000II = i2;
/* 468 */                               o1lOl1101O22.I000O01llI0 = iIntValue;
/* 470 */                               o1lOl1101O22.I000OOo1O = str2;
/* 472 */                               o1lOl1101O22.I000OiO = str5;
/* 474 */                               o1lOl1101O22.I000iOII = str6;
/* 476 */                               VarHandle.storeStoreFence();
/* 479 */                               o1lOl1101O = o1lOl1101O22;
                                    } else {
/* 380 */                               ooIOiO = ooIOiO2;
                                    }
/* 382 */                           ilIoliIOI00000oOI3.I00000oIO();
/* 385 */                           String str8 = ilO0oiiii0IO.I00000oOI;
/* 395 */                           if (str8.startsWith("1:")) {
/* 409 */                               String[] strArrSplit = str8.split(":");
/* 415 */                               if (strArrSplit.length < 2) {
/* 417 */                                   j = 0;
/* 50 */                                    str = "FirebaseMessaging";
/* 447 */                                   if (j > 0) {
                                            }
/* 451 */                                   O1lOl1101O o1lOl1101O222 = new O1lOl1101O();
/* 454 */                                   o1lOl1101O222.I00000oIO = j2;
/* 456 */                                   o1lOl1101O222.I00000oOI = str3;
/* 458 */                                   o1lOl1101O222.I0000Il00O = string3;
/* 460 */                                   o1lOl1101O222.I0000O = o1lOOl011IoI;
/* 462 */                                   o1lOl1101O222.I0000oI00 = packageName;
/* 464 */                                   o1lOl1101O222.I0001Ioi1lo = str4;
/* 466 */                                   o1lOl1101O222.I000II = i2;
/* 468 */                                   o1lOl1101O222.I000O01llI0 = iIntValue;
/* 470 */                                   o1lOl1101O222.I000OOo1O = str2;
/* 472 */                                   o1lOl1101O222.I000OiO = str5;
/* 474 */                                   o1lOl1101O222.I000iOII = str6;
/* 476 */                                   VarHandle.storeStoreFence();
/* 479 */                                   o1lOl1101O = o1lOl1101O222;
                                        } else {
/* 420 */                                   String str9 = strArrSplit[1];
/* 426 */                                   if (!str9.isEmpty()) {
                                                try {
/* 429 */                                           j = Long.parseLong(str9);
                                                } catch (NumberFormatException e4) {
/* 435 */                                           Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                }
/* 50 */                                        str = "FirebaseMessaging";
/* 447 */                                       if (j > 0) {
                                                }
/* 451 */                                       O1lOl1101O o1lOl1101O2222 = new O1lOl1101O();
/* 454 */                                       o1lOl1101O2222.I00000oIO = j2;
/* 456 */                                       o1lOl1101O2222.I00000oOI = str3;
/* 458 */                                       o1lOl1101O2222.I0000Il00O = string3;
/* 460 */                                       o1lOl1101O2222.I0000O = o1lOOl011IoI;
/* 462 */                                       o1lOl1101O2222.I0000oI00 = packageName;
/* 464 */                                       o1lOl1101O2222.I0001Ioi1lo = str4;
/* 466 */                                       o1lOl1101O2222.I000II = i2;
/* 468 */                                       o1lOl1101O2222.I000O01llI0 = iIntValue;
/* 470 */                                       o1lOl1101O2222.I000OOo1O = str2;
/* 472 */                                       o1lOl1101O2222.I000OiO = str5;
/* 474 */                                       o1lOl1101O2222.I000iOII = str6;
/* 476 */                                       VarHandle.storeStoreFence();
/* 479 */                                       o1lOl1101O = o1lOl1101O2222;
                                            }
                                        }
                                    } else {
                                        try {
/* 397 */                                   j = Long.parseLong(str8);
                                        } catch (NumberFormatException e5) {
/* 403 */                                   Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                        }
/* 50 */                                str = "FirebaseMessaging";
/* 447 */                               if (j > 0) {
                                        }
/* 451 */                               O1lOl1101O o1lOl1101O22222 = new O1lOl1101O();
/* 454 */                               o1lOl1101O22222.I00000oIO = j2;
/* 456 */                               o1lOl1101O22222.I00000oOI = str3;
/* 458 */                               o1lOl1101O22222.I0000Il00O = string3;
/* 460 */                               o1lOl1101O22222.I0000O = o1lOOl011IoI;
/* 462 */                               o1lOl1101O22222.I0000oI00 = packageName;
/* 464 */                               o1lOl1101O22222.I0001Ioi1lo = str4;
/* 466 */                               o1lOl1101O22222.I000II = i2;
/* 468 */                               o1lOl1101O22222.I000O01llI0 = iIntValue;
/* 470 */                               o1lOl1101O22222.I000OOo1O = str2;
/* 472 */                               o1lOl1101O22222.I000OiO = str5;
/* 474 */                               o1lOl1101O22222.I000iOII = str6;
/* 476 */                               VarHandle.storeStoreFence();
/* 479 */                               o1lOl1101O = o1lOl1101O22222;
                                    }
                                }
                            } else {
/* 211 */                       if (!"1".equals(extras.getString("google.priority_reduced"))) {
/* 217 */                           string4 = extras.getString("google.priority");
/* 240 */                           if (!"high".equals(string4)) {
                                    }
/* 241 */                           if (objArr == 2) {
                                    }
/* 244 */                           int i22 = i;
/* 253 */                           string = extras.getString("google.message_id");
/* 257 */                           if (string == null) {
                                    }
/* 269 */                           if (string != null) {
                                    }
/* 274 */                           string2 = extras.getString("from");
/* 278 */                           if (string2 != null) {
/* 288 */                               str2 = string2;
                                    }
/* 289 */                           if (str2 == null) {
                                    }
/* 295 */                           String string52 = extras.getString("collapse_key");
/* 301 */                           if (string52 != null) {
                                    }
/* 306 */                           String string62 = extras.getString("google.c.a.m_l");
/* 314 */                           if (string62 != null) {
                                    }
/* 319 */                           String string72 = extras.getString("google.c.a.c_l");
/* 265 */                           if (string72 != null) {
                                    }
/* 334 */                           if (extras.containsKey("google.c.sender.id")) {
                                    }
                                }
/* 241 */                       if (objArr == 2) {
                                }
/* 244 */                       int i222 = i;
/* 253 */                       string = extras.getString("google.message_id");
/* 257 */                       if (string == null) {
                                }
/* 269 */                       if (string != null) {
                                }
/* 274 */                       string2 = extras.getString("from");
/* 278 */                       if (string2 != null) {
                                }
/* 289 */                       if (str2 == null) {
                                }
/* 295 */                       String string522 = extras.getString("collapse_key");
/* 301 */                       if (string522 != null) {
                                }
/* 306 */                       String string622 = extras.getString("google.c.a.m_l");
/* 314 */                       if (string622 != null) {
                                }
/* 319 */                       String string722 = extras.getString("google.c.a.c_l");
/* 265 */                       if (string722 != null) {
                                }
/* 334 */                       if (extras.containsKey("google.c.sender.id")) {
                                }
                            }
                        }
/* 480 */               if (o1lOl1101O == null) {
/* 966 */                   return;
                        }
                        try {
/* 492 */                   Integer numValueOf = Integer.valueOf(intent.getIntExtra("google.product_id", 111881503));
/* 498 */                   I1lIioOOIIl i1lIioOOIIl = new I1lIioOOIIl();
/* 501 */                   i1lIioOOIIl.I00000oIO = numValueOf;
/* 503 */                   VarHandle.storeStoreFence();
/* 525 */                   OoIOlll0O ooIOlll0OI00000oIO = ((OoIOil1iIO) ooIOiO).I00000oIO("FCM_CLIENT_EVENT_LOGGING", Il0IIil.I00000oIO("proto"), new IoOOl0iOl1io(23));
/* 531 */                   O1lOll o1lOll = new O1lOll();
/* 534 */                   o1lOll.I00000oIO = o1lOl1101O;
/* 536 */                   VarHandle.storeStoreFence();
/* 546 */                   ooIOlll0OI00000oIO.I00000oIO(new I1l0I1oi(o1lOll, OOIio1010OoO.I00iOIl, i1lIioOOIIl));
                        } catch (RuntimeException e6) {
/* 553 */                   Log.w(str, "Failed to send big query analytics payload.", e6);
                        }
                    }
                }

                public static void I0000Il00O(String str, Bundle bundle) {
                    try {
/* 3 */                 IlIoliIO.I00000oOI();
/* 6 */                 if (bundle == null) {
/* 10 */                    bundle = new Bundle();
                        }
/* 15 */                Bundle bundle2 = new Bundle();
/* 20 */                String string = bundle.getString("google.c.a.c_id");
/* 24 */                if (string != null) {
/* 28 */                    bundle2.putString("_nmid", string);
                        }
/* 33 */                String string2 = bundle.getString("google.c.a.c_l");
/* 37 */                if (string2 != null) {
/* 41 */                    bundle2.putString("_nmn", string2);
                        }
/* 46 */                String string3 = bundle.getString("google.c.a.m_l");
/* 54 */                if (!TextUtils.isEmpty(string3)) {
/* 58 */                    bundle2.putString("label", string3);
                        }
/* 63 */                String string4 = bundle.getString("google.c.a.m_c");
/* 71 */                if (!TextUtils.isEmpty(string4)) {
/* 75 */                    bundle2.putString("message_channel", string4);
                        }
/* 80 */                String string5 = bundle.getString("from");
/* 85 */                if (string5 == null || !string5.startsWith("/topics/")) {
/* 96 */                    string5 = null;
                        }
/* 97 */                if (string5 != null) {
/* 101 */                   bundle2.putString("_nt", string5);
                        }
/* 106 */               String string6 = bundle.getString("google.c.a.ts");
/* 110 */               if (string6 != null) {
                            try {
/* 118 */                       bundle2.putInt("_nmt", Integer.parseInt(string6));
                            } catch (NumberFormatException e) {
/* 125 */                       Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                            }
                        }
/* 136 */               String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
/* 140 */               if (string7 != null) {
                            try {
/* 148 */                       bundle2.putInt("_ndt", Integer.parseInt(string7));
                            } catch (NumberFormatException e2) {
/* 155 */                       Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                            }
                        }
/* 167 */               String str2 = iiOlilo0IIIl.I00IO1(bundle) ? "display" : "data";
/* 175 */               if ("_nr".equals(str) || "_nf".equals(str)) {
/* 187 */                   bundle2.putString("_nmc", str2);
                        }
/* 195 */               if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 197 */                   bundle2.toString();
                        }
/* 200 */               IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 204 */               ilIoliIOI00000oOI.I00000oIO();
/* 215 */               I0l01l0 i0l01l0 = (I0l01l0) ilIoliIOI00000oOI.I0000O.I00000oIO(I0l01l0.class);
/* 217 */               if (i0l01l0 != null) {
/* 221 */                   ((I0l01lI0O00l) i0l01l0).I00000oIO(str, bundle2);
                        } else {
/* 227 */                   Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
                        }
                    } catch (IllegalStateException unused) {
/* 233 */               Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
                    }
                }

                public static boolean I0000O(Intent intent) {
                    Bundle extras;
/* 2 */             if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
/* 1 */                 return false;
                    }
/* 32 */            return "1".equals(extras.getString("google.c.a.e"));
                }
            }
