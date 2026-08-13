            package p000;

            import android.app.BroadcastOptions;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.RemoteException;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.regex.Pattern;
            
            public final class OiI1lOO1O0i {
                public static int I000O01llI0;
                public static PendingIntent I000OOo1O;
                public static final Pattern I000OiO = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
                public final Ol0Ii10o1 I00000oIO = new Ol0Ii10o1(0);
                public final Context I00000oOI;
                public final IoOi0looIo I0000Il00O;
                public final ScheduledThreadPoolExecutor I0000O;
                public final Messenger I0000oI00;
                public Messenger I0001Ioi1lo;
                public il1IIi0oI I000II;

                public OiI1lOO1O0i(Context context) {
/* 12 */            this.I00000oOI = context;
/* 16 */            IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 19 */            ioOi0looIo.I00iiI = 0;
/* 21 */            ioOi0looIo.I00iiO = context;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            this.I0000Il00O = ioOi0looIo;
/* 42 */            this.I0000oI00 = new Messenger(new o0oIO0ii0io(this, Looper.getMainLooper()));
/* 55 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new iO10oo0i1o("fcm-rpc-timeout-executor", 5));
/* 62 */            scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
/* 65 */            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
/* 68 */            this.I0000O = scheduledThreadPoolExecutor;
                }

                public final void I00000oIO(String str, Bundle bundle) {
/* 1 */             Ol0Ii10o1 ol0Ii10o1 = this.I00000oIO;
                    synchronized (ol0Ii10o1) {
                        try {
/* 10 */                    OloIlI0ll oloIlI0ll = (OloIlI0ll) ol0Ii10o1.remove(str);
/* 12 */                    if (oloIlI0ll != null) {
/* 48 */                        oloIlI0ll.I00000oOI(bundle);
/* 52 */                        return;
                            }
/* 28 */                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
/* 31 */                    sb.append("Missing callback for ");
/* 34 */                    sb.append(str);
/* 41 */                    Log.w("Rpc", sb.toString());
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                public final o0IiOl I00000oOI(Bundle bundle) {
                    String string;
                    synchronized (OiI1lOO1O0i.class) {
/* 4 */                 int i = I000O01llI0;
/* 8 */                 I000O01llI0 = i + 1;
/* 10 */                string = Integer.toString(i);
                    }
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 20 */            Ol0Ii10o1 ol0Ii10o1 = this.I00000oIO;
                    synchronized (ol0Ii10o1) {
/* 23 */                ol0Ii10o1.put(string, oloIlI0ll);
                    }
/* 29 */            Intent intent = new Intent();
/* 34 */            intent.setPackage("com.google.android.gms");
/* 44 */            if (this.I0000Il00O.I001IO000() == 2) {
/* 48 */                intent.setAction("com.google.iid.TOKEN_REQUEST");
                    } else {
/* 54 */                intent.setAction("com.google.android.c2dm.intent.REGISTER");
                    }
/* 57 */            intent.putExtras(bundle);
/* 60 */            Context context = this.I00000oOI;
                    synchronized (OiI1lOO1O0i.class) {
                        try {
/* 63 */                    PendingIntent broadcast = I000OOo1O;
/* 66 */                    if (broadcast == null) {
/* 70 */                        Intent intent2 = new Intent();
/* 75 */                        intent2.setPackage("com.google.example.invalidpackage");
/* 80 */                        broadcast = PendingIntent.getBroadcast(context, 0, intent2, 33554432);
/* 84 */                        I000OOo1O = broadcast;
                            }
/* 92 */                    intent.putExtra("app", broadcast);
                        } finally {
                        }
                    }
/* 121 */           intent.putExtra("kid", IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
/* 131 */           if (Log.isLoggable("Rpc", 3)) {
/* 143 */               "Sending ".concat(String.valueOf(intent.getExtras()));
                    }
/* 150 */           intent.putExtra("google.messenger", this.I0000oI00);
/* 155 */           if (this.I0001Ioi1lo == null && this.I000II == null) {
/* 190 */               int iI001IO000 = this.I0000Il00O.I001IO000();
/* 194 */               Context context2 = this.I00000oOI;
/* 196 */               if (iI001IO000 == 2) {
/* 212 */                   context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                        } else {
/* 216 */                   context2.startService(intent);
                        }
                    } else {
/* 161 */               Message messageObtain = Message.obtain();
/* 165 */               messageObtain.obj = intent;
                        try {
/* 167 */                   Messenger messenger = this.I0001Ioi1lo;
/* 169 */                   if (messenger != null) {
/* 171 */                       messenger.send(messageObtain);
                            } else {
/* 179 */                       this.I000II.I00iOIl.send(messageObtain);
                            }
                        } catch (RemoteException unused) {
/* 185 */                   Log.isLoggable("Rpc", 3);
                        }
                    }
/* 219 */           ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.I0000O;
/* 223 */           i1IOlOO10o0 i1ioloo10o0 = new i1IOlOO10o0(0);
/* 226 */           i1ioloo10o0.I00iiI = oloIlI0ll;
/* 228 */           VarHandle.storeStoreFence();
/* 235 */           ScheduledFuture<?> scheduledFutureSchedule = scheduledThreadPoolExecutor.schedule(i1ioloo10o0, 30L, TimeUnit.SECONDS);
/* 239 */           o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 241 */           Iii11l iii11l = Iii11l.I00iio;
/* 246 */           Oo1ol1ll oo1ol1ll = new Oo1ol1ll(7);
/* 249 */           oo1ol1ll.I00iiI = this;
/* 251 */           oo1ol1ll.I00iiO = string;
/* 253 */           oo1ol1ll.I00iio = scheduledFutureSchedule;
/* 255 */           VarHandle.storeStoreFence();
/* 258 */           o0iiol.I00000oOI(iii11l, oo1ol1ll);
/* 261 */           return oloIlI0ll.I00000oIO;
                }
            }
