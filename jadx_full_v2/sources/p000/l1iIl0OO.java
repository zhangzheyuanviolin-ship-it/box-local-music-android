            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.TreeMap;
            
            public final class l1iIl0OO extends I01OlIoIl {
                public static final Parcelable.Creator<l1iIl0OO> CREATOR = new iolIll1o(5);
                public String I00iOIl;
                public byte[] I00iiI;
                public String I00iiO;
                public l1i0oiOO[] I00iio;
                public TreeMap I00ilI0I1;
                public boolean I00ilO0;
                public long I00io1l;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1iIl0OO)) {
/* 63 */                return false;
                    }
/* 5 */             l1iIl0OO l1iil0oo = (l1iIl0OO) obj;
                    return ll0IoOO1io.I00000oIO(this.I00iOIl, l1iil0oo.I00iOIl) && ll0IoOO1io.I00000oIO(this.I00iiO, l1iil0oo.I00iiO) && this.I00ilI0I1.equals(l1iil0oo.I00ilI0I1) && this.I00ilO0 == l1iil0oo.I00ilO0 && Arrays.equals(this.I00iiI, l1iil0oo.I00iiI) && this.I00io1l == l1iil0oo.I00io1l;
                }

                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{this.I00iOIl, this.I00iiO, this.I00ilI0I1, Boolean.valueOf(this.I00ilO0), this.I00iiI, Long.valueOf(this.I00io1l)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Configurations('");
/* 10 */            sb.append(this.I00iOIl);
/* 15 */            sb.append("', '");
/* 20 */            sb.append(this.I00iiO);
/* 25 */            sb.append("', (");
/* 34 */            Iterator it = this.I00ilI0I1.values().iterator();
/* 44 */            while (it.hasNext()) {
/* 52 */                sb.append((l1i0oiOO) it.next());
/* 55 */                sb.append(", ");
                    }
/* 61 */            sb.append("), ");
/* 66 */            sb.append(this.I00ilO0);
/* 69 */            sb.append(", ");
/* 72 */            byte[] bArr = this.I00iiI;
/* 84 */            sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
/* 87 */            sb.append(", ");
/* 92 */            sb.append(this.I00io1l);
/* 97 */            sb.append(')');
/* 100 */           return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, str);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 22 */            lO0IioIooIl.I000lI(parcel, 4, this.I00iio, i);
/* 25 */            boolean z = this.I00ilO0;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 31 */            parcel.writeInt(z ? 1 : 0);
/* 37 */            lO0IioIooIl.I00000oOI(parcel, 6, this.I00iiI);
/* 40 */            long j = this.I00io1l;
/* 45 */            lO0IioIooIl.I000oI1ioi(parcel, 7, 8);
/* 48 */            parcel.writeLong(j);
/* 51 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
