            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class iilOIlOio extends I01OlIoIl {
                public static final Parcelable.Creator<iilOIlOio> CREATOR = new iiiilIIoIi(8);
                public String I00iOIl;
                public float I00iiI;
                public int I00iiO;
                public float I00iio;
                public Bundle I00ilI0I1;
                public o0Il0Ii1 I00ilO0;
                public ArrayList I00io1l;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 13 */            float f = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeFloat(f);
/* 23 */            int i2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(i2);
/* 32 */            float f2 = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeFloat(f2);
/* 43 */            lO0IioIooIl.I00000oIO(parcel, 5, this.I00ilI0I1);
/* 49 */            lO0IioIooIl.I000OOo1O(parcel, 6, this.I00ilO0, i);
/* 55 */            lO0IioIooIl.I000o00OoI0I(parcel, 7, this.I00io1l);
/* 58 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
