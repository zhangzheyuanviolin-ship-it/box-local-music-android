            package p000;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            
            public abstract class iil0IIlIl0oo {
                public static final int I00000oIO = 0;

                static {
/* 3 */             iil0IIlIl0oo.class.getClassLoader();
                }

                public static void I00000oIO(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 29 */                throw new BadParcelableException(Oi010OO0.I000oI1ioi(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }
            }
