            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Map;
            
            public final class O1il00oooo implements Parcelable {

                @Deprecated
                public static final Parcelable.Creator<O1il00oooo> CREATOR = new i1IIiI1OOo(11);
                public final String I00iOIl;
                public final Map I00iiI;

                public O1il00oooo(String str, Map map) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = map;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof O1il00oooo)) {
/* 32 */                return false;
                    }
/* 9 */             O1il00oooo o1il00oooo = (O1il00oooo) obj;
                    return O0000Ioio00.I0000O(this.I00iOIl, o1il00oooo.I00iOIl) && O0000Ioio00.I0000O(this.I00iiI, o1il00oooo.I00iiI);
                }

                public final int hashCode() {
/* 15 */            return this.I00iiI.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Key(key=" + this.I00iOIl + ", extras=" + this.I00iiI + ')';
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 6 */             Map map = this.I00iiI;
/* 12 */            parcel.writeInt(map.size());
/* 27 */            for (Map.Entry entry : map.entrySet()) {
/* 39 */                String str = (String) entry.getKey();
/* 45 */                String str2 = (String) entry.getValue();
/* 47 */                parcel.writeString(str);
/* 50 */                parcel.writeString(str2);
                    }
                }
            }
