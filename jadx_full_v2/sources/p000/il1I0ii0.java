            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class il1I0ii0 implements io0ooloI, IInterface {
                public IBinder I000II;

                public final Parcel I00000oOI(int i, Parcel parcel) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 8 */                     this.I000II.transact(i, parcel, parcelObtain, 0);
/* 11 */                    parcelObtain.readException();
/* 17 */                    return parcelObtain;
                        } catch (RuntimeException e) {
/* 21 */                    parcelObtain.recycle();
/* 24 */                    throw e;
                        }
                    } finally {
/* 25 */                parcel.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
