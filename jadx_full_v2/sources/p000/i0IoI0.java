            package p000;
            
            public final class i0IoI0 {
                public int I00000oIO;
                public String I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public int I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof i0IoI0) {
/* 10 */                i0IoI0 i0ioi0 = (i0IoI0) obj;
/* 16 */                if (this.I00000oIO == i0ioi0.I00000oIO) {
/* 18 */                    String str = this.I00000oOI;
/* 20 */                    String str2 = i0ioi0.I00000oOI;
/* 22 */                    if (str != null ? str.equals(str2) : str2 == null) {
/* 40 */                        if (this.I0000Il00O == i0ioi0.I0000Il00O && this.I0000O == i0ioi0.I0000O && this.I0000oI00 == i0ioi0.I0000oI00) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oOI;
/* 7 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 11 */            int i = this.I00000oIO;
/* 13 */            long j = this.I0000Il00O;
/* 15 */            long j2 = this.I0000O;
/* 40 */            return this.I0000oI00 ^ ((((((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", filePath=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", fileOffset=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", remainingBytes=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", previousChunk=");
/* 52 */            return IIl001iO0Io.I000lI(this.I0000oI00, "}", sb);
                }
            }
