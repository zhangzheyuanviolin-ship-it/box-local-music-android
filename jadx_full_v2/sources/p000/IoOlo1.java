            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class IoOlo1 implements IoOlo1llOO {
                public IBinder I000II;

                @Override
                public final void I0010I0i(String str) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOlo1llOO.I0001Ioi1lo);
/* 10 */                parcelObtain.writeString(str);
/* 18 */                this.I000II.transact(2, parcelObtain, null, 1);
                    } finally {
/* 26 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final void I001lIiIIo1O(byte[] bArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOlo1llOO.I0001Ioi1lo);
/* 10 */                parcelObtain.writeByteArray(bArr);
/* 17 */                this.I000II.transact(1, parcelObtain, null, 1);
                    } finally {
/* 25 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
