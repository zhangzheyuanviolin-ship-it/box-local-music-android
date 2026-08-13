            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OOO0O1 implements Function1 {
                public int I00iOIl;
                public float I00iiI;
                public IolIOll I00iiO;
                public long I00iio;
                public IolIOll I00ilI0I1;
                public long I00ilO0;
                public IolIOll I00io1l;
                public IolIOll I00ioIO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             float fI00OIO1 = this.I00iiI;
/* 7 */             IolIOll iolIOll = this.I00iiO;
/* 9 */             long j = this.I00iio;
/* 11 */            IolIOll iolIOll2 = this.I00ilI0I1;
/* 13 */            long j2 = this.I00ilO0;
/* 15 */            IolIOll iolIOll3 = this.I00io1l;
/* 17 */            IolIOll iolIOll4 = this.I00ioIO;
/* 21 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 34 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 40 */            if (i != 0 && Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) <= Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) {
/* 73 */                fI00OIO1 += iilloIOOO0i.I00OIO1(fIntBitsToFloat);
                    }
/* 89 */            float fI00OIO12 = fI00OIO1 / iilloIOOO0i.I00OIO1(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)));
/* 91 */            OIooliIO0 oIooliIO0 = iolIOll.I00iio;
/* 93 */            OIooliIO0 oIooliIO02 = iolIOll.I00iio;
/* 112 */           if (((Number) oIooliIO0.getValue()).floatValue() < 1.0f - fI00OIO12) {
/* 143 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, ((Number) oIooliIO02.getValue()).floatValue() > 0.0f ? ((Number) oIooliIO02.getValue()).floatValue() + fI00OIO12 : 0.0f, 1.0f, j, fIntBitsToFloat, i);
                    }
/* 146 */           long j3 = j;
/* 154 */           float fFloatValue = ((Number) oIooliIO02.getValue()).floatValue();
/* 158 */           OIooliIO0 oIooliIO03 = iolIOll2.I00iio;
/* 160 */           OIooliIO0 oIooliIO04 = iolIOll2.I00iio;
/* 175 */           if (fFloatValue - ((Number) oIooliIO03.getValue()).floatValue() > 0.0f) {
/* 198 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, ((Number) oIooliIO02.getValue()).floatValue(), ((Number) oIooliIO04.getValue()).floatValue(), j2, fIntBitsToFloat, i);
                    }
/* 213 */           if (((Number) oIooliIO04.getValue()).floatValue() > fI00OIO12) {
/* 276 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, ((Number) iolIOll3.I00iio.getValue()).floatValue() > 0.0f ? ((Number) iolIOll3.I00iio.getValue()).floatValue() + fI00OIO12 : 0.0f, ((Number) oIooliIO04.getValue()).floatValue() < 1.0f ? ((Number) oIooliIO04.getValue()).floatValue() - fI00OIO12 : 1.0f, j3, fIntBitsToFloat, i);
/* 279 */               j3 = j3;
                    }
/* 289 */           float fFloatValue2 = ((Number) iolIOll3.I00iio.getValue()).floatValue();
/* 293 */           OIooliIO0 oIooliIO05 = iolIOll4.I00iio;
/* 295 */           OIooliIO0 oIooliIO06 = iolIOll4.I00iio;
/* 310 */           if (fFloatValue2 - ((Number) oIooliIO05.getValue()).floatValue() > 0.0f) {
/* 335 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, ((Number) iolIOll3.I00iio.getValue()).floatValue(), ((Number) oIooliIO06.getValue()).floatValue(), j2, fIntBitsToFloat, i);
                    }
/* 350 */           if (((Number) oIooliIO06.getValue()).floatValue() > fI00OIO12) {
/* 382 */               OOO0iOio0oil.I0001Ioi1lo(iilloIOOO0i, 0.0f, ((Number) oIooliIO06.getValue()).floatValue() < 1.0f ? ((Number) oIooliIO06.getValue()).floatValue() - fI00OIO12 : 1.0f, j3, fIntBitsToFloat, i);
                    }
/* 385 */           return OoiIlOl1iI.I00000oIO;
                }
            }
