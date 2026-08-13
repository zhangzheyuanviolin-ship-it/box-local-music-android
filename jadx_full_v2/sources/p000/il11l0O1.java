            package p000;

            import android.graphics.PointF;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class il11l0O1 extends I01OlIoIl {
                public static final Parcelable.Creator<il11l0O1> CREATOR = new iiiilIIoIi(27);
                public PointF[] I00iOIl;
                public int I00iiI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000lI(parcel, 2, this.I00iOIl, i);
/* 13 */            int i2 = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 20 */            parcel.writeInt(i2);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
