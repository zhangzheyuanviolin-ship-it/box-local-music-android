            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class l1o0OO1 extends I01OlIoIl implements Comparable {
                public static final Parcelable.Creator<l1o0OO1> CREATOR = new iolIll1o(11);
                public final int I00iOIl;
                public final int I00iiI;

                public l1o0OO1(int i, int i2) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             l1o0OO1 l1o0oo1 = (l1o0OO1) obj;
/* 3 */             int i = l1o0oo1.I00iOIl;
/* 5 */             int i2 = this.I00iOIl;
/* 7 */             if (i2 < i) {
/* 19 */                return -1;
                    }
/* 10 */            if (i2 > i) {
/* 23 */                return 1;
                    }
/* 13 */            int i3 = l1o0oo1.I00iiI;
/* 15 */            int i4 = this.I00iiI;
/* 17 */            if (i4 < i3) {
/* 19 */                return -1;
                    }
                    return i4 > i3 ? 1 : 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
                
                    r0 = (r3 = (p000.l1o0OO1) r3).I00iOIl;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
                
                    r3 = r3.I00iiI;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    return (obj instanceof l1o0OO1) && (i2 = this.I00iOIl) >= i && i2 <= i && (i4 = this.I00iiI) >= i3 && i4 <= i3;
                }

                public final int hashCode() {
/* 7 */             return (this.I00iOIl * 31) + this.I00iiI;
                }

                public final String toString() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I00iiI;
/* 28 */            StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
/* 35 */            IIlIOloOOO.I001l0I00(sb, "GenericDimension(", i, ", ", i2);
/* 40 */            sb.append(")");
/* 43 */            return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 26 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
