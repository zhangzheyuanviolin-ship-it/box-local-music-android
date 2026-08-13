            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public abstract class OIiiIl0iO implements Serializable {
                public static OOI1o1oII0 I0000Il00O(Object obj) {
/* 3 */             obj.getClass();
/* 6 */             OOI1o1oII0 oOI1o1oII0 = new OOI1o1oII0();
/* 9 */             oOI1o1oII0.I00iOIl = obj;
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return oOI1o1oII0;
                }

                public abstract Object I00000oIO();

                public abstract boolean I00000oOI();

                public abstract Object I0000O();
            }
