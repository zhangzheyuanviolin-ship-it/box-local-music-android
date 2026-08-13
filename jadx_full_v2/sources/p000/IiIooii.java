            package p000;
            
            public final class IiIooii implements IiIooOOOI {
                public float I00iOIl;
                public float I00iiI;

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final float I00Ol00() {
/* 1 */             return this.I00iiI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IiIooii)) {
/* 7 */                 return false;
                    }
/* 11 */            IiIooii iiIooii = (IiIooii) obj;
                    return Float.compare(this.I00iOIl, iiIooii.I00iOIl) == 0 && Float.compare(this.I00iiI, iiIooii.I00iiI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00iiI) + (Float.hashCode(this.I00iOIl) * 31);
                }

                public final String toString() {
/* 28 */            return "DensityImpl(density=" + this.I00iOIl + ", fontScale=" + this.I00iiI + ")";
                }
            }
