            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.DeadObjectException;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import java.lang.invoke.VarHandle;
            
            public final class lOl001Iii implements ServiceConnection, I1oIlIIIiOo0, I1oIlOi11 {
                public volatile boolean I00iOIl;
                public volatile l00l1OOOl I00iiI;
                public lOliOlO1Io I00iiO;

                @Override
                public final void I00000oOI(IOlo10lO1iOl iOlo10lO1iOl) {
/* 1 */             lOliOlO1Io loliolo1io = this.I00iiO;
/* 7 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00io1l;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010l10O();
/* 19 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 22 */            if (l01o0io1ooo0 == null || !l01o0io1ooo0.I00iiI) {
/* 29 */                l01o0io1ooo0 = null;
                    }
/* 30 */            if (l01o0io1ooo0 != null) {
/* 36 */                l01o0io1ooo0.I00lll10.I0000Il00O("Service connection failed", iOlo10lO1iOl);
                    }
                    synchronized (this) {
/* 41 */                this.I00iOIl = false;
/* 43 */                this.I00iiI = null;
                    }
/* 52 */            l0o10OoO0 l0o10ooo02 = ((l0olllO1i) this.I00iiO.I00iOIl).I00io1l;
/* 54 */            l0olllO1i.I000II(l0o10ooo02);
/* 61 */            l0iOoII1Il l0iooii1il = new l0iOoII1Il(12);
/* 64 */            l0iooii1il.I00iiI = iOlo10lO1iOl;
/* 66 */            l0iooii1il.I00iiO = this;
/* 68 */            VarHandle.storeStoreFence();
/* 71 */            l0o10ooo02.I010o0o0oO(l0iooii1il);
                }

                @Override
                public final void I0000O(int i) {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiO.I00iOIl;
/* 7 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010l10O();
/* 15 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 24 */            l01o0io1ooo0.I00lli11.I00000oOI("Service connection suspended");
/* 27 */            l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 29 */            l0olllO1i.I000II(l0o10ooo02);
/* 36 */            I0lil01 i0lil01 = new I0lil01(29);
/* 39 */            i0lil01.I00iiI = this;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            l0o10ooo02.I010o0o0oO(i0lil01);
                }

                @Override
                public final void I0000oI00() {
/* 7 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iiO.I00iOIl).I00io1l;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010l10O();
                    synchronized (this) {
                        try {
/* 18 */                    lII0I0I000I.I000II(this.I00iiI);
/* 27 */                    iolll0ill1i iolll0ill1iVar = (iolll0ill1i) this.I00iiI.I000l1();
/* 35 */                    l0o10OoO0 l0o10ooo02 = ((l0olllO1i) this.I00iiO.I00iOIl).I00io1l;
/* 37 */                    l0olllO1i.I000II(l0o10ooo02);
/* 44 */                    l0001OI0 l0001oi0 = new l0001OI0(10);
/* 47 */                    l0001oi0.I00iiI = iolll0ill1iVar;
/* 49 */                    l0001oi0.I00iiO = this;
/* 51 */                    VarHandle.storeStoreFence();
/* 54 */                    l0o10ooo02.I010o0o0oO(l0001oi0);
                        } catch (DeadObjectException | IllegalStateException unused) {
/* 61 */                    this.I00iiI = null;
/* 64 */                    this.I00iOIl = false;
                        }
                    }
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 7 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iiO.I00iOIl).I00io1l;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010l10O();
                    synchronized (this) {
/* 17 */                if (iBinder == null) {
/* 19 */                    this.I00iOIl = false;
/* 27 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iiO.I00iOIl).I00ilO0;
/* 29 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 36 */                    l01o0io1ooo0.I00ilO0.I00000oOI("Service connected with null binder");
/* 40 */                    return;
                        }
/* 44 */                Object ioli000o = null;
                        try {
/* 45 */                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 55 */                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
/* 59 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
/* 73 */                        ioli000o = iInterfaceQueryLocalInterface instanceof iolll0ill1i ? (iolll0ill1i) iInterfaceQueryLocalInterface : new iolI000o(iBinder);
/* 83 */                        l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) this.I00iiO.I00iOIl).I00ilO0;
/* 85 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 92 */                        l01o0io1ooo02.I00lll10.I00000oOI("Bound to IMeasurementService interface");
                            } else {
/* 102 */                       l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) this.I00iiO.I00iOIl).I00ilO0;
/* 104 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 111 */                       l01o0io1ooo03.I00ilO0.I0000Il00O("Got binder with a wrong descriptor", interfaceDescriptor);
                            }
                        } catch (RemoteException unused) {
/* 121 */                   l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) this.I00iiO.I00iOIl).I00ilO0;
/* 123 */                   l0olllO1i.I000II(l01o0io1ooo04);
/* 130 */                   l01o0io1ooo04.I00ilO0.I00000oOI("Service connect failed to get IMeasurementService");
                        }
/* 133 */               if (ioli000o == null) {
/* 135 */                   this.I00iOIl = false;
                            try {
/* 137 */                       IOloio1Ili iOloio1IliI00000oOI = IOloio1Ili.I00000oOI();
/* 141 */                       lOliOlO1Io loliolo1io = this.I00iiO;
/* 151 */                       iOloio1IliI00000oOI.I0000Il00O(((l0olllO1i) loliolo1io.I00iOIl).I00iOIl, loliolo1io.I00iiO);
                            } catch (IllegalArgumentException unused2) {
                            }
                        } else {
/* 161 */                   l0o10OoO0 l0o10ooo02 = ((l0olllO1i) this.I00iiO.I00iOIl).I00io1l;
/* 163 */                   l0olllO1i.I000II(l0o10ooo02);
/* 170 */                   IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(10);
/* 173 */                   illoOi1I1OO.I00iiI = ioli000o;
/* 175 */                   illoOi1I1OO.I00iiO = this;
/* 177 */                   VarHandle.storeStoreFence();
/* 180 */                   l0o10ooo02.I010o0o0oO(illoOi1I1OO);
                        }
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiO.I00iOIl;
/* 7 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010l10O();
/* 15 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 24 */            l01o0io1ooo0.I00lli11.I00000oOI("Service disconnected");
/* 27 */            l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 29 */            l0olllO1i.I000II(l0o10ooo02);
/* 36 */            illioiliioi illioiliioiVar = new illioiliioi(12);
/* 39 */            illioiliioiVar.I00iiI = componentName;
/* 41 */            illioiliioiVar.I00iiO = this;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            l0o10ooo02.I010o0o0oO(illioiliioiVar);
                }
            }
