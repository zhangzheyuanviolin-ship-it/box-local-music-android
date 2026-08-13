            package com.google.firebase.messaging;

            import android.app.Service;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.text.TextUtils;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Locale;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import p000.I00ioIO;
            import p000.I1Ii1lIoOI;
            import p000.I1o1lOlooI1;
            import p000.IIoIil;
            import p000.IoIlOo1o0IIl;
            import p000.Oi000Oo1;
            import p000.Oi0Oooi;
            import p000.OiI1lOO1O0i;
            import p000.OillOo0;
            import p000.OloIlI0ll;
            import p000.i011oiiI;
            import p000.iO10oo0i1o;
            import p000.iO1O101oi;
            import p000.iiOlilo0IIIl;
            import p000.l1OO1oIO0i1o;
            import p000.lOio0o;
            import p000.lli1OiO;
            import p000.o00io0IiOOo0;
            import p000.o0IiOl;
            
/* 47 */    public class FirebaseMessagingService extends Service {
                public static final ArrayDeque I00io1l = new ArrayDeque(10);
                public final ExecutorService I00iOIl;
                public i011oiiI I00iiI;
                public final Object I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public OiI1lOO1O0i I00ilO0;

                public FirebaseMessagingService() {
/* 9 */             iO10oo0i1o io10oo0i1o = new iO10oo0i1o("Firebase-Messaging-Intent-Handle", 5);
/* 25 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), io10oo0i1o);
/* 28 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 35 */            this.I00iOIl = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 42 */            this.I00iiO = new Object();
/* 45 */            this.I00ilI0I1 = 0;
                }

                public final void I00000oIO(Intent intent) {
/* 1 */             if (intent != null) {
/* 3 */                 iO1O101oi.I00000oOI(intent);
                    }
                    synchronized (this.I00iiO) {
                        try {
                            int i = this.I00ilI0I1 - 1;
/* 13 */                    this.I00ilI0I1 = i;
/* 15 */                    if (i == 0) {
/* 19 */                        stopSelfResult(this.I00iio);
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Intent intent) {
                    String stringExtra;
                    int i;
/* 3 */             String action = intent.getAction();
/* 13 */            if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
/* 30 */                if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
/* 32 */                    intent.getStringExtra("token");
/* 35 */                    return;
                        }
/* 42 */                if ("com.google.firebase.messaging.FCM_REGISTERED".equals(action)) {
/* 44 */                    intent.getStringExtra("token");
/* 47 */                    return;
                        } else if ("com.google.firebase.messaging.FCM_UNREGISTERED".equals(action)) {
/* 56 */                    intent.getStringExtra("token");
/* 59 */                    return;
                        } else {
/* 60 */                    intent.getAction();
/* 63 */                    return;
                        }
                    }
/* 72 */            String stringExtra2 = intent.getStringExtra("google.message_id");
/* 81 */            boolean z = false;
/* 82 */            if (TextUtils.isEmpty(stringExtra2)) {
/* 114 */               stringExtra = intent.getStringExtra("message_type");
/* 118 */               if (stringExtra == null) {
/* 120 */                   stringExtra = "gcm";
                        }
                        switch (stringExtra) {
                            case "deleted_messages":
                                break;
                            case "gcm":
/* 227 */                       l1OO1oIO0i1o.I00000oOI(intent);
/* 230 */                       Bundle extras = intent.getExtras();
/* 234 */                       if (extras == null) {
/* 238 */                           extras = new Bundle();
                                }
/* 243 */                       extras.remove("androidx.content.wakelockid");
/* 250 */                       if (iiOlilo0IIIl.I00IO1(extras)) {
/* 254 */                           iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl(extras);
/* 265 */                           ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new iO10oo0i1o("Firebase-Messaging-Network-Io", 5));
/* 273 */                           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(11, z);
/* 276 */                           ioIlOo1o0IIl.I00iiI = executorServiceNewSingleThreadExecutor;
/* 278 */                           ioIlOo1o0IIl.I00iiO = this;
/* 280 */                           ioIlOo1o0IIl.I00iio = iiolilo0iiil;
/* 282 */                           VarHandle.storeStoreFence();
                                    try {
/* 289 */                               if (!ioIlOo1o0IIl.I001lloI()) {
/* 295 */                                   executorServiceNewSingleThreadExecutor.shutdown();
/* 302 */                                   if (l1OO1oIO0i1o.I0000O(intent)) {
/* 310 */                                       l1OO1oIO0i1o.I0000Il00O("_nf", intent.getExtras());
                                            }
/* 324 */                                   I0000Il00O(new Oi000Oo1(extras));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } finally {
/* 315 */                               executorServiceNewSingleThreadExecutor.shutdown();
                                    }
                                } else {
/* 324 */                           I0000Il00O(new Oi000Oo1(extras));
                                }
                            case "send_error":
/* 197 */                       if (intent.getStringExtra("google.message_id") == null) {
/* 199 */                           intent.getStringExtra("message_id");
                                }
/* 206 */                       String stringExtra3 = intent.getStringExtra("error");
/* 211 */                       new I1o1lOlooI1(stringExtra3, 7);
/* 214 */                       if (stringExtra3 != null) {
/* 223 */                           stringExtra3.toLowerCase(Locale.US).getClass();
                                    break;
                                }
                                break;
                            case "send_event":
/* 188 */                       intent.getStringExtra("google.message_id");
                                break;
                            default:
/* 183 */                       Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                                break;
                        }
                    } else {
/* 85 */                ArrayDeque arrayDeque = I00io1l;
/* 91 */                if (arrayDeque.contains(stringExtra2)) {
/* 93 */                    Log.isLoggable("FirebaseMessaging", 3);
                        } else {
/* 104 */                   if (arrayDeque.size() >= 10) {
/* 106 */                       arrayDeque.remove();
                            }
/* 109 */                   arrayDeque.add(stringExtra2);
/* 114 */                   stringExtra = intent.getStringExtra("message_type");
/* 118 */                   if (stringExtra == null) {
                            }
                            switch (stringExtra) {
                                case -2062414158:
                                    break;
                                case 102161:
                                    break;
                                case 814694033:
                                    break;
                                case 814800675:
                                    break;
                            }
                        }
                    }
/* 327 */           OiI1lOO1O0i oiI1lOO1O0i = this.I00ilO0;
/* 329 */           if (oiI1lOO1O0i == null) {
/* 337 */               oiI1lOO1O0i = new OiI1lOO1O0i(getApplicationContext());
/* 340 */               this.I00ilO0 = oiI1lOO1O0i;
                    }
/* 351 */           if (oiI1lOO1O0i.I0000Il00O.I001i1O0Ol() < 233700000) {
/* 429 */               lOio0o.I0000O(new IOException("SERVICE_NOT_AVAILABLE"));
/* 432 */               return;
                    }
/* 355 */           Bundle bundle = new Bundle();
/* 358 */           String stringExtra4 = intent.getStringExtra("google.message_id");
/* 362 */           if (stringExtra4 == null) {
/* 364 */               stringExtra4 = intent.getStringExtra("message_id");
                    }
/* 368 */           bundle.putString("google.message_id", stringExtra4);
/* 386 */           Integer numValueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
/* 387 */           if (numValueOf != null) {
/* 393 */               bundle.putInt("google.product_id", numValueOf.intValue());
                    }
/* 398 */           o00io0IiOOo0 o00io0iiooo0I000II = o00io0IiOOo0.I000II(oiI1lOO1O0i.I00000oOI);
                    synchronized (o00io0iiooo0I000II) {
/* 405 */               i = o00io0iiooo0I000II.I00iiI;
/* 409 */               o00io0iiooo0I000II.I00iiI = i + 1;
                    }
/* 415 */           o00io0iiooo0I000II.I000O01llI0(new lli1OiO(i, 3, bundle, 0));
                }

                @Override
                public final synchronized IBinder onBind(Intent intent) {
                    i011oiiI i011oiii;
/* 5 */             Log.isLoggable("EnhancedIntentService", 3);
/* 8 */             i011oiii = this.I00iiI;
/* 10 */            if (i011oiii == null) {
/* 19 */                Oi0Oooi oi0Oooi = new Oi0Oooi(9, false);
/* 22 */                oi0Oooi.I00iiI = this;
/* 24 */                VarHandle.storeStoreFence();
/* 27 */                i011oiii = new i011oiiI();
/* 30 */                i011oiii.I000II = oi0Oooi;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                this.I00iiI = i011oiii;
                    }
/* 41 */            return i011oiii;
                }

                @Override
                public final void onDestroy() {
/* 3 */             this.I00iOIl.shutdown();
/* 6 */             super.onDestroy();
                }

                @Override
                public final int onStartCommand(Intent intent, int i, int i2) {
                    synchronized (this.I00iiO) {
/* 4 */                 this.I00iio = i2;
                        this.I00ilI0I1++;
                    }
/* 25 */            Intent intent2 = (Intent) ((ArrayDeque) OillOo0.I000iOII().I00ilI0I1).poll();
/* 28 */            if (intent2 == null) {
/* 30 */                I00000oIO(intent);
/* 27 */                return 2;
                    }
/* 36 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 39 */            ExecutorService executorService = this.I00iOIl;
/* 45 */            I00ioIO i00ioIO = new I00ioIO(11);
/* 48 */            i00ioIO.I00iiI = this;
/* 50 */            i00ioIO.I00iiO = intent2;
/* 52 */            i00ioIO.I00iio = oloIlI0ll;
/* 54 */            VarHandle.storeStoreFence();
/* 57 */            executorService.execute(i00ioIO);
/* 60 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 66 */            if (o0iiol.I000O01llI0()) {
/* 68 */                I00000oIO(intent);
/* 27 */                return 2;
                    }
/* 74 */            I1Ii1lIoOI i1Ii1lIoOI = new I1Ii1lIoOI(1);
/* 80 */            IIoIil iIoIil = new IIoIil(7);
/* 83 */            iIoIil.I00iiI = this;
/* 85 */            iIoIil.I00iiO = intent;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            o0iiol.I00000oOI(i1Ii1lIoOI, iIoIil);
/* 93 */            return 3;
                }

/* 48 */        public void I0000Il00O(Oi000Oo1 oi000Oo1) {
                }
            }
