            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class Oi1oo0 extends I01OlIoIl {
                public static final Parcelable.Creator<Oi1oo0> CREATOR = new i1I1lI001Io0(17);
                public final int I00iOIl;
                public final boolean I00iiI;
                public final boolean I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;

                public Oi1oo0(int i, int i2, int i3, boolean z, boolean z2) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = z;
/* 8 */             this.I00iiO = z2;
/* 10 */            this.I00iio = i2;
/* 12 */            this.I00ilI0I1 = i3;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI ? 1 : 0);
/* 27 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.I00iiO ? 1 : 0);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.I00iio);
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.I00ilI0I1);
/* 52 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
