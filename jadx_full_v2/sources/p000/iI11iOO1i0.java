            package p000;

            import java.util.Map;
            
            public final class iI11iOO1i0 implements Map.Entry, Comparable {
                public final Comparable I00iOIl;
                public Object I00iiI;
                public final iI11OIoO I00iiO;

                public iI11iOO1i0(iI11OIoO ii11oioo, Comparable comparable, Object obj) {
/* 4 */             this.I00iiO = ii11oioo;
/* 6 */             this.I00iOIl = comparable;
/* 8 */             this.I00iiI = obj;
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl.compareTo(((iI11iOO1i0) obj).I00iOIl);
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
/* 3 */             this.I00iiO.I000O01llI0();
/* 6 */             Object obj2 = this.I00iiI;
/* 8 */             this.I00iiI = obj;
/* 29 */            return obj2;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I00iOIl);
/* 9 */             String strValueOf2 = String.valueOf(this.I00iiI);
/* 31 */            return IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
                }
            }
