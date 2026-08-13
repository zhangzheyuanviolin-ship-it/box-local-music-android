            package p000;
            
            public final class OO0iIOIioOI extends OO0iO0I {
                public final float I0000Il00O;

                public OO0iIOIioOI(float f) {
/* 2 */             super(3);
/* 5 */             this.I0000Il00O = f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OO0iIOIioOI) && Float.compare(this.I0000Il00O, ((OO0iIOIioOI) obj).I0000Il00O) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I0000Il00O);
                }

                public final String toString() {
/* 18 */            return "RelativeVerticalTo(dy=" + this.I0000Il00O + ")";
                }
            }
