            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class IOloii1OiOI extends I01OlIoIl {
                public static final Parcelable.Creator<IOloii1OiOI> CREATOR = new iolIll1o(13);
                public Oi1oo0 I00iOIl;
                public boolean I00iiI;
                public boolean I00iiO;
                public int[] I00iio;
                public int I00ilI0I1;
                public int[] I00ilO0;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 13 */            boolean z = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeInt(z ? 1 : 0);
/* 23 */            boolean z2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(z2 ? 1 : 0);
/* 34 */            lO0IioIooIl.I000II(parcel, 4, this.I00iio);
/* 37 */            int i2 = this.I00ilI0I1;
/* 40 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(i2);
/* 49 */            lO0IioIooIl.I000II(parcel, 6, this.I00ilO0);
/* 52 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
