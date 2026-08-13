            package p000;

            import java.io.IOException;
            
            public abstract class O01O10Ii {
                public final O01l0lO0li I00000oOI() {
/* 3 */             if (this instanceof O01l0lO0li) {
/* 5 */                 return (O01l0lO0li) this;
                    }
/* 10 */            IoOOl0iOl1io.I000OOo1O("Not a JSON Object: ", this);
/* 13 */            return null;
                }

                public String I0000O() {
/* 29 */            throw new UnsupportedOperationException(getClass().getSimpleName());
                }

                public final String toString() {
                    try {
/* 3 */                 StringBuilder sb = new StringBuilder();
/* 14 */                O01ooi1IIiiO o01ooi1IIiiO = new O01ooi1IIiiO(new OlOl0Oi(0, sb));
/* 18 */                o01ooi1IIiiO.I00ioIO = 1;
/* 22 */                O01OOOO0Oo1.I00000oIO.getClass();
/* 25 */                O01OOOO0Oo1.I0001Ioi1lo(o01ooi1IIiiO, this);
/* 28 */                return sb.toString();
                    } catch (IOException e) {
/* 34 */                I000II.I000O01llI0(e);
/* 37 */                return null;
                    }
                }
            }
