            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class il1I1O extends I01OlIoIl {
                public static final Parcelable.Creator<il1I1O> CREATOR = new iiiilIIoIi(29);
                public final String I00iOIl;
                public final String I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;

                public il1I1O(String str, String str2, int i, int i2, int i3, int i4) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = str2;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00iio = i2;
/* 12 */            this.I00ilI0I1 = i3;
/* 14 */            this.I00ilO0 = i4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof il1I1O)) {
/* 7 */                 return false;
                    }
/* 11 */            il1I1O il1i1o = (il1I1O) obj;
                    return this.I00iiO == il1i1o.I00iiO && this.I00iio == il1i1o.I00iio && Objects.equals(this.I00iOIl, il1i1o.I00iOIl) && this.I00ilI0I1 == il1i1o.I00ilI0I1 && this.I00ilO0 == il1i1o.I00ilO0;
                }

                public final int hashCode() {
/* 31 */            return Objects.hash(this.I00iOIl, Integer.valueOf(this.I00iiO), Integer.valueOf(this.I00iio), Integer.valueOf(this.I00ilI0I1), Integer.valueOf(this.I00ilO0));
                }

                public final String toString() {
/* 5 */             String simpleName = il1I1O.class.getSimpleName();
/* 11 */            OlilOlOiI olilOlOiI = new OlilOlOiI(22);
/* 16 */            int i = 21;
/* 18 */            Oo1ol1ll oo1ol1ll = new Oo1ol1ll(i);
/* 21 */            olilOlOiI.I00iiO = oo1ol1ll;
/* 23 */            olilOlOiI.I00iio = oo1ol1ll;
/* 25 */            olilOlOiI.I00iiI = simpleName;
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            Oo1ol1ll oo1ol1ll2 = new Oo1ol1ll(i);
/* 35 */            oo1ol1ll.I00iio = oo1ol1ll2;
/* 37 */            olilOlOiI.I00iio = oo1ol1ll2;
/* 41 */            oo1ol1ll2.I00iiO = this.I00iOIl;
/* 45 */            oo1ol1ll2.I00iiI = "name";
/* 49 */            Oo1ol1ll oo1ol1ll3 = new Oo1ol1ll(i);
/* 52 */            oo1ol1ll2.I00iio = oo1ol1ll3;
/* 54 */            olilOlOiI.I00iio = oo1ol1ll3;
/* 58 */            oo1ol1ll3.I00iiO = this.I00iiI;
/* 62 */            oo1ol1ll3.I00iiI = "modelName";
/* 68 */            olilOlOiI.I001i1O0Ol(this.I00iiO, "type");
/* 75 */            olilOlOiI.I001i1O0Ol(this.I00iio, "variant");
/* 82 */            olilOlOiI.I001i1O0Ol(this.I00ilI0I1, "id");
/* 89 */            olilOlOiI.I001i1O0Ol(this.I00ilO0, "version");
/* 92 */            return olilOlOiI.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 21 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(this.I00iiO);
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(this.I00iio);
/* 38 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(this.I00ilI0I1);
/* 47 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 52 */            parcel.writeInt(this.I00ilO0);
/* 55 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
