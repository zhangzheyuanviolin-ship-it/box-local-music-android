            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import java.lang.invoke.VarHandle;
            
            public final class iliOiO1 implements ServiceConnection {
                public int I00iOIl;
                public I1oIol10O I00iiI;

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    i1IO0lo i1io0lo;
/* 1 */             I1oIol10O i1oIol10O = this.I00iiI;
/* 3 */             if (iBinder == null) {
/* 5 */                 i1oIol10O.I001IIilI0O();
/* 8 */                 return;
                    }
                    synchronized (i1oIol10O.I000O01llI0) {
                        try {
/* 14 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
/* 18 */                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i1IO0lo)) {
/* 31 */                        i1io0lo = new i1IO0lo();
/* 34 */                        i1io0lo.I000II = iBinder;
/* 36 */                        VarHandle.storeStoreFence();
                            } else {
/* 24 */                        i1io0lo = (i1IO0lo) iInterfaceQueryLocalInterface;
                            }
/* 39 */                    i1oIol10O.I000OOo1O = i1io0lo;
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 42 */            I1oIol10O i1oIol10O2 = this.I00iiI;
/* 44 */            int i = this.I00iOIl;
/* 46 */            i1oIol10O2.getClass();
/* 53 */            iolOi1o1 ioloi1o1 = new iolOi1o1(i1oIol10O2, 0, null);
/* 56 */            iOoO0iili iooo0iili = i1oIol10O2.I0001Ioi1lo;
/* 64 */            iooo0iili.sendMessage(iooo0iili.obtainMessage(7, i, -1, ioloi1o1));
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             I1oIol10O i1oIol10O = this.I00iiI;
                    synchronized (i1oIol10O.I000O01llI0) {
/* 7 */                 i1oIol10O.I000OOo1O = null;
                    }
/* 10 */            I1oIol10O i1oIol10O2 = this.I00iiI;
/* 12 */            int i = this.I00iOIl;
/* 14 */            iOoO0iili iooo0iili = i1oIol10O2.I0001Ioi1lo;
/* 22 */            iooo0iili.sendMessage(iooo0iili.obtainMessage(6, i, 1));
                }
            }
