            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class Oo1i1OOOOI extends I00iIO {
                public static final Parcelable.Creator<Oo1i1OOOOI> CREATOR = new OIoolIIoO00l(2);
                public int I00iiO;
                public boolean I00iio;

                public Oo1i1OOOOI(Parcel parcel, ClassLoader classLoader) {
/* 1 */             super(parcel, classLoader);
/* 8 */             this.I00iiO = parcel.readInt();
/* 19 */            this.I00iio = parcel.readInt() != 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 6 */             parcel.writeInt(this.I00iiO);
/* 11 */            parcel.writeInt(this.I00iio ? 1 : 0);
                }
            }
