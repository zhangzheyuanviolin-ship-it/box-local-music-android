            package p000;

            import android.graphics.Point;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iOlo0iOI1i extends I01OlIoIl {
                public static final Parcelable.Creator<iOlo0iOI1i> CREATOR = new iIlI1lioo0lO(8);
                public final int I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final byte[] I00iio;
                public final Point[] I00ilI0I1;
                public final int I00ilO0;
                public final iOIIo0i I00io1l;
                public final iOiIOl1lOlI I00ioIO;
                public final iOioOI0o00 I00l0I0l0lO1;
                public final iOli1io I00l0OO0IO;
                public final iOlI0l0l1oi0 I00li1OI;
                public final iOIoiol1O I00ll1;
                public final iO0i0ooI I00lli11;
                public final iO111II I00lll10;
                public final iO1iIl01Il0l I00o0iI0io1;

                public iOlo0iOI1i(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, iOIIo0i ioiio0i, iOiIOl1lOlI ioiiol1loli, iOioOI0o00 ioiooi0o00, iOli1io ioli1io, iOlI0l0l1oi0 ioli0l0l1oi0, iOIoiol1O ioioiol1o, iO0i0ooI io0i0ooi, iO111II io111ii, iO1iIl01Il0l io1iil01il0l) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = str2;
/* 10 */            this.I00iio = bArr;
/* 12 */            this.I00ilI0I1 = pointArr;
/* 14 */            this.I00ilO0 = i2;
/* 16 */            this.I00io1l = ioiio0i;
/* 18 */            this.I00ioIO = ioiiol1loli;
/* 20 */            this.I00l0I0l0lO1 = ioiooi0o00;
/* 22 */            this.I00l0OO0IO = ioli1io;
/* 24 */            this.I00li1OI = ioli0l0l1oi0;
/* 26 */            this.I00ll1 = ioioiol1o;
/* 28 */            this.I00lli11 = io0i0ooi;
/* 30 */            this.I00lll10 = io111ii;
/* 32 */            this.I00o0iI0io1 = io1iil01il0l;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 31 */            lO0IioIooIl.I00000oOI(parcel, 4, this.I00iio);
/* 37 */            lO0IioIooIl.I000lI(parcel, 5, this.I00ilI0I1, i);
/* 41 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 46 */            parcel.writeInt(this.I00ilO0);
/* 52 */            lO0IioIooIl.I000OOo1O(parcel, 7, this.I00io1l, i);
/* 59 */            lO0IioIooIl.I000OOo1O(parcel, 8, this.I00ioIO, i);
/* 66 */            lO0IioIooIl.I000OOo1O(parcel, 9, this.I00l0I0l0lO1, i);
/* 73 */            lO0IioIooIl.I000OOo1O(parcel, 10, this.I00l0OO0IO, i);
/* 80 */            lO0IioIooIl.I000OOo1O(parcel, 11, this.I00li1OI, i);
/* 87 */            lO0IioIooIl.I000OOo1O(parcel, 12, this.I00ll1, i);
/* 94 */            lO0IioIooIl.I000OOo1O(parcel, 13, this.I00lli11, i);
/* 101 */           lO0IioIooIl.I000OOo1O(parcel, 14, this.I00lll10, i);
/* 108 */           lO0IioIooIl.I000OOo1O(parcel, 15, this.I00o0iI0io1, i);
/* 111 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
