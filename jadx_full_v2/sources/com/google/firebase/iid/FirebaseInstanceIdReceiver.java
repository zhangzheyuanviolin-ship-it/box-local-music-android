            package com.google.firebase.iid;

            import android.app.PendingIntent;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.SoftReference;
            import java.util.Objects;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import p000.iO10oo0i1o;
            import p000.ioli0l0;
            import p000.l1OO1oIO0i1o;
            
            public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
                public static SoftReference I00000oIO;
                public static SoftReference I00000oOI;

                public static int I00000oIO(Intent intent) throws PendingIntent.CanceledException {
/* 7 */             PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
/* 11 */            if (pendingIntent != null) {
                        try {
/* 13 */                    pendingIntent.send();
                        } catch (PendingIntent.CanceledException unused) {
/* 19 */                    Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
                        }
                    }
/* 22 */            Bundle extras = intent.getExtras();
/* 26 */            if (extras != null) {
/* 28 */                extras.remove("pending_intent");
                    } else {
/* 34 */                extras = new Bundle();
                    }
/* 47 */            if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
/* 77 */                Log.e("CloudMessagingReceiver", "Unknown notification action");
/* 80 */                return 500;
                    }
/* 54 */            Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
/* 62 */            if (!l1OO1oIO0i1o.I0000O(intentPutExtras)) {
/* 73 */                return -1;
                    }
/* 70 */            l1OO1oIO0i1o.I0000Il00O("_nd", intentPutExtras.getExtras());
/* 73 */            return -1;
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
                    ExecutorService executorServiceUnconfigurableExecutorService;
/* 1 */             if (intent == null) {
/* 3 */                 return;
                    }
/* 4 */             boolean zIsOrderedBroadcast = isOrderedBroadcast();
/* 8 */             BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                    synchronized (FirebaseInstanceIdReceiver.class) {
                        try {
/* 15 */                    SoftReference softReference = I00000oIO;
/* 28 */                    executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
/* 29 */                    if (executorServiceUnconfigurableExecutorService == null) {
/* 43 */                        executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new iO10oo0i1o("firebase-iid-executor", 5)));
/* 52 */                        I00000oIO = new SoftReference(executorServiceUnconfigurableExecutorService);
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 58 */            ioli0l0 ioli0l0Var = new ioli0l0(0);
/* 61 */            ioli0l0Var.I00iiO = intent;
/* 63 */            ioli0l0Var.I00iio = context;
/* 65 */            ioli0l0Var.I00iiI = zIsOrderedBroadcast;
/* 67 */            ioli0l0Var.I00ilI0I1 = pendingResultGoAsync;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            executorServiceUnconfigurableExecutorService.execute(ioli0l0Var);
                }
            }
