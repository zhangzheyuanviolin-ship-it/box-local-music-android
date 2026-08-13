            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class IoOiOiI11 implements IoOiiIi0II {
                public IBinder I000II;

                public final boolean I00000oOI(Ii0ioI1 ii0ioI1) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 5 */             Parcel parcelObtain2 = Parcel.obtain();
                    try {
/* 11 */                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
/* 14 */                parcelObtain.writeStrongBinder(ii0ioI1);
/* 21 */                this.I000II.transact(3, parcelObtain, parcelObtain2, 0);
/* 24 */                parcelObtain2.readException();
/* 31 */                return parcelObtain2.readInt() != 0;
                    } finally {
/* 42 */                parcelObtain2.recycle();
/* 45 */                parcelObtain.recycle();
                    }
                }

                public final boolean I0000O() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 5 */             Parcel parcelObtain2 = Parcel.obtain();
                    try {
/* 11 */                parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
/* 16 */                parcelObtain.writeLong(0L);
/* 23 */                this.I000II.transact(2, parcelObtain, parcelObtain2, 0);
/* 26 */                parcelObtain2.readException();
/* 33 */                return parcelObtain2.readInt() != 0;
                    } finally {
/* 44 */                parcelObtain2.recycle();
/* 47 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
