            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            
            public final class iiiOloI1iOl implements Runnable {
                public final int I00iOIl;
                public li0ioOOll I00iiI;

                @Override
                public final void run() {
                    Parcel parcelI00Iooi00oi;
/* 1 */             int i = this.I00iOIl;
/* 8 */             li0ioOOll li0ioooll = this.I00iiI;
                    switch (i) {
                        case 0:
                            try {
/* 38 */                        parcelI00Iooi00oi = li0ioooll.I00Iooi00oi();
                                try {
/* 44 */                            li0ioooll.I000O01llI0.transact(2, parcelI00Iooi00oi, null, 1);
/* 47 */                            parcelI00Iooi00oi.recycle();
/* 62 */                            return;
                                } finally {
                                }
                            } catch (RemoteException e) {
/* 59 */                        Log.w("iiI11l01l", "Failed to cancel preparation of inference engine", e);
/* 62 */                        return;
                            }
                        default:
                            try {
/* 13 */                        parcelI00Iooi00oi = li0ioooll.I00Iooi00oi();
                                try {
/* 19 */                            li0ioooll.I000O01llI0.transact(2, parcelI00Iooi00oi, null, 1);
/* 22 */                            parcelI00Iooi00oi.recycle();
/* 37 */                            return;
                                } finally {
                                }
                            } catch (RemoteException e2) {
/* 34 */                        Log.w("iiI11l01l", "Failed to cancel inference", e2);
/* 37 */                        return;
                            }
                    }
                }
            }
