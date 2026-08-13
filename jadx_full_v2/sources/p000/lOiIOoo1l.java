            package p000;

            import android.os.IBinder;
            import android.os.Parcel;
            
            public final class lOiIOoo1l extends i0I1ioiiIioI implements liiiO1I1IlI {
                public lOiIOoo1l(IBinder iBinder) {
/* 4 */             super(iBinder, "com.google.android.apps.aicore.aidl.ICancellationCallback", 3);
                }

                @Override
                public final void I00000oIO() {
/* 1 */             Parcel parcelI00Iooi00oi = I00Iooi00oi();
                    try {
/* 10 */                this.I000O01llI0.transact(2, parcelI00Iooi00oi, null, 1);
                    } finally {
/* 18 */                parcelI00Iooi00oi.recycle();
                    }
                }
            }
