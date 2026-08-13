            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import java.util.ArrayList;
            
            public final class OO000l00O implements Parcelable {
                public OIoooI0i01ol I00iOIl;
                public static final Il1OO1ilo0o1[] I00iiI = Il1OO1ilo0o1.values();
                public static final Parcelable.Creator<OO000l00O> CREATOR = new i1IIiI1OOo(27);

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             OIoooI0i01ol oIoooI0i01ol = this.I00iOIl;
/* 3 */             String str = oIoooI0i01ol.I00000oIO;
/* 5 */             boolean zIsEmpty = TextUtils.isEmpty(str);
/* 11 */            parcel.writeInt(!zIsEmpty ? 1 : 0);
/* 14 */            if (!zIsEmpty) {
/* 16 */                parcel.writeString(str);
                    }
/* 25 */            parcel.writeInt(oIoooI0i01ol.I00000oOI.ordinal());
/* 28 */            ArrayList arrayList = oIoooI0i01ol.I0000Il00O;
/* 34 */            parcel.writeInt(arrayList.size());
/* 42 */            if (!arrayList.isEmpty()) {
/* 49 */                for (int i2 = 0; i2 < arrayList.size(); i2++) {
/* 62 */                    parcel.writeParcelable(new OO00l1Il((i01OOII) arrayList.get(i2)), i);
                        }
                    }
/* 68 */            ArrayList arrayList2 = oIoooI0i01ol.I0000O;
/* 80 */            int i3 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : 1;
/* 81 */            parcel.writeInt(i3);
/* 84 */            if (i3 != 0) {
/* 90 */                parcel.writeInt(arrayList2.size());
/* 97 */                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
/* 105 */                   OIoooI0i01ol oIoooI0i01ol2 = (OIoooI0i01ol) arrayList2.get(i4);
/* 107 */                   OO000l00O oO000l00O = new OO000l00O();
/* 110 */                   oO000l00O.I00iOIl = oIoooI0i01ol2;
/* 112 */                   parcel.writeParcelable(oO000l00O, i);
                        }
                    }
                }
            }
