            package p000;

            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.app.RemoteAction;
            import android.os.Build;
            import android.util.Log;
            import android.view.MenuItem;
            
            public final class Oo0lolo11i implements MenuItem.OnMenuItemClickListener {
                public RemoteAction I00000oIO;

                @Override
                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
/* 3 */             PendingIntent actionIntent = this.I00000oIO.getActionIntent();
                    try {
/* 8 */                 ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
/* 16 */                if (Build.VERSION.SDK_INT >= 36) {
/* 19 */                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                        } else {
/* 25 */                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                        }
/* 32 */                actionIntent.send(activityOptionsMakeBasic.toBundle());
/* 7 */                 return true;
                    } catch (PendingIntent.CanceledException e) {
/* 60 */                Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
/* 7 */                 return true;
                    }
                }
            }
