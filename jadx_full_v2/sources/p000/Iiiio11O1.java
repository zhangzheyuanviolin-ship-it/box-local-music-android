            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Iiiio11O1 implements Function1 {
                public float I00iOIl;
                public long I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             float f = this.I00iOIl;
/* 3 */             long j = this.I00iiI;
/* 6 */             IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 8 */             float fI00i0ilIl0i = iilloIOOO0i.I00i0ilIl0i(f);
/* 18 */            float fI00i0ilIl0i2 = iilloIOOO0i.I00i0ilIl0i(f) / 2.0f;
/* 46 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32));
/* 54 */            float fI00i0ilIl0i3 = iilloIOOO0i.I00i0ilIl0i(f) / 2.0f;
/* 74 */            IilloIOOO0i.I00oli(iilloIOOO0i, j, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fI00i0ilIl0i2) & 4294967295L), (Float.floatToRawIntBits(fI00i0ilIl0i3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), fI00i0ilIl0i, 0, null, 496);
/* 77 */            return OoiIlOl1iI.I00000oIO;
                }
            }
