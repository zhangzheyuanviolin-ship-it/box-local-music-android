            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
            public final class IOiIOIII0io extends I01OlIoIl {
                public static final Parcelable.Creator<IOiIOIII0io> CREATOR = new iiiilIIoIi(2);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final boolean I00iio;

                public IOiIOIII0io(int i, int i2, int i3, boolean z) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof IOiIOIII0io)) {
/* 3 */                 return false;
                    }
/* 7 */             IOiIOIII0io iOiIOIII0io = (IOiIOIII0io) obj;
                    return this.I00iOIl == iOiIOIII0io.I00iOIl && this.I00iiI == iOiIOIII0io.I00iiI && this.I00iiO == iOiIOIII0io.I00iiO && this.I00iio == iOiIOIII0io.I00iio;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.I00iOIl), Integer.valueOf(this.I00iiI), Integer.valueOf(this.I00iiO), Boolean.valueOf(this.I00iio)});
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I00iiI;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            int i3 = this.I00iiO;
/* 27 */            int length3 = String.valueOf(i3).length();
/* 31 */            boolean z = this.I00iio;
/* 54 */            StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
/* 61 */            IIlIOloOOO.I001l0I00(sb, "ComplianceOptions{callerProductId=", i, ", dataOwnerProductId=", i2);
/* 66 */            sb.append(", processingReason=");
/* 69 */            sb.append(i3);
/* 74 */            sb.append(", isUserData=");
/* 77 */            sb.append(z);
/* 82 */            sb.append("}");
/* 85 */            return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 27 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.I00iiO);
/* 35 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.I00iio ? 1 : 0);
/* 43 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
