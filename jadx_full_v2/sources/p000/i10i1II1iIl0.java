            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class i10i1II1iIl0 extends i0llOl1 implements i10i1O {
                @Override
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
                    i10i11Ili i10i11iliCreateFromParcel;
/* 2 */             if (i == 1) {
/* 110 */               zbc();
/* 113 */               parcel2.writeNoException();
/* 1 */                 return true;
                    }
/* 5 */             if (i == 2) {
/* 103 */               zbd();
/* 106 */               parcel2.writeNoException();
/* 1 */                 return true;
                    }
/* 9 */             if (i == 3) {
/* 62 */                IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 66 */                Parcelable.Creator<i10i11Ili> creator = i10i11Ili.CREATOR;
/* 68 */                int i3 = i0loiIo0lI.I00000oIO;
/* 77 */                i10i11iliCreateFromParcel = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
/* 86 */                i0loiIo0lI.I00000oIO(parcel);
/* 89 */                i10iollO00 i10iollo00Zbb = zbb(ioOlilli0olI00O0i0ii, i10i11iliCreateFromParcel);
/* 93 */                parcel2.writeNoException();
/* 96 */                parcel2.writeInt(1);
/* 99 */                i10iollo00Zbb.writeToParcel(parcel2, 1);
/* 1 */                 return true;
                    }
/* 12 */            if (i != 4) {
/* 14 */                return false;
                    }
/* 20 */            IoOlilli0ol ioOlilli0olI00O0i0ii2 = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 24 */            Parcelable.Creator<i10i11Ili> creator2 = i10i11Ili.CREATOR;
/* 26 */            int i4 = i0loiIo0lI.I00000oIO;
/* 35 */            i10i11iliCreateFromParcel = parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null;
/* 44 */            i0loiIo0lI.I00000oIO(parcel);
/* 47 */            i0ol1oOIi1[] i0ol1ooii1ArrZbe = zbe(ioOlilli0olI00O0i0ii2, i10i11iliCreateFromParcel);
/* 51 */            parcel2.writeNoException();
/* 54 */            parcel2.writeTypedArray(i0ol1ooii1ArrZbe, 1);
/* 1 */             return true;
                }
            }
