            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIoloo implements Parcelable {
                public static final Parcelable.Creator<OIoloo> CREATOR = new i1IIiI1OOo(17);
                public String I00iOIl;
                public IliliOOliOi I00iiI;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 6 */             IliliOOliOi ililiOOliOi = this.I00iiI;
/* 10 */            parcel.writeInt(ililiOOliOi.I00000oIO);
/* 15 */            parcel.writeInt(ililiOOliOi.I00000oOI);
/* 20 */            parcel.writeParcelable(ililiOOliOi.I0000Il00O, i);
                }
            }
