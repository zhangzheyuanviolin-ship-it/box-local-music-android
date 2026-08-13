            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public final class i10ioIi extends I01OlIoIl {
                public static final Parcelable.Creator<i10ioIi> CREATOR = new OO00iO(25);
                public final String I00iOIl;
                public final Rect I00iiI;
                public final List I00iiO;
                public final String I00iio;
                public final float I00ilI0I1;
                public final float I00ilO0;
                public final List I00io1l;

                public i10ioIi(float f, float f2, Rect rect, String str, String str2, List list, List list2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = rect;
/* 8 */             this.I00iiO = list;
/* 10 */            this.I00iio = str2;
/* 12 */            this.I00ilI0I1 = f;
/* 14 */            this.I00ilO0 = f2;
/* 16 */            this.I00io1l = list2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 32 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 37 */            parcel.writeFloat(this.I00ilI0I1);
/* 41 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 46 */            parcel.writeFloat(this.I00ilO0);
/* 52 */            lO0IioIooIl.I000o00OoI0I(parcel, 7, this.I00io1l);
/* 55 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
