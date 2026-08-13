            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class II0I0ili0 {
                public final List I00000oIO;
                public final II00Ol1Ii I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final int I0000oI00;
                public final int I0001Ioi1lo;
                public final String I000II;

                public II0I0ili0(List list, II00Ol1Ii iI00Ol1Ii, boolean z, boolean z2, int i, int i2, String str) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = iI00Ol1Ii;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = i;
/* 14 */            this.I0001Ioi1lo = i2;
/* 16 */            this.I000II = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
                public static II0I0ili0 I00000oIO(II0I0ili0 iI0I0ili0, ArrayList arrayList, II00Ol1Ii iI00Ol1Ii, boolean z, boolean z2, int i, int i2, String str, int i3) {
                    ArrayList arrayList2 = arrayList;
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 arrayList2 = iI0I0ili0.I00000oIO;
                    }
/* 7 */             ArrayList arrayList3 = arrayList2;
/* 10 */            if ((i3 & 2) != 0) {
/* 12 */                iI00Ol1Ii = iI0I0ili0.I00000oOI;
                    }
/* 14 */            II00Ol1Ii iI00Ol1Ii2 = iI00Ol1Ii;
/* 17 */            if ((i3 & 4) != 0) {
/* 19 */                z = iI0I0ili0.I0000Il00O;
                    }
/* 21 */            boolean z3 = z;
/* 24 */            if ((i3 & 8) != 0) {
/* 26 */                z2 = iI0I0ili0.I0000O;
                    }
/* 28 */            boolean z4 = z2;
/* 31 */            if ((i3 & 16) != 0) {
/* 33 */                i = iI0I0ili0.I0000oI00;
                    }
/* 35 */            int i4 = i;
/* 38 */            if ((i3 & 32) != 0) {
/* 40 */                i2 = iI0I0ili0.I0001Ioi1lo;
                    }
/* 42 */            int i5 = i2;
/* 45 */            if ((i3 & 64) != 0) {
/* 47 */                str = iI0I0ili0.I000II;
                    }
/* 50 */            iI0I0ili0.getClass();
/* 55 */            return new II0I0ili0(arrayList3, iI00Ol1Ii2, z3, z4, i4, i5, str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 73 */                return true;
                    }
/* 6 */             if (!(obj instanceof II0I0ili0)) {
/* 71 */                return false;
                    }
/* 9 */             II0I0ili0 iI0I0ili0 = (II0I0ili0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iI0I0ili0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iI0I0ili0.I00000oOI) && this.I0000Il00O == iI0I0ili0.I0000Il00O && this.I0000O == iI0I0ili0.I0000O && this.I0000oI00 == iI0I0ili0.I0000oI00 && this.I0001Ioi1lo == iI0I0ili0.I0001Ioi1lo && this.I000II.equals(iI0I0ili0.I000II);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            II00Ol1Ii iI00Ol1Ii = this.I00000oOI;
/* 52 */            return this.I000II.hashCode() + IIl001iO0Io.I0000O(this.I0001Ioi1lo, IIl001iO0Io.I0000O(this.I0000oI00, Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iHashCode + (iI00Ol1Ii == null ? 0 : iI00Ol1Ii.hashCode())) * 31, 31, this.I0000Il00O), 31, this.I0000O), 31), 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BenchmarkUiState(results=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", baselineResult=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", showResultsViewer=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", running=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", totalRunCount=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", completedRunCount=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", benchmarkError=");
/* 72 */            return IIl001iO0Io.I00100l0(sb, this.I000II, ")");
                }
            }
