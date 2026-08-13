            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OO00i0l implements Parcelable {
                public static final Parcelable.Creator<OO00i0l> CREATOR = new i1IIiI1OOo(29);
                public List I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             List list = this.I00iOIl;
/* 7 */             OO00Ii[] oO00IiArr = new OO00Ii[list.size()];
/* 14 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 22 */                i01Ii0ooO i01ii0ooo = (i01Ii0ooO) list.get(i2);
/* 24 */                OO00Ii oO00Ii = new OO00Ii();
/* 27 */                oO00Ii.I00iOIl = i01ii0ooo;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                oO00IiArr[i2] = oO00Ii;
                    }
/* 37 */            parcel.writeParcelableArray(oO00IiArr, i);
                }
            }
