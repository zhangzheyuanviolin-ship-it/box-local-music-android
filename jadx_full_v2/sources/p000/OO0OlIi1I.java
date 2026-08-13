            package p000;
            
            public final class OO0OlIi1I extends OO0iO0I {
                public final float I0000Il00O;

                public OO0OlIi1I(float f) {
/* 2 */             super(3);
/* 5 */             this.I0000Il00O = f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OO0OlIi1I) && Float.compare(this.I0000Il00O, ((OO0OlIi1I) obj).I0000Il00O) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I0000Il00O);
                }

                public final String toString() {
/* 18 */            return "RelativeHorizontalTo(dx=" + this.I0000Il00O + ")";
                }
            }
