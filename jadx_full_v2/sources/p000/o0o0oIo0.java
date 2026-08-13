            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class o0o0oIo0 extends I01OlIoIl {
                public static final Parcelable.Creator<o0o0oIo0> CREATOR = new o0olIOlOI(5);
                public int I00iOIl;
                public String I00iiI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
