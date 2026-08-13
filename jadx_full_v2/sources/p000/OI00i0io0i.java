            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OI00i0io0i extends I01OlIoIl {
                public static final Parcelable.Creator<OI00i0io0i> CREATOR = new OO00iO(11);
                public final int I00iOIl;
                public final boolean I00iiI;

                public OI00i0io0i(int i, boolean z) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = z;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI ? 1 : 0);
/* 26 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
