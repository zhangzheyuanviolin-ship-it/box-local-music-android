            package p000;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class i0OlOO {
                public static final int I00000oIO = 0;

                static {
/* 3 */             i0OlOO.class.getClassLoader();
                }

                public static Parcelable I00000oIO(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void I00000oOI(Parcel parcel, Parcelable parcelable) {
/* 2 */             if (parcelable == null) {
/* 4 */                 parcel.writeInt(0);
                    } else {
/* 9 */                 parcel.writeInt(1);
/* 12 */                parcelable.writeToParcel(parcel, 0);
                    }
                }

                public static void I0000Il00O(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 77 */                throw new BadParcelableException(Oi010OO0.I00100l0(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                    }
                }
            }
