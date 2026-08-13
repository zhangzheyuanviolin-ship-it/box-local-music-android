            package p000;

            import android.os.BadParcelableException;
            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            
/* 18 */    public final class l0o1lloI extends Binder implements IInterface {
                public final OloIlI0ll I000II;

                public l0o1lloI(i0i01Ii0iII i0i01ii0iii, OloIlI0ll oloIlI0ll) {
/* 1 */             this.I000II = oloIlI0ll;
/* 8 */             attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
                }

                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 5 */             if (i <= 16777215) {
/* 18 */                parcel.enforceInterface(getInterfaceDescriptor());
                    } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 4 */                 return true;
                    }
/* 21 */            if (i != 1) {
/* 104 */               return false;
                    }
/* 23 */            Parcelable.Creator<Status> creator = Status.CREATOR;
/* 25 */            int i3 = iil1O1oI0O.I00000oIO;
/* 36 */            Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
/* 44 */            String string = parcel.readString();
/* 57 */            I11Oioio i11OioioCreateFromParcel = parcel.readInt() != 0 ? I11Oioio.CREATOR.createFromParcel(parcel) : null;
/* 65 */            int iDataAvail = parcel.dataAvail();
/* 69 */            if (iDataAvail > 0) {
/* 103 */               throw new BadParcelableException(Oi010OO0.I00100l0(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                    }
/* 73 */            lOillIl0ll1.I00000oIO(statusCreateFromParcel, string, this.I000II);
/* 4 */             return true;
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
