            package p000;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class I0IIOOO1O implements Parcelable {
                public static final Parcelable.Creator<I0IIOOO1O> CREATOR = new i1IIiI1OOo(1);
                public final int I00iOIl;
                public final Intent I00iiI;

                public I0IIOOO1O(Intent intent, int i) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = intent;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
/* 9 */             int i = this.I00iOIl;
/* 25 */            sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
/* 30 */            sb.append(", data=");
/* 35 */            sb.append(this.I00iiI);
/* 40 */            sb.append('}');
/* 43 */            return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.I00iOIl);
/* 6 */             Intent intent = this.I00iiI;
/* 13 */            parcel.writeInt(intent == null ? 0 : 1);
/* 16 */            if (intent != null) {
/* 18 */                intent.writeToParcel(parcel, i);
                    }
                }
            }
