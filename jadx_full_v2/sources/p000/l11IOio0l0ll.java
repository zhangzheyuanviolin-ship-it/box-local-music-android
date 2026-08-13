            package p000;
            
            public final class l11IOio0l0ll extends l1I010loO1l {
                public int I00000oIO;

                @Override
                public final int I00000oOI() {
/* 1 */             return 3;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof l1I010loO1l)) {
/* 24 */                return false;
                    }
/* 5 */             l1I010loO1l l1i010loo1l = (l1I010loO1l) obj;
                    return l1i010loo1l.I00000oOI() == 3 && this.I00000oIO == l1i010loo1l.I0000O();
                }

                public final int hashCode() {
/* 1 */             return this.I00000oIO;
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 22 */            return IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 25), "WalleArgsValue{intValue=", i, "}");
                }
            }
