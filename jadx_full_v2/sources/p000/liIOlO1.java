            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class liIOlO1 extends I01OlIoIl {
                public static final Parcelable.Creator<liIOlO1> CREATOR = new iolIll1o(20);
                public final long I00iOIl;
                public byte[] I00iiI;
                public final String I00iiO;
                public final Bundle I00iio;
                public final int I00ilI0I1;
                public final long I00ilO0;
                public String I00io1l;

                public liIOlO1(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = bArr;
/* 8 */             this.I00iiO = str;
/* 10 */            this.I00iio = bundle;
/* 12 */            this.I00ilI0I1 = i;
/* 14 */            this.I00ilO0 = j2;
/* 16 */            this.I00io1l = str2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.I00iOIl);
/* 21 */            lO0IioIooIl.I00000oOI(parcel, 2, this.I00iiI);
/* 27 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 33 */            lO0IioIooIl.I00000oIO(parcel, 4, this.I00iio);
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 42 */            parcel.writeInt(this.I00ilI0I1);
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 8);
/* 51 */            parcel.writeLong(this.I00ilO0);
/* 57 */            lO0IioIooIl.I000OiO(parcel, 7, this.I00io1l);
/* 60 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
