            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class O1Olilo0i1 extends I00iIO {
                public static final Parcelable.Creator<O1Olilo0i1> CREATOR = new Ol1o00oI(1);
                public boolean I00iiO;

                public O1Olilo0i1(Parcel parcel, ClassLoader classLoader) {
/* 1 */             super(parcel, classLoader);
/* 4 */             if (classLoader == null) {
/* 8 */                 O1Olilo0i1.class.getClassLoader();
                    }
/* 20 */            this.I00iiO = parcel.readInt() == 1;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 6 */             parcel.writeInt(this.I00iiO ? 1 : 0);
                }
            }
