            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OOO0iIO1I1 implements Function1 {
                public IllOOo00lI I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public float I00iio;
                public long I00ilI0I1;
                public OlOooI0l0011 I00ilO0;
                public long I00io1l;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             IllOOo00lI illOOo00lI = this.I00iOIl;
/* 5 */             int i = this.I00iiI;
/* 7 */             float f = this.I00iiO;
/* 9 */             float f2 = this.I00iio;
/* 11 */            long j = this.I00ilI0I1;
/* 13 */            OlOooI0l0011 olOooI0l0011 = this.I00ilO0;
/* 15 */            long j2 = this.I00io1l;
/* 19 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 33 */            float fFloatValue = ((Number) illOOo00lI.invoke()).floatValue() * 360.0f;
/* 37 */            if (i != 0 && Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) <= Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) {
/* 70 */                f += f2;
                    }
/* 94 */            float fI00OIO1 = (f / ((float) (iilloIOOO0i.I00OIO1(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) * 3.141592653589793d))) * 360.0f;
/* 116 */           OOO0iOio0oil.I0000oI00(iilloIOOO0i, Math.min(fFloatValue, fI00OIO1) + 270.0f + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fI00OIO1) * 2.0f), j, olOooI0l0011);
/* 120 */           OOO0iOio0oil.I0000oI00(iilloIOOO0i, 270.0f, fFloatValue, j2, olOooI0l0011);
/* 123 */           return OoiIlOl1iI.I00000oIO;
                }
            }
