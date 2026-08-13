            package p000;

            import android.graphics.Bitmap;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class loo0iOl1l1i extends I01OlIoIl {
                public static final Parcelable.Creator<loo0iOl1l1i> CREATOR = new lli1OIlOOOI(11);
                public float[] I00iOIl;
                public Bitmap I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             float[] fArr = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I0000oI00(parcel, 1, fArr);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            int i2 = this.I00iiO;
/* 23 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(i2);
/* 29 */            int i3 = this.I00iio;
/* 31 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(i3);
/* 37 */            int i4 = this.I00ilI0I1;
/* 40 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(i4);
/* 46 */            int i5 = this.I00ilO0;
/* 49 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 52 */            parcel.writeInt(i5);
/* 55 */            int i6 = this.I00io1l;
/* 58 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 61 */            parcel.writeInt(i6);
/* 64 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
