            package p000;
            
            public abstract class lIIo10 {
                public static final void I00000oIO(IilloIOOO0i iilloIOOO0i, long j, float f, float f2) {
/* 3 */             float f3 = f / 2.0f;
/* 18 */            float fIntBitsToFloat = (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) - f3) - f2;
/* 34 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) / 2.0f;
/* 56 */            IilloIOOO0i.I00iiO(iilloIOOO0i, j, f3, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), null, 120);
                }
            }
