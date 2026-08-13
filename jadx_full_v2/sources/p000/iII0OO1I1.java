            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class iII0OO1I1 extends I01OlIoIl {
                public static final Parcelable.Creator<iII0OO1I1> CREATOR = new i1I1lI001Io0(22);
                public io0OIIlOli1 I00iOIl;
                public i1ll1I1llOl0 I00iiI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iII0OO1I1)) {
/* 7 */                 return false;
                    }
/* 11 */            iII0OO1I1 iii0oo1i1 = (iII0OO1I1) obj;
                    return Objects.equals(this.I00iOIl, iii0oo1i1.I00iOIl) && this.I00iiI == iii0oo1i1.I00iiI;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00iOIl, this.I00iiI);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("MagicRewriteResult{results=", String.valueOf(this.I00iOIl), ", inferenceEventTraceResult=", String.valueOf(this.I00iiI), "}");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             io0OIIlOli1 io0oiiloli1 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, io0oiiloli1);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
