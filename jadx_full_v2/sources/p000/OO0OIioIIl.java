            package p000;
            
            public final class OO0OIioIIl extends OO0iO0I {
                public final float I0000Il00O;
                public final float I0000O;

                public OO0OIioIIl(float f, float f2) {
/* 2 */             super(3);
/* 5 */             this.I0000Il00O = f;
/* 7 */             this.I0000O = f2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0OIioIIl)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0OIioIIl oO0OIioIIl = (OO0OIioIIl) obj;
                    return Float.compare(this.I0000Il00O, oO0OIioIIl.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0OIioIIl.I0000O) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I0000O) + (Float.hashCode(this.I0000Il00O) * 31);
                }

                public final String toString() {
/* 28 */            return "LineTo(x=" + this.I0000Il00O + ", y=" + this.I0000O + ")";
                }
            }
