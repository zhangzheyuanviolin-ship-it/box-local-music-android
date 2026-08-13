            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class o00Oi1I extends I01OlIoIl {
                public static final Parcelable.Creator<o00Oi1I> CREATOR = new lli1OIlOOOI(15);
                public String I00iOIl;
                public Rect I00iiI;
                public ArrayList I00iiO;
                public String I00iio;
                public ArrayList I00ilI0I1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 34 */            lO0IioIooIl.I000o00OoI0I(parcel, 5, this.I00ilI0I1);
/* 37 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
