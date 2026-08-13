            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.TreeMap;
            
            public final class l1i0oiOO extends I01OlIoIl implements Comparable {
                public static final Parcelable.Creator<l1i0oiOO> CREATOR = new iolIll1o(4);
                public int I00iOIl;
                public l1lIII1IiI[] I00iiI;
                public String[] I00iiO;
                public TreeMap I00iio;

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl - ((l1i0oiOO) obj).I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1i0oiOO)) {
/* 35 */                return false;
                    }
/* 5 */             l1i0oiOO l1i0oioo = (l1i0oiOO) obj;
                    return this.I00iOIl == l1i0oioo.I00iOIl && ll0IoOO1io.I00000oIO(this.I00iio, l1i0oioo.I00iio) && Arrays.equals(this.I00iiO, l1i0oioo.I00iiO);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Configuration(");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append(", (");
/* 24 */            Iterator it = this.I00iio.values().iterator();
/* 34 */            while (it.hasNext()) {
/* 42 */                sb.append((l1lIII1IiI) it.next());
/* 45 */                sb.append(", ");
                    }
/* 51 */            sb.append("), (");
/* 54 */            String[] strArr = this.I00iiO;
/* 56 */            if (strArr != null) {
/* 60 */                for (String str : strArr) {
/* 64 */                    sb.append(str);
/* 67 */                    sb.append(", ");
                        }
                    } else {
/* 75 */                sb.append("null");
                    }
/* 80 */            sb.append("))");
/* 83 */            return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000lI(parcel, 3, this.I00iiI, i);
/* 25 */            lO0IioIooIl.I000iOII(parcel, 4, this.I00iiO);
/* 28 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
