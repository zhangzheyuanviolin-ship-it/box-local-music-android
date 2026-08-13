            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iO111II extends I01OlIoIl {
                public static final Parcelable.Creator<iO111II> CREATOR = new iIlI1lioo0lO(18);
                public final iOOioi1O0I1i I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final iOiIOl1lOlI[] I00iio;
                public final iOIIo0i[] I00ilI0I1;
                public final String[] I00ilO0;
                public final iIo00l0loI0l[] I00io1l;

                public iO111II(iOOioi1O0I1i iooioi1o0i1i, String str, String str2, iOiIOl1lOlI[] ioiiol1loliArr, iOIIo0i[] ioiio0iArr, String[] strArr, iIo00l0loI0l[] iio00l0loi0lArr) {
/* 4 */             this.I00iOIl = iooioi1o0i1i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = str2;
/* 10 */            this.I00iio = ioiiol1loliArr;
/* 12 */            this.I00ilI0I1 = ioiio0iArr;
/* 14 */            this.I00ilO0 = strArr;
/* 16 */            this.I00io1l = iio00l0loi0lArr;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000lI(parcel, 4, this.I00iio, i);
/* 34 */            lO0IioIooIl.I000lI(parcel, 5, this.I00ilI0I1, i);
/* 40 */            lO0IioIooIl.I000iOII(parcel, 6, this.I00ilO0);
/* 46 */            lO0IioIooIl.I000lI(parcel, 7, this.I00io1l, i);
/* 49 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
