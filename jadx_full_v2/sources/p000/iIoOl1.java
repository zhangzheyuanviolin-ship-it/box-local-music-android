            package p000;
            
            public abstract class iIoOl1 {
                public static final void I00000oIO(O0iiliOio o0iiliOio, float f, long j, float f2, float f3, OlOooI0l0011 olOooI0l0011, long j2) {
/* 11 */            float fMin = Math.min(olOooI0l0011.I00000oIO, o0iiliOio.I00i0ilIl0i(f2));
/* 15 */            float f4 = olOooI0l0011.I00000oIO;
/* 31 */            int i = (int) (j >> 32);
/* 37 */            float fIntBitsToFloat = (Float.intBitsToFloat(i) - fMin) - (fMin == f4 ? 0.0f : f4 / 4.0f);
/* 43 */            float fIntBitsToFloat2 = (Float.intBitsToFloat(i) * f) + f3;
/* 47 */            if (fIntBitsToFloat <= fIntBitsToFloat2) {
/* 52 */                fMin = Math.max(0.0f, fMin - (fIntBitsToFloat2 - fIntBitsToFloat));
/* 56 */                fIntBitsToFloat = fIntBitsToFloat2;
                    }
/* 59 */            if (fMin > 0.0f) {
/* 71 */                if (olOooI0l0011.I0000Il00O == 1) {
/* 106 */                   IilloIOOO0i.I00iiO(o0iiliOio, j2, fMin / 2.0f, (Float.floatToRawIntBits(fIntBitsToFloat + r1) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L), null, 120);
                        } else {
/* 154 */                   IilloIOOO0i.I00ilI0I1(o0iiliOio, j2, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) - fMin) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMin) & 4294967295L), 0.0f, null, 0, 120);
                        }
                    }
                }
            }
