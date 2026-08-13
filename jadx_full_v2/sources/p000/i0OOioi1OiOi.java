            package p000;
            
            public final class i0OOioi1OiOi extends I0iio0 {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public int I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I0iio0) {
/* 14 */                i0OOioi1OiOi i0ooioi1oioi = (i0OOioi1OiOi) ((I0iio0) obj);
/* 22 */                if (this.I00000oIO.equals(i0ooioi1oioi.I00000oIO) && this.I00000oOI == i0ooioi1oioi.I00000oOI && this.I0000Il00O == i0ooioi1oioi.I0000Il00O && this.I0000O == i0ooioi1oioi.I0000O && this.I0000oI00 == i0ooioi1oioi.I0000oI00 && this.I0001Ioi1lo == i0ooioi1oioi.I0001Ioi1lo) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            long j = this.I0000oI00;
/* 18 */            long j2 = this.I0000O;
/* 41 */            return this.I0001Ioi1lo ^ (((((((((iHashCode * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AiPackState{name=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", status=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", errorCode=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", bytesDownloaded=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", totalBytesToDownload=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", transferProgressPercentage=");
/* 62 */            return IIl001iO0Io.I000lI(this.I0001Ioi1lo, "}", sb);
                }
            }
