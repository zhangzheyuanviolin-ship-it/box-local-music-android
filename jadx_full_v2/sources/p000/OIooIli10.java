            package p000;

            import android.net.Network;
            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public final class OIooIli10 implements Parcelable {
                public static final Parcelable.Creator<OIooIli10> CREATOR = new i1IIiI1OOo(21);
                public OlilOlOiI I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             OlilOlOiI olilOlOiI = this.I00iOIl;
/* 5 */             Network network = (Network) olilOlOiI.I00iio;
/* 7 */             int i2 = 0;
/* 13 */            int i3 = network != null ? 1 : 0;
/* 14 */            parcel.writeInt(i3);
/* 17 */            if (i3 != 0) {
/* 19 */                parcel.writeParcelable(network, i);
                    }
/* 24 */            List list = (List) olilOlOiI.I00iiO;
/* 28 */            List<String> list2 = (List) olilOlOiI.I00iiI;
/* 40 */            int i4 = (list == null || list.isEmpty()) ? 0 : 1;
/* 41 */            parcel.writeInt(i4);
/* 44 */            if (i4 != 0) {
/* 46 */                int size = list.size();
/* 50 */                Uri[] uriArr = new Uri[size];
/* 53 */                for (int i5 = 0; i5 < size; i5++) {
/* 61 */                    uriArr[i5] = (Uri) list.get(i5);
                        }
/* 66 */                parcel.writeParcelableArray(uriArr, i);
                    }
/* 69 */            if (list2 != null && !list2.isEmpty()) {
/* 77 */                i2 = 1;
                    }
/* 78 */            parcel.writeInt(i2);
/* 81 */            if (i2 != 0) {
/* 83 */                parcel.writeStringList(list2);
                    }
                }
            }
