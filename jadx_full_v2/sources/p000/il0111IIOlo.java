            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class il0111IIOlo extends I01OlIoIl {
                public static final Parcelable.Creator<il0111IIOlo> CREATOR = new iiiilIIoIi(14);
                public int I00iOIl;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof il0111IIOlo) && this.I00iOIl == ((il0111IIOlo) obj).I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 20 */            String str = i != 0 ? i != 1 ? i != 2 ? "Unknown" : "NOT_RETRYABLE" : "RETRYABLE" : "UNSPECIFIED";
/* 37 */            return IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + 33), "RetryDetails { retryGuidance = ", str, " }");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
