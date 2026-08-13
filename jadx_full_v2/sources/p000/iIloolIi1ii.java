            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIloolIi1ii extends I01OlIoIl {
                public static final Parcelable.Creator<iIloolIi1ii> CREATOR = new iIlI1lioo0lO(3);
                public final boolean I00iOIl;

                public iIloolIi1ii(boolean z) {
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
