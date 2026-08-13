            package p000;

            import java.util.Arrays;
            
            public final class i0IoI1olO1 {
                public final String I00000oIO;
                public final long I00000oOI;
                public final int I0000Il00O;
                public final boolean I0000O;
                public final boolean I0000oI00;
                public final byte[] I0001Ioi1lo;

                public i0IoI1olO1(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = z;
/* 12 */            this.I0000oI00 = z2;
/* 14 */            this.I0001Ioi1lo = bArr;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 61 */                return true;
                    }
/* 6 */             if (!(obj instanceof i0IoI1olO1)) {
/* 63 */                return false;
                    }
/* 8 */             i0IoI1olO1 i0ioi1olo1 = (i0IoI1olO1) obj;
/* 10 */            String str = i0ioi1olo1.I00000oIO;
/* 12 */            String str2 = this.I00000oIO;
/* 14 */            if (str2 == null) {
/* 16 */                if (str != null) {
/* 63 */                    return false;
                        }
                    } else if (!str2.equals(str)) {
/* 63 */                return false;
                    }
                    return this.I00000oOI == i0ioi1olo1.I00000oOI && this.I0000Il00O == i0ioi1olo1.I0000Il00O && this.I0000O == i0ioi1olo1.I0000O && this.I0000oI00 == i0ioi1olo1.I0000oI00 && Arrays.equals(this.I0001Ioi1lo, i0ioi1olo1.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 7 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 22 */            int i = true != this.I0000O ? 1237 : 1231;
/* 25 */            long j = this.I00000oOI;
/* 41 */            int i2 = ((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.I0000Il00O;
/* 58 */            return Arrays.hashCode(this.I0001Ioi1lo) ^ (((((i2 * 1000003) ^ i) * 1000003) ^ (true != this.I0000oI00 ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 72 */            return "ZipEntry{name=" + this.I00000oIO + ", size=" + this.I00000oOI + ", compressionMethod=" + this.I0000Il00O + ", isPartial=" + this.I0000O + ", isEndOfArchive=" + this.I0000oI00 + ", headerBytes=" + Arrays.toString(this.I0001Ioi1lo) + "}";
                }
            }
