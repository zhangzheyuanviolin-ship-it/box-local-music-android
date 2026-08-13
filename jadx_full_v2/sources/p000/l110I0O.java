            package p000;
            
            public final class l110I0O extends l1I010loO1l {
                public boolean I00000oIO;

                @Override
                public final boolean I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1I010loO1l)) {
/* 24 */                return false;
                    }
/* 5 */             l1I010loO1l l1i010loo1l = (l1I010loO1l) obj;
                    return l1i010loo1l.I00000oOI() == 2 && this.I00000oIO == l1i010loo1l.I00000oIO();
                }

                public final int hashCode() {
                    return this.I00000oIO ? 1231 : 1237;
                }

                public final String toString() {
/* 1 */             boolean z = this.I00000oIO;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 26);
/* 20 */            sb.append("WalleArgsValue{boolValue=");
/* 23 */            sb.append(z);
/* 28 */            sb.append("}");
/* 31 */            return sb.toString();
                }
            }
