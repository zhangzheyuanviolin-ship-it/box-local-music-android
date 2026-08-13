            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iiOi1ioO extends I01OlIoIl {
                public static final Parcelable.Creator<iiOi1ioO> CREATOR = new iIlI1lioo0lO(25);
                public float[] I00iOIl;
                public int I00iiI;
                public boolean I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             float[] fArr = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I0000oI00(parcel, 1, fArr);
/* 13 */            int i2 = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeInt(i2);
/* 23 */            boolean z = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(z ? 1 : 0);
/* 32 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
