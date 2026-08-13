            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class o01IIOl01 extends I01OlIoIl {
                public static final Parcelable.Creator<o01IIOl01> CREATOR = new lli1OIlOOOI(20);
                public String I00iOIl;
                public Rect I00iiI;
                public ArrayList I00iiO;
                public float I00iio;
                public float I00ilI0I1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 25 */            float f = this.I00iio;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeFloat(f);
/* 34 */            float f2 = this.I00ilI0I1;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeFloat(f2);
/* 43 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
