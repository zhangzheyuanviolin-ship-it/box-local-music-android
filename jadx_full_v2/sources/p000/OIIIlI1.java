            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.View;
            
            public final class OIIIlI1 extends View.BaseSavedState {
                public static final Parcelable.Creator<OIIIlI1> CREATOR = new i1IIiI1OOo(12);
                public int I00iOIl;

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append(" scrollPosition=");
/* 28 */            return IIl001iO0Io.I000lI(this.I00iOIl, "}", sb);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 6 */             parcel.writeInt(this.I00iOIl);
                }
            }
