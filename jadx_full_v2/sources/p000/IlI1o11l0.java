            package p000;
            
            public final class IlI1o11l0 {
                public final float I00000oIO;
                public final IlIoO1ilo1 I00000oOI;

                public IlI1o11l0(float f, IlIoO1ilo1 ilIoO1ilo1) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = ilIoO1ilo1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IlI1o11l0)) {
/* 7 */                 return false;
                    }
/* 11 */            IlI1o11l0 ilI1o11l0 = (IlI1o11l0) obj;
                    return Float.compare(this.I00000oIO, ilI1o11l0.I00000oIO) == 0 && O0000Ioio00.I0000O(this.I00000oOI, ilI1o11l0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "Fade(alpha=" + this.I00000oIO + ", animationSpec=" + this.I00000oOI + ")";
                }
            }
