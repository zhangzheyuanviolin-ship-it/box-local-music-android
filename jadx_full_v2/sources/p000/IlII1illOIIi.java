            package p000;

            import java.util.Map;
            
            public final class IlII1illOIIi implements Map.Entry, O0IlIoi {
                public O0oiO0ilooli I00iOIl;
                public O0oiOoo0oO1 I00iiI;
                public IlII1illOIIi I00iiO;
                public IlII1illOIIi I00iio;
                public boolean I00ilI0I1;

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IlII1illOIIi) {
/* 11 */                IlII1illOIIi ilII1illOIIi = (IlII1illOIIi) obj;
                        return this.I00iOIl.equals(ilII1illOIIi.I00iOIl) && this.I00iiI == ilII1illOIIi.I00iiI;
                    }
/* 7 */             return false;
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
/* 15 */            return this.I00iiI.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                @Override
                public final Object setValue(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final String toString() {
/* 28 */            return "Entry(key=" + this.I00iOIl + ", value=" + this.I00iiI + ")";
                }
            }
