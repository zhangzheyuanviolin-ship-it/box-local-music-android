            package p000;
            
            public final class l00Oi001i1l {
                public Object I00000oIO;
                public il0llll00oO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof l00Oi001i1l) {
/* 10 */                l00Oi001i1l l00oi001i1l = (l00Oi001i1l) obj;
/* 20 */                if (this.I00000oIO.equals(l00oi001i1l.I00000oIO) && this.I00000oOI.equals(l00oi001i1l.I00000oOI)) {
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
/* 28 */            StringBuilder sb = new StringBuilder(length + 54 + string2.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "InferenceServiceContext{getService=", string, ", disconnectSignal=", string2);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
