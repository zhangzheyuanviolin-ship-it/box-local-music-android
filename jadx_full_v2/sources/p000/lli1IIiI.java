            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lli1IIiI extends I01OlIoIl {
                public static final Parcelable.Creator<lli1IIiI> CREATOR = new lli1OIlOOOI(3);
                public boolean I00iOIl;
                public String I00iiI;
                public int I00iiO;
                public int I00iio;
                public long I00ilI0I1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             boolean z = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(z ? 1 : 0);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 23 */            int i2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(i2);
/* 32 */            int i3 = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeInt(i3);
/* 40 */            long j = this.I00ilI0I1;
/* 45 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 48 */            parcel.writeLong(j);
/* 51 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
