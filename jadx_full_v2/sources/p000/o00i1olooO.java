            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class o00i1olooO implements Comparable, Parcelable {
                public static final Parcelable.Creator<o00i1olooO> CREATOR = new lli1OIlOOOI(9);
                public String I00iOIl;
                public long I00iiI;
                public int I00iiO;

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl.compareTo(((o00i1olooO) obj).I00iOIl);
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof o00i1olooO) {
/* 13 */                return this.I00iOIl.equals(((o00i1olooO) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             parcel.writeLong(this.I00iiI);
/* 13 */            parcel.writeInt(this.I00iiO);
                }
            }
