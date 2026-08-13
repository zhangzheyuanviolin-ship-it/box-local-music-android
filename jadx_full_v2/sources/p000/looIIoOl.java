            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class looIIoOl extends I01OlIoIl {
                public static final Parcelable.Creator<looIIoOl> CREATOR = new lli1OIlOOOI(13);
                public final boolean I00iOIl;
                public final boolean I00iiI;
                public final boolean I00iiO;
                public final boolean I00iio;
                public final boolean I00ilI0I1;

                public looIIoOl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = z2;
/* 8 */             this.I00iiO = z3;
/* 10 */            this.I00iio = z4;
/* 12 */            this.I00ilI0I1 = z5;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl ? 1 : 0);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI ? 1 : 0);
/* 27 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.I00iiO ? 1 : 0);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.I00iio ? 1 : 0);
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.I00ilI0I1 ? 1 : 0);
/* 52 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
