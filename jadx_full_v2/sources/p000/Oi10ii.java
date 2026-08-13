            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public final class Oi10ii implements Serializable {
                public Object I00iOIl;

                public static final Oi10ii I00000oIO(Object obj) {
/* 3 */             Oi10ii oi10ii = new Oi10ii();
/* 6 */             oi10ii.I00iOIl = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oi10ii;
                }

                public static final Throwable I00000oOI(Object obj) {
/* 3 */             if (obj instanceof Oi10Ii1i1lo) {
/* 7 */                 return ((Oi10Ii1i1lo) obj).I00iOIl;
                    }
/* 10 */            return null;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oi10ii) && O0000Ioio00.I0000O(this.I00iOIl, ((Oi10ii) obj).I00iOIl);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00iOIl;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if (obj instanceof Oi10Ii1i1lo) {
/* 9 */                 return ((Oi10Ii1i1lo) obj).toString();
                    }
/* 29 */            return "Success(" + obj + ')';
                }
            }
