            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class l0o1iOI1ll0 extends i0I1ioiiIioI implements l1olil1 {
                public final l0IIiOOll I00OI1(OIOiOlIO01 oIOiOlIO01, liiOo00 liioo00) {
                    l0IIiOOll l0iiiooll;
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
/* 5 */             iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01);
/* 9 */             parcelI00Iooi00oi.writeInt(1);
/* 13 */            liioo00.writeToParcel(parcelI00Iooi00oi, 0);
/* 16 */            Parcel parcelI00O0i0ii = I00O0i0ii(1, parcelI00Iooi00oi);
/* 20 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 24 */            if (strongBinder == null) {
/* 26 */                l0iiiooll = null;
                    } else {
/* 30 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
/* 46 */                l0iiiooll = iInterfaceQueryLocalInterface instanceof l0IIiOOll ? (l0IIiOOll) iInterfaceQueryLocalInterface : new l0IIiOOll(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 9);
                    }
/* 50 */            parcelI00O0i0ii.recycle();
/* 89 */            return l0iiiooll;
                }
            }
