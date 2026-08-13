            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class OI00il1O {
                public static final OI00il1O I00000oOI;
                public Map I00000oIO;

                static {
/* 8 */             Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
/* 12 */            OI00il1O oI00il1O = new OI00il1O();
/* 15 */            oI00il1O.I00000oIO = mapUnmodifiableMap;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00000oOI = oI00il1O;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OI00il1O) {
/* 13 */                return this.I00000oIO.equals(((OI00il1O) obj).I00000oIO);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.toString();
                }
            }
