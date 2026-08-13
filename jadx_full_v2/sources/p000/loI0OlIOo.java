            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class loI0OlIOo extends I01OlIoIl {
                public static final Parcelable.Creator<loI0OlIOo> CREATOR = new lli1OIlOOOI(5);
                public final int I00iOIl;
                public final List I00iiI;

                public loI0OlIOo(int i, ArrayList arrayList) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = arrayList;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000o00OoI0I(parcel, 2, this.I00iiI);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
