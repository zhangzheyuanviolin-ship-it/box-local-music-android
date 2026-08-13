            package p000;

            import java.util.Arrays;
            
/* 12 */    public final class OI0l1iiooO {
                public int[] I00000oIO;
                public int I00000oOI;

                public OI0l1iiooO(int i) {
/* 11 */            this.I00000oIO = i == 0 ? IooOIoI.I00000oIO : new int[i];
                }

                public final void I00000oIO(int i) {
/* 5 */             I00000oOI(this.I00000oOI + 1);
/* 8 */             int[] iArr = this.I00000oIO;
/* 10 */            int i2 = this.I00000oOI;
/* 12 */            iArr[i2] = i;
/* 16 */            this.I00000oOI = i2 + 1;
                }

                public final void I00000oOI(int i) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             if (iArr.length < i) {
/* 19 */                this.I00000oIO = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
                    }
                }

                public final int I0000Il00O(int i) {
/* 1 */             if (i >= 0 && i < this.I00000oOI) {
/* 9 */                 return this.I00000oIO[i];
                    }
/* 14 */            lO00l0o.I00000oOI("Index must be between 0 and size");
/* 29 */            throw null;
                }

                public final int I0000O() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             if (i != 0) {
/* 9 */                 return this.I00000oIO[i - 1];
                    }
/* 14 */            lO00l0o.I0000Il00O("IntList is empty.");
/* 20 */            throw null;
                }

                public final void I0000oI00(int i) {
                    int i2;
/* 1 */             if (i < 0 || i >= (i2 = this.I00000oOI)) {
/* 29 */                lO00l0o.I00000oOI("Index must be between 0 and size");
/* 77 */                throw null;
                    }
/* 7 */             int[] iArr = this.I00000oIO;
/* 9 */             int i3 = iArr[i];
/* 13 */            if (i != i2 - 1) {
/* 17 */                I1IoiO1l.I000O01llI0(i, i + 1, i2, iArr, iArr);
                    }
                    this.I00000oOI--;
                }

                public final void I0001Ioi1lo(int i, int i2) {
/* 1 */             if (i < 0 || i >= this.I00000oOI) {
/* 16 */                lO00l0o.I00000oOI("Index must be between 0 and size");
/* 37 */                throw null;
                    }
/* 7 */             int[] iArr = this.I00000oIO;
/* 9 */             int i3 = iArr[i];
/* 11 */            iArr[i] = i2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OI0l1iiooO) {
/* 6 */                 OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) obj;
/* 8 */                 int i = oI0l1iiooO.I00000oOI;
/* 10 */                int i2 = this.I00000oOI;
/* 12 */                if (i == i2) {
/* 15 */                    int[] iArr = this.I00000oIO;
/* 17 */                    int[] iArr2 = oI0l1iiooO.I00000oIO;
/* 19 */                    IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i2);
/* 23 */                    int i3 = iooO11lI000O01llI0.I00iOIl;
/* 25 */                    int i4 = iooO11lI000O01llI0.I00iiI;
/* 27 */                    if (i3 > i4) {
/* 41 */                        return true;
                            }
/* 33 */                    while (iArr[i3] == iArr2[i3]) {
/* 36 */                        if (i3 == i4) {
/* 41 */                            return true;
                                }
/* 38 */                        i3++;
                            }
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 6 */             int iHashCode = 0;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 17 */                iHashCode += Integer.hashCode(iArr[i2]) * 31;
                    }
/* 55 */            return iHashCode;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append((CharSequence) "[");
/* 11 */            int[] iArr = this.I00000oIO;
/* 13 */            int i = this.I00000oOI;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                if (i2 >= i) {
/* 44 */                    sb.append((CharSequence) "]");
                            break;
                        }
/* 18 */                int i3 = iArr[i2];
/* 21 */                if (i2 == -1) {
/* 25 */                    sb.append((CharSequence) "...");
                            break;
                        }
/* 29 */                if (i2 != 0) {
/* 33 */                    sb.append((CharSequence) ", ");
                        }
/* 36 */                sb.append(i3);
/* 39 */                i2++;
                    }
/* 47 */            return sb.toString();
                }

/* 13 */        public OI0l1iiooO() {
/* 14 */            this(16);
                }
            }
