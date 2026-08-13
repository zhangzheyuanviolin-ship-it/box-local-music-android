            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class IoOioO1 implements IoOl0I1Io1O {
                public IBinder I000II;

                @Override
                public final void I001IIilI0O(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOl0I1Io1O.I00000oIO);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 13 */                parcelObtain.writeStrongInterface(ioOlo1llOO);
/* 20 */                this.I000II.transact(1, parcelObtain, null, 1);
                    } finally {
/* 28 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final void I001l0I00(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOl0I1Io1O.I00000oIO);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 13 */                parcelObtain.writeStrongInterface(ioOlo1llOO);
/* 21 */                this.I000II.transact(3, parcelObtain, null, 1);
                    } finally {
/* 29 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final void I00II0oii1o(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOl0I1Io1O.I00000oIO);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 13 */                parcelObtain.writeStrongInterface(ioOlo1llOO);
/* 21 */                this.I000II.transact(2, parcelObtain, null, 1);
                    } finally {
/* 29 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
