            package p000;

            import java.util.Arrays;
            
/* 12 */    public final class OI0llOl1ooO0 {
                public long[] I00000oIO;
                public int I00000oOI;

                public OI0llOl1ooO0(int i) {
/* 11 */            this.I00000oIO = i == 0 ? O1IOii.I00000oIO : new long[i];
                }

                public final void I00000oIO(long j) {
/* 3 */             int i = this.I00000oOI + 1;
/* 5 */             long[] jArrCopyOf = this.I00000oIO;
/* 8 */             if (jArrCopyOf.length < i) {
/* 19 */                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
/* 23 */                this.I00000oIO = jArrCopyOf;
                    }
/* 25 */            int i2 = this.I00000oOI;
/* 27 */            jArrCopyOf[i2] = j;
/* 31 */            this.I00000oOI = i2 + 1;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OI0llOl1ooO0) {
/* 6 */                 OI0llOl1ooO0 oI0llOl1ooO0 = (OI0llOl1ooO0) obj;
/* 8 */                 int i = oI0llOl1ooO0.I00000oOI;
/* 10 */                int i2 = this.I00000oOI;
/* 12 */                if (i == i2) {
/* 15 */                    long[] jArr = this.I00000oIO;
/* 17 */                    long[] jArr2 = oI0llOl1ooO0.I00000oIO;
/* 19 */                    IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i2);
/* 23 */                    int i3 = iooO11lI000O01llI0.I00iOIl;
/* 25 */                    int i4 = iooO11lI000O01llI0.I00iiI;
/* 27 */                    if (i3 > i4) {
/* 43 */                        return true;
                            }
/* 35 */                    while (jArr[i3] == jArr2[i3]) {
/* 38 */                        if (i3 == i4) {
/* 43 */                            return true;
                                }
/* 40 */                        i3++;
                            }
/* 3 */                     return false;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             long[] jArr = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 6 */             int iHashCode = 0;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 17 */                iHashCode += Long.hashCode(jArr[i2]) * 31;
                    }
/* 55 */            return iHashCode;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append((CharSequence) "[");
/* 11 */            long[] jArr = this.I00000oIO;
/* 13 */            int i = this.I00000oOI;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                if (i2 >= i) {
/* 44 */                    sb.append((CharSequence) "]");
                            break;
                        }
/* 18 */                long j = jArr[i2];
/* 21 */                if (i2 == -1) {
/* 25 */                    sb.append((CharSequence) "...");
                            break;
                        }
/* 29 */                if (i2 != 0) {
/* 33 */                    sb.append((CharSequence) ", ");
                        }
/* 36 */                sb.append(j);
/* 39 */                i2++;
                    }
/* 47 */            return sb.toString();
                }

/* 13 */        public OI0llOl1ooO0() {
/* 14 */            this(16);
                }
            }
