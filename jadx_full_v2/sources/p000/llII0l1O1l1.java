            package p000;

            import java.io.IOException;
            
            public abstract class llII0l1O1l1 {
                public final llIiii10 I00000oOI() {
/* 3 */             if (this instanceof llIiii10) {
/* 5 */                 return (llIiii10) this;
                    }
/* 18 */            I000II.I001IO000("Not a JSON Object: ".concat(toString()));
/* 21 */            return null;
                }

                public final llI001IilOi I0000O() {
/* 3 */             if (this instanceof llI001IilOi) {
/* 5 */                 return (llI001IilOi) this;
                    }
/* 18 */            I000II.I001IO000("Not a JSON Array: ".concat(toString()));
/* 21 */            return null;
                }

                public final String toString() {
                    try {
/* 3 */                 StringBuilder sb = new StringBuilder();
/* 14 */                o0Io0l11I o0io0l11i = new o0Io0l11I(new OlOl0Oi(1, sb));
/* 17 */                o0io0l11i.I00ioIO = 1;
/* 19 */                loi0OO1oo1o.I0000Il00O(o0io0l11i, this);
/* 22 */                return sb.toString();
                    } catch (IOException e) {
/* 28 */                I000II.I000O01llI0(e);
/* 31 */                return null;
                    }
                }
            }
