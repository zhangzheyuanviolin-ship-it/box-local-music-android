            package p000;

            import android.os.Parcel;
            
            public final class iIOooO extends i0I1ioiiIioI {
                public final loliloil[] I00OI1(OIOiOlIO01 oIOiOlIO01, iIolOl1lo1 iiolol1lo1) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0IlOIo1Ol.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             parcelI00Iooi00oi.writeInt(1);
/* 13 */            iiolol1lo1.writeToParcel(parcelI00Iooi00oi, 0);
/* 16 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 26 */            loliloil[] loliloilVarArr = (loliloil[]) parcelI00O0i0ii.createTypedArray(loliloil.CREATOR);
/* 28 */            parcelI00O0i0ii.recycle();
/* 89 */            return loliloilVarArr;
                }
            }
