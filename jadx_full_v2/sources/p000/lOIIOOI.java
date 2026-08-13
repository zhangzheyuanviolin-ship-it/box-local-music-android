            package p000;

            import java.util.Map;
            
            public final class lOIIOOI implements Map.Entry, Comparable {
                public final Comparable I00iOIl;
                public Object I00iiI;
                public final lOI1I000IoiI I00iiO;

                public lOIIOOI(lOI1I000IoiI loi1i000ioii, Comparable comparable, Object obj) {
/* 4 */             this.I00iiO = loi1i000ioii;
/* 6 */             this.I00iOIl = comparable;
/* 8 */             this.I00iiI = obj;
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl.compareTo(((lOIIOOI) obj).I00iOIl);
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof Map.Entry) {
/* 11 */                    Map.Entry entry = (Map.Entry) obj;
/* 13 */                    Object key = entry.getKey();
/* 17 */                    Comparable comparable = this.I00iOIl;
/* 31 */                    if (comparable == null ? key == null : comparable.equals(key)) {
/* 33 */                        Object obj2 = this.I00iiI;
/* 35 */                        Object value = entry.getValue();
/* 51 */                        if (obj2 == null ? value == null : obj2.equals(value)) {
                                }
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final Object getValue() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final int hashCode() {
/* 2 */             Comparable comparable = this.I00iOIl;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.I00iiI;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override
                public final Object setValue(Object obj) {
/* 3 */             this.I00iiO.I000OOo1O();
/* 6 */             Object obj2 = this.I00iiI;
/* 8 */             this.I00iiI = obj;
/* 29 */            return obj2;
                }

                public final String toString() {
/* 15 */            return IlIi0I0.I000lI(String.valueOf(this.I00iOIl), "=", String.valueOf(this.I00iiI));
                }
            }
