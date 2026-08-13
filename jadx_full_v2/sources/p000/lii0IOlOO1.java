            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class lii0IOlOO1 extends I01OlIoIl {
                public static final Parcelable.Creator<lii0IOlOO1> CREATOR = new iolIll1o(25);
                public int I00iOIl;
                public Rect I00iiI;
                public float I00iiO;
                public float I00iio;
                public float I00ilI0I1;
                public float I00ilO0;
                public float I00io1l;
                public float I00ioIO;
                public float I00l0I0l0lO1;
                public ArrayList I00l0OO0IO;
                public ArrayList I00li1OI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 23 */            float f = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeFloat(f);
/* 32 */            float f2 = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeFloat(f2);
/* 40 */            float f3 = this.I00ilI0I1;
/* 43 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 46 */            parcel.writeFloat(f3);
/* 49 */            float f4 = this.I00ilO0;
/* 52 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 55 */            parcel.writeFloat(f4);
/* 58 */            float f5 = this.I00io1l;
/* 61 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 64 */            parcel.writeFloat(f5);
/* 67 */            float f6 = this.I00ioIO;
/* 71 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 74 */            parcel.writeFloat(f6);
/* 77 */            float f7 = this.I00l0I0l0lO1;
/* 81 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 84 */            parcel.writeFloat(f7);
/* 91 */            lO0IioIooIl.I000o00OoI0I(parcel, 10, this.I00l0OO0IO);
/* 98 */            lO0IioIooIl.I000o00OoI0I(parcel, 11, this.I00li1OI);
/* 101 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
