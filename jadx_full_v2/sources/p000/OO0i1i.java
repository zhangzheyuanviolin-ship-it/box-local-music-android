            package p000;
            
            public final class OO0i1i extends OO0iO0I {
                public final float I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final float I0001Ioi1lo;

                public OO0i1i(float f, float f2, float f3, float f4) {
/* 2 */             super(2);
/* 5 */             this.I0000Il00O = f;
/* 7 */             this.I0000O = f2;
/* 9 */             this.I0000oI00 = f3;
/* 11 */            this.I0001Ioi1lo = f4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO0i1i)) {
/* 7 */                 return false;
                    }
/* 11 */            OO0i1i oO0i1i = (OO0i1i) obj;
                    return Float.compare(this.I0000Il00O, oO0i1i.I0000Il00O) == 0 && Float.compare(this.I0000O, oO0i1i.I0000O) == 0 && Float.compare(this.I0000oI00, oO0i1i.I0000oI00) == 0 && Float.compare(this.I0001Ioi1lo, oO0i1i.I0001Ioi1lo) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0001Ioi1lo) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("RelativeReflectiveCurveTo(dx1=", this.I0000Il00O, ", dy1=", this.I0000O, ", dx2=");
/* 17 */            sbI00100l0.append(this.I0000oI00);
/* 22 */            sbI00100l0.append(", dy2=");
/* 27 */            sbI00100l0.append(this.I0001Ioi1lo);
/* 32 */            sbI00100l0.append(")");
/* 35 */            return sbI00100l0.toString();
                }
            }
