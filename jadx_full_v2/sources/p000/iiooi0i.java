            package p000;

            import android.content.ComponentName;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class iiooi0i implements ServiceConnection {
                public final int I00iOIl;
                public Object I00iiI;
                public ListenableFuture I00iiO;
                public Object I00iio;
                public AutoCloseable I00ilI0I1;

                public iiooi0i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public l0I1O010oooi I00000oIO() {
                    l0I1O010oooi l0i1o010oooi;
                    synchronized (this.I00iiI) {
                        try {
/* 12 */                    if (((l0I1O010oooi) this.I00iiO).I00iOIl instanceof ioO0o00) {
/* 14 */                        I0001Ioi1lo();
                            }
/* 22 */                    l0i1o010oooi = (l0I1O010oooi) this.I00iiO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 25 */            return l0i1o010oooi;
                }

                public l0I1O1ii I00000oOI() {
                    l0I1O1ii l0i1o1ii;
                    synchronized (this.I00iiI) {
                        try {
/* 12 */                    if (((l0I1O1ii) this.I00iiO).I00iOIl instanceof ioO0lII0lI) {
/* 14 */                        I0001Ioi1lo();
                            }
/* 22 */                    l0i1o1ii = (l0I1O1ii) this.I00iiO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 25 */            return l0i1o1ii;
                }

                public l0Io11IiO0l I0000Il00O() {
                    l0Io11IiO0l l0io11iio0l;
                    synchronized (this.I00iiI) {
                        try {
/* 12 */                    if (((l0Io11IiO0l) this.I00iiO).I00iOIl instanceof ioOlI0i1) {
/* 14 */                        I0001Ioi1lo();
                            }
/* 22 */                    l0io11iio0l = (l0Io11IiO0l) this.I00iiO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 25 */            return l0io11iio0l;
                }

                public l10i0Oio I0000O() {
                    l10i0Oio l10i0oio;
                    synchronized (this.I00iiI) {
                        try {
/* 12 */                    if (((l10i0Oio) this.I00iiO).I00iOIl instanceof l01OOll0II1) {
/* 14 */                        I0001Ioi1lo();
                            }
/* 22 */                    l10i0oio = (l10i0Oio) this.I00iiO;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 25 */            return l10i0oio;
                }

                public final void I0000oI00() {
/* 8 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 244 */                   il00iIOo1 il00iioo1 = (il00iIOo1) this.I00ilI0I1;
/* 248 */                   Intent intent = new Intent();
/* 253 */                   intent.setComponent(il00iIOo1.I00li1OI);
                            try {
/* 269 */                       if (!il00iioo1.I00iiI.bindService(intent, this, true != il00iioo1.I00iio ? 1 : 65)) {
/* 274 */                           il00iioo1.I00iiI.unbindService(this);
/* 279 */                           Intent intent2 = new Intent();
/* 284 */                           intent2.setComponent(il00iIOo1.I00ll1);
/* 289 */                           if (true == il00iioo1.I00iio) {
/* 292 */                               i = 65;
                                    }
/* 299 */                           if (!il00iioo1.I00iiI.bindService(intent2, this, i)) {
/* 305 */                               I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service failed to bind.", null, 601));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (SecurityException e) {
/* 314 */                       I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service failed to bind.", e, 601));
/* 317 */                       return;
                            }
                            break;
                        case 1:
/* 168 */                   il0I11I011 il0i11i011 = (il0I11I011) this.I00ilI0I1;
/* 172 */                   Intent intent3 = new Intent();
/* 177 */                   intent3.setComponent(il0I11I011.I00li1OI);
                            try {
/* 193 */                       if (!il0i11i011.I00iiI.bindService(intent3, this, true != il0i11i011.I00iio ? 1 : 65)) {
/* 198 */                           il0i11i011.I00iiI.unbindService(this);
/* 203 */                           Intent intent4 = new Intent();
/* 208 */                           intent4.setComponent(il0I11I011.I00ll1);
/* 213 */                           if (true == il0i11i011.I00iio) {
/* 216 */                               i = 65;
                                    }
/* 223 */                           if (!il0i11i011.I00iiI.bindService(intent4, this, i)) {
/* 229 */                               I000l1(iOiI1oOo1l.I00000oIO("AiCore service failed to bind.", null, 601));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (SecurityException e2) {
/* 238 */                       I000l1(iOiI1oOo1l.I00000oIO("AiCore service failed to bind.", e2, 601));
/* 241 */                       return;
                            }
                            break;
                        case 2:
/* 92 */                    il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) this.I00ilI0I1;
/* 96 */                    Intent intent5 = new Intent();
/* 101 */                   intent5.setComponent(il0I1i0Oo1.I00li1OI);
                            try {
/* 117 */                       if (!il0i1i0oo1.I00iiI.bindService(intent5, this, true != il0i1i0oo1.I00iio ? 1 : 65)) {
/* 122 */                           il0i1i0oo1.I00iiI.unbindService(this);
/* 127 */                           Intent intent6 = new Intent();
/* 132 */                           intent6.setComponent(il0I1i0Oo1.I00ll1);
/* 137 */                           if (true == il0i1i0oo1.I00iio) {
/* 140 */                               i = 65;
                                    }
/* 147 */                           if (!il0i1i0oo1.I00iiI.bindService(intent6, this, i)) {
/* 153 */                               I000lI(iOiIOO1ll.I00000oIO("AiCore service failed to bind.", null, 601));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (SecurityException e3) {
/* 162 */                       I000lI(iOiIOO1ll.I00000oIO("AiCore service failed to bind.", e3, 601));
/* 165 */                       return;
                            }
                            break;
                        default:
/* 16 */                    il1OOI0 il1ooi0 = (il1OOI0) this.I00ilI0I1;
/* 20 */                    Intent intent7 = new Intent();
/* 25 */                    intent7.setComponent(il1OOI0.I00li1OI);
                            try {
/* 41 */                        if (!il1ooi0.I00iiI.bindService(intent7, this, true != il1ooi0.I00iio ? 1 : 65)) {
/* 46 */                            il1ooi0.I00iiI.unbindService(this);
/* 51 */                            Intent intent8 = new Intent();
/* 56 */                            intent8.setComponent(il1OOI0.I00ll1);
/* 61 */                            if (true == il1ooi0.I00iio) {
/* 64 */                                i = 65;
                                    }
/* 71 */                            if (!il1ooi0.I00iiI.bindService(intent8, this, i)) {
/* 77 */                                I000iOII(iOIIOoOoii.I00000oIO("AiCore service failed to bind.", null, 601));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (SecurityException e4) {
/* 86 */                        I000iOII(iOIIOoOoii.I00000oIO("AiCore service failed to bind.", e4, 601));
                            }
                            break;
                    }
                }

                public final void I0001Ioi1lo() {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this.I00iiI) {
/* 83 */                        this.I00iiO = new l0Io11IiO0l();
/* 91 */                        this.I00iio = new il0llll00oO(0);
                            }
/* 94 */                    return;
                        case 1:
                            synchronized (this.I00iiI) {
/* 60 */                        this.I00iiO = new l0I1O010oooi();
/* 68 */                        this.I00iio = new il0llll00oO(1);
                            }
/* 71 */                    return;
                        case 2:
                            synchronized (this.I00iiI) {
/* 37 */                        this.I00iiO = new l0I1O1ii();
/* 45 */                        this.I00iio = new il0llll00oO(2);
                            }
/* 48 */                    return;
                        default:
                            synchronized (this.I00iiI) {
/* 14 */                        this.I00iiO = new l10i0Oio();
/* 22 */                        this.I00iio = new il0llll00oO(3);
                            }
/* 25 */                    return;
                    }
                }

                public void I000II(l0IIO1Oi0lOi l0iio1oi0loi) {
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     l0Io11IiO0l l0io11iio0l = (l0Io11IiO0l) this.I00iiO;
/* 10 */                    il0llll00oO il0llll00oo = (il0llll00oO) this.I00iio;
/* 14 */                    iOoll1io1010 iooll1io1010 = new iOoll1io1010();
/* 17 */                    if (l0iio1oi0loi == null) {
/* 50 */                        throw new NullPointerException("Null service");
                            }
/* 19 */                    iooll1io1010.I00000oIO = l0iio1oi0loi;
/* 21 */                    if (il0llll00oo == null) {
/* 42 */                        throw new NullPointerException("Null disconnectSignal");
                            }
/* 23 */                    iooll1io1010.I00000oOI = il0llll00oo;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    l0io11iio0l.I000O01llI0(iooll1io1010);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public void I000O01llI0(l0IIolOoi0I l0iiolooi0i) {
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     l0I1O010oooi l0i1o010oooi = (l0I1O010oooi) this.I00iiO;
/* 10 */                    il0llll00oO il0llll00oo = (il0llll00oO) this.I00iio;
/* 14 */                    iOo0lOoi ioo0looi = new iOo0lOoi();
/* 17 */                    if (l0iiolooi0i == null) {
/* 50 */                        throw new NullPointerException("Null service");
                            }
/* 19 */                    ioo0looi.I00000oIO = l0iiolooi0i;
/* 21 */                    if (il0llll00oo == null) {
/* 42 */                        throw new NullPointerException("Null disconnectSignal");
                            }
/* 23 */                    ioo0looi.I00000oOI = il0llll00oo;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    l0i1o010oooi.I000O01llI0(ioo0looi);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public void I000OOo1O(l0IO0lo0ool l0io0lo0ool) {
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     l0I1O1ii l0i1o1ii = (l0I1O1ii) this.I00iiO;
/* 10 */                    il0llll00oO il0llll00oo = (il0llll00oO) this.I00iio;
/* 14 */                    iOo0ll1 ioo0ll1 = new iOo0ll1();
/* 17 */                    if (l0io0lo0ool == null) {
/* 50 */                        throw new NullPointerException("Null service");
                            }
/* 19 */                    ioo0ll1.I00000oIO = l0io0lo0ool;
/* 21 */                    if (il0llll00oo == null) {
/* 42 */                        throw new NullPointerException("Null disconnectSignal");
                            }
/* 23 */                    ioo0ll1.I00000oOI = il0llll00oo;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    l0i1o1ii.I000O01llI0(ioo0ll1);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public void I000OiO(l0o1looii0Ol l0o1looii0ol) {
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     l10i0Oio l10i0oio = (l10i0Oio) this.I00iiO;
/* 10 */                    il0llll00oO il0llll00oo = (il0llll00oO) this.I00iio;
/* 14 */                    iOl1oo01Ii iol1oo01ii = new iOl1oo01Ii();
/* 17 */                    if (l0o1looii0ol == null) {
/* 50 */                        throw new NullPointerException("Null service");
                            }
/* 19 */                    iol1oo01ii.I00000oIO = l0o1looii0ol;
/* 21 */                    if (il0llll00oo == null) {
/* 42 */                        throw new NullPointerException("Null disconnectSignal");
                            }
/* 23 */                    iol1oo01ii.I00000oOI = il0llll00oo;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    l10i0oio.I000O01llI0(iol1oo01ii);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public void I000iOII(iOIIOoOoii ioiiooooii) {
                    synchronized (this.I00iiI) {
/* 8 */                 ((l10i0Oio) this.I00iiO).I000OOo1O(ioiiooooii);
                    }
/* 16 */            ((il1OOI0) this.I00ilI0I1).I0000Il00O();
                }

                public void I000l1(iOiI1oOo1l ioii1ooo1l) {
                    synchronized (this.I00iiI) {
/* 8 */                 ((l0I1O010oooi) this.I00iiO).I000OOo1O(ioii1ooo1l);
                    }
/* 16 */            ((il0I11I011) this.I00ilI0I1).I0000Il00O();
                }

                public void I000lI(iOiIOO1ll ioiioo1ll) {
                    synchronized (this.I00iiI) {
/* 8 */                 ((l0I1O1ii) this.I00iiO).I000OOo1O(ioiioo1ll);
                    }
/* 16 */            ((il0I1i0Oo1) this.I00ilI0I1).I0000Il00O();
                }

                public void I000o00OoI0I(iOlI0O0iIiO ioli0o0iiio) {
                    synchronized (this.I00iiI) {
/* 8 */                 ((l0Io11IiO0l) this.I00iiO).I000OOo1O(ioli0o0iiio);
                    }
/* 16 */            ((il00iIOo1) this.I00ilI0I1).I0000Il00O();
                }

                @Override
                public final void onBindingDied(ComponentName componentName) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service binding died.", null, 603));
                            break;
                        case 1:
/* 31 */                    I000l1(iOiI1oOo1l.I00000oIO("AiCore service binding died.", null, 603));
                            break;
                        case 2:
/* 23 */                    I000lI(iOiIOO1ll.I00000oIO("AiCore service binding died.", null, 603));
                            break;
                        default:
/* 15 */                    I000iOII(iOIIOoOoii.I00000oIO("AiCore service binding died.", null, 603));
                            break;
                    }
                }

                @Override
                public final void onNullBinding(ComponentName componentName) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service returns null on binding.", null, 605));
                            break;
                        case 1:
/* 31 */                    I000l1(iOiI1oOo1l.I00000oIO("AiCore service returns null on binding.", null, 605));
                            break;
                        case 2:
/* 23 */                    I000lI(iOiIOO1ll.I00000oIO("AiCore service returns null on binding.", null, 605));
                            break;
                        default:
/* 15 */                    I000iOII(iOIIOoOoii.I00000oIO("AiCore service returns null on binding.", null, 605));
                            break;
                    }
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IInterface l0oi0io0oo0;
                    IInterface l0o1o01oiooo;
                    IInterface l0o1oooooi1;
                    IInterface l1o1ooiioi11;
/* 14 */            l0IIO1Oi0lOi io101o1il = null;
/* 14 */            l0o1looii0Ol ioloiioi = null;
/* 14 */            l0IO0lo0ool io1011liiVar = null;
/* 14 */            l0IIolOoi0I io100oio = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 384 */                   if (!lio1il0Iil1O.I00000oIO(componentName, il00iIOo1.I00li1OI)) {
/* 454 */                       if (!lio1il0Iil1O.I00000oIO(componentName, il00iIOo1.I00ll1)) {
/* 494 */                           I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null, 0));
/* 497 */                           return;
                                }
/* 456 */                       int i = iolIlOi.I000O01llI0;
/* 458 */                       if (iBinder != null) {
/* 461 */                           IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 475 */                           io101o1il = iInterfaceQueryLocalInterface instanceof l0IIO1Oi0lOi ? (l0IIO1Oi0lOi) iInterfaceQueryLocalInterface : new io101O1Il(iBinder);
                                }
/* 478 */                       I000II(io101o1il);
/* 497 */                       return;
                            }
/* 386 */                   int i2 = l1OIIoI0o.I000O01llI0;
/* 388 */                   if (iBinder == null) {
/* 390 */                       l0oi0io0oo0 = null;
                            } else {
/* 392 */                       IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
/* 406 */                       l0oi0io0oo0 = iInterfaceQueryLocalInterface2 instanceof l1ol1iII ? (l1ol1iII) iInterfaceQueryLocalInterface2 : new l0oI0Io0oO0(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 5);
                            }
                            try {
/* 411 */                       iiOIOI iioioi = new iiOIOI(this);
/* 414 */                       l0oI0Io0oO0 l0oi0io0oo02 = (l0oI0Io0oO0) l0oi0io0oo0;
/* 416 */                       Parcel parcelI00Iooi00oi = l0oi0io0oo02.I00Iooi00oi();
/* 420 */                       int i3 = iil0Ii00oOI1.I00000oIO;
/* 422 */                       parcelI00Iooi00oi.writeStrongBinder(iioioi);
                                try {
/* 427 */                           l0oi0io0oo02.I000O01llI0.transact(2, parcelI00Iooi00oi, null, 1);
/* 430 */                           parcelI00Iooi00oi.recycle();
/* 497 */                           return;
                                } finally {
                                }
                            } catch (RemoteException | RuntimeException e) {
/* 444 */                       I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service is not connected.", e, 6));
/* 497 */                       return;
                            }
                        case 1:
/* 264 */                   if (!lio0lOll10li.I00000oIO(componentName, il0I11I011.I00li1OI)) {
/* 334 */                       if (!lio0lOll10li.I00000oIO(componentName, il0I11I011.I00ll1)) {
/* 374 */                           I000l1(iOiI1oOo1l.I00000oIO("AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null, 0));
/* 377 */                           return;
                                }
/* 336 */                       int i4 = iolOoIo.I000O01llI0;
/* 338 */                       if (iBinder != null) {
/* 341 */                           IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 355 */                           io100oio = iInterfaceQueryLocalInterface3 instanceof l0IIolOoi0I ? (l0IIolOoi0I) iInterfaceQueryLocalInterface3 : new io100oIo(iBinder);
                                }
/* 358 */                       I000O01llI0(io100oio);
/* 377 */                       return;
                            }
/* 266 */                   int i5 = l1OI01lIl1Il.I000O01llI0;
/* 268 */                   if (iBinder == null) {
/* 270 */                       l0o1o01oiooo = null;
                            } else {
/* 272 */                       IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
/* 286 */                       l0o1o01oiooo = iInterfaceQueryLocalInterface4 instanceof l1oo1I ? (l1oo1I) iInterfaceQueryLocalInterface4 : new l0o1o01oIooo(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 3);
                            }
                            try {
/* 291 */                       iiOlIi0l00ll iiolii0l00ll = new iiOlIi0l00ll(this);
/* 294 */                       l0o1o01oIooo l0o1o01oiooo2 = (l0o1o01oIooo) l0o1o01oiooo;
/* 296 */                       Parcel parcelI00Iooi00oi2 = l0o1o01oiooo2.I00Iooi00oi();
/* 300 */                       int i6 = iil0I01i.I00000oIO;
/* 302 */                       parcelI00Iooi00oi2.writeStrongBinder(iiolii0l00ll);
                                try {
/* 307 */                           l0o1o01oiooo2.I000O01llI0.transact(2, parcelI00Iooi00oi2, null, 1);
/* 310 */                           parcelI00Iooi00oi2.recycle();
/* 377 */                           return;
                                } finally {
                                }
                            } catch (RemoteException | RuntimeException e2) {
/* 324 */                       I000l1(iOiI1oOo1l.I00000oIO("AiCore service is not connected.", e2, 6));
/* 377 */                       return;
                            }
                        case 2:
/* 144 */                   if (!lio0lio01.I00000oIO(componentName, il0I1i0Oo1.I00li1OI)) {
/* 214 */                       if (!lio0lio01.I00000oIO(componentName, il0I1i0Oo1.I00ll1)) {
/* 254 */                           I000lI(iOiIOO1ll.I00000oIO("AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null, 0));
/* 257 */                           return;
                                }
/* 216 */                       int i7 = ioli0i0i100i.I000O01llI0;
/* 218 */                       if (iBinder != null) {
/* 221 */                           IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 235 */                           io1011liiVar = iInterfaceQueryLocalInterface5 instanceof l0IO0lo0ool ? (l0IO0lo0ool) iInterfaceQueryLocalInterface5 : new io1011lii(iBinder);
                                }
/* 238 */                       I000OOo1O(io1011liiVar);
/* 257 */                       return;
                            }
/* 146 */                   int i8 = l1OIII0I.I000O01llI0;
/* 148 */                   if (iBinder == null) {
/* 150 */                       l0o1oooooi1 = null;
                            } else {
/* 152 */                       IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
/* 166 */                       l0o1oooooi1 = iInterfaceQueryLocalInterface6 instanceof l1oo1ii ? (l1oo1ii) iInterfaceQueryLocalInterface6 : new l0o1oOOoOI1(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 4);
                            }
                            try {
/* 171 */                       iiOli1O iioli1o = new iiOli1O(this);
/* 174 */                       l0o1oOOoOI1 l0o1oooooi12 = (l0o1oOOoOI1) l0o1oooooi1;
/* 176 */                       Parcel parcelI00Iooi00oi3 = l0o1oooooi12.I00Iooi00oi();
/* 180 */                       int i9 = iil0IIlIl0oo.I00000oIO;
/* 182 */                       parcelI00Iooi00oi3.writeStrongBinder(iioli1o);
                                try {
/* 187 */                           l0o1oooooi12.I000O01llI0.transact(2, parcelI00Iooi00oi3, null, 1);
/* 190 */                           parcelI00Iooi00oi3.recycle();
/* 257 */                           return;
                                } finally {
                                }
                            } catch (RemoteException | RuntimeException e3) {
/* 204 */                       I000lI(iOiIOO1ll.I00000oIO("AiCore service is not connected.", e3, 6));
/* 257 */                       return;
                            }
                        default:
/* 25 */                    if (!lilooOlIoOIo.I00000oIO(componentName, il1OOI0.I00li1OI)) {
/* 94 */                        if (!lilooOlIoOIo.I00000oIO(componentName, il1OOI0.I00ll1)) {
/* 134 */                           I000iOII(iOIIOoOoii.I00000oIO("AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null, 0));
/* 137 */                           return;
                                }
/* 96 */                        int i10 = l0IIloii.I000O01llI0;
/* 98 */                        if (iBinder != null) {
/* 101 */                           IInterface iInterfaceQueryLocalInterface7 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 115 */                           ioloiioi = iInterfaceQueryLocalInterface7 instanceof l0o1looii0Ol ? (l0o1looii0Ol) iInterfaceQueryLocalInterface7 : new iolOiIoi(iBinder);
                                }
/* 118 */                       I000OiO(ioloiioi);
/* 137 */                       return;
                            }
/* 27 */                    int i11 = l1oo0iO.I000O01llI0;
/* 29 */                    if (iBinder == null) {
/* 31 */                        l1o1ooiioi11 = null;
                            } else {
/* 33 */                        IInterface iInterfaceQueryLocalInterface8 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
/* 46 */                        l1o1ooiioi11 = iInterfaceQueryLocalInterface8 instanceof lIOlloI1OiO ? (lIOlloI1OiO) iInterfaceQueryLocalInterface8 : new l1O1oOiiOi11(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 2);
                            }
                            try {
/* 51 */                        ii0o00I1l ii0o00i1l = new ii0o00I1l(this);
/* 54 */                        l1O1oOiiOi11 l1o1ooiioi112 = (l1O1oOiiOi11) l1o1ooiioi11;
/* 56 */                        Parcel parcelI00Iooi00oi4 = l1o1ooiioi112.I00Iooi00oi();
/* 60 */                        int i12 = iil1ii1loOI1.I00000oIO;
/* 62 */                        parcelI00Iooi00oi4.writeStrongBinder(ii0o00i1l);
                                try {
/* 67 */                            l1o1ooiioi112.I000O01llI0.transact(2, parcelI00Iooi00oi4, null, 1);
/* 70 */                            parcelI00Iooi00oi4.recycle();
/* 137 */                           return;
                                } finally {
                                }
                            } catch (RemoteException | RuntimeException e4) {
/* 84 */                        I000iOII(iOIIOoOoii.I00000oIO("AiCore service is not connected.", e4, 6));
/* 137 */                       return;
                            }
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this.I00iiI) {
/* 109 */                       ((il0llll00oO) this.I00iio).I000iOII();
/* 122 */                       ((l0Io11IiO0l) this.I00iiO).I000OOo1O(iOlI0O0iIiO.I00000oIO("AiCore service disconnected.", null, 602));
/* 125 */                       I0001Ioi1lo();
                            }
/* 129 */                   return;
                        case 1:
                            synchronized (this.I00iiI) {
/* 78 */                        ((il0llll00oO) this.I00iio).I000iOII();
/* 91 */                        ((l0I1O010oooi) this.I00iiO).I000OOo1O(iOiI1oOo1l.I00000oIO("AiCore service disconnected.", null, 602));
/* 94 */                        I0001Ioi1lo();
                            }
/* 98 */                    return;
                        case 2:
                            synchronized (this.I00iiI) {
/* 47 */                        ((il0llll00oO) this.I00iio).I000iOII();
/* 60 */                        ((l0I1O1ii) this.I00iiO).I000OOo1O(iOiIOO1ll.I00000oIO("AiCore service disconnected.", null, 602));
/* 63 */                        I0001Ioi1lo();
                            }
/* 67 */                    return;
                        default:
                            synchronized (this.I00iiI) {
/* 16 */                        ((il0llll00oO) this.I00iio).I000iOII();
/* 29 */                        ((l10i0Oio) this.I00iiO).I000OOo1O(iOIIOoOoii.I00000oIO("AiCore service disconnected.", null, 602));
/* 32 */                        I0001Ioi1lo();
                            }
/* 36 */                    return;
                    }
                }
            }
