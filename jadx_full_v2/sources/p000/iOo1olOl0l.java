            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
/* 18 */    public abstract class iOo1olOl0l extends Binder implements IInterface {
                public iOo1olOl0l(String str) {
/* 4 */             attachInterface(this, str);
                }

                @Override
                public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 4 */             if (i <= 16777215) {
/* 18 */                parcel.enforceInterface(getInterfaceDescriptor());
                    } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 12 */                return true;
                    }
/* 21 */            return zza(i, parcel, parcel2, i2);
                }

                public abstract boolean zza(int i, Parcel parcel, Parcel parcel2, int i2);

                @Override
/* 19 */        public IBinder asBinder() {
/* 20 */            return this;
                }
            }
