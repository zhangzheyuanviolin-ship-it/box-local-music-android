            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class ii111o0I implements iollIi0II1o {
                public final int I00000oIO;
                public Object I00000oOI;

                public ii111o0I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 207 */                   return ((il00iIOo1) ((ilOI1I0lloOl) this.I00000oOI).I00000oIO).I00000oIO().I0000Il00O();
                        case 1:
/* 132 */                   iOoll1io1010 iooll1io1010 = (iOoll1io1010) obj;
                            try {
/* 137 */                       o0oIIOoI11O1 o0oiiooi11o1I0000Il00O = ((ilOI1I0lloOl) this.I00000oOI).I0000Il00O(iooll1io1010.I00000oIO);
/* 143 */                       il0llll00oO il0llll00oo = iooll1io1010.I00000oOI;
/* 145 */                       il011ilOliio il011iloliio = new il011ilOliio();
/* 148 */                       if (o0oiiooi11o1I0000Il00O == null) {
/* 164 */                           IOOlIIilOl0.I000II("Null getService");
/* 167 */                           return null;
                                }
/* 150 */                       il011iloliio.I00000oIO = o0oiiooi11o1I0000Il00O;
/* 152 */                       il011iloliio.I00000oOI = il0llll00oo;
/* 154 */                       VarHandle.storeStoreFence();
/* 157 */                       return lioo0lo01i.I00000oOI(il011iloliio);
                            } catch (RemoteException e) {
/* 188 */                       return lioo0lo01i.I00000oIO(new iOlI0O0iIiO(2, 6, "Failed to initialize service.", e));
                            } catch (RuntimeException e2) {
/* 178 */                       return lioo0lo01i.I00000oIO(new iOlI0O0iIiO(2, 0, "Failed to initialize service.", e2));
                            }
                        case 2:
/* 88 */                    il011ilOliio il011iloliio2 = (il011ilOliio) obj;
/* 94 */                    ilOI1I0lloOl iloi1i0llool = (ilOI1I0lloOl) this.I00000oOI;
/* 98 */                    OoIol00Ool ooIol00Ool = new OoIol00Ool(10);
/* 101 */                   ooIol00Ool.I00iiI = iloi1i0llool;
/* 103 */                   ooIol00Ool.I00iiO = il011iloliio2;
/* 105 */                   VarHandle.storeStoreFence();
/* 121 */                   return il011iloliio2.I00000oOI.I0000O(iOiiloIII0O.I00000oIO(ooIol00Ool), new o0iOli(19));
                        default:
/* 10 */                    iOli1OIoI0o ioli1oioi0o = (iOli1OIoI0o) this.I00000oOI;
/* 12 */                    l0IIO1Oi0lOi l0iio1oi0loi = (l0IIO1Oi0lOi) obj;
                            try {
/* 14 */                        il11il01o il11il01oVarI00000oIO = ioli1oioi0o.I00000oIO();
/* 18 */                        io101O1Il io101o1il = (io101O1Il) l0iio1oi0loi;
/* 20 */                        Parcel parcelI00Iooi00oi = io101o1il.I00Iooi00oi();
/* 24 */                        int i = iil0Ii00oOI1.I00000oIO;
/* 27 */                        parcelI00Iooi00oi.writeInt(1);
/* 30 */                        il11il01oVarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 34 */                        Parcel parcelI00O0i0ii = io101o1il.I00O0i0ii(3, parcelI00Iooi00oi);
/* 38 */                        int i2 = parcelI00O0i0ii.readInt();
/* 42 */                        parcelI00O0i0ii.recycle();
/* 49 */                        return lioo0lo01i.I00000oOI(Integer.valueOf(i2));
                            } catch (RemoteException e3) {
/* 68 */                        Log.e("il00iIOo1", "AiCore service failed to get feature status for ".concat(((ii00Il000) ioli1oioi0o).I00000oIO), e3);
/* 83 */                        return lioo0lo01i.I00000oIO(iOlI0O0iIiO.I0000Il00O(6, e3, "AiCore service failed to get feature status for ".concat(((ii00Il000) ioli1oioi0o).I00000oIO)));
                            }
                    }
                }
            }
