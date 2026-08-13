            package p000;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public abstract class loIlli0 extends iOo1olOl0l implements loIol0iOiooO {
                public loIlli0() {
/* 3 */             super("com.google.mlkit.vision.face.aidls.IFaceDetector");
                }

                @Override
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i == 1) {
/* 76 */                zzc();
/* 79 */                parcel2.writeNoException();
/* 1 */                 return true;
                    }
/* 5 */             if (i == 2) {
/* 69 */                zzd();
/* 72 */                parcel2.writeNoException();
/* 1 */                 return true;
                    }
/* 8 */             if (i != 3) {
/* 10 */                return false;
                    }
/* 16 */            IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 20 */            Parcelable.Creator<lo1oIIiO> creator = lo1oIIiO.CREATOR;
/* 22 */            int i3 = iil0Oooo.I00000oIO;
/* 32 */            lo1oIIiO lo1oiiioCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
/* 40 */            int iDataAvail = parcel.dataAvail();
/* 44 */            if (iDataAvail > 0) {
/* 68 */                throw new BadParcelableException(Oi010OO0.I000oI1ioi(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
/* 46 */            List listZzb = zzb(ioOlilli0olI00O0i0ii, lo1oiiioCreateFromParcel);
/* 50 */            parcel2.writeNoException();
/* 53 */            parcel2.writeTypedList(listZzb);
/* 1 */             return true;
                }
            }
