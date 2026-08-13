            package p000;

            import android.R;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.net.Uri;
            import android.os.Bundle;
            import androidx.work.impl.model.WorkSpec;
            import com.google.ai.edge.gallery.worker.DownloadWorker;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import java.util.UUID;
            
            public final class Ii1lo00I1 {
                public Context I00000oIO;
                public Ilo0lli0o I00000oOI;
                public i01IlOO I0000Il00O;
                public SharedPreferences I0000O;

                public final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, IlliIl1l11O illiIl1l11O) {
                    String str;
/* 7 */             i01IlOO i01iloo = this.I0000Il00O;
/* 9 */             String str2 = o1oIOiI11o0.I00000oIO;
/* 13 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 16 */            long j = o1oIOiI11o0.I000OOo1O;
/* 18 */            List list = o1oIOiI11o0.I000l1;
/* 21 */            List list2 = list;
/* 23 */            Iterator it = list2.iterator();
/* 27 */            long j2 = 0;
/* 33 */            while (it.hasNext()) {
/* 43 */                j2 += ((O1oIOoi0oo) it.next()).I0000O;
                    }
/* 48 */            linkedHashMap.put("KEY_MODEL_NAME", str2);
/* 55 */            linkedHashMap.put("KEY_MODEL_URL", o1oIOiI11o0.I000O01llI0);
/* 62 */            linkedHashMap.put("KEY_MODEL_COMMIT_HASH", o1oIOiI11o0.I000iOII);
/* 69 */            linkedHashMap.put("KEY_MODEL_DOWNLOAD_MODEL_DIR", o1oIOiI11o0.I00IioO0OiOi);
/* 76 */            linkedHashMap.put("KEY_MODEL_DOWNLOAD_FILE_NAME", o1oIOiI11o0.I000OiO);
/* 83 */            linkedHashMap.put("KEY_MODEL_IS_ZIP", Boolean.FALSE);
/* 90 */            linkedHashMap.put("KEY_MODEL_UNZIPPED_DIR", o1oIOiI11o0.I001IIilI0O);
/* 99 */            linkedHashMap.put("KEY_MODEL_TOTAL_BYTES", Long.valueOf(j + j2));
/* 108 */           if (!list.isEmpty()) {
/* 129 */               linkedHashMap.put("KEY_MODEL_EXTRA_DATA_URLS", IOOi0Ool1i.I00IlilI0i0i(list2, ",", null, null, new IO1I11OO(21), 30));
/* 147 */               linkedHashMap.put("KEY_MODEL_EXTRA_DATA_DOWNLOAD_FILE_NAMES", IOOi0Ool1i.I00IlilI0i0i(list2, ",", null, null, new IO1I11OO(22), 30));
                    }
/* 150 */           String str3 = o1oIOiI11o0.I00Iooi00oi;
/* 152 */           if (str3 != null) {
/* 156 */               linkedHashMap.put("KEY_MODEL_DOWNLOAD_ACCESS_TOKEN", str3);
                    }
/* 161 */           Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 164 */           il01ool0o.I0000Il00O(ii11I1OOII1);
/* 171 */           I1ii1l10IO i1ii1l10IO = new I1ii1l10IO(DownloadWorker.class);
/* 176 */           Set set = (Set) i1ii1l10IO.I0000O;
/* 180 */           OIIOlI oIIOlI = OIIOlI.I00iOIl;
/* 232 */           IOo0o10i1IO iOo0o10i1IO = new IOo0o10i1IO(new OIIOOo(null), this.I00000oIO.getSharedPreferences("box_settings", 0).getBoolean("downloads_wifi_only", false) ? OIIOlI.I00iiO : OIIOlI.I00iiI, false, false, false, false, -1L, -1L, IOOi0Ool1i.I00iio(new LinkedHashSet()));
/* 237 */           WorkSpec workSpec = (WorkSpec) i1ii1l10IO.I0000Il00O;
/* 239 */           workSpec.constraints = iOo0o10i1IO;
/* 241 */           OIio0Ii1Ii oIio0Ii1Ii = OIio0Ii1Ii.I00iOIl;
/* 244 */           workSpec.expedited = true;
/* 246 */           workSpec.outOfQuotaPolicy = oIio0Ii1Ii;
/* 248 */           I1o1O1Ii1l0l i1o1O1Ii1l0l = I1o1O1Ii1l0l.I00iiI;
/* 250 */           i1ii1l10IO.I00000oIO = true;
/* 252 */           workSpec.backoffPolicy = i1o1O1Ii1l0l;
/* 256 */           workSpec.setBackoffDelayDuration(10000L);
/* 263 */           ((WorkSpec) i1ii1l10IO.I0000Il00O).input = ii11I1OOII1;
/* 279 */           set.add("modelName:" + str2);
/* 282 */           if (oloIl1l1oOii == null || (str = oloIl1l1oOii.I00000oIO) == null) {
/* 288 */               str = "";
                    }
/* 296 */           set.add("taskId:".concat(str));
/* 299 */           OIi0i0 oIi0i0I00000oIO = i1ii1l10IO.I00000oIO();
/* 303 */           UUID uuid = oIi0i0I00000oIO.I00000oIO;
/* 317 */           new i01I0IOOI10(i01iloo, str2, Il1OO1ilo0o1.I00iOIl, Collections.singletonList(oIi0i0I00000oIO), null).I00000oIO();
/* 320 */           O1ii11 o1ii11I0000Il00O = i01iloo.I0000Il00O(uuid);
/* 327 */           I0IO1io0I i0IO1io0I = new I0IO1io0I(5);
/* 330 */           i0IO1io0I.I00iiO = this;
/* 332 */           i0IO1io0I.I00iio = o1oIOiI11o0;
/* 336 */           i0IO1io0I.I00ilI0I1 = illiIl1l11O;
/* 338 */           i0IO1io0I.I00ilO0 = uuid;
/* 340 */           i0IO1io0I.I00iiI = oloIl1l1oOii;
/* 342 */           VarHandle.storeStoreFence();
/* 347 */           Iil0OiI1il0 iil0OiI1il0 = new Iil0OiI1il0();
/* 350 */           iil0OiI1il0.I00iOIl = i0IO1io0I;
/* 352 */           VarHandle.storeStoreFence();
/* 355 */           o1ii11I0000Il00O.I0001Ioi1lo(iil0OiI1il0);
                }

                public final void I00000oOI(String str, String str2, String str3, String str4) {
                    Intent intent;
/* 5 */             if (this.I00000oOI.I00000oIO) {
/* 186 */               return;
                    }
/* 29 */            ((NotificationManager) this.I00000oIO.getSystemService("notification")).createNotificationChannel(new NotificationChannel("download_notification", "AI Edge Gallery download notification", 4));
/* 36 */            if (str3.length() == 0) {
/* 50 */                intent = this.I00000oIO.getPackageManager().getLaunchIntentForPackage(this.I00000oIO.getPackageName());
                    } else if (str3.equals("___")) {
/* 75 */                intent = new Intent("android.intent.action.VIEW", Uri.parse("com.box.gallery://global_model_manager"));
/* 78 */                intent.setFlags(268435456);
                    } else {
/* 112 */               Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("com.box.gallery://model/" + str3 + "/" + str4));
/* 115 */               intent2.setFlags(268435456);
/* 118 */               intent = intent2;
                    }
/* 124 */           PendingIntent activity = PendingIntent.getActivity(this.I00000oIO, 0, intent, 201326592);
/* 132 */           OIO0oiOO oIO0oiOO = new OIO0oiOO(this.I00000oIO, "download_notification");
/* 140 */           oIO0oiOO.I001IIilI0O.icon = R.drawable.ic_dialog_info;
/* 146 */           oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(str);
/* 152 */           oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(str2);
/* 155 */           oIO0oiOO.I000OiO = 1;
/* 157 */           oIO0oiOO.I000II = activity;
/* 161 */           oIO0oiOO.I0000O(16, true);
/* 164 */           Context context = this.I00000oIO;
/* 174 */           NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
/* 184 */           if (iOI10i0I11.I00000oIO(this.I00000oIO, "android.permission.POST_NOTIFICATIONS") != 0) {
/* 186 */               return;
                    }
/* 187 */           Notification notificationI00000oOI = oIO0oiOO.I00000oOI();
/* 191 */           Bundle bundle = notificationI00000oOI.extras;
/* 194 */           if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
/* 257 */               notificationManager.notify(null, 1, notificationI00000oOI);
/* 1182 */              return;
                    }
/* 206 */           String packageName = context.getPackageName();
/* 210 */           OIO11I1l oIO11I1l = new OIO11I1l();
/* 213 */           oIO11I1l.I00000oIO = packageName;
/* 215 */           oIO11I1l.I00000oOI = notificationI00000oOI;
/* 217 */           VarHandle.storeStoreFence();
                    synchronized (OIO1O1ill0.I0000O) {
                        try {
/* 223 */                   OIO1IOl oIO1IOl = OIO1O1ill0.I0000oI00;
/* 225 */                   if (oIO1IOl == null) {
/* 233 */                       oIO1IOl = new OIO1IOl(context.getApplicationContext());
/* 236 */                       OIO1O1ill0.I0000oI00 = oIO1IOl;
                            }
/* 247 */                   oIO1IOl.I00iiI.obtainMessage(0, oIO11I1l).sendToTarget();
                        } catch (Throwable th) {
/* 256 */                   throw th;
                        }
                    }
/* 251 */           notificationManager.cancel(null, 1);
                }
            }
