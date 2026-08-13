            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.rewriting.zzg;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ilIoii01i {
                public static final int I000OOo1O = 0;
                public static final int I000OiO = 0;
                public iO1110010OI I00000oIO;
                public iOioO0lIOo I00000oOI;
                public Iioi0lilII I0000Il00O;
                public l01I1l I0000O;
                public Executor I0000oI00;
                public Object I0001Ioi1lo;
                public l0I1O1ii I000II;
                public iollI1I1i I000O01llI0;

                public final liiiOiOilI0l I00000oIO(o0Il1IiOIo o0il1iioio, iiOli1O iioli1o) {
/* 6 */             Parcel parcelI00O0i0ii = o0il1iioio.I00O0i0ii(3, o0il1iioio.I00Iooi00oi());
/* 10 */            int i = parcelI00O0i0ii.readInt();
/* 14 */            parcelI00O0i0ii.recycle();
/* 18 */            liiiOiOilI0l loiii0iil = null;
/* 21 */            if (i < 0) {
/* 27 */                Log.w("ilIoii01i", "Ignoring prepareInferenceEngine because service is older than V1");
/* 42 */                ((IIiOOI) iioli1o.I000OOo1O).I0000O(iOiIOO1ll.I0000Il00O(8, null, "Preparation failed."));
/* 47 */                return new il11100i("com.google.android.apps.aicore.aidl.ICancellationCallback", 4);
                    }
/* 51 */            Parcel parcelI00Iooi00oi = o0il1iioio.I00Iooi00oi();
/* 55 */            int i2 = iil0IIlIl0oo.I00000oIO;
/* 57 */            parcelI00Iooi00oi.writeStrongBinder(iioli1o);
/* 60 */            Parcel parcelI00O0i0ii2 = o0il1iioio.I00O0i0ii(4, parcelI00Iooi00oi);
/* 64 */            IBinder strongBinder = parcelI00O0i0ii2.readStrongBinder();
/* 68 */            if (strongBinder != null) {
/* 71 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 85 */                loiii0iil = iInterfaceQueryLocalInterface instanceof liiiOiOilI0l ? (liiiOiOilI0l) iInterfaceQueryLocalInterface : new lOiIi0iil(strongBinder);
                    }
/* 88 */            parcelI00O0i0ii2.recycle();
/* 106 */           return loiii0iil;
                }

                public final liiiOiOilI0l I00000oOI(o0Il1IiOIo o0il1iioio, il1l00IOII il1l00ioii, i0OI1l1Oo i0oi1l1oo) {
/* 1 */             zzg zzgVar = il1l00ioii.I0000O;
/* 3 */             liiiOiOilI0l loiii0iil = null;
/* 12 */            iiOli1O iioli1o = zzgVar != null ? new iiOli1O(zzgVar) : null;
/* 13 */            String str = il1l00ioii.I00000oIO;
/* 15 */            int i = il1l00ioii.I00000oOI;
/* 17 */            int i2 = il1l00ioii.I0000Il00O;
/* 22 */            iIloolIi1ii iiloolii1ii = new iIloolIi1ii(false);
/* 27 */            iiOli1O iioli1o2 = new iiOli1O(i0oi1l1oo);
/* 30 */            Parcel parcelI00Iooi00oi = o0il1iioio.I00Iooi00oi();
/* 34 */            int i3 = iil0IIlIl0oo.I00000oIO;
/* 37 */            parcelI00Iooi00oi.writeInt(1);
/* 42 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 46 */            lO0IioIooIl.I000OiO(parcelI00Iooi00oi, 1, str);
/* 51 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 54 */            parcelI00Iooi00oi.writeInt(1);
/* 58 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 61 */            parcelI00Iooi00oi.writeInt(i);
/* 64 */            if (iioli1o == null) {
/* 66 */                iioli1o = null;
                    }
/* 67 */            lO0IioIooIl.I0001Ioi1lo(parcelI00Iooi00oi, 4, iioli1o);
/* 71 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 4);
/* 74 */            parcelI00Iooi00oi.writeInt(i2);
/* 78 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 6, 4);
/* 81 */            parcelI00Iooi00oi.writeInt(0);
/* 85 */            lO0IioIooIl.I000OOo1O(parcelI00Iooi00oi, 7, iiloolii1ii, 0);
/* 88 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 91 */            parcelI00Iooi00oi.writeStrongBinder(iioli1o2);
/* 94 */            Parcel parcelI00O0i0ii = o0il1iioio.I00O0i0ii(2, parcelI00Iooi00oi);
/* 98 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 102 */           if (strongBinder != null) {
/* 107 */               IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 121 */               loiii0iil = iInterfaceQueryLocalInterface instanceof liiiOiOilI0l ? (liiiOiOilI0l) iInterfaceQueryLocalInterface : new lOiIi0iil(strongBinder);
                    }
/* 124 */           parcelI00O0i0ii.recycle();
/* 408 */           return loiii0iil;
                }

                public final o0Il1IiOIo I0000Il00O(l0IO0lo0ool l0io0lo0ool) {
                    o0Il1IiOIo o0il1iioio;
/* 3 */             il11i0 il11i0VarI00000oIO = this.I00000oOI.I00000oIO();
/* 7 */             io1011lii io1011liiVar = (io1011lii) l0io0lo0ool;
/* 9 */             Parcel parcelI00Iooi00oi = io1011liiVar.I00Iooi00oi();
/* 13 */            int i = iil0IIlIl0oo.I00000oIO;
/* 16 */            parcelI00Iooi00oi.writeInt(1);
/* 20 */            il11i0VarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 25 */            Parcel parcelI00O0i0ii = io1011liiVar.I00O0i0ii(15, parcelI00Iooi00oi);
/* 29 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 33 */            if (strongBinder == null) {
/* 35 */                o0il1iioio = null;
                    } else {
/* 39 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMagicRewriteService");
/* 54 */                o0il1iioio = iInterfaceQueryLocalInterface instanceof o0Il1IiOIo ? (o0Il1IiOIo) iInterfaceQueryLocalInterface : new o0Il1IiOIo(strongBinder, "com.google.android.apps.aicore.aidl.IMagicRewriteService", 4);
                    }
/* 58 */            parcelI00O0i0ii.recycle();
/* 77 */            return o0il1iioio;
                }

                public final ListenableFuture I0000O() {
                    ListenableFuture listenableFutureI0000O;
                    iollI1I1i iolli1i1i;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     l0I1O1ii l0i1o1ii = this.I000II;
/* 8 */                     il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) this.I00000oIO;
/* 18 */                    if (l0i1o1ii == il0i1i0oo1.I00000oIO().I00000oOI() && (iolli1i1i = this.I000O01llI0) != null) {
/* 25 */                        return iolli1i1i;
                            }
/* 29 */                    Iioi0lilII iioi0lilII = this.I0000Il00O;
/* 33 */                    int i = 0;
/* 34 */                    if (il0i1i0oo1.I00io1l) {
/* 39 */                        iOioO0lIOo ioioo0lioo = this.I00000oOI;
/* 41 */                        il0i1i0oo1.I000II();
/* 63 */                        ioiiIi0o11 ioiiii0o11I0000Il00O = liolilo.I0000Il00O(iollI1I1i.I000o00OoI0I(il0i1i0oo1.I00000oIO().I00000oOI()), new iilI0l(), iol1Iil.I00iOIl);
/* 70 */                        ii1iioii ii1iioiiVar = new ii1iioii(3);
/* 73 */                        ii1iioiiVar.I00000oOI = ioioo0lioo;
/* 75 */                        VarHandle.storeStoreFence();
/* 84 */                        iollI1I1i iolli1i1iI000o00OoI0I = iollI1I1i.I000o00OoI0I(liolilo.I0000O(ioiiii0o11I0000Il00O, ii1iioiiVar, il0i1i0oo1.I00iOIl));
/* 90 */                        ii1OOi ii1ooi = new ii1OOi(i);
/* 93 */                        ii1ooi.I00000oOI = this;
/* 95 */                        ii1ooi.I0000Il00O = iioi0lilII;
/* 97 */                        VarHandle.storeStoreFence();
/* 102 */                       listenableFutureI0000O = liolilo.I0000O(iolli1i1iI000o00OoI0I, ii1ooi, this.I0000O);
                            } else {
/* 36 */                        listenableFutureI0000O = l00Il1IoiloI.I00iiI;
                            }
/* 106 */                   iollI1I1i iolli1i1iI000o00OoI0I2 = iollI1I1i.I000o00OoI0I(listenableFutureI0000O);
/* 112 */                   ii1iioii ii1iioiiVar2 = new ii1iioii(i);
/* 115 */                   ii1iioiiVar2.I00000oOI = this;
/* 117 */                   VarHandle.storeStoreFence();
/* 120 */                   l01I1l l01i1l = this.I0000O;
/* 122 */                   ioiIoI0I ioiioi0iI0000O = liolilo.I0000O(iolli1i1iI000o00OoI0I2, ii1iioiiVar2, l01i1l);
/* 129 */                   ii1iioii ii1iioiiVar3 = new ii1iioii(1);
/* 132 */                   ii1iioiiVar3.I00000oOI = this;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   ioiIoI0I ioiioi0iI0000O2 = liolilo.I0000O(ioiioi0iI0000O, ii1iioiiVar3, l01i1l);
/* 141 */                   this.I000O01llI0 = ioiioi0iI0000O2;
/* 151 */                   this.I000II = il0i1i0oo1.I00000oIO().I00000oOI();
/* 156 */                   i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(6);
/* 159 */                   i0o1lii1o0io.I00iiI = this;
/* 161 */                   VarHandle.storeStoreFence();
/* 164 */                   iol1Iil iol1iil = iol1Iil.I00iOIl;
/* 168 */                   iooili01 iooili01Var = new iooili01(0);
/* 171 */                   iooili01Var.I00iiI = ioiioi0iI0000O2;
/* 173 */                   iooili01Var.I00iiO = i0o1lii1o0io;
/* 175 */                   VarHandle.storeStoreFence();
/* 178 */                   ioiioi0iI0000O2.addListener(iooili01Var, iol1iil);
/* 182 */                   return ioiioi0iI0000O2;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }
            }
