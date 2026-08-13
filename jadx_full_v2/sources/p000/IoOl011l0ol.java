            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.Parcel;
            
/* 18 */    public abstract class IoOl011l0ol extends Binder implements IoOl0I1Io1O {
                public static final int I000II = 0;

                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 1 */             String str = IoOl0I1Io1O.I00000oIO;
/* 4 */             if (i >= 1 && i <= 16777215) {
/* 11 */                parcel.enforceInterface(str);
                    }
/* 17 */            if (i == 1598968902) {
/* 19 */                parcel2.writeString(str);
/* 3 */                 return true;
                    }
/* 23 */            if (i == 1) {
/* 84 */                O10oOIoI0 o10oOIoI0 = (O10oOIoI0) this;
/* 86 */                o10oOIoI0.I001IIilI0O(OOoolO01Ioo.I00000oOI(parcel.readStrongBinder()), parcel.createByteArray());
                    } else if (i == 2) {
/* 66 */                O10oOIoI0 o10oOIoI02 = (O10oOIoI0) this;
/* 68 */                o10oOIoI02.I00II0oii1o(OOoolO01Ioo.I00000oOI(parcel.readStrongBinder()), parcel.createByteArray());
                    } else {
/* 29 */                if (i != 3) {
/* 31 */                    return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 48 */                O10oOIoI0 o10oOIoI03 = (O10oOIoI0) this;
/* 50 */                o10oOIoI03.I001l0I00(OOoolO01Ioo.I00000oOI(parcel.readStrongBinder()), parcel.createByteArray());
                    }
/* 3 */             return true;
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
