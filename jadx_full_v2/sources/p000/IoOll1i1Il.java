            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class IoOll1i1Il implements IoOlo00 {
                public IBinder I000II;

                @Override
                public final void I001lloI(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOlo00.I0000oI00);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 13 */                parcelObtain.writeStrongInterface(ioOlo1llOO);
/* 22 */                this.I000II.transact(10, parcelObtain, null, 1);
                    } finally {
/* 30 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final void I00IO1(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOlo00.I0000oI00);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 13 */                parcelObtain.writeStrongInterface(ioOlo1llOO);
/* 22 */                this.I000II.transact(9, parcelObtain, null, 1);
                    } finally {
/* 30 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
