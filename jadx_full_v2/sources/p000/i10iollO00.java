            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public final class i10iollO00 extends I01OlIoIl {
                public static final Parcelable.Creator<i10iollO00> CREATOR = new OO00iO(27);
                public final String I00iOIl;
                public final List I00iiI;

                public i10iollO00(String str, List list) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = list;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000o00OoI0I(parcel, 2, this.I00iiI);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
