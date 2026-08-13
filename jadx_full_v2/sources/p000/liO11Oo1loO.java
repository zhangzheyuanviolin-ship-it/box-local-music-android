            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class liO11Oo1loO extends I01OlIoIl {
                public static final Parcelable.Creator<liO11Oo1loO> CREATOR = new iolIll1o(22);
                public final List I00iOIl;

                public liO11Oo1loO(ArrayList arrayList) {
/* 4 */             this.I00iOIl = arrayList;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, this.I00iOIl);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
