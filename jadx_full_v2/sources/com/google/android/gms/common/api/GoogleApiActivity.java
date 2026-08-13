            package com.google.android.gms.common.api;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.ActivityNotFoundException;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Build;
            import android.os.Bundle;
            import android.util.Log;
            import p000.IIlIOloOOO;
            import p000.IOlo10lO1iOl;
            import p000.Io0i1l;
            import p000.Io0iOoo;
            import p000.O1oo1il01OoO;
            import p000.lII0I0I000I;
            
            public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
                public static final int I00iiI = 0;
                public int I00iOIl = 0;

                @Override
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             super.onActivityResult(i, i2, intent);
/* 6 */             if (i == 1) {
/* 14 */                boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
/* 18 */                this.I00iOIl = 0;
/* 20 */                setResult(i2, intent);
/* 23 */                if (booleanExtra) {
/* 25 */                    Io0iOoo io0iOooI0000O = Io0iOoo.I0000O(this);
/* 30 */                    if (i2 == -1) {
/* 57 */                        O1oo1il01OoO o1oo1il01OoO = io0iOooI0000O.I00lli11;
/* 64 */                        o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(3));
                            } else if (i2 == 0) {
/* 53 */                        io0iOooI0000O.I000II(new IOlo10lO1iOl(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                            }
                        }
                    } else if (i == 2) {
/* 71 */                this.I00iOIl = 0;
/* 73 */                setResult(i2, intent);
                    }
/* 76 */            finish();
                }

                @Override
                public final void onCancel(DialogInterface dialogInterface) {
/* 2 */             this.I00iOIl = 0;
/* 4 */             setResult(0);
/* 7 */             finish();
                }

                @Override
                public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
                    GoogleApiActivity googleApiActivity;
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle != null) {
/* 12 */                this.I00iOIl = bundle.getInt("resolution");
                    }
/* 17 */            if (this.I00iOIl == 1) {
/* 437 */               return;
                    }
/* 23 */            Bundle extras = getIntent().getExtras();
/* 29 */            if (extras == null) {
/* 33 */                Log.e("GoogleApiActivity", "Activity started without extras");
/* 36 */                finish();
/* 39 */                return;
                    }
/* 47 */            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
/* 55 */            Integer num = (Integer) extras.get("error_code");
/* 57 */            if (pendingIntent == null && num == null) {
/* 64 */                Log.e("GoogleApiActivity", "Activity started without resolution");
/* 67 */                finish();
/* 70 */                return;
                    }
/* 71 */            if (pendingIntent == null) {
/* 194 */               lII0I0I000I.I000II(num);
/* 203 */               Io0i1l.I0000oI00.I0000Il00O(this, num.intValue(), this);
/* 206 */               this.I00iOIl = 1;
/* 437 */               return;
                    }
                    try {
/* 82 */                googleApiActivity = this;
                        try {
/* 83 */                    googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
/* 86 */                    googleApiActivity.I00iOIl = 1;
                        } catch (ActivityNotFoundException e) {
/* 92 */                    e = e;
/* 93 */                    ActivityNotFoundException activityNotFoundException = e;
/* 116 */                   if (extras.getBoolean("notify_manager", true)) {
/* 141 */                       Io0iOoo.I0000O(googleApiActivity).I000II(new IOlo10lO1iOl(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                            } else {
/* 145 */                       String string = pendingIntent.toString();
/* 164 */                       String strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
/* 176 */                       if (Build.FINGERPRINT.contains("generic")) {
/* 180 */                           strI0010I0i = strI0010I0i.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                                }
/* 184 */                       Log.e("GoogleApiActivity", strI0010I0i, activityNotFoundException);
                            }
/* 187 */                   googleApiActivity.I00iOIl = 1;
/* 189 */                   googleApiActivity.finish();
                        } catch (IntentSender.SendIntentException e2) {
/* 89 */                    e = e2;
/* 100 */                   Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
/* 103 */                   googleApiActivity.finish();
                        }
                    } catch (ActivityNotFoundException e3) {
/* 107 */               e = e3;
/* 108 */               googleApiActivity = this;
                    } catch (IntentSender.SendIntentException e4) {
/* 95 */                e = e4;
/* 96 */                googleApiActivity = this;
                    }
                }

                @Override
                public final void onSaveInstanceState(Bundle bundle) {
/* 5 */             bundle.putInt("resolution", this.I00iOIl);
/* 8 */             super.onSaveInstanceState(bundle);
                }
            }
