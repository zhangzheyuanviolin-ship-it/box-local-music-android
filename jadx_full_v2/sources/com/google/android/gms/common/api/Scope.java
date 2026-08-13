            package com.google.android.gms.common.api;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import p000.I01OlIoIl;
            import p000.iiiilIIoIi;
            import p000.lII0I0I000I;
            import p000.lO0IioIooIl;
            
            public final class Scope extends I01OlIoIl implements ReflectedParcelable {
                public static final Parcelable.Creator<Scope> CREATOR = new iiiilIIoIi(18);
                public final int I00iOIl;
                public final String I00iiI;

                public Scope(int i, String str) {
/* 6 */             lII0I0I000I.I0000oI00(str, "scopeUri must not be null or empty");
/* 9 */             this.I00iOIl = i;
/* 11 */            this.I00iiI = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Scope)) {
/* 9 */                 return false;
                    }
/* 17 */            return this.I00iiI.equals(((Scope) obj).I00iiI);
                }

                public final int hashCode() {
/* 3 */             return this.I00iiI.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
