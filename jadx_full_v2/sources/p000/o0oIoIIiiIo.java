            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class o0oIoIIiiIo extends I01OlIoIl {
                public static final Parcelable.Creator<o0oIoIIiiIo> CREATOR = new o0olIOlOI(8);
                public String I00iOIl;
                public String I00iiI;
                public int I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 19 */            int i2 = this.I00iiO;
/* 23 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(i2);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
