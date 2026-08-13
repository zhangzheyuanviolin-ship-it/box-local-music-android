            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class IoOl1lO1o implements IoOl1llI1 {
                public IBinder I000II;

                @Override
                public final void I000lI(String[] strArr) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.writeInterfaceToken(IoOl1llI1.I00000oOI);
/* 10 */                parcelObtain.writeStringArray(strArr);
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
