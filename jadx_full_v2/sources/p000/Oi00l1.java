            package p000;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class Oi00l1 extends Service {
                public static final String I00iiI = IIi0oIl.I000OiO("RemoteWorkerService");
                public O10oOIoI0 I00iOIl;

                @Override
                public final IBinder onBind(Intent intent) {
/* 9 */             IIi0oIl.I000II().I000OOo1O(I00iiI, "Binding to RemoteWorkerService");
/* 12 */            return this.I00iOIl;
                }

                @Override
                public void onCreate() {
/* 1 */             super.onCreate();
/* 6 */             O10oOIoI0 o10oOIoI0 = new O10oOIoI0();
/* 11 */            o10oOIoI0.attachInterface(o10oOIoI0, IoOl0I1Io1O.I00000oIO);
/* 18 */            o10oOIoI0.I000O01llI0 = getApplicationContext();
/* 22 */            if (OillOo0.I00ioIO == null) {
                        synchronized (OillOo0.I00io1l) {
                            try {
/* 29 */                        if (OillOo0.I00ioIO == null) {
/* 36 */                            OillOo0.I00ioIO = new OillOo0(this);
                                }
                            } finally {
                            }
                        }
                    }
/* 45 */            OillOo0 oillOo0 = OillOo0.I00ioIO;
/* 51 */            o10oOIoI0.I000OOo1O = (IOllii) oillOo0.I00iiI;
/* 57 */            o10oOIoI0.I000OiO = (OloIli) oillOo0.I00iiO;
/* 63 */            o10oOIoI0.I000iOII = (looil0O1Io1) oillOo0.I00iio;
/* 69 */            o10oOIoI0.I000l1 = (lolOiIoiillI) oillOo0.I00ilI0I1;
/* 76 */            o10oOIoI0.I000lI = new HashMap();
/* 83 */            o10oOIoI0.I000o00OoI0I = new HashMap();
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            this.I00iOIl = o10oOIoI0;
                }
            }
