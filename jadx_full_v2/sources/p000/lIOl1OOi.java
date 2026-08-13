            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lIOl1OOi extends I01OlIoIl {
                public static final Parcelable.Creator<lIOl1OOi> CREATOR = new iolIll1o(14);
                public lli0oio0[] I00iOIl;
                public io0oOoOi0o I00iiI;
                public io0oOoOi0o I00iiO;
                public io0oOoOi0o I00iio;
                public String I00ilI0I1;
                public float I00ilO0;
                public String I00io1l;
                public int I00ioIO;
                public boolean I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             lli0oio0[] lli0oio0VarArr = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000lI(parcel, 2, lli0oio0VarArr, i);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iiO, i);
/* 28 */            lO0IioIooIl.I000OOo1O(parcel, 5, this.I00iio, i);
/* 34 */            lO0IioIooIl.I000OiO(parcel, 6, this.I00ilI0I1);
/* 37 */            float f = this.I00ilO0;
/* 40 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 43 */            parcel.writeFloat(f);
/* 50 */            lO0IioIooIl.I000OiO(parcel, 8, this.I00io1l);
/* 53 */            int i2 = this.I00ioIO;
/* 57 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 60 */            parcel.writeInt(i2);
/* 63 */            boolean z = this.I00l0I0l0lO1;
/* 67 */            lO0IioIooIl.I000oI1ioi(parcel, 10, 4);
/* 70 */            parcel.writeInt(z ? 1 : 0);
/* 73 */            int i3 = this.I00l0OO0IO;
/* 77 */            lO0IioIooIl.I000oI1ioi(parcel, 11, 4);
/* 80 */            parcel.writeInt(i3);
/* 83 */            int i4 = this.I00li1OI;
/* 87 */            lO0IioIooIl.I000oI1ioi(parcel, 12, 4);
/* 90 */            parcel.writeInt(i4);
/* 93 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
