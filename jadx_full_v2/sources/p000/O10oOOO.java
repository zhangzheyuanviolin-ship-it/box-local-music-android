            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            
            public final class O10oOOO implements ServiceConnection {
                public static final String I00iiI = IIi0oIl.I000OiO("ListenableWorkerImplSession");
                public Oio0lloOl I00iOIl;

                @Override
                public final void onBindingDied(ComponentName componentName) {
/* 9 */             IIi0oIl.I000II().I000l1(I00iiI, "Binding died");
/* 19 */            this.I00iOIl.I000II(new RuntimeException("Binding died"));
                }

                @Override
                public final void onNullBinding(ComponentName componentName) {
/* 9 */             IIi0oIl.I000II().I0000oI00(I00iiI, "Unable to bind to service");
/* 33 */            this.I00iOIl.I000II(new RuntimeException("Cannot bind to service " + componentName));
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Object obj;
/* 5 */             IIi0oIl.I000II().getClass();
/* 8 */             int i = IoOl011l0ol.I000II;
/* 11 */            if (iBinder == null) {
/* 13 */                obj = null;
                    } else {
/* 17 */                Object objQueryLocalInterface = iBinder.queryLocalInterface(IoOl0I1Io1O.I00000oIO);
/* 21 */                if (objQueryLocalInterface == null || !(objQueryLocalInterface instanceof IoOl0I1Io1O)) {
/* 32 */                    IoOioO1 ioOioO1 = new IoOioO1();
/* 35 */                    ioOioO1.I000II = iBinder;
                            obj = ioOioO1;
                        } else {
/* 27 */                    obj = (IoOl0I1Io1O) objQueryLocalInterface;
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
/* 9 */             IIi0oIl.I000II().I000l1(I00iiI, "Service disconnected");
/* 19 */            this.I00iOIl.I000II(new RuntimeException("Service disconnected"));
                }
            }
