            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class ii1iioii implements iol0ioiIO1iI {
                public final int I00000oIO;
                public Object I00000oOI;

                public ii1iioii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 207 */                   return ((il0I1i0Oo1) ((ilIoii01i) this.I00000oOI).I00000oIO).I00000oIO().I00000oOI();
                        case 1:
/* 132 */                   iOo0ll1 ioo0ll1 = (iOo0ll1) obj;
                            try {
/* 137 */                       o0Il1IiOIo o0il1iioioI0000Il00O = ((ilIoii01i) this.I00000oOI).I0000Il00O(ioo0ll1.I00000oIO);
/* 143 */                       il0llll00oO il0llll00oo = ioo0ll1.I00000oOI;
/* 145 */                       il0Oi1i1II il0oi1i1ii = new il0Oi1i1II();
/* 148 */                       if (o0il1iioioI0000Il00O == null) {
/* 164 */                           IOOlIIilOl0.I000II("Null getService");
/* 167 */                           return null;
                                }
/* 150 */                       il0oi1i1ii.I00000oIO = o0il1iioioI0000Il00O;
/* 152 */                       il0oi1i1ii.I00000oOI = il0llll00oo;
/* 154 */                       VarHandle.storeStoreFence();
/* 157 */                       return liolilo.I00000oOI(il0oi1i1ii);
                            } catch (RemoteException e) {
/* 188 */                       return liolilo.I00000oIO(new iOiIOO1ll(2, 6, "Failed to initialize service.", e));
                            } catch (RuntimeException e2) {
/* 178 */                       return liolilo.I00000oIO(new iOiIOO1ll(2, 0, "Failed to initialize service.", e2));
                            }
                        case 2:
/* 88 */                    il0Oi1i1II il0oi1i1ii2 = (il0Oi1i1II) obj;
/* 94 */                    ilIoii01i ilioii01i = (ilIoii01i) this.I00000oOI;
/* 98 */                    OoIOol ooIOol = new OoIOol(11);
/* 101 */                   ooIOol.I00iiI = ilioii01i;
/* 103 */                   ooIOol.I00iiO = il0oi1i1ii2;
/* 105 */                   VarHandle.storeStoreFence();
/* 121 */                   return il0oi1i1ii2.I00000oOI.I0000Il00O(iOiiloIII0O.I00000oIO(ooIOol), new O1oO0lOoI1(20));
                        default:
/* 10 */                    iOioO0lIOo ioioo0lioo = (iOioO0lIOo) this.I00000oOI;
/* 12 */                    l0IO0lo0ool l0io0lo0ool = (l0IO0lo0ool) obj;
                            try {
/* 14 */                        il11i0 il11i0VarI00000oIO = ioioo0lioo.I00000oIO();
/* 18 */                        io1011lii io1011liiVar = (io1011lii) l0io0lo0ool;
/* 20 */                        Parcel parcelI00Iooi00oi = io1011liiVar.I00Iooi00oi();
/* 24 */                        int i = iil0IIlIl0oo.I00000oIO;
/* 27 */                        parcelI00Iooi00oi.writeInt(1);
/* 30 */                        il11i0VarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 34 */                        Parcel parcelI00O0i0ii = io1011liiVar.I00O0i0ii(3, parcelI00Iooi00oi);
/* 38 */                        int i2 = parcelI00O0i0ii.readInt();
/* 42 */                        parcelI00O0i0ii.recycle();
/* 49 */                        return liolilo.I00000oOI(Integer.valueOf(i2));
                            } catch (RemoteException e3) {
/* 68 */                        Log.e("il0I1i0Oo1", "AiCore service failed to get feature status for ".concat(((iOoOoIioii) ioioo0lioo).I00000oIO), e3);
/* 83 */                        return liolilo.I00000oIO(iOiIOO1ll.I0000Il00O(6, e3, "AiCore service failed to get feature status for ".concat(((iOoOoIioii) ioioo0lioo).I00000oIO)));
                            }
                    }
                }
            }
