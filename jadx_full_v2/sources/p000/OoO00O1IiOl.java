            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OoO00O1IiOl {
                public final OoIooiOoi0i I00000oIO() {
/* 3 */             if (this instanceof OoIooiOoi0i) {
/* 16 */                return (OoIooiOoi0i) this;
                    }
/* 7 */             OoIooiOoi0i ooIooiOoi0i = new OoIooiOoi0i();
/* 10 */            ooIooiOoi0i.I00000oIO = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return ooIooiOoi0i;
                }

                public abstract Object I00000oOI(O01loll1loll o01loll1loll);

                public abstract void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj);
            }
