            package p000;
            
            public class Io110l01i extends Oili10 {
                public OoO00O1IiOl I00000oIO = null;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) {
/* 1 */             OoO00O1IiOl ooO00O1IiOl = this.I00000oIO;
/* 3 */             if (ooO00O1IiOl != null) {
/* 5 */                 return ooO00O1IiOl.I00000oOI(o01loll1loll);
                    }
/* 12 */            I000II.I001IO000("Adapter for type with cyclic dependency has been used before dependency has been resolved");
/* 15 */            return null;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) {
/* 1 */             OoO00O1IiOl ooO00O1IiOl = this.I00000oIO;
/* 3 */             if (ooO00O1IiOl != null) {
/* 5 */                 ooO00O1IiOl.I0000Il00O(o01ooi1IIiiO, obj);
                    } else {
/* 11 */                I000II.I001IO000("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                    }
                }

                @Override
                public final OoO00O1IiOl I0000O() {
/* 1 */             OoO00O1IiOl ooO00O1IiOl = this.I00000oIO;
/* 3 */             if (ooO00O1IiOl != null) {
/* 5 */                 return ooO00O1IiOl;
                    }
/* 8 */             I000II.I001IO000("Adapter for type with cyclic dependency has been used before dependency has been resolved");
/* 11 */            return null;
                }
            }
