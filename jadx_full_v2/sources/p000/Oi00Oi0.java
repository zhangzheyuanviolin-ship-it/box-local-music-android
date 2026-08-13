            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            
            public final class Oi00Oi0 implements ServiceConnection {
                public static final String I00iiO = IIi0oIl.I000OiO("RemoteWMgr.Connection");
                public Oio0lloOl I00iOIl;
                public RemoteWorkManagerClient I00iiI;

                @Override
                public final void onBindingDied(ComponentName componentName) {
/* 5 */             IIi0oIl.I000II().getClass();
/* 17 */            this.I00iOIl.I000II(new RuntimeException("Binding died"));
/* 22 */            this.I00iiI.I00000oOI();
                }

                @Override
                public final void onNullBinding(ComponentName componentName) {
/* 9 */             IIi0oIl.I000II().I0000oI00(I00iiO, "Unable to bind to service");
/* 33 */            this.I00iOIl.I000II(new RuntimeException("Cannot bind to service " + componentName));
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Object obj;
/* 5 */             IIi0oIl.I000II().getClass();
/* 8 */             int i = Oi00ioOI1i.I000O01llI0;
/* 11 */            if (iBinder == null) {
/* 13 */                obj = null;
                    } else {
/* 17 */                Object objQueryLocalInterface = iBinder.queryLocalInterface(IoOlo00.I0000oI00);
/* 21 */                if (objQueryLocalInterface == null || !(objQueryLocalInterface instanceof IoOlo00)) {
/* 32 */                    IoOll1i1Il ioOll1i1Il = new IoOll1i1Il();
/* 35 */                    ioOll1i1Il.I000II = iBinder;
                            obj = ioOll1i1Il;
                        } else {
/* 27 */                    obj = (IoOlo00) objQueryLocalInterface;
                        }
                    }
/* 37 */            Oio0lloOl oio0lloOl = this.I00iOIl;
/* 39 */            oio0lloOl.getClass();
                    Object obj2 = obj;
/* 42 */            if (obj == null) {
/* 44 */                obj2 = I011IOil.I00io1l;
                    }
/* 52 */            if (I011IOil.I00ilO0.I00000oOI(oio0lloOl, null, obj2)) {
/* 54 */                I011IOil.I00000oOI(oio0lloOl);
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 5 */             IIi0oIl.I000II().getClass();
/* 17 */            this.I00iOIl.I000II(new RuntimeException("Service disconnected"));
/* 22 */            this.I00iiI.I00000oOI();
                }
            }
