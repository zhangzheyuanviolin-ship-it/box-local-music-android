            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iI1IIiI1oo1 extends I01OlIoIl {
                public static final Parcelable.Creator<iI1IIiI1oo1> CREATOR = new i1I1lI001Io0(18);
                public String I00iOIl;
                public float I00iiI;
                public int I00iiO;
                public float I00iio;

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
/* 40 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
