            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public abstract class l1oOOloO0 {
                public static byte[] I00000oIO(Parcelable parcelable) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 6 */                 parcelable.writeToParcel(parcelObtain, 0);
/* 9 */                 return parcelObtain.marshall();
                    } finally {
/* 18 */                parcelObtain.recycle();
                    }
                }

                public static Object I00000oOI(byte[] bArr, Parcelable.Creator creator) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 7 */                 parcelObtain.unmarshall(bArr, 0, bArr.length);
/* 10 */                parcelObtain.setDataPosition(0);
/* 13 */                return creator.createFromParcel(parcelObtain);
                    } finally {
/* 22 */                parcelObtain.recycle();
                    }
                }
            }
