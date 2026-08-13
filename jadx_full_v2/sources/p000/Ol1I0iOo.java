            package p000;

            import java.util.Map;
            
            public final class Ol1I0iOo implements Map.Entry {
                public int I00iOIl;
                public Ol1I1i1 I00iiI;

                @Override
                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Ol1I0iOo)) {
/* 3 */                 return false;
                    }
/* 7 */             Ol1I0iOo ol1I0iOo = (Ol1I0iOo) obj;
                    return getKey().equals(ol1I0iOo.getKey()) && getValue().equals(ol1I0iOo.getValue());
                }

                @Override
                public final Object getKey() {
/* 7 */             return this.I00iiI.I00iOIl[this.I00iOIl];
                }

                @Override
                public final Object getValue() {
/* 9 */             return this.I00iiI.I00iOIl[this.I00iOIl + 1];
                }

                @Override
                public final int hashCode() {
/* 5 */             return getKey().hashCode();
                }

                @Override
                public final Object setValue(Object obj) {
/* 1 */             if (obj == null) {
/* 20 */                IOOlIIilOl0.I000II("Key or value must not be null.");
/* 23 */                return null;
                    }
/* 3 */             Object value = getValue();
/* 15 */            this.I00iiI.I00iOIl[this.I00iOIl + 1] = obj;
/* 17 */            return value;
                }
            }
