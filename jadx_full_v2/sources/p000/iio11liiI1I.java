            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iio11liiI1I implements Parcelable, o00ii00OIlo {
                public static final Parcelable.Creator<iio11liiI1I> CREATOR = new iiiilIIoIi(10);
                public lOI1lll1l10 I00iOIl;
                public iiOi1illIO1o I00iiI;
                public iio1oo0Ioo I00iiO;
                public lOI1lll1l10 I00iio;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, loi1lll1l10);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 28 */            lO0IioIooIl.I000o00OoI0I(parcel, 4, this.I00iio);
/* 31 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
