            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.UUID;
            
            public final class OO00ilI implements Parcelable {
                public static final Parcelable.Creator<OO00ilI> CREATOR = new OO00iO(0);
                public O0i0I0 I00iOIl;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             O0i0I0 o0i0I0 = this.I00iOIl;
/* 3 */             ArrayList arrayList = o0i0I0.I00000oIO;
/* 9 */             parcel.writeInt(arrayList.size());
/* 16 */            if (!arrayList.isEmpty()) {
/* 18 */                Iterator it = arrayList.iterator();
/* 26 */                while (it.hasNext()) {
/* 38 */                    parcel.writeString(((UUID) it.next()).toString());
                        }
                    }
/* 44 */            parcel.writeStringList(o0i0I0.I00000oOI);
/* 49 */            parcel.writeStringList(o0i0I0.I0000Il00O);
/* 52 */            ArrayList arrayList2 = o0i0I0.I0000O;
/* 58 */            parcel.writeInt(arrayList2.size());
/* 65 */            if (arrayList2.isEmpty()) {
/* 106 */               return;
                    }
/* 67 */            Iterator it2 = arrayList2.iterator();
/* 75 */            while (it2.hasNext()) {
/* 87 */                parcel.writeInt(liIOOIo0.I000iOII((i01IOiO1lO) it2.next()));
                    }
                }
            }
