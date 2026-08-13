            package p000;
            
            public final class OO0IioI0lo0 extends OO0iO0I {
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public float I000O01llI0;
                public float I000OOo1O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0IioI0lo0)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0IioI0lo0 oO0IioI0lo0 = (OO0IioI0lo0) obj;
                    return Float.compare(this.I0000Il00O, oO0IioI0lo0.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0IioI0lo0.I0000O) == 0 && Float.compare(this.I0000oI00, oO0IioI0lo0.I0000oI00) == 0 && this.I0001Ioi1lo == oO0IioI0lo0.I0001Ioi1lo && this.I000II == oO0IioI0lo0.I000II && Float.compare(this.I000O01llI0, oO0IioI0lo0.I000O01llI0) == 0 && Float.compare(this.I000OOo1O, oO0IioI0lo0.I000OOo1O) == 0;
                }

                public final int hashCode() {
/* 46 */            return Float.hashCode(this.I000OOo1O) + OooioIOo1.I0000O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0);
                }

                public final String toString() {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             float f2 = this.I0000O;
/* 5 */             float f3 = this.I0000oI00;
/* 7 */             boolean z = this.I0001Ioi1lo;
/* 9 */             boolean z2 = this.I000II;
/* 11 */            float f4 = this.I000O01llI0;
/* 13 */            float f5 = this.I000OOo1O;
/* 21 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("ArcTo(horizontalEllipseRadius=", f, ", verticalEllipseRadius=", f2, ", theta=");
/* 25 */            sbI00100l0.append(f3);
/* 30 */            sbI00100l0.append(", isMoreThanHalf=");
/* 33 */            sbI00100l0.append(z);
/* 38 */            sbI00100l0.append(", isPositiveArc=");
/* 41 */            sbI00100l0.append(z2);
/* 46 */            sbI00100l0.append(", arcStartX=");
/* 49 */            sbI00100l0.append(f4);
/* 54 */            sbI00100l0.append(", arcStartY=");
/* 59 */            return Oi010OO0.I001i1O0Ol(sbI00100l0, f5, ")");
                }
            }
