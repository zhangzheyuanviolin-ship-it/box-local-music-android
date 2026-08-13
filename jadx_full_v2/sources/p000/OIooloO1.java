            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIooloO1 implements Parcelable {
                public static final Parcelable.Creator<OIooloO1> CREATOR = new i1IIiI1OOo(26);
                public String I00iOIl;
                public OIolIiIOI1I I00iiI;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             this.I00iiI.writeToParcel(parcel, i);
                }
            }
