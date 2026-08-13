            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O1Ol0l0OO1 implements Function1 {
                public boolean I00iOIl;
                public long I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             boolean z = this.I00iOIl;
/* 3 */             long j = this.I00iiI;
/* 6 */             IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 8 */             if (!z) {
/* 40 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) << 32);
/* 47 */                float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32));
/* 57 */                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 85 */                IilloIOOO0i.I00oli(iilloIOOO0i, j, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), iilloIOOO0i.I00i0ilIl0i(1.0f), 0, null, 496);
                    }
/* 88 */            return OoiIlOl1iI.I00000oIO;
                }
            }
