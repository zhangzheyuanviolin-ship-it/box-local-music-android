            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class i1oloIIl extends I01OlIoIl {
                public static final Parcelable.Creator<i1oloIIl> CREATOR = new i1I1lI001Io0(11);
                public ArrayList I00iOIl;
                public iII0O0OIo I00iiI;
                public ArrayList I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000l1(parcel, 1, arrayList);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 25 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
