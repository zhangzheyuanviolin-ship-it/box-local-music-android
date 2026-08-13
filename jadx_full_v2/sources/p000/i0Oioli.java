            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0Oioli extends I01OlIoIl {
                public static final Parcelable.Creator<i0Oioli> CREATOR = new OO00iO(10);
                public final int I00iOIl;
                public final String I00iiI;
                public final long I00iiO;
                public final int I00iio;
                public final boolean I00ilI0I1;

                public i0Oioli(int i, String str, long j, int i2, boolean z) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = j;
/* 10 */            this.I00iio = i2;
/* 12 */            this.I00ilI0I1 = z;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 8);
/* 31 */            parcel.writeLong(this.I00iiO);
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 39 */            parcel.writeInt(this.I00iio);
/* 43 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 48 */            parcel.writeInt(this.I00ilI0I1 ? 1 : 0);
/* 51 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
