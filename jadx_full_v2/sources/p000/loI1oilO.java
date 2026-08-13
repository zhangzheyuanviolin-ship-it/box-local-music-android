            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class loI1oilO extends I01OlIoIl {
                public static final Parcelable.Creator<loI1oilO> CREATOR = new lli1OIlOOOI(6);
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public boolean I00ilI0I1;
                public float I00ilO0;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = this.I00iiO;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(i4);
/* 35 */            int i5 = this.I00iio;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(i5);
/* 43 */            boolean z = this.I00ilI0I1;
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 49 */            parcel.writeInt(z ? 1 : 0);
/* 52 */            float f = this.I00ilO0;
/* 55 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 58 */            parcel.writeFloat(f);
/* 61 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
