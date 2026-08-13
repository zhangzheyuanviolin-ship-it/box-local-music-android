            package p000;

            import android.os.BadParcelableException;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class i0IoOOOoOIoI {
                public static final int I00000oIO = 0;

                static {
/* 3 */             i0IoOOOoOIoI.class.getClassLoader();
                }

                public static Parcelable I00000oIO(Parcel parcel) {
/* 1 */             Parcelable.Creator creator = Bundle.CREATOR;
/* 7 */             if (parcel.readInt() == 0) {
/* 9 */                 return null;
                    }
/* 15 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void I00000oOI(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 49 */                throw new BadParcelableException(Oi010OO0.I000oI1ioi(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }
            }
