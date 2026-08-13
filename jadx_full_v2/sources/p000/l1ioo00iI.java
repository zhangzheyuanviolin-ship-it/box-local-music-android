            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Set;
            
            public final class l1ioo00iI extends I01OlIoIl {
                public static final Parcelable.Creator<l1ioo00iI> CREATOR = new iolIll1o(7);
                public String I00iOIl;
                public byte[] I00iiI;
                public byte[][] I00iiO;
                public byte[][] I00iio;
                public byte[][] I00ilI0I1;
                public byte[][] I00ilO0;
                public int[] I00io1l;
                public byte[][] I00ioIO;
                public int[] I00l0I0l0lO1;
                public byte[][] I00l0OO0IO;

                public static void I00000oOI(StringBuilder sb, String str, byte[][] bArr) {
/* 1 */             sb.append(str);
/* 6 */             sb.append("=");
/* 9 */             if (bArr == null) {
/* 13 */                sb.append("null");
/* 16 */                return;
                    }
/* 19 */            sb.append("(");
/* 22 */            boolean z = true;
/* 24 */            int i = 0;
/* 26 */            while (i < bArr.length) {
/* 28 */                byte[] bArr2 = bArr[i];
/* 30 */                if (!z) {
/* 34 */                    sb.append(", ");
                        }
/* 39 */                sb.append("'");
/* 42 */                lII0I0I000I.I000II(bArr2);
/* 50 */                sb.append(Base64.encodeToString(bArr2, 3));
/* 53 */                sb.append("'");
/* 56 */                i++;
/* 58 */                z = false;
                    }
/* 62 */            sb.append(")");
                }

                public static Set I0000oI00(byte[][] bArr) {
                    int length;
/* 1 */             if (bArr == null || (length = bArr.length) == 0) {
/* 31 */                return Collections.EMPTY_SET;
                    }
/* 7 */             HashSet hashSetI00000oOI = lOI00O.I00000oOI(length);
/* 12 */            for (byte[] bArr2 : bArr) {
/* 16 */                lII0I0I000I.I000II(bArr2);
/* 24 */                hashSetI00000oOI.add(Base64.encodeToString(bArr2, 3));
                    }
/* 30 */            return hashSetI00000oOI;
                }

                public static List I0001Ioi1lo(int[] iArr) {
/* 1 */             if (iArr == null) {
/* 3 */                 return Collections.EMPTY_LIST;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(iArr.length >> 1);
/* 16 */            for (int i = 0; i < iArr.length; i += 2) {
/* 29 */                arrayList.add(new l1o0OO1(iArr[i], iArr[i + 1]));
                    }
/* 35 */            Collections.sort(arrayList);
/* 77 */            return arrayList;
                }

                public final Set I0000O() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             byte[][] bArr = this.I00ioIO;
/* 8 */             if (bArr != null) {
/* 10 */                Collections.addAll(arrayList, bArr);
                    }
/* 13 */            byte[] bArr2 = this.I00iiI;
/* 15 */            if (bArr2 != null) {
/* 17 */                arrayList.add(bArr2);
                    }
/* 29 */            return I0000oI00((byte[][]) arrayList.toArray(new byte[0][]));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
                public final boolean equals(Object obj) {
                    Object objI00000oOI;
                    Object objI00000oOI2;
                    int length;
                    int length2;
/* 4 */             if (obj instanceof l1ioo00iI) {
/* 6 */                 l1ioo00iI l1ioo00ii = (l1ioo00iI) obj;
/* 16 */                if (ll0IoOO1io.I00000oIO(this.I00iOIl, l1ioo00ii.I00iOIl) && ll0IoOO1io.I00000oIO(I0000O(), l1ioo00ii.I0000O()) && ll0IoOO1io.I00000oIO(I0000oI00(this.I00iiO), I0000oI00(l1ioo00ii.I00iiO)) && ll0IoOO1io.I00000oIO(I0000oI00(this.I00iio), I0000oI00(l1ioo00ii.I00iio)) && ll0IoOO1io.I00000oIO(I0000oI00(this.I00ilI0I1), I0000oI00(l1ioo00ii.I00ilI0I1)) && ll0IoOO1io.I00000oIO(I0000oI00(this.I00ilO0), I0000oI00(l1ioo00ii.I00ilO0))) {
/* 104 */                   int[] iArr = this.I00io1l;
/* 106 */                   if (iArr == null || (length2 = iArr.length) == 0) {
/* 131 */                       objI00000oOI = Collections.EMPTY_SET;
                            } else {
/* 112 */                       objI00000oOI = lOI00O.I00000oOI(length2);
/* 117 */                       for (int i : iArr) {
/* 125 */                           objI00000oOI.add(Integer.valueOf(i));
                                }
                            }
/* 133 */                   int[] iArr2 = l1ioo00ii.I00io1l;
/* 135 */                   if (iArr2 == null || (length = iArr2.length) == 0) {
/* 160 */                       objI00000oOI2 = Collections.EMPTY_SET;
                            } else {
/* 141 */                       objI00000oOI2 = lOI00O.I00000oOI(length);
/* 146 */                       for (int i2 : iArr2) {
/* 154 */                           objI00000oOI2.add(Integer.valueOf(i2));
                                }
                            }
/* 166 */                   if (ll0IoOO1io.I00000oIO(objI00000oOI, objI00000oOI2) && ll0IoOO1io.I00000oIO(I0001Ioi1lo(this.I00l0I0l0lO1), I0001Ioi1lo(l1ioo00ii.I00l0I0l0lO1)) && ll0IoOO1io.I00000oIO(I0000oI00(this.I00l0OO0IO), I0000oI00(l1ioo00ii.I00l0OO0IO))) {
/* 204 */                       return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ExperimentTokens");
/* 10 */            sb.append("(");
/* 13 */            String str = this.I00iOIl;
/* 38 */            sb.append(str == null ? "null" : IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + 2), "'", str, "'"));
/* 41 */            byte[] bArr = this.I00iiI;
/* 45 */            sb.append(", direct==");
/* 48 */            if (bArr == null) {
/* 50 */                sb.append("null");
                    } else {
/* 54 */                sb.append("'");
/* 62 */                sb.append(Base64.encodeToString(bArr, 3));
/* 65 */                sb.append("'");
                    }
/* 70 */            sb.append(", ");
/* 77 */            I00000oOI(sb, "GAIA=", this.I00iiO);
/* 80 */            sb.append(", ");
/* 87 */            I00000oOI(sb, "PSEUDO=", this.I00iio);
/* 90 */            sb.append(", ");
/* 97 */            I00000oOI(sb, "ALWAYS=", this.I00ilI0I1);
/* 100 */           sb.append(", ");
/* 107 */           I00000oOI(sb, "OTHER=", this.I00ilO0);
/* 112 */           sb.append(", weak=");
/* 121 */           sb.append(Arrays.toString(this.I00io1l));
/* 124 */           sb.append(", ");
/* 131 */           I00000oOI(sb, "directs=", this.I00ioIO);
/* 136 */           sb.append(", genDims=");
/* 153 */           sb.append(Arrays.toString(I0001Ioi1lo(this.I00l0I0l0lO1).toArray()));
/* 156 */           sb.append(", ");
/* 163 */           I00000oOI(sb, "external=", this.I00l0OO0IO);
/* 168 */           sb.append(")");
/* 171 */           return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, str);
/* 16 */            lO0IioIooIl.I00000oOI(parcel, 3, this.I00iiI);
/* 22 */            lO0IioIooIl.I0000Il00O(parcel, 4, this.I00iiO);
/* 28 */            lO0IioIooIl.I0000Il00O(parcel, 5, this.I00iio);
/* 34 */            lO0IioIooIl.I0000Il00O(parcel, 6, this.I00ilI0I1);
/* 40 */            lO0IioIooIl.I0000Il00O(parcel, 7, this.I00ilO0);
/* 47 */            lO0IioIooIl.I000II(parcel, 8, this.I00io1l);
/* 54 */            lO0IioIooIl.I0000Il00O(parcel, 9, this.I00ioIO);
/* 61 */            lO0IioIooIl.I000II(parcel, 10, this.I00l0I0l0lO1);
/* 68 */            lO0IioIooIl.I0000Il00O(parcel, 11, this.I00l0OO0IO);
/* 71 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
