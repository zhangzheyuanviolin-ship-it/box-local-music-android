            package p000;
            
            public final class IiIoooOi1 implements IiIooOOOI {
                public float I00iOIl;
                public float I00iiI;
                public Ilil00111O I00iiO;

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final long I00100l0(float f) {
/* 12 */            return lOlilO1lOIO.I0000oI00(this.I00iiO.I00000oIO(f), 4294967296L);
                }

                @Override
                public final float I001lIiIIo1O(long j) {
/* 14 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 4294967296L)) {
/* 22 */                return this.I00iiO.I00000oOI(Oo0o1OiIo.I0000O(j));
                    }
/* 29 */            I000II.I001IO000("Only Sp can convert to Px");
/* 32 */            return 0.0f;
                }

                @Override
                public final float I00Ol00() {
/* 1 */             return this.I00iiI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof IiIoooOi1)) {
/* 43 */                return false;
                    }
/* 9 */             IiIoooOi1 iiIoooOi1 = (IiIoooOi1) obj;
                    return Float.compare(this.I00iOIl, iiIoooOi1.I00iOIl) == 0 && Float.compare(this.I00iiI, iiIoooOi1.I00iiI) == 0 && this.I00iiO.equals(iiIoooOi1.I00iiO);
                }

                public final int hashCode() {
/* 22 */            return this.I00iiO.hashCode() + OooioIOo1.I0000O(Float.hashCode(this.I00iOIl) * 31, 31, this.I00iiI);
                }

                public final String toString() {
/* 1 */             float f = this.I00iOIl;
/* 3 */             float f2 = this.I00iiI;
/* 5 */             Ilil00111O ilil00111O = this.I00iiO;
/* 13 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("DensityWithConverter(density=", f, ", fontScale=", f2, ", converter=");
/* 17 */            sbI00100l0.append(ilil00111O);
/* 22 */            sbI00100l0.append(")");
/* 25 */            return sbI00100l0.toString();
                }
            }
