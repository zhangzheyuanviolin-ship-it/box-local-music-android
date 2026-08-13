            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class ll0oil extends Exception implements Parcelable {
                public static final Parcelable.Creator<ll0oil> CREATOR = new lli1OIlOOOI(0);
                public int I00iOIl;
                public int I00iiI;
                public il0111IIOlo I00iiO;
                public iiO010lI1iO I00iio;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 31 */            lO0IioIooIl.I000OiO(parcel, 3, getMessage());
/* 36 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iiO, i);
/* 42 */            lO0IioIooIl.I000OOo1O(parcel, 5, this.I00iio, i);
/* 45 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
