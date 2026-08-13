            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIolOl1lo1 extends I01OlIoIl {
                public static final Parcelable.Creator<iIolOl1lo1> CREATOR = new iIlI1lioo0lO(5);
                public int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final long I00iio;
                public final int I00ilI0I1;

                public iIolOl1lo1(int i, int i2, int i3, long j, int i4) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = j;
/* 12 */            this.I00ilI0I1 = i4;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeInt(this.I00iiO);
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 42 */            parcel.writeLong(this.I00iio);
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 51 */            parcel.writeInt(this.I00ilI0I1);
/* 54 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
