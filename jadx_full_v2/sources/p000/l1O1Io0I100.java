            package p000;

            import android.os.Parcel;
            
            public final class l1O1Io0I100 extends i0I1ioiiIioI {
                public final io0oIoliO1[] I00OI1(OIOiOlIO01 oIOiOlIO01, OIOiOlIO01 oIOiOlIO012, OIOiOlIO01 oIOiOlIO013, int i, int i2, int i3, int i4, int i5, int i6, liiOlo1O01o liiolo1o01o) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 8 */             iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO012);
/* 11 */            iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO013);
/* 14 */            parcelI00Iooi00oi.writeInt(i);
/* 17 */            parcelI00Iooi00oi.writeInt(i2);
/* 20 */            parcelI00Iooi00oi.writeInt(i3);
/* 23 */            parcelI00Iooi00oi.writeInt(i4);
/* 26 */            parcelI00Iooi00oi.writeInt(i5);
/* 29 */            parcelI00Iooi00oi.writeInt(i6);
/* 33 */            parcelI00Iooi00oi.writeInt(1);
/* 37 */            liiolo1o01o.writeToParcel(parcelI00Iooi00oi, 0);
/* 41 */            Parcel parcelI00O0i0ii = I00O0i0ii(4, parcelI00Iooi00oi);
/* 51 */            io0oIoliO1[] io0oiolio1Arr = (io0oIoliO1[]) parcelI00O0i0ii.createTypedArray(io0oIoliO1.CREATOR);
/* 53 */            parcelI00O0i0ii.recycle();
/* 92 */            return io0oiolio1Arr;
                }
            }
