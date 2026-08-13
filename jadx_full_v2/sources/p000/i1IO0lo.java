            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public final class i1IO0lo implements IInterface {
                public IBinder I000II;

                public final void I00000oOI(il1I00I il1i00i, Io0II1OlIo01 io0II1OlIo01) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 5 */             Parcel parcelObtain2 = Parcel.obtain();
                    try {
/* 11 */                parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
/* 14 */                parcelObtain.writeStrongBinder(il1i00i);
/* 18 */                parcelObtain.writeInt(1);
/* 22 */                iolIll1o.I00000oIO(io0II1OlIo01, parcelObtain, 0);
/* 29 */                this.I000II.transact(46, parcelObtain, parcelObtain2, 0);
/* 32 */                parcelObtain2.readException();
                    } finally {
/* 43 */                parcelObtain2.recycle();
/* 46 */                parcelObtain.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             return this.I000II;
                }
            }
