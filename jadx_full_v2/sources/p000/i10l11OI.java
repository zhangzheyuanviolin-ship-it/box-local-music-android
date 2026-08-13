            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public final class i10l11OI extends I01OlIoIl {
                public static final Parcelable.Creator<i10l11OI> CREATOR = new OO00iO(29);
                public final String I00iOIl;
                public final Rect I00iiI;
                public final List I00iiO;
                public final float I00iio;
                public final float I00ilI0I1;

                public i10l11OI(String str, Rect rect, List list, float f, float f2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = rect;
/* 8 */             this.I00iiO = list;
/* 10 */            this.I00iio = f;
/* 12 */            this.I00ilI0I1 = f2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 31 */            parcel.writeFloat(this.I00iio);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 40 */            parcel.writeFloat(this.I00ilI0I1);
/* 43 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
