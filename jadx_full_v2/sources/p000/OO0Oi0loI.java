            package p000;
            
            public final class OO0Oi0loI extends OO0iO0I {
                public final float I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final boolean I0001Ioi1lo;
                public final boolean I000II;
                public final float I000O01llI0;
                public final float I000OOo1O;

                public OO0Oi0loI(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
/* 2 */             super(3);
/* 5 */             this.I0000Il00O = f;
/* 7 */             this.I0000O = f2;
/* 9 */             this.I0000oI00 = f3;
/* 11 */            this.I0001Ioi1lo = z;
/* 13 */            this.I000II = z2;
/* 15 */            this.I000O01llI0 = f4;
/* 17 */            this.I000OOo1O = f5;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0Oi0loI)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0Oi0loI oO0Oi0loI = (OO0Oi0loI) obj;
                    return Float.compare(this.I0000Il00O, oO0Oi0loI.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0Oi0loI.I0000O) == 0 && Float.compare(this.I0000oI00, oO0Oi0loI.I0000oI00) == 0 && this.I0001Ioi1lo == oO0Oi0loI.I0001Ioi1lo && this.I000II == oO0Oi0loI.I000II && Float.compare(this.I000O01llI0, oO0Oi0loI.I000O01llI0) == 0 && Float.compare(this.I000OOo1O, oO0Oi0loI.I000OOo1O) == 0;
                }

                public final int hashCode() {
/* 46 */            return Float.hashCode(this.I000OOo1O) + OooioIOo1.I0000O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("RelativeArcTo(horizontalEllipseRadius=", this.I0000Il00O, ", verticalEllipseRadius=", this.I0000O, ", theta=");
/* 17 */            sbI00100l0.append(this.I0000oI00);
/* 22 */            sbI00100l0.append(", isMoreThanHalf=");
/* 27 */            sbI00100l0.append(this.I0001Ioi1lo);
/* 32 */            sbI00100l0.append(", isPositiveArc=");
/* 37 */            sbI00100l0.append(this.I000II);
/* 42 */            sbI00100l0.append(", arcStartDx=");
/* 47 */            sbI00100l0.append(this.I000O01llI0);
/* 52 */            sbI00100l0.append(", arcStartDy=");
/* 59 */            return Oi010OO0.I001i1O0Ol(sbI00100l0, this.I000OOo1O, ")");
                }
            }
