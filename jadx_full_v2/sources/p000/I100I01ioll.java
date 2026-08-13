            package p000;

            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.os.Build;
            import android.util.Log;
            import android.view.MenuItem;
            import android.view.textclassifier.TextClassification;
            
            public final class I100I01ioll implements MenuItem.OnMenuItemClickListener {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                @Override
                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                    switch (this.I00000oIO) {
                        case 0:
/* 105 */                   ((OlolOO0oi) this.I00000oOI).I0000O.invoke(((I100Iil1o1) this.I0000Il00O).I00000oIO);
                            break;
                        default:
/* 9 */                     Context context = (Context) this.I00000oOI;
/* 13 */                    TextClassification textClassification = (TextClassification) this.I0000Il00O;
/* 15 */                    String text = textClassification.getText();
/* 33 */                    PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                            try {
/* 37 */                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
/* 45 */                        if (Build.VERSION.SDK_INT >= 36) {
/* 48 */                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                } else {
/* 54 */                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                }
/* 61 */                        activity.send(activityOptionsMakeBasic.toBundle());
                                break;
                            } catch (PendingIntent.CanceledException e) {
/* 89 */                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                break;
                            }
                    }
/* 3 */             return true;
                }
            }
