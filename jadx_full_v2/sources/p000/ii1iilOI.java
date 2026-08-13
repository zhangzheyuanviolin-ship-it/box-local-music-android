            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class ii1iilOI implements iol0i0iOol {
                public final int I00000oIO;
                public Object I00000oOI;

                public ii1iilOI(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 207 */                   return ((il0I11I011) ((ilIoi0) this.I00000oOI).I00000oIO).I00000oIO().I00000oIO();
                        case 1:
/* 132 */                   iOo0lOoi ioo0looi = (iOo0lOoi) obj;
                            try {
/* 137 */                       o0Il0li o0il0liI0000Il00O = ((ilIoi0) this.I00000oOI).I0000Il00O(ioo0looi.I00000oIO);
/* 143 */                       il0llll00oO il0llll00oo = ioo0looi.I00000oOI;
/* 145 */                       il0Oi10O1 il0oi10o1 = new il0Oi10O1();
/* 148 */                       if (o0il0liI0000Il00O == null) {
/* 164 */                           IOOlIIilOl0.I000II("Null getService");
/* 167 */                           return null;
                                }
/* 150 */                       il0oi10o1.I00000oIO = o0il0liI0000Il00O;
/* 152 */                       il0oi10o1.I00000oOI = il0llll00oo;
/* 154 */                       VarHandle.storeStoreFence();
/* 157 */                       return lioli1IO.I00000oOI(il0oi10o1);
                            } catch (RemoteException e) {
/* 188 */                       return lioli1IO.I00000oIO(new iOiI1oOo1l(2, 6, "Failed to initialize service.", e));
                            } catch (RuntimeException e2) {
/* 178 */                       return lioli1IO.I00000oIO(new iOiI1oOo1l(2, 0, "Failed to initialize service.", e2));
                            }
                        case 2:
/* 88 */                    il0Oi10O1 il0oi10o12 = (il0Oi10O1) obj;
/* 94 */                    ilIoi0 ilioi0 = (ilIoi0) this.I00000oOI;
/* 98 */                    i000IO i000io = new i000IO(8);
/* 101 */                   i000io.I00iiI = ilioi0;
/* 103 */                   i000io.I00iiO = il0oi10o12;
/* 105 */                   VarHandle.storeStoreFence();
/* 121 */                   return il0oi10o12.I00000oOI.I00000oOI(iOiiloIII0O.I00000oIO(i000io), new Io1Oioii1111(20));
                        default:
/* 10 */                    iOioIII1i ioioiii1i = (iOioIII1i) this.I00000oOI;
/* 12 */                    l0IIolOoi0I l0iiolooi0i = (l0IIolOoi0I) obj;
                            try {
/* 14 */                        il11O1OlI il11o1oliI00000oIO = ioioiii1i.I00000oIO();
/* 18 */                        io100oIo io100oio = (io100oIo) l0iiolooi0i;
/* 20 */                        Parcel parcelI00Iooi00oi = io100oio.I00Iooi00oi();
/* 24 */                        int i = iil0I01i.I00000oIO;
/* 27 */                        parcelI00Iooi00oi.writeInt(1);
/* 30 */                        il11o1oliI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 34 */                        Parcel parcelI00O0i0ii = io100oio.I00O0i0ii(3, parcelI00Iooi00oi);
/* 38 */                        int i2 = parcelI00O0i0ii.readInt();
/* 42 */                        parcelI00O0i0ii.recycle();
/* 49 */                        return lioli1IO.I00000oOI(Integer.valueOf(i2));
                            } catch (RemoteException e3) {
/* 68 */                        Log.e("il0I11I011", "AiCore service failed to get feature status for ".concat(((iOoOlIOOi) ioioiii1i).I00000oIO), e3);
/* 83 */                        return lioli1IO.I00000oIO(iOiI1oOo1l.I0000Il00O(6, e3, "AiCore service failed to get feature status for ".concat(((iOoOlIOOi) ioioiii1i).I00000oIO)));
                            }
                    }
                }
            }
