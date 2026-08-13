            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class loooII extends i0I1ioiiIioI implements o000OI1 {
                public final o000oI1Ii0 I00OI1(OIOiOlIO01 oIOiOlIO01, o011OIooio o011oiooio) {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 8 */             o000oI1Ii0 o000oi1ii0 = null;
/* 9 */             parcelI00Iooi00oi.writeStrongBinder(null);
/* 13 */            parcelI00Iooi00oi.writeInt(1);
/* 17 */            o011oiooio.writeToParcel(parcelI00Iooi00oi, 0);
/* 20 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 24 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 28 */            if (strongBinder != null) {
/* 33 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
/* 46 */                o000oi1ii0 = iInterfaceQueryLocalInterface instanceof o000oI1Ii0 ? (o000oI1Ii0) iInterfaceQueryLocalInterface : new o000oI1Ii0(strongBinder);
                    }
/* 49 */            parcelI00O0i0ii.recycle();
/* 89 */            return o000oi1ii0;
                }
            }
