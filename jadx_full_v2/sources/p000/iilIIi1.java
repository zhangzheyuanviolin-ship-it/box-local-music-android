            package p000;

            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class iilIIi1 extends I01OlIoIl implements o00ii00OIlo {
                public static final Parcelable.Creator<iilIIi1> CREATOR = new iiiilIIoIi(6);
                public final List I00iOIl;
                public final ParcelFileDescriptor I00iiI;

                public iilIIi1(ArrayList arrayList, ParcelFileDescriptor parcelFileDescriptor) {
/* 4 */             this.I00iOIl = arrayList;
/* 6 */             this.I00iiI = parcelFileDescriptor;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
