            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIoliO extends I01OlIoIl {
                public static final Parcelable.Creator<iIoliO> CREATOR = new iIlI1lioo0lO(15);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;
                public final boolean I00io1l;
                public final String I00ioIO;

                public iIoliO(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = i4;
/* 12 */            this.I00ilI0I1 = i5;
/* 14 */            this.I00ilO0 = i6;
/* 16 */            this.I00io1l = z;
/* 18 */            this.I00ioIO = str;
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
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.I00ilI0I1);
/* 53 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 58 */            parcel.writeInt(this.I00ilO0);
/* 62 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 67 */            parcel.writeInt(this.I00io1l ? 1 : 0);
/* 74 */            lO0IioIooIl.I000OiO(parcel, 8, this.I00ioIO);
/* 77 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
