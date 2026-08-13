            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIolio1l implements Parcelable {
                public static final Parcelable.Creator<OIolio1l> CREATOR = new i1IIiI1OOo(16);
                public final IliliOOliOi I00iOIl;

                public OIolio1l(IliliOOliOi ililiOOliOi) {
/* 4 */             this.I00iOIl = ililiOOliOi;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OIolio1l) && O0000Ioio00.I0000O(this.I00iOIl, ((OIolio1l) obj).I00iOIl);
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 18 */            return "ParcelableForegroundInfo(foregroundInfo=" + this.I00iOIl + ')';
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             IliliOOliOi ililiOOliOi = this.I00iOIl;
/* 5 */             parcel.writeInt(ililiOOliOi.I00000oIO);
/* 10 */            parcel.writeParcelable(ililiOOliOi.I0000Il00O, i);
/* 15 */            parcel.writeInt(ililiOOliOi.I00000oOI);
                }
            }
