            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class O1lli10oolO extends I01OlIoIl {
                public static final Parcelable.Creator<O1lli10oolO> CREATOR = new OO00iO(16);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final long I00iio;
                public final long I00ilI0I1;
                public final String I00ilO0;
                public final String I00io1l;
                public final int I00ioIO;
                public final int I00l0I0l0lO1;

                public O1lli10oolO(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = j;
/* 12 */            this.I00ilI0I1 = j2;
/* 14 */            this.I00ilO0 = str;
/* 16 */            this.I00io1l = str2;
/* 18 */            this.I00ioIO = i4;
/* 20 */            this.I00l0I0l0lO1 = i5;
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
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 8);
/* 42 */            parcel.writeLong(this.I00iio);
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 51 */            parcel.writeLong(this.I00ilI0I1);
/* 57 */            lO0IioIooIl.I000OiO(parcel, 6, this.I00ilO0);
/* 63 */            lO0IioIooIl.I000OiO(parcel, 7, this.I00io1l);
/* 66 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 71 */            parcel.writeInt(this.I00ioIO);
/* 76 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 81 */            parcel.writeInt(this.I00l0I0l0lO1);
/* 84 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
