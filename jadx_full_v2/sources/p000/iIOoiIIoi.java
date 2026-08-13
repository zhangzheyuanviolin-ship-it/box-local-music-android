            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIOoiIIoi extends I01OlIoIl {
                public static final Parcelable.Creator<iIOoiIIoi> CREATOR = new i1I1lI001Io0(27);
                public int I00iOIl;
                public iiOi1illIO1o I00iiI;
                public ll0oil I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
