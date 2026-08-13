            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class liIlli extends I01OlIoIl {
                public static final Parcelable.Creator<liIlli> CREATOR = new iolIll1o(21);
                public final List I00iOIl;

                public liIlli(ArrayList arrayList) {
/* 4 */             this.I00iOIl = arrayList;
                }

                public static liIlli I00000oOI(lIoOOO... liooooArr) {
/* 4 */             ArrayList arrayList = new ArrayList(1);
/* 16 */            arrayList.add(Integer.valueOf(liooooArr[0].I00iOIl));
/* 21 */            return new liIlli(arrayList);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             List list = this.I00iOIl;
/* 9 */             if (list != null) {
/* 13 */                int iI00100l02 = lO0IioIooIl.I00100l0(1, parcel);
/* 17 */                int size = list.size();
/* 21 */                parcel.writeInt(size);
/* 25 */                for (int i2 = 0; i2 < size; i2++) {
/* 37 */                    parcel.writeInt(((Integer) list.get(i2)).intValue());
                        }
/* 43 */                lO0IioIooIl.I00100o1O0lo(iI00100l02, parcel);
                    }
/* 46 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
