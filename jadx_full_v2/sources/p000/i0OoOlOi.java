            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class i0OoOlOi extends I01OlIoIl {
                public static final Parcelable.Creator<i0OoOlOi> CREATOR = new OO00iO(13);
                public ArrayList I00iOIl;
                public String I00iiI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000l1(parcel, 1, arrayList);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
