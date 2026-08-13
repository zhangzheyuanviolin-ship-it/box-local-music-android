            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iiO1OI extends I01OlIoIl {
                public static final Parcelable.Creator<iiO1OI> CREATOR = new iIlI1lioo0lO(23);
                public boolean I00iOIl;
                public byte[] I00iiI;
                public boolean I00iiO;
                public float I00iio;
                public boolean I00ilI0I1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             boolean z = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(z ? 1 : 0);
/* 20 */            lO0IioIooIl.I00000oOI(parcel, 2, this.I00iiI);
/* 23 */            boolean z2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(z2 ? 1 : 0);
/* 32 */            float f = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeFloat(f);
/* 40 */            boolean z3 = this.I00ilI0I1;
/* 43 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 46 */            parcel.writeInt(z3 ? 1 : 0);
/* 49 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
