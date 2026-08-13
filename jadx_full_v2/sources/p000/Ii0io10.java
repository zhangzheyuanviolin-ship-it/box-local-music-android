            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Ii0io10 implements ServiceConnection {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public Ii0io10(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IoOiiIi0II ioOiiIi0II;
                    switch (this.I00iOIl) {
                        case 0:
/* 111 */                   if (((Context) this.I00iiI) == null) {
/* 189 */                       I000II.I001IO000("Custom Tabs Service connected before an applicationcontext has been provided.");
                                break;
                            } else {
/* 115 */                       int i = IoOiiIOlOo.I000II;
/* 117 */                       if (iBinder == null) {
/* 119 */                           ioOiiIi0II = null;
                                } else {
/* 123 */                           IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
/* 127 */                           if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IoOiiIi0II)) {
/* 139 */                               IoOiOiI11 ioOiOiI11 = new IoOiOiI11();
/* 142 */                               ioOiOiI11.I000II = iBinder;
/* 144 */                               ioOiiIi0II = ioOiOiI11;
                                    } else {
/* 134 */                               ioOiiIi0II = (IoOiiIi0II) iInterfaceQueryLocalInterface;
                                    }
                                }
/* 145 */                       Ii0iolloo ii0iolloo = new Ii0iolloo();
/* 148 */                       ii0iolloo.I00000oIO = ioOiiIi0II;
/* 150 */                       ii0iolloo.I00000oOI = componentName;
/* 152 */                       VarHandle.storeStoreFence();
/* 160 */                       O1I1OO.I0001Ioi1lo("CustomTabsService is connected", new Object[0]);
                                try {
/* 165 */                           ((IoOiOiI11) ioOiiIi0II).I0000O();
                                } catch (RemoteException unused) {
                                }
/* 170 */                       iOliil ioliil = (iOliil) this.I00iiO;
/* 176 */                       ((AtomicReference) ioliil.I00iiO).set(ii0iolloo);
/* 183 */                       ((CountDownLatch) ioliil.I00iio).countDown();
                                break;
                            }
                            break;
                        default:
/* 8 */                     i0O1lIi1O0IO i0o1lii1o0io = (i0O1lIi1O0IO) this.I00iiO;
/* 10 */                    if (iBinder == null) {
/* 94 */                        l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) i0o1lii1o0io.I00iiI).I00ilO0;
/* 96 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 103 */                       l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Install Referrer connection returned with null binder");
                                break;
                            } else {
                                try {
/* 12 */                            int i2 = iiO1iiO.I000II;
/* 16 */                            IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
/* 31 */                            Object iio0i00 = iInterfaceQueryLocalInterface2 instanceof iiOIlIl ? (iiOIlIl) iInterfaceQueryLocalInterface2 : new iiO0I00(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 11);
/* 36 */                            l0olllO1i l0olllo1i = (l0olllO1i) i0o1lii1o0io.I00iiI;
/* 38 */                            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 40 */                            l0olllO1i.I000II(l01o0io1ooo02);
/* 47 */                            l01o0io1ooo02.I00lll10.I00000oOI("Install Referrer Service connected");
/* 50 */                            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 52 */                            l0olllO1i.I000II(l0o10ooo0);
/* 58 */                            iooiio1i0 iooiio1i0Var = new iooiio1i0(7);
/* 61 */                            iooiio1i0Var.I00iiI = iio0i00;
/* 63 */                            iooiio1i0Var.I00iiO = this;
/* 65 */                            VarHandle.storeStoreFence();
/* 68 */                            l0o10ooo0.I010o0o0oO(iooiio1i0Var);
                                    break;
                                } catch (RuntimeException e) {
/* 77 */                            l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) i0o1lii1o0io.I00iiI).I00ilO0;
/* 79 */                            l0olllO1i.I000II(l01o0io1ooo03);
/* 86 */                            l01o0io1ooo03.I00l0I0l0lO1.I0000Il00O("Exception occurred while calling Install Referrer API", e);
/* 106 */                           return;
                                }
                            }
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    O1I1OO.I0001Ioi1lo("CustomTabsService is disconnected", new Object[0]);
/* 37 */                    iOliil ioliil = (iOliil) this.I00iiO;
/* 44 */                    ((AtomicReference) ioliil.I00iiO).set(null);
/* 51 */                    ((CountDownLatch) ioliil.I00iio).countDown();
                            break;
                        default:
/* 14 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) ((i0O1lIi1O0IO) this.I00iiO).I00iiI).I00ilO0;
/* 16 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 23 */                    l01o0io1ooo0.I00lll10.I00000oOI("Install Referrer Service disconnected");
                            break;
                    }
                }
            }
