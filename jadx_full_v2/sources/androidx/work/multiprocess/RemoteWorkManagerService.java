            package androidx.work.multiprocess;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import java.lang.invoke.VarHandle;
            import p000.IIi0oIl;
            import p000.IoOlo00;
            import p000.Oi00ioOI1i;
            import p000.i01IlOO;
            
            public class RemoteWorkManagerService extends Service {
                public static final String I00iiI = IIi0oIl.I000OiO("RemoteWorkManagerService");
                public Oi00ioOI1i I00iOIl;

                @Override
                public final IBinder onBind(Intent intent) {
/* 9 */             IIi0oIl.I000II().I000OOo1O(I00iiI, "Binding to RemoteWorkManager");
/* 12 */            return this.I00iOIl;
                }

                @Override
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 6 */             Oi00ioOI1i oi00ioOI1i = new Oi00ioOI1i();
/* 11 */            oi00ioOI1i.attachInterface(oi00ioOI1i, IoOlo00.I0000oI00);
/* 18 */            oi00ioOI1i.I000II = i01IlOO.I00000oOI(this);
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            this.I00iOIl = oi00ioOI1i;
                }
            }
