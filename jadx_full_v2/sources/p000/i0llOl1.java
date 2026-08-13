            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
/* 27 */    public abstract class i0llOl1 extends Binder implements IInterface {
                public i0llOl1(String str) {
/* 4 */             attachInterface(this, str);
                }

                @Override
                public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 4 */             if (i <= 16777215) {
/* 18 */                parcel.enforceInterface(getInterfaceDescriptor());
                    } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 12 */                return true;
                    }
/* 21 */            return zba(i, parcel, parcel2, i2);
                }

                public abstract boolean zba(int i, Parcel parcel, Parcel parcel2, int i2);

                @Override
/* 28 */        public IBinder asBinder() {
/* 29 */            return this;
                }
            }
