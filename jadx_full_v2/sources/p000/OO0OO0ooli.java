            package p000;
            
            public final class OO0OO0ooli extends OO0iO0I {
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0OO0ooli)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0OO0ooli oO0OO0ooli = (OO0OO0ooli) obj;
                    return Float.compare(this.I0000Il00O, oO0OO0ooli.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0OO0ooli.I0000O) == 0 && Float.compare(this.I0000oI00, oO0OO0ooli.I0000oI00) == 0 && Float.compare(this.I0001Ioi1lo, oO0OO0ooli.I0001Ioi1lo) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0001Ioi1lo) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             float f2 = this.I0000O;
/* 5 */             float f3 = this.I0000oI00;
/* 7 */             float f4 = this.I0001Ioi1lo;
/* 15 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("QuadTo(x1=", f, ", y1=", f2, ", x2=");
/* 19 */            sbI00100l0.append(f3);
/* 24 */            sbI00100l0.append(", y2=");
/* 27 */            sbI00100l0.append(f4);
/* 32 */            sbI00100l0.append(")");
/* 35 */            return sbI00100l0.toString();
                }
            }
