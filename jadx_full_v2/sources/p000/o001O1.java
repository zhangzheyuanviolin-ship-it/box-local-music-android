            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class o001O1 extends i0I1ioiiIioI implements o00IOli {
                public final o000oI1Ii0 I00OI1(OIOiOlIO01 oIOiOlIO01) {
                    o000oI1Ii0 o000oi1ii0;
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 13 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 17 */            if (strongBinder == null) {
/* 19 */                o000oi1ii0 = null;
                    } else {
/* 23 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
/* 37 */                o000oi1ii0 = iInterfaceQueryLocalInterface instanceof o000oI1Ii0 ? (o000oI1Ii0) iInterfaceQueryLocalInterface : new o000oI1Ii0(strongBinder);
                    }
/* 41 */            parcelI00O0i0ii.recycle();
/* 49 */            return o000oi1ii0;
                }

                public final o000oI1Ii0 I00OIO1(OIOiOlIO01 oIOiOlIO01, o011OIooio o011oiooio) {
                    o000oI1Ii0 o000oi1ii0;
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             parcelI00Iooi00oi.writeInt(1);
/* 13 */            o011oiooio.writeToParcel(parcelI00Iooi00oi, 0);
/* 17 */            Parcel parcelI00O0i0ii = I00O0i0ii(2, parcelI00Iooi00oi);
/* 21 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 25 */            if (strongBinder == null) {
/* 27 */                o000oi1ii0 = null;
                    } else {
/* 31 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
/* 45 */                o000oi1ii0 = iInterfaceQueryLocalInterface instanceof o000oI1Ii0 ? (o000oI1Ii0) iInterfaceQueryLocalInterface : new o000oI1Ii0(strongBinder);
                    }
/* 49 */            parcelI00O0i0ii.recycle();
/* 89 */            return o000oi1ii0;
                }
            }
