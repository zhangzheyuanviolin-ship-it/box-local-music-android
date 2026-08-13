            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.View;
            
            public final class I1I1O000iiI0 extends View.BaseSavedState {
                public static final Parcelable.Creator<I1I1O000iiI0> CREATOR = new i1IIiI1OOo(2);
                public boolean I00iOIl;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 7 */             parcel.writeByte(this.I00iOIl ? (byte) 1 : (byte) 0);
                }
            }
