            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i10l0iOo01i extends I01OlIoIl {
                public static final Parcelable.Creator<i10l0iOo01i> CREATOR = new OO00iO(28);
                public String I00iOIl;
                public String I00iiI;
                public String I00iiO;
                public boolean I00iio;
                public int I00ilI0I1;
                public String I00ilO0;
                public boolean I00io1l;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 25 */            boolean z = this.I00iio;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeInt(z ? 1 : 0);
/* 34 */            int i2 = this.I00ilI0I1;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeInt(i2);
/* 46 */            lO0IioIooIl.I000OiO(parcel, 6, this.I00ilO0);
/* 49 */            boolean z2 = this.I00io1l;
/* 52 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 55 */            parcel.writeInt(z2 ? 1 : 0);
/* 58 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
