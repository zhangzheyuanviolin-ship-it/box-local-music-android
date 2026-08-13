            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class il0llOOOOIO extends I01OlIoIl {
                public static final Parcelable.Creator<il0llOOOOIO> CREATOR = new iiiilIIoIi(16);
                public static final il0llOOOOIO I00iiI = new il0llOOOOIO(false);
                public final boolean I00iOIl;

                public il0llOOOOIO(boolean z) {
/* 4 */             this.I00iOIl = z;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl ? 1 : 0);
/* 17 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
