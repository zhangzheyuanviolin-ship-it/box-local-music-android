            package p000;

            import java.util.List;
            
/* 57 */    public final class II1i0i0ilO {
                public final int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;

                public II1i0i0ilO(List list) {
/* 2 */             this.I00000oIO = 1;
/* 18 */            this.I00000oOI = ((Number) list.get(0)).floatValue();
/* 30 */            this.I0000Il00O = ((Number) list.get(1)).floatValue();
/* 43 */            this.I0000O = ((Number) list.get(2)).floatValue();
/* 56 */            this.I0000oI00 = ((Number) list.get(3)).floatValue();
                }

                public void I00000oIO(float f, float f2, float f3, float f4) {
/* 7 */             this.I00000oOI = Math.max(f, this.I00000oOI);
/* 15 */            this.I0000Il00O = Math.max(f2, this.I0000Il00O);
/* 23 */            this.I0000O = Math.min(f3, this.I0000O);
/* 31 */            this.I0000oI00 = Math.min(f4, this.I0000oI00);
                }

                public boolean I00000oOI() {
/* 23 */            return (this.I00000oOI >= this.I0000O) | (this.I0000Il00O >= this.I0000oI00);
                }

                public void I0000Il00O(long j) {
/* 6 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 17 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    this.I00000oOI += fIntBitsToFloat;
                    this.I0000Il00O += fIntBitsToFloat2;
                    this.I0000O += fIntBitsToFloat;
                    this.I0000oI00 += fIntBitsToFloat2;
                }

                public final String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 87 */                    float f = this.I00000oOI;
/* 89 */                    float f2 = this.I0000Il00O;
/* 91 */                    float f3 = this.I0000O;
/* 93 */                    float f4 = this.I0000oI00;
/* 95 */                    StringBuilder sbI00100l0 = IlIi0I0.I00100l0("[", f, ",", f2, ",");
/* 99 */                    sbI00100l0.append(f3);
/* 102 */                   sbI00100l0.append(",");
/* 105 */                   sbI00100l0.append(f4);
/* 108 */                   sbI00100l0.append("]");
/* 111 */                   return sbI00100l0.toString();
                        case 1:
/* 53 */                    StringBuilder sb = new StringBuilder("[");
/* 58 */                    sb.append(this.I00000oOI);
/* 61 */                    sb.append(",");
/* 66 */                    sb.append(this.I0000Il00O);
/* 69 */                    sb.append(",");
/* 74 */                    sb.append(this.I0000O);
/* 77 */                    sb.append(",");
/* 82 */                    return Oi010OO0.I001i1O0Ol(sb, this.I0000oI00, "]");
                        default:
/* 14 */                    String strI00000oIO = ill1O0010.I00000oIO(this.I00000oOI);
/* 20 */                    String strI00000oIO2 = ill1O0010.I00000oIO(this.I0000Il00O);
/* 46 */                    return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("MutableRect(", strI00000oIO, ", ", strI00000oIO2, ", "), ill1O0010.I00000oIO(this.I0000O), ", ", ill1O0010.I00000oIO(this.I0000oI00), ")");
                    }
                }

/* 58 */        public II1i0i0ilO() {
                    this.I00000oIO = 2;
                    this.I00000oOI = 0.0f;
                    this.I0000Il00O = 0.0f;
                    this.I0000O = 0.0f;
                    this.I0000oI00 = 0.0f;
                }

/* 59 */        public II1i0i0ilO(float f, float f2, float f3, float f4) {
                    this.I00000oIO = 1;
/* 61 */            this.I00000oOI = f;
/* 62 */            this.I0000Il00O = f2;
/* 63 */            this.I0000O = f3;
/* 64 */            this.I0000oI00 = f4;
                }
            }
