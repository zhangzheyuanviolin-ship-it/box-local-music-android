            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class l1O1o0o10o extends I01OlIoIl {
                public static final Parcelable.Creator<l1O1o0o10o> CREATOR = new iolIll1o(12);
                public Bundle I00iOIl;
                public IlIII1l[] I00iiI;
                public int I00iiO;
                public IOloii1OiOI I00iio;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I00000oIO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000lI(parcel, 2, this.I00iiI, i);
/* 19 */            int i2 = this.I00iiO;
/* 23 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(i2);
/* 31 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iio, i);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
