            package p000;
            
            public final class ilOi00IOiII {
                public iIolOi01l0o I00000oIO;
                public il0llll00oO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilOi00IOiII) {
/* 10 */                ilOi00IOiII iloi00ioiii = (ilOi00IOiII) obj;
/* 20 */                if (this.I00000oIO.equals(iloi00ioiii.I00000oIO) && this.I00000oOI.equals(iloi00ioiii.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String string2 = this.I00000oOI.toString();
/* 28 */            StringBuilder sb = new StringBuilder(length + 42 + string2.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "ServiceContext{service=", string, ", disconnectSignal=", string2);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
