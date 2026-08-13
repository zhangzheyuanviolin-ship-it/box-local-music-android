            package p000;
            
            public final class l11iollIiol1 extends l1I010loO1l {
                public long I00000oIO;

                @Override
                public final int I00000oOI() {
/* 1 */             return 6;
                }

                @Override
                public final long I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1I010loO1l)) {
/* 26 */                return false;
                    }
/* 5 */             l1I010loO1l l1i010loo1l = (l1I010loO1l) obj;
                    return l1i010loo1l.I00000oOI() == 6 && this.I00000oIO == l1i010loo1l.I0001Ioi1lo();
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 8 */             return (int) (j ^ (j >>> 32));
                }

                public final String toString() {
/* 1 */             long j = this.I00000oIO;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 26);
/* 20 */            sb.append("WalleArgsValue{longValue=");
/* 23 */            sb.append(j);
/* 28 */            sb.append("}");
/* 31 */            return sb.toString();
                }
            }
