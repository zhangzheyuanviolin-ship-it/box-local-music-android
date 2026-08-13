            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIl1lo10 {
                public Object I00000oIO;

                public static final OIl1lo10 I00000oIO(Object obj) {
/* 3 */             OIl1lo10 oIl1lo10 = new OIl1lo10();
/* 6 */             oIl1lo10.I00000oIO = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oIl1lo10;
                }

                public static final boolean I00000oOI(Object obj) {
                    return ((obj instanceof OIlI0iOIo) || obj == null) ? false : true;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIl1lo10) && O0000Ioio00.I0000O(this.I00000oIO, ((OIl1lo10) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 18 */            return "OutputResult(result=" + this.I00000oIO + ')';
                }
            }
