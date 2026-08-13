            package p000;
            
            public final class III1lO implements Oo0OO1I1i {
                public final OioIoiOi I00000oIO;
                public final float I00000oOI;

                public III1lO(OioIoiOi oioIoiOi, float f) {
/* 4 */             this.I00000oIO = oioIoiOi;
/* 6 */             this.I00000oOI = f;
                }

                @Override
                public final long I00000oIO() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 3 */             return IOOiio0i.I000o00OoI0I;
                }

                @Override
                public final III11l1I I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final float I0000Il00O() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof III1lO)) {
/* 32 */                return false;
                    }
/* 9 */             III1lO iII1lO = (III1lO) obj;
                    return this.I00000oIO.equals(iII1lO.I00000oIO) && Float.compare(this.I00000oOI, iII1lO.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "BrushStyle(value=" + this.I00000oIO + ", alpha=" + this.I00000oOI + ")";
                }
            }
