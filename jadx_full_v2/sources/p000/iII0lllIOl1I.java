            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class iII0lllIOl1I extends I01OlIoIl {
                public static final Parcelable.Creator<iII0lllIOl1I> CREATOR = new i1I1lI001Io0(23);
                public io0OO101I I00iOIl;
                public i1llOOiillll I00iiI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iII0lllIOl1I)) {
/* 7 */                 return false;
                    }
/* 11 */            iII0lllIOl1I iii0llliol1i = (iII0lllIOl1I) obj;
                    return Objects.equals(this.I00iOIl, iii0llliol1i.I00iOIl) && this.I00iiI == iii0llliol1i.I00iiI;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.I00iOIl, this.I00iiI);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("MagicRewriteResult{results=", String.valueOf(this.I00iOIl), ", inferenceEventTraceResult=", String.valueOf(this.I00iiI), "}");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             io0OO101I io0oo101i = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, io0oo101i);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
