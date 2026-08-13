            package p000;
            
            public abstract class lIooiiO1i {
                public static final OiI101I1oIi I00000oIO(OOo0IO oOo0IO, long j, long j2, long j3, long j4) {
/* 18 */            return new OiI101I1oIi(oOo0IO.I00000oIO, oOo0IO.I00000oOI, oOo0IO.I0000Il00O, oOo0IO.I0000O, j, j2, j3, j4);
                }

                public static final OiI101I1oIi I00000oOI(float f, float f2, float f3, float f4, long j) {
/* 6 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 18 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 35 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
/* 50 */            return new OiI101I1oIi(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
                }

                public static final boolean I0000Il00O(OiI101I1oIi oiI101I1oIi) {
/* 1 */             long j = oiI101I1oIi.I0000oI00;
                    return (j >>> 32) == (4294967295L & j) && j == oiI101I1oIi.I0001Ioi1lo && j == oiI101I1oIi.I000II && j == oiI101I1oIi.I000O01llI0;
                }
            }
