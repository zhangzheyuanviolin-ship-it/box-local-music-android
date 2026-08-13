            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.Parcelable;
            import android.util.Log;
            import java.util.Objects;
            import java.util.regex.Matcher;
            
            public final class o0oIO0ii0io extends O1oo1il01OoO {
                public final OiI1lOO1O0i I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0oIO0ii0io(OiI1lOO1O0i oiI1lOO1O0i, Looper looper) {
/* 6 */             super(looper, 8, false);
/* 1 */             this.I00000oOI = oiI1lOO1O0i;
/* 9 */             Looper.getMainLooper();
                }

                @Override
                public final void handleMessage(Message message) {
/* 1 */             OiI1lOO1O0i oiI1lOO1O0i = this.I00000oOI;
/* 3 */             if (message != null) {
/* 5 */                 Object obj = message.obj;
/* 9 */                 if (obj instanceof Intent) {
/* 11 */                    Intent intent = (Intent) obj;
/* 18 */                    intent.setExtrasClassLoader(new iil1ilo());
/* 27 */                    if (intent.hasExtra("google.messenger")) {
/* 31 */                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
/* 37 */                        if (parcelableExtra instanceof il1IIi0oI) {
/* 42 */                            oiI1lOO1O0i.I000II = (il1IIi0oI) parcelableExtra;
                                }
/* 46 */                        if (parcelableExtra instanceof Messenger) {
/* 50 */                            oiI1lOO1O0i.I0001Ioi1lo = (Messenger) parcelableExtra;
                                }
                            }
/* 54 */                    Intent intent2 = (Intent) message.obj;
/* 56 */                    String action = intent2.getAction();
/* 67 */                    if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
/* 75 */                        if (Log.isLoggable("Rpc", 3)) {
/* 83 */                            "Unexpected response action: ".concat(String.valueOf(action));
/* 86 */                            return;
                                }
/* 294 */                       return;
                            }
/* 89 */                    String stringExtra = intent2.getStringExtra("registration_id");
/* 93 */                    if (stringExtra == null) {
/* 97 */                        stringExtra = intent2.getStringExtra("unregistered");
                            }
/* 103 */                   if (stringExtra != null) {
/* 248 */                       Matcher matcher = OiI1lOO1O0i.I000OiO.matcher(stringExtra);
/* 256 */                       if (!matcher.matches()) {
/* 264 */                           if (Log.isLoggable("Rpc", 3)) {
/* 268 */                               "Unexpected response string: ".concat(stringExtra);
/* 271 */                               return;
                                    }
/* 294 */                           return;
                                }
/* 272 */                       String strGroup = matcher.group(1);
/* 276 */                       String strGroup2 = matcher.group(2);
/* 280 */                       if (strGroup != null) {
/* 282 */                           Bundle extras = intent2.getExtras();
/* 288 */                           extras.putString("registration_id", strGroup2);
/* 291 */                           oiI1lOO1O0i.I00000oIO(strGroup, extras);
/* 294 */                           return;
                                }
/* 294 */                       return;
                            }
/* 107 */                   String stringExtra2 = intent2.getStringExtra("error");
/* 111 */                   if (stringExtra2 == null) {
/* 129 */                       Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
/* 132 */                       return;
                            }
/* 139 */                   if (Log.isLoggable("Rpc", 3)) {
/* 143 */                       "Received InstanceID error ".concat(stringExtra2);
                            }
/* 152 */                   if (!stringExtra2.startsWith("|")) {
/* 216 */                       Ol0Ii10o1 ol0Ii10o1 = oiI1lOO1O0i.I00000oIO;
                                synchronized (ol0Ii10o1) {
/* 222 */                           for (int i = 0; i < ol0Ii10o1.I00iiO; i++) {
                                        try {
/* 234 */                                   oiI1lOO1O0i.I00000oIO((String) ol0Ii10o1.I000II(i), intent2.getExtras());
                                        } catch (Throwable th) {
/* 245 */                                   throw th;
                                        }
                                    }
                                }
/* 243 */                       return;
                            }
/* 156 */                   String[] strArrSplit = stringExtra2.split("\\|");
/* 161 */                   if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
/* 212 */                       Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
/* 215 */                       return;
                            }
/* 174 */                   String str = strArrSplit[2];
/* 176 */                   String strSubstring = strArrSplit[3];
/* 184 */                   if (strSubstring.startsWith(":")) {
/* 186 */                       strSubstring = strSubstring.substring(1);
                            }
/* 200 */                   oiI1lOO1O0i.I00000oIO(str, intent2.putExtra("error", strSubstring).getExtras());
/* 203 */                   return;
                        }
                    }
/* 299 */           Log.w("Rpc", "Dropping invalid message");
                }
            }
