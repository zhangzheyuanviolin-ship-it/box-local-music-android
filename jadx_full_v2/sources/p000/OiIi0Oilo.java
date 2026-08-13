            package p000;

            import java.util.Map;
            
            public final class OiIi0Oilo implements Map.Entry {
                public Object I00iOIl;
                public Object I00iiI;
                public OiIi0Oilo I00iiO;
                public OiIi0Oilo I00iio;

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof OiIi0Oilo)) {
/* 33 */                return false;
                    }
/* 9 */             OiIi0Oilo oiIi0Oilo = (OiIi0Oilo) obj;
                    return this.I00iOIl.equals(oiIi0Oilo.I00iOIl) && this.I00iiI.equals(oiIi0Oilo.I00iiI);
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
/* 13 */            return this.I00iiI.hashCode() ^ this.I00iOIl.hashCode();
                }

                @Override
                public final Object setValue(Object obj) {
/* 29 */            throw new UnsupportedOperationException("An entry modification is not supported");
                }

                public final String toString() {
/* 21 */            return this.I00iOIl + "=" + this.I00iiI;
                }
            }
