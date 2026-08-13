            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
/* 18 */    public final class Ii0ioI1 extends Binder implements IInterface {
                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 7 */             if (i == 1598968902) {
/* 179 */               parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
/* 4 */                 return true;
                    }
                    switch (i) {
                        case 2:
/* 155 */                   parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 158 */                   parcel.readInt();
/* 165 */                   if (parcel.readInt() != 0) {
                            }
/* 175 */                   parcel2.writeNoException();
/* 4 */                     return true;
                        case 3:
/* 131 */                   parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 134 */                   parcel.readString();
/* 141 */                   if (parcel.readInt() != 0) {
                            }
/* 151 */                   parcel2.writeNoException();
/* 4 */                     return true;
                        case 4:
/* 110 */                   parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 117 */                   if (parcel.readInt() != 0) {
                            }
/* 127 */                   parcel2.writeNoException();
/* 4 */                     return true;
                        case 5:
/* 86 */                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 89 */                    parcel.readString();
/* 96 */                    if (parcel.readInt() != 0) {
                            }
/* 106 */                   parcel2.writeNoException();
/* 4 */                     return true;
                        case 6:
/* 45 */                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 48 */                    parcel.readInt();
/* 55 */                    if (parcel.readInt() != 0) {
                            }
/* 65 */                    parcel.readInt();
/* 72 */                    if (parcel.readInt() != 0) {
                            }
/* 82 */                    parcel2.writeNoException();
/* 4 */                     return true;
                        case 7:
/* 17 */                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
/* 20 */                    parcel.readString();
/* 27 */                    if (parcel.readInt() != 0) {
                            }
/* 37 */                    parcel2.writeNoException();
/* 41 */                    parcel2.writeInt(0);
/* 4 */                     return true;
                        default:
/* 12 */                    return super.onTransact(i, parcel, parcel2, i2);
                    }
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
