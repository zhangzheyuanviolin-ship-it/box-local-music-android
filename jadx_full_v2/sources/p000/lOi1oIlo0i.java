            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lOi1oIlo0i extends I01OlIoIl {
                public static final Parcelable.Creator<lOi1oIlo0i> CREATOR = new iolIll1o(18);
                public int I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public int I00iio;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            float f = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeFloat(f);
/* 26 */            float f2 = this.I00iiO;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeFloat(f2);
/* 35 */            int i3 = this.I00iio;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(i3);
/* 43 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
