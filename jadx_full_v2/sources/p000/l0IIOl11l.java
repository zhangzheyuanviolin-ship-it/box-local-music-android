            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class l0IIOl11l extends I01OlIoIl {
                public static final Parcelable.Creator<l0IIOl11l> CREATOR = new iolIll1o(3);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final boolean I00iio;
                public final boolean I00ilI0I1;
                public final float I00ilO0;

                public l0IIOl11l(int i, int i2, int i3, boolean z, boolean z2, float f) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = z;
/* 12 */            this.I00ilI0I1 = z2;
/* 14 */            this.I00ilO0 = f;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeInt(this.I00iiO);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeInt(this.I00iio ? 1 : 0);
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 49 */            parcel.writeInt(this.I00ilI0I1 ? 1 : 0);
/* 53 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 58 */            parcel.writeFloat(this.I00ilO0);
/* 61 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
