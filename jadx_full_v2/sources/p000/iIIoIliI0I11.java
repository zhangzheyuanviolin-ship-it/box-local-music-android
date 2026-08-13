            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class iIIoIliI0I11 extends I01OlIoIl {
                public static final Parcelable.Creator<iIIoIliI0I11> CREATOR = new i1I1lI001Io0(25);
                public final io0o00I1ol1o I00iOIl;
                public final io0o00I1ol1o I00iiI;

                public iIIoIliI0I11(ArrayList arrayList, ArrayList arrayList2) {
/* 8 */             this.I00iOIl = io0o00I1ol1o.I000o00OoI0I(arrayList);
/* 14 */            this.I00iiI = io0o00I1ol1o.I000o00OoI0I(arrayList2);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000l1(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000l1(parcel, 2, this.I00iiI);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
