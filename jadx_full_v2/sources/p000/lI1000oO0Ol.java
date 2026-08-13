            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public abstract class lI1000oO0Ol implements Serializable {
                public static lI1Oli0IIoo I0000O(Object obj) {
/* 3 */             obj.getClass();
/* 6 */             lI1Oli0IIoo li1oli0iioo = new lI1Oli0IIoo();
/* 9 */             li1oli0iioo.I00iOIl = obj;
/* 11 */            VarHandle.storeStoreFence();
/* 49 */            return li1oli0iioo;
                }

                public abstract Object I00000oIO();

                public abstract Object I00000oOI(Object obj);

                public abstract boolean I0000Il00O();
            }
