            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class i0OOOOol1Il extends i0I1ioiiIioI {
                public i0OOOOol1Il(IBinder iBinder) {
/* 4 */             super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback", 0);
                }

                public final void I00OI1(Bundle bundle) {
/* 1 */             Parcel parcelI00000oOI = I00000oOI();
/* 5 */             int i = i0IoOOOoOIoI.I00000oIO;
/* 8 */             parcelI00000oOI.writeInt(1);
/* 12 */            bundle.writeToParcel(parcelI00000oOI, 0);
/* 16 */            I0000O(3, parcelI00000oOI);
                }
            }
