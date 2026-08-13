            package com.google.android.gms.measurement;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.os.PowerManager;
            import android.util.SparseArray;
            import java.lang.invoke.VarHandle;
            import p000.i0001Io0l1;
            import p000.iOloo0O0O;
            import p000.l01O0IO1ooO0;
            import p000.l0olllO1i;
            
            public final class AppMeasurementReceiver extends i0001Io0l1 {
                public iOloo0O0O I0000Il00O;

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 3 */             if (this.I0000Il00O == null) {
/* 9 */                 iOloo0O0O ioloo0o0o = new iOloo0O0O(26);
/* 12 */                VarHandle.storeStoreFence();
/* 15 */                this.I0000Il00O = ioloo0o0o;
                    }
/* 22 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllO1i.I000l1(context, null, null, null).I00ilO0;
/* 24 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 27 */            if (intent == null) {
/* 33 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Receiver called with null intent");
/* 36 */                return;
                    }
/* 37 */            String action = intent.getAction();
/* 45 */            l01o0io1ooo0.I00lll10.I0000Il00O("Local receiver got", action);
/* 54 */            if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
/* 162 */               if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
/* 168 */                   l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Install Referrer Broadcasts are deprecated");
/* 332 */                   return;
                        }
/* 332 */               return;
                    }
/* 63 */            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
/* 69 */            className.setAction("com.google.android.gms.measurement.UPLOAD");
/* 76 */            l01o0io1ooo0.I00lll10.I00000oOI("Starting wakeful intent.");
/* 81 */            SparseArray sparseArray = i0001Io0l1.I00000oIO;
                    synchronized (sparseArray) {
                        try {
/* 84 */                    int i = i0001Io0l1.I00000oOI;
/* 86 */                    int i2 = i + 1;
/* 88 */                    i0001Io0l1.I00000oOI = i2;
/* 91 */                    if (i2 <= 0) {
/* 93 */                        i0001Io0l1.I00000oOI = 1;
                            }
/* 100 */                   className.putExtra("androidx.contentpager.content.wakelockid", i);
/* 103 */                   ComponentName componentNameStartService = context.startService(className);
/* 107 */                   if (componentNameStartService == null) {
/* 110 */                       return;
                            }
/* 135 */                   PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
/* 140 */                   wakeLockNewWakeLock.setReferenceCounted(false);
/* 146 */                   wakeLockNewWakeLock.acquire(60000L);
/* 149 */                   sparseArray.put(i, wakeLockNewWakeLock);
                        } catch (Throwable th) {
/* 155 */                   throw th;
                        }
                    }
                }
            }
