            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Objects;
            
            public final class iIOolIO1ooI extends I01OlIoIl {
                public static final Parcelable.Creator<iIOolIO1ooI> CREATOR = new i1I1lI001Io0(28);
                public String I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public float I00iio;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iIOolIO1ooI)) {
/* 7 */                 return false;
                    }
/* 11 */            iIOolIO1ooI iioolio1ooi = (iIOolIO1ooI) obj;
                    return this.I00iiI == iioolio1ooi.I00iiI && this.I00iiO == iioolio1ooi.I00iiO && Objects.equals(this.I00iOIl, iioolio1ooi.I00iOIl);
                }

                public final int hashCode() {
/* 19 */            return Objects.hash(this.I00iOIl, Integer.valueOf(this.I00iiI), Integer.valueOf(this.I00iiO));
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Rewrite{text='");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append("', tone=");
/* 20 */            sb.append(this.I00iiI);
/* 25 */            sb.append(", safetyClassificationResult=");
/* 32 */            return IIl001iO0Io.I000lI(this.I00iiO, "}", sb);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 13 */            int i2 = this.I00iiI;
/* 17 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeInt(i2);
/* 23 */            int i3 = this.I00iiO;
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 29 */            parcel.writeInt(i3);
/* 32 */            float f = this.I00iio;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 37 */            parcel.writeFloat(f);
/* 40 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
