            package com.google.ai.edge.gallery.notifications;

            import android.R;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.util.Log;
            import p000.Ii110ilOil;
            import p000.OIO0oiOO;
            import p000.OIOI0I;
            import p000.OIOI0lo;
            import p000.ilII1li;
            
            public final class NotificationReceiver extends BroadcastReceiver {
                public static final int I0000Il00O = 0;
                public final String I00000oIO = "ai_edge_gallery_notification_channel";
                public final String I00000oOI = "AI Edge Gallery Notifications";

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             intent.toString();
/* 6 */             String stringExtra = intent.getStringExtra("id");
/* 12 */            if (stringExtra == null) {
/* 10 */                stringExtra = "";
                    }
/* 17 */            String stringExtra2 = intent.getStringExtra("title");
/* 21 */            if (stringExtra2 == null) {
/* 23 */                stringExtra2 = "Scheduled task";
                    }
/* 27 */            String stringExtra3 = intent.getStringExtra("message");
/* 31 */            if (stringExtra3 == null) {
/* 33 */                stringExtra3 = "Time to complete your task!";
                    }
/* 37 */            String stringExtra4 = intent.getStringExtra("deeplink");
/* 10 */            String str = stringExtra4 != null ? stringExtra4 : "";
/* 47 */            String stringExtra5 = intent.getStringExtra("channel_id");
/* 51 */            if (stringExtra5 == null) {
/* 53 */                stringExtra5 = this.I00000oIO;
                    }
/* 57 */            String stringExtra6 = intent.getStringExtra("channel_name");
/* 61 */            if (stringExtra6 == null) {
/* 63 */                stringExtra6 = this.I00000oOI;
                    }
                    try {
/* 69 */                Intent intent2 = new Intent("android.intent.action.VIEW");
/* 76 */                if (str.length() > 0) {
/* 82 */                    intent2.setData(Uri.parse(str));
                        }
/* 87 */                intent2.setFlags(335544320);
/* 93 */                PendingIntent activity = PendingIntent.getActivity(context, 0, intent2, 201326592);
/* 103 */               NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
/* 111 */               notificationManager.createNotificationChannel(new NotificationChannel(stringExtra5, stringExtra6, 4));
/* 116 */               OIO0oiOO oIO0oiOO = new OIO0oiOO(context, stringExtra5);
/* 124 */               oIO0oiOO.I001IIilI0O.icon = R.drawable.ic_dialog_info;
/* 130 */               oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(stringExtra2);
/* 136 */               oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(stringExtra3);
/* 141 */               oIO0oiOO.I0000O(16, true);
/* 144 */               oIO0oiOO.I000II = activity;
/* 146 */               oIO0oiOO.I000OiO = 1;
/* 157 */               notificationManager.notify((int) System.currentTimeMillis(), oIO0oiOO.I00000oOI());
/* 166 */               if (intent.getBooleanExtra("repeat_daily", false) || stringExtra.length() <= 0) {
/* 199 */                   return;
                        }
/* 196 */               ((OIOI0I) ((Ii110ilOil) ((OIOI0lo) ilII1li.I00000oIO(context.getApplicationContext(), OIOI0lo.class))).I000o00OoI0I.get()).I00000oIO(stringExtra);
                    } catch (Exception e) {
/* 205 */               Log.e("NotificationReceiver", "Failed to send notification", e);
                    }
                }
            }
