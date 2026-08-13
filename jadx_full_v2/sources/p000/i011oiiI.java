            package p000;

            import android.content.Intent;
            import android.os.Binder;
            import android.os.Process;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            
            public final class i011oiiI extends Binder {
                public Oi0Oooi I000II;

                public final void I00000oIO(i011ol i011olVar) {
/* 9 */             if (Binder.getCallingUid() != Process.myUid()) {
/* 168 */               throw new SecurityException("Binding only allowed within app");
                    }
/* 14 */            Log.isLoggable("FirebaseMessaging", 3);
/* 17 */            Oi0Oooi oi0Oooi = this.I000II;
/* 19 */            Intent intent = i011olVar.I00000oIO;
/* 23 */            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) oi0Oooi.I00iiI;
/* 25 */            firebaseMessagingService.getClass();
/* 30 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 33 */            ExecutorService executorService = firebaseMessagingService.I00iOIl;
/* 39 */            I00ioIO i00ioIO = new I00ioIO(11);
/* 42 */            i00ioIO.I00iiI = firebaseMessagingService;
/* 44 */            i00ioIO.I00iiO = intent;
/* 46 */            i00ioIO.I00iio = oloIlI0ll;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            executorService.execute(i00ioIO);
/* 57 */            I1Ii1lIoOI i1Ii1lIoOI = new I1Ii1lIoOI(1);
/* 63 */            Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(5);
/* 66 */            olio1i0OI00i.I00iiI = i011olVar;
/* 68 */            VarHandle.storeStoreFence();
/* 73 */            oloIlI0ll.I00000oIO.I00000oOI(i1Ii1lIoOI, olio1i0OI00i);
                }
            }
