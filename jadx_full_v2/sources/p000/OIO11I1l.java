            package p000;

            import android.app.Notification;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            public final class OIO11I1l {
                public String I00000oIO;
                public Notification I00000oOI;

                public final void I00000oIO(IoOliO10o1I1 ioOliO10o1I1) {
/* 1 */             String str = this.I00000oIO;
/* 3 */             Notification notification = this.I00000oOI;
/* 5 */             IoOlO0I ioOlO0I = (IoOlO0I) ioOliO10o1I1;
/* 7 */             ioOlO0I.getClass();
/* 10 */            Parcel parcelObtain = Parcel.obtain();
                    try {
/* 16 */                parcelObtain.writeInterfaceToken(IoOliO10o1I1.I0000O);
/* 19 */                parcelObtain.writeString(str);
/* 23 */                parcelObtain.writeInt(1);
/* 27 */                parcelObtain.writeString(null);
/* 31 */                parcelObtain.writeTypedObject(notification, 0);
/* 40 */                if (ioOlO0I.I000II.transact(1, parcelObtain, null, 1)) {
                        } else {
/* 53 */                    throw new RemoteException("Method notify is unimplemented.");
                        }
                    } finally {
/* 55 */                parcelObtain.recycle();
                    }
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("NotifyTask[packageName:"), this.I00000oIO, ", id:1, tag:null]");
                }
            }
