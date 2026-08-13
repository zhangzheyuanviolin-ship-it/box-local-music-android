            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OOO0i0l implements Function1 {
                public int I00iOIl;
                public float I00iiI;
                public IllOOo00lI I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public Function1 I00ilO0;

                @Override
                public final Object invoke(Object obj) {
                    IilloIOOO0i iilloIOOO0i;
/* 1 */             int i = this.I00iOIl;
/* 3 */             float fI00OIO1 = this.I00iiI;
/* 5 */             IllOOo00lI illOOo00lI = this.I00iiO;
/* 7 */             long j = this.I00iio;
/* 9 */             long j2 = this.I00ilI0I1;
/* 11 */            Function1 function1 = this.I00ilO0;
/* 13 */            IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj;
/* 26 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() & 4294967295L));
/* 32 */            if (i != 0 && Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() & 4294967295L)) <= Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() >> 32))) {
/* 64 */                fI00OIO1 += iilloIOOO0i2.I00OIO1(fIntBitsToFloat);
                    }
/* 79 */            float fI00OIO12 = fI00OIO1 / iilloIOOO0i2.I00OIO1(Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() >> 32)));
/* 86 */            float fFloatValue = ((Number) illOOo00lI.invoke()).floatValue();
/* 94 */            float fMin = Math.min(fFloatValue, fI00OIO12) + fFloatValue;
/* 100 */           if (fMin <= 1.0f) {
/* 104 */               iilloIOOO0i = iilloIOOO0i2;
/* 105 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, fMin, 1.0f, j, fIntBitsToFloat, i);
                    } else {
/* 109 */               iilloIOOO0i = iilloIOOO0i2;
                    }
/* 113 */           OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, 0.0f, fFloatValue, j2, fIntBitsToFloat, i);
/* 116 */           function1.invoke(iilloIOOO0i);
/* 119 */           return OoiIlOl1iI.I00000oIO;
                }
            }
