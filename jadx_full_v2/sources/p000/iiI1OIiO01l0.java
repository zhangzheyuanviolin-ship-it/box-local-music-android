            package p000;

            import android.os.Parcel;
            import java.util.List;
            
            public abstract class iiI1OIiO01l0 extends iOo1lllooOO implements iiIIi0ll11iI {
                @Override
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i == 1) {
/* 111 */               zzd();
/* 114 */               parcel2.writeNoException();
                    } else if (i == 2) {
/* 104 */               zzf();
/* 107 */               parcel2.writeNoException();
                    } else if (i == 3) {
/* 78 */                IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 88 */                iilO0il1i iilo0il1i = (iilO0il1i) iil0Oi1Oo.I00000oIO(parcel, iilO0il1i.CREATOR);
/* 90 */                iil0Oi1Oo.I00000oOI(parcel);
/* 93 */                List listZzb = zzb(ioOlilli0olI00O0i0ii, iilo0il1i);
/* 97 */                parcel2.writeNoException();
/* 100 */               parcel2.writeTypedList(listZzb);
                    } else if (i == 4) {
/* 40 */                IoOlilli0ol ioOlilli0olI00O0i0ii2 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 50 */                iilO0il1i iilo0il1i2 = (iilO0il1i) iil0Oi1Oo.I00000oIO(parcel, iilO0il1i.CREATOR);
/* 58 */                ii00i0iiOOOo ii00i0iioooo = (ii00i0iiOOOo) iil0Oi1Oo.I00000oIO(parcel, ii00i0iiOOOo.CREATOR);
/* 60 */                iil0Oi1Oo.I00000oOI(parcel);
/* 63 */                List listZzc = zzc(ioOlilli0olI00O0i0ii2, iilo0il1i2, ii00i0iioooo);
/* 67 */                parcel2.writeNoException();
/* 70 */                parcel2.writeTypedList(listZzc);
                    } else {
/* 14 */                if (i != 5) {
/* 16 */                    return false;
                        }
/* 24 */                ii0IlI0 ii0ili0 = (ii0IlI0) iil0Oi1Oo.I00000oIO(parcel, ii0IlI0.CREATOR);
/* 26 */                iil0Oi1Oo.I00000oOI(parcel);
/* 29 */                zze(ii0ili0);
/* 32 */                parcel2.writeNoException();
                    }
/* 1 */             return true;
                }
            }
