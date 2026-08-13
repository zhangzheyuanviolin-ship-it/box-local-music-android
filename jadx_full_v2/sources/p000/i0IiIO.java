            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public abstract class i0IiIO extends Binder implements IInterface {
                public final int I000II;

                public i0IiIO(String str, int i) {
/* 1 */             this.I000II = i;
                    switch (i) {
                        case 1:
/* 58 */                    attachInterface(this, str);
                            break;
                        case 2:
/* 51 */                    attachInterface(this, str);
                            break;
                        case 3:
/* 44 */                    attachInterface(this, str);
                            break;
                        case 4:
/* 37 */                    attachInterface(this, str);
                            break;
                        case 5:
/* 30 */                    attachInterface(this, str);
                            break;
                        case 6:
                        case 7:
                        case 8:
                        default:
/* 9 */                     attachInterface(this, str);
                            break;
                        case 9:
/* 23 */                    attachInterface(this, str);
                            break;
                        case 10:
/* 16 */                    attachInterface(this, str);
                            break;
                    }
                }

                public abstract boolean I00IoIO0lI(int i, Parcel parcel);

                public abstract boolean I00IoO0(int i, Parcel parcel, Parcel parcel2);

                public abstract boolean I00IoiI(int i, Parcel parcel);

                public boolean I00Iooi00oi(int i, Parcel parcel, Parcel parcel2) {
/* 1 */             return false;
                }

                @Override
                public IBinder asBinder() {
/* 1 */             int i = this.I000II;
/* 20 */            return this;
                }

                @Override
                public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                    switch (this.I000II) {
                        case 0:
/* 162 */                   if (i <= 16777215) {
/* 175 */                       parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 178 */                   return I00IoIO0lI(i, parcel);
                        case 1:
/* 141 */                   if (i <= 16777215) {
/* 154 */                       parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 157 */                   return I00IoO0(i, parcel, parcel2);
                        case 2:
/* 120 */                   if (i <= 16777215) {
/* 133 */                       parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 136 */                   return I00IoiI(i, parcel);
                        case 3:
/* 99 */                    if (i <= 16777215) {
/* 112 */                       parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 115 */                   return I00IoiI(i, parcel);
                        case 4:
/* 78 */                    if (i <= 16777215) {
/* 91 */                        parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 94 */                    return I00IoiI(i, parcel);
                        case 5:
/* 57 */                    if (i <= 16777215) {
/* 70 */                        parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 73 */                    return I00IoiI(i, parcel);
                        case 6:
                        case 7:
                        case 8:
                        default:
/* 10 */                    return super.onTransact(i, parcel, parcel2, i2);
                        case 9:
/* 36 */                    if (i <= 16777215) {
/* 49 */                        parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 52 */                    return I00Iooi00oi(i, parcel, parcel2);
                        case 10:
/* 15 */                    if (i <= 16777215) {
/* 28 */                        parcel.enforceInterface(getInterfaceDescriptor());
                            } else if (super.onTransact(i, parcel, parcel2, i2)) {
/* 3 */                         return true;
                            }
/* 31 */                    return I00IoiI(i, parcel);
                    }
                }
            }
