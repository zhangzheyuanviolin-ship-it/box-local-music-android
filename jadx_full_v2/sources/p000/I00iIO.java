            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 20 */    public abstract class I00iIO implements Parcelable {
                public static final Parcelable.Creator<I00iIO> CREATOR;
                public static final I00i0oil I00iiI;
                public Parcelable I00iOIl;

                static {
/* 3 */             I00i0oil i00i0oil = new I00i0oil();
/* 7 */             i00i0oil.I00iOIl = null;
/* 9 */             I00iiI = i00i0oil;
/* 17 */            CREATOR = new OIoolIIoO00l(1);
                }

                public I00iIO(Parcelable parcelable) {
/* 5 */             if (parcelable != null) {
/* 13 */                this.I00iOIl = parcelable == I00iiI ? null : parcelable;
                    } else {
/* 18 */                I000II.I000iOII("superState must not be null");
/* 29 */                throw null;
                    }
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeParcelable(this.I00iOIl, i);
                }

/* 21 */        public I00iIO(Parcel parcel, ClassLoader classLoader) {
/* 23 */            Parcelable parcelable = parcel.readParcelable(classLoader);
/* 24 */            this.I00iOIl = parcelable == null ? I00iiI : parcelable;
                }
            }
