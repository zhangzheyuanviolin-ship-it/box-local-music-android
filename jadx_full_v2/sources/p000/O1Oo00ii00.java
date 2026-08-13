            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.View;
            
            public final class O1Oo00ii00 extends View.BaseSavedState {
                public static final Parcelable.Creator<O1Oo00ii00> CREATOR = new i1IIiI1OOo(10);
                public int I00iOIl;

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append(" CheckedState=");
/* 24 */            int i = this.I00iOIl;
/* 42 */            return IIl001iO0Io.I00100l0(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 10 */            parcel.writeValue(Integer.valueOf(this.I00iOIl));
                }
            }
