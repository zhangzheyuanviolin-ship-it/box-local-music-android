            package p000;
            
            public final class l111io011O extends l1I010loO1l {
                public double I00000oIO;

                @Override
                public final int I00000oOI() {
/* 1 */             return 4;
                }

                @Override
                public final double I0000Il00O() {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1I010loO1l)) {
/* 34 */                return false;
                    }
/* 5 */             l1I010loO1l l1i010loo1l = (l1I010loO1l) obj;
                    return l1i010loo1l.I00000oOI() == 4 && Double.doubleToLongBits(this.I00000oIO) == Double.doubleToLongBits(l1i010loo1l.I0000Il00O());
                }

                public final int hashCode() {
/* 1 */             double d = this.I00000oIO;
/* 15 */            return (int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32));
                }

                public final String toString() {
/* 1 */             double d = this.I00000oIO;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 28);
/* 20 */            sb.append("WalleArgsValue{doubleValue=");
/* 23 */            sb.append(d);
/* 28 */            sb.append("}");
/* 31 */            return sb.toString();
                }
            }
