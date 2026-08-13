            package p000;

            import android.graphics.PointF;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lil0ii1OIO0 extends I01OlIoIl {
                public static final Parcelable.Creator<lil0ii1OIO0> CREATOR = new iolIll1o(26);
                public int I00iOIl;
                public PointF I00iiI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
