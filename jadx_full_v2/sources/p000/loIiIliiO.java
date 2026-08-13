            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class loIiIliiO extends I01OlIoIl {
                public static final Parcelable.Creator<loIiIliiO> CREATOR = new lli1OIlOOOI(7);
                public final int I00iOIl;
                public final Rect I00iiI;
                public final float I00iiO;
                public final float I00iio;
                public final float I00ilI0I1;
                public final float I00ilO0;
                public final float I00io1l;
                public final float I00ioIO;
                public final float I00l0I0l0lO1;
                public final List I00l0OO0IO;
                public final List I00li1OI;

                public loIiIliiO(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList, ArrayList arrayList2) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = rect;
/* 8 */             this.I00iiO = f;
/* 10 */            this.I00iio = f2;
/* 12 */            this.I00ilI0I1 = f3;
/* 14 */            this.I00ilO0 = f4;
/* 16 */            this.I00io1l = f5;
/* 18 */            this.I00ioIO = f6;
/* 20 */            this.I00l0I0l0lO1 = f7;
/* 22 */            this.I00l0OO0IO = arrayList;
/* 24 */            this.I00li1OI = arrayList2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 24 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeFloat(this.I00iiO);
/* 32 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeFloat(this.I00iio);
/* 41 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 46 */            parcel.writeFloat(this.I00ilI0I1);
/* 50 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 55 */            parcel.writeFloat(this.I00ilO0);
/* 59 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 4);
/* 64 */            parcel.writeFloat(this.I00io1l);
/* 69 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 74 */            parcel.writeFloat(this.I00ioIO);
/* 79 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 4);
/* 84 */            parcel.writeFloat(this.I00l0I0l0lO1);
/* 91 */            lO0IioIooIl.I000o00OoI0I(parcel, 10, this.I00l0OO0IO);
/* 98 */            lO0IioIooIl.I000o00OoI0I(parcel, 11, this.I00li1OI);
/* 101 */           lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
