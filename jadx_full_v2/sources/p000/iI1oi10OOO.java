            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
            public final class iI1oi10OOO extends I01OlIoIl {
                public static final Parcelable.Creator<iI1oi10OOO> CREATOR = new i1I1lI001Io0(24);
                public int I00iOIl;
                public boolean I00iiI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iI1oi10OOO)) {
/* 7 */                 return false;
                    }
/* 11 */            iI1oi10OOO ii1oi10ooo = (iI1oi10OOO) obj;
                    return this.I00iOIl == ii1oi10ooo.I00iOIl && l1ioii1I10Io.I00000oIO(Boolean.valueOf(this.I00iiI), Boolean.valueOf(ii1oi10ooo.I00iiI));
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.I00iOIl), Boolean.valueOf(this.I00iiI)});
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            boolean z = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 23 */            parcel.writeInt(z ? 1 : 0);
/* 26 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
