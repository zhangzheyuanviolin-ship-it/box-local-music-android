            package p000;

            import android.os.BadParcelableException;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            
            public abstract class loOI100O extends iOo1olOl0l implements loOIoO {
                public loOI100O() {
/* 3 */             super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
                }

                public static loOIoO asInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
/* 13 */            if (iInterfaceQueryLocalInterface instanceof loOIoO) {
/* 15 */                return (loOIoO) iInterfaceQueryLocalInterface;
                    }
/* 20 */            loO0llIII loo0lliii = new loO0llIII();
/* 23 */            loo0lliii.I000II = iBinder;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return loo0lliii;
                }

                @Override
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i != 1) {
/* 72 */                return false;
                    }
/* 8 */             IoOlilli0ol ioOlilli0olI00O0i0ii = OIOiOlIO01.I00O0i0ii(parcel.readStrongBinder());
/* 12 */            Parcelable.Creator<loI1oilO> creator = loI1oilO.CREATOR;
/* 14 */            int i3 = iil0Oooo.I00000oIO;
/* 25 */            loI1oilO loi1oiloCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
/* 33 */            int iDataAvail = parcel.dataAvail();
/* 37 */            if (iDataAvail > 0) {
/* 71 */                throw new BadParcelableException(Oi010OO0.I000oI1ioi(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
/* 39 */            loIol0iOiooO loiol0ioioooNewFaceDetector = newFaceDetector(ioOlilli0olI00O0i0ii, loi1oiloCreateFromParcel);
/* 43 */            parcel2.writeNoException();
/* 46 */            if (loiol0ioioooNewFaceDetector == null) {
/* 48 */                parcel2.writeStrongBinder(null);
/* 1 */                 return true;
                    }
/* 56 */            parcel2.writeStrongBinder(loiol0ioioooNewFaceDetector.asBinder());
/* 1 */             return true;
                }
            }
