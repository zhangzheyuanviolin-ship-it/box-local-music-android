            package p000;
            
            public final class iiO01011O {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iiO01011O) {
/* 10 */                iiO01011O iio01011o = (iiO01011O) obj;
/* 20 */                if (this.I00000oIO.equals(iio01011o.I00000oIO) && this.I00000oOI.equals(iio01011o.I00000oOI) && this.I0000Il00O.equals(iio01011o.I0000Il00O) && this.I0000O.equals(iio01011o.I0000O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 26 */            int iHashCode = ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode();
/* 34 */            return this.I0000O.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AndroidInfo{androidSdkVersion=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", model=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", device=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", manufacturer=");
/* 42 */            return IIl001iO0Io.I00100l0(sb, this.I0000O, "}");
                }
            }
