            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class Ill1IIIIO implements Parcelable {
                public static final Parcelable.Creator<Ill1IIIIO> CREATOR = new i1IIiI1OOo(6);
                public String I00iOIl;
                public int I00iiI;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             parcel.writeInt(this.I00iiI);
                }
            }
