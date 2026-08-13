            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIoo00 implements Parcelable {
                public static final Parcelable.Creator<OIoo00> CREATOR = new i1IIiI1OOo(18);
                public final String I00iOIl;
                public final int I00iiI;

                public OIoo00(String str, int i) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof OIoo00)) {
/* 28 */                return false;
                    }
/* 9 */             OIoo00 oIoo00 = (OIoo00) obj;
                    return this.I00iOIl.equals(oIoo00.I00iOIl) && this.I00iiI == oIoo00.I00iiI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00iiI) + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ParcelableInterruptRequest(id=");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append(", stopReason=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00iiI, ')');
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             parcel.writeInt(this.I00iiI);
                }
            }
