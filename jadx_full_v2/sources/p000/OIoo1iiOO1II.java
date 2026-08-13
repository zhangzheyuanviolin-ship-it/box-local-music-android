            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OIoo1iiOO1II implements Parcelable {
                public static final Parcelable.Creator<OIoo1iiOO1II> CREATOR = new i1IIiI1OOo(20);
                public O10oI0l1 I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
                    int i2;
/* 1 */             O10oI0l1 o10oI0l1 = this.I00iOIl;
/* 5 */             if (o10oI0l1 instanceof O10o0o00) {
/* 7 */                 i2 = 1;
                    } else if (o10oI0l1 instanceof O10o0oOio1) {
/* 13 */                i2 = 2;
                    } else {
/* 17 */                if (!(o10oI0l1 instanceof O10o0OiIIll)) {
/* 39 */                    IoOOl0iOl1io.I000OOo1O("Unknown Result ", o10oI0l1);
/* 106 */                   return;
                        }
/* 19 */                i2 = 3;
                    }
/* 20 */            parcel.writeInt(i2);
/* 23 */            Ii11I1OOII1 ii11I1OOII1I00000oIO = o10oI0l1.I00000oIO();
/* 27 */            Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 33 */            parcel.writeByteArray(il01ool0o.I0000Il00O(ii11I1OOII1I00000oIO));
                }
            }
