            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iOioOI0o00 extends I01OlIoIl {
                public static final Parcelable.Creator<iOioOI0o00> CREATOR = new iiiilIIoIi(1);
                public final String I00iOIl;
                public final String I00iiI;

                public iOioOI0o00(String str, String str2) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
