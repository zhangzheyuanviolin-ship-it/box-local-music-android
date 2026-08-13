            package p000;
            
            public final class OO0Ool extends OO0iO0I {
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0Ool)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0Ool oO0Ool = (OO0Ool) obj;
                    return Float.compare(this.I0000Il00O, oO0Ool.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0Ool.I0000O) == 0 && Float.compare(this.I0000oI00, oO0Ool.I0000oI00) == 0 && Float.compare(this.I0001Ioi1lo, oO0Ool.I0001Ioi1lo) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0001Ioi1lo) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             float f2 = this.I0000O;
/* 5 */             float f3 = this.I0000oI00;
/* 7 */             float f4 = this.I0001Ioi1lo;
/* 15 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("RelativeQuadTo(dx1=", f, ", dy1=", f2, ", dx2=");
/* 19 */            sbI00100l0.append(f3);
/* 24 */            sbI00100l0.append(", dy2=");
/* 27 */            sbI00100l0.append(f4);
/* 32 */            sbI00100l0.append(")");
/* 35 */            return sbI00100l0.toString();
                }
            }
