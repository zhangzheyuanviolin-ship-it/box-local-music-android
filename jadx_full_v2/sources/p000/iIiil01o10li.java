            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class iIiil01o10li extends i0I1ioiiIioI implements iIo00ilIil0 {
                public final iIOooO I00OI1(OIOiOlIO01 oIOiOlIO01, iI1oi10OOO ii1oi10ooo) {
                    iIOooO iioooo;
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0IlOIo1Ol.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             parcelI00Iooi00oi.writeInt(1);
/* 13 */            ii1oi10ooo.writeToParcel(parcelI00Iooi00oi, 0);
/* 16 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 20 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 24 */            if (strongBinder == null) {
/* 26 */                iioooo = null;
                    } else {
/* 30 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
/* 45 */                iioooo = iInterfaceQueryLocalInterface instanceof iIOooO ? (iIOooO) iInterfaceQueryLocalInterface : new iIOooO(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 6);
                    }
/* 49 */            parcelI00O0i0ii.recycle();
/* 89 */            return iioooo;
                }
            }
