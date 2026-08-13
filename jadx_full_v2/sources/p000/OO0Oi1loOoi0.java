            package p000;
            
            public final class OO0Oi1loOoi0 extends OO0iO0I {
                public final float I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final float I0001Ioi1lo;
                public final float I000II;
                public final float I000O01llI0;

                public OO0Oi1loOoi0(float f, float f2, float f3, float f4, float f5, float f6) {
/* 2 */             super(2);
/* 5 */             this.I0000Il00O = f;
/* 7 */             this.I0000O = f2;
/* 9 */             this.I0000oI00 = f3;
/* 11 */            this.I0001Ioi1lo = f4;
/* 13 */            this.I000II = f5;
/* 15 */            this.I000O01llI0 = f6;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0Oi1loOoi0)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0Oi1loOoi0 oO0Oi1loOoi0 = (OO0Oi1loOoi0) obj;
                    return Float.compare(this.I0000Il00O, oO0Oi1loOoi0.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0Oi1loOoi0.I0000O) == 0 && Float.compare(this.I0000oI00, oO0Oi1loOoi0.I0000oI00) == 0 && Float.compare(this.I0001Ioi1lo, oO0Oi1loOoi0.I0001Ioi1lo) == 0 && Float.compare(this.I000II, oO0Oi1loOoi0.I000II) == 0 && Float.compare(this.I000O01llI0, oO0Oi1loOoi0.I000O01llI0) == 0;
                }

                public final int hashCode() {
/* 40 */            return Float.hashCode(this.I000O01llI0) + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("RelativeCurveTo(dx1=", this.I0000Il00O, ", dy1=", this.I0000O, ", dx2=");
/* 17 */            sbI00100l0.append(this.I0000oI00);
/* 22 */            sbI00100l0.append(", dy2=");
/* 27 */            sbI00100l0.append(this.I0001Ioi1lo);
/* 32 */            sbI00100l0.append(", dx3=");
/* 37 */            sbI00100l0.append(this.I000II);
/* 42 */            sbI00100l0.append(", dy3=");
/* 47 */            sbI00100l0.append(this.I000O01llI0);
/* 52 */            sbI00100l0.append(")");
/* 55 */            return sbI00100l0.toString();
                }
            }
