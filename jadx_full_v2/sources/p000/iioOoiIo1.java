            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class iioOoiIo1 extends I01OlIoIl {
                public static final Parcelable.Creator<iioOoiIo1> CREATOR = new iiiilIIoIi(12);
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public float I00iio;
                public float I00ilI0I1;
                public float I00ilO0;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iioOoiIo1) {
/* 10 */                iioOoiIo1 iioooiio1 = (iioOoiIo1) obj;
/* 16 */                if (this.I00iOIl == iioooiio1.I00iOIl && this.I00iiI == iioooiio1.I00iiI && this.I00iiO == iioooiio1.I00iiO && Float.compare(this.I00iio, iioooiio1.I00iio) == 0 && Float.compare(this.I00ilI0I1, iioooiio1.I00ilI0I1) == 0 && Float.compare(this.I00ilO0, iioooiio1.I00ilO0) == 0) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 41 */            return Objects.hash(Integer.valueOf(this.I00iOIl), Integer.valueOf(this.I00iiI), Integer.valueOf(this.I00iiO), Float.valueOf(this.I00iio), Float.valueOf(this.I00ilI0I1), Float.valueOf(this.I00ilO0));
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I00iiI;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            int i3 = this.I00iiO;
/* 27 */            int length3 = String.valueOf(i3).length();
/* 31 */            float f = this.I00iio;
/* 37 */            int length4 = String.valueOf(f).length();
/* 41 */            float f2 = this.I00ilI0I1;
/* 47 */            int length5 = String.valueOf(f2).length();
/* 51 */            float f3 = this.I00ilO0;
/* 80 */            StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 16 + length4 + 12 + length5 + 18 + String.valueOf(f3).length() + 1);
/* 87 */            IIlIOloOOO.I001l0I00(sb, "QuotaExceededErrorDetails {quotaType=", i, ", quotaScope=", i2);
/* 92 */            sb.append(", quotaCheckStage=");
/* 95 */            sb.append(i3);
/* 100 */           sb.append(", periodSeconds=");
/* 103 */           sb.append(f);
/* 108 */           sb.append(", costLimit=");
/* 111 */           sb.append(f2);
/* 116 */           sb.append(", tryAgainSeconds=");
/* 119 */           sb.append(f3);
/* 124 */           sb.append("}");
/* 127 */           return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = this.I00iiO;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(i4);
/* 35 */            float f = this.I00iio;
/* 37 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeFloat(f);
/* 43 */            float f2 = this.I00ilI0I1;
/* 46 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 49 */            parcel.writeFloat(f2);
/* 52 */            float f3 = this.I00ilO0;
/* 55 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 58 */            parcel.writeFloat(f3);
/* 61 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
