            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class OI000Oo extends I01OlIoIl {
                public static final Parcelable.Creator<OI000Oo> CREATOR = new OO00iO(5);
                public final boolean I00iOIl;
                public final int I00iiI;

                public OI000Oo(boolean z, int i) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl ? 1 : 0);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 26 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
