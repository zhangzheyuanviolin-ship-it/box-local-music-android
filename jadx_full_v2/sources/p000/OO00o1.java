            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class OO00o1 implements Parcelable {
                public static final Parcelable.Creator<OO00o1> CREATOR = new OO00iO(2);
                public ArrayList I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 7 */             OO00l1Il[] oO00l1IlArr = new OO00l1Il[arrayList.size()];
/* 14 */            for (int i2 = 0; i2 < arrayList.size(); i2++) {
/* 27 */                oO00l1IlArr[i2] = new OO00l1Il((i01OOII) arrayList.get(i2));
                    }
/* 32 */            parcel.writeParcelableArray(oO00l1IlArr, i);
                }
            }
