            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class loliO1I0 extends I01OlIoIl {
                public static final Parcelable.Creator<loliO1I0> CREATOR = new lli1OIlOOOI(10);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public final long I00ilI0I1;

                public loliO1I0(int i, int i2, int i3, long j, int i4) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = i4;
/* 12 */            this.I00ilI0I1 = j;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 27 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.I00iiO);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.I00iio);
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 51 */            parcel.writeLong(this.I00ilI0I1);
/* 54 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
