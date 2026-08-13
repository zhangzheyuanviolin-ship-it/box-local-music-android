            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class il11i0 extends I01OlIoIl {
                public static final Parcelable.Creator<il11i0> CREATOR = new iiiilIIoIi(25);
                public final String I00iOIl;
                public final String I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;

                public il11i0(String str, String str2, int i, int i2, int i3, int i4) {
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
/* 8 */             if (!(obj instanceof il11i0)) {
/* 7 */                 return false;
                    }
/* 11 */            il11i0 il11i0Var = (il11i0) obj;
                    return this.I00iiO == il11i0Var.I00iiO && this.I00iio == il11i0Var.I00iio && Objects.equals(this.I00iOIl, il11i0Var.I00iOIl) && this.I00ilI0I1 == il11i0Var.I00ilI0I1 && this.I00ilO0 == il11i0Var.I00ilO0;
                }

                public final int hashCode() {
/* 31 */            return Objects.hash(this.I00iOIl, Integer.valueOf(this.I00iiO), Integer.valueOf(this.I00iio), Integer.valueOf(this.I00ilI0I1), Integer.valueOf(this.I00ilO0));
                }

                public final String toString() {
/* 5 */             String simpleName = il11i0.class.getSimpleName();
/* 11 */            OlilOlOiI olilOlOiI = new OlilOlOiI(24);
/* 16 */            int i = 23;
/* 18 */            OlilOlOiI olilOlOiI2 = new OlilOlOiI(i);
/* 21 */            olilOlOiI.I00iiO = olilOlOiI2;
/* 23 */            olilOlOiI.I00iio = olilOlOiI2;
/* 25 */            olilOlOiI.I00iiI = simpleName;
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            OlilOlOiI olilOlOiI3 = new OlilOlOiI(i);
/* 35 */            olilOlOiI2.I00iio = olilOlOiI3;
/* 37 */            olilOlOiI.I00iio = olilOlOiI3;
/* 41 */            olilOlOiI3.I00iiO = this.I00iOIl;
/* 45 */            olilOlOiI3.I00iiI = "name";
/* 49 */            OlilOlOiI olilOlOiI4 = new OlilOlOiI(i);
/* 52 */            olilOlOiI3.I00iio = olilOlOiI4;
/* 54 */            olilOlOiI.I00iio = olilOlOiI4;
/* 58 */            olilOlOiI4.I00iiO = this.I00iiI;
/* 62 */            olilOlOiI4.I00iiI = "modelName";
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
