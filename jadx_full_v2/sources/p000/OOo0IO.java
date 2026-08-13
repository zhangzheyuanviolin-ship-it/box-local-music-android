            package p000;
            
            public final class OOo0IO {
                public static final OOo0IO I0000oI00 = new OOo0IO(0.0f, 0.0f, 0.0f, 0.0f);
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;

                public OOo0IO(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
                }

                public static OOo0IO I00000oOI(OOo0IO oOo0IO, float f, float f2, float f3, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 f = oOo0IO.I00000oIO;
                    }
/* 7 */             float f4 = oOo0IO.I00000oOI;
/* 11 */            if ((i & 4) != 0) {
/* 13 */                f2 = oOo0IO.I0000Il00O;
                    }
/* 17 */            if ((i & 8) != 0) {
/* 19 */                f3 = oOo0IO.I0000O;
                    }
/* 23 */            return new OOo0IO(f, f4, f2, f3);
                }

                public final boolean I00000oIO(long j) {
/* 6 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 17 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 59 */            return (fIntBitsToFloat >= this.I00000oIO) & (fIntBitsToFloat < this.I0000Il00O) & (fIntBitsToFloat2 >= this.I00000oOI) & (fIntBitsToFloat2 < this.I0000O);
                }

                public final long I0000Il00O() {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             float f2 = this.I00000oIO;
/* 9 */             float f3 = ((f - f2) / 2.0f) + f2;
/* 10 */            float f4 = this.I0000O;
/* 12 */            float f5 = this.I00000oOI;
/* 36 */            return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
                }

                public final long I0000O() {
/* 5 */             float f = this.I0000Il00O - this.I00000oIO;
/* 10 */            float f2 = this.I0000O - this.I00000oOI;
/* 30 */            return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                }

                public final long I0000oI00() {
/* 24 */            return (Float.floatToRawIntBits(this.I00000oIO) << 32) | (Float.floatToRawIntBits(this.I00000oOI) & 4294967295L);
                }

                public final OOo0IO I0001Ioi1lo(OOo0IO oOo0IO) {
/* 35 */            return new OOo0IO(Math.max(this.I00000oIO, oOo0IO.I00000oIO), Math.max(this.I00000oOI, oOo0IO.I00000oOI), Math.min(this.I0000Il00O, oOo0IO.I0000Il00O), Math.min(this.I0000O, oOo0IO.I0000O));
                }

                public final boolean I000II() {
/* 23 */            return (this.I00000oIO >= this.I0000Il00O) | (this.I00000oOI >= this.I0000O);
                }

                public final boolean I000O01llI0(OOo0IO oOo0IO) {
/* 47 */            return (this.I00000oIO < oOo0IO.I0000Il00O) & (oOo0IO.I00000oIO < this.I0000Il00O) & (this.I00000oOI < oOo0IO.I0000O) & (oOo0IO.I00000oOI < this.I0000O);
                }

                public final OOo0IO I000OOo1O(float f, float f2) {
/* 15 */            return new OOo0IO(this.I00000oIO + f, this.I00000oOI + f2, this.I0000Il00O + f, this.I0000O + f2);
                }

                public final OOo0IO I000OiO(long j) {
/* 7 */             int i = (int) (j >> 32);
/* 21 */            int i2 = (int) (j & 4294967295L);
/* 43 */            return new OOo0IO(Float.intBitsToFloat(i) + this.I00000oIO, Float.intBitsToFloat(i2) + this.I00000oOI, Float.intBitsToFloat(i) + this.I0000Il00O, Float.intBitsToFloat(i2) + this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOo0IO)) {
/* 7 */                 return false;
                    }
/* 11 */            OOo0IO oOo0IO = (OOo0IO) obj;
                    return Float.compare(this.I00000oIO, oOo0IO.I00000oIO) == 0 && Float.compare(this.I00000oOI, oOo0IO.I00000oOI) == 0 && Float.compare(this.I0000Il00O, oOo0IO.I0000Il00O) == 0 && Float.compare(this.I0000O, oOo0IO.I0000O) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0000O) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 3 */             String strI00000oIO = ill1O0010.I00000oIO(this.I00000oIO);
/* 9 */             String strI00000oIO2 = ill1O0010.I00000oIO(this.I00000oOI);
/* 35 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("Rect.fromLTRB(", strI00000oIO, ", ", strI00000oIO2, ", "), ill1O0010.I00000oIO(this.I0000Il00O), ", ", ill1O0010.I00000oIO(this.I0000O), ")");
                }
            }
