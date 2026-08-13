            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class I1lolIOl implements Parcelable {
                public static final Parcelable.Creator<I1lolIOl> CREATOR = new i1IIiI1OOo(4);
                public ArrayList I00iOIl;
                public ArrayList I00iiI;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeStringList(this.I00iOIl);
/* 8 */             parcel.writeTypedList(this.I00iiI);
                }
            }
