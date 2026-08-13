            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class o011OIooio extends I01OlIoIl {
                public static final Parcelable.Creator<o011OIooio> CREATOR = new lli1OIlOOOI(19);
                public final String I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final boolean I00iio;
                public final int I00ilI0I1;
                public final String I00ilO0;
                public final boolean I00io1l;

                public o011OIooio(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
/* 8 */             this.I00iiO = str3;
/* 10 */            this.I00ilO0 = str4;
/* 12 */            this.I00ilI0I1 = i;
/* 14 */            this.I00iio = z;
/* 16 */            this.I00io1l = z2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeInt(this.I00iio ? 1 : 0);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeInt(this.I00ilI0I1);
/* 46 */            lO0IioIooIl.I000OiO(parcel, 6, this.I00ilO0);
/* 50 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 55 */            parcel.writeInt(this.I00io1l ? 1 : 0);
/* 58 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
