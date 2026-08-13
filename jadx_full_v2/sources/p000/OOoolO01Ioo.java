            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
/* 18 */    public final class OOoolO01Ioo extends Binder implements IoOlo1llOO {
                public final OiIOol0 I000II;

                public OOoolO01Ioo(OiIOol0 oiIOol0) {
/* 1 */             this.I000II = oiIOol0;
/* 8 */             attachInterface(this, IoOlo1llOO.I0001Ioi1lo);
                }

                public static IoOlo1llOO I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IoOlo1llOO.I0001Ioi1lo);
/* 11 */            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IoOlo1llOO)) {
/* 17 */                return (IoOlo1llOO) iInterfaceQueryLocalInterface;
                    }
/* 22 */            IoOlo1 ioOlo1 = new IoOlo1();
/* 25 */            ioOlo1.I000II = iBinder;
/* 29 */            return ioOlo1;
                }

                @Override
                public final void I0010I0i(String str) {
/* 12 */            this.I000II.resumeWith(lIoii1l01l0i.I00000oIO(new RuntimeException(str)));
                }

                @Override
                public final void I001lIiIIo1O(byte[] bArr) {
/* 3 */             this.I000II.resumeWith(bArr);
                }

                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 1 */             String str = IoOlo1llOO.I0001Ioi1lo;
/* 4 */             if (i >= 1 && i <= 16777215) {
/* 11 */                parcel.enforceInterface(str);
                    }
/* 17 */            if (i == 1598968902) {
/* 19 */                parcel2.writeString(str);
/* 3 */                 return true;
                    }
/* 23 */            if (i == 1) {
/* 45 */                I001lIiIIo1O(parcel.createByteArray());
/* 3 */                 return true;
                    }
/* 26 */            if (i != 2) {
/* 28 */                return super.onTransact(i, parcel, parcel2, i2);
                    }
/* 37 */            I0010I0i(parcel.readString());
/* 3 */             return true;
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
