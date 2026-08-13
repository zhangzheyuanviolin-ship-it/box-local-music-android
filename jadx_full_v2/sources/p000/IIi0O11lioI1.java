            package p000;
            
            public final class IIi0O11lioI1 implements Comparable {
                public final long I00iOIl;
                public final int I00iiI;

                public IIi0O11lioI1(int i, long j) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             IIi0O11lioI1 iIi0O11lioI1 = (IIi0O11lioI1) obj;
/* 3 */             long j = this.I00iOIl;
/* 5 */             long j2 = iIi0O11lioI1.I00iOIl;
/* 9 */             if (j < j2) {
/* 21 */                return -1;
                    }
/* 12 */            if (j > j2) {
/* 25 */                return 1;
                    }
/* 15 */            int i = iIi0O11lioI1.I00iiI;
/* 17 */            int i2 = this.I00iiI;
/* 19 */            if (i2 < i) {
/* 21 */                return -1;
                    }
                    return i2 > i ? 1 : 0;
                }

                public final boolean equals(Object obj) {
/* 8 */             IIi0O11lioI1 iIi0O11lioI1 = obj instanceof IIi0O11lioI1 ? (IIi0O11lioI1) obj : null;
                    return iIi0O11lioI1 != null && iIi0O11lioI1.I00iOIl == this.I00iOIl && iIi0O11lioI1.I00iiI == this.I00iiI;
                }

                public final int hashCode() {
/* 13 */            return Long.valueOf((this.I00iOIl << 4) + this.I00iiI).hashCode();
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00iOIl);
/* 13 */            sb.append(" ");
/* 20 */            return IIl001iO0Io.I000lI(this.I00iiI, " R", sb);
                }
            }
