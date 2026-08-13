            package p000;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class lO0Ooi {
                public static final int I00000oIO = 0;

                static {
/* 3 */             lO0Ooi.class.getClassLoader();
                }

                public static Parcelable I00000oIO(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void I00000oOI(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 77 */                throw new BadParcelableException(Oi010OO0.I00100l0(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                    }
                }
            }
