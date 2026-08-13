            package com.google.ai.edge.gallery;

            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.media.AudioAttributes;
            import android.media.RingtoneManager;
            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import androidx.core.graphics.drawable.IconCompat;
            import com.box.gallery.MainActivity;
            import com.box.gallery.R;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.HashMap;
            import org.json.JSONException;
            import p000.I1I0i0Ilo1Oi;
            import p000.I1Io0i0II;
            import p000.OIO0o1ll;
            import p000.OIO0oiOO;
            import p000.Oi000Oo1;
            import p000.iiOlilo0IIIl;
            
            public final class GalleryFcmMessagingService extends FirebaseMessagingService {
                @Override
                public final void I0000Il00O(Oi000Oo1 oi000Oo1) throws JSONException, IOException {
                    Intent intent;
/* 1 */             Bundle bundle = oi000Oo1.I00iOIl;
/* 6 */             if (oi000Oo1.I00iiI == null) {
/* 10 */                I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 25 */                for (String str : bundle.keySet()) {
/* 33 */                    Object obj = bundle.get(str);
/* 39 */                    if (obj instanceof String) {
/* 41 */                        String str2 = (String) obj;
/* 49 */                        if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
/* 83 */                            i1Io0i0II.put(str, str2);
                                }
                            }
                        }
/* 87 */                oi000Oo1.I00iiI = i1Io0i0II;
                    }
/* 93 */            HashMap map = new HashMap(oi000Oo1.I00iiI);
/* 98 */            if (oi000Oo1.I00iiO == null && iiOlilo0IIIl.I00IO1(bundle)) {
/* 110 */               iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl(bundle);
/* 115 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(23);
/* 124 */               i1I0i0Ilo1Oi.I00iiI = iiolilo0iiil.I00II0Ol1O0l("gcm.n.title");
/* 126 */               iiolilo0iiil.I001lIiIIo1O("gcm.n.title");
/* 129 */               Object[] objArrI001l0I00 = iiolilo0iiil.I001l0I00("gcm.n.title");
/* 133 */               if (objArrI001l0I00 != null) {
/* 137 */                   String[] strArr = new String[objArrI001l0I00.length];
/* 141 */                   for (int i = 0; i < objArrI001l0I00.length; i++) {
/* 149 */                       strArr[i] = String.valueOf(objArrI001l0I00[i]);
                            }
                        }
/* 160 */               i1I0i0Ilo1Oi.I00iiO = iiolilo0iiil.I00II0Ol1O0l("gcm.n.body");
/* 162 */               iiolilo0iiil.I001lIiIIo1O("gcm.n.body");
/* 165 */               Object[] objArrI001l0I002 = iiolilo0iiil.I001l0I00("gcm.n.body");
/* 169 */               if (objArrI001l0I002 != null) {
/* 173 */                   String[] strArr2 = new String[objArrI001l0I002.length];
/* 177 */                   for (int i2 = 0; i2 < objArrI001l0I002.length; i2++) {
/* 185 */                       strArr2[i2] = String.valueOf(objArrI001l0I002[i2]);
                            }
                        }
/* 192 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.icon");
/* 205 */               if (TextUtils.isEmpty(iiolilo0iiil.I00II0Ol1O0l("gcm.n.sound2"))) {
/* 209 */                   iiolilo0iiil.I00II0Ol1O0l("gcm.n.sound");
                        }
/* 214 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.tag");
/* 219 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.color");
/* 224 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.click_action");
/* 229 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.android_channel_id");
/* 234 */               String strI00II0Ol1O0l = iiolilo0iiil.I00II0Ol1O0l("gcm.n.link_android");
/* 242 */               if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 246 */                   strI00II0Ol1O0l = iiolilo0iiil.I00II0Ol1O0l("gcm.n.link");
                        }
/* 254 */               if (!TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 256 */                   Uri.parse(strI00II0Ol1O0l);
                        }
/* 261 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.image");
/* 266 */               iiolilo0iiil.I00II0Ol1O0l("gcm.n.ticker");
/* 271 */               iiolilo0iiil.I001i1O0Ol("gcm.n.notification_priority");
/* 276 */               iiolilo0iiil.I001i1O0Ol("gcm.n.visibility");
/* 281 */               iiolilo0iiil.I001i1O0Ol("gcm.n.notification_count");
/* 286 */               iiolilo0iiil.I00111O("gcm.n.sticky");
/* 291 */               iiolilo0iiil.I00111O("gcm.n.local_only");
/* 296 */               iiolilo0iiil.I00111O("gcm.n.default_sound");
/* 301 */               iiolilo0iiil.I00111O("gcm.n.default_vibrate_timings");
/* 306 */               iiolilo0iiil.I00111O("gcm.n.default_light_settings");
/* 309 */               iiolilo0iiil.I001lllioOl();
/* 312 */               iiolilo0iiil.I001iOo1i0O();
/* 315 */               iiolilo0iiil.I00II0oii1o();
/* 318 */               VarHandle.storeStoreFence();
/* 321 */               oi000Oo1.I00iiO = i1I0i0Ilo1Oi;
                    }
/* 323 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi2 = oi000Oo1.I00iiO;
/* 331 */           String str3 = (String) map.get("deeplink");
/* 339 */           String str4 = (String) map.get("image_url");
/* 349 */           Uri uri = str4 != null ? Uri.parse(str4) : null;
/* 356 */           String str5 = (String) map.get("title");
/* 358 */           if (str5 == null) {
/* 367 */               str5 = i1I0i0Ilo1Oi2 != null ? (String) i1I0i0Ilo1Oi2.I00iiI : null;
                    }
/* 374 */           String str6 = (String) map.get("body");
/* 376 */           if (str6 == null) {
/* 386 */               str6 = i1I0i0Ilo1Oi2 != null ? (String) i1I0i0Ilo1Oi2.I00iiO : null;
                    }
/* 387 */           if (str5 == null || str6 == null) {
/* 604 */               map.isEmpty();
/* 966 */               return;
                    }
/* 391 */           if (str3 == null || str3.length() == 0) {
/* 421 */               intent = new Intent(this, (Class<?>) MainActivity.class);
/* 426 */               intent.addFlags(67108864);
                    } else {
/* 408 */               intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
/* 413 */               intent.setFlags(268435456);
                    }
/* 431 */           PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
/* 436 */           Uri defaultUri = RingtoneManager.getDefaultUri(2);
/* 444 */           OIO0oiOO oIO0oiOO = new OIO0oiOO(this, "gallery_high_priority_push_channel");
/* 449 */           Notification notification = oIO0oiOO.I001IIilI0O;
/* 451 */           notification.icon = R.mipmap.ic_launcher;
/* 457 */           oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(str5);
/* 463 */           oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(str6);
/* 468 */           oIO0oiOO.I0000O(16, true);
/* 471 */           notification.sound = defaultUri;
/* 474 */           notification.audioStreamType = -1;
/* 495 */           notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
/* 497 */           oIO0oiOO.I000II = activity;
/* 499 */           oIO0oiOO.I000OiO = 1;
/* 501 */           if (uri != null) {
                        try {
/* 512 */                   URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
/* 518 */                   uRLConnectionOpenConnection.setConnectTimeout(5000);
/* 521 */                   uRLConnectionOpenConnection.setReadTimeout(5000);
/* 528 */                   Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
/* 532 */                   if (bitmapDecodeStream != null) {
/* 536 */                       IconCompat iconCompat = new IconCompat(1);
/* 539 */                       iconCompat.I00000oOI = bitmapDecodeStream;
/* 541 */                       oIO0oiOO.I000O01llI0 = iconCompat;
/* 545 */                       OIO0o1ll oIO0o1ll = new OIO0o1ll();
/* 550 */                       IconCompat iconCompat2 = new IconCompat(1);
/* 553 */                       iconCompat2.I00000oOI = bitmapDecodeStream;
/* 555 */                       oIO0o1ll.I00iiI = iconCompat2;
/* 557 */                       oIO0o1ll.I00iiO = null;
/* 559 */                       oIO0o1ll.I00iio = true;
/* 561 */                       oIO0oiOO.I0000oI00(oIO0o1ll);
                            }
                        } catch (Exception e) {
/* 570 */                   Log.w("AGFcmMessagingService", "Failed to download image", e);
                        }
                    }
/* 579 */           NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
/* 593 */           notificationManager.createNotificationChannel(new NotificationChannel("gallery_high_priority_push_channel", getString(R.string.gallery_news_notification_title), 4));
/* 600 */           notificationManager.notify(0, oIO0oiOO.I00000oOI());
                }
            }
