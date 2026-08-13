            package p000;

            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public final class i10ioI extends I01OlIoIl {
                public static final Parcelable.Creator<i10ioI> CREATOR = new OO00iO(24);
                public final String I00iOIl;
                public final Rect I00iiI;
                public final List I00iiO;
                public final String I00iio;
                public final List I00ilI0I1;

                public i10ioI(String str, Rect rect, List list, String str2, List list2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = rect;
/* 8 */             this.I00iiO = list;
/* 10 */            this.I00iio = str2;
/* 12 */            this.I00ilI0I1 = list2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000o00OoI0I(parcel, 3, this.I00iiO);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 34 */            lO0IioIooIl.I000o00OoI0I(parcel, 5, this.I00ilI0I1);
/* 37 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
