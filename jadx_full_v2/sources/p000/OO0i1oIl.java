            package p000;
            
            public final class OO0i1oIl extends OO0iO0I {
                public float I0000Il00O;
                public float I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0i1oIl)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0i1oIl oO0i1oIl = (OO0i1oIl) obj;
                    return Float.compare(this.I0000Il00O, oO0i1oIl.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0i1oIl.I0000O) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I0000O) + (Float.hashCode(this.I0000Il00O) * 31);
                }

                public final String toString() {
/* 28 */            return "RelativeReflectiveQuadTo(dx=" + this.I0000Il00O + ", dy=" + this.I0000O + ")";
                }
            }
