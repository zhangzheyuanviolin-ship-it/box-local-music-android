            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class OO00Ii implements Parcelable {
                public i01Ii0ooO I00iOIl;
                public static final String[] I00iiI = new String[0];
                public static final Parcelable.Creator<OO00Ii> CREATOR = new i1IIiI1OOo(28);

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             i01Ii0ooO i01ii0ooo = this.I00iOIl;
/* 9 */             parcel.writeString(i01ii0ooo.I00000oIO.toString());
/* 18 */            parcel.writeInt(liIOOIo0.I000iOII(i01ii0ooo.I00000oOI));
/* 21 */            Ii11I1OOII1 ii11I1OOII1 = i01ii0ooo.I0000O;
/* 23 */            Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 29 */            parcel.writeByteArray(il01ool0o.I0000Il00O(ii11I1OOII1));
/* 47 */            parcel.writeStringArray((String[]) new ArrayList(i01ii0ooo.I0000Il00O).toArray(I00iiI));
/* 56 */            parcel.writeByteArray(il01ool0o.I0000Il00O(i01ii0ooo.I0000oI00));
/* 61 */            parcel.writeInt(i01ii0ooo.I0001Ioi1lo);
/* 66 */            parcel.writeInt(i01ii0ooo.I000II);
/* 76 */            new OIolIIO(i01ii0ooo.I000O01llI0).writeToParcel(parcel, i);
/* 81 */            parcel.writeLong(i01ii0ooo.I000OOo1O);
/* 84 */            i01IOOI i01iooi = i01ii0ooo.I000OiO;
/* 90 */            int i2 = i01iooi != null ? 1 : 0;
/* 91 */            parcel.writeInt(i2);
/* 94 */            if (i2 != 0) {
/* 98 */                parcel.writeLong(i01iooi.I00000oIO);
/* 103 */               parcel.writeLong(i01iooi.I00000oOI);
                    }
/* 108 */           parcel.writeLong(i01ii0ooo.I000iOII);
/* 113 */           parcel.writeInt(i01ii0ooo.I000l1);
                }
            }
