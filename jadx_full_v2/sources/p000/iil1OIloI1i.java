            package p000;

            import android.os.BadParcelableException;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class iil1OIloI1i {
                public static final int I00000oIO = 0;

                static {
/* 3 */             iil1OIloI1i.class.getClassLoader();
                }

                public static Parcelable I00000oIO(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void I00000oOI(Parcel parcel, IInterface iInterface) {
/* 1 */             if (iInterface == null) {
/* 4 */                 parcel.writeStrongBinder(null);
                    } else {
/* 12 */                parcel.writeStrongBinder(iInterface.asBinder());
                    }
                }

                public static void I0000Il00O(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 77 */                throw new BadParcelableException(Oi010OO0.I00100l0(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                    }
                }
            }
