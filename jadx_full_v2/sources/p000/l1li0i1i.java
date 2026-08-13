            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class l1li0i1i extends I01OlIoIl {
                public static final Parcelable.Creator<l1li0i1i> CREATOR = new iolIll1o(9);
                public String I00iOIl;
                public String I00iiI;
                public l1lIII1IiI I00iiO;
                public boolean I00iio;

                public final void I00000oOI(StringBuilder sb) {
/* 3 */             sb.append("FlagOverride(");
/* 8 */             sb.append(this.I00iOIl);
/* 13 */            sb.append(", ");
/* 18 */            sb.append(this.I00iiI);
/* 21 */            sb.append(", ");
/* 26 */            this.I00iiO.I00000oOI(sb);
/* 29 */            sb.append(", ");
/* 34 */            sb.append(this.I00iio);
/* 39 */            sb.append(")");
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof l1li0i1i)) {
/* 7 */                 return false;
                    }
/* 11 */            l1li0i1i l1li0i1iVar = (l1li0i1i) obj;
                    return ll0IoOO1io.I00000oIO(this.I00iOIl, l1li0i1iVar.I00iOIl) && ll0IoOO1io.I00000oIO(this.I00iiI, l1li0i1iVar.I00iiI) && ll0IoOO1io.I00000oIO(this.I00iiO, l1li0i1iVar.I00iiO) && this.I00iio == l1li0i1iVar.I00iio;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             I00000oOI(sb);
/* 9 */             return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, str);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iiO, i);
/* 25 */            boolean z = this.I00iio;
/* 28 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 31 */            parcel.writeInt(z ? 1 : 0);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
