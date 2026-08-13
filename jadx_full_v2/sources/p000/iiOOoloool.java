            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class iiOOoloool implements l0OI000IIIi {
                public final int I00000oIO;
                public Object I00000oOI;

                public iiOOoloool(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 209 */                   return ((il1OOI0) ((iiI11l01l) this.I00000oOI).I00000oIO).I00000oIO().I0000O();
                        case 1:
/* 133 */                   iOl1oo01Ii iol1oo01ii = (iOl1oo01Ii) obj;
                            try {
/* 138 */                       o00iIloIO o00iiloioI00000oOI = ((iiI11l01l) this.I00000oOI).I00000oOI(iol1oo01ii.I00000oIO);
/* 144 */                       il0llll00oO il0llll00oo = iol1oo01ii.I00000oOI;
/* 146 */                       il1iII1Oo il1iii1oo = new il1iII1Oo();
/* 149 */                       if (o00iiloioI00000oOI == null) {
/* 166 */                           IOOlIIilOl0.I000II("Null getService");
/* 169 */                           return null;
                                }
/* 151 */                       il1iii1oo.I00000oIO = o00iiloioI00000oOI;
/* 153 */                       il1iii1oo.I00000oOI = il0llll00oo;
/* 155 */                       VarHandle.storeStoreFence();
/* 160 */                       return new l0lI0IOIl000(il1iii1oo);
                            } catch (RemoteException e) {
/* 190 */                       return ll00lliII.I00000oIO(new iOIIOoOoii(2, 6, "Failed to initialize service.", e));
                            } catch (RuntimeException e2) {
/* 180 */                       return ll00lliII.I00000oIO(new iOIIOoOoii(2, 0, "Failed to initialize service.", e2));
                            }
                        case 2:
/* 89 */                    il1iII1Oo il1iii1oo2 = (il1iII1Oo) obj;
/* 95 */                    iiI11l01l iii11l01l = (iiI11l01l) this.I00000oOI;
/* 99 */                    OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(8);
/* 102 */                   ooOlO1O0o.I00iiI = iii11l01l;
/* 104 */                   ooOlO1O0o.I00iiO = il1iii1oo2;
/* 106 */                   VarHandle.storeStoreFence();
/* 122 */                   return il1iii1oo2.I00000oOI.I00000oIO(iOiiloIII0O.I00000oIO(ooOlO1O0o), new lo1iloiI1(20));
                        default:
/* 10 */                    iOIoil ioioil = (iOIoil) this.I00000oOI;
/* 12 */                    l0o1looii0Ol l0o1looii0ol = (l0o1looii0Ol) obj;
                            try {
/* 14 */                        il1I1O il1i1oI00000oIO = ioioil.I00000oIO();
/* 18 */                        iolOiIoi ioloiioi = (iolOiIoi) l0o1looii0ol;
/* 20 */                        Parcel parcelI00Iooi00oi = ioloiioi.I00Iooi00oi();
/* 24 */                        int i = iil1ii1loOI1.I00000oIO;
/* 27 */                        parcelI00Iooi00oi.writeInt(1);
/* 30 */                        il1i1oI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 34 */                        Parcel parcelI00O0i0ii = ioloiioi.I00O0i0ii(3, parcelI00Iooi00oi);
/* 38 */                        int i2 = parcelI00O0i0ii.readInt();
/* 42 */                        parcelI00O0i0ii.recycle();
/* 51 */                        return new l0lI0IOIl000(Integer.valueOf(i2));
                            } catch (RemoteException e3) {
/* 69 */                        Log.e("il1OOI0", "AiCore service failed to get feature status for ".concat(((iOli1OIiO1I0) ioioil).I00000oIO), e3);
/* 84 */                        return ll00lliII.I00000oIO(iOIIOoOoii.I0000Il00O(6, e3, "AiCore service failed to get feature status for ".concat(((iOli1OIiO1I0) ioioil).I00000oIO)));
                            }
                    }
                }
            }
