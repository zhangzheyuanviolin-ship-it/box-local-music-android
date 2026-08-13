            package p000;

            import java.io.Serializable;
            
            public final class l11Ol11 extends l1I010loO1l {
                public final int I00000oIO;
                public Serializable I00000oOI;

                public l11Ol11(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final int I00000oOI() {
                    switch (this.I00000oIO) {
                        case 0:
/* 8 */                     return 5;
                        default:
/* 6 */                     return 1;
                    }
                }

                @Override
                public lOI1lll1l10 I0000oI00() {
                    switch (this.I00000oIO) {
                        case 0:
/* 13 */                    return (lOI1lll1l10) this.I00000oOI;
                        default:
/* 6 */                     return super.I0000oI00();
                    }
                }

                @Override
                public String I000II() {
                    switch (this.I00000oIO) {
                        case 1:
/* 13 */                    return (String) this.I00000oOI;
                        default:
/* 6 */                     return super.I000II();
                    }
                }

                public final boolean equals(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 39 */                    if (obj instanceof l1I010loO1l) {
/* 41 */                        l1I010loO1l l1i010loo1l = (l1I010loO1l) obj;
/* 48 */                        if (l1i010loo1l.I00000oOI() == 5 && ((lOI1lll1l10) this.I00000oOI).equals(l1i010loo1l.I0000oI00())) {
                                }
                            }
                            break;
                        default:
/* 10 */                    if (obj instanceof l1I010loO1l) {
/* 12 */                        l1I010loO1l l1i010loo1l2 = (l1I010loO1l) obj;
/* 18 */                        if (l1i010loo1l2.I00000oOI() == 1 && ((String) this.I00000oOI).equals(l1i010loo1l2.I000II())) {
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                public final int hashCode() {
                    switch (this.I00000oIO) {
                        case 0:
/* 19 */                    return ((lOI1lll1l10) this.I00000oOI).hashCode();
                        default:
/* 10 */                    return ((String) this.I00000oOI).hashCode();
                    }
                }

                public final String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 38 */                    String strValueOf = String.valueOf((lOI1lll1l10) this.I00000oOI);
/* 55 */                    return IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 26), "WalleArgsValue{listValue=", strValueOf, "}");
                        default:
/* 10 */                    String str = (String) this.I00000oOI;
/* 29 */                    return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 28), "WalleArgsValue{stringValue=", str, "}");
                    }
                }
            }
