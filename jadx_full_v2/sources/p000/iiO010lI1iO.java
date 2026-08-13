            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class iiO010lI1iO extends I01OlIoIl {
                public static final Parcelable.Creator<iiO010lI1iO> CREATOR = new iIlI1lioo0lO(22);
                public iioOoiIo1 I00iOIl;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iiO010lI1iO) {
/* 15 */                return Objects.equals(this.I00iOIl, ((iiO010lI1iO) obj).I00iOIl);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 7 */             return Objects.hash(this.I00iOIl);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I00iOIl);
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 50), "InferenceErrorDetails {quotaExceededErrorDetails=", strValueOf, "}");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
