            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class l1ol1oIOolo extends i0I1ioiiIioI implements lO0i01Ilool {
                public final l1O1Io0I100 I00OI1(OIOiOlIO01 oIOiOlIO01, l0IIOl11l l0iiol11l) {
                    l1O1Io0I100 l1o1io0i100;
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             parcelI00Iooi00oi.writeInt(1);
/* 13 */            l0iiol11l.writeToParcel(parcelI00Iooi00oi, 0);
/* 16 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 20 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 24 */            if (strongBinder == null) {
/* 26 */                l1o1io0i100 = null;
                    } else {
/* 30 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
/* 45 */                l1o1io0i100 = iInterfaceQueryLocalInterface instanceof l1O1Io0I100 ? (l1O1Io0I100) iInterfaceQueryLocalInterface : new l1O1Io0I100(strongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 7);
                    }
/* 49 */            parcelI00O0i0ii.recycle();
/* 89 */            return l1o1io0i100;
                }
            }
