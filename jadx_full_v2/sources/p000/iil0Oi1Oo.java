            package p000;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class iil0Oi1Oo {
                static {
/* 3 */             iil0Oi1Oo.class.getClassLoader();
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
/* 29 */                throw new BadParcelableException(Oi010OO0.I000oI1ioi(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }
            }
