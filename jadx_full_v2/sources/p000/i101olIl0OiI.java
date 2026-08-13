            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public abstract class i101olIl0OiI implements Serializable {
                public static i101ooIolIO I0000O(Object obj) {
/* 3 */             obj.getClass();
/* 6 */             i101ooIolIO i101ooiolio = new i101ooIolIO();
/* 9 */             i101ooiolio.I00iOIl = obj;
/* 11 */            VarHandle.storeStoreFence();
/* 49 */            return i101ooiolio;
                }

                public abstract Object I00000oIO();

                public abstract Object I00000oOI();

                public abstract boolean I0000Il00O();

                public abstract boolean equals(Object obj);

                public abstract int hashCode();
            }
