            package p000;
            
            public final class OIoiOI0OI {
                public I0ol0iioI I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 33 */                return true;
                    }
/* 7 */             if (obj instanceof OIoiOI0OI) {
/* 10 */                OIoiOI0OI oIoiOI0OI = (OIoiOI0OI) obj;
/* 16 */                if (this.I00000oIO == oIoiOI0OI.I00000oIO && this.I00000oOI == oIoiOI0OI.I00000oOI && this.I0000Il00O == oIoiOI0OI.I0000Il00O) {
/* 33 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 1 */             I0ol0iioI i0ol0iioI = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
/* 14 */            sb.append(i0ol0iioI);
/* 19 */            sb.append(", startIndex=");
/* 22 */            sb.append(i);
/* 27 */            sb.append(", endIndex=");
/* 32 */            return IIl001iO0Io.I000lI(i2, ")", sb);
                }
            }
