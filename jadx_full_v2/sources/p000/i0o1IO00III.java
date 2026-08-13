            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0o1IO00III extends I01OlIoIl {
                public static final Parcelable.Creator<i0o1IO00III> CREATOR = new OO00iO(19);
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public float I00ilI0I1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = this.I00iiO;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeInt(i4);
/* 34 */            int i5 = this.I00iio;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeInt(i5);
/* 43 */            float f = this.I00ilI0I1;
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 49 */            parcel.writeFloat(f);
/* 52 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
