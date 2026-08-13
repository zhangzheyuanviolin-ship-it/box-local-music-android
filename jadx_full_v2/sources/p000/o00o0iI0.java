            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class o00o0iI0 extends I01OlIoIl {
                public static final Parcelable.Creator<o00o0iI0> CREATOR = new lli1OIlOOOI(16);
                public String I00iOIl;
                public Rect I00iiI;
                public ArrayList I00iiO;
                public String I00iio;
                public float I00ilI0I1;
                public float I00ilO0;
                public ArrayList I00io1l;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 31 */            float f = this.I00ilI0I1;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 37 */            parcel.writeFloat(f);
/* 40 */            float f2 = this.I00ilO0;
/* 43 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 46 */            parcel.writeFloat(f2);
/* 52 */            lO0IioIooIl.I000o00OoI0I(parcel, 7, this.I00io1l);
/* 55 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
