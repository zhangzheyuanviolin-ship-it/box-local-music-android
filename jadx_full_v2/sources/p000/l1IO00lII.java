            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l1IO00lII {
                public static final l1IO00lII I00000oOI;
                public lOI1lll1l10 I00000oIO;

                static {
/* 1 */             lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 3 */             lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOl10OOloi.I00ilI0I1;
/* 7 */             if (loi1lll1l10I000o00OoI0I != null) {
/* 10 */                loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(loi1lll1l10I000o00OoI0I);
                    }
/* 14 */            l1IO00lII l1io00lii = new l1IO00lII();
/* 17 */            if (loi1lll1l10I000o00OoI0I == null) {
/* 29 */                IOOlIIilOl0.I000II("Null functionDeclarations");
/* 55 */                return;
                    }
/* 19 */            l1io00lii.I00000oIO = loi1lll1l10I000o00OoI0I;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            I00000oOI = l1io00lii;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof l1IO00lII) {
/* 15 */                return this.I00000oIO.equals(((l1IO00lII) obj).I00000oIO);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 33), "WalleTools{functionDeclarations=", string, "}");
                }
            }
