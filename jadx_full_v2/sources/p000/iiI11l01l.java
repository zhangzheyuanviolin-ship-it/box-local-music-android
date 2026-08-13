            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.imagedescription.zzn;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iiI11l01l {
                public static final int I000OOo1O = 0;
                public iIloli I00000oIO;
                public iOIoil I00000oOI;
                public Iioi0lilII I0000Il00O;
                public l0oOo0Ili1i I0000O;
                public Executor I0000oI00;
                public Object I0001Ioi1lo;
                public l10i0Oio I000II;
                public l0Ol1ili I000O01llI0;

                public static li0ioOOll I0000Il00O(o00iIloIO o00iiloio, ii0o00I1l ii0o00i1l) {
                    li0ioOOll li0ioooll;
/* 1 */             Parcel parcelI00Iooi00oi = o00iiloio.I00Iooi00oi();
/* 5 */             int i = iil1ii1loOI1.I00000oIO;
/* 7 */             parcelI00Iooi00oi.writeStrongBinder(ii0o00i1l);
/* 11 */            Parcel parcelI00O0i0ii = o00iiloio.I00O0i0ii(3, parcelI00Iooi00oi);
/* 15 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 19 */            if (strongBinder == null) {
/* 21 */                li0ioooll = null;
                    } else {
/* 25 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 39 */                li0ioooll = iInterfaceQueryLocalInterface instanceof li0ioOOll ? (li0ioOOll) iInterfaceQueryLocalInterface : new li0ioOOll(strongBinder);
                    }
/* 43 */            parcelI00O0i0ii.recycle();
/* 106 */           return li0ioooll;
                }

                public static li0ioOOll I0000O(o00iIloIO o00iiloio, iOolO1ll1I ioolo1ll1i, i1Il01 i1il01) {
/* 1 */             zzn zznVar = ioolo1ll1i.I00000oOI;
/* 3 */             li0ioOOll li0ioooll = null;
/* 12 */            ii0o00I1l ii0o00i1l = zznVar != null ? new ii0o00I1l(zznVar) : null;
/* 13 */            iooO1OIlo iooo1oilo = ioolo1ll1i.I00000oIO;
/* 17 */            ii0o00I1l ii0o00i1l2 = new ii0o00I1l(i1il01);
/* 20 */            Parcel parcelI00Iooi00oi = o00iiloio.I00Iooi00oi();
/* 24 */            int i = iil1ii1loOI1.I00000oIO;
/* 27 */            parcelI00Iooi00oi.writeInt(1);
/* 32 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 36 */            lO0IioIooIl.I000o00OoI0I(parcelI00Iooi00oi, 1, iooo1oilo);
/* 39 */            if (ii0o00i1l == null) {
/* 41 */                ii0o00i1l = null;
                    }
/* 43 */            lO0IioIooIl.I0001Ioi1lo(parcelI00Iooi00oi, 2, ii0o00i1l);
/* 47 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 51 */            parcelI00Iooi00oi.writeInt(0);
/* 54 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 57 */            parcelI00Iooi00oi.writeStrongBinder(ii0o00i1l2);
/* 60 */            Parcel parcelI00O0i0ii = o00iiloio.I00O0i0ii(2, parcelI00Iooi00oi);
/* 64 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 68 */            if (strongBinder != null) {
/* 73 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 87 */                li0ioooll = iInterfaceQueryLocalInterface instanceof li0ioOOll ? (li0ioOOll) iInterfaceQueryLocalInterface : new li0ioOOll(strongBinder);
                    }
/* 90 */            parcelI00O0i0ii.recycle();
/* 98 */            return li0ioooll;
                }

                public final ListenableFuture I00000oIO() {
                    ListenableFuture listenableFutureI00000oOI;
                    l0Ol1ili l0ol1ili;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     l10i0Oio l10i0oio = this.I000II;
/* 8 */                     il1OOI0 il1ooi0 = (il1OOI0) this.I00000oIO;
/* 18 */                    if (l10i0oio == il1ooi0.I00000oIO().I0000O() && (l0ol1ili = this.I000O01llI0) != null) {
/* 25 */                        return l0ol1ili;
                            }
/* 29 */                    Iioi0lilII iioi0lilII = this.I0000Il00O;
/* 33 */                    int i = 0;
/* 34 */                    if (il1ooi0.I00io1l) {
/* 39 */                        iOIoil ioioil = this.I00000oOI;
/* 41 */                        il1ooi0.I000II();
/* 52 */                        l0Ol1ili l0ol1iliI000o00OoI0I = l0Ol1ili.I000o00OoI0I(il1ooi0.I00000oIO().I0000O());
/* 58 */                        iio1ioOI iio1iooi = new iio1ioOI();
/* 61 */                        l0OO1i l0oo1i = l0OO1i.I00iOIl;
/* 63 */                        int i2 = l0O11I1ll.I00l0OO0IO;
/* 67 */                        l0Iool1O1iil l0iool1o1iil = new l0Iool1O1iil(l0ol1iliI000o00OoI0I, iio1iooi);
/* 74 */                        l0ol1iliI000o00OoI0I.addListener(l0iool1o1iil, ll01i01oo11.I00000oIO(l0oo1i, l0iool1o1iil));
/* 80 */                        iiOOoloool iioooloool = new iiOOoloool(3);
/* 83 */                        iioooloool.I00000oOI = ioioil;
/* 85 */                        VarHandle.storeStoreFence();
/* 94 */                        l0Ol1ili l0ol1iliI000o00OoI0I2 = l0Ol1ili.I000o00OoI0I(ll00lliII.I00000oOI(l0iool1o1iil, iioooloool, il1ooi0.I00iOIl));
/* 100 */                       iiOIO1I1lio0 iioio1i1lio0 = new iiOIO1I1lio0(i);
/* 103 */                       iioio1i1lio0.I00000oOI = this;
/* 105 */                       iioio1i1lio0.I0000Il00O = iioi0lilII;
/* 107 */                       VarHandle.storeStoreFence();
/* 112 */                       listenableFutureI00000oOI = ll00lliII.I00000oOI(l0ol1iliI000o00OoI0I2, iioio1i1lio0, this.I0000O);
                            } else {
/* 36 */                        listenableFutureI00000oOI = l0lI0IOIl000.I00iiI;
                            }
/* 116 */                   l0Ol1ili l0ol1iliI000o00OoI0I3 = l0Ol1ili.I000o00OoI0I(listenableFutureI00000oOI);
/* 122 */                   iiOOoloool iioooloool2 = new iiOOoloool(i);
/* 125 */                   iioooloool2.I00000oOI = this;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   l0oOo0Ili1i l0ooo0ili1i = this.I0000O;
/* 132 */                   l0IlooI l0ilooiI00000oOI = ll00lliII.I00000oOI(l0ol1iliI000o00OoI0I3, iioooloool2, l0ooo0ili1i);
/* 139 */                   iiOOoloool iioooloool3 = new iiOOoloool(1);
/* 142 */                   iioooloool3.I00000oOI = this;
/* 144 */                   VarHandle.storeStoreFence();
/* 147 */                   l0IlooI l0ilooiI00000oOI2 = ll00lliII.I00000oOI(l0ilooiI00000oOI, iioooloool3, l0ooo0ili1i);
/* 151 */                   this.I000O01llI0 = l0ilooiI00000oOI2;
/* 161 */                   this.I000II = il1ooi0.I00000oIO().I0000O();
/* 165 */                   iili011O1 iili011o1 = new iili011O1(i);
/* 168 */                   iili011o1.I00iiI = this;
/* 170 */                   VarHandle.storeStoreFence();
/* 173 */                   l0OO1i l0oo1i2 = l0OO1i.I00iOIl;
/* 177 */                   l0iOoII1Il l0iooii1il = new l0iOoII1Il(i);
/* 180 */                   l0iooii1il.I00iiI = l0ilooiI00000oOI2;
/* 182 */                   l0iooii1il.I00iiO = iili011o1;
/* 184 */                   VarHandle.storeStoreFence();
/* 187 */                   l0ilooiI00000oOI2.addListener(l0iooii1il, l0oo1i2);
/* 191 */                   return l0ilooiI00000oOI2;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                public final o00iIloIO I00000oOI(l0o1looii0Ol l0o1looii0ol) {
                    o00iIloIO o00iiloio;
/* 3 */             il1I1O il1i1oI00000oIO = this.I00000oOI.I00000oIO();
/* 7 */             iolOiIoi ioloiioi = (iolOiIoi) l0o1looii0ol;
/* 9 */             Parcel parcelI00Iooi00oi = ioloiioi.I00Iooi00oi();
/* 13 */            int i = iil1ii1loOI1.I00000oIO;
/* 16 */            parcelI00Iooi00oi.writeInt(1);
/* 20 */            il1i1oI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 25 */            Parcel parcelI00O0i0ii = ioloiioi.I00O0i0ii(30, parcelI00Iooi00oi);
/* 29 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 33 */            if (strongBinder == null) {
/* 35 */                o00iiloio = null;
                    } else {
/* 39 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionService");
/* 54 */                o00iiloio = iInterfaceQueryLocalInterface instanceof o00iIloIO ? (o00iIloIO) iInterfaceQueryLocalInterface : new o00iIloIO(strongBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionService", 2);
                    }
/* 58 */            parcelI00O0i0ii.recycle();
/* 77 */            return o00iiloio;
                }
            }
