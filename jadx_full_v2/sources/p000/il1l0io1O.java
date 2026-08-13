            package p000;

            import android.app.Activity;
            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class il1l0io1O extends I01OlIoIl {
                public static final Parcelable.Creator<il1l0io1O> CREATOR = new iiiilIIoIi(22);
                public final int I00iOIl;
                public final String I00iiI;
                public final Intent I00iiO;

                public il1l0io1O(int i, String str, Intent intent) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = intent;
                }

                public static il1l0io1O I00000oOI(Activity activity) {
/* 19 */            return new il1l0io1O(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof il1l0io1O)) {
/* 7 */                 return false;
                    }
/* 11 */            il1l0io1O il1l0io1o = (il1l0io1O) obj;
                    return this.I00iOIl == il1l0io1o.I00iOIl && Objects.equals(this.I00iiI, il1l0io1o.I00iiI) && Objects.equals(this.I00iiO, il1l0io1o.I00iiO);
                }

                public final int hashCode() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
