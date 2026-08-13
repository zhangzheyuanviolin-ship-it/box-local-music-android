            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import java.util.Iterator;
            
/* 10 */    public final class i0IIl10ioI extends i0Oi011IO0 {
                public final int I00iiI = 0;
                public final Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIl10ioI(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, OloIlI0ll oloIlI0ll2) {
/* 8 */             super(oloIlI0ll);
/* 4 */             this.I00iiO = oloIlI0ll2;
/* 6 */             this.I00iio = i0ii1l;
                }

                @Override
                public final void I00000oIO() throws RemoteException {
                    i0OIIoi i0o0llii0o01;
/* 1 */             int i = this.I00iiI;
/* 3 */             Object obj = this.I00iiO;
/* 5 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 104 */                   i0Ii1l i0ii1l = (i0Ii1l) obj2;
                            try {
/* 108 */                       i0OIIoi i0oiioi = i0ii1l.I0000oI00.I000lI;
/* 110 */                       String str = i0ii1l.I00000oIO;
/* 112 */                       Bundle bundleI000O01llI0 = i0Ii1l.I000O01llI0();
/* 121 */                       i0IOll1lo i0ioll1lo = new i0IOll1lo(i0ii1l, (OloIlI0ll) obj, 1);
/* 124 */                       i0O0llIi0O01 i0o0llii0o012 = (i0O0llIi0O01) i0oiioi;
/* 126 */                       Parcel parcelI00000oOI = i0o0llii0o012.I00000oOI();
/* 130 */                       parcelI00000oOI.writeString(str);
/* 133 */                       int i2 = i0IoOOOoOIoI.I00000oIO;
/* 135 */                       parcelI00000oOI.writeInt(1);
/* 138 */                       bundleI000O01llI0.writeToParcel(parcelI00000oOI, 0);
/* 141 */                       parcelI00000oOI.writeStrongBinder(i0ioll1lo);
/* 146 */                       i0o0llii0o012.I0000O(10, parcelI00000oOI);
                                break;
                            } catch (RemoteException e) {
/* 157 */                       i0Ii1l.I000II.I0000Il00O(e, "keepAlive", new Object[0]);
/* 160 */                       return;
                            }
                        default:
/* 13 */                    i0Oii0oo1i i0oii0oo1i = ((i0OiI0l0lO0o) obj2).I00iOIl;
/* 15 */                    IBinder iBinder = (IBinder) obj;
/* 17 */                    int i3 = i0O1OO1OIlOI.I000O01llI0;
/* 19 */                    if (iBinder == null) {
/* 21 */                        i0o0llii0o01 = null;
                            } else {
/* 25 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
/* 39 */                        i0o0llii0o01 = iInterfaceQueryLocalInterface instanceof i0OIIoi ? (i0OIIoi) iInterfaceQueryLocalInterface : new i0O0llIi0O01(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService", 0);
                            }
/* 43 */                    i0oii0oo1i.I000lI = i0o0llii0o01;
/* 45 */                    OlOilIlol1 olOilIlol1 = i0oii0oo1i.I00000oOI;
/* 51 */                    olOilIlol1.I0000O("linkToDeath", new Object[0]);
                            try {
/* 62 */                        ((i0I1ioiiIioI) i0oii0oo1i.I000lI).I000O01llI0.linkToDeath(i0oii0oo1i.I000OiO, 0);
                            } catch (RemoteException e2) {
/* 71 */                        olOilIlol1.I0000Il00O(e2, "linkToDeath failed", new Object[0]);
                            }
/* 74 */                    i0oii0oo1i.I000II = false;
/* 78 */                    Iterator it = i0oii0oo1i.I0000O.iterator();
/* 86 */                    while (it.hasNext()) {
/* 94 */                        ((Runnable) it.next()).run();
                            }
/* 100 */                   i0oii0oo1i.I0000O.clear();
                            break;
                    }
                }

/* 11 */        public i0IIl10ioI(i0OiI0l0lO0o i0oii0l0lo0o, IBinder iBinder) {
/* 12 */            this.I00iiO = iBinder;
                    this.I00iio = i0oii0l0lo0o;
                }
            }
