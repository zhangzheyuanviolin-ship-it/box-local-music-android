            package p000;

            import android.graphics.Bitmap;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class loo11OllO extends I01OlIoIl {
                public static final Parcelable.Creator<loo11OllO> CREATOR = new lli1OIlOOOI(12);
                public ArrayList I00iOIl;
                public float[] I00iiI;
                public Bitmap I00iiO;
                public ArrayList I00iio;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, arrayList);
/* 16 */            lO0IioIooIl.I0000oI00(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 25 */            ArrayList arrayList2 = this.I00iio;
/* 27 */            if (arrayList2 != null) {
/* 31 */                int iI00100l02 = lO0IioIooIl.I00100l0(4, parcel);
/* 35 */                int size = arrayList2.size();
/* 39 */                parcel.writeInt(size);
/* 43 */                for (int i2 = 0; i2 < size; i2++) {
/* 55 */                    parcel.writeFloat(((Float) arrayList2.get(i2)).floatValue());
                        }
/* 61 */                lO0IioIooIl.I00100o1O0lo(iI00100l02, parcel);
                    }
/* 64 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
