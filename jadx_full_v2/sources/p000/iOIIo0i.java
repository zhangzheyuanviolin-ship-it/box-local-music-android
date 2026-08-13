            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iOIIo0i extends I01OlIoIl {
                public static final Parcelable.Creator<iOIIo0i> CREATOR = new iIlI1lioo0lO(20);
                public final int I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final String I00iio;

                public iOIIo0i(int i, String str, String str2, String str3) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = str2;
/* 10 */            this.I00iio = str3;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 31 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
