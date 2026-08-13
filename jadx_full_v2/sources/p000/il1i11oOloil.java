            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class il1i11oOloil extends I01OlIoIl {
                public static final Parcelable.Creator<il1i11oOloil> CREATOR = new iiiilIIoIi(20);
                public final long I00iOIl;
                public final long I00iiI;
                public final boolean I00iiO;
                public final Bundle I00iio;
                public final String I00ilI0I1;

                public il1i11oOloil(long j, long j2, boolean z, Bundle bundle, String str) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = j2;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = bundle;
/* 12 */            this.I00ilI0I1 = str;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.I00iOIl);
/* 19 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 8);
/* 24 */            parcel.writeLong(this.I00iiI);
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 34 */            parcel.writeInt(this.I00iiO ? 1 : 0);
/* 40 */            lO0IioIooIl.I00000oIO(parcel, 7, this.I00iio);
/* 45 */            lO0IioIooIl.I000OiO(parcel, 8, this.I00ilI0I1);
/* 48 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
