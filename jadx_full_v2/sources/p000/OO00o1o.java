            package p000;

            import android.net.Network;
            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.UUID;
            
            public final class OO00o1o implements Parcelable {
                public static final Parcelable.Creator<OO00o1o> CREATOR = new OO00iO(3);
                public UUID I00iOIl;
                public Ii11I1OOII1 I00iiI;
                public HashSet I00iiO;
                public OlilOlOiI I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OO00o1o(Parcel parcel) {
                    Ii11I1OOII1 ii11I1OOII1I00000oIO;
                    ArrayList arrayList;
/* 12 */            this.I00iOIl = UUID.fromString(parcel.readString());
/* 14 */            byte[] bArrCreateByteArray = parcel.createByteArray();
/* 18 */            if (bArrCreateByteArray != null) {
/* 20 */                Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 22 */                ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(bArrCreateByteArray);
/* 28 */                ii11I1OOII1I00000oIO = ii11I1OOII1I00000oIO == null ? Ii11I1OOII1.I00000oOI : ii11I1OOII1I00000oIO;
                    }
/* 30 */            this.I00iiI = ii11I1OOII1I00000oIO;
/* 41 */            this.I00iiO = new HashSet(parcel.createStringArrayList());
/* 45 */            ClassLoader classLoader = OIooIli10.class.getClassLoader();
/* 64 */            Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
/* 69 */            if (parcel.readInt() == 1) {
/* 71 */                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
/* 78 */                arrayList = new ArrayList(parcelableArray.length);
/* 83 */                for (Parcelable parcelable : parcelableArray) {
/* 89 */                    arrayList.add((Uri) parcelable);
                        }
                    } else {
/* 95 */                arrayList = null;
                    }
/* 102 */           ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
/* 108 */           OlilOlOiI olilOlOiI = new OlilOlOiI();
/* 111 */           olilOlOiI.I00iio = network;
/* 113 */           if (arrayList != null) {
/* 115 */               olilOlOiI.I00iiO = arrayList;
                    }
/* 117 */           if (arrayListCreateStringArrayList != null) {
/* 119 */               olilOlOiI.I00iiI = arrayListCreateStringArrayList;
                    }
/* 121 */           this.I00iio = olilOlOiI;
/* 127 */           this.I00ilI0I1 = parcel.readInt();
/* 133 */           this.I00ilO0 = parcel.readInt();
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 7 */             parcel.writeString(this.I00iOIl.toString());
/* 10 */            Ii11I1OOII1 ii11I1OOII1 = this.I00iiI;
/* 12 */            Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 18 */            parcel.writeByteArray(il01ool0o.I0000Il00O(ii11I1OOII1));
/* 28 */            parcel.writeStringList(new ArrayList(this.I00iiO));
/* 33 */            OlilOlOiI olilOlOiI = this.I00iio;
/* 35 */            OIooIli10 oIooIli10 = new OIooIli10();
/* 38 */            oIooIli10.I00iOIl = olilOlOiI;
/* 40 */            oIooIli10.writeToParcel(parcel, i);
/* 45 */            parcel.writeInt(this.I00ilI0I1);
/* 50 */            parcel.writeInt(this.I00ilO0);
                }
            }
