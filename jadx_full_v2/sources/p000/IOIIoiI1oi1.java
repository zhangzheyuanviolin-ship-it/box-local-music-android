            package p000;
            
            public final class IOIIoiI1oi1 implements OioOIi1o0I {
                public static final IOIIoiI1oi1 I00000oOI = new IOIIoiI1oi1(0);
                public static final IOIIoiI1oi1 I0000Il00O = new IOIIoiI1oi1(1);
                public static final IOIIoiI1oi1 I0000O = new IOIIoiI1oi1(2);
                public final int I00000oIO;

                public IOIIoiI1oi1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final l1lOoiII1l I00000oIO(long j, O0iOOoiioO o0iOOoiioO, IiIooOOOI iiIooOOOI) {
                    switch (this.I00000oIO) {
                        case 0:
/* 102 */                   float fI0000O = Ol0i1I.I0000O(j) / 2.0f;
/* 117 */                   long jFloatToRawIntBits = (Float.floatToRawIntBits(fI0000O) << 32) | (Float.floatToRawIntBits(fI0000O) & 4294967295L);
/* 132 */                   return new OIiolOlo1iI(lIooiiO1i.I00000oIO(lIl0looO.I00000oIO(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
                        case 1:
/* 65 */                    float fI00l0OO0IO = iiIooOOOI.I00l0OO0IO(30.0f);
/* 92 */                    return new OIioiIl(new OOo0IO(0.0f, -fI00l0OO0IO, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fI00l0OO0IO));
                        case 2:
/* 34 */                    float fI00l0OO0IO2 = iiIooOOOI.I00l0OO0IO(30.0f);
/* 61 */                    return new OIioiIl(new OOo0IO(-fI00l0OO0IO2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fI00l0OO0IO2, Float.intBitsToFloat((int) (j & 4294967295L))));
                        default:
/* 30 */                    return new OIioiIl(lIl0looO.I00000oIO(0L, j));
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 3:
/* 11 */                    return "RectangleShape";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
