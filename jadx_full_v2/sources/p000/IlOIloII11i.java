            package p000;
            
            public final class IlOIloII11i {
                public float I00000oIO;
                public float I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IlOIloII11i)) {
/* 7 */                 return false;
                    }
/* 11 */            IlOIloII11i ilOIloII11i = (IlOIloII11i) obj;
                    return Float.compare(this.I00000oIO, ilOIloII11i.I00000oIO) == 0 && Float.compare(this.I00000oOI, ilOIloII11i.I00000oOI) == 0 && this.I0000Il00O == ilOIloII11i.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             float f2 = this.I00000oOI;
/* 19 */            return IlIi0I0.I000o00OoI0I(IlIi0I0.I00100l0("FlingInfo(initialVelocity=", f, ", distance=", f2, ", duration="), this.I0000Il00O, ")");
                }
            }
