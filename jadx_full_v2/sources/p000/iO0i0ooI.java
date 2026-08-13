            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iO0i0ooI extends I01OlIoIl {
                public static final Parcelable.Creator<iO0i0ooI> CREATOR = new iIlI1lioo0lO(16);
                public final String I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final String I00iio;
                public final String I00ilI0I1;
                public final iIoliO I00ilO0;
                public final iIoliO I00io1l;

                public iO0i0ooI(String str, String str2, String str3, String str4, String str5, iIoliO iiolio, iIoliO iiolio2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
/* 8 */             this.I00iiO = str3;
/* 10 */            this.I00iio = str4;
/* 12 */            this.I00ilI0I1 = str5;
/* 14 */            this.I00ilO0 = iiolio;
/* 16 */            this.I00io1l = iiolio2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 34 */            lO0IioIooIl.I000OiO(parcel, 5, this.I00ilI0I1);
/* 40 */            lO0IioIooIl.I000OOo1O(parcel, 6, this.I00ilO0, i);
/* 46 */            lO0IioIooIl.I000OOo1O(parcel, 7, this.I00io1l, i);
/* 49 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
