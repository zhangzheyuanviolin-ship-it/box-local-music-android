            package p000;

            import android.content.ComponentName;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.UserManager;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.NoSuchElementException;
            import java.util.Objects;
            import java.util.concurrent.ExecutionException;
            
            public final class l001Oo implements ServiceConnection {
                public Object I00iOIl;
                public lio0IOO101oI I00iiI;
                public il0llll00oO I00iiO;
                public l00Iil I00iio;
                public l00Iil I00ilI0I1;

                public final void I00000oIO() {
                    synchronized (this.I00iOIl) {
/* 9 */                 this.I00iiI = new lio0IOO101oI();
/* 17 */                this.I00iiO = new il0llll00oO(4);
                    }
                }

                public final void I00000oOI() {
/* 3 */             Intent intent = new Intent();
/* 8 */             intent.setComponent(l00Iil.I00ll1);
/* 11 */            l00Iil l00iil = this.I00ilI0I1;
                    try {
/* 19 */                if (I0000O(intent)) {
/* 56 */                    return;
                        }
/* 24 */                l00iil.I00iiI.unbindService(this);
/* 29 */                Intent intent2 = new Intent();
/* 34 */                intent2.setComponent(l00Iil.I00lli11);
/* 41 */                if (I0000O(intent2)) {
/* 56 */                    return;
                        }
/* 50 */                I0001Ioi1lo(ilIoOl.I0000O("AiCore service failed to bind to primary or fallback.", null, 601));
                    } catch (SecurityException e) {
/* 63 */                I0001Ioi1lo(ilIoOl.I0000O("AiCore service failed to bind due to SecurityException.", e, 601));
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x0039, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0015, B:12:0x001c, B:17:0x0027, B:25:0x003f, B:26:0x0049, B:27:0x0053, B:28:0x005c, B:29:0x0068), top: B:33:0x0003, inners: #3 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O() {
                    synchronized (this.I00iOIl) {
/* 4 */                 lio0IOO101oI lio0ioo101oi = this.I00iiI;
/* 6 */                 if (lio0ioo101oi == null || !lio0ioo101oi.isDone()) {
/* 97 */                    this.I00iio.I00iiI.unbindService(this);
/* 102 */                   this.I00iiO.I0001Ioi1lo();
                        } else if (this.I00iiI.I00iOIl instanceof li0olooIo) {
/* 84 */                    ComponentName componentName = l00Iil.I00ll1;
/* 90 */                    Log.i("l00Iil", "Service context future was cancelled, no need to unlinkToDeath.");
/* 97 */                    this.I00iio.I00iiI.unbindService(this);
/* 102 */                   this.I00iiO.I0001Ioi1lo();
                        } else {
/* 22 */                    l00Iil l00iil = this.I00iio;
/* 24 */                    UserManager userManager = l00iil.I00io1l;
/* 38 */                    if (!(userManager != null && userManager.isSystemUser())) {
                                try {
/* 54 */                            ((i0I1ioiiIioI) ((ilOi00IOiII) ll0li01oO0li.I0000oI00(this.I00iiI)).I00000oIO).I000O01llI0.unlinkToDeath(l00iil, 0);
                                } catch (NoSuchElementException e) {
/* 74 */                            ComponentName componentName2 = l00Iil.I00ll1;
/* 80 */                            Log.w("l00Iil", "Attempted to unlink a death recipient that was not registered. This is safe to ignore.", e);
                                } catch (RuntimeException | ExecutionException e2) {
/* 64 */                            ComponentName componentName3 = l00Iil.I00ll1;
/* 70 */                            Log.e("l00Iil", "Failed to get service for unbind, unable to call unlinkToDeath. Cause: ", e2);
                                }
                            }
/* 97 */                    this.I00iio.I00iiI.unbindService(this);
/* 102 */                   this.I00iiO.I0001Ioi1lo();
                        }
                    }
                }

                public final boolean I0000O(Intent intent) {
/* 1 */             l00Iil l00iil = this.I00iio;
/* 13 */            return l00iil.I00iiI.bindService(intent, this, true == l00iil.I00iio ? 65 : 1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0000oI00(iIolOi01l0o iioloi01l0o) {
                    synchronized (this.I00iOIl) {
/* 4 */                 lio0IOO101oI lio0ioo101oi = this.I00iiI;
/* 6 */                 il0llll00oO il0llll00oo = this.I00iiO;
/* 10 */                ilOi00IOiII iloi00ioiii = new ilOi00IOiII();
/* 13 */                if (iioloi01l0o == 0) {
/* 83 */                    throw new NullPointerException("Null service");
                        }
/* 15 */                iloi00ioiii.I00000oIO = iioloi01l0o;
/* 17 */                if (il0llll00oo == null) {
/* 75 */                    throw new NullPointerException("Null disconnectSignal");
                        }
/* 19 */                iloi00ioiii.I00000oOI = il0llll00oo;
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                lio0ioo101oi.I000O01llI0(iloi00ioiii);
/* 27 */                l00Iil l00iil = this.I00iio;
/* 29 */                UserManager userManager = l00iil.I00io1l;
/* 43 */                if (!(userManager != null && userManager.isSystemUser())) {
                            try {
/* 49 */                        ((i0I1ioiiIioI) iioloi01l0o).I000O01llI0.linkToDeath(l00iil, 0);
                            } catch (RemoteException e) {
/* 63 */                        I0001Ioi1lo(ilIoOl.I0000O("AICore service died before linking death recipient.", e, 6));
                            }
                        }
                    }
                }

                public final void I0001Ioi1lo(ilIoOl iliool) {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00iiI.I000OOo1O(iliool);
                    }
/* 12 */            this.I00iio.I0000Il00O();
                }

                @Override
                public final void onBindingDied(ComponentName componentName) {
/* 10 */            I0001Ioi1lo(ilIoOl.I0000O("AiCore service binding died.", null, 603));
                }

                @Override
                public final void onNullBinding(ComponentName componentName) {
/* 10 */            I0001Ioi1lo(ilIoOl.I0000O("AiCore service returns null on binding.", null, 605));
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    iO1iI0oI io0i0i1;
/* 7 */             iIolOi01l0o iili1o1lii0 = null;
/* 8 */             if (!Objects.equals(componentName, l00Iil.I00ll1)) {
/* 86 */                if (!Objects.equals(componentName, l00Iil.I00lli11)) {
/* 131 */                   I0001Ioi1lo(ilIoOl.I0000O("AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null, 0));
/* 332 */                   return;
                        }
/* 88 */                int i = iIloloO.I000O01llI0;
/* 90 */                if (iBinder != null) {
/* 95 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 109 */                   iili1o1lii0 = iInterfaceQueryLocalInterface instanceof iIolOi01l0o ? (iIolOi01l0o) iInterfaceQueryLocalInterface : new iIlI1O1liI0(iBinder);
                        }
/* 112 */               I0000oI00(iili1o1lii0);
/* 115 */               return;
                    }
/* 10 */            int i2 = iO1100I11o.I000O01llI0;
/* 12 */            if (iBinder == null) {
/* 14 */                io0i0i1 = null;
                    } else {
/* 18 */                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
/* 33 */                io0i0i1 = iInterfaceQueryLocalInterface2 instanceof iO1iI0oI ? (iO1iI0oI) iInterfaceQueryLocalInterface2 : new iO0i0i1(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 12);
                    }
                    try {
/* 38 */                iloioiOI iloioioi = new iloioiOI(this);
/* 41 */                iO0i0i1 io0i0i12 = (iO0i0i1) io0i0i1;
/* 43 */                Parcel parcelI00Iooi00oi = io0i0i12.I00Iooi00oi();
/* 47 */                int i3 = lO0Ooi.I00000oIO;
/* 49 */                parcelI00Iooi00oi.writeStrongBinder(iloioioi);
                        try {
/* 56 */                    io0i0i12.I000O01llI0.transact(2, parcelI00Iooi00oi, null, 1);
                        } finally {
/* 64 */                    parcelI00Iooi00oi.recycle();
                        }
                    } catch (RemoteException | RuntimeException e) {
/* 76 */                I0001Ioi1lo(ilIoOl.I0000O("AiCore service provider communication error.", e, 6));
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00iiO.I0001Ioi1lo();
/* 20 */                this.I00iiI.I000OOo1O(ilIoOl.I0000O("AiCore service disconnected.", null, 602));
/* 23 */                I00000oIO();
                    }
                }
            }
