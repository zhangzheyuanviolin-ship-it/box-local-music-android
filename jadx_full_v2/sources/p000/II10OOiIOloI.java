            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
/* 27 */    public final class II10OOiIOloI implements ServiceConnection {
                public boolean I00iOIl;
                public LinkedBlockingQueue I00iiI;

                public final IBinder I00000oIO() throws TimeoutException {
/* 3 */             lII0I0I000I.I0001Ioi1lo("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
/* 8 */             if (this.I00iOIl) {
/* 38 */                I000II.I001IO000("Cannot call get on this connection more than once");
/* 41 */                return null;
                    }
/* 11 */            this.I00iOIl = true;
/* 23 */            IBinder iBinder = (IBinder) this.I00iiI.poll(10000L, TimeUnit.MILLISECONDS);
/* 25 */            if (iBinder != null) {
/* 27 */                return iBinder;
                    }
/* 35 */            throw new TimeoutException("Timed out waiting for the service connection");
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 3 */             this.I00iiI.add(iBinder);
                }

                @Override
/* 28 */        public final void onServiceDisconnected(ComponentName componentName) {
                }
            }
