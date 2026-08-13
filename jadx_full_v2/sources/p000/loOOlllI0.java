            package p000;

            import android.graphics.PointF;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class loOOlllI0 extends I01OlIoIl {
                public static final Parcelable.Creator<loOOlllI0> CREATOR = new lli1OIlOOOI(8);
                public final int I00iOIl;
                public final PointF I00iiI;

                public loOOlllI0(int i, PointF pointF) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = pointF;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
