            package p000;
            
/* 11 */    public final class IIOl0O0 {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;

                public IIOl0O0(float f, float f2, float f3, int i) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = f;
/* 8 */             this.I0000Il00O = f2;
/* 10 */            this.I0000O = f3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIOl0O0)) {
/* 7 */                 return false;
                    }
/* 11 */            IIOl0O0 iIOl0O0 = (IIOl0O0) obj;
                    return this.I00000oIO == iIOl0O0.I00000oIO && Float.compare(this.I00000oOI, iIOl0O0.I00000oOI) == 0 && Float.compare(this.I0000Il00O, iIOl0O0.I0000Il00O) == 0 && Float.compare(this.I0000O, iIOl0O0.I0000O) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0000O) + OooioIOo1.I0000O(OooioIOo1.I0000O(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 48 */            return "CGGlyph(gid=" + this.I00000oIO + ", glyphAscent=" + this.I00000oOI + ", glyphDescent=" + this.I0000Il00O + ", glyphWidth=" + this.I0000O + ")";
                }

/* 12 */        public IIOl0O0(int i, int i2) {
/* 13 */            this(0.0f, 0.0f, 0.0f, (i2 & 1) != 0 ? 0 : i);
                }
            }
