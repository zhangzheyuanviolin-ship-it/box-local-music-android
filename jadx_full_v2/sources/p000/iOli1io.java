            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iOli1io extends I01OlIoIl {
                public static final Parcelable.Creator<iOli1io> CREATOR = new iiiilIIoIi(5);
                public final String I00iOIl;
                public final String I00iiI;
                public final int I00iiO;

                public iOli1io(String str, String str2, int i) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
/* 8 */             this.I00iiO = i;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 21 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(this.I00iiO);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
