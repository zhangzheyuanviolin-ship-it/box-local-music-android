            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public final class l1llooo1l10l extends I01OlIoIl {
                public static final Parcelable.Creator<l1llooo1l10l> CREATOR = new iolIll1o(10);
                public ArrayList I00iOIl;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof l1llooo1l10l) {
/* 17 */                return this.I00iOIl.equals(((l1llooo1l10l) obj).I00iOIl);
                    }
/* 9 */             return false;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FlagOverrides(");
/* 14 */            boolean z = true;
/* 19 */            for (l1li0i1i l1li0i1iVar : this.I00iOIl) {
/* 27 */                if (!z) {
/* 31 */                    sb.append(", ");
                        }
/* 34 */                l1li0i1iVar.I00000oOI(sb);
/* 37 */                z = false;
                    }
/* 41 */            sb.append(")");
/* 44 */            return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 2, arrayList);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
