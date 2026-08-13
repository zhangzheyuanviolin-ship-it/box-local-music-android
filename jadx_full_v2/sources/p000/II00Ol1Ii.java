            package p000;
            
/* 15 */    public final class II00Ol1Ii {
                public final String I00000oIO;
                public final II00OOlli I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final boolean I0000oI00;
                public final I0iiIiI1 I0001Ioi1lo;

                public II00Ol1Ii(String str, II00OOlli iI00OOlli, boolean z, boolean z2, boolean z3, I0iiIiI1 i0iiIiI1) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = iI00OOlli;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = z3;
/* 14 */            this.I0001Ioi1lo = i0iiIiI1;
                }

                public static II00Ol1Ii I00000oIO(II00Ol1Ii iI00Ol1Ii, boolean z, boolean z2, boolean z3, I0iiIiI1 i0iiIiI1, int i) {
/* 1 */             String str = iI00Ol1Ii.I00000oIO;
/* 3 */             II00OOlli iI00OOlli = iI00Ol1Ii.I00000oOI;
/* 7 */             if ((i & 4) != 0) {
/* 9 */                 z = iI00Ol1Ii.I0000Il00O;
                    }
/* 11 */            boolean z4 = z;
/* 14 */            if ((i & 8) != 0) {
/* 16 */                z2 = iI00Ol1Ii.I0000O;
                    }
/* 18 */            boolean z5 = z2;
/* 21 */            if ((i & 16) != 0) {
/* 23 */                z3 = iI00Ol1Ii.I0000oI00;
                    }
/* 25 */            boolean z6 = z3;
/* 28 */            if ((i & 32) != 0) {
/* 30 */                i0iiIiI1 = iI00Ol1Ii.I0001Ioi1lo;
                    }
/* 33 */            iI00Ol1Ii.getClass();
/* 38 */            return new II00Ol1Ii(str, iI00OOlli, z4, z5, z6, i0iiIiI1);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof II00Ol1Ii)) {
/* 7 */                 return false;
                    }
/* 11 */            II00Ol1Ii iI00Ol1Ii = (II00Ol1Ii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iI00Ol1Ii.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iI00Ol1Ii.I00000oOI) && this.I0000Il00O == iI00Ol1Ii.I0000Il00O && this.I0000O == iI00Ol1Ii.I0000O && this.I0000oI00 == iI00Ol1Ii.I0000oI00 && this.I0001Ioi1lo == iI00Ol1Ii.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 42 */            return this.I0001Ioi1lo.hashCode() + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 68 */            return "BenchmarkResultInfo(id=" + this.I00000oIO + ", benchmarkResult=" + this.I00000oOI + ", expanded=" + this.I0000Il00O + ", basicInfoExpanded=" + this.I0000O + ", statsExpanded=" + this.I0000oI00 + ", aggregation=" + this.I0001Ioi1lo + ")";
                }

/* 16 */        public II00Ol1Ii(String str, II00OOlli iI00OOlli, boolean z, int i) {
/* 18 */            this(str, iI00OOlli, false, z, true, I0iiIiI1.I00iiI);
                }
            }
