            package p000;

            import android.R;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcelable;
            
            public final class i0OI0oooo {
                public Context I00000oIO;
                public NotificationManager I00000oOI;

                public final Notification I00000oIO(Bundle bundle) {
                    PendingIntent activity;
/* 6 */             long j = bundle.getLong("notification_timeout", 600000L);
/* 10 */            Context context = this.I00000oIO;
/* 19 */            Notification.Builder timeoutAfter = new Notification.Builder(context, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
/* 25 */            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
/* 32 */            if (parcelable instanceof PendingIntent) {
/* 34 */                activity = (PendingIntent) parcelable;
                    } else if (bundle.getBoolean("notification_intent_reconstruct_from_data")) {
/* 49 */                Intent intent = new Intent();
/* 54 */                String string = bundle.getString("notification_intent_component_class_name");
/* 60 */                String string2 = bundle.getString("notification_intent_component_package_name");
/* 64 */                if (string != null && string2 != null) {
/* 73 */                    intent.setComponent(new ComponentName(string2, string));
                        }
/* 82 */                intent.setPackage(bundle.getString("notification_intent_package"));
/* 91 */                intent.setAction(bundle.getString("notification_intent_action"));
/* 100 */               intent.setFlags(bundle.getInt("notification_intent_flags"));
/* 105 */               String string3 = bundle.getString("notification_intent_data");
/* 109 */               if (string3 != null) {
/* 115 */                   intent.setData(Uri.parse(string3));
                        }
/* 126 */               intent.putExtra("error_doc_id", bundle.getString("notification_intent_extra_error_dialog_document_id"));
/* 131 */               activity = PendingIntent.getActivity(context, 0, intent, 201326592);
                    } else {
/* 45 */                activity = null;
                    }
/* 135 */           if (activity != null) {
/* 137 */               timeoutAfter.setContentIntent(activity);
                    }
/* 142 */           String string4 = bundle.getString("notification_title");
/* 148 */           String string5 = bundle.getString("notification_subtext");
/* 159 */           Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
/* 163 */           if (string4 == null) {
/* 165 */               string4 = "Downloading additional file";
                    }
/* 167 */           Notification.Builder contentTitle = ongoing.setContentTitle(string4);
/* 171 */           if (string5 == null) {
/* 173 */               string5 = "Transferring";
                    }
/* 175 */           contentTitle.setSubText(string5);
/* 180 */           int i = bundle.getInt("notification_color");
/* 184 */           if (i != 0) {
/* 191 */               timeoutAfter.setColor(i).setVisibility(-1);
                    }
/* 194 */           return timeoutAfter.build();
                }

                public final void I00000oOI(Bundle bundle) {
/* 3 */             String string = bundle.getString("notification_channel_name");
                    synchronized (this) {
/* 8 */                 if (string == null) {
/* 10 */                    string = "File downloads by Play";
                        }
                        try {
/* 25 */                    this.I00000oOI.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
