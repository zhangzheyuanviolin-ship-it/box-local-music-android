            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIo000iolIl extends I01OlIoIl {
                public static final Parcelable.Creator<iIo000iolIl> CREATOR = new iIlI1lioo0lO(4);
                public io0o00I1ol1o I00iOIl;
                public float I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public i1Oilo0O1i I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public iIIoIliI0I11 I00l0OO0IO;
                public int I00li1OI;
                public i1il1I I00ll1;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             io0o00I1ol1o io0o00i1ol1o = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, io0o00i1ol1o);
/* 13 */            float f = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeFloat(f);
/* 23 */            int i2 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(i2);
/* 32 */            int i3 = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeInt(i3);
/* 40 */            int i4 = this.I00ilI0I1;
/* 43 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 46 */            parcel.writeInt(i4);
/* 49 */            i1Oilo0O1i i1oilo0o1i = this.I00ilO0;
/* 61 */            lO0IioIooIl.I0001Ioi1lo(parcel, 6, i1oilo0o1i == null ? null : i1oilo0o1i.asBinder());
/* 64 */            int i5 = this.I00io1l;
/* 67 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 70 */            parcel.writeInt(i5);
/* 73 */            int i6 = this.I00ioIO;
/* 77 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 80 */            parcel.writeInt(i6);
/* 83 */            i1il1I i1il1i = this.I00ll1;
/* 92 */            lO0IioIooIl.I0001Ioi1lo(parcel, 9, i1il1i != null ? i1il1i.I000O01llI0 : null);
/* 95 */            int i7 = this.I00l0I0l0lO1;
/* 99 */            lO0IioIooIl.I000oI1ioi(parcel, 10, 4);
/* 102 */           parcel.writeInt(i7);
/* 109 */           lO0IioIooIl.I000OOo1O(parcel, 11, this.I00l0OO0IO, i);
/* 112 */           int i8 = this.I00li1OI;
/* 116 */           lO0IioIooIl.I000oI1ioi(parcel, 12, 4);
/* 119 */           parcel.writeInt(i8);
/* 122 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
